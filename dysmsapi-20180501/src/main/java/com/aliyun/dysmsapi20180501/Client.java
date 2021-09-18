// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501;

import com.aliyun.tea.*;
import com.aliyun.dysmsapi20180501.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dysmsapi-xman.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dysmsapi-proxy.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dysmsapi-xman.cn-hongkong.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dysmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public QueryMessageResponse queryMessageWithOptions(QueryMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMessageResponse());
    }

    public QueryMessageResponse queryMessage(QueryMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMessageWithOptions(request, runtime);
    }

    public BatchSendMessageToGlobeResponse batchSendMessageToGlobeWithOptions(BatchSendMessageToGlobeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSendMessageToGlobe", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSendMessageToGlobeResponse());
    }

    public BatchSendMessageToGlobeResponse batchSendMessageToGlobe(BatchSendMessageToGlobeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSendMessageToGlobeWithOptions(request, runtime);
    }

    public SmsConversionResponse smsConversionWithOptions(SmsConversionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SmsConversion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SmsConversionResponse());
    }

    public SmsConversionResponse smsConversion(SmsConversionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smsConversionWithOptions(request, runtime);
    }

    public SendMessageToGlobeResponse sendMessageToGlobeWithOptions(SendMessageToGlobeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessageToGlobe", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageToGlobeResponse());
    }

    public SendMessageToGlobeResponse sendMessageToGlobe(SendMessageToGlobeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageToGlobeWithOptions(request, runtime);
    }

    public ConversionDataResponse conversionDataWithOptions(ConversionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConversionData", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConversionDataResponse());
    }

    public ConversionDataResponse conversionData(ConversionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.conversionDataWithOptions(request, runtime);
    }

    public SendMessageWithTemplateResponse sendMessageWithTemplateWithOptions(SendMessageWithTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessageWithTemplate", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageWithTemplateResponse());
    }

    public SendMessageWithTemplateResponse sendMessageWithTemplate(SendMessageWithTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithTemplateWithOptions(request, runtime);
    }
}
