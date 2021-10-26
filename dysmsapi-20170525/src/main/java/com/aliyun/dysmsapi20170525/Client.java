// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
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

    public AddShortUrlResponse addShortUrlWithOptions(AddShortUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddShortUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddShortUrlResponse());
    }

    public AddShortUrlResponse addShortUrl(AddShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addShortUrlWithOptions(request, runtime);
    }

    public AddSmsSignResponse addSmsSignWithOptions(AddSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSmsSign", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddSmsSignResponse());
    }

    public AddSmsSignResponse addSmsSign(AddSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSmsSignWithOptions(request, runtime);
    }

    public AddSmsTemplateResponse addSmsTemplateWithOptions(AddSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddSmsTemplateResponse());
    }

    public AddSmsTemplateResponse addSmsTemplate(AddSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSmsTemplateWithOptions(request, runtime);
    }

    public CreateCardSmsTemplateResponse createCardSmsTemplateWithOptions(CreateCardSmsTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCardSmsTemplateShrinkRequest request = new CreateCardSmsTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCardSmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCardSmsTemplateResponse());
    }

    public CreateCardSmsTemplateResponse createCardSmsTemplate(CreateCardSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCardSmsTemplateWithOptions(request, runtime);
    }

    public DeleteShortUrlResponse deleteShortUrlWithOptions(DeleteShortUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteShortUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteShortUrlResponse());
    }

    public DeleteShortUrlResponse deleteShortUrl(DeleteShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteShortUrlWithOptions(request, runtime);
    }

    public DeleteSmsSignResponse deleteSmsSignWithOptions(DeleteSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmsSign", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmsSignResponse());
    }

    public DeleteSmsSignResponse deleteSmsSign(DeleteSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsSignWithOptions(request, runtime);
    }

    public DeleteSmsTemplateResponse deleteSmsTemplateWithOptions(DeleteSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSmsTemplateResponse());
    }

    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsTemplateWithOptions(request, runtime);
    }

    public GetMediaResourceIdResponse getMediaResourceIdWithOptions(GetMediaResourceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaResourceId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaResourceIdResponse());
    }

    public GetMediaResourceIdResponse getMediaResourceId(GetMediaResourceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaResourceIdWithOptions(request, runtime);
    }

    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetOSSInfoForCardTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetOSSInfoForCardTemplateResponse());
    }

    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOSSInfoForCardTemplateWithOptions(runtime);
    }

    public ModifySmsSignResponse modifySmsSignWithOptions(ModifySmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySmsSign", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySmsSignResponse());
    }

    public ModifySmsSignResponse modifySmsSign(ModifySmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmsSignWithOptions(request, runtime);
    }

    public ModifySmsTemplateResponse modifySmsTemplateWithOptions(ModifySmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySmsTemplateResponse());
    }

    public ModifySmsTemplateResponse modifySmsTemplate(ModifySmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmsTemplateWithOptions(request, runtime);
    }

    public QueryCardSmsTemplateResponse queryCardSmsTemplateWithOptions(QueryCardSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCardSmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCardSmsTemplateResponse());
    }

    public QueryCardSmsTemplateResponse queryCardSmsTemplate(QueryCardSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardSmsTemplateWithOptions(request, runtime);
    }

    public QuerySendDetailsResponse querySendDetailsWithOptions(QuerySendDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySendDetails", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySendDetailsResponse());
    }

    public QuerySendDetailsResponse querySendDetails(QuerySendDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySendDetailsWithOptions(request, runtime);
    }

    public QueryShortUrlResponse queryShortUrlWithOptions(QueryShortUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryShortUrl", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryShortUrlResponse());
    }

    public QueryShortUrlResponse queryShortUrl(QueryShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryShortUrlWithOptions(request, runtime);
    }

    public QuerySmsSignResponse querySmsSignWithOptions(QuerySmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySmsSign", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySmsSignResponse());
    }

    public QuerySmsSignResponse querySmsSign(QuerySmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmsSignWithOptions(request, runtime);
    }

    public QuerySmsTemplateResponse querySmsTemplateWithOptions(QuerySmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySmsTemplate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySmsTemplateResponse());
    }

    public QuerySmsTemplateResponse querySmsTemplate(QuerySmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmsTemplateWithOptions(request, runtime);
    }

    public SendBatchSmsResponse sendBatchSmsWithOptions(SendBatchSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendBatchSms", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SendBatchSmsResponse());
    }

    public SendBatchSmsResponse sendBatchSms(SendBatchSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendBatchSmsWithOptions(request, runtime);
    }

    public SendCardSmsResponse sendCardSmsWithOptions(SendCardSmsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendCardSmsShrinkRequest request = new SendCardSmsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cardObjects)) {
            request.cardObjectsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cardObjects, "CardObjects", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCardSms", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SendCardSmsResponse());
    }

    public SendCardSmsResponse sendCardSms(SendCardSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCardSmsWithOptions(request, runtime);
    }

    public SendMessageToGlobeResponse sendMessageToGlobeWithOptions(SendMessageToGlobeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessageToGlobe", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageToGlobeResponse());
    }

    public SendMessageToGlobeResponse sendMessageToGlobe(SendMessageToGlobeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageToGlobeWithOptions(request, runtime);
    }

    public SendSmsResponse sendSmsWithOptions(SendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendSms", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SendSmsResponse());
    }

    public SendSmsResponse sendSms(SendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendSmsWithOptions(request, runtime);
    }

    public SendSmsSmartResponse sendSmsSmartWithOptions(SendSmsSmartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendSmsSmart", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SendSmsSmartResponse());
    }

    public SendSmsSmartResponse sendSmsSmart(SendSmsSmartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendSmsSmartWithOptions(request, runtime);
    }
}
