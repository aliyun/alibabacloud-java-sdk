// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyplsapi20170525.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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
     * @summary Adds a tracking number for a private number in the AXN binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds a tracking number for a private number in the AXN binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request AddAxnTrackNoRequest
     * @return AddAxnTrackNoResponse
     */
    public AddAxnTrackNoResponse addAxnTrackNo(AddAxnTrackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAxnTrackNoWithOptions(request, runtime);
    }

    /**
     * @summary Adds a blacklist.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds a blacklist.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request AddSecretBlacklistRequest
     * @return AddSecretBlacklistResponse
     */
    public AddSecretBlacklistResponse addSecretBlacklist(AddSecretBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSecretBlacklistWithOptions(request, runtime);
    }

    /**
     * @summary Adds an AXB binding.
     *
     * @description Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds an AXB binding.
     *
     * @description Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request BindAxbRequest
     * @return BindAxbResponse
     */
    public BindAxbResponse bindAxb(BindAxbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxbWithOptions(request, runtime);
    }

    /**
     * @summary Adds an AXG binding.
     *
     * @description An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds an AXG binding.
     *
     * @description An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request BindAxgRequest
     * @return BindAxgResponse
     */
    public BindAxgResponse bindAxg(BindAxgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxgWithOptions(request, runtime);
    }

    /**
     * @summary Adds an AXN binding.
     *
     * @description >  An AXN private number is a dedicated private number assigned to phone number A. When an N-side number is used to call phone number X, the call is forwarded to phone number A.
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
     * @summary Adds an AXN binding.
     *
     * @description >  An AXN private number is a dedicated private number assigned to phone number A. When an N-side number is used to call phone number X, the call is forwarded to phone number A.
     *
     * @param request BindAxnRequest
     * @return BindAxnResponse
     */
    public BindAxnResponse bindAxn(BindAxnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnWithOptions(request, runtime);
    }

    /**
     * @summary Adds an AXN extension binding.
     *
     * @description Before you add an AXN extension binding, confirm phone number A and phone number N in the business scenario. Phone number A belongs to a customer, and phone number X is the private number assigned to the customer. When any other phone number is used to call phone number X and the extension, the call is transferred to phone number A. When phone number A is used to call phone number X, the call is transferred to the default phone number B that is specified during the phone number binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds an AXN extension binding.
     *
     * @description Before you add an AXN extension binding, confirm phone number A and phone number N in the business scenario. Phone number A belongs to a customer, and phone number X is the private number assigned to the customer. When any other phone number is used to call phone number X and the extension, the call is transferred to phone number A. When phone number A is used to call phone number X, the call is transferred to the default phone number B that is specified during the phone number binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request BindAxnExtensionRequest
     * @return BindAxnExtensionResponse
     */
    public BindAxnExtensionResponse bindAxnExtension(BindAxnExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAxnExtensionWithOptions(request, runtime);
    }

    /**
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
     * @param request BindBatchAxgRequest
     * @return BindBatchAxgResponse
     */
    public BindBatchAxgResponse bindBatchAxg(BindBatchAxgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindBatchAxgWithOptions(request, runtime);
    }

    /**
     * @summary Purchases a phone number.
     *
     * @description *   After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.
     * *   Before you call this operation, make sure that you are familiar with the [pricing](https://help.aliyun.com/document_detail/59825.html) of Phone Number Protection.
     * *   When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the [QuerySecretNoRemain](https://help.aliyun.com/document_detail/111699.html) operation.
     * *   The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see [Enterprise verification FAQs](https://help.aliyun.com/document_detail/37172.html).
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
     * @summary Purchases a phone number.
     *
     * @description *   After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.
     * *   Before you call this operation, make sure that you are familiar with the [pricing](https://help.aliyun.com/document_detail/59825.html) of Phone Number Protection.
     * *   When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the [QuerySecretNoRemain](https://help.aliyun.com/document_detail/111699.html) operation.
     * *   The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see [Enterprise verification FAQs](https://help.aliyun.com/document_detail/37172.html).
     *
     * @param request BuySecretNoRequest
     * @return BuySecretNoResponse
     */
    public BuySecretNoResponse buySecretNo(BuySecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buySecretNoWithOptions(request, runtime);
    }

    /**
     * @summary Cancels a door-to-door delivery order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Cancels a door-to-door delivery order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request CancelPickUpWaybillRequest
     * @return CancelPickUpWaybillResponse
     */
    public CancelPickUpWaybillResponse cancelPickUpWaybill(CancelPickUpWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPickUpWaybillWithOptions(request, runtime);
    }

    /**
     * @summary Creates number group G.
     *
     * @description Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the [OperateAxgGroup](https://help.aliyun.com/document_detail/110252.htm) operation to add phone numbers to number group G.
     * >  Up to 2,000 number groups G can be added for a single phone number pool.
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
     * @summary Creates number group G.
     *
     * @description Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the [OperateAxgGroup](https://help.aliyun.com/document_detail/110252.htm) operation to add phone numbers to number group G.
     * >  Up to 2,000 number groups G can be added for a single phone number pool.
     *
     * @param request CreateAxgGroupRequest
     * @return CreateAxgGroupResponse
     */
    public CreateAxgGroupResponse createAxgGroup(CreateAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAxgGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a door-to-door delivery order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Creates a door-to-door delivery order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request CreatePickUpWaybillRequest
     * @return CreatePickUpWaybillResponse
     */
    public CreatePickUpWaybillResponse createPickUpWaybill(CreatePickUpWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPickUpWaybillWithOptions(request, runtime);
    }

    /**
     * @summary Queries a pickup order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a pickup order.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request CreatePickUpWaybillPreQueryRequest
     * @return CreatePickUpWaybillPreQueryResponse
     */
    public CreatePickUpWaybillPreQueryResponse createPickUpWaybillPreQuery(CreatePickUpWaybillPreQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPickUpWaybillPreQueryWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteAxgGroupRequest
     * @return DeleteAxgGroupResponse
     */
    public DeleteAxgGroupResponse deleteAxgGroup(DeleteAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAxgGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a blacklist.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Deletes a blacklist.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DeleteSecretBlacklistRequest
     * @return DeleteSecretBlacklistResponse
     */
    public DeleteSecretBlacklistResponse deleteSecretBlacklist(DeleteSecretBlacklistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretBlacklistWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the details of the automatic speech recognition (ASR) result.
     *
     * @description Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the [BindAxn operation](https://help.aliyun.com/document_detail/400483.html). This ensures that you can obtain the ASR result properly.
     * ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Obtains the details of the automatic speech recognition (ASR) result.
     *
     * @description Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the [BindAxn operation](https://help.aliyun.com/document_detail/400483.html). This ensures that you can obtain the ASR result properly.
     * ### [](#qps)QPS limits
     * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request GetSecretAsrDetailRequest
     * @return GetSecretAsrDetailResponse
     */
    public GetSecretAsrDetailResponse getSecretAsrDetail(GetSecretAsrDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretAsrDetailWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the download URL of a recorded ringing tone.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Obtains the download URL of a recorded ringing tone.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request GetTotalPublicUrlRequest
     * @return GetTotalPublicUrlResponse
     */
    public GetTotalPublicUrlResponse getTotalPublicUrl(GetTotalPublicUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTotalPublicUrlWithOptions(request, runtime);
    }

    /**
     * @summary Locks a phone number.
     *
     * @description After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Locks a phone number.
     *
     * @description After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request LockSecretNoRequest
     * @return LockSecretNoResponse
     */
    public LockSecretNoResponse lockSecretNo(LockSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockSecretNoWithOptions(request, runtime);
    }

    /**
     * @summary Modifies number group G.
     *
     * @description After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies number group G.
     *
     * @description After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.
     * ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request OperateAxgGroupRequest
     * @return OperateAxgGroupResponse
     */
    public OperateAxgGroupResponse operateAxgGroup(OperateAxgGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAxgGroupWithOptions(request, runtime);
    }

    /**
     * @summary Adds a phone number to a blacklist or deletes a phone number from a blacklist.
     *
     * @description The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.
     * ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Adds a phone number to a blacklist or deletes a phone number from a blacklist.
     *
     * @description The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.
     * ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request OperateBlackNoRequest
     * @return OperateBlackNoResponse
     */
    public OperateBlackNoResponse operateBlackNo(OperateBlackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateBlackNoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a tracking number.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the details about a tracking number.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request QueryPhoneNoAByTrackNoRequest
     * @return QueryPhoneNoAByTrackNoResponse
     */
    public QueryPhoneNoAByTrackNoResponse queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPhoneNoAByTrackNoWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the download URL of a recording file.
     *
     * @description If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.
     * >  We recommend that you subscribe to [the recording status report SecretRecording](https://help.aliyun.com/document_detail/109198.html). The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.
     * ### [](#)Procedure for obtaining a recording file
     * 1.  Specify the request parameter in an update or binding operation to enable the recording feature.
     * 2.  Subscribe to recording message receipts in the Phone Number Protection console.
     * 3.  After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.
     * > 
     * *   A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.
     * *   The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.
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
     * @summary Obtains the download URL of a recording file.
     *
     * @description If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.
     * >  We recommend that you subscribe to [the recording status report SecretRecording](https://help.aliyun.com/document_detail/109198.html). The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.
     * ### [](#)Procedure for obtaining a recording file
     * 1.  Specify the request parameter in an update or binding operation to enable the recording feature.
     * 2.  Subscribe to recording message receipts in the Phone Number Protection console.
     * 3.  After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.
     * > 
     * *   A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.
     * *   The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.
     *
     * @param request QueryRecordFileDownloadUrlRequest
     * @return QueryRecordFileDownloadUrlResponse
     */
    public QueryRecordFileDownloadUrlResponse queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRecordFileDownloadUrlWithOptions(request, runtime);
    }

    /**
     * @summary Queries the attributes of a private number.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the attributes of a private number.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. We recommend that you take note of the limit when you call this operation.
     *
     * @param request QuerySecretNoDetailRequest
     * @return QuerySecretNoDetailResponse
     */
    public QuerySecretNoDetailResponse querySecretNoDetail(QuerySecretNoDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretNoDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the quantity of remaining phone numbers available for online purchase.
     *
     * @description When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the [BuySecretNo](~~BuySecretNo~~) operation to purchase a phone number, call the [QuerySecretNoRemain](~~QuerySecretNoRemain~~) operation to query the quantity of remaining phone numbers available for online purchase.
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
     * @summary Queries the quantity of remaining phone numbers available for online purchase.
     *
     * @description When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the [BuySecretNo](~~BuySecretNo~~) operation to purchase a phone number, call the [QuerySecretNoRemain](~~QuerySecretNoRemain~~) operation to query the quantity of remaining phone numbers available for online purchase.
     *
     * @param request QuerySecretNoRemainRequest
     * @return QuerySecretNoRemainResponse
     */
    public QuerySecretNoRemainResponse querySecretNoRemain(QuerySecretNoRemainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecretNoRemainWithOptions(request, runtime);
    }

    /**
     * @summary Queries binding IDs.
     *
     * @description You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.
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
     * @summary Queries binding IDs.
     *
     * @description You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.
     *
     * @param request QuerySubsIdRequest
     * @return QuerySubsIdResponse
     */
    public QuerySubsIdResponse querySubsId(QuerySubsIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySubsIdWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details about a phone number binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * ### [](#poolkeyproducttype)Limits on PoolKey and ProductType
     * You must specify either PoolKey or ProductType. If both parameters are not specified, an error is reported when you call the QuerySubscriptionDetail operation. We recommend that you specify the ProductType parameter for the original key accounts of Alibaba Cloud and the PoolKey parameter for Alibaba Cloud users.
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
     * @summary Queries the details about a phone number binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * ### [](#poolkeyproducttype)Limits on PoolKey and ProductType
     * You must specify either PoolKey or ProductType. If both parameters are not specified, an error is reported when you call the QuerySubscriptionDetail operation. We recommend that you specify the ProductType parameter for the original key accounts of Alibaba Cloud and the PoolKey parameter for Alibaba Cloud users.
     *
     * @param request QuerySubscriptionDetailRequest
     * @return QuerySubscriptionDetailResponse
     */
    public QuerySubscriptionDetailResponse querySubscriptionDetail(QuerySubscriptionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySubscriptionDetailWithOptions(request, runtime);
    }

    /**
     * @summary Releases a phone number.
     *
     * @description *   After a phone number is released, it will no longer be charged from the following month.
     * *   Before you release a phone number, log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.
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
     * @summary Releases a phone number.
     *
     * @description *   After a phone number is released, it will no longer be charged from the following month.
     * *   Before you release a phone number, log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.
     *
     * @param request ReleaseSecretNoRequest
     * @return ReleaseSecretNoResponse
     */
    public ReleaseSecretNoResponse releaseSecretNo(ReleaseSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseSecretNoWithOptions(request, runtime);
    }

    /**
     * @summary Unbinds a phone number.
     *
     * @description Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.
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
     * @summary Unbinds a phone number.
     *
     * @description Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.
     *
     * @param request UnbindSubscriptionRequest
     * @return UnbindSubscriptionResponse
     */
    public UnbindSubscriptionResponse unbindSubscription(UnbindSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindSubscriptionWithOptions(request, runtime);
    }

    /**
     * @summary Unlocks a phone number.
     *
     * @description After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Unlocks a phone number.
     *
     * @description After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.
     * ### [](#qps)QPS limits
     * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request UnlockSecretNoRequest
     * @return UnlockSecretNoResponse
     */
    public UnlockSecretNoResponse unlockSecretNo(UnlockSecretNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockSecretNoWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a phone number binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies a phone number binding.
     *
     * @description ### [](#qps)QPS limits
     * You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }
}
