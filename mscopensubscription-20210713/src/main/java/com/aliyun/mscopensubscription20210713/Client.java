// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713;

import com.aliyun.tea.*;
import com.aliyun.mscopensubscription20210713.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mscopensubscription", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>创建联系人</p>
     * 
     * @param request CreateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContactResponse
     */
    public CreateContactResponse createContactWithOptions(CreateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            body.put("Position", request.position);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContact"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建联系人</p>
     * 
     * @param request CreateContactRequest
     * @return CreateContactResponse
     */
    public CreateContactResponse createContact(CreateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>伪创建接口，根据itemName查询</p>
     * 
     * @param request CreateSubscriptionItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubscriptionItemResponse
     */
    public CreateSubscriptionItemResponse createSubscriptionItemWithOptions(CreateSubscriptionItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemName)) {
            body.put("ItemName", request.itemName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscriptionItem"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>伪创建接口，根据itemName查询</p>
     * 
     * @param request CreateSubscriptionItemRequest
     * @return CreateSubscriptionItemResponse
     */
    public CreateSubscriptionItemResponse createSubscriptionItem(CreateSubscriptionItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubscriptionItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉钉群机器人</p>
     * 
     * @param request CreateWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebhookResponse
     */
    public CreateWebhookResponse createWebhookWithOptions(CreateWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            body.put("ServerUrl", request.serverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookName)) {
            body.put("WebhookName", request.webhookName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebhook"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建钉钉群机器人</p>
     * 
     * @param request CreateWebhookRequest
     * @return CreateWebhookResponse
     */
    public CreateWebhookResponse createWebhook(CreateWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人</p>
     * 
     * @param request DeleteContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContact"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除联系人</p>
     * 
     * @param request DeleteContactRequest
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除钉钉群机器人</p>
     * 
     * @param request DeleteWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebhookResponse
     */
    public DeleteWebhookResponse deleteWebhookWithOptions(DeleteWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.webhookId)) {
            body.put("WebhookId", request.webhookId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWebhook"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除钉钉群机器人</p>
     * 
     * @param request DeleteWebhookRequest
     * @return DeleteWebhookResponse
     */
    public DeleteWebhookResponse deleteWebhook(DeleteWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得某联系人</p>
     * 
     * @param request GetContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContactResponse
     */
    public GetContactResponse getContactWithOptions(GetContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContact"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得某联系人</p>
     * 
     * @param request GetContactRequest
     * @return GetContactResponse
     */
    public GetContactResponse getContact(GetContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得用户订阅项</p>
     * 
     * @param request GetSubscriptionItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionItemResponse
     */
    public GetSubscriptionItemResponse getSubscriptionItemWithOptions(GetSubscriptionItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionItem"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得用户订阅项</p>
     * 
     * @param request GetSubscriptionItemRequest
     * @return GetSubscriptionItemResponse
     */
    public GetSubscriptionItemResponse getSubscriptionItem(GetSubscriptionItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获得订阅项详细描述</p>
     * 
     * @param request GetSubscriptionItemDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionItemDetailResponse
     */
    public GetSubscriptionItemDetailResponse getSubscriptionItemDetailWithOptions(GetSubscriptionItemDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionItemDetail"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionItemDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获得订阅项详细描述</p>
     * 
     * @param request GetSubscriptionItemDetailRequest
     * @return GetSubscriptionItemDetailResponse
     */
    public GetSubscriptionItemDetailResponse getSubscriptionItemDetail(GetSubscriptionItemDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionItemDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取钉钉群机器人</p>
     * 
     * @param request GetWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWebhookResponse
     */
    public GetWebhookResponse getWebhookWithOptions(GetWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebhook"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取钉钉群机器人</p>
     * 
     * @param request GetWebhookRequest
     * @return GetWebhookResponse
     */
    public GetWebhookResponse getWebhook(GetWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有联系人</p>
     * 
     * @param request ListContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContactsResponse
     */
    public ListContactsResponse listContactsWithOptions(ListContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContacts"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举所有联系人</p>
     * 
     * @param request ListContactsRequest
     * @return ListContactsResponse
     */
    public ListContactsResponse listContacts(ListContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户钉钉群机器人（securityToken字段加密）</p>
     * 
     * @param request ListEncryptWebhooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEncryptWebhooksResponse
     */
    public ListEncryptWebhooksResponse listEncryptWebhooksWithOptions(ListEncryptWebhooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEncryptWebhooks"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEncryptWebhooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户钉钉群机器人（securityToken字段加密）</p>
     * 
     * @param request ListEncryptWebhooksRequest
     * @return ListEncryptWebhooksResponse
     */
    public ListEncryptWebhooksResponse listEncryptWebhooks(ListEncryptWebhooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEncryptWebhooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取订阅项和组的详情</p>
     * 
     * @param request ListSubscriptionItemGroupDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionItemGroupDetailsResponse
     */
    public ListSubscriptionItemGroupDetailsResponse listSubscriptionItemGroupDetailsWithOptions(ListSubscriptionItemGroupDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionItemGroupDetails"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionItemGroupDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取订阅项和组的详情</p>
     * 
     * @param request ListSubscriptionItemGroupDetailsRequest
     * @return ListSubscriptionItemGroupDetailsResponse
     */
    public ListSubscriptionItemGroupDetailsResponse listSubscriptionItemGroupDetails(ListSubscriptionItemGroupDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubscriptionItemGroupDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户订阅项</p>
     * 
     * @param request ListSubscriptionItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionItemsResponse
     */
    public ListSubscriptionItemsResponse listSubscriptionItemsWithOptions(ListSubscriptionItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionItems"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户订阅项</p>
     * 
     * @param request ListSubscriptionItemsRequest
     * @return ListSubscriptionItemsResponse
     */
    public ListSubscriptionItemsResponse listSubscriptionItems(ListSubscriptionItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubscriptionItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户钉钉群机器人</p>
     * 
     * @param request ListWebhooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWebhooksResponse
     */
    public ListWebhooksResponse listWebhooksWithOptions(ListWebhooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWebhooks"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWebhooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户钉钉群机器人</p>
     * 
     * @param request ListWebhooksRequest
     * @return ListWebhooksResponse
     */
    public ListWebhooksResponse listWebhooks(ListWebhooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWebhooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送验证信息</p>
     * 
     * @param request SendVerificationMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendVerificationMessageResponse
     */
    public SendVerificationMessageResponse sendVerificationMessageWithOptions(SendVerificationMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerificationMessage"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerificationMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送验证信息</p>
     * 
     * @param request SendVerificationMessageRequest
     * @return SendVerificationMessageResponse
     */
    public SendVerificationMessageResponse sendVerificationMessage(SendVerificationMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerificationMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人</p>
     * 
     * @param request UpdateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContactWithOptions(UpdateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContact"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新联系人</p>
     * 
     * @param request UpdateContactRequest
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户订阅项</p>
     * 
     * @param tmpReq UpdateSubscriptionItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionItemResponse
     */
    public UpdateSubscriptionItemResponse updateSubscriptionItemWithOptions(UpdateSubscriptionItemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSubscriptionItemShrinkRequest request = new UpdateSubscriptionItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactIds)) {
            request.contactIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactIds, "ContactIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.webhookIds)) {
            request.webhookIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.webhookIds, "WebhookIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactIdsShrink)) {
            body.put("ContactIds", request.contactIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailStatus)) {
            body.put("EmailStatus", request.emailStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pmsgStatus)) {
            body.put("PmsgStatus", request.pmsgStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsStatus)) {
            body.put("SmsStatus", request.smsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsStatus)) {
            body.put("TtsStatus", request.ttsStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookIdsShrink)) {
            body.put("WebhookIds", request.webhookIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookStatus)) {
            body.put("WebhookStatus", request.webhookStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscriptionItem"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户订阅项</p>
     * 
     * @param request UpdateSubscriptionItemRequest
     * @return UpdateSubscriptionItemResponse
     */
    public UpdateSubscriptionItemResponse updateSubscriptionItem(UpdateSubscriptionItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubscriptionItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新钉钉群机器人</p>
     * 
     * @param request UpdateWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebhookResponse
     */
    public UpdateWebhookResponse updateWebhookWithOptions(UpdateWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            body.put("ServerUrl", request.serverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookId)) {
            body.put("WebhookId", request.webhookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookName)) {
            body.put("WebhookName", request.webhookName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebhook"),
            new TeaPair("version", "2021-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新钉钉群机器人</p>
     * 
     * @param request UpdateWebhookRequest
     * @return UpdateWebhookResponse
     */
    public UpdateWebhookResponse updateWebhook(UpdateWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWebhookWithOptions(request, runtime);
    }
}
