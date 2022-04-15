// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606;

import com.aliyun.tea.*;
import com.aliyun.cams20200606.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cams", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CheckChatappContactsResponse checkChatappContactsWithOptions(CheckChatappContactsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckChatappContactsShrinkRequest request = new CheckChatappContactsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contacts)) {
            request.contactsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contacts, "Contacts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactsShrink)) {
            body.put("Contacts", request.contactsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckChatappContacts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckChatappContactsResponse());
    }

    public CheckChatappContactsResponse checkChatappContacts(CheckChatappContactsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkChatappContactsWithOptions(request, runtime);
    }

    public CheckContactsResponse checkContactsWithOptions(CheckContactsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contacts)) {
            body.put("Contacts", request.contacts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckContacts"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckContactsResponse());
    }

    public CheckContactsResponse checkContacts(CheckContactsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkContactsWithOptions(request, runtime);
    }

    public CreateChatappTemplateResponse createChatappTemplateWithOptions(CreateChatappTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateChatappTemplateShrinkRequest request = new CreateChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.example)) {
            request.exampleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.example, "Example", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            body.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exampleShrink)) {
            body.put("Example", request.exampleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatappTemplateResponse());
    }

    public CreateChatappTemplateResponse createChatappTemplate(CreateChatappTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChatappTemplateWithOptions(request, runtime);
    }

    public DeleteChatappTemplateResponse deleteChatappTemplateWithOptions(DeleteChatappTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatappTemplateResponse());
    }

    public DeleteChatappTemplateResponse deleteChatappTemplate(DeleteChatappTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChatappTemplateWithOptions(request, runtime);
    }

    public GetChatappTemplateDetailResponse getChatappTemplateDetailWithOptions(GetChatappTemplateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatappTemplateDetail"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatappTemplateDetailResponse());
    }

    public GetChatappTemplateDetailResponse getChatappTemplateDetail(GetChatappTemplateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getChatappTemplateDetailWithOptions(request, runtime);
    }

    public ListChatappTemplateResponse listChatappTemplateWithOptions(ListChatappTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListChatappTemplateShrinkRequest request = new ListChatappTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.page))) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.page), "Page", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            query.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatappTemplate"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatappTemplateResponse());
    }

    public ListChatappTemplateResponse listChatappTemplate(ListChatappTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChatappTemplateWithOptions(request, runtime);
    }

    public SendChatappMessageResponse sendChatappMessageWithOptions(SendChatappMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatappMessageShrinkRequest request = new SendChatappMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateParams)) {
            request.templateParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateParams, "TemplateParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custWabaId)) {
            body.put("CustWabaId", request.custWabaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamsShrink)) {
            body.put("TemplateParams", request.templateParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatappMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatappMessageResponse());
    }

    public SendChatappMessageResponse sendChatappMessage(SendChatappMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendChatappMessageWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caption)) {
            body.put("Caption", request.caption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            body.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.link)) {
            body.put("Link", request.link);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            body.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateBodyParams)) {
            body.put("TemplateBodyParams", request.templateBodyParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateButtonParams)) {
            body.put("TemplateButtonParams", request.templateButtonParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateHeaderParams)) {
            body.put("TemplateHeaderParams", request.templateHeaderParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2020-06-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }
}
