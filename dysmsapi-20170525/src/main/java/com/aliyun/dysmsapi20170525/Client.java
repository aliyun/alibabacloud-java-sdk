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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShortUrlResponse());
    }

    public AddShortUrlResponse addShortUrl(AddShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addShortUrlWithOptions(request, runtime);
    }

    public AddSmsSignResponse addSmsSignWithOptions(AddSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignName", request.signName);
        query.put("SignSource", request.signSource);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmsSignResponse());
    }

    public AddSmsSignResponse addSmsSign(AddSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSmsSignWithOptions(request, runtime);
    }

    public AddSmsTemplateResponse addSmsTemplateWithOptions(AddSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TemplateContent", request.templateContent);
        query.put("TemplateName", request.templateName);
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmsTemplateResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Memo", request.memo);
        query.put("Template", request.templateShrink);
        query.put("TemplateName", request.templateName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCardSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCardSmsTemplateResponse());
    }

    public CreateCardSmsTemplateResponse createCardSmsTemplate(CreateCardSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCardSmsTemplateWithOptions(request, runtime);
    }

    public DeleteShortUrlResponse deleteShortUrlWithOptions(DeleteShortUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteShortUrlResponse());
    }

    public DeleteShortUrlResponse deleteShortUrl(DeleteShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteShortUrlWithOptions(request, runtime);
    }

    public DeleteSmsSignResponse deleteSmsSignWithOptions(DeleteSmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignName", request.signName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmsSignResponse());
    }

    public DeleteSmsSignResponse deleteSmsSign(DeleteSmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsSignWithOptions(request, runtime);
    }

    public DeleteSmsTemplateResponse deleteSmsTemplateWithOptions(DeleteSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TemplateCode", request.templateCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmsTemplateResponse());
    }

    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSmsTemplateWithOptions(request, runtime);
    }

    public GetMediaResourceIdResponse getMediaResourceIdWithOptions(GetMediaResourceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExtendInfo", request.extendInfo);
        query.put("FileSize", request.fileSize);
        query.put("Memo", request.memo);
        query.put("OssKey", request.ossKey);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaResourceId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaResourceIdResponse());
    }

    public GetMediaResourceIdResponse getMediaResourceId(GetMediaResourceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaResourceIdWithOptions(request, runtime);
    }

    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSInfoForCardTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOSSInfoForCardTemplateResponse());
    }

    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOSSInfoForCardTemplateWithOptions(runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("OwnerId", request.ownerId);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifySmsSignResponse modifySmsSignWithOptions(ModifySmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignName", request.signName);
        query.put("SignSource", request.signSource);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmsSignResponse());
    }

    public ModifySmsSignResponse modifySmsSign(ModifySmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmsSignWithOptions(request, runtime);
    }

    public ModifySmsTemplateResponse modifySmsTemplateWithOptions(ModifySmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TemplateCode", request.templateCode);
        query.put("TemplateContent", request.templateContent);
        query.put("TemplateName", request.templateName);
        query.put("TemplateType", request.templateType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmsTemplateResponse());
    }

    public ModifySmsTemplateResponse modifySmsTemplate(ModifySmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySmsTemplateWithOptions(request, runtime);
    }

    public QueryCardSmsTemplateResponse queryCardSmsTemplateWithOptions(QueryCardSmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TemplateCode", request.templateCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCardSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCardSmsTemplateResponse());
    }

    public QueryCardSmsTemplateResponse queryCardSmsTemplate(QueryCardSmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCardSmsTemplateWithOptions(request, runtime);
    }

    public QuerySendDetailsResponse querySendDetailsWithOptions(QuerySendDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CurrentPage", request.currentPage);
        query.put("OwnerId", request.ownerId);
        query.put("PageSize", request.pageSize);
        query.put("PhoneNumber", request.phoneNumber);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SendDate", request.sendDate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySendDetails"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySendDetailsResponse());
    }

    public QuerySendDetailsResponse querySendDetails(QuerySendDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySendDetailsWithOptions(request, runtime);
    }

    public QueryShortUrlResponse queryShortUrlWithOptions(QueryShortUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShortUrlResponse());
    }

    public QueryShortUrlResponse queryShortUrl(QueryShortUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryShortUrlWithOptions(request, runtime);
    }

    public QuerySmsSignResponse querySmsSignWithOptions(QuerySmsSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignName", request.signName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsSignResponse());
    }

    public QuerySmsSignResponse querySmsSign(QuerySmsSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmsSignWithOptions(request, runtime);
    }

    public QuerySmsTemplateResponse querySmsTemplateWithOptions(QuerySmsTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("TemplateCode", request.templateCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsTemplateResponse());
    }

    public QuerySmsTemplateResponse querySmsTemplate(QuerySmsTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySmsTemplateWithOptions(request, runtime);
    }

    public SendBatchSmsResponse sendBatchSmsWithOptions(SendBatchSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNumberJson", request.phoneNumberJson);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignNameJson", request.signNameJson);
        query.put("SmsUpExtendCodeJson", request.smsUpExtendCodeJson);
        query.put("TemplateCode", request.templateCode);
        query.put("TemplateParamJson", request.templateParamJson);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBatchSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBatchSmsResponse());
    }

    public SendBatchSmsResponse sendBatchSms(SendBatchSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendBatchSmsWithOptions(request, runtime);
    }

    public SendCardSmsResponse sendCardSmsWithOptions(SendCardSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CardObjects", request.cardObjects);
        query.put("CardTemplateCode", request.cardTemplateCode);
        query.put("DigitalTemplateCode", request.digitalTemplateCode);
        query.put("DigitalTemplateParam", request.digitalTemplateParam);
        query.put("FallbackType", request.fallbackType);
        query.put("OutId", request.outId);
        query.put("SignName", request.signName);
        query.put("SmsTemplateCode", request.smsTemplateCode);
        query.put("SmsTemplateParam", request.smsTemplateParam);
        query.put("SmsUpExtendCode", request.smsUpExtendCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCardSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCardSmsResponse());
    }

    public SendCardSmsResponse sendCardSms(SendCardSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCardSmsWithOptions(request, runtime);
    }

    public SendSmsResponse sendSmsWithOptions(SendSmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OutId", request.outId);
        query.put("OwnerId", request.ownerId);
        query.put("PhoneNumbers", request.phoneNumbers);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SignName", request.signName);
        query.put("SmsUpExtendCode", request.smsUpExtendCode);
        query.put("TemplateCode", request.templateCode);
        query.put("TemplateParam", request.templateParam);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendSmsResponse());
    }

    public SendSmsResponse sendSms(SendSmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendSmsWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
