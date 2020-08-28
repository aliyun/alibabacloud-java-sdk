// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "dysmsapi-proxy.cn-beijing.aliyuncs.com"),
            new TeaPair("eu-central-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dysmsapi.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dysmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public QuerySmsTemplateResponse querySmsTemplateWithOptions(QuerySmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySmsTemplate", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySmsTemplateResponse());
    }

    public QuerySmsTemplateResponse querySmsTemplate(QuerySmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTemplateWithOptions(request, runtime);
    }

    public QuerySmsSignResponse querySmsSignWithOptions(QuerySmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySmsSign", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySmsSignResponse());
    }

    public QuerySmsSignResponse querySmsSign(QuerySmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsSignWithOptions(request, runtime);
    }

    public ModifySmsTemplateResponse modifySmsTemplateWithOptions(ModifySmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySmsTemplate", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifySmsTemplateResponse());
    }

    public ModifySmsTemplateResponse modifySmsTemplate(ModifySmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmsTemplateWithOptions(request, runtime);
    }

    public ModifySmsSignResponse modifySmsSignWithOptions(ModifySmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySmsSign", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ModifySmsSignResponse());
    }

    public ModifySmsSignResponse modifySmsSign(ModifySmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmsSignWithOptions(request, runtime);
    }

    public DeleteSmsTemplateResponse deleteSmsTemplateWithOptions(DeleteSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSmsTemplate", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSmsTemplateResponse());
    }

    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmsTemplateWithOptions(request, runtime);
    }

    public DeleteSmsSignResponse deleteSmsSignWithOptions(DeleteSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSmsSign", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSmsSignResponse());
    }

    public DeleteSmsSignResponse deleteSmsSign(DeleteSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmsSignWithOptions(request, runtime);
    }

    public AddSmsTemplateResponse addSmsTemplateWithOptions(AddSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSmsTemplate", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new AddSmsTemplateResponse());
    }

    public AddSmsTemplateResponse addSmsTemplate(AddSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmsTemplateWithOptions(request, runtime);
    }

    public AddSmsSignResponse addSmsSignWithOptions(AddSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddSmsSign", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new AddSmsSignResponse());
    }

    public AddSmsSignResponse addSmsSign(AddSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmsSignWithOptions(request, runtime);
    }

    public SendBatchSmsResponse sendBatchSmsWithOptions(SendBatchSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendBatchSms", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SendBatchSmsResponse());
    }

    public SendBatchSmsResponse sendBatchSms(SendBatchSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendBatchSmsWithOptions(request, runtime);
    }

    public SendSmsResponse sendSmsWithOptions(SendSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendSms", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SendSmsResponse());
    }

    public SendSmsResponse sendSms(SendSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendSmsWithOptions(request, runtime);
    }

    public QuerySendDetailsResponse querySendDetailsWithOptions(QuerySendDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySendDetails", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QuerySendDetailsResponse());
    }

    public QuerySendDetailsResponse querySendDetails(QuerySendDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySendDetailsWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
