// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901;

import com.aliyun.tea.*;
import com.aliyun.expressconnectrouter20230901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("expressconnectrouter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Enables log delivery.</p>
     * 
     * @param request ActivateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateFlowLogResponse
     */
    public ActivateFlowLogResponse activateFlowLogWithOptions(ActivateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            body.put("FlowLogId", request.flowLogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateFlowLog"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateFlowLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ActivateFlowLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Enables log delivery.</p>
     * 
     * @param request ActivateFlowLogRequest
     * @return ActivateFlowLogResponse
     */
    public ActivateFlowLogResponse activateFlowLog(ActivateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>AttachExpressConnectRouterChildInstance</strong> operation to associate a VBR with an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a virtual border router (VBR) with an Express Connect router (ECR).</p>
     * 
     * @param request AttachExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachExpressConnectRouterChildInstanceResponse
     */
    public AttachExpressConnectRouterChildInstanceResponse attachExpressConnectRouterChildInstanceWithOptions(AttachExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceOwnerId)) {
            body.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            body.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AttachExpressConnectRouterChildInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AttachExpressConnectRouterChildInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>AttachExpressConnectRouterChildInstance</strong> operation to associate a VBR with an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a virtual border router (VBR) with an Express Connect router (ECR).</p>
     * 
     * @param request AttachExpressConnectRouterChildInstanceRequest
     * @return AttachExpressConnectRouterChildInstanceResponse
     */
    public AttachExpressConnectRouterChildInstanceResponse attachExpressConnectRouterChildInstance(AttachExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the Cloud Data Transfer (CDT) service required to add a region to an Express Connect router (ECR).</p>
     * 
     * @param request CheckAddRegionToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAddRegionToExpressConnectRouterResponse
     */
    public CheckAddRegionToExpressConnectRouterResponse checkAddRegionToExpressConnectRouterWithOptions(CheckAddRegionToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.freshRegionId)) {
            body.put("FreshRegionId", request.freshRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAddRegionToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAddRegionToExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckAddRegionToExpressConnectRouterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Checks the Cloud Data Transfer (CDT) service required to add a region to an Express Connect router (ECR).</p>
     * 
     * @param request CheckAddRegionToExpressConnectRouterRequest
     * @return CheckAddRegionToExpressConnectRouterResponse
     */
    public CheckAddRegionToExpressConnectRouterResponse checkAddRegionToExpressConnectRouter(CheckAddRegionToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAddRegionToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create an ECR, it enters the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Express Connect Router (ECR).</p>
     * 
     * @param request CreateExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExpressConnectRouterResponse
     */
    public CreateExpressConnectRouterResponse createExpressConnectRouterWithOptions(CreateExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alibabaSideAsn)) {
            body.put("AlibabaSideAsn", request.alibabaSideAsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateExpressConnectRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you create an ECR, it enters the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Express Connect Router (ECR).</p>
     * 
     * @param request CreateExpressConnectRouterRequest
     * @return CreateExpressConnectRouterResponse
     */
    public CreateExpressConnectRouterResponse createExpressConnectRouter(CreateExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a virtual private cloud (VPC) or a transit router (TR) with an Express Connect router (ECR).</p>
     * 
     * @param request CreateExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExpressConnectRouterAssociationResponse
     */
    public CreateExpressConnectRouterAssociationResponse createExpressConnectRouterAssociationWithOptions(CreateExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixes)) {
            body.put("AllowedPrefixes", request.allowedPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixesMode)) {
            body.put("AllowedPrefixesMode", request.allowedPrefixesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationRegionId)) {
            body.put("AssociationRegionId", request.associationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createAttachment)) {
            body.put("CreateAttachment", request.createAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            body.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterOwnerId)) {
            body.put("TransitRouterOwnerId", request.transitRouterOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcOwnerId)) {
            body.put("VpcOwnerId", request.vpcOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExpressConnectRouterAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateExpressConnectRouterAssociationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Associates a virtual private cloud (VPC) or a transit router (TR) with an Express Connect router (ECR).</p>
     * 
     * @param request CreateExpressConnectRouterAssociationRequest
     * @return CreateExpressConnectRouterAssociationResponse
     */
    public CreateExpressConnectRouterAssociationResponse createExpressConnectRouterAssociation(CreateExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流日志</p>
     * 
     * @param request CreateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowLogResponse
     */
    public CreateFlowLogResponse createFlowLogWithOptions(CreateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRate)) {
            query.put("SamplingRate", request.samplingRate);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            body.put("FlowLogName", request.flowLogName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowLog"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFlowLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建流日志</p>
     * 
     * @param request CreateFlowLogRequest
     * @return CreateFlowLogResponse
     */
    public CreateFlowLogResponse createFlowLog(CreateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止流日志</p>
     * 
     * @param request DeactivateFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactivateFlowLogResponse
     */
    public DeactivateFlowLogResponse deactivateFlowLogWithOptions(DeactivateFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            body.put("FlowLogId", request.flowLogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateFlowLog"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateFlowLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeactivateFlowLogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>停止流日志</p>
     * 
     * @param request DeactivateFlowLogRequest
     * @return DeactivateFlowLogResponse
     */
    public DeactivateFlowLogResponse deactivateFlowLog(DeactivateFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Before you call this operation, make sure that all resources are disassociated from the ECR.</li>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect router (ECR).</p>
     * 
     * @param request DeleteExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExpressConnectRouterResponse
     */
    public DeleteExpressConnectRouterResponse deleteExpressConnectRouterWithOptions(DeleteExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteExpressConnectRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Before you call this operation, make sure that all resources are disassociated from the ECR.</li>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect router (ECR).</p>
     * 
     * @param request DeleteExpressConnectRouterRequest
     * @return DeleteExpressConnectRouterResponse
     */
    public DeleteExpressConnectRouterResponse deleteExpressConnectRouter(DeleteExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an Express Connect router (ECR) from a virtual private cloud (VPC) or a transit router (TR).</p>
     * 
     * @param request DeleteExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExpressConnectRouterAssociationResponse
     */
    public DeleteExpressConnectRouterAssociationResponse deleteExpressConnectRouterAssociationWithOptions(DeleteExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAttachment)) {
            body.put("DeleteAttachment", request.deleteAttachment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExpressConnectRouterAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteExpressConnectRouterAssociationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an Express Connect router (ECR) from a virtual private cloud (VPC) or a transit router (TR).</p>
     * 
     * @param request DeleteExpressConnectRouterAssociationRequest
     * @return DeleteExpressConnectRouterAssociationResponse
     */
    public DeleteExpressConnectRouterAssociationResponse deleteExpressConnectRouterAssociation(DeleteExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流日志</p>
     * 
     * @param request DeleteFlowlogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowlogResponse
     */
    public DeleteFlowlogResponse deleteFlowlogWithOptions(DeleteFlowlogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowlog"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowlogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFlowlogResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>删除流日志</p>
     * 
     * @param request DeleteFlowlogRequest
     * @return DeleteFlowlogResponse
     */
    public DeleteFlowlogResponse deleteFlowlog(DeleteFlowlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowlogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries that are disabled on an Express Connect router (ECR).</p>
     * 
     * @param request DescribeDisabledExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDisabledExpressConnectRouterRouteEntriesResponse
     */
    public DescribeDisabledExpressConnectRouterRouteEntriesResponse describeDisabledExpressConnectRouterRouteEntriesWithOptions(DescribeDisabledExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisabledExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisabledExpressConnectRouterRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeDisabledExpressConnectRouterRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries that are disabled on an Express Connect router (ECR).</p>
     * 
     * @param request DescribeDisabledExpressConnectRouterRouteEntriesRequest
     * @return DescribeDisabledExpressConnectRouterRouteEntriesResponse
     */
    public DescribeDisabledExpressConnectRouterRouteEntriesResponse describeDisabledExpressConnectRouterRouteEntries(DescribeDisabledExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisabledExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Express Connect routers (ECRs).</p>
     * 
     * @param request DescribeExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterResponse
     */
    public DescribeExpressConnectRouterResponse describeExpressConnectRouterWithOptions(DescribeExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Express Connect routers (ECRs).</p>
     * 
     * @param request DescribeExpressConnectRouterRequest
     * @return DescribeExpressConnectRouterResponse
     */
    public DescribeExpressConnectRouterResponse describeExpressConnectRouter(DescribeExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical route prefixes of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterAllowedPrefixHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterAllowedPrefixHistoryResponse
     */
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse describeExpressConnectRouterAllowedPrefixHistoryWithOptions(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterAllowedPrefixHistory"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterAllowedPrefixHistoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterAllowedPrefixHistoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical route prefixes of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterAllowedPrefixHistoryRequest
     * @return DescribeExpressConnectRouterAllowedPrefixHistoryResponse
     */
    public DescribeExpressConnectRouterAllowedPrefixHistoryResponse describeExpressConnectRouterAllowedPrefixHistory(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterAllowedPrefixHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private clouds (VPCs) and transit routers (TRs) associated with an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterAssociationResponse
     */
    public DescribeExpressConnectRouterAssociationResponse describeExpressConnectRouterAssociationWithOptions(DescribeExpressConnectRouterAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationNodeType)) {
            body.put("AssociationNodeType", request.associationNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationRegionId)) {
            body.put("AssociationRegionId", request.associationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            body.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterAssociation"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterAssociationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private clouds (VPCs) and transit routers (TRs) associated with an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterAssociationRequest
     * @return DescribeExpressConnectRouterAssociationResponse
     */
    public DescribeExpressConnectRouterAssociationResponse describeExpressConnectRouterAssociation(DescribeExpressConnectRouterAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual border routers (VBRs) that are associated with an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterChildInstanceResponse
     */
    public DescribeExpressConnectRouterChildInstanceResponse describeExpressConnectRouterChildInstanceWithOptions(DescribeExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            body.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterChildInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterChildInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual border routers (VBRs) that are associated with an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterChildInstanceRequest
     * @return DescribeExpressConnectRouterChildInstanceResponse
     */
    public DescribeExpressConnectRouterChildInstanceResponse describeExpressConnectRouterChildInstance(DescribeExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cross-region forwarding modes of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterInterRegionTransitModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterInterRegionTransitModeResponse
     */
    public DescribeExpressConnectRouterInterRegionTransitModeResponse describeExpressConnectRouterInterRegionTransitModeWithOptions(DescribeExpressConnectRouterInterRegionTransitModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterInterRegionTransitMode"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterInterRegionTransitModeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterInterRegionTransitModeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cross-region forwarding modes of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterInterRegionTransitModeRequest
     * @return DescribeExpressConnectRouterInterRegionTransitModeResponse
     */
    public DescribeExpressConnectRouterInterRegionTransitModeResponse describeExpressConnectRouterInterRegionTransitMode(DescribeExpressConnectRouterInterRegionTransitModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterInterRegionTransitModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions in which resources related to an Express Connect router (ECR) are deployed.</p>
     * 
     * @param request DescribeExpressConnectRouterRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterRegionResponse
     */
    public DescribeExpressConnectRouterRegionResponse describeExpressConnectRouterRegionWithOptions(DescribeExpressConnectRouterRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterRegion"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterRegionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterRegionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions in which resources related to an Express Connect router (ECR) are deployed.</p>
     * 
     * @param request DescribeExpressConnectRouterRegionRequest
     * @return DescribeExpressConnectRouterRegionResponse
     */
    public DescribeExpressConnectRouterRegionResponse describeExpressConnectRouterRegion(DescribeExpressConnectRouterRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExpressConnectRouterRouteEntriesResponse
     */
    public DescribeExpressConnectRouterRouteEntriesResponse describeExpressConnectRouterRouteEntriesWithOptions(DescribeExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asPath)) {
            body.put("AsPath", request.asPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.community)) {
            body.put("Community", request.community);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRegionId)) {
            body.put("QueryRegionId", request.queryRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExpressConnectRouterRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeExpressConnectRouterRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of an Express Connect router (ECR).</p>
     * 
     * @param request DescribeExpressConnectRouterRouteEntriesRequest
     * @return DescribeExpressConnectRouterRouteEntriesResponse
     */
    public DescribeExpressConnectRouterRouteEntriesResponse describeExpressConnectRouterRouteEntries(DescribeExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流日志</p>
     * 
     * @param request DescribeFlowLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowLogsResponse
     */
    public DescribeFlowLogsResponse describeFlowLogsWithOptions(DescribeFlowLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            query.put("FlowLogName", request.flowLogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowLogs"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowLogsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeFlowLogsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询流日志</p>
     * 
     * @param request DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     */
    public DescribeFlowLogsResponse describeFlowLogs(DescribeFlowLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network instances whose permissions are granted to an Express Connect router (ECR).</p>
     * 
     * @param request DescribeInstanceGrantedToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceGrantedToExpressConnectRouterResponse
     */
    public DescribeInstanceGrantedToExpressConnectRouterResponse describeInstanceGrantedToExpressConnectRouterWithOptions(DescribeInstanceGrantedToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            body.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagModels)) {
            body.put("TagModels", request.tagModels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceGrantedToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceGrantedToExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInstanceGrantedToExpressConnectRouterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network instances whose permissions are granted to an Express Connect router (ECR).</p>
     * 
     * @param request DescribeInstanceGrantedToExpressConnectRouterRequest
     * @return DescribeInstanceGrantedToExpressConnectRouterResponse
     */
    public DescribeInstanceGrantedToExpressConnectRouterResponse describeInstanceGrantedToExpressConnectRouter(DescribeInstanceGrantedToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceGrantedToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DetachExpressConnectRouterChildInstance</strong> operation to uninstall a VBR from an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a virtual border router (VBR) from an Express Connect router (ECR).</p>
     * 
     * @param request DetachExpressConnectRouterChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachExpressConnectRouterChildInstanceResponse
     */
    public DetachExpressConnectRouterChildInstanceResponse detachExpressConnectRouterChildInstanceWithOptions(DetachExpressConnectRouterChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            body.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            body.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachExpressConnectRouterChildInstance"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetachExpressConnectRouterChildInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetachExpressConnectRouterChildInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DetachExpressConnectRouterChildInstance</strong> operation to uninstall a VBR from an ECR, make sure that the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a virtual border router (VBR) from an Express Connect router (ECR).</p>
     * 
     * @param request DetachExpressConnectRouterChildInstanceRequest
     * @return DetachExpressConnectRouterChildInstanceResponse
     */
    public DetachExpressConnectRouterChildInstanceResponse detachExpressConnectRouterChildInstance(DetachExpressConnectRouterChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachExpressConnectRouterChildInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables route entries of an Express Connect router (ECR).</p>
     * 
     * @param request DisableExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableExpressConnectRouterRouteEntriesResponse
     */
    public DisableExpressConnectRouterRouteEntriesResponse disableExpressConnectRouterRouteEntriesWithOptions(DisableExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableExpressConnectRouterRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableExpressConnectRouterRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Disables route entries of an Express Connect router (ECR).</p>
     * 
     * @param request DisableExpressConnectRouterRouteEntriesRequest
     * @return DisableExpressConnectRouterRouteEntriesResponse
     */
    public DisableExpressConnectRouterRouteEntriesResponse disableExpressConnectRouterRouteEntries(DisableExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables route entries of an Express Connect router (ECR).</p>
     * 
     * @param request EnableExpressConnectRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableExpressConnectRouterRouteEntriesResponse
     */
    public EnableExpressConnectRouterRouteEntriesResponse enableExpressConnectRouterRouteEntriesWithOptions(EnableExpressConnectRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nexthopInstanceId)) {
            body.put("NexthopInstanceId", request.nexthopInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableExpressConnectRouterRouteEntries"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableExpressConnectRouterRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableExpressConnectRouterRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Enables route entries of an Express Connect router (ECR).</p>
     * 
     * @param request EnableExpressConnectRouterRouteEntriesRequest
     * @return EnableExpressConnectRouterRouteEntriesResponse
     */
    public EnableExpressConnectRouterRouteEntriesResponse enableExpressConnectRouterRouteEntries(EnableExpressConnectRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableExpressConnectRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you forcefully delete an ECR, all the resources associated with the ECR are disassociated at a time. Make sure that the disassociation does not affect the stability of your business.</p>
     * <ul>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect router (ECR) and disassociates the virtual private cloud (VPC), transit router (TR), and virtual border router (VBR) associated with the ECR.</p>
     * 
     * @param request ForceDeleteExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForceDeleteExpressConnectRouterResponse
     */
    public ForceDeleteExpressConnectRouterResponse forceDeleteExpressConnectRouterWithOptions(ForceDeleteExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceDeleteExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ForceDeleteExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ForceDeleteExpressConnectRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  If you forcefully delete an ECR, all the resources associated with the ECR are disassociated at a time. Make sure that the disassociation does not affect the stability of your business.</p>
     * <ul>
     * <li>You can delete only ECRs that are in the <strong>Active</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect router (ECR) and disassociates the virtual private cloud (VPC), transit router (TR), and virtual border router (VBR) associated with the ECR.</p>
     * 
     * @param request ForceDeleteExpressConnectRouterRequest
     * @return ForceDeleteExpressConnectRouterResponse
     */
    public ForceDeleteExpressConnectRouterResponse forceDeleteExpressConnectRouter(ForceDeleteExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forceDeleteExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you associate a network instance of another account with an ECR, you must grant permissions on the network instance to the ECR.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions on a virtual private cloud (VPC) or a virtual border router (VBR) to an Express Connect router (ECR) of another account.</p>
     * 
     * @param request GrantInstanceToExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantInstanceToExpressConnectRouterResponse
     */
    public GrantInstanceToExpressConnectRouterResponse grantInstanceToExpressConnectRouterWithOptions(GrantInstanceToExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrOwnerAliUid)) {
            body.put("EcrOwnerAliUid", request.ecrOwnerAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantInstanceToExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GrantInstanceToExpressConnectRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you associate a network instance of another account with an ECR, you must grant permissions on the network instance to the ECR.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions on a virtual private cloud (VPC) or a virtual border router (VBR) to an Express Connect router (ECR) of another account.</p>
     * 
     * @param request GrantInstanceToExpressConnectRouterRequest
     * @return GrantInstanceToExpressConnectRouterResponse
     */
    public GrantInstanceToExpressConnectRouterResponse grantInstanceToExpressConnectRouter(GrantInstanceToExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantInstanceToExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions in which the Express Connect router (ECR) feature is activated.</p>
     * 
     * @param request ListExpressConnectRouterSupportedRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExpressConnectRouterSupportedRegionResponse
     */
    public ListExpressConnectRouterSupportedRegionResponse listExpressConnectRouterSupportedRegionWithOptions(ListExpressConnectRouterSupportedRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("NodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExpressConnectRouterSupportedRegion"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListExpressConnectRouterSupportedRegionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListExpressConnectRouterSupportedRegionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions in which the Express Connect router (ECR) feature is activated.</p>
     * 
     * @param request ListExpressConnectRouterSupportedRegionRequest
     * @return ListExpressConnectRouterSupportedRegionResponse
     */
    public ListExpressConnectRouterSupportedRegionResponse listExpressConnectRouterSupportedRegion(ListExpressConnectRouterSupportedRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExpressConnectRouterSupportedRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags that are added to an Express Connect router (ECR).</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags that are added to an Express Connect router (ECR).</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify only properties of ECRs in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the properties such as the name of an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterResponse
     */
    public ModifyExpressConnectRouterResponse modifyExpressConnectRouterWithOptions(ModifyExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyExpressConnectRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can modify only properties of ECRs in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the properties such as the name of an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterRequest
     * @return ModifyExpressConnectRouterResponse
     */
    public ModifyExpressConnectRouterResponse modifyExpressConnectRouter(ModifyExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the route prefixes of a virtual private cloud (VPC) or a transit router (TR) that is associated with an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterAssociationAllowedPrefixRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterAssociationAllowedPrefixResponse
     */
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse modifyExpressConnectRouterAssociationAllowedPrefixWithOptions(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixes)) {
            body.put("AllowedPrefixes", request.allowedPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedPrefixesMode)) {
            body.put("AllowedPrefixesMode", request.allowedPrefixesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associationId)) {
            body.put("AssociationId", request.associationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            body.put("OwnerAccount", request.ownerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouterAssociationAllowedPrefix"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterAssociationAllowedPrefixResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyExpressConnectRouterAssociationAllowedPrefixResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the route prefixes of a virtual private cloud (VPC) or a transit router (TR) that is associated with an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterAssociationAllowedPrefixRequest
     * @return ModifyExpressConnectRouterAssociationAllowedPrefixResponse
     */
    public ModifyExpressConnectRouterAssociationAllowedPrefixResponse modifyExpressConnectRouterAssociationAllowedPrefix(ModifyExpressConnectRouterAssociationAllowedPrefixRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterAssociationAllowedPrefixWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cross-region forwarding mode of an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterInterRegionTransitModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExpressConnectRouterInterRegionTransitModeResponse
     */
    public ModifyExpressConnectRouterInterRegionTransitModeResponse modifyExpressConnectRouterInterRegionTransitModeWithOptions(ModifyExpressConnectRouterInterRegionTransitModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitModeList)) {
            body.put("TransitModeList", request.transitModeList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExpressConnectRouterInterRegionTransitMode"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExpressConnectRouterInterRegionTransitModeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyExpressConnectRouterInterRegionTransitModeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the cross-region forwarding mode of an Express Connect router (ECR).</p>
     * 
     * @param request ModifyExpressConnectRouterInterRegionTransitModeRequest
     * @return ModifyExpressConnectRouterInterRegionTransitModeResponse
     */
    public ModifyExpressConnectRouterInterRegionTransitModeResponse modifyExpressConnectRouterInterRegionTransitMode(ModifyExpressConnectRouterInterRegionTransitModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExpressConnectRouterInterRegionTransitModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改流日志</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingRate)) {
            query.put("SamplingRate", request.samplingRate);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            body.put("FlowLogName", request.flowLogName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFlowLogAttribute"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowLogAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyFlowLogAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>修改流日志</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which an Express Connect router (ECR) belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new MoveResourceGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which an Express Connect router (ECR) belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on a virtual private cloud (VPC) or a virtual border router (VBR) from an Express Connect router (ECR) owned by another account.</p>
     * 
     * @param request RevokeInstanceFromExpressConnectRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceFromExpressConnectRouterResponse
     */
    public RevokeInstanceFromExpressConnectRouterResponse revokeInstanceFromExpressConnectRouterWithOptions(RevokeInstanceFromExpressConnectRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrOwnerAliUid)) {
            body.put("EcrOwnerAliUid", request.ecrOwnerAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            body.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeInstanceFromExpressConnectRouter"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromExpressConnectRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RevokeInstanceFromExpressConnectRouterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions on a virtual private cloud (VPC) or a virtual border router (VBR) from an Express Connect router (ECR) owned by another account.</p>
     * 
     * @param request RevokeInstanceFromExpressConnectRouterRequest
     * @return RevokeInstanceFromExpressConnectRouterResponse
     */
    public RevokeInstanceFromExpressConnectRouterResponse revokeInstanceFromExpressConnectRouter(RevokeInstanceFromExpressConnectRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromExpressConnectRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates are allowed only when the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the forwarding bandwidth limit between regions for an Express Connect router (ECR).</p>
     * 
     * @param request SynchronizeExpressConnectRouterInterRegionBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeExpressConnectRouterInterRegionBandwidthResponse
     */
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse synchronizeExpressConnectRouterInterRegionBandwidthWithOptions(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            body.put("EcrId", request.ecrId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeExpressConnectRouterInterRegionBandwidth"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeExpressConnectRouterInterRegionBandwidthResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SynchronizeExpressConnectRouterInterRegionBandwidthResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Updates are allowed only when the ECR is in the <strong>Active</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the forwarding bandwidth limit between regions for an Express Connect router (ECR).</p>
     * 
     * @param request SynchronizeExpressConnectRouterInterRegionBandwidthRequest
     * @return SynchronizeExpressConnectRouterInterRegionBandwidthResponse
     */
    public SynchronizeExpressConnectRouterInterRegionBandwidthResponse synchronizeExpressConnectRouterInterRegionBandwidth(SynchronizeExpressConnectRouterInterRegionBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeExpressConnectRouterInterRegionBandwidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to an Express Connect router (ECR). You can add tags to only one ECR each time you call this operation. You can add multiple tags at a time.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to an Express Connect router (ECR). You can add tags to only one ECR each time you call this operation. You can add multiple tags at a time.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from an Express Connect router (ECR).</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            body.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2023-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UntagResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from an Express Connect router (ECR).</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
