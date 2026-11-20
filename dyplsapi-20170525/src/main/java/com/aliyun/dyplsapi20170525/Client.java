// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyplsapi20170525.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Dyplsapi";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyplsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a tracking number for a private number in the AXN binding.</p>
     * 
     * @param request AddAxnTrackNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAxnTrackNoResponse
     */
    public AddAxnTrackNoResponse addAxnTrackNoWithOptions(AddAxnTrackNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackNo)) {
            query.put("trackNo", request.trackNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAxnTrackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAxnTrackNoResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a tracking number for a private number in the AXN binding.</p>
     * 
     * @param request AddAxnTrackNoRequest
     * @return AddAxnTrackNoResponse
     */
    public AddAxnTrackNoResponse addAxnTrackNo(AddAxnTrackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAxnTrackNoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. You can add only one pair of <strong>point-to-point blacklist</strong> numbers or one <strong>number pool blacklist</strong> number at a time.</li>
     * <li>To delete a blacklist entry, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-deletesecretblacklist">DeleteSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>Quantity limit</h3>
     * <p>The maximum number of blacklist entries per number pool is 2,000,000. If this limit is exceeded, API calls to add blacklist numbers will fail, which may affect your business. If you have special requirements, contact your Alibaba Cloud account manager.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If this limit is exceeded, API calls will be throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to the blacklist of a China number pool. Only AXN privacy number, AXN extension number, and 95AXN privacy number pool types support blacklist settings.</p>
     * 
     * @param request AddSecretBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSecretBlacklistResponse
     */
    public AddSecretBlacklistResponse addSecretBlacklistWithOptions(AddSecretBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackNo)) {
            query.put("BlackNo", request.blackNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blackType)) {
            query.put("BlackType", request.blackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wayControl)) {
            query.put("WayControl", request.wayControl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSecretBlacklist"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSecretBlacklistResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. You can add only one pair of <strong>point-to-point blacklist</strong> numbers or one <strong>number pool blacklist</strong> number at a time.</li>
     * <li>To delete a blacklist entry, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-deletesecretblacklist">DeleteSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>Quantity limit</h3>
     * <p>The maximum number of blacklist entries per number pool is 2,000,000. If this limit is exceeded, API calls to add blacklist numbers will fail, which may affect your business. If you have special requirements, contact your Alibaba Cloud account manager.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If this limit is exceeded, API calls will be throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to the blacklist of a China number pool. Only AXN privacy number, AXN extension number, and 95AXN privacy number pool types support blacklist settings.</p>
     * 
     * @param request AddSecretBlacklistRequest
     * @return AddSecretBlacklistResponse
     */
    public AddSecretBlacklistResponse addSecretBlacklist(AddSecretBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSecretBlacklistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Establishes a call binding relationship (B, X, A) for work number X of employee B on the work number platform to allow employee B to call customer A through work number X.</p>
     * 
     * @param request BindAXBCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAXBCallResponse
     */
    public BindAXBCallResponse bindAXBCallWithOptions(BindAXBCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            query.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAXBCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAXBCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Establishes a call binding relationship (B, X, A) for work number X of employee B on the work number platform to allow employee B to call customer A through work number X.</p>
     * 
     * @param request BindAXBCallRequest
     * @return BindAXBCallResponse
     */
    public BindAXBCallResponse bindAXBCall(BindAXBCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAXBCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AXB binding.</p>
     * 
     * @param request BindAxbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxbResponse
     */
    public BindAxbResponse bindAxbWithOptions(BindAxbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASRModelId)) {
            query.put("ASRModelId", request.ASRModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ASRStatus)) {
            query.put("ASRStatus", request.ASRStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDisplayType)) {
            query.put("CallDisplayType", request.callDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeout)) {
            query.put("CallTimeout", request.callTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfConfig)) {
            query.put("DtmfConfig", request.dtmfConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectCity)) {
            query.put("ExpectCity", request.expectCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecordingEnabled)) {
            query.put("IsRecordingEnabled", request.isRecordingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoB)) {
            query.put("PhoneNoB", request.phoneNoB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringConfig)) {
            query.put("RingConfig", request.ringConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxb"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AXB binding.</p>
     * 
     * @param request BindAxbRequest
     * @return BindAxbResponse
     */
    public BindAxbResponse bindAxb(BindAxbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxbWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to attach numbers for a 700AXB private number, or attach A and B numbers for a 700AXB private number on the Number Management page in the console.
     * Before attaching numbers for a 700AXB private number, determine the A role and B role in your business scenario. For example, in a ride-hailing scenario, A is the passenger and B is the driver.
     * The 700AXB private number is mainly used for privacy protection in one-to-one scenarios. You attach number A and number B through the Phone Number Protection service. When A calls X, the call is forwarded to B. When B calls X, the call is forwarded to A. A single X number can be reused by up to 200 binding pairs, such as A1XB1, A2XB2, A3XB3, and so on. As long as the phone numbers of A and B users are unique, a single X number can be bound to 200 groups of phone numbers simultaneously, and calls can also be made simultaneously.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. Exceeding this limit will cause throttling, which may affect your business. Invoke this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds phone numbers for a 700AXB private number. A 700AXB private number restricts the calling relationship to a one-to-one relationship. User A can contact User B through the intermediate number X that starts with 700, and User B can also contact User A through the same intermediate number X.</p>
     * 
     * @param request BindAxb700Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxb700Response
     */
    public BindAxb700Response bindAxb700WithOptions(BindAxb700Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeout)) {
            query.put("CallTimeout", request.callTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfConfig)) {
            query.put("DtmfConfig", request.dtmfConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industrialId)) {
            query.put("IndustrialId", request.industrialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAsr)) {
            query.put("NeedAsr", request.needAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRecord)) {
            query.put("NeedRecord", request.needRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recType)) {
            query.put("RecType", request.recType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxb700"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxb700Response());
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to attach numbers for a 700AXB private number, or attach A and B numbers for a 700AXB private number on the Number Management page in the console.
     * Before attaching numbers for a 700AXB private number, determine the A role and B role in your business scenario. For example, in a ride-hailing scenario, A is the passenger and B is the driver.
     * The 700AXB private number is mainly used for privacy protection in one-to-one scenarios. You attach number A and number B through the Phone Number Protection service. When A calls X, the call is forwarded to B. When B calls X, the call is forwarded to A. A single X number can be reused by up to 200 binding pairs, such as A1XB1, A2XB2, A3XB3, and so on. As long as the phone numbers of A and B users are unique, a single X number can be bound to 200 groups of phone numbers simultaneously, and calls can also be made simultaneously.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. Exceeding this limit will cause throttling, which may affect your business. Invoke this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds phone numbers for a 700AXB private number. A 700AXB private number restricts the calling relationship to a one-to-one relationship. User A can contact User B through the intermediate number X that starts with 700, and User B can also contact User A through the same intermediate number X.</p>
     * 
     * @param request BindAxb700Request
     * @return BindAxb700Response
     */
    public BindAxb700Response bindAxb700(BindAxb700Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxb700WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind numbers to a fixed-line AXB intermediate number. Currently, you cannot bind Number A and Number B to a fixed-line AXB intermediate number on the Number Management page in the console.</li>
     * <li>Before binding numbers, we recommend that you clarify the roles of User A and User B in your business scenario. For example, in common scenarios such as ride-hailing, User A is the passenger and User B is the driver.</li>
     * <li>Fixed-line AXB intermediate numbers are mainly used for privacy protection in one-to-one scenarios. Number A and Number B are bound through the Phone Number Protection service. When User A calls Number X, the call is forwarded to User B. When User B calls Number X, the call is forwarded to User A. A single fixed-line Number X can be reused for N binding relationships, such as A1-X-B1, A2-X-B2, and A3-X-B3. As long as the mobile phone numbers of Users A and B are not duplicated, a single fixed-line Number X can be bound to N pairs of mobile phone numbers simultaneously, and calls can be made concurrently.</li>
     * <li>The number of times a number can be reused varies based on the number you purchased. You can confirm the specific reuse limit with your technical support when purchasing the number.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an AXB privacy number to a fixed line to restrict the calling relationship to a one-to-one relationship, allowing User A to contact User B through the fixed-line intermediate number X, and User B to contact User A through the same intermediate number X. Fixed-line privacy numbers are currently available by invitation only. Contact your technical support to activate the service and obtain integration support.</p>
     * 
     * @param tmpReq BindAxbFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxbFixedLineResponse
     */
    public BindAxbFixedLineResponse bindAxbFixedLineWithOptions(BindAxbFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindAxbFixedLineShrinkRequest request = new BindAxbFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areacode)) {
            query.put("Areacode", request.areacode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindType)) {
            query.put("BindType", request.bindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxbFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxbFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind numbers to a fixed-line AXB intermediate number. Currently, you cannot bind Number A and Number B to a fixed-line AXB intermediate number on the Number Management page in the console.</li>
     * <li>Before binding numbers, we recommend that you clarify the roles of User A and User B in your business scenario. For example, in common scenarios such as ride-hailing, User A is the passenger and User B is the driver.</li>
     * <li>Fixed-line AXB intermediate numbers are mainly used for privacy protection in one-to-one scenarios. Number A and Number B are bound through the Phone Number Protection service. When User A calls Number X, the call is forwarded to User B. When User B calls Number X, the call is forwarded to User A. A single fixed-line Number X can be reused for N binding relationships, such as A1-X-B1, A2-X-B2, and A3-X-B3. As long as the mobile phone numbers of Users A and B are not duplicated, a single fixed-line Number X can be bound to N pairs of mobile phone numbers simultaneously, and calls can be made concurrently.</li>
     * <li>The number of times a number can be reused varies based on the number you purchased. You can confirm the specific reuse limit with your technical support when purchasing the number.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an AXB privacy number to a fixed line to restrict the calling relationship to a one-to-one relationship, allowing User A to contact User B through the fixed-line intermediate number X, and User B to contact User A through the same intermediate number X. Fixed-line privacy numbers are currently available by invitation only. Contact your technical support to activate the service and obtain integration support.</p>
     * 
     * @param request BindAxbFixedLineRequest
     * @return BindAxbFixedLineResponse
     */
    public BindAxbFixedLineResponse bindAxbFixedLine(BindAxbFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxbFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AXG binding.</p>
     * 
     * @param request BindAxgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxgResponse
     */
    public BindAxgResponse bindAxgWithOptions(BindAxgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASRModelId)) {
            query.put("ASRModelId", request.ASRModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ASRStatus)) {
            query.put("ASRStatus", request.ASRStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDisplayType)) {
            query.put("CallDisplayType", request.callDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectCity)) {
            query.put("ExpectCity", request.expectCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecordingEnabled)) {
            query.put("IsRecordingEnabled", request.isRecordingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoB)) {
            query.put("PhoneNoB", request.phoneNoB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringConfig)) {
            query.put("RingConfig", request.ringConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxg"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxgResponse());
    }

    /**
     * <b>description</b> :
     * <p>An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an AXG binding.</p>
     * 
     * @param request BindAxgRequest
     * @return BindAxgResponse
     */
    public BindAxgResponse bindAxg(BindAxgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxgWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased a privacy number</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN privacy number, or bind Number A and Number B to an AXN privacy number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers to an AXN privacy number, clarify the role of User A in your business scenario. For example, in a used car information publishing scenario, User A represents the contact information of the landlord or agent.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for an AXN privacy number. An AXN privacy number assigns an exclusive privacy number to User A, allowing any Number N to reach User A by dialing Number X.</p>
     * 
     * @param request BindAxnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxnResponse
     */
    public BindAxnResponse bindAxnWithOptions(BindAxnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASRModelId)) {
            query.put("ASRModelId", request.ASRModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ASRStatus)) {
            query.put("ASRStatus", request.ASRStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDisplayType)) {
            query.put("CallDisplayType", request.callDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeout)) {
            query.put("CallTimeout", request.callTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectCity)) {
            query.put("ExpectCity", request.expectCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecordingEnabled)) {
            query.put("IsRecordingEnabled", request.isRecordingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noType)) {
            query.put("NoType", request.noType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoB)) {
            query.put("PhoneNoB", request.phoneNoB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringConfig)) {
            query.put("RingConfig", request.ringConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxn"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased a privacy number</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN privacy number, or bind Number A and Number B to an AXN privacy number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers to an AXN privacy number, clarify the role of User A in your business scenario. For example, in a used car information publishing scenario, User A represents the contact information of the landlord or agent.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for an AXN privacy number. An AXN privacy number assigns an exclusive privacy number to User A, allowing any Number N to reach User A by dialing Number X.</p>
     * 
     * @param request BindAxnRequest
     * @return BindAxnResponse
     */
    public BindAxnResponse bindAxn(BindAxnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN extension number. You can also bind numbers A and B to an AXN extension number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers for an AXN extension number, we recommend that you clarify the roles of A and N in your business scenario. For example, if number A is a customer, number X is the privacy number assigned to the customer. Calls from any other number to number X plus the extension number are forwarded to number A. When A calls X, the call is forwarded to the default number B specified during binding.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 5,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for an AXN extension number. The AXN extension number feature is similar to the AXN privacy number feature but introduces extension numbers to reduce the usage of X numbers. When making a call, the caller dials the X number first and then enters the corresponding extension number after hearing the prompt tone to connect to number A.</p>
     * 
     * @param request BindAxnExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxnExtensionResponse
     */
    public BindAxnExtensionResponse bindAxnExtensionWithOptions(BindAxnExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASRModelId)) {
            query.put("ASRModelId", request.ASRModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ASRStatus)) {
            query.put("ASRStatus", request.ASRStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDisplayType)) {
            query.put("CallDisplayType", request.callDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectCity)) {
            query.put("ExpectCity", request.expectCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecordingEnabled)) {
            query.put("IsRecordingEnabled", request.isRecordingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoB)) {
            query.put("PhoneNoB", request.phoneNoB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringConfig)) {
            query.put("RingConfig", request.ringConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxnExtension"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnExtensionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN extension number. You can also bind numbers A and B to an AXN extension number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers for an AXN extension number, we recommend that you clarify the roles of A and N in your business scenario. For example, if number A is a customer, number X is the privacy number assigned to the customer. Calls from any other number to number X plus the extension number are forwarded to number A. When A calls X, the call is forwarded to the default number B specified during binding.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 5,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for an AXN extension number. The AXN extension number feature is similar to the AXN privacy number feature but introduces extension numbers to reduce the usage of X numbers. When making a call, the caller dials the X number first and then enters the corresponding extension number after hearing the prompt tone to connect to number A.</p>
     * 
     * @param request BindAxnExtensionRequest
     * @return BindAxnExtensionResponse
     */
    public BindAxnExtensionResponse bindAxnExtension(BindAxnExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnExtensionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this API to bind numbers for the fixed-line AXN extension number. Binding numbers for the fixed-line AXN extension number through the console is not supported.</li>
     * <li>Before binding numbers, we recommend that you first clarify the A role and N role in your business scenario. For example, if the A number represents the customer, the X number is the privacy number assigned to the customer. Any other number calling the X number plus the extension number will be forwarded to the A number. When A calls X, the call will be forwarded to the default B number specified during binding.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The fixed-line AXN extension number introduces extension numbers on top of the fixed-line AXN privacy number, thereby reducing the usage of X numbers. When making a call, first dial the X number, and then enter the corresponding extension number after hearing the prompt tone to be connected to A. The fixed-line AXN extension number service is currently invitation-only. Contact your technical support to activate the service and obtain integration support.</p>
     * 
     * @param tmpReq BindAxnExtensionFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxnExtensionFixedLineResponse
     */
    public BindAxnExtensionFixedLineResponse bindAxnExtensionFixedLineWithOptions(BindAxnExtensionFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindAxnExtensionFixedLineShrinkRequest request = new BindAxnExtensionFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraaxx)) {
            request.extraaxxShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraaxx, "Extraaxx", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areacode)) {
            query.put("Areacode", request.areacode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindType)) {
            query.put("BindType", request.bindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraaxxShrink)) {
            query.put("Extraaxx", request.extraaxxShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telXext)) {
            query.put("TelXext", request.telXext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxnExtensionFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnExtensionFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this API to bind numbers for the fixed-line AXN extension number. Binding numbers for the fixed-line AXN extension number through the console is not supported.</li>
     * <li>Before binding numbers, we recommend that you first clarify the A role and N role in your business scenario. For example, if the A number represents the customer, the X number is the privacy number assigned to the customer. Any other number calling the X number plus the extension number will be forwarded to the A number. When A calls X, the call will be forwarded to the default B number specified during binding.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>The fixed-line AXN extension number introduces extension numbers on top of the fixed-line AXN privacy number, thereby reducing the usage of X numbers. When making a call, first dial the X number, and then enter the corresponding extension number after hearing the prompt tone to be connected to A. The fixed-line AXN extension number service is currently invitation-only. Contact your technical support to activate the service and obtain integration support.</p>
     * 
     * @param request BindAxnExtensionFixedLineRequest
     * @return BindAxnExtensionFixedLineResponse
     */
    public BindAxnExtensionFixedLineResponse bindAxnExtensionFixedLine(BindAxnExtensionFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnExtensionFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind a number to a fixed-line AXN privacy number. The console does not support binding for fixed-line AXN privacy numbers.</li>
     * <li>Before binding a number, we recommend that you clarify the role of User A in your business scenario. For example, in a used car listing scenario, User A represents the contact information of the property owner or broker.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds a fixed-line AXN privacy number to assign a dedicated privacy number to User A, which allows any number N to be forwarded to User A by dialing number X. Fixed-line privacy numbers are currently available by invitation only. Contact your technical support to activate the service and obtain integration assistance.</p>
     * 
     * @param tmpReq BindAxnFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAxnFixedLineResponse
     */
    public BindAxnFixedLineResponse bindAxnFixedLineWithOptions(BindAxnFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindAxnFixedLineShrinkRequest request = new BindAxnFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areacode)) {
            query.put("Areacode", request.areacode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindType)) {
            query.put("BindType", request.bindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAxnFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAxnFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind a number to a fixed-line AXN privacy number. The console does not support binding for fixed-line AXN privacy numbers.</li>
     * <li>Before binding a number, we recommend that you clarify the role of User A in your business scenario. For example, in a used car listing scenario, User A represents the contact information of the property owner or broker.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds a fixed-line AXN privacy number to assign a dedicated privacy number to User A, which allows any number N to be forwarded to User A by dialing number X. Fixed-line privacy numbers are currently available by invitation only. Contact your technical support to activate the service and obtain integration assistance.</p>
     * 
     * @param request BindAxnFixedLineRequest
     * @return BindAxnFixedLineResponse
     */
    public BindAxnFixedLineResponse bindAxnFixedLine(BindAxnFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you bind AXG Numbers, you must purchase X Numbers, create a G Number Group, and add Numbers to the group. To create a G Number Group, see <a href="https://help.aliyun.com/zh/pnp/user-guide/manage-phone-number-pools#section-9bb-xrg-c78">Set up G Number Group</a> or call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-createaxggroup">CreateAxgGroup</a> API.</li>
     * <li>Before binding AXG Numbers, define Role A and Role G for your business scenario. For example, on a recruitment platform, Role A can represent job applicants and Role G can represent the hiring team.</li>
     * <li>When you call this API for Batch Binding of AXG Numbers, a single failed request does not affect others in the batch. The API returns a status code for each binding request.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 5,000 per user. Exceeding this limit results in throttling. Plan your API calls accordingly to avoid impacting your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds AXG bindings in batches. The AXG model is a Phone Number Protection Solution for scenarios requiring User Tiering, Call Scope Restriction, or Order Grabbing Restriction. In this model, G represents a Number Group, to which you can add phone numbers.</p>
     * 
     * @param tmpReq BindBatchAxgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindBatchAxgResponse
     */
    public BindBatchAxgResponse bindBatchAxgWithOptions(BindBatchAxgRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindBatchAxgShrinkRequest request = new BindBatchAxgShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.axgBindList)) {
            request.axgBindListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.axgBindList, "AxgBindList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.axgBindListShrink)) {
            query.put("AxgBindList", request.axgBindListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindBatchAxg"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindBatchAxgResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you bind AXG Numbers, you must purchase X Numbers, create a G Number Group, and add Numbers to the group. To create a G Number Group, see <a href="https://help.aliyun.com/zh/pnp/user-guide/manage-phone-number-pools#section-9bb-xrg-c78">Set up G Number Group</a> or call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-createaxggroup">CreateAxgGroup</a> API.</li>
     * <li>Before binding AXG Numbers, define Role A and Role G for your business scenario. For example, on a recruitment platform, Role A can represent job applicants and Role G can represent the hiring team.</li>
     * <li>When you call this API for Batch Binding of AXG Numbers, a single failed request does not affect others in the batch. The API returns a status code for each binding request.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 5,000 per user. Exceeding this limit results in throttling. Plan your API calls accordingly to avoid impacting your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds AXG bindings in batches. The AXG model is a Phone Number Protection Solution for scenarios requiring User Tiering, Call Scope Restriction, or Order Grabbing Restriction. In this model, G represents a Number Group, to which you can add phone numbers.</p>
     * 
     * @param request BindBatchAxgRequest
     * @return BindBatchAxgResponse
     */
    public BindBatchAxgResponse bindBatchAxg(BindBatchAxgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindBatchAxgWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to bind numbers to a 700GXB private number, or bind numbers on the Number Management page in the console.
     * Before binding numbers for a 700GXB private number, clarify the G role and B role in your business scenario. For example, on a recruitment platform, B is the job applicant and G is the recruitment team.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for a 700GXB private number. The 700GXB product is a privacy protection solutions designed for scenarios that require user-level classification, call scope restrictions, and order-grabbing restrictions. In this product, G represents a number group, and you can add numbers to the group as needed.</p>
     * 
     * @param request BindGxb700Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindGxb700Response
     */
    public BindGxb700Response bindGxb700WithOptions(BindGxb700Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTimeout)) {
            query.put("CallTimeout", request.callTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultA)) {
            query.put("DefaultA", request.defaultA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtmfConfig)) {
            query.put("DtmfConfig", request.dtmfConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industrialId)) {
            query.put("IndustrialId", request.industrialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAsr)) {
            query.put("NeedAsr", request.needAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRecord)) {
            query.put("NeedRecord", request.needRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderId)) {
            query.put("OutOrderId", request.outOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recType)) {
            query.put("RecType", request.recType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindGxb700"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindGxb700Response());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to bind numbers to a 700GXB private number, or bind numbers on the Number Management page in the console.
     * Before binding numbers for a 700GXB private number, clarify the G role and B role in your business scenario. For example, on a recruitment platform, B is the job applicant and G is the recruitment team.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a binding relationship for a 700GXB private number. The 700GXB product is a privacy protection solutions designed for scenarios that require user-level classification, call scope restrictions, and order-grabbing restrictions. In this product, G represents a number group, and you can add numbers to the group as needed.</p>
     * 
     * @param request BindGxb700Request
     * @return BindGxb700Response
     */
    public BindGxb700Response bindGxb700(BindGxb700Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindGxb700WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Establishes a binding relationship between a specified work number X and an employee number B on the work number platform. The binding takes effect only after the employee completes real-name verification for the work number. After the binding succeeds, all calls to the work number are forwarded to the employee number. The platform pushes the binding result to the caller through the asynchronous notification API.</p>
     * 
     * @param request BindXBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindXBResponse
     */
    public BindXBResponse bindXBWithOptions(BindXBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindXB"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindXBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Establishes a binding relationship between a specified work number X and an employee number B on the work number platform. The binding takes effect only after the employee completes real-name verification for the work number. After the binding succeeds, all calls to the work number are forwarded to the employee number. The platform pushes the binding result to the caller through the asynchronous notification API.</p>
     * 
     * @param request BindXBRequest
     * @return BindXBResponse
     */
    public BindXBResponse bindXB(BindXBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindXBWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/59825.html">pricing</a> of Phone Number Protection.</li>
     * <li>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the <a href="https://help.aliyun.com/document_detail/111699.html">QuerySecretNoRemain</a> operation.</li>
     * <li>The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see <a href="https://help.aliyun.com/document_detail/37172.html">Enterprise verification FAQs</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases a phone number.</p>
     * 
     * @param request BuySecretNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuySecretNoResponse
     */
    public BuySecretNoResponse buySecretNoWithOptions(BuySecretNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayPool)) {
            query.put("DisplayPool", request.displayPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuySecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuySecretNoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/59825.html">pricing</a> of Phone Number Protection.</li>
     * <li>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the <a href="https://help.aliyun.com/document_detail/111699.html">QuerySecretNoRemain</a> operation.</li>
     * <li>The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see <a href="https://help.aliyun.com/document_detail/37172.html">Enterprise verification FAQs</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Purchases a phone number.</p>
     * 
     * @param request BuySecretNoRequest
     * @return BuySecretNoResponse
     */
    public BuySecretNoResponse buySecretNo(BuySecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buySecretNoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a door-to-door delivery order.</p>
     * 
     * @param request CancelPickUpWaybillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPickUpWaybillResponse
     */
    public CancelPickUpWaybillResponse cancelPickUpWaybillWithOptions(CancelPickUpWaybillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cancelDesc)) {
            query.put("CancelDesc", request.cancelDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderCode)) {
            query.put("OuterOrderCode", request.outerOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPickUpWaybill"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPickUpWaybillResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a door-to-door delivery order.</p>
     * 
     * @param request CancelPickUpWaybillRequest
     * @return CancelPickUpWaybillResponse
     */
    public CancelPickUpWaybillResponse cancelPickUpWaybill(CancelPickUpWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPickUpWaybillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an X number to independently manage communication features such as voice calls and enterprise business cards for a work number.</p>
     * 
     * @param tmpReq ConfigXRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigXResponse
     */
    public ConfigXResponse configXWithOptions(ConfigXRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigXShrinkRequest request = new ConfigXShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sequenceCalls)) {
            request.sequenceCallsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sequenceCalls, "SequenceCalls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callAbility)) {
            query.put("CallAbility", request.callAbility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GNFlag)) {
            query.put("GNFlag", request.GNFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceCallsShrink)) {
            query.put("SequenceCalls", request.sequenceCallsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceMode)) {
            query.put("SequenceMode", request.sequenceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsAbility)) {
            query.put("SmsAbility", request.smsAbility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsSignMode)) {
            query.put("SmsSignMode", request.smsSignMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigX"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigXResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an X number to independently manage communication features such as voice calls and enterprise business cards for a work number.</p>
     * 
     * @param request ConfigXRequest
     * @return ConfigXResponse
     */
    public ConfigXResponse configX(ConfigXRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configXWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the <a href="https://help.aliyun.com/document_detail/110252.htm">OperateAxgGroup</a> operation to add phone numbers to number group G.</p>
     * <blockquote>
     * <p> Up to 2,000 number groups G can be added for a single phone number pool.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates number group G.</p>
     * 
     * @param request CreateAxgGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAxgGroupResponse
     */
    public CreateAxgGroupResponse createAxgGroupWithOptions(CreateAxgGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbers)) {
            query.put("Numbers", request.numbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAxgGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAxgGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the <a href="https://help.aliyun.com/document_detail/110252.htm">OperateAxgGroup</a> operation to add phone numbers to number group G.</p>
     * <blockquote>
     * <p> Up to 2,000 number groups G can be added for a single phone number pool.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates number group G.</p>
     * 
     * @param request CreateAxgGroupRequest
     * @return CreateAxgGroupResponse
     */
    public CreateAxgGroupResponse createAxgGroup(CreateAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAxgGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you need to first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information for Number A via API</a>.</p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 50 queries per second per user. If this limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit Individual Information of a landline number A through an API.</p>
     * 
     * @param request CreateFixedNoAReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFixedNoAReportResponse
     */
    public CreateFixedNoAReportResponse createFixedNoAReportWithOptions(CreateFixedNoAReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ANoWhiteGroupId)) {
            query.put("ANoWhiteGroupId", request.ANoWhiteGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custName)) {
            query.put("CustName", request.custName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custPhoneNo)) {
            query.put("CustPhoneNo", request.custPhoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custType)) {
            query.put("CustType", request.custType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentNumber)) {
            query.put("DocumentNumber", request.documentNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            query.put("DocumentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixedLineWorkId)) {
            query.put("FixedLineWorkId", request.fixedLineWorkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixedNoA)) {
            query.put("FixedNoA", request.fixedNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardAlivePhoto)) {
            query.put("IdCardAlivePhoto", request.idCardAlivePhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardBackPhoto)) {
            query.put("IdCardBackPhoto", request.idCardBackPhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardFrontPhoto)) {
            query.put("IdCardFrontPhoto", request.idCardFrontPhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFixedNoAReport"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFixedNoAReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you need to first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information for Number A via API</a>.</p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 50 queries per second per user. If this limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit Individual Information of a landline number A through an API.</p>
     * 
     * @param request CreateFixedNoAReportRequest
     * @return CreateFixedNoAReportResponse
     */
    public CreateFixedNoAReportResponse createFixedNoAReport(CreateFixedNoAReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFixedNoAReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you must first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information of an A-number Mobile Phone Number via API</a>.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit Individual Information of an A-number mobile phone number through an API.</p>
     * 
     * @param request CreatePhoneNoAReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePhoneNoAReportResponse
     */
    public CreatePhoneNoAReportResponse createPhoneNoAReportWithOptions(CreatePhoneNoAReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ANoWhiteGroupId)) {
            query.put("ANoWhiteGroupId", request.ANoWhiteGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.custName)) {
            query.put("CustName", request.custName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentNumber)) {
            query.put("DocumentNumber", request.documentNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            query.put("DocumentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardAlivePhoto)) {
            query.put("IdCardAlivePhoto", request.idCardAlivePhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardBackPhoto)) {
            query.put("IdCardBackPhoto", request.idCardBackPhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardFrontPhoto)) {
            query.put("IdCardFrontPhoto", request.idCardFrontPhoto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePhoneNoAReport"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePhoneNoAReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you must first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information of an A-number Mobile Phone Number via API</a>.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Submit Individual Information of an A-number mobile phone number through an API.</p>
     * 
     * @param request CreatePhoneNoAReportRequest
     * @return CreatePhoneNoAReportResponse
     */
    public CreatePhoneNoAReportResponse createPhoneNoAReport(CreatePhoneNoAReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPhoneNoAReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a door-to-door pickup order.</p>
     * 
     * @param tmpReq CreatePickUpWaybillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePickUpWaybillResponse
     */
    public CreatePickUpWaybillResponse createPickUpWaybillWithOptions(CreatePickUpWaybillRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePickUpWaybillShrinkRequest request = new CreatePickUpWaybillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.consigneeAddress)) {
            request.consigneeAddressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.consigneeAddress, "ConsigneeAddress", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.goodsInfos)) {
            request.goodsInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.goodsInfos, "GoodsInfos", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sendAddress)) {
            request.sendAddressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sendAddress, "SendAddress", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appointGotEndTime)) {
            query.put("AppointGotEndTime", request.appointGotEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointGotStartTime)) {
            query.put("AppointGotStartTime", request.appointGotStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consigneeAddressShrink)) {
            query.put("ConsigneeAddress", request.consigneeAddressShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consigneeMobile)) {
            query.put("ConsigneeMobile", request.consigneeMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consigneeName)) {
            query.put("ConsigneeName", request.consigneeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consigneePhone)) {
            query.put("ConsigneePhone", request.consigneePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpCode)) {
            query.put("CpCode", request.cpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.goodsInfosShrink)) {
            query.put("GoodsInfos", request.goodsInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderChannels)) {
            query.put("OrderChannels", request.orderChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderCode)) {
            query.put("OuterOrderCode", request.outerOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendAddressShrink)) {
            query.put("SendAddress", request.sendAddressShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendMobile)) {
            query.put("SendMobile", request.sendMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendName)) {
            query.put("SendName", request.sendName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendPhone)) {
            query.put("SendPhone", request.sendPhone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePickUpWaybill"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePickUpWaybillResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a door-to-door pickup order.</p>
     * 
     * @param request CreatePickUpWaybillRequest
     * @return CreatePickUpWaybillResponse
     */
    public CreatePickUpWaybillResponse createPickUpWaybill(CreatePickUpWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPickUpWaybillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Pre-queries shipping order information before placing an order.</p>
     * 
     * @param tmpReq CreatePickUpWaybillPreQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePickUpWaybillPreQueryResponse
     */
    public CreatePickUpWaybillPreQueryResponse createPickUpWaybillPreQueryWithOptions(CreatePickUpWaybillPreQueryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePickUpWaybillPreQueryShrinkRequest request = new CreatePickUpWaybillPreQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.consigneeInfo)) {
            request.consigneeInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.consigneeInfo, "ConsigneeInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.senderInfo)) {
            request.senderInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.senderInfo, "SenderInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consigneeInfoShrink)) {
            query.put("ConsigneeInfo", request.consigneeInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpCode)) {
            query.put("CpCode", request.cpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderChannels)) {
            query.put("OrderChannels", request.orderChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderCode)) {
            query.put("OuterOrderCode", request.outerOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preWeight)) {
            query.put("PreWeight", request.preWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderInfoShrink)) {
            query.put("SenderInfo", request.senderInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePickUpWaybillPreQuery"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePickUpWaybillPreQueryResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Pre-queries shipping order information before placing an order.</p>
     * 
     * @param request CreatePickUpWaybillPreQueryRequest
     * @return CreatePickUpWaybillPreQueryResponse
     */
    public CreatePickUpWaybillPreQueryResponse createPickUpWaybillPreQuery(CreatePickUpWaybillPreQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPickUpWaybillPreQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对客提交号码迁移任务，两侧号池须为同一资质、同一场景且均为开启状态。</p>
     * 
     * @param request CreateSecretTransferRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecretTransferRecordResponse
     */
    public CreateSecretTransferRecordResponse createSecretTransferRecordWithOptions(CreateSecretTransferRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lastPartnerKey)) {
            query.put("LastPartnerKey", request.lastPartnerKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originPartnerKey)) {
            query.put("OriginPartnerKey", request.originPartnerKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecretTransferRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecretTransferRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对客提交号码迁移任务，两侧号池须为同一资质、同一场景且均为开启状态。</p>
     * 
     * @param request CreateSecretTransferRecordRequest
     * @return CreateSecretTransferRecordResponse
     */
    public CreateSecretTransferRecordResponse createSecretTransferRecord(CreateSecretTransferRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretTransferRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a text message delivery tag for scenarios where an employee sends a text message to a customer by using a work number. The client calls this operation to obtain the tag and appends it to the end of the message content. The work number platform then parses the actual called number from the tag and delivers the message to the customer.</p>
     * 
     * @param request CreateSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSignWithOptions(CreateSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNo)) {
            query.put("CalledNo", request.calledNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNo)) {
            query.put("CallingNo", request.callingNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a text message delivery tag for scenarios where an employee sends a text message to a customer by using a work number. The client calls this operation to obtain the tag and appends it to the end of the message content. The work number platform then parses the actual called number from the tag and delivers the message to the customer.</p>
     * 
     * @param request CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSign(CreateSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After unbinding a fixed-line AXB privacy number from an existing binding, your business continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, you must unbind the number first.</li>
     * <li>Unbinding a fixed-line AXB privacy number is supported only through this API. Unbinding through the console is currently not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbind a fixed-line AXB privacy number.</p>
     * 
     * @param request DeleteAxbBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAxbBindFixedLineResponse
     */
    public DeleteAxbBindFixedLineResponse deleteAxbBindFixedLineWithOptions(DeleteAxbBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAxbBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAxbBindFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After unbinding a fixed-line AXB privacy number from an existing binding, your business continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, you must unbind the number first.</li>
     * <li>Unbinding a fixed-line AXB privacy number is supported only through this API. Unbinding through the console is currently not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbind a fixed-line AXB privacy number.</p>
     * 
     * @param request DeleteAxbBindFixedLineRequest
     * @return DeleteAxbBindFixedLineResponse
     */
    public DeleteAxbBindFixedLineResponse deleteAxbBindFixedLine(DeleteAxbBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAxbBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleted G groups cannot be recovered. Proceed with caution.</li>
     * <li>Before calling this operation, verify the G group to be deleted and the Number Pool it belongs to.</li>
     * <li>You cannot delete a G group that has active bindings. Before you delete the group, you must unbind the associated AXG privacy number. To do this, log on to the Phone Number Privacy Protection <a href="https://dyplsnext.console.aliyun.com/number/list">Console</a>, go to the <strong>Number Management</strong> page, filter by <strong>AXG privacy number</strong>, and click <strong>Details</strong> &gt; Unbind. Alternatively, you can call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-unbindsubscription">UnbindSubscription</a> API to unbind the number.</li>
     * <li>When you delete a G group, all phone numbers in the group are also deleted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5,000 requests per second. API calls that exceed this limit are subject to throttling. Plan your API calls accordingly to prevent disruptions to your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a G group. G groups are supported only in Number Pools designated for the AXG privacy number type.</p>
     * 
     * @param request DeleteAxgGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAxgGroupResponse
     */
    public DeleteAxgGroupResponse deleteAxgGroupWithOptions(DeleteAxgGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAxgGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAxgGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleted G groups cannot be recovered. Proceed with caution.</li>
     * <li>Before calling this operation, verify the G group to be deleted and the Number Pool it belongs to.</li>
     * <li>You cannot delete a G group that has active bindings. Before you delete the group, you must unbind the associated AXG privacy number. To do this, log on to the Phone Number Privacy Protection <a href="https://dyplsnext.console.aliyun.com/number/list">Console</a>, go to the <strong>Number Management</strong> page, filter by <strong>AXG privacy number</strong>, and click <strong>Details</strong> &gt; Unbind. Alternatively, you can call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-unbindsubscription">UnbindSubscription</a> API to unbind the number.</li>
     * <li>When you delete a G group, all phone numbers in the group are also deleted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5,000 requests per second. API calls that exceed this limit are subject to throttling. Plan your API calls accordingly to prevent disruptions to your business.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a G group. G groups are supported only in Number Pools designated for the AXG privacy number type.</p>
     * 
     * @param request DeleteAxgGroupRequest
     * @return DeleteAxgGroupResponse
     */
    public DeleteAxgGroupResponse deleteAxgGroup(DeleteAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAxgGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you unbind an existing fixed-line AXN private number binding relationship, your service continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, unbind the number binding relationship.</li>
     * <li>Unbinding a fixed-line AXN private number binding relationship is supported only through this API operation. The console does not support this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a fixed-line AXN private number binding relationship.</p>
     * 
     * @param request DeleteAxnBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAxnBindFixedLineResponse
     */
    public DeleteAxnBindFixedLineResponse deleteAxnBindFixedLineWithOptions(DeleteAxnBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAxnBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAxnBindFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you unbind an existing fixed-line AXN private number binding relationship, your service continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, unbind the number binding relationship.</li>
     * <li>Unbinding a fixed-line AXN private number binding relationship is supported only through this API operation. The console does not support this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a fixed-line AXN private number binding relationship.</p>
     * 
     * @param request DeleteAxnBindFixedLineRequest
     * @return DeleteAxnBindFixedLineResponse
     */
    public DeleteAxnBindFixedLineResponse deleteAxnBindFixedLine(DeleteAxnBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAxnBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind a fixed-line AXN extension number binding.</p>
     * 
     * @param request DeleteAxnExtensionBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAxnExtensionBindFixedLineResponse
     */
    public DeleteAxnExtensionBindFixedLineResponse deleteAxnExtensionBindFixedLineWithOptions(DeleteAxnExtensionBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAxnExtensionBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAxnExtensionBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind a fixed-line AXN extension number binding.</p>
     * 
     * @param request DeleteAxnExtensionBindFixedLineRequest
     * @return DeleteAxnExtensionBindFixedLineResponse
     */
    public DeleteAxnExtensionBindFixedLineResponse deleteAxnExtensionBindFixedLine(DeleteAxnExtensionBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAxnExtensionBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API can only delete A-number filing records whose filing status is either &quot;Reviewed and Passed&quot; or &quot;Review Failed.&quot; It does not support deleting A-number filing records with a filing status of &quot;Under Review.&quot;</li>
     * <li>After deleting an A-number filing record, the carrier will immediately impose call restrictions or deactivate the number, which may impact your business continuity. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete A-number filing data.</p>
     * 
     * @param request DeleteSecretAPhoneNoToCustRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecretAPhoneNoToCustResponse
     */
    public DeleteSecretAPhoneNoToCustResponse deleteSecretAPhoneNoToCustWithOptions(DeleteSecretAPhoneNoToCustRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ANoWhiteGroupId)) {
            query.put("ANoWhiteGroupId", request.ANoWhiteGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecretAPhoneNoToCust"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretAPhoneNoToCustResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API can only delete A-number filing records whose filing status is either &quot;Reviewed and Passed&quot; or &quot;Review Failed.&quot; It does not support deleting A-number filing records with a filing status of &quot;Under Review.&quot;</li>
     * <li>After deleting an A-number filing record, the carrier will immediately impose call restrictions or deactivate the number, which may impact your business continuity. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete A-number filing data.</p>
     * 
     * @param request DeleteSecretAPhoneNoToCustRequest
     * @return DeleteSecretAPhoneNoToCustResponse
     */
    public DeleteSecretAPhoneNoToCustResponse deleteSecretAPhoneNoToCust(DeleteSecretAPhoneNoToCustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretAPhoneNoToCustWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. It supports deleting only one pair of point-to-point blacklist numbers or one number pool blacklist number at a time.</li>
     * <li>To add a blacklist, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-addsecretblacklist">AddSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the blacklist of a number pool. Only number pools of the AXN privacy number, AXN extension number, and 95AXN privacy number types support blacklists.</p>
     * 
     * @param request DeleteSecretBlacklistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecretBlacklistResponse
     */
    public DeleteSecretBlacklistResponse deleteSecretBlacklistWithOptions(DeleteSecretBlacklistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackNo)) {
            query.put("BlackNo", request.blackNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blackType)) {
            query.put("BlackType", request.blackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wayControl)) {
            query.put("WayControl", request.wayControl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecretBlacklist"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretBlacklistResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. It supports deleting only one pair of point-to-point blacklist numbers or one number pool blacklist number at a time.</li>
     * <li>To add a blacklist, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-addsecretblacklist">AddSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the blacklist of a number pool. Only number pools of the AXN privacy number, AXN extension number, and 95AXN privacy number types support blacklists.</p>
     * 
     * @param request DeleteSecretBlacklistRequest
     * @return DeleteSecretBlacklistResponse
     */
    public DeleteSecretBlacklistResponse deleteSecretBlacklist(DeleteSecretBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretBlacklistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When uploading personal filing photos for an A-number mobile phone number, you must upload a clear frontal portrait photo with the face unobscured, and optionally select to upload photos of both sides of your ID card. Uploading these photos helps reviewers understand your personal identity information. Supported formats are PNG, JPG, and JPEG. The image size must not exceed 2 MB.</li>
     * <li>For the specific operation flow when submitting personal real-name filing for an A-number mobile phone number through the API, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Personal Real-Name Information for an A-Number Mobile Phone Number via API</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain OSS resource configuration information. This configuration information will be used for subsequent OSS image upload operations.</p>
     * 
     * @param request GetDyplsOSSInfoForUploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDyplsOSSInfoForUploadFileResponse
     */
    public GetDyplsOSSInfoForUploadFileResponse getDyplsOSSInfoForUploadFileWithOptions(GetDyplsOSSInfoForUploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDyplsOSSInfoForUploadFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDyplsOSSInfoForUploadFileResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When uploading personal filing photos for an A-number mobile phone number, you must upload a clear frontal portrait photo with the face unobscured, and optionally select to upload photos of both sides of your ID card. Uploading these photos helps reviewers understand your personal identity information. Supported formats are PNG, JPG, and JPEG. The image size must not exceed 2 MB.</li>
     * <li>For the specific operation flow when submitting personal real-name filing for an A-number mobile phone number through the API, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Personal Real-Name Information for an A-Number Mobile Phone Number via API</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain OSS resource configuration information. This configuration information will be used for subsequent OSS image upload operations.</p>
     * 
     * @param request GetDyplsOSSInfoForUploadFileRequest
     * @return GetDyplsOSSInfoForUploadFileResponse
     */
    public GetDyplsOSSInfoForUploadFileResponse getDyplsOSSInfoForUploadFile(GetDyplsOSSInfoForUploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDyplsOSSInfoForUploadFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the <a href="https://help.aliyun.com/document_detail/400483.html">BindAxn operation</a>. This ensures that you can obtain the ASR result properly.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of the automatic speech recognition (ASR) result.</p>
     * 
     * @param request GetSecretAsrDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretAsrDetailResponse
     */
    public GetSecretAsrDetailResponse getSecretAsrDetailWithOptions(GetSecretAsrDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTime)) {
            query.put("CallTime", request.callTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretAsrDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretAsrDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the <a href="https://help.aliyun.com/document_detail/400483.html">BindAxn operation</a>. This ensures that you can obtain the ASR result properly.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the details of the automatic speech recognition (ASR) result.</p>
     * 
     * @param request GetSecretAsrDetailRequest
     * @return GetSecretAsrDetailResponse
     */
    public GetSecretAsrDetailResponse getSecretAsrDetail(GetSecretAsrDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretAsrDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the download URL of a recorded ringing tone.</p>
     * 
     * @param request GetTotalPublicUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTotalPublicUrlResponse
     */
    public GetTotalPublicUrlResponse getTotalPublicUrlWithOptions(GetTotalPublicUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTime)) {
            query.put("CallTime", request.callTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkSubs)) {
            query.put("CheckSubs", request.checkSubs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerKey)) {
            query.put("PartnerKey", request.partnerKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTotalPublicUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTotalPublicUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the download URL of a recorded ringing tone.</p>
     * 
     * @param request GetTotalPublicUrlRequest
     * @return GetTotalPublicUrlResponse
     */
    public GetTotalPublicUrlResponse getTotalPublicUrl(GetTotalPublicUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTotalPublicUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration information of the X number.</p>
     * 
     * @param request GetXConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetXConfigResponse
     */
    public GetXConfigResponse getXConfigWithOptions(GetXConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetXConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetXConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration information of the X number.</p>
     * 
     * @param request GetXConfigRequest
     * @return GetXConfigResponse
     */
    public GetXConfigResponse getXConfig(GetXConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getXConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the default configurations of an X number.</p>
     * 
     * @param request GetXDefaultConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetXDefaultConfigResponse
     */
    public GetXDefaultConfigResponse getXDefaultConfigWithOptions(GetXDefaultConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetXDefaultConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetXDefaultConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the default configurations of an X number.</p>
     * 
     * @param request GetXDefaultConfigRequest
     * @return GetXDefaultConfigResponse
     */
    public GetXDefaultConfigResponse getXDefaultConfig(GetXDefaultConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getXDefaultConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of X numbers under a customer account.</p>
     * 
     * @param request ListXTelephonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListXTelephonesResponse
     */
    public ListXTelephonesResponse listXTelephonesWithOptions(ListXTelephonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListXTelephones"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListXTelephonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of X numbers under a customer account.</p>
     * 
     * @param request ListXTelephonesRequest
     * @return ListXTelephonesResponse
     */
    public ListXTelephonesResponse listXTelephones(ListXTelephonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listXTelephonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a phone number.</p>
     * 
     * @param request LockSecretNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockSecretNoResponse
     */
    public LockSecretNoResponse lockSecretNoWithOptions(LockSecretNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockSecretNoResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a phone number.</p>
     * 
     * @param request LockSecretNoRequest
     * @return LockSecretNoResponse
     */
    public LockSecretNoResponse lockSecretNo(LockSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockSecretNoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies number group G.</p>
     * 
     * @param request OperateAxgGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAxgGroupResponse
     */
    public OperateAxgGroupResponse operateAxgGroupWithOptions(OperateAxgGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numbers)) {
            query.put("Numbers", request.numbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAxgGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAxgGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies number group G.</p>
     * 
     * @param request OperateAxgGroupRequest
     * @return OperateAxgGroupResponse
     */
    public OperateAxgGroupResponse operateAxgGroup(OperateAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAxgGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to a blacklist or deletes a phone number from a blacklist.</p>
     * 
     * @param request OperateBlackNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateBlackNoResponse
     */
    public OperateBlackNoResponse operateBlackNoWithOptions(OperateBlackNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blackNo)) {
            query.put("BlackNo", request.blackNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tips)) {
            query.put("Tips", request.tips);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateBlackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateBlackNoResponse());
    }

    /**
     * <b>description</b> :
     * <p>The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a phone number to a blacklist or deletes a phone number from a blacklist.</p>
     * 
     * @param request OperateBlackNoRequest
     * @return OperateBlackNoResponse
     */
    public OperateBlackNoResponse operateBlackNo(OperateBlackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateBlackNoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of an AXB landline privacy number.</p>
     * 
     * @param request QueryAxbBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAxbBindFixedLineResponse
     */
    public QueryAxbBindFixedLineResponse queryAxbBindFixedLineWithOptions(QueryAxbBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAxbBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAxbBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of an AXB landline privacy number.</p>
     * 
     * @param request QueryAxbBindFixedLineRequest
     * @return QueryAxbBindFixedLineResponse
     */
    public QueryAxbBindFixedLineResponse queryAxbBindFixedLine(QueryAxbBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAxbBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of an AXN landline privacy number.</p>
     * 
     * @param request QueryAxnBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAxnBindFixedLineResponse
     */
    public QueryAxnBindFixedLineResponse queryAxnBindFixedLineWithOptions(QueryAxnBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAxnBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAxnBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of an AXN landline privacy number.</p>
     * 
     * @param request QueryAxnBindFixedLineRequest
     * @return QueryAxnBindFixedLineResponse
     */
    public QueryAxnBindFixedLineResponse queryAxnBindFixedLine(QueryAxnBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAxnBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of a landline AXN extension number.</p>
     * 
     * @param request QueryAxnExtensionBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAxnExtensionBindFixedLineResponse
     */
    public QueryAxnExtensionBindFixedLineResponse queryAxnExtensionBindFixedLineWithOptions(QueryAxnExtensionBindFixedLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAxnExtensionBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAxnExtensionBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the binding information of a landline AXN extension number.</p>
     * 
     * @param request QueryAxnExtensionBindFixedLineRequest
     * @return QueryAxnExtensionBindFixedLineResponse
     */
    public QueryAxnExtensionBindFixedLineResponse queryAxnExtensionBindFixedLine(QueryAxnExtensionBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAxnExtensionBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a tracking number.</p>
     * 
     * @param request QueryPhoneNoAByTrackNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPhoneNoAByTrackNoResponse
     */
    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNoWithOptions(QueryPhoneNoAByTrackNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cabinetNo)) {
            query.put("CabinetNo", request.cabinetNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trackNo)) {
            query.put("trackNo", request.trackNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPhoneNoAByTrackNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPhoneNoAByTrackNoResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a tracking number.</p>
     * 
     * @param request QueryPhoneNoAByTrackNoRequest
     * @return QueryPhoneNoAByTrackNoResponse
     */
    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneNoAByTrackNoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.</p>
     * <blockquote>
     * <p> We recommend that you subscribe to <a href="https://help.aliyun.com/document_detail/109198.html">the recording status report SecretRecording</a>. The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.</p>
     * </blockquote>
     * <h3><a href="#"></a>Procedure for obtaining a recording file</h3>
     * <ol>
     * <li>Specify the request parameter in an update or binding operation to enable the recording feature.</li>
     * <li>Subscribe to recording message receipts in the Phone Number Protection console.</li>
     * <li>After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.<blockquote>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.</li>
     * <li>The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the download URL of a recording file.</p>
     * 
     * @param request QueryRecordFileDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRecordFileDownloadUrlResponse
     */
    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrlWithOptions(QueryRecordFileDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callTime)) {
            query.put("CallTime", request.callTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRecordFileDownloadUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRecordFileDownloadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.</p>
     * <blockquote>
     * <p> We recommend that you subscribe to <a href="https://help.aliyun.com/document_detail/109198.html">the recording status report SecretRecording</a>. The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.</p>
     * </blockquote>
     * <h3><a href="#"></a>Procedure for obtaining a recording file</h3>
     * <ol>
     * <li>Specify the request parameter in an update or binding operation to enable the recording feature.</li>
     * <li>Subscribe to recording message receipts in the Phone Number Protection console.</li>
     * <li>After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.<blockquote>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.</li>
     * <li>The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the download URL of a recording file.</p>
     * 
     * @param request QueryRecordFileDownloadUrlRequest
     * @return QueryRecordFileDownloadUrlResponse
     */
    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordFileDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke this API to query the reporting status of an A number, you must first submit the real-name information for the mobile or landline A number by calling the <a href="https://help.aliyun.com/document_detail/2880908.html">CreatePhoneNoAReport</a> or <a href="https://help.aliyun.com/document_detail/2881429.html">CreateFixedNoAReport</a> API. For detailed instructions, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit real-name information for an A number via API</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the reporting status of an A number.</p>
     * 
     * @param request QuerySecretAPhoneNoToCustRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecretAPhoneNoToCustResponse
     */
    public QuerySecretAPhoneNoToCustResponse querySecretAPhoneNoToCustWithOptions(QuerySecretAPhoneNoToCustRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ANoWhiteGroupId)) {
            query.put("ANoWhiteGroupId", request.ANoWhiteGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretAPhoneNoToCust"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretAPhoneNoToCustResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke this API to query the reporting status of an A number, you must first submit the real-name information for the mobile or landline A number by calling the <a href="https://help.aliyun.com/document_detail/2880908.html">CreatePhoneNoAReport</a> or <a href="https://help.aliyun.com/document_detail/2881429.html">CreateFixedNoAReport</a> API. For detailed instructions, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit real-name information for an A number via API</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the reporting status of an A number.</p>
     * 
     * @param request QuerySecretAPhoneNoToCustRequest
     * @return QuerySecretAPhoneNoToCustResponse
     */
    public QuerySecretAPhoneNoToCustResponse querySecretAPhoneNoToCust(QuerySecretAPhoneNoToCustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretAPhoneNoToCustWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can query information about a private number (X number), including the purchase time, carrier, province, city, and status.</li>
     * <li>Before you call this operation, make sure that you have the private number (X number) that you want to query.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 1,000 calls per second. If the limit is exceeded, the API call is throttled. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the property information of a private number.</p>
     * 
     * @param request QuerySecretNoDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecretNoDetailResponse
     */
    public QuerySecretNoDetailResponse querySecretNoDetailWithOptions(QuerySecretNoDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretNoDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretNoDetailResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can query information about a private number (X number), including the purchase time, carrier, province, city, and status.</li>
     * <li>Before you call this operation, make sure that you have the private number (X number) that you want to query.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 1,000 calls per second. If the limit is exceeded, the API call is throttled. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the property information of a private number.</p>
     * 
     * @param request QuerySecretNoDetailRequest
     * @return QuerySecretNoDetailResponse
     */
    public QuerySecretNoDetailResponse querySecretNoDetail(QuerySecretNoDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretNoDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the <a href="~~BuySecretNo~~">BuySecretNo</a> operation to purchase a phone number, call the <a href="~~QuerySecretNoRemain~~">QuerySecretNoRemain</a> operation to query the quantity of remaining phone numbers available for online purchase.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quantity of remaining phone numbers available for online purchase.</p>
     * 
     * @param request QuerySecretNoRemainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecretNoRemainResponse
     */
    public QuerySecretNoRemainResponse querySecretNoRemainWithOptions(QuerySecretNoRemainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretNoRemain"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretNoRemainResponse());
    }

    /**
     * <b>description</b> :
     * <p>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the <a href="~~BuySecretNo~~">BuySecretNo</a> operation to purchase a phone number, call the <a href="~~QuerySecretNoRemain~~">QuerySecretNoRemain</a> operation to query the quantity of remaining phone numbers available for online purchase.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quantity of remaining phone numbers available for online purchase.</p>
     * 
     * @param request QuerySecretNoRemainRequest
     * @return QuerySecretNoRemainResponse
     */
    public QuerySecretNoRemainResponse querySecretNoRemain(QuerySecretNoRemainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretNoRemainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>对客分页查询指定迁移记录的明细，记录的来源与目标号池须均归属 aliUid。</p>
     * 
     * @param request QuerySecretTransferDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecretTransferDetailsResponse
     */
    public QuerySecretTransferDetailsResponse querySecretTransferDetailsWithOptions(QuerySecretTransferDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecretTransferDetails"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecretTransferDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对客分页查询指定迁移记录的明细，记录的来源与目标号池须均归属 aliUid。</p>
     * 
     * @param request QuerySecretTransferDetailsRequest
     * @return QuerySecretTransferDetailsResponse
     */
    public QuerySecretTransferDetailsResponse querySecretTransferDetails(QuerySecretTransferDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretTransferDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the downloadable URL of a call recording by call ID.</p>
     * 
     * @param request QuerySoundRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySoundRecordResponse
     */
    public QuerySoundRecordResponse querySoundRecordWithOptions(QuerySoundRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySoundRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySoundRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the downloadable URL of a call recording by call ID.</p>
     * 
     * @param request QuerySoundRecordRequest
     * @return QuerySoundRecordResponse
     */
    public QuerySoundRecordResponse querySoundRecord(QuerySoundRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySoundRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries binding IDs.</p>
     * 
     * @param request QuerySubsIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySubsIdResponse
     */
    public QuerySubsIdResponse querySubsIdWithOptions(QuerySubsIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySubsId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySubsIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries binding IDs.</p>
     * 
     * @param request QuerySubsIdRequest
     * @return QuerySubsIdResponse
     */
    public QuerySubsIdResponse querySubsId(QuerySubsIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySubsIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the private number (X number) to query and that the number has a binding relationship.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * <h3>PoolKey and ProductType limit</h3>
     * <p>Specify at least one of the PoolKey and ProductType parameters. If neither parameter is specified, an error is returned.
     * Former Alibaba Dayu users should specify the ProductType parameter, and Alibaba Cloud users should specify the PoolKey parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding details of a phone number. Retrieves information such as the binding relationship status, extension number, recording status, and ASR status.</p>
     * 
     * @param request QuerySubscriptionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySubscriptionDetailResponse
     */
    public QuerySubscriptionDetailResponse querySubscriptionDetailWithOptions(QuerySubscriptionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySubscriptionDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySubscriptionDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the private number (X number) to query and that the number has a binding relationship.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * <h3>PoolKey and ProductType limit</h3>
     * <p>Specify at least one of the PoolKey and ProductType parameters. If neither parameter is specified, an error is returned.
     * Former Alibaba Dayu users should specify the ProductType parameter, and Alibaba Cloud users should specify the PoolKey parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the binding details of a phone number. Retrieves information such as the binding relationship status, extension number, recording status, and ASR status.</p>
     * 
     * @param request QuerySubscriptionDetailRequest
     * @return QuerySubscriptionDetailResponse
     */
    public QuerySubscriptionDetailResponse querySubscriptionDetail(QuerySubscriptionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySubscriptionDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After a phone number is released, it will no longer be charged from the following month.</p>
     * <ul>
     * <li>Before you release a phone number, log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a phone number.</p>
     * 
     * @param request ReleaseSecretNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseSecretNoResponse
     */
    public ReleaseSecretNoResponse releaseSecretNoWithOptions(ReleaseSecretNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseSecretNoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After a phone number is released, it will no longer be charged from the following month.</p>
     * <ul>
     * <li>Before you release a phone number, log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a phone number.</p>
     * 
     * @param request ReleaseSecretNoRequest
     * @return ReleaseSecretNoResponse
     */
    public ReleaseSecretNoResponse releaseSecretNo(ReleaseSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseSecretNoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a specified call binding relationship (A, X, and B). After the call binding relationship is dissociated, Employee B cannot call Customer A through Work Number X.</p>
     * 
     * @param request UnBindAXBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnBindAXBResponse
     */
    public UnBindAXBResponse unBindAXBWithOptions(UnBindAXBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindId)) {
            query.put("BindId", request.bindId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnBindAXB"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnBindAXBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a specified call binding relationship (A, X, and B). After the call binding relationship is dissociated, Employee B cannot call Customer A through Work Number X.</p>
     * 
     * @param request UnBindAXBRequest
     * @return UnBindAXBResponse
     */
    public UnBindAXBResponse unBindAXB(UnBindAXBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unBindAXBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the binding between work number X and employee number B. After the binding is canceled, calls to X are no longer forwarded to B.</p>
     * 
     * @param request UnBindXBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnBindXBResponse
     */
    public UnBindXBResponse unBindXBWithOptions(UnBindXBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            query.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerPoolKey)) {
            query.put("CustomerPoolKey", request.customerPoolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqId)) {
            query.put("ReqId", request.reqId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnBindXB"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnBindXBResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the binding between work number X and employee number B. After the binding is canceled, calls to X are no longer forwarded to B.</p>
     * 
     * @param request UnBindXBRequest
     * @return UnBindXBResponse
     */
    public UnBindXBResponse unBindXB(UnBindXBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unBindXBWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a 700 number.</p>
     * 
     * @param request UnbindSubs700Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindSubs700Response
     */
    public UnbindSubs700Response unbindSubs700WithOptions(UnbindSubs700Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.industrialId)) {
            query.put("IndustrialId", request.industrialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSubs700"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSubs700Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a 700 number.</p>
     * 
     * @param request UnbindSubs700Request
     * @return UnbindSubs700Response
     */
    public UnbindSubs700Response unbindSubs700(UnbindSubs700Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSubs700WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a phone number.</p>
     * 
     * @param request UnbindSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindSubscriptionResponse
     */
    public UnbindSubscriptionResponse unbindSubscriptionWithOptions(UnbindSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSubscription"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a phone number.</p>
     * 
     * @param request UnbindSubscriptionRequest
     * @return UnbindSubscriptionResponse
     */
    public UnbindSubscriptionResponse unbindSubscription(UnbindSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks a phone number.</p>
     * 
     * @param request UnlockSecretNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockSecretNoResponse
     */
    public UnlockSecretNoResponse unlockSecretNoWithOptions(UnlockSecretNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretNo)) {
            query.put("SecretNo", request.secretNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockSecretNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockSecretNoResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks a phone number.</p>
     * 
     * @param request UnlockSecretNoRequest
     * @return UnlockSecretNoResponse
     */
    public UnlockSecretNoResponse unlockSecretNo(UnlockSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockSecretNoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you update an AXB privacy number for landlines, you cannot modify Number A and Number B at the same time. For example, if the original binding relationship is A1 and B1, you can change it to A1 and B2, or A2 and B1.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the binding information of an AXB privacy number for landlines.</p>
     * 
     * @param tmpReq UpdateAxbBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAxbBindFixedLineResponse
     */
    public UpdateAxbBindFixedLineResponse updateAxbBindFixedLineWithOptions(UpdateAxbBindFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAxbBindFixedLineShrinkRequest request = new UpdateAxbBindFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAxbBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAxbBindFixedLineResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you update an AXB privacy number for landlines, you cannot modify Number A and Number B at the same time. For example, if the original binding relationship is A1 and B1, you can change it to A1 and B2, or A2 and B1.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the binding information of an AXB privacy number for landlines.</p>
     * 
     * @param request UpdateAxbBindFixedLineRequest
     * @return UpdateAxbBindFixedLineResponse
     */
    public UpdateAxbBindFixedLineResponse updateAxbBindFixedLine(UpdateAxbBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAxbBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the binding information of a landline AXN privacy number.</p>
     * 
     * @param tmpReq UpdateAxnBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAxnBindFixedLineResponse
     */
    public UpdateAxnBindFixedLineResponse updateAxnBindFixedLineWithOptions(UpdateAxnBindFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAxnBindFixedLineShrinkRequest request = new UpdateAxnBindFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            query.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAxnBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAxnBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the binding information of a landline AXN privacy number.</p>
     * 
     * @param request UpdateAxnBindFixedLineRequest
     * @return UpdateAxnBindFixedLineResponse
     */
    public UpdateAxnBindFixedLineResponse updateAxnBindFixedLine(UpdateAxnBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAxnBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the binding relationship of a landline AXN extension number.</p>
     * 
     * @param tmpReq UpdateAxnExtensionBindFixedLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAxnExtensionBindFixedLineResponse
     */
    public UpdateAxnExtensionBindFixedLineResponse updateAxnExtensionBindFixedLineWithOptions(UpdateAxnExtensionBindFixedLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAxnExtensionBindFixedLineShrinkRequest request = new UpdateAxnExtensionBindFixedLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraaxx)) {
            request.extraaxxShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraaxx, "Extraaxx", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.anucode)) {
            query.put("Anucode", request.anucode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.anucodecalled)) {
            query.put("Anucodecalled", request.anucodecalled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraaxxShrink)) {
            query.put("Extraaxx", request.extraaxxShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subts)) {
            query.put("Subts", request.subts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TAnucodeConnect)) {
            query.put("TAnucodeConnect", request.TAnucodeConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ts)) {
            query.put("Ts", request.ts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAxnExtensionBindFixedLine"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAxnExtensionBindFixedLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the binding relationship of a landline AXN extension number.</p>
     * 
     * @param request UpdateAxnExtensionBindFixedLineRequest
     * @return UpdateAxnExtensionBindFixedLineResponse
     */
    public UpdateAxnExtensionBindFixedLineResponse updateAxnExtensionBindFixedLine(UpdateAxnExtensionBindFixedLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAxnExtensionBindFixedLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the binding relationship of a 700 number.</p>
     * 
     * @param request UpdateSubs700Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubs700Response
     */
    public UpdateSubs700Response updateSubs700WithOptions(UpdateSubs700Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultA)) {
            query.put("DefaultA", request.defaultA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industrialId)) {
            query.put("IndustrialId", request.industrialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needAsr)) {
            query.put("NeedAsr", request.needAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRecord)) {
            query.put("NeedRecord", request.needRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telA)) {
            query.put("TelA", request.telA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telB)) {
            query.put("TelB", request.telB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telX)) {
            query.put("TelX", request.telX);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubs700"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubs700Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the binding relationship of a 700 number.</p>
     * 
     * @param request UpdateSubs700Request
     * @return UpdateSubs700Response
     */
    public UpdateSubs700Response updateSubs700(UpdateSubs700Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubs700WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a phone number binding.</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ASRModelId)) {
            query.put("ASRModelId", request.ASRModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ASRStatus)) {
            query.put("ASRStatus", request.ASRStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callDisplayType)) {
            query.put("CallDisplayType", request.callDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRestrict)) {
            query.put("CallRestrict", request.callRestrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecordingEnabled)) {
            query.put("IsRecordingEnabled", request.isRecordingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoA)) {
            query.put("PhoneNoA", request.phoneNoA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoB)) {
            query.put("PhoneNoB", request.phoneNoB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNoX)) {
            query.put("PhoneNoX", request.phoneNoX);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolKey)) {
            query.put("PoolKey", request.poolKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ringConfig)) {
            query.put("RingConfig", request.ringConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subsId)) {
            query.put("SubsId", request.subsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a phone number binding.</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }
}
