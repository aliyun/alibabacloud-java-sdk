// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyvmsapi20170525.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyvmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds multiple real numbers to a service instance at a time.</p>
     * 
     * @param request AddVirtualNumberRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVirtualNumberRelationResponse
     */
    public AddVirtualNumberRelationResponse addVirtualNumberRelationWithOptions(AddVirtualNumberRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpNameList)) {
            query.put("CorpNameList", request.corpNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberList)) {
            query.put("NumberList", request.numberList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            query.put("RouteType", request.routeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVirtualNumberRelation"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVirtualNumberRelationResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds multiple real numbers to a service instance at a time.</p>
     * 
     * @param request AddVirtualNumberRelationRequest
     * @return AddVirtualNumberRelationResponse
     */
    public AddVirtualNumberRelationResponse addVirtualNumberRelation(AddVirtualNumberRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVirtualNumberRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <ul>
     * <li>The BatchRobotSmartCall operation is used to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>You have passed the real-name verification for an enterprise user and passed the enterprise qualification review.</li>
     * <li>You have purchased numbers in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</li>
     * <li>You have added communication scripts on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page, and the communication scripts have been approved.<blockquote>
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.aliyun.com/price/product#/vms/detail">billing</a> of Voice Messaging Service (VMS).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates outbound robocall tasks in a batch. You can set up to 100 numbers in a task.</p>
     * 
     * @param request BatchRobotSmartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRobotSmartCallResponse
     */
    public BatchRobotSmartCallResponse batchRobotSmartCallWithOptions(BatchRobotSmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogId)) {
            query.put("DialogId", request.dialogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaAsr)) {
            query.put("EarlyMediaAsr", request.earlyMediaAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSelfLine)) {
            query.put("IsSelfLine", request.isSelfLine);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleCall)) {
            query.put("ScheduleCall", request.scheduleCall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParamHead)) {
            query.put("TtsParamHead", request.ttsParamHead);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRobotSmartCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRobotSmartCallResponse());
    }

    /**
     * <b>description</b> :
     * <p>  In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <ul>
     * <li>The BatchRobotSmartCall operation is used to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>You have passed the real-name verification for an enterprise user and passed the enterprise qualification review.</li>
     * <li>You have purchased numbers in the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/number/normal">Voice Messaging Service console</a>.</li>
     * <li>You have added communication scripts on the <a href="https://dyvms.console.aliyun.com/dyvms.htm#/smart-call/saas/robot/list">Communication script management</a> page, and the communication scripts have been approved.<blockquote>
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.aliyun.com/price/product#/vms/detail">billing</a> of Voice Messaging Service (VMS).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates outbound robocall tasks in a batch. You can set up to 100 numbers in a task.</p>
     * 
     * @param request BatchRobotSmartCallRequest
     * @return BatchRobotSmartCallResponse
     */
    public BatchRobotSmartCallResponse batchRobotSmartCall(BatchRobotSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchRobotSmartCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the two-way call that is initiated by calling the ClickToDial operation.</p>
     * 
     * @param request CancelCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCallResponse
     */
    public CancelCallResponse cancelCallWithOptions(CancelCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
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
            new TeaPair("action", "CancelCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the two-way call that is initiated by calling the ClickToDial operation.</p>
     * 
     * @param request CancelCallRequest
     * @return CancelCallResponse
     */
    public CancelCallResponse cancelCall(CancelCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a robocall task that has not been started.</p>
     * 
     * @param request CancelOrderRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderRobotTaskResponse
     */
    public CancelOrderRobotTaskResponse cancelOrderRobotTaskWithOptions(CancelOrderRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrderRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a robocall task that has not been started.</p>
     * 
     * @param request CancelOrderRobotTaskRequest
     * @return CancelOrderRobotTaskResponse
     */
    public CancelOrderRobotTaskResponse cancelOrderRobotTask(CancelOrderRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only a task in progress can be terminated by calling the CancelRobotTask operation, and the task cannot be resumed after it is terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Terminates a robocall task.</p>
     * 
     * @param request CancelRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRobotTaskResponse
     */
    public CancelRobotTaskResponse cancelRobotTaskWithOptions(CancelRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only a task in progress can be terminated by calling the CancelRobotTask operation, and the task cannot be resumed after it is terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Terminates a robocall task.</p>
     * 
     * @param request CancelRobotTaskRequest
     * @return CancelRobotTaskResponse
     */
    public CancelRobotTaskResponse cancelRobotTask(CancelRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ChangeMediaType</p>
     * 
     * @param request ChangeMediaTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeMediaTypeResponse
     */
    public ChangeMediaTypeResponse changeMediaTypeWithOptions(ChangeMediaTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNum)) {
            query.put("CalledNum", request.calledNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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
            new TeaPair("action", "ChangeMediaType"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMediaTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ChangeMediaType</p>
     * 
     * @param request ChangeMediaTypeRequest
     * @return ChangeMediaTypeResponse
     */
    public ChangeMediaTypeResponse changeMediaType(ChangeMediaTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeMediaTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席上线</p>
     * 
     * @param request CloudAgentLoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudAgentLoginResponse
     */
    public CloudAgentLoginResponse cloudAgentLoginWithOptions(CloudAgentLoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindTel)) {
            query.put("BindTel", request.bindTel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindType)) {
            query.put("BindType", request.bindType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginStatus)) {
            query.put("LoginStatus", request.loginStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseDescription)) {
            query.put("PauseDescription", request.pauseDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudAgentLogin"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudAgentLoginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席上线</p>
     * 
     * @param request CloudAgentLoginRequest
     * @return CloudAgentLoginResponse
     */
    public CloudAgentLoginResponse cloudAgentLogin(CloudAgentLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudAgentLoginWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席下线</p>
     * 
     * @param request CloudAgentLogoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudAgentLogoutResponse
     */
    public CloudAgentLogoutResponse cloudAgentLogoutWithOptions(CloudAgentLogoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreOffline)) {
            query.put("IgnoreOffline", request.ignoreOffline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isKickout)) {
            query.put("IsKickout", request.isKickout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeBinding)) {
            query.put("RemoveBinding", request.removeBinding);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudAgentLogout"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudAgentLogoutResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席下线</p>
     * 
     * @param request CloudAgentLogoutRequest
     * @return CloudAgentLogoutResponse
     */
    public CloudAgentLogoutResponse cloudAgentLogout(CloudAgentLogoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudAgentLogoutWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席设置随路数据</p>
     * 
     * @param request CloudAgentSetUserDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudAgentSetUserDataResponse
     */
    public CloudAgentSetUserDataResponse cloudAgentSetUserDataWithOptions(CloudAgentSetUserDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudAgentSetUserData"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudAgentSetUserDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席设置随路数据</p>
     * 
     * @param request CloudAgentSetUserDataRequest
     * @return CloudAgentSetUserDataResponse
     */
    public CloudAgentSetUserDataResponse cloudAgentSetUserData(CloudAgentSetUserDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudAgentSetUserDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席挂机</p>
     * 
     * @param request CloudAgentUnlinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudAgentUnlinkResponse
     */
    public CloudAgentUnlinkResponse cloudAgentUnlinkWithOptions(CloudAgentUnlinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestUniqueId)) {
            query.put("RequestUniqueId", request.requestUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.side)) {
            query.put("Side", request.side);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            query.put("UniqueId", request.uniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudAgentUnlink"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudAgentUnlinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席挂机</p>
     * 
     * @param request CloudAgentUnlinkRequest
     * @return CloudAgentUnlinkResponse
     */
    public CloudAgentUnlinkResponse cloudAgentUnlink(CloudAgentUnlinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudAgentUnlinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增座席,单次批量创建不能超过100个</p>
     * 
     * @param request CloudBatchCreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudBatchCreateAgentResponse
     */
    public CloudBatchCreateAgentResponse cloudBatchCreateAgentWithOptions(CloudBatchCreateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaCode)) {
            query.put("AreaCode", request.areaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPower)) {
            query.put("CallPower", request.callPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCno)) {
            query.put("EndCno", request.endCno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ibRecord)) {
            query.put("IbRecord", request.ibRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsr)) {
            query.put("IsAsr", request.isAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOb)) {
            query.put("IsOb", request.isOb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQualityCheck)) {
            query.put("IsQualityCheck", request.isQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClid)) {
            query.put("ObClid", request.obClid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidProperty)) {
            query.put("ObClidProperty", request.obClidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidType)) {
            query.put("ObClidType", request.obClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obRecord)) {
            query.put("ObRecord", request.obRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.power)) {
            query.put("Power", request.power);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevels)) {
            query.put("SkillLevels", request.skillLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webrtcUrlType)) {
            query.put("WebrtcUrlType", request.webrtcUrlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudBatchCreateAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudBatchCreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新增座席,单次批量创建不能超过100个</p>
     * 
     * @param request CloudBatchCreateAgentRequest
     * @return CloudBatchCreateAgentResponse
     */
    public CloudBatchCreateAgentResponse cloudBatchCreateAgent(CloudBatchCreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudBatchCreateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席实时状态批量获取</p>
     * 
     * @param request CloudBatchGetAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudBatchGetAgentStatusResponse
     */
    public CloudBatchGetAgentStatusResponse cloudBatchGetAgentStatusWithOptions(CloudBatchGetAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudBatchGetAgentStatus"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudBatchGetAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席实时状态批量获取</p>
     * 
     * @param request CloudBatchGetAgentStatusRequest
     * @return CloudBatchGetAgentStatusResponse
     */
    public CloudBatchGetAgentStatusResponse cloudBatchGetAgentStatus(CloudBatchGetAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudBatchGetAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新座席基本信息，不包含座席绑定的技能信息的更新</p>
     * 
     * @param request CloudBatchUpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudBatchUpdateAgentResponse
     */
    public CloudBatchUpdateAgentResponse cloudBatchUpdateAgentWithOptions(CloudBatchUpdateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaCode)) {
            query.put("AreaCode", request.areaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPower)) {
            query.put("CallPower", request.callPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ibRecord)) {
            query.put("IbRecord", request.ibRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsr)) {
            query.put("IsAsr", request.isAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOb)) {
            query.put("IsOb", request.isOb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isObRemember)) {
            query.put("IsObRemember", request.isObRemember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQualityCheck)) {
            query.put("IsQualityCheck", request.isQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRandom)) {
            query.put("IsRandom", request.isRandom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClid)) {
            query.put("ObClid", request.obClid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidProperty)) {
            query.put("ObClidProperty", request.obClidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidType)) {
            query.put("ObClidType", request.obClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obRecord)) {
            query.put("ObRecord", request.obRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitObPreviewTime)) {
            query.put("PermitObPreviewTime", request.permitObPreviewTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.power)) {
            query.put("Power", request.power);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webrtcUrlType)) {
            query.put("WebrtcUrlType", request.webrtcUrlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudBatchUpdateAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudBatchUpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新座席基本信息，不包含座席绑定的技能信息的更新</p>
     * 
     * @param request CloudBatchUpdateAgentRequest
     * @return CloudBatchUpdateAgentResponse
     */
    public CloudBatchUpdateAgentResponse cloudBatchUpdateAgent(CloudBatchUpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudBatchUpdateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席新增</p>
     * 
     * @param request CloudCreateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudCreateAgentResponse
     */
    public CloudCreateAgentResponse cloudCreateAgentWithOptions(CloudCreateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaCode)) {
            query.put("AreaCode", request.areaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPower)) {
            query.put("CallPower", request.callPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ibRecord)) {
            query.put("IbRecord", request.ibRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsr)) {
            query.put("IsAsr", request.isAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOb)) {
            query.put("IsOb", request.isOb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isObRemember)) {
            query.put("IsObRemember", request.isObRemember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQualityCheck)) {
            query.put("IsQualityCheck", request.isQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClid)) {
            query.put("ObClid", request.obClid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidProperty)) {
            query.put("ObClidProperty", request.obClidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidType)) {
            query.put("ObClidType", request.obClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obRecord)) {
            query.put("ObRecord", request.obRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitObPreviewTime)) {
            query.put("PermitObPreviewTime", request.permitObPreviewTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.power)) {
            query.put("Power", request.power);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevels)) {
            query.put("SkillLevels", request.skillLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webrtcUrlType)) {
            query.put("WebrtcUrlType", request.webrtcUrlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudCreateAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudCreateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席新增</p>
     * 
     * @param request CloudCreateAgentRequest
     * @return CloudCreateAgentResponse
     */
    public CloudCreateAgentResponse cloudCreateAgent(CloudCreateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudCreateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增任务</p>
     * 
     * @param request CloudCreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudCreateTaskResponse
     */
    public CloudCreateTaskResponse cloudCreateTaskWithOptions(CloudCreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentGroup)) {
            query.put("AgentGroup", request.agentGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTimeout)) {
            query.put("AgentTimeout", request.agentTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerRate)) {
            query.put("AnswerRate", request.answerRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoComplete)) {
            query.put("AutoComplete", request.autoComplete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDelete)) {
            query.put("AutoDelete", request.autoDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartDay)) {
            query.put("AutoStartDay", request.autoStartDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartTime)) {
            query.put("AutoStartTime", request.autoStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStop)) {
            query.put("AutoStop", request.autoStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStopDay)) {
            query.put("AutoStopDay", request.autoStopDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStopTime)) {
            query.put("AutoStopTime", request.autoStopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTaskType)) {
            query.put("AutoTaskType", request.autoTaskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTriggerTimeStrategy)) {
            query.put("AutoTriggerTimeStrategy", request.autoTriggerTimeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callGroupType)) {
            query.put("CallGroupType", request.callGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callLimitStrategy)) {
            query.put("CallLimitStrategy", request.callLimitStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPriorityStrategy)) {
            query.put("CallPriorityStrategy", request.callPriorityStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRouteStrategy)) {
            query.put("CallRouteStrategy", request.callRouteStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callStrategy)) {
            query.put("CallStrategy", request.callStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callVariables)) {
            query.put("CallVariables", request.callVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidProperty)) {
            query.put("ClidProperty", request.clidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidType)) {
            query.put("CustomerClidType", request.customerClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidWeight)) {
            query.put("CustomerClidWeight", request.customerClidWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidWeightFlag)) {
            query.put("CustomerClidWeightFlag", request.customerClidWeightFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClids)) {
            query.put("CustomerClids", request.customerClids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidsCategory)) {
            query.put("CustomerClidsCategory", request.customerClidsCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidsGroup)) {
            query.put("CustomerClidsGroup", request.customerClidsGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerMoh)) {
            query.put("CustomerMoh", request.customerMoh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerTimeout)) {
            query.put("CustomerTimeout", request.customerTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerVoice)) {
            query.put("CustomerVoice", request.customerVoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceEndFlag)) {
            query.put("ForceEndFlag", request.forceEndFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRewarm)) {
            query.put("IsRewarm", request.isRewarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivrId)) {
            query.put("IvrId", request.ivrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivrName)) {
            query.put("IvrName", request.ivrName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxWaitTime)) {
            query.put("MaxWaitTime", request.maxWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAvailableAgentCount)) {
            query.put("MinAvailableAgentCount", request.minAvailableAgentCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictAdjust)) {
            query.put("PredictAdjust", request.predictAdjust);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotiety)) {
            query.put("Quotiety", request.quotiety);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategy)) {
            query.put("RetryStrategy", request.retryStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategyOnlyToday)) {
            query.put("RetryStrategyOnlyToday", request.retryStrategyOnlyToday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategyTimeType)) {
            query.put("RetryStrategyTimeType", request.retryStrategyTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStrategy)) {
            query.put("TimeStrategy", request.timeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFields)) {
            query.put("UserFields", request.userFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmUpDuration)) {
            query.put("WarmUpDuration", request.warmUpDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudCreateTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudCreateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增任务</p>
     * 
     * @param request CloudCreateTaskRequest
     * @return CloudCreateTaskResponse
     */
    public CloudCreateTaskResponse cloudCreateTask(CloudCreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudCreateTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席删除</p>
     * 
     * @param request CloudDeleteAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudDeleteAgentResponse
     */
    public CloudDeleteAgentResponse cloudDeleteAgentWithOptions(CloudDeleteAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudDeleteAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudDeleteAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席删除</p>
     * 
     * @param request CloudDeleteAgentRequest
     * @return CloudDeleteAgentResponse
     */
    public CloudDeleteAgentResponse cloudDeleteAgent(CloudDeleteAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudDeleteAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除座席电话</p>
     * 
     * @param request CloudDeleteAgentTelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudDeleteAgentTelResponse
     */
    public CloudDeleteAgentTelResponse cloudDeleteAgentTelWithOptions(CloudDeleteAgentTelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudDeleteAgentTel"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudDeleteAgentTelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除座席电话</p>
     * 
     * @param request CloudDeleteAgentTelRequest
     * @return CloudDeleteAgentTelResponse
     */
    public CloudDeleteAgentTelResponse cloudDeleteAgentTel(CloudDeleteAgentTelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudDeleteAgentTelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席详细信息获取</p>
     * 
     * @param request CloudGetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudGetAgentResponse
     */
    public CloudGetAgentResponse cloudGetAgentWithOptions(CloudGetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudGetAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudGetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席详细信息获取</p>
     * 
     * @param request CloudGetAgentRequest
     * @return CloudGetAgentResponse
     */
    public CloudGetAgentResponse cloudGetAgent(CloudGetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudGetAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席实时状态获取</p>
     * 
     * @param request CloudGetAgentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudGetAgentStatusResponse
     */
    public CloudGetAgentStatusResponse cloudGetAgentStatusWithOptions(CloudGetAgentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudGetAgentStatus"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudGetAgentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席实时状态获取</p>
     * 
     * @param request CloudGetAgentStatusRequest
     * @return CloudGetAgentStatusResponse
     */
    public CloudGetAgentStatusResponse cloudGetAgentStatus(CloudGetAgentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudGetAgentStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务号码导入</p>
     * 
     * @param tmpReq CloudImportTaskTelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudImportTaskTelResponse
     */
    public CloudImportTaskTelResponse cloudImportTaskTelWithOptions(CloudImportTaskTelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloudImportTaskTelShrinkRequest request = new CloudImportTaskTelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskTelList)) {
            request.taskTelListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskTelList, "TaskTelList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bridgeVoicePath)) {
            query.put("BridgeVoicePath", request.bridgeVoicePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bridgeVoiceType)) {
            query.put("BridgeVoiceType", request.bridgeVoiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importTelAutoStart)) {
            query.put("ImportTelAutoStart", request.importTelAutoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRepeat)) {
            query.put("IsRepeat", request.isRepeat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTelListShrink)) {
            query.put("TaskTelList", request.taskTelListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudImportTaskTel"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudImportTaskTelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务号码导入</p>
     * 
     * @param request CloudImportTaskTelRequest
     * @return CloudImportTaskTelResponse
     */
    public CloudImportTaskTelResponse cloudImportTaskTel(CloudImportTaskTelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudImportTaskTelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>IVR等待打断</p>
     * 
     * @param request CloudInterruptIvrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudInterruptIvrResponse
     */
    public CloudInterruptIvrResponse cloudInterruptIvrWithOptions(CloudInterruptIvrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkName)) {
            query.put("CheckName", request.checkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkValue)) {
            query.put("CheckValue", request.checkValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueId)) {
            query.put("UniqueId", request.uniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userField)) {
            query.put("UserField", request.userField);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudInterruptIvr"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudInterruptIvrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>IVR等待打断</p>
     * 
     * @param request CloudInterruptIvrRequest
     * @return CloudInterruptIvrResponse
     */
    public CloudInterruptIvrResponse cloudInterruptIvr(CloudInterruptIvrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudInterruptIvrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席电话</p>
     * 
     * @param request CloudListAgentTelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudListAgentTelResponse
     */
    public CloudListAgentTelResponse cloudListAgentTelWithOptions(CloudListAgentTelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudListAgentTel"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudListAgentTelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席电话</p>
     * 
     * @param request CloudListAgentTelRequest
     * @return CloudListAgentTelResponse
     */
    public CloudListAgentTelResponse cloudListAgentTel(CloudListAgentTelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudListAgentTelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取在线空闲座席</p>
     * 
     * @param request CloudListFreeAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudListFreeAgentResponse
     */
    public CloudListFreeAgentResponse cloudListFreeAgentWithOptions(CloudListFreeAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudListFreeAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudListFreeAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取在线空闲座席</p>
     * 
     * @param request CloudListFreeAgentRequest
     * @return CloudListFreeAgentResponse
     */
    public CloudListFreeAgentResponse cloudListFreeAgent(CloudListFreeAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudListFreeAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在线座席信息</p>
     * 
     * @param request CloudListOnlineAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudListOnlineAgentResponse
     */
    public CloudListOnlineAgentResponse cloudListOnlineAgentWithOptions(CloudListOnlineAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseDescription)) {
            query.put("PauseDescription", request.pauseDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseType)) {
            query.put("PauseType", request.pauseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qnos)) {
            query.put("Qnos", request.qnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateCode)) {
            query.put("StateCode", request.stateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudListOnlineAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudListOnlineAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在线座席信息</p>
     * 
     * @param request CloudListOnlineAgentRequest
     * @return CloudListOnlineAgentResponse
     */
    public CloudListOnlineAgentResponse cloudListOnlineAgent(CloudListOnlineAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudListOnlineAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席外呼</p>
     * 
     * @param request CloudPreviewoutcallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudPreviewoutcallResponse
     */
    public CloudPreviewoutcallResponse cloudPreviewoutcallWithOptions(CloudPreviewoutcallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupTels)) {
            query.put("BackupTels", request.backupTels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callVariables)) {
            query.put("CallVariables", request.callVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdrIsAsr)) {
            query.put("CdrIsAsr", request.cdrIsAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidList)) {
            query.put("ClidList", request.clidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crnId)) {
            query.put("CrnId", request.crnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialTelTimeout)) {
            query.put("DialTelTimeout", request.dialTelTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isInvestigation)) {
            query.put("IsInvestigation", request.isInvestigation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClid)) {
            query.put("ObClid", request.obClid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidAreaCode)) {
            query.put("ObClidAreaCode", request.obClidAreaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidGroup)) {
            query.put("ObClidGroup", request.obClidGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestUniqueId)) {
            query.put("RequestUniqueId", request.requestUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudPreviewoutcall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudPreviewoutcallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席外呼</p>
     * 
     * @param request CloudPreviewoutcallRequest
     * @return CloudPreviewoutcallResponse
     */
    public CloudPreviewoutcallResponse cloudPreviewoutcall(CloudPreviewoutcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudPreviewoutcallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席详细信息列表获取</p>
     * 
     * @param request CloudQueryAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudQueryAgentResponse
     */
    public CloudQueryAgentResponse cloudQueryAgentWithOptions(CloudQueryAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qno)) {
            query.put("Qno", request.qno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnQueue)) {
            query.put("ReturnQueue", request.returnQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webrtcUrlType)) {
            query.put("WebrtcUrlType", request.webrtcUrlType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudQueryAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudQueryAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席详细信息列表获取</p>
     * 
     * @param request CloudQueryAgentRequest
     * @return CloudQueryAgentResponse
     */
    public CloudQueryAgentResponse cloudQueryAgent(CloudQueryAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudQueryAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席列表获取</p>
     * 
     * @param request CloudQueryAgentCnoAndNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudQueryAgentCnoAndNameResponse
     */
    public CloudQueryAgentCnoAndNameResponse cloudQueryAgentCnoAndNameWithOptions(CloudQueryAgentCnoAndNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudQueryAgentCnoAndName"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudQueryAgentCnoAndNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席列表获取</p>
     * 
     * @param request CloudQueryAgentCnoAndNameRequest
     * @return CloudQueryAgentCnoAndNameResponse
     */
    public CloudQueryAgentCnoAndNameResponse cloudQueryAgentCnoAndName(CloudQueryAgentCnoAndNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudQueryAgentCnoAndNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席外呼组</p>
     * 
     * @param request CloudQueryAgentGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudQueryAgentGroupResponse
     */
    public CloudQueryAgentGroupResponse cloudQueryAgentGroupWithOptions(CloudQueryAgentGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudQueryAgentGroup"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudQueryAgentGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席外呼组</p>
     * 
     * @param request CloudQueryAgentGroupRequest
     * @return CloudQueryAgentGroupResponse
     */
    public CloudQueryAgentGroupResponse cloudQueryAgentGroup(CloudQueryAgentGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudQueryAgentGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席技能</p>
     * 
     * @param request CloudQueryAgentSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudQueryAgentSkillResponse
     */
    public CloudQueryAgentSkillResponse cloudQueryAgentSkillWithOptions(CloudQueryAgentSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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
            new TeaPair("action", "CloudQueryAgentSkill"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudQueryAgentSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取座席技能</p>
     * 
     * @param request CloudQueryAgentSkillRequest
     * @return CloudQueryAgentSkillResponse
     */
    public CloudQueryAgentSkillResponse cloudQueryAgentSkill(CloudQueryAgentSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudQueryAgentSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>任务启动</p>
     * 
     * @param request CloudStartTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudStartTaskResponse
     */
    public CloudStartTaskResponse cloudStartTaskWithOptions(CloudStartTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudStartTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudStartTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>任务启动</p>
     * 
     * @param request CloudStartTaskRequest
     * @return CloudStartTaskResponse
     */
    public CloudStartTaskResponse cloudStartTask(CloudStartTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudStartTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>座席更新</p>
     * 
     * @param request CloudUpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudUpdateAgentResponse
     */
    public CloudUpdateAgentResponse cloudUpdateAgentWithOptions(CloudUpdateAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentType)) {
            query.put("AgentType", request.agentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.areaCode)) {
            query.put("AreaCode", request.areaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPower)) {
            query.put("CallPower", request.callPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cno)) {
            query.put("Cno", request.cno);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ibRecord)) {
            query.put("IbRecord", request.ibRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsr)) {
            query.put("IsAsr", request.isAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOb)) {
            query.put("IsOb", request.isOb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isObRemember)) {
            query.put("IsObRemember", request.isObRemember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQualityCheck)) {
            query.put("IsQualityCheck", request.isQualityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRandom)) {
            query.put("IsRandom", request.isRandom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClid)) {
            query.put("ObClid", request.obClid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidProperty)) {
            query.put("ObClidProperty", request.obClidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obClidType)) {
            query.put("ObClidType", request.obClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obRecord)) {
            query.put("ObRecord", request.obRecord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permitObPreviewTime)) {
            query.put("PermitObPreviewTime", request.permitObPreviewTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.power)) {
            query.put("Power", request.power);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIds)) {
            query.put("SkillIds", request.skillIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillLevels)) {
            query.put("SkillLevels", request.skillLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webrtcUrlType)) {
            query.put("WebrtcUrlType", request.webrtcUrlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudUpdateAgent"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudUpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>座席更新</p>
     * 
     * @param request CloudUpdateAgentRequest
     * @return CloudUpdateAgentResponse
     */
    public CloudUpdateAgentResponse cloudUpdateAgent(CloudUpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudUpdateAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新任务</p>
     * 
     * @param request CloudUpdateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudUpdateTaskResponse
     */
    public CloudUpdateTaskResponse cloudUpdateTaskWithOptions(CloudUpdateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentGroup)) {
            query.put("AgentGroup", request.agentGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTimeout)) {
            query.put("AgentTimeout", request.agentTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerRate)) {
            query.put("AnswerRate", request.answerRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoComplete)) {
            query.put("AutoComplete", request.autoComplete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartDay)) {
            query.put("AutoStartDay", request.autoStartDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStartTime)) {
            query.put("AutoStartTime", request.autoStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStop)) {
            query.put("AutoStop", request.autoStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStopDay)) {
            query.put("AutoStopDay", request.autoStopDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStopTime)) {
            query.put("AutoStopTime", request.autoStopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTaskType)) {
            query.put("AutoTaskType", request.autoTaskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoTriggerTimeStrategy)) {
            query.put("AutoTriggerTimeStrategy", request.autoTriggerTimeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callLimitStrategy)) {
            query.put("CallLimitStrategy", request.callLimitStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callPriorityStrategy)) {
            query.put("CallPriorityStrategy", request.callPriorityStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callRouteStrategy)) {
            query.put("CallRouteStrategy", request.callRouteStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callStrategy)) {
            query.put("CallStrategy", request.callStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callVariables)) {
            query.put("CallVariables", request.callVariables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidProperty)) {
            query.put("ClidProperty", request.clidProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnos)) {
            query.put("Cnos", request.cnos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidType)) {
            query.put("CustomerClidType", request.customerClidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidWeight)) {
            query.put("CustomerClidWeight", request.customerClidWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidWeightFlag)) {
            query.put("CustomerClidWeightFlag", request.customerClidWeightFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClids)) {
            query.put("CustomerClids", request.customerClids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidsCategory)) {
            query.put("CustomerClidsCategory", request.customerClidsCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerClidsGroup)) {
            query.put("CustomerClidsGroup", request.customerClidsGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerMoh)) {
            query.put("CustomerMoh", request.customerMoh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerTimeout)) {
            query.put("CustomerTimeout", request.customerTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerVoice)) {
            query.put("CustomerVoice", request.customerVoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceEndFlag)) {
            query.put("ForceEndFlag", request.forceEndFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRewarm)) {
            query.put("IsRewarm", request.isRewarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivrId)) {
            query.put("IvrId", request.ivrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivrName)) {
            query.put("IvrName", request.ivrName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxWaitTime)) {
            query.put("MaxWaitTime", request.maxWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAvailableAgentCount)) {
            query.put("MinAvailableAgentCount", request.minAvailableAgentCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictAdjust)) {
            query.put("PredictAdjust", request.predictAdjust);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotiety)) {
            query.put("Quotiety", request.quotiety);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategy)) {
            query.put("RetryStrategy", request.retryStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategyOnlyToday)) {
            query.put("RetryStrategyOnlyToday", request.retryStrategyOnlyToday);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategyTimeType)) {
            query.put("RetryStrategyTimeType", request.retryStrategyTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStrategy)) {
            query.put("TimeStrategy", request.timeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFields)) {
            query.put("UserFields", request.userFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmUpDuration)) {
            query.put("WarmUpDuration", request.warmUpDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wrapup)) {
            query.put("Wrapup", request.wrapup);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudUpdateTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudUpdateTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新任务</p>
     * 
     * @param request CloudUpdateTaskRequest
     * @return CloudUpdateTaskResponse
     */
    public CloudUpdateTaskResponse cloudUpdateTask(CloudUpdateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudUpdateTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>webcall</p>
     * 
     * @param request CloudWebcallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudWebcallResponse
     */
    public CloudWebcallResponse cloudWebcallWithOptions(CloudWebcallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amd)) {
            query.put("Amd", request.amd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clid)) {
            query.put("Clid", request.clid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidAreaCode)) {
            query.put("ClidAreaCode", request.clidAreaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidGroup)) {
            query.put("ClidGroup", request.clidGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clidList)) {
            query.put("ClidList", request.clidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crnId)) {
            query.put("CrnId", request.crnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delay)) {
            query.put("Delay", request.delay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseId)) {
            query.put("EnterpriseId", request.enterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirTime)) {
            query.put("ExpirTime", request.expirTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivrId)) {
            query.put("IvrId", request.ivrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiTelDelay)) {
            query.put("MultiTelDelay", request.multiTelDelay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiTelPush)) {
            query.put("MultiTelPush", request.multiTelPush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestUniqueId)) {
            query.put("RequestUniqueId", request.requestUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retry)) {
            query.put("Retry", request.retry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryInterval)) {
            query.put("RetryInterval", request.retryInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            query.put("Tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userField)) {
            query.put("UserField", request.userField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vid)) {
            query.put("Vid", request.vid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudWebcall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudWebcallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>webcall</p>
     * 
     * @param request CloudWebcallRequest
     * @return CloudWebcallResponse
     */
    public CloudWebcallResponse cloudWebcall(CloudWebcallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloudWebcallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 1,000 voice notifications for each task.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a service instance to create a text-to-speech (TTS) task, a voice notification task, or a voice verification code task for multiple called numbers.</p>
     * 
     * @param request CreateCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCallTaskResponse
     */
    public CreateCallTaskResponse createCallTaskWithOptions(CreateCallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fireTime)) {
            query.put("FireTime", request.fireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopTime)) {
            query.put("StopTime", request.stopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 1,000 voice notifications for each task.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a service instance to create a text-to-speech (TTS) task, a voice notification task, or a voice verification code task for multiple called numbers.</p>
     * 
     * @param request CreateCallTaskRequest
     * @return CreateCallTaskResponse
     */
    public CreateCallTaskResponse createCallTask(CreateCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console. In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an outbound robocall task.</p>
     * 
     * @param request CreateRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRobotTaskResponse
     */
    public CreateRobotTaskResponse createRobotTaskWithOptions(CreateRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            query.put("CorpName", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogId)) {
            query.put("DialogId", request.dialogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSelfLine)) {
            query.put("IsSelfLine", request.isSelfLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberStatusIdent)) {
            query.put("NumberStatusIdent", request.numberStatusIdent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallInterval)) {
            query.put("RecallInterval", request.recallInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallStateCodes)) {
            query.put("RecallStateCodes", request.recallStateCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallTimes)) {
            query.put("RecallTimes", request.recallTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryType)) {
            query.put("RetryType", request.retryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate an outbound robocall task by using the robot communication scripts preset in the Voice Messaging Service console. In an intelligent speech interaction task, you can use the robot communication scripts preset in the Voice Messaging Service console, or invoke the callback function to return the response mode configured by the business party in each call.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an outbound robocall task.</p>
     * 
     * @param request CreateRobotTaskRequest
     * @return CreateRobotTaskResponse
     */
    public CreateRobotTaskResponse createRobotTask(CreateRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades from a video call to a voice call.</p>
     * 
     * @param request DegradeVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DegradeVideoFileResponse
     */
    public DegradeVideoFileResponse degradeVideoFileWithOptions(DegradeVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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
            new TeaPair("action", "DegradeVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DegradeVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Downgrades from a video call to a voice call.</p>
     * 
     * @param request DegradeVideoFileRequest
     * @return DegradeVideoFileResponse
     */
    public DegradeVideoFileResponse degradeVideoFile(DegradeVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.degradeVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only tasks that are not started, that are completed, and that are terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a robocall task.</p>
     * 
     * @param request DeleteRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRobotTaskResponse
     */
    public DeleteRobotTaskResponse deleteRobotTaskWithOptions(DeleteRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only tasks that are not started, that are completed, and that are terminated.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a robocall task.</p>
     * 
     * @param request DeleteRobotTaskRequest
     * @return DeleteRobotTaskResponse
     */
    public DeleteRobotTaskResponse deleteRobotTask(DeleteRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a call task.</p>
     * 
     * @param request ExecuteCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteCallTaskResponse
     */
    public ExecuteCallTaskResponse executeCallTaskWithOptions(ExecuteCallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fireTime)) {
            query.put("FireTime", request.fireTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteCallTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a call task.</p>
     * 
     * @param request ExecuteCallTaskRequest
     * @return ExecuteCallTaskResponse
     */
    public ExecuteCallTaskResponse executeCallTask(ExecuteCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the call type during a call.</p>
     * 
     * @param request GetCallMediaTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallMediaTypeResponse
     */
    public GetCallMediaTypeResponse getCallMediaTypeWithOptions(GetCallMediaTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
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
            new TeaPair("action", "GetCallMediaType"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallMediaTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the call type during a call.</p>
     * 
     * @param request GetCallMediaTypeRequest
     * @return GetCallMediaTypeResponse
     */
    public GetCallMediaTypeResponse getCallMediaType(GetCallMediaTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallMediaTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetCallProgress</p>
     * 
     * @param request GetCallProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallProgressResponse
     */
    public GetCallProgressResponse getCallProgressWithOptions(GetCallProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNum)) {
            query.put("CalledNum", request.calledNum);
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
            new TeaPair("action", "GetCallProgress"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetCallProgress</p>
     * 
     * @param request GetCallProgressRequest
     * @return GetCallProgressResponse
     */
    public GetCallProgressResponse getCallProgress(GetCallProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the qualification ID based on the ID of a qualification application ticket.</p>
     * 
     * @param request GetHotlineQualificationByOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotlineQualificationByOrderResponse
     */
    public GetHotlineQualificationByOrderResponse getHotlineQualificationByOrderWithOptions(GetHotlineQualificationByOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineQualificationByOrder"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineQualificationByOrderResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the qualification ID based on the ID of a qualification application ticket.</p>
     * 
     * @param request GetHotlineQualificationByOrderRequest
     * @return GetHotlineQualificationByOrderResponse
     */
    public GetHotlineQualificationByOrderResponse getHotlineQualificationByOrder(GetHotlineQualificationByOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHotlineQualificationByOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a temporary URL of a video or audio file. You can view the video or audio file immediately by using this temporary URL.</p>
     * 
     * @param request GetTemporaryFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemporaryFileUrlResponse
     */
    public GetTemporaryFileUrlResponse getTemporaryFileUrlWithOptions(GetTemporaryFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemporaryFileUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemporaryFileUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a temporary URL of a video or audio file. You can view the video or audio file immediately by using this temporary URL.</p>
     * 
     * @param request GetTemporaryFileUrlRequest
     * @return GetTemporaryFileUrlResponse
     */
    public GetTemporaryFileUrlResponse getTemporaryFileUrl(GetTemporaryFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemporaryFileUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the token for authentication.</p>
     * 
     * @param request GetTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the token for authentication.</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetVideoFieldUrl</p>
     * 
     * @param request GetVideoFieldUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoFieldUrlResponse
     */
    public GetVideoFieldUrlResponse getVideoFieldUrlWithOptions(GetVideoFieldUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.videoFile)) {
            query.put("VideoFile", request.videoFile);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoFieldUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoFieldUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetVideoFieldUrl</p>
     * 
     * @param request GetVideoFieldUrlRequest
     * @return GetVideoFieldUrlResponse
     */
    public GetVideoFieldUrlResponse getVideoFieldUrl(GetVideoFieldUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoFieldUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Your enterprise qualification is approved. For more information, see <a href="https://help.aliyun.com/document_detail/149795.html">Submit enterprise qualifications</a>.</p>
     * <ul>
     * <li>Voice numbers are purchased. For more information, see <a href="https://help.aliyun.com/document_detail/149794.html">Purchase numbers</a>.</li>
     * <li>When the subscriber answers the call, the subscriber hears a voice that instructs the subscriber to press a key as needed. If the <a href="https://help.aliyun.com/document_detail/112503.html">message receipt</a> feature is enabled, the Voice Messaging Service (VMS) platform returns the information about the key pressed by the subscriber to the business system. The key information includes the order confirmation, questionnaire survey, and satisfaction survey completed by the subscriber.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an interactive voice response (IVR) call to a specified number.</p>
     * 
     * @param request IvrCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IvrCallResponse
     */
    public IvrCallResponse ivrCallWithOptions(IvrCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.byeCode)) {
            query.put("ByeCode", request.byeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byeTtsParams)) {
            query.put("ByeTtsParams", request.byeTtsParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.menuKeyMap)) {
            query.put("MenuKeyMap", request.menuKeyMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCode)) {
            query.put("StartCode", request.startCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTtsParams)) {
            query.put("StartTtsParams", request.startTtsParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IvrCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IvrCallResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Your enterprise qualification is approved. For more information, see <a href="https://help.aliyun.com/document_detail/149795.html">Submit enterprise qualifications</a>.</p>
     * <ul>
     * <li>Voice numbers are purchased. For more information, see <a href="https://help.aliyun.com/document_detail/149794.html">Purchase numbers</a>.</li>
     * <li>When the subscriber answers the call, the subscriber hears a voice that instructs the subscriber to press a key as needed. If the <a href="https://help.aliyun.com/document_detail/112503.html">message receipt</a> feature is enabled, the Voice Messaging Service (VMS) platform returns the information about the key pressed by the subscriber to the business system. The key information includes the order confirmation, questionnaire survey, and satisfaction survey completed by the subscriber.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an interactive voice response (IVR) call to a specified number.</p>
     * 
     * @param request IvrCallRequest
     * @return IvrCallResponse
     */
    public IvrCallResponse ivrCall(IvrCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ivrCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a voice call task after the task is created, including the task ID, task status, and templates used by the task.</p>
     * 
     * @param request ListCallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallTaskResponse
     */
    public ListCallTaskResponse listCallTaskWithOptions(ListCallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a voice call task after the task is created, including the task ID, task status, and templates used by the task.</p>
     * 
     * @param request ListCallTaskRequest
     * @return ListCallTaskResponse
     */
    public ListCallTaskResponse listCallTask(ListCallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of call tasks based on task IDs after call tasks are complete.</p>
     * 
     * @param request ListCallTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallTaskDetailResponse
     */
    public ListCallTaskDetailResponse listCallTaskDetailWithOptions(ListCallTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNum)) {
            query.put("CalledNum", request.calledNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallTaskDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallTaskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of call tasks based on task IDs after call tasks are complete.</p>
     * 
     * @param request ListCallTaskDetailRequest
     * @return ListCallTaskDetailResponse
     */
    public ListCallTaskDetailResponse listCallTaskDetail(ListCallTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration information about a China 400 number.</p>
     * 
     * @param request ListHotlineTransferRegisterFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHotlineTransferRegisterFileResponse
     */
    public ListHotlineTransferRegisterFileResponse listHotlineTransferRegisterFileWithOptions(ListHotlineTransferRegisterFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotlineNumber)) {
            query.put("HotlineNumber", request.hotlineNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
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
            new TeaPair("action", "ListHotlineTransferRegisterFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotlineTransferRegisterFileResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the registration information about a China 400 number.</p>
     * 
     * @param request ListHotlineTransferRegisterFileRequest
     * @return ListHotlineTransferRegisterFileResponse
     */
    public ListHotlineTransferRegisterFileResponse listHotlineTransferRegisterFile(ListHotlineTransferRegisterFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHotlineTransferRegisterFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询服务实例列表</p>
     * 
     * @param tmpReq ListServiceInstanceForPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceInstanceForPageResponse
     */
    public ListServiceInstanceForPageResponse listServiceInstanceForPageWithOptions(ListServiceInstanceForPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListServiceInstanceForPageShrinkRequest request = new ListServiceInstanceForPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pager)) {
            request.pagerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pager, "Pager", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pagerShrink)) {
            query.put("Pager", request.pagerShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationNumber)) {
            query.put("RelationNumber", request.relationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageId)) {
            query.put("UsageId", request.usageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceInstanceForPage"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceInstanceForPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询服务实例列表</p>
     * 
     * @param request ListServiceInstanceForPageRequest
     * @return ListServiceInstanceForPageResponse
     */
    public ListServiceInstanceForPageResponse listServiceInstanceForPage(ListServiceInstanceForPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceInstanceForPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses video playback when a video file is played back during a voice call.</p>
     * 
     * @param request PauseVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseVideoFileResponse
     */
    public PauseVideoFileResponse pauseVideoFileWithOptions(PauseVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
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
            new TeaPair("action", "PauseVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses video playback when a video file is played back during a voice call.</p>
     * 
     * @param request PauseVideoFileRequest
     * @return PauseVideoFileResponse
     */
    public PauseVideoFileResponse pauseVideoFile(PauseVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Plays back a video file during a voice call.</p>
     * 
     * @param request PlayVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PlayVideoFileResponse
     */
    public PlayVideoFileResponse playVideoFileWithOptions(PlayVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyPhone)) {
            query.put("OnlyPhone", request.onlyPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.videoId)) {
            query.put("VideoId", request.videoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlayVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PlayVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Plays back a video file during a voice call.</p>
     * 
     * @param request PlayVideoFileRequest
     * @return PlayVideoFileResponse
     */
    public PlayVideoFileResponse playVideoFile(PlayVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.playVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>QueryCallDetailByCallId is a common query operation. You can call this operation to query the details of a voice notification, voice verification code, interactive voice response (IVR), intelligent inbound voice call, intelligent outbound voice call, or intelligent robocall.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a call.</p>
     * 
     * @param request QueryCallDetailByCallIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallDetailByCallIdResponse
     */
    public QueryCallDetailByCallIdResponse queryCallDetailByCallIdWithOptions(QueryCallDetailByCallIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodId)) {
            query.put("ProdId", request.prodId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDate)) {
            query.put("QueryDate", request.queryDate);
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
            new TeaPair("action", "QueryCallDetailByCallId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallDetailByCallIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>QueryCallDetailByCallId is a common query operation. You can call this operation to query the details of a voice notification, voice verification code, interactive voice response (IVR), intelligent inbound voice call, intelligent outbound voice call, or intelligent robocall.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a call.</p>
     * 
     * @param request QueryCallDetailByCallIdRequest
     * @return QueryCallDetailByCallIdResponse
     */
    public QueryCallDetailByCallIdResponse queryCallDetailByCallId(QueryCallDetailByCallIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallDetailByCallIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the call details of an outbound robocall task.</p>
     * 
     * @param request QueryCallDetailByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallDetailByTaskIdResponse
     */
    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskIdWithOptions(QueryCallDetailByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDate)) {
            query.put("QueryDate", request.queryDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallDetailByTaskId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallDetailByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the call details of an outbound robocall task.</p>
     * 
     * @param request QueryCallDetailByTaskIdRequest
     * @return QueryCallDetailByTaskIdResponse
     */
    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallDetailByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of the phone number used to transfer a call.</p>
     * 
     * @param request QueryCallInPoolTransferConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallInPoolTransferConfigResponse
     */
    public QueryCallInPoolTransferConfigResponse queryCallInPoolTransferConfigWithOptions(QueryCallInPoolTransferConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
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
            new TeaPair("action", "QueryCallInPoolTransferConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallInPoolTransferConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of the phone number used to transfer a call.</p>
     * 
     * @param request QueryCallInPoolTransferConfigRequest
     * @return QueryCallInPoolTransferConfigResponse
     */
    public QueryCallInPoolTransferConfigResponse queryCallInPoolTransferConfig(QueryCallInPoolTransferConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallInPoolTransferConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries call transfer records.</p>
     * 
     * @param request QueryCallInTransferRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCallInTransferRecordResponse
     */
    public QueryCallInTransferRecordResponse queryCallInTransferRecordWithOptions(QueryCallInTransferRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callInCaller)) {
            query.put("CallInCaller", request.callInCaller);
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

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDate)) {
            query.put("QueryDate", request.queryDate);
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
            new TeaPair("action", "QueryCallInTransferRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallInTransferRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries call transfer records.</p>
     * 
     * @param request QueryCallInTransferRecordRequest
     * @return QueryCallInTransferRecordResponse
     */
    public QueryCallInTransferRecordResponse queryCallInTransferRecord(QueryCallInTransferRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallInTransferRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of robots to obtain their details.</p>
     * 
     * @param request QueryRobotInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotInfoListResponse
     */
    public QueryRobotInfoListResponse queryRobotInfoListWithOptions(QueryRobotInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
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
            new TeaPair("action", "QueryRobotInfoList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotInfoListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of robots to obtain their details.</p>
     * 
     * @param request QueryRobotInfoListRequest
     * @return QueryRobotInfoListResponse
     */
    public QueryRobotInfoListResponse queryRobotInfoList(QueryRobotInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotInfoListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the call details of a called number.</p>
     * 
     * @param request QueryRobotTaskCallDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotTaskCallDetailResponse
     */
    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetailWithOptions(QueryRobotTaskCallDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            query.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDate)) {
            query.put("QueryDate", request.queryDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskCallDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskCallDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the call details of a called number.</p>
     * 
     * @param request QueryRobotTaskCallDetailRequest
     * @return QueryRobotTaskCallDetailResponse
     */
    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskCallDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a robocall task.</p>
     * 
     * @param request QueryRobotTaskCallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotTaskCallListResponse
     */
    public QueryRobotTaskCallListResponse queryRobotTaskCallListWithOptions(QueryRobotTaskCallListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callResult)) {
            query.put("CallResult", request.callResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.called)) {
            query.put("Called", request.called);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogCountFrom)) {
            query.put("DialogCountFrom", request.dialogCountFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dialogCountTo)) {
            query.put("DialogCountTo", request.dialogCountTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationFrom)) {
            query.put("DurationFrom", request.durationFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationTo)) {
            query.put("DurationTo", request.durationTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangupDirection)) {
            query.put("HangupDirection", request.hangupDirection);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskCallList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskCallListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a robocall task.</p>
     * 
     * @param request QueryRobotTaskCallListRequest
     * @return QueryRobotTaskCallListResponse
     */
    public QueryRobotTaskCallListResponse queryRobotTaskCallList(QueryRobotTaskCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskCallListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a robocall task.</p>
     * 
     * @param request QueryRobotTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotTaskDetailResponse
     */
    public QueryRobotTaskDetailResponse queryRobotTaskDetailWithOptions(QueryRobotTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "QueryRobotTaskDetail"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a robocall task.</p>
     * 
     * @param request QueryRobotTaskDetailRequest
     * @return QueryRobotTaskDetailResponse
     */
    public QueryRobotTaskDetailResponse queryRobotTaskDetail(QueryRobotTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all robocall tasks.</p>
     * 
     * @param request QueryRobotTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotTaskListResponse
     */
    public QueryRobotTaskListResponse queryRobotTaskListWithOptions(QueryRobotTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotTaskList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotTaskListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all robocall tasks.</p>
     * 
     * @param request QueryRobotTaskListRequest
     * @return QueryRobotTaskListResponse
     */
    public QueryRobotTaskListResponse queryRobotTaskList(QueryRobotTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of robot communication scripts.</p>
     * 
     * @param request QueryRobotv2AllListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRobotv2AllListResponse
     */
    public QueryRobotv2AllListResponse queryRobotv2AllListWithOptions(QueryRobotv2AllListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRobotv2AllList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRobotv2AllListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of robot communication scripts.</p>
     * 
     * @param request QueryRobotv2AllListRequest
     * @return QueryRobotv2AllListResponse
     */
    public QueryRobotv2AllListResponse queryRobotv2AllList(QueryRobotv2AllListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotv2AllListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the video playback progress after you play a video file during a voice call.</p>
     * 
     * @param request QueryVideoPlayProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVideoPlayProgressResponse
     */
    public QueryVideoPlayProgressResponse queryVideoPlayProgressWithOptions(QueryVideoPlayProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
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
            new TeaPair("action", "QueryVideoPlayProgress"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVideoPlayProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the video playback progress after you play a video file during a voice call.</p>
     * 
     * @param request QueryVideoPlayProgressRequest
     * @return QueryVideoPlayProgressResponse
     */
    public QueryVideoPlayProgressResponse queryVideoPlayProgress(QueryVideoPlayProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVideoPlayProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists real numbers bound to service instances. The returned data includes the binding time, the number activation time, and the number of real numbers bound to a service instance.</p>
     * 
     * @param request QueryVirtualNumberRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVirtualNumberRelationResponse
     */
    public QueryVirtualNumberRelationResponse queryVirtualNumberRelationWithOptions(QueryVirtualNumberRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNameCity)) {
            query.put("RegionNameCity", request.regionNameCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedNum)) {
            query.put("RelatedNum", request.relatedNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            query.put("RouteType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVirtualNumberRelation"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVirtualNumberRelationResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists real numbers bound to service instances. The returned data includes the binding time, the number activation time, and the number of real numbers bound to a service instance.</p>
     * 
     * @param request QueryVirtualNumberRelationRequest
     * @return QueryVirtualNumberRelationResponse
     */
    public QueryVirtualNumberRelationResponse queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVirtualNumberRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询真实号接通率</p>
     * 
     * @param request QueryVmsRealNumberCallConnectionRateInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVmsRealNumberCallConnectionRateInfoResponse
     */
    public QueryVmsRealNumberCallConnectionRateInfoResponse queryVmsRealNumberCallConnectionRateInfoWithOptions(QueryVmsRealNumberCallConnectionRateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNumber)) {
            query.put("RealNumber", request.realNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePeriod)) {
            query.put("TimePeriod", request.timePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNumber)) {
            query.put("VirtualNumber", request.virtualNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVmsRealNumberCallConnectionRateInfo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVmsRealNumberCallConnectionRateInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询真实号接通率</p>
     * 
     * @param request QueryVmsRealNumberCallConnectionRateInfoRequest
     * @return QueryVmsRealNumberCallConnectionRateInfoResponse
     */
    public QueryVmsRealNumberCallConnectionRateInfoResponse queryVmsRealNumberCallConnectionRateInfo(QueryVmsRealNumberCallConnectionRateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVmsRealNumberCallConnectionRateInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询虚拟号码与真实号码绑定关系列表</p>
     * 
     * @param request QueryVmsVirtualNumberRelationByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVmsVirtualNumberRelationByPageResponse
     */
    public QueryVmsVirtualNumberRelationByPageResponse queryVmsVirtualNumberRelationByPageWithOptions(QueryVmsVirtualNumberRelationByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.numberCity)) {
            query.put("NumberCity", request.numberCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberProvince)) {
            query.put("NumberProvince", request.numberProvince);
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

        if (!com.aliyun.teautil.Common.isUnset(request.realNumber)) {
            query.put("RealNumber", request.realNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNumber)) {
            query.put("VirtualNumber", request.virtualNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVmsVirtualNumberRelationByPage"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVmsVirtualNumberRelationByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询虚拟号码与真实号码绑定关系列表</p>
     * 
     * @param request QueryVmsVirtualNumberRelationByPageRequest
     * @return QueryVmsVirtualNumberRelationByPageResponse
     */
    public QueryVmsVirtualNumberRelationByPageResponse queryVmsVirtualNumberRelationByPage(QueryVmsVirtualNumberRelationByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVmsVirtualNumberRelationByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the review state of a voice file.</p>
     * 
     * @param request QueryVoiceFileAuditInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryVoiceFileAuditInfoResponse
     */
    public QueryVoiceFileAuditInfoResponse queryVoiceFileAuditInfoWithOptions(QueryVoiceFileAuditInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCodes)) {
            query.put("VoiceCodes", request.voiceCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVoiceFileAuditInfo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVoiceFileAuditInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the review state of a voice file.</p>
     * 
     * @param request QueryVoiceFileAuditInfoRequest
     * @return QueryVoiceFileAuditInfoResponse
     */
    public QueryVoiceFileAuditInfoResponse queryVoiceFileAuditInfo(QueryVoiceFileAuditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVoiceFileAuditInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes the inbound call that is transferred by using a China 400 number.</p>
     * 
     * @param request RecoverCallInConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverCallInConfigResponse
     */
    public RecoverCallInConfigResponse recoverCallInConfigWithOptions(RecoverCallInConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
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
            new TeaPair("action", "RecoverCallInConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverCallInConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes the inbound call that is transferred by using a China 400 number.</p>
     * 
     * @param request RecoverCallInConfigRequest
     * @return RecoverCallInConfigResponse
     */
    public RecoverCallInConfigResponse recoverCallInConfig(RecoverCallInConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverCallInConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes video playback after you pause video playback during a voice call.</p>
     * 
     * @param request ResumeVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeVideoFileResponse
     */
    public ResumeVideoFileResponse resumeVideoFileWithOptions(ResumeVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
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
            new TeaPair("action", "ResumeVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes video playback after you pause video playback during a voice call.</p>
     * 
     * @param request ResumeVideoFileRequest
     * @return ResumeVideoFileResponse
     */
    public ResumeVideoFileResponse resumeVideoFile(ResumeVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SeekVideoFile</p>
     * 
     * @param request SeekVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SeekVideoFileResponse
     */
    public SeekVideoFileResponse seekVideoFileWithOptions(SeekVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
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

        if (!com.aliyun.teautil.Common.isUnset(request.seekTimes)) {
            query.put("SeekTimes", request.seekTimes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SeekVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SeekVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SeekVideoFile</p>
     * 
     * @param request SeekVideoFileRequest
     * @return SeekVideoFileResponse
     */
    public SeekVideoFileResponse seekVideoFile(SeekVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.seekVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends an SMS verification code.</p>
     * 
     * @param request SendVerificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendVerificationResponse
     */
    public SendVerificationResponse sendVerificationWithOptions(SendVerificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerificationResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends an SMS verification code.</p>
     * 
     * @param request SendVerificationRequest
     * @return SendVerificationResponse
     */
    public SendVerificationResponse sendVerification(SendVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the phone numbers for transferring a call.</p>
     * 
     * @param request SetTransferCalleePoolConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetTransferCalleePoolConfigResponse
     */
    public SetTransferCalleePoolConfigResponse setTransferCalleePoolConfigWithOptions(SetTransferCalleePoolConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledRouteMode)) {
            query.put("CalledRouteMode", request.calledRouteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.details)) {
            query.put("Details", request.details);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
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
            new TeaPair("action", "SetTransferCalleePoolConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetTransferCalleePoolConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the phone numbers for transferring a call.</p>
     * 
     * @param request SetTransferCalleePoolConfigRequest
     * @return SetTransferCalleePoolConfigResponse
     */
    public SetTransferCalleePoolConfigResponse setTransferCalleePoolConfig(SetTransferCalleePoolConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setTransferCalleePoolConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.</p>
     * <ul>
     * <li>For more information about voice plans or voice service billing, see <a href="https://help.aliyun.com/document_detail/150083.html">Pricing of VMS on China site (aliyun.com)</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a voice verification code or a voice notification with variables to a specified phone number.</p>
     * 
     * @param request SingleCallByTtsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SingleCallByTtsResponse
     */
    public SingleCallByTtsResponse singleCallByTtsWithOptions(SingleCallByTtsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsCode)) {
            query.put("TtsCode", request.ttsCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleCallByTts"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleCallByTtsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.</p>
     * <ul>
     * <li>For more information about voice plans or voice service billing, see <a href="https://help.aliyun.com/document_detail/150083.html">Pricing of VMS on China site (aliyun.com)</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a voice verification code or a voice notification with variables to a specified phone number.</p>
     * 
     * @param request SingleCallByTtsRequest
     * @return SingleCallByTtsResponse
     */
    public SingleCallByTtsResponse singleCallByTts(SingleCallByTtsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleCallByTtsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends voice file notifications or video file notifications to a single called number.</p>
     * 
     * @param request SingleCallByVideoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SingleCallByVideoResponse
     */
    public SingleCallByVideoResponse singleCallByVideoWithOptions(SingleCallByVideoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoCode)) {
            query.put("VideoCode", request.videoCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleCallByVideo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleCallByVideoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends voice file notifications or video file notifications to a single called number.</p>
     * 
     * @param request SingleCallByVideoRequest
     * @return SingleCallByVideoResponse
     */
    public SingleCallByVideoResponse singleCallByVideo(SingleCallByVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleCallByVideoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
     * You can call the <a href="https://help.aliyun.com/document_detail/393519.html">SingleCallByTts</a> operation to send voice notifications with variables.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a voice notification to a phone number by using a voice notification file.</p>
     * 
     * @param request SingleCallByVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SingleCallByVoiceResponse
     */
    public SingleCallByVoiceResponse singleCallByVoiceWithOptions(SingleCallByVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playTimes)) {
            query.put("PlayTimes", request.playTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SingleCallByVoice"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SingleCallByVoiceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Due to business adjustments, the updates of the voice notification and voice verification code services have been stopped in regions outside the Chinese mainland and the services have been discontinued since March 2022. Only qualified customers can continue using the voice notification and voice verification code services.
     * You can call the <a href="https://help.aliyun.com/document_detail/393519.html">SingleCallByTts</a> operation to send voice notifications with variables.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,200 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a voice notification to a phone number by using a voice notification file.</p>
     * 
     * @param request SingleCallByVoiceRequest
     * @return SingleCallByVoiceResponse
     */
    public SingleCallByVoiceResponse singleCallByVoice(SingleCallByVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleCallByVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Fast forwards or rewinds a video when you play the video.</p>
     * 
     * @param request SkipVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipVideoFileResponse
     */
    public SkipVideoFileResponse skipVideoFileWithOptions(SkipVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.skipTimes)) {
            query.put("SkipTimes", request.skipTimes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Fast forwards or rewinds a video when you play the video.</p>
     * 
     * @param request SkipVideoFileRequest
     * @return SkipVideoFileResponse
     */
    public SkipVideoFileResponse skipVideoFile(SkipVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The SmartCall operation must be used together with the <a href="https://help.aliyun.com/document_detail/112703.html">intelligent outbound HTTP operation</a>. After the call initiated by the Voice Messaging Service (VMS) platform is connected, the VMS platform sends the text converted from speech back to the business side, and the business side then returns the follow-up action to the VMS platform.</p>
     * <ul>
     * <li>The SmartCall operation does not support the following characters: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an intelligent voice call.</p>
     * 
     * @param request SmartCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmartCallResponse
     */
    public SmartCallResponse smartCallWithOptions(SmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeBreak)) {
            query.put("ActionCodeBreak", request.actionCodeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionCodeTimeBreak)) {
            query.put("ActionCodeTimeBreak", request.actionCodeTimeBreak);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrBaseId)) {
            query.put("AsrBaseId", request.asrBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrModelId)) {
            query.put("AsrModelId", request.asrModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundFileCode)) {
            query.put("BackgroundFileCode", request.backgroundFileCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundSpeed)) {
            query.put("BackgroundSpeed", request.backgroundSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundVolume)) {
            query.put("BackgroundVolume", request.backgroundVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledShowNumber)) {
            query.put("CalledShowNumber", request.calledShowNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicId)) {
            query.put("DynamicId", request.dynamicId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.earlyMediaAsr)) {
            query.put("EarlyMediaAsr", request.earlyMediaAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableITN)) {
            query.put("EnableITN", request.enableITN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muteTime)) {
            query.put("MuteTime", request.muteTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noiseThreshold)) {
            query.put("NoiseThreshold", request.noiseThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pauseTime)) {
            query.put("PauseTime", request.pauseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordFlag)) {
            query.put("RecordFlag", request.recordFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamAsr)) {
            query.put("StreamAsr", request.streamAsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConf)) {
            query.put("TtsConf", request.ttsConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsSpeed)) {
            query.put("TtsSpeed", request.ttsSpeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsStyle)) {
            query.put("TtsStyle", request.ttsStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsVolume)) {
            query.put("TtsVolume", request.ttsVolume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCode)) {
            query.put("VoiceCode", request.voiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceCodeParam)) {
            query.put("VoiceCodeParam", request.voiceCodeParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartCall"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartCallResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The SmartCall operation must be used together with the <a href="https://help.aliyun.com/document_detail/112703.html">intelligent outbound HTTP operation</a>. After the call initiated by the Voice Messaging Service (VMS) platform is connected, the VMS platform sends the text converted from speech back to the business side, and the business side then returns the follow-up action to the VMS platform.</p>
     * <ul>
     * <li>The SmartCall operation does not support the following characters: <code>@ = : &quot;&quot; $ { } ^ * ￥</code>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an intelligent voice call.</p>
     * 
     * @param request SmartCallRequest
     * @return SmartCallResponse
     */
    public SmartCallResponse smartCall(SmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a specified action on the called number of an outbound robocall when the call is transferred to an agent of the call center.</p>
     * <blockquote>
     * <p>You can only initiate the action of bridging a called number and an agent of the call center.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an action in an outbound robocall. This operation is applicable only when the robocall is transferred to an agent or an agent is listening in on the conversation between the robot and the user.</p>
     * 
     * @param request SmartCallOperateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmartCallOperateResponse
     */
    public SmartCallOperateResponse smartCallOperateWithOptions(SmartCallOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
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
            new TeaPair("action", "SmartCallOperate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartCallOperateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a specified action on the called number of an outbound robocall when the call is transferred to an agent of the call center.</p>
     * <blockquote>
     * <p>You can only initiate the action of bridging a called number and an agent of the call center.</p>
     * </blockquote>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates an action in an outbound robocall. This operation is applicable only when the robocall is transferred to an agent or an agent is listening in on the conversation between the robot and the user.</p>
     * 
     * @param request SmartCallOperateRequest
     * @return SmartCallOperateResponse
     */
    public SmartCallOperateResponse smartCallOperate(SmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartCallOperateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a robocall task immediately or at a scheduled time.</p>
     * 
     * @param request StartRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRobotTaskResponse
     */
    public StartRobotTaskResponse startRobotTaskWithOptions(StartRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            query.put("ScheduleTime", request.scheduleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a robocall task immediately or at a scheduled time.</p>
     * 
     * @param request StartRobotTaskRequest
     * @return StartRobotTaskResponse
     */
    public StartRobotTaskResponse startRobotTask(StartRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the inbound call that is transferred from a China 400 number.</p>
     * 
     * @param request StopCallInConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCallInConfigResponse
     */
    public StopCallInConfigResponse stopCallInConfigWithOptions(StopCallInConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
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
            new TeaPair("action", "StopCallInConfig"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCallInConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the inbound call that is transferred from a China 400 number.</p>
     * 
     * @param request StopCallInConfigRequest
     * @return StopCallInConfigResponse
     */
    public StopCallInConfigResponse stopCallInConfig(StopCallInConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCallInConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you stop a robocall task, you can call the <a href="~~StartRobotTask~~">StartRobotTask</a> operation to start it again.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a robocall task that is in progress.</p>
     * 
     * @param request StopRobotTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopRobotTaskResponse
     */
    public StopRobotTaskResponse stopRobotTaskWithOptions(StopRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRobotTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRobotTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you stop a robocall task, you can call the <a href="~~StartRobotTask~~">StartRobotTask</a> operation to start it again.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a robocall task that is in progress.</p>
     * 
     * @param request StopRobotTaskRequest
     * @return StopRobotTaskResponse
     */
    public StopRobotTaskResponse stopRobotTask(StopRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRobotTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a 400 number for registration.</p>
     * 
     * @param request SubmitHotlineTransferRegisterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitHotlineTransferRegisterResponse
     */
    public SubmitHotlineTransferRegisterResponse submitHotlineTransferRegisterWithOptions(SubmitHotlineTransferRegisterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreement)) {
            query.put("Agreement", request.agreement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotlineNumber)) {
            query.put("HotlineNumber", request.hotlineNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorIdentityCard)) {
            query.put("OperatorIdentityCard", request.operatorIdentityCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorMail)) {
            query.put("OperatorMail", request.operatorMail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorMailVerifyCode)) {
            query.put("OperatorMailVerifyCode", request.operatorMailVerifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorMobile)) {
            query.put("OperatorMobile", request.operatorMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorMobileVerifyCode)) {
            query.put("OperatorMobileVerifyCode", request.operatorMobileVerifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorName)) {
            query.put("OperatorName", request.operatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferPhoneNumberInfos)) {
            query.put("TransferPhoneNumberInfos", request.transferPhoneNumberInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitHotlineTransferRegister"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotlineTransferRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a 400 number for registration.</p>
     * 
     * @param request SubmitHotlineTransferRegisterRequest
     * @return SubmitHotlineTransferRegisterResponse
     */
    public SubmitHotlineTransferRegisterResponse submitHotlineTransferRegister(SubmitHotlineTransferRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotlineTransferRegisterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades from a voice call to a video call.</p>
     * 
     * @param request UpgradeVideoFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeVideoFileResponse
     */
    public UpgradeVideoFileResponse upgradeVideoFileWithOptions(UpgradeVideoFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callId)) {
            query.put("CallId", request.callId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
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
            new TeaPair("action", "UpgradeVideoFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeVideoFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades from a voice call to a video call.</p>
     * 
     * @param request UpgradeVideoFileRequest
     * @return UpgradeVideoFileResponse
     */
    public UpgradeVideoFileResponse upgradeVideoFile(UpgradeVideoFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeVideoFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads the called numbers of a robocall task.</p>
     * 
     * @param request UploadRobotTaskCalledFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadRobotTaskCalledFileResponse
     */
    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFileWithOptions(UploadRobotTaskCalledFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParam)) {
            query.put("TtsParam", request.ttsParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsParamHead)) {
            query.put("TtsParamHead", request.ttsParamHead);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadRobotTaskCalledFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadRobotTaskCalledFileResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads the called numbers of a robocall task.</p>
     * 
     * @param request UploadRobotTaskCalledFileRequest
     * @return UploadRobotTaskCalledFileResponse
     */
    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRobotTaskCalledFileWithOptions(request, runtime);
    }
}
