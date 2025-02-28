// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912;

import com.aliyun.tea.*;
import com.aliyun.cbn20170912.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cbn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  After you create a flow log, it is enabled by default. You can call this operation to enable a disabled flow log.</p>
     * <ul>
     * <li><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being enabled. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a flow log. After the flow log is enabled, the system collects traffic information about a specified resource.</p>
     * 
     * @param request ActiveFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveFlowLogResponse
     */
    public ActiveFlowLogResponse activeFlowLogWithOptions(ActiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ActiveFlowLog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveFlowLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ActiveFlowLogResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  After you create a flow log, it is enabled by default. You can call this operation to enable a disabled flow log.</p>
     * <ul>
     * <li><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being enabled. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is enabled.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a flow log. After the flow log is enabled, the system collects traffic information about a specified resource.</p>
     * 
     * @param request ActiveFlowLogRequest
     * @return ActiveFlowLogResponse
     */
    public ActiveFlowLogResponse activeFlowLog(ActiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.</p>
     * <ul>
     * <li>If a traffic classification rule is in the <strong>Creating</strong> state, the traffic classification rule is being created. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule is in the <strong>Active</strong> state, the traffic classification rule is added to the traffic marking policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a traffic classification rule to a traffic marking policy.</p>
     * 
     * @param request AddTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    public AddTrafficMatchRuleToTrafficMarkingPolicyResponse addTrafficMatchRuleToTrafficMarkingPolicyWithOptions(AddTrafficMatchRuleToTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRules)) {
            query.put("TrafficMatchRules", request.trafficMatchRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTrafficMatchRuleToTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddTrafficMatchRuleToTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddTrafficMatchRuleToTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.</p>
     * <ul>
     * <li>If a traffic classification rule is in the <strong>Creating</strong> state, the traffic classification rule is being created. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule is in the <strong>Active</strong> state, the traffic classification rule is added to the traffic marking policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a traffic classification rule to a traffic marking policy.</p>
     * 
     * @param request AddTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    public AddTrafficMatchRuleToTrafficMarkingPolicyResponse addTrafficMatchRuleToTrafficMarkingPolicy(AddTrafficMatchRuleToTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTrafficMatchRuleToTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>The <strong>AddTraficMatchRuleToTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued soon. If you need to add a traffic classification rule to a traffic marking policy, call the <a href="https://help.aliyun.com/document_detail/427602.html">AddTrafficMatchRuleToTrafficMarkingPolicy</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a traffic classification rule to a traffic marking policy.</p>
     * 
     * @deprecated OpenAPI AddTraficMatchRuleToTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::AddTrafficMatchRuleToTrafficMarkingPolicy instead.
     * 
     * @param request AddTraficMatchRuleToTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTraficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Deprecated
    // Deprecated
    public AddTraficMatchRuleToTrafficMarkingPolicyResponse addTraficMatchRuleToTrafficMarkingPolicyWithOptions(AddTraficMatchRuleToTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRules)) {
            query.put("TrafficMatchRules", request.trafficMatchRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTraficMatchRuleToTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddTraficMatchRuleToTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddTraficMatchRuleToTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>The <strong>AddTraficMatchRuleToTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued soon. If you need to add a traffic classification rule to a traffic marking policy, call the <a href="https://help.aliyun.com/document_detail/427602.html">AddTrafficMatchRuleToTrafficMarkingPolicy</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a traffic classification rule to a traffic marking policy.</p>
     * 
     * @deprecated OpenAPI AddTraficMatchRuleToTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::AddTrafficMatchRuleToTrafficMarkingPolicy instead.
     * 
     * @param request AddTraficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTraficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Deprecated
    // Deprecated
    public AddTraficMatchRuleToTrafficMarkingPolicyResponse addTraficMatchRuleToTrafficMarkingPolicy(AddTraficMatchRuleToTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTraficMatchRuleToTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can associate multiple bandwidth plans with a CEN instance. However, the pair of areas connected by each bandwidth plan must be unique.
     * For example, if a CEN instance is associated with a bandwidth plan that connects networks in the Chinese mainland, you cannot associate another bandwidth plan that also connects networks in the Chinese mainland with the CEN instance. However, you can associate a bandwidth plan that connects the Chinese mainland to North America with the CEN instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan with a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AssociateCenBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateCenBandwidthPackageResponse
     */
    public AssociateCenBandwidthPackageResponse associateCenBandwidthPackageWithOptions(AssociateCenBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "AssociateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateCenBandwidthPackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssociateCenBandwidthPackageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can associate multiple bandwidth plans with a CEN instance. However, the pair of areas connected by each bandwidth plan must be unique.
     * For example, if a CEN instance is associated with a bandwidth plan that connects networks in the Chinese mainland, you cannot associate another bandwidth plan that also connects networks in the Chinese mainland with the CEN instance. However, you can associate a bandwidth plan that connects the Chinese mainland to North America with the CEN instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth plan with a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AssociateCenBandwidthPackageRequest
     * @return AssociateCenBandwidthPackageResponse
     */
    public AssociateCenBandwidthPackageResponse associateCenBandwidthPackage(AssociateCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with the route table of an Enterprise Edition transit router. The Enterprise Edition transit router forwards traffic for the network instance based on the routes in the route table. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>Only route tables of Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li>Each network instance connection can have an associated forwarding correlation with only one route table of only one Enterprise Edition transit router.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query the status of an associated forwarding correlation.<ul>
     * <li>If an associated forwarding correlation is in the <strong>Associating</strong> state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation is in the <strong>Active</strong> state, the associated forwarding correlation is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an associated forwarding correlation.</p>
     * 
     * @param request AssociateTransitRouterAttachmentWithRouteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateTransitRouterAttachmentWithRouteTableResponse
     */
    public AssociateTransitRouterAttachmentWithRouteTableResponse associateTransitRouterAttachmentWithRouteTableWithOptions(AssociateTransitRouterAttachmentWithRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateTransitRouterAttachmentWithRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTransitRouterAttachmentWithRouteTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssociateTransitRouterAttachmentWithRouteTableResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with the route table of an Enterprise Edition transit router. The Enterprise Edition transit router forwards traffic for the network instance based on the routes in the route table. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>Only route tables of Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li>Each network instance connection can have an associated forwarding correlation with only one route table of only one Enterprise Edition transit router.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query the status of an associated forwarding correlation.<ul>
     * <li>If an associated forwarding correlation is in the <strong>Associating</strong> state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation is in the <strong>Active</strong> state, the associated forwarding correlation is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an associated forwarding correlation.</p>
     * 
     * @param request AssociateTransitRouterAttachmentWithRouteTableRequest
     * @return AssociateTransitRouterAttachmentWithRouteTableResponse
     */
    public AssociateTransitRouterAttachmentWithRouteTableResponse associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateTransitRouterAttachmentWithRouteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch is not associated with other multicast domains. For more information about how to disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>AssociateTransitRouterMulticastDomain is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterMulticastDomainAssociations operation to query whether a vSwitch is associated with the specified multicast domain.<ul>
     * <li>If the status is Associating, it indicates that the vSwitch is being associated with the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the status is Associated, the vSwitch is associated with the specified multicast domain.</li>
     * </ul>
     * </li>
     * <li>The VPC of the vSwitch must be associated with an Enterprise Edition transit router. For more information about how to associate a VPC with an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the vSwitch of a virtual private cloud (VPC) with a multicast domain.</p>
     * 
     * @param request AssociateTransitRouterMulticastDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateTransitRouterMulticastDomainResponse
     */
    public AssociateTransitRouterMulticastDomainResponse associateTransitRouterMulticastDomainWithOptions(AssociateTransitRouterMulticastDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateTransitRouterMulticastDomain"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTransitRouterMulticastDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssociateTransitRouterMulticastDomainResponse());
        }

    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch is not associated with other multicast domains. For more information about how to disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>AssociateTransitRouterMulticastDomain is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterMulticastDomainAssociations operation to query whether a vSwitch is associated with the specified multicast domain.<ul>
     * <li>If the status is Associating, it indicates that the vSwitch is being associated with the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the status is Associated, the vSwitch is associated with the specified multicast domain.</li>
     * </ul>
     * </li>
     * <li>The VPC of the vSwitch must be associated with an Enterprise Edition transit router. For more information about how to associate a VPC with an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the vSwitch of a virtual private cloud (VPC) with a multicast domain.</p>
     * 
     * @param request AssociateTransitRouterMulticastDomainRequest
     * @return AssociateTransitRouterMulticastDomainResponse
     */
    public AssociateTransitRouterMulticastDomainResponse associateTransitRouterMulticastDomain(AssociateTransitRouterMulticastDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateTransitRouterMulticastDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>CEN allows you to attach a network instance that belongs to another Alibaba Cloud account to your CEN instance. Before you attach the network instance, CEN must acquire permissions to access the network instance that belongs to another Alibaba Cloud account.</p>
     * <ul>
     * <li>For more information about how to grant CEN permissions on virtual private clouds (VPCs) that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For more information about how to grant CEN permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>By default, you cannot grant permissions on virtual border routers (VBRs) that belong to another Alibaba Cloud account to a CEN instance. If you need to use this feature, contact your account manager.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches a network instance to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AttachCenChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachCenChildInstanceResponse
     */
    public AttachCenChildInstanceResponse attachCenChildInstanceWithOptions(AttachCenChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceOwnerId)) {
            query.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "AttachCenChildInstance"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCenChildInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AttachCenChildInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>CEN allows you to attach a network instance that belongs to another Alibaba Cloud account to your CEN instance. Before you attach the network instance, CEN must acquire permissions to access the network instance that belongs to another Alibaba Cloud account.</p>
     * <ul>
     * <li>For more information about how to grant CEN permissions on virtual private clouds (VPCs) that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For more information about how to grant CEN permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>By default, you cannot grant permissions on virtual border routers (VBRs) that belong to another Alibaba Cloud account to a CEN instance. If you need to use this feature, contact your account manager.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches a network instance to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AttachCenChildInstanceRequest
     * @return AttachCenChildInstanceResponse
     */
    public AttachCenChildInstanceResponse attachCenChildInstance(AttachCenChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachCenChildInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether your Alibaba Cloud account has the transit router feature activated.</p>
     * 
     * @param request CheckTransitRouterServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckTransitRouterServiceResponse
     */
    public CheckTransitRouterServiceResponse checkTransitRouterServiceWithOptions(CheckTransitRouterServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "CheckTransitRouterService"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTransitRouterServiceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckTransitRouterServiceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether your Alibaba Cloud account has the transit router feature activated.</p>
     * 
     * @param request CheckTransitRouterServiceRequest
     * @return CheckTransitRouterServiceResponse
     */
    public CheckTransitRouterServiceResponse checkTransitRouterService(CheckTransitRouterServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkTransitRouterServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateCen</em>* is an asynchronous operation. After you a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) instances are basic network resources that are used to manage interconnected networks. You can use a CEN instance to manage a network that covers one or multiple regions. Before you can connect network instances, you must first call the CreateCen operation to create a CEN instance.</p>
     * 
     * @param request CreateCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenResponse
     */
    public CreateCenResponse createCenWithOptions(CreateCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionLevel)) {
            query.put("ProtectionLevel", request.protectionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>CreateCen</em>* is an asynchronous operation. After you a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) instances are basic network resources that are used to manage interconnected networks. You can use a CEN instance to manage a network that covers one or multiple regions. Before you can connect network instances, you must first call the CreateCen operation to create a CEN instance.</p>
     * 
     * @param request CreateCenRequest
     * @return CreateCenResponse
     */
    public CreateCenResponse createCen(CreateCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You must specify the areas to be connected when you create a bandwidth plan. An area contains one or more Alibaba Cloud regions. When you select areas for a bandwidth plan, make sure that the areas contain the regions that you want to connect. For more information about the supported areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</p>
     * <ul>
     * <li>For more information about the billing rules, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns a bandwidth plan instance ID and runs the task in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of a bandwidth plan. If a bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan.</p>
     * 
     * @param request CreateCenBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenBandwidthPackageResponse
     */
    public CreateCenBandwidthPackageResponse createCenBandwidthPackageWithOptions(CreateCenBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthPackageChargeType)) {
            query.put("BandwidthPackageChargeType", request.bandwidthPackageChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.geographicRegionAId)) {
            query.put("GeographicRegionAId", request.geographicRegionAId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.geographicRegionBId)) {
            query.put("GeographicRegionBId", request.geographicRegionBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenBandwidthPackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenBandwidthPackageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You must specify the areas to be connected when you create a bandwidth plan. An area contains one or more Alibaba Cloud regions. When you select areas for a bandwidth plan, make sure that the areas contain the regions that you want to connect. For more information about the supported areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</p>
     * <ul>
     * <li>For more information about the billing rules, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns a bandwidth plan instance ID and runs the task in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of a bandwidth plan. If a bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan.</p>
     * 
     * @param request CreateCenBandwidthPackageRequest
     * @return CreateCenBandwidthPackageResponse
     */
    public CreateCenBandwidthPackageResponse createCenBandwidthPackage(CreateCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can add routes only to virtual private clouds (VPCs) or virtual border routers (VBRs) that are connected to an Enterprise Edition transit router.</p>
     * <ul>
     * <li>By default, the next hop of the routes is the <strong>transit router connection</strong>, which is the connection between the VBR and the Enterprise Edition transit router. You cannot modify the next hop.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Pending</strong> state, the route is being created. You can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Available</strong> state, the route is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance and sets the next hop of the destination CIDR block to the transit router in the current region.</p>
     * 
     * @param request CreateCenChildInstanceRouteEntryToAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenChildInstanceRouteEntryToAttachmentResponse
     */
    public CreateCenChildInstanceRouteEntryToAttachmentResponse createCenChildInstanceRouteEntryToAttachmentWithOptions(CreateCenChildInstanceRouteEntryToAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenChildInstanceRouteEntryToAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenChildInstanceRouteEntryToAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can add routes only to virtual private clouds (VPCs) or virtual border routers (VBRs) that are connected to an Enterprise Edition transit router.</p>
     * <ul>
     * <li>By default, the next hop of the routes is the <strong>transit router connection</strong>, which is the connection between the VBR and the Enterprise Edition transit router. You cannot modify the next hop.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Pending</strong> state, the route is being created. You can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Available</strong> state, the route is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance and sets the next hop of the destination CIDR block to the transit router in the current region.</p>
     * 
     * @param request CreateCenChildInstanceRouteEntryToAttachmentRequest
     * @return CreateCenChildInstanceRouteEntryToAttachmentResponse
     */
    public CreateCenChildInstanceRouteEntryToAttachmentResponse createCenChildInstanceRouteEntryToAttachment(CreateCenChildInstanceRouteEntryToAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenChildInstanceRouteEntryToAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the CreateCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation,<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot add a route entry to an Enterprise Edition transit router by calling the CreateCenChildInstanceRouteEntryToCen operation.</li>
     * <li>By default, the next hop of the route entry is the regional gateway of the Cloud Enterprise Network (CEN) instance. You cannot modify the next hop.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds routes to a network instance.</p>
     * 
     * @param request CreateCenChildInstanceRouteEntryToCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenChildInstanceRouteEntryToCenResponse
     */
    public CreateCenChildInstanceRouteEntryToCenResponse createCenChildInstanceRouteEntryToCenWithOptions(CreateCenChildInstanceRouteEntryToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceAliUid)) {
            query.put("ChildInstanceAliUid", request.childInstanceAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenChildInstanceRouteEntryToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenChildInstanceRouteEntryToCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the CreateCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation,<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot add a route entry to an Enterprise Edition transit router by calling the CreateCenChildInstanceRouteEntryToCen operation.</li>
     * <li>By default, the next hop of the route entry is the regional gateway of the Cloud Enterprise Network (CEN) instance. You cannot modify the next hop.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds routes to a network instance.</p>
     * 
     * @param request CreateCenChildInstanceRouteEntryToCenRequest
     * @return CreateCenChildInstanceRouteEntryToCenResponse
     */
    public CreateCenChildInstanceRouteEntryToCenResponse createCenChildInstanceRouteEntryToCen(CreateCenChildInstanceRouteEntryToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenChildInstanceRouteEntryToCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only inter-region connections created on Enterprise Edition transit routers support QoS policies.</p>
     * <ul>
     * <li>Traffic scheduling applies only to outbound traffic on Enterprise Edition transit routers.
     * For example, you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions, and create a QoS policy for the transit router in the China (Hangzhou) region. In this case, the QoS policy can ensure bandwidth for network traffic from the China (Hangzhou) region to the China (Qingdao) region. However, the QoS policy does not apply to network traffic from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the task.<ul>
     * <li>If the QoS policy is in the <strong>Creating</strong> state, the QoS policy is being created. You can query the QoS policy but cannot perform other operations on the QoS policy.</li>
     * <li>If the QoS policy is in the <strong>Active</strong> state, the QoS policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call the <strong>CreateCenInterRegionTrafficQosPolicy</strong> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a quality of service (QoS) policy for an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request CreateCenInterRegionTrafficQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenInterRegionTrafficQosPolicyResponse
     */
    public CreateCenInterRegionTrafficQosPolicyResponse createCenInterRegionTrafficQosPolicyWithOptions(CreateCenInterRegionTrafficQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthGuaranteeMode)) {
            query.put("BandwidthGuaranteeMode", request.bandwidthGuaranteeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyDescription)) {
            query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyName)) {
            query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosQueues)) {
            query.put("TrafficQosQueues", request.trafficQosQueues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenInterRegionTrafficQosPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenInterRegionTrafficQosPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenInterRegionTrafficQosPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Only inter-region connections created on Enterprise Edition transit routers support QoS policies.</p>
     * <ul>
     * <li>Traffic scheduling applies only to outbound traffic on Enterprise Edition transit routers.
     * For example, you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions, and create a QoS policy for the transit router in the China (Hangzhou) region. In this case, the QoS policy can ensure bandwidth for network traffic from the China (Hangzhou) region to the China (Qingdao) region. However, the QoS policy does not apply to network traffic from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the task.<ul>
     * <li>If the QoS policy is in the <strong>Creating</strong> state, the QoS policy is being created. You can query the QoS policy but cannot perform other operations on the QoS policy.</li>
     * <li>If the QoS policy is in the <strong>Active</strong> state, the QoS policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call the <strong>CreateCenInterRegionTrafficQosPolicy</strong> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a quality of service (QoS) policy for an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request CreateCenInterRegionTrafficQosPolicyRequest
     * @return CreateCenInterRegionTrafficQosPolicyResponse
     */
    public CreateCenInterRegionTrafficQosPolicyResponse createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenInterRegionTrafficQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCenInterRegionTrafficQosQueue</strong> operation is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the QoS policy to determine the status of the queue. When you call this operation, you must set the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If a QoS policy is in the <strong>Modifying</strong> state, the queue is being created. In this case, you can query the QoS policy and queue but cannot perform other operations.</li>
     * <li>If a QoS policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates queues in a quality of service (QoS) policy to manage network traffic based on finer granularities, improve service performance, and meet service-level agreements (SLAs).</p>
     * 
     * @param request CreateCenInterRegionTrafficQosQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenInterRegionTrafficQosQueueResponse
     */
    public CreateCenInterRegionTrafficQosQueueResponse createCenInterRegionTrafficQosQueueWithOptions(CreateCenInterRegionTrafficQosQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dscps)) {
            query.put("Dscps", request.dscps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueDescription)) {
            query.put("QosQueueDescription", request.qosQueueDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueName)) {
            query.put("QosQueueName", request.qosQueueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remainBandwidthPercent)) {
            query.put("RemainBandwidthPercent", request.remainBandwidthPercent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyId)) {
            query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenInterRegionTrafficQosQueue"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenInterRegionTrafficQosQueueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenInterRegionTrafficQosQueueResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCenInterRegionTrafficQosQueue</strong> operation is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the QoS policy to determine the status of the queue. When you call this operation, you must set the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If a QoS policy is in the <strong>Modifying</strong> state, the queue is being created. In this case, you can query the QoS policy and queue but cannot perform other operations.</li>
     * <li>If a QoS policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates queues in a quality of service (QoS) policy to manage network traffic based on finer granularities, improve service performance, and meet service-level agreements (SLAs).</p>
     * 
     * @param request CreateCenInterRegionTrafficQosQueueRequest
     * @return CreateCenInterRegionTrafficQosQueueResponse
     */
    public CreateCenInterRegionTrafficQosQueueResponse createCenInterRegionTrafficQosQueue(CreateCenInterRegionTrafficQosQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenInterRegionTrafficQosQueueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Routing policies are sorted by priority. A smaller value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. Starting from the routing policy with the highest priority, the system matches routes against the match conditions specified by routing policies. If a route meets all the match conditions of a routing policy, the system permits or denies the route based on the action specified in the routing policy. You can also modify the attributes of permitted routes. By default, the system permits routes that meet none of the match conditions. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you send a request, the routing policy ID is returned but the operation is still being performed in the system background. You can call <code>DescribeCenRouteMaps</code> to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this case, you can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a routing policy. A routing policy filters routing information and facilitates network management.</p>
     * 
     * @param request CreateCenRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCenRouteMapResponse
     */
    public CreateCenRouteMapResponse createCenRouteMapWithOptions(CreateCenRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asPathMatchMode)) {
            query.put("AsPathMatchMode", request.asPathMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenRegionId)) {
            query.put("CenRegionId", request.cenRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrMatchMode)) {
            query.put("CidrMatchMode", request.cidrMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communityMatchMode)) {
            query.put("CommunityMatchMode", request.communityMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communityOperateMode)) {
            query.put("CommunityOperateMode", request.communityOperateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationChildInstanceTypes)) {
            query.put("DestinationChildInstanceTypes", request.destinationChildInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlocks)) {
            query.put("DestinationCidrBlocks", request.destinationCidrBlocks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationInstanceIds)) {
            query.put("DestinationInstanceIds", request.destinationInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationInstanceIdsReverseMatch)) {
            query.put("DestinationInstanceIdsReverseMatch", request.destinationInstanceIdsReverseMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionIds)) {
            query.put("DestinationRegionIds", request.destinationRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRouteTableIds)) {
            query.put("DestinationRouteTableIds", request.destinationRouteTableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapResult)) {
            query.put("MapResult", request.mapResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchAddressType)) {
            query.put("MatchAddressType", request.matchAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchAsns)) {
            query.put("MatchAsns", request.matchAsns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchCommunitySet)) {
            query.put("MatchCommunitySet", request.matchCommunitySet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPriority)) {
            query.put("NextPriority", request.nextPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateCommunitySet)) {
            query.put("OperateCommunitySet", request.operateCommunitySet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preference)) {
            query.put("Preference", request.preference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prependAsPath)) {
            query.put("PrependAsPath", request.prependAsPath);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTypes)) {
            query.put("RouteTypes", request.routeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceChildInstanceTypes)) {
            query.put("SourceChildInstanceTypes", request.sourceChildInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceIds)) {
            query.put("SourceInstanceIds", request.sourceInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceIdsReverseMatch)) {
            query.put("SourceInstanceIdsReverseMatch", request.sourceInstanceIdsReverseMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionIds)) {
            query.put("SourceRegionIds", request.sourceRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRouteTableIds)) {
            query.put("SourceRouteTableIds", request.sourceRouteTableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmitDirection)) {
            query.put("TransmitDirection", request.transmitDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCenRouteMapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Routing policies are sorted by priority. A smaller value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. Starting from the routing policy with the highest priority, the system matches routes against the match conditions specified by routing policies. If a route meets all the match conditions of a routing policy, the system permits or denies the route based on the action specified in the routing policy. You can also modify the attributes of permitted routes. By default, the system permits routes that meet none of the match conditions. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you send a request, the routing policy ID is returned but the operation is still being performed in the system background. You can call <code>DescribeCenRouteMaps</code> to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this case, you can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a routing policy. A routing policy filters routing information and facilitates network management.</p>
     * 
     * @param request CreateCenRouteMapRequest
     * @return CreateCenRouteMapResponse
     */
    public CreateCenRouteMapResponse createCenRouteMap(CreateCenRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCenRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Flow logs can be used to capture traffic information about transit routers and network instance connections, including inter-region connections, virtual private cloud (VPC) connections, VPN connections, Express Connect Router (ECR) connections, and virtual border router (VBR) connections. Before you create a flow log, take note of the following items:</p>
     * <ul>
     * <li>Flow logs are supported only by Enterprise Edition transit routers.</li>
     * <li>Flow logs are used to capture information about outbound traffic on transit routers. Information about inbound traffic on transit routers is not captured.
     * For example, an Elastic Compute Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you enable the flow log feature for the transit router in the US (Virginia) region, you can check the log entries about packets sent from the ECS instance in the US (Virginia) region to the ECS instance in the US (Silicon Valley) region. However, packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region are not recorded. If you want to record the packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region, you must also enable the flow log feature on the transit router that is in the US (Silicon Valley) region.</li>
     * <li>If you use a flow log to capture traffic information about VPC connections, the flow log captures information only about traffic on the elastic network interface (ENI) of the transit router. For more information about how to view traffic information about other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</li>
     * <li><code>CreateFlowLog</code> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Required resources are created. For more information about how to create resources, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2715446.html">CreateTransitRouterEcrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468249.html">CreateTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468243.html">CreateTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468270.html">CreateTransitRouterPeerAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468222.html">CreateTransitRouter</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow log.</p>
     * 
     * @param request CreateFlowlogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowlogResponse
     */
    public CreateFlowlogResponse createFlowlogWithOptions(CreateFlowlogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            query.put("FlowLogName", request.flowLogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logFormatString)) {
            query.put("LogFormatString", request.logFormatString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowlog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowlogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateFlowlogResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Flow logs can be used to capture traffic information about transit routers and network instance connections, including inter-region connections, virtual private cloud (VPC) connections, VPN connections, Express Connect Router (ECR) connections, and virtual border router (VBR) connections. Before you create a flow log, take note of the following items:</p>
     * <ul>
     * <li>Flow logs are supported only by Enterprise Edition transit routers.</li>
     * <li>Flow logs are used to capture information about outbound traffic on transit routers. Information about inbound traffic on transit routers is not captured.
     * For example, an Elastic Compute Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you enable the flow log feature for the transit router in the US (Virginia) region, you can check the log entries about packets sent from the ECS instance in the US (Virginia) region to the ECS instance in the US (Silicon Valley) region. However, packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region are not recorded. If you want to record the packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region, you must also enable the flow log feature on the transit router that is in the US (Silicon Valley) region.</li>
     * <li>If you use a flow log to capture traffic information about VPC connections, the flow log captures information only about traffic on the elastic network interface (ENI) of the transit router. For more information about how to view traffic information about other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</li>
     * <li><code>CreateFlowLog</code> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Required resources are created. For more information about how to create resources, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2715446.html">CreateTransitRouterEcrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468249.html">CreateTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468243.html">CreateTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468270.html">CreateTransitRouterPeerAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468222.html">CreateTransitRouter</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow log.</p>
     * 
     * @param request CreateFlowlogRequest
     * @return CreateFlowlogResponse
     */
    public CreateFlowlogResponse createFlowlog(CreateFlowlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowlogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support traffic marking policies.</p>
     * <ul>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.<ul>
     * <li>If a traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. You can query the traffic marking policy but cannot perform other operations.</li>
     * <li>If a traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a traffic marking policy. A traffic marking policy captures network traffic based on traffic classification rules and marks the traffic with the Differentiated Services Code Point (DSCP) values that you specify.</p>
     * 
     * @param request CreateTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrafficMarkingPolicyResponse
     */
    public CreateTrafficMarkingPolicyResponse createTrafficMarkingPolicyWithOptions(CreateTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markingDscp)) {
            query.put("MarkingDscp", request.markingDscp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyDescription)) {
            query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyName)) {
            query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRules)) {
            query.put("TrafficMatchRules", request.trafficMatchRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support traffic marking policies.</p>
     * <ul>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.<ul>
     * <li>If a traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. You can query the traffic marking policy but cannot perform other operations.</li>
     * <li>If a traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a traffic marking policy. A traffic marking policy captures network traffic based on traffic classification rules and marks the traffic with the Differentiated Services Code Point (DSCP) values that you specify.</p>
     * 
     * @param request CreateTrafficMarkingPolicyRequest
     * @return CreateTrafficMarkingPolicyResponse
     */
    public CreateTrafficMarkingPolicyResponse createTrafficMarkingPolicy(CreateTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you add an aggregate route to a route table of an Enterprise Edition transit router, the Enterprise Edition transit router advertises its routes only to route tables of virtual private clouds (VPCs) that are associated with a route table of the Enterprise Edition transit router and have route synchronization enabled.
     * Perform the following operations before you create an aggregate route. Otherwise, the Enterprise Edition transit router does not advertise routes to VPC route tables:</p>
     * <ul>
     * <li>Associated forwarding is enabled between the VPCs and the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPCs. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an aggregate route.</p>
     * 
     * @param tmpReq CreateTransitRouteTableAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouteTableAggregationResponse
     */
    public CreateTransitRouteTableAggregationResponse createTransitRouteTableAggregationWithOptions(CreateTransitRouteTableAggregationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTransitRouteTableAggregationShrinkRequest request = new CreateTransitRouteTableAggregationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transitRouteTableAggregationScopeList)) {
            request.transitRouteTableAggregationScopeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transitRouteTableAggregationScopeList, "TransitRouteTableAggregationScopeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationDescription)) {
            query.put("TransitRouteTableAggregationDescription", request.transitRouteTableAggregationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationName)) {
            query.put("TransitRouteTableAggregationName", request.transitRouteTableAggregationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationScope)) {
            query.put("TransitRouteTableAggregationScope", request.transitRouteTableAggregationScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationScopeListShrink)) {
            query.put("TransitRouteTableAggregationScopeList", request.transitRouteTableAggregationScopeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouteTableAggregation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouteTableAggregationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouteTableAggregationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you add an aggregate route to a route table of an Enterprise Edition transit router, the Enterprise Edition transit router advertises its routes only to route tables of virtual private clouds (VPCs) that are associated with a route table of the Enterprise Edition transit router and have route synchronization enabled.
     * Perform the following operations before you create an aggregate route. Otherwise, the Enterprise Edition transit router does not advertise routes to VPC route tables:</p>
     * <ul>
     * <li>Associated forwarding is enabled between the VPCs and the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPCs. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an aggregate route.</p>
     * 
     * @param request CreateTransitRouteTableAggregationRequest
     * @return CreateTransitRouteTableAggregationResponse
     */
    public CreateTransitRouteTableAggregationResponse createTransitRouteTableAggregation(CreateTransitRouteTableAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouteTableAggregationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call <strong>CreateTransitRouter</strong> to create an Enterprise Edition transit router. For more information about the regions that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the transit router ID is returned but the operation is still being performed in the system background. You can call <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> to query the status of an Enterprise Edition transit router.<ul>
     * <li>If an Enterprise Edition transit router is in the <strong>Creating</strong> state, the Enterprise Edition transit router is being created. In this case, you can query the Enterprise Edition transit router but cannot perform other operations.</li>
     * <li>If an Enterprise Edition transit router is in the <strong>Active</strong> state, the Enterprise Edition transit router is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Enterprise Edition transit router.</p>
     * 
     * @param tmpReq CreateTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterResponse
     */
    public CreateTransitRouterResponse createTransitRouterWithOptions(CreateTransitRouterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTransitRouterShrinkRequest request = new CreateTransitRouterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transitRouterCidrList)) {
            request.transitRouterCidrListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transitRouterCidrList, "TransitRouterCidrList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportMulticast)) {
            query.put("SupportMulticast", request.supportMulticast);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterCidrListShrink)) {
            query.put("TransitRouterCidrList", request.transitRouterCidrListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterDescription)) {
            query.put("TransitRouterDescription", request.transitRouterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterName)) {
            query.put("TransitRouterName", request.transitRouterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can call <strong>CreateTransitRouter</strong> to create an Enterprise Edition transit router. For more information about the regions that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the transit router ID is returned but the operation is still being performed in the system background. You can call <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> to query the status of an Enterprise Edition transit router.<ul>
     * <li>If an Enterprise Edition transit router is in the <strong>Creating</strong> state, the Enterprise Edition transit router is being created. In this case, you can query the Enterprise Edition transit router but cannot perform other operations.</li>
     * <li>If an Enterprise Edition transit router is in the <strong>Active</strong> state, the Enterprise Edition transit router is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterRequest
     * @return CreateTransitRouterResponse
     */
    public CreateTransitRouterResponse createTransitRouter(CreateTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify a CIDR block for a transit router. The CIDR block works in a similar way as the CIDR block of the loopback interface on a router. IP addresses within the CIDR block can be assigned to IPsec-VPN connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation can be used to create a CIDR block only after you create a transit router.
     * The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom CIDR blocks.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits in transit router CIDR blocks</a>.</li>
     * <li>Each transit router supports at most five CIDR blocks. The subnet mask of a CIDR block must be 16 bits to 24 bits in length.</li>
     * <li>The following CIDR blocks and their subnets are not supported: 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, and 169.254.0.0/16.</li>
     * <li>The CIDR block cannot overlap with the CIDR blocks of the network instances that communicate with each other by using the CEN instance.</li>
     * <li>On the same CEN instance, each transit router CIDR block must be unique.</li>
     * <li>When you create the first VPN connection after you add a CIDR block for a transit router, three CIDR blocks within the CIDR block are reserved. An IP address is allocated from the remaining CIDR blocks to the IPsec-VPN connection.
     * You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query reserved CIDR blocks and IP addresses allocated to network connections.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom CIDR block for a transit router. Custom CIDR blocks of a transit router are similar to the CIDR blocks of the loopback interface of a router.</p>
     * 
     * @param request CreateTransitRouterCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterCidrResponse
     */
    public CreateTransitRouterCidrResponse createTransitRouterCidrWithOptions(CreateTransitRouterCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishCidrRoute)) {
            query.put("PublishCidrRoute", request.publishCidrRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterCidr"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterCidrResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterCidrResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can specify a CIDR block for a transit router. The CIDR block works in a similar way as the CIDR block of the loopback interface on a router. IP addresses within the CIDR block can be assigned to IPsec-VPN connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation can be used to create a CIDR block only after you create a transit router.
     * The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom CIDR blocks.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits in transit router CIDR blocks</a>.</li>
     * <li>Each transit router supports at most five CIDR blocks. The subnet mask of a CIDR block must be 16 bits to 24 bits in length.</li>
     * <li>The following CIDR blocks and their subnets are not supported: 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, and 169.254.0.0/16.</li>
     * <li>The CIDR block cannot overlap with the CIDR blocks of the network instances that communicate with each other by using the CEN instance.</li>
     * <li>On the same CEN instance, each transit router CIDR block must be unique.</li>
     * <li>When you create the first VPN connection after you add a CIDR block for a transit router, three CIDR blocks within the CIDR block are reserved. An IP address is allocated from the remaining CIDR blocks to the IPsec-VPN connection.
     * You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query reserved CIDR blocks and IP addresses allocated to network connections.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom CIDR block for a transit router. Custom CIDR blocks of a transit router are similar to the CIDR blocks of the loopback interface of a router.</p>
     * 
     * @param request CreateTransitRouterCidrRequest
     * @return CreateTransitRouterCidrResponse
     */
    public CreateTransitRouterCidrResponse createTransitRouterCidr(CreateTransitRouterCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterCidrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support ECR connections.</p>
     * <ul>
     * <li>The following methods describe how to attach an ECR connection to an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters.</li>
     * <li>If no Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. An Enterprise Edition transit router is automatically created when you create an ECR connection.</li>
     * </ul>
     * </li>
     * <li>CreateTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterEcrAttachments</strong> operation to query the status of an ECR connection.<ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection.</li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After you create an ECR connection, the ECR connection is not in route learning or associated forwarding relationships with Enterprise Edition transit routers.
     * After you enable <a href="https://help.aliyun.com/document_detail/468300.html">route learning</a> between the ECR connection and an Enterprise Edition transit router, the routes of the ECR are automatically advertised to the route tables of the Enterprise Edition transit router.</li>
     * <li>After you create an ECR connection, the routes in the route tables of the Enterprise Edition transit router to which the ECR connection is attached are automatically advertised to the route table of the ECR.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisite</h3>
     * <ul>
     * <li>The Alibaba Cloud account of the Enterprise Edition transit router and the Alibaba Cloud account of the ECR belong to the same enterprise.</li>
     * <li>The Enterprise Edition transit router and ECR can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. If the Enterprise Edition transit router and ECR belong to different Alibaba Cloud accounts, grant the transit router permissions on the ECR before you can attach the ECR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li><strong>Before you call this operation to attach an ECR connection to an Enterprise Edition transit router, you must call the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to create an association between the ECR and transit router.</strong>
     * <strong>If you call the DeleteTransitRouterEcrAttachment operation to forcefully delete an ECR connection, the association between the ECR connection and Enterprise Edition transit router is deleted.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an Express Connect Router (ECR) connection to the transit router in the same region.</p>
     * 
     * @param request CreateTransitRouterEcrAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterEcrAttachmentResponse
     */
    public CreateTransitRouterEcrAttachmentResponse createTransitRouterEcrAttachmentWithOptions(CreateTransitRouterEcrAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrId)) {
            query.put("EcrId", request.ecrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecrOwnerId)) {
            query.put("EcrOwnerId", request.ecrOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterEcrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterEcrAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterEcrAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support ECR connections.</p>
     * <ul>
     * <li>The following methods describe how to attach an ECR connection to an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters.</li>
     * <li>If no Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. An Enterprise Edition transit router is automatically created when you create an ECR connection.</li>
     * </ul>
     * </li>
     * <li>CreateTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterEcrAttachments</strong> operation to query the status of an ECR connection.<ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection.</li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After you create an ECR connection, the ECR connection is not in route learning or associated forwarding relationships with Enterprise Edition transit routers.
     * After you enable <a href="https://help.aliyun.com/document_detail/468300.html">route learning</a> between the ECR connection and an Enterprise Edition transit router, the routes of the ECR are automatically advertised to the route tables of the Enterprise Edition transit router.</li>
     * <li>After you create an ECR connection, the routes in the route tables of the Enterprise Edition transit router to which the ECR connection is attached are automatically advertised to the route table of the ECR.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisite</h3>
     * <ul>
     * <li>The Alibaba Cloud account of the Enterprise Edition transit router and the Alibaba Cloud account of the ECR belong to the same enterprise.</li>
     * <li>The Enterprise Edition transit router and ECR can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. If the Enterprise Edition transit router and ECR belong to different Alibaba Cloud accounts, grant the transit router permissions on the ECR before you can attach the ECR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li><strong>Before you call this operation to attach an ECR connection to an Enterprise Edition transit router, you must call the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to create an association between the ECR and transit router.</strong>
     * <strong>If you call the DeleteTransitRouterEcrAttachment operation to forcefully delete an ECR connection, the association between the ECR connection and Enterprise Edition transit router is deleted.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an Express Connect Router (ECR) connection to the transit router in the same region.</p>
     * 
     * @param request CreateTransitRouterEcrAttachmentRequest
     * @return CreateTransitRouterEcrAttachmentResponse
     */
    public CreateTransitRouterEcrAttachmentResponse createTransitRouterEcrAttachment(CreateTransitRouterEcrAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterEcrAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, read the following rules:</p>
     * <ul>
     * <li>Make sure that an Enterprise Edition transit router is deployed in the region where you want to create the multicast domain, and the multicast feature is enabled for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     * If an Enterprise Edition transit router was created before you apply for multicast resources, the transit router does not support multicast. You can delete the transit router and create a new one. For more information about how to delete an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call <strong>CreateTransitRouterMulticastDomain</strong>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong>, you do not need to set <strong>CenId</strong> or <strong>RegionId</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast domain. A multicast domain is a multicast network in a region. Only resources in the same multicast domain can transmit and receive multicast packets.</p>
     * 
     * @param request CreateTransitRouterMulticastDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterMulticastDomainResponse
     */
    public CreateTransitRouterMulticastDomainResponse createTransitRouterMulticastDomainWithOptions(CreateTransitRouterMulticastDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainDescription)) {
            query.put("TransitRouterMulticastDomainDescription", request.transitRouterMulticastDomainDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainName)) {
            query.put("TransitRouterMulticastDomainName", request.transitRouterMulticastDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterMulticastDomain"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterMulticastDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterMulticastDomainResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, read the following rules:</p>
     * <ul>
     * <li>Make sure that an Enterprise Edition transit router is deployed in the region where you want to create the multicast domain, and the multicast feature is enabled for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     * If an Enterprise Edition transit router was created before you apply for multicast resources, the transit router does not support multicast. You can delete the transit router and create a new one. For more information about how to delete an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call <strong>CreateTransitRouterMulticastDomain</strong>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong>, you do not need to set <strong>CenId</strong> or <strong>RegionId</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast domain. A multicast domain is a multicast network in a region. Only resources in the same multicast domain can transmit and receive multicast packets.</p>
     * 
     * @param request CreateTransitRouterMulticastDomainRequest
     * @return CreateTransitRouterMulticastDomainResponse
     */
    public CreateTransitRouterMulticastDomainResponse createTransitRouterMulticastDomain(CreateTransitRouterMulticastDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterMulticastDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods:
     *     *   <strong>Allocate bandwidth resources from a bandwidth plan</strong>:
     *         You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information about how to purchase a bandwidth plan, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.
     *     *   <strong>Use pay-by-data-transfer bandwidth resources</strong>:
     *         You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</p>
     * <ul>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this case, you can query the connection but cannot perform other operations on the connection.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>To connect network instances across regions, such as virtual private clouds (VPCs), virtual border routers (VBRs), and IPsec-VPN connections that are connected to transit routers, you must create an inter-region connection between the network instances that you want to connect. You can call the CreateTransitRouterPeerAttachment operation to create an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterPeerAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterPeerAttachmentResponse
     */
    public CreateTransitRouterPeerAttachmentResponse createTransitRouterPeerAttachmentWithOptions(CreateTransitRouterPeerAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthType)) {
            query.put("BandwidthType", request.bandwidthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLinkType)) {
            query.put("DefaultLinkType", request.defaultLinkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerTransitRouterId)) {
            query.put("PeerTransitRouterId", request.peerTransitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerTransitRouterRegionId)) {
            query.put("PeerTransitRouterRegionId", request.peerTransitRouterRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterPeerAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterPeerAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterPeerAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods:
     *     *   <strong>Allocate bandwidth resources from a bandwidth plan</strong>:
     *         You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information about how to purchase a bandwidth plan, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.
     *     *   <strong>Use pay-by-data-transfer bandwidth resources</strong>:
     *         You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</p>
     * <ul>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this case, you can query the connection but cannot perform other operations on the connection.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>To connect network instances across regions, such as virtual private clouds (VPCs), virtual border routers (VBRs), and IPsec-VPN connections that are connected to transit routers, you must create an inter-region connection between the network instances that you want to connect. You can call the CreateTransitRouterPeerAttachment operation to create an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterPeerAttachmentRequest
     * @return CreateTransitRouterPeerAttachmentResponse
     */
    public CreateTransitRouterPeerAttachmentResponse createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterPeerAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To associate an Enterprise Edition transit router with a route prefix, you must meet the following requirements:</p>
     * <ul>
     * <li>You are familiar with the limits and route compatibility notes of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>A prefix list is created. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If the prefix list and the Enterprise Edition transit router belong to different Alibaba Cloud accounts, the prefix list is shared with the Alibaba Cloud account that owns the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API references for resource sharing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the route table of an Enterprise Edition transit router with a prefix list.</p>
     * 
     * @param request CreateTransitRouterPrefixListAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterPrefixListAssociationResponse
     */
    public CreateTransitRouterPrefixListAssociationResponse createTransitRouterPrefixListAssociationWithOptions(CreateTransitRouterPrefixListAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            query.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            query.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("OwnerUid", request.ownerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixListId)) {
            query.put("PrefixListId", request.prefixListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterTableId)) {
            query.put("TransitRouterTableId", request.transitRouterTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterPrefixListAssociation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterPrefixListAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterPrefixListAssociationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>To associate an Enterprise Edition transit router with a route prefix, you must meet the following requirements:</p>
     * <ul>
     * <li>You are familiar with the limits and route compatibility notes of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>A prefix list is created. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If the prefix list and the Enterprise Edition transit router belong to different Alibaba Cloud accounts, the prefix list is shared with the Alibaba Cloud account that owns the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API references for resource sharing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates the route table of an Enterprise Edition transit router with a prefix list.</p>
     * 
     * @param request CreateTransitRouterPrefixListAssociationRequest
     * @return CreateTransitRouterPrefixListAssociationResponse
     */
    public CreateTransitRouterPrefixListAssociationResponse createTransitRouterPrefixListAssociation(CreateTransitRouterPrefixListAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterPrefixListAssociationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the route ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of a route.</p>
     * <ul>
     * <li>If a route is in the <strong>Creating</strong> state, the route is being created. In this case, you can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Active</strong> state, the route is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route to a route table of an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterRouteEntryResponse
     */
    public CreateTransitRouterRouteEntryResponse createTransitRouterRouteEntryWithOptions(CreateTransitRouterRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryDescription)) {
            query.put("TransitRouterRouteEntryDescription", request.transitRouterRouteEntryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryDestinationCidrBlock)) {
            query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryName)) {
            query.put("TransitRouterRouteEntryName", request.transitRouterRouteEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopId)) {
            query.put("TransitRouterRouteEntryNextHopId", request.transitRouterRouteEntryNextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopType)) {
            query.put("TransitRouterRouteEntryNextHopType", request.transitRouterRouteEntryNextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterRouteEntryResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the route ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of a route.</p>
     * <ul>
     * <li>If a route is in the <strong>Creating</strong> state, the route is being created. In this case, you can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Active</strong> state, the route is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route to a route table of an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterRouteEntryRequest
     * @return CreateTransitRouterRouteEntryResponse
     */
    public CreateTransitRouterRouteEntryResponse createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support custom route tables. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the route table ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of a route table.<ul>
     * <li>If a route table is in the <strong>Creating</strong> state, the route table is being created. In this case, you can query the route table but cannot perform other operations.</li>
     * <li>If a route table is in the <strong>Active</strong> state, the route table is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom route table for an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterRouteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterRouteTableResponse
     */
    public CreateTransitRouterRouteTableResponse createTransitRouterRouteTableWithOptions(CreateTransitRouterRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableOptions)) {
            query.put("RouteTableOptions", request.routeTableOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableDescription)) {
            query.put("TransitRouterRouteTableDescription", request.transitRouterRouteTableDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableName)) {
            query.put("TransitRouterRouteTableName", request.transitRouterRouteTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterRouteTableResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Only Enterprise Edition transit routers support custom route tables. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the route table ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of a route table.<ul>
     * <li>If a route table is in the <strong>Creating</strong> state, the route table is being created. In this case, you can query the route table but cannot perform other operations.</li>
     * <li>If a route table is in the <strong>Active</strong> state, the route table is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom route table for an Enterprise Edition transit router.</p>
     * 
     * @param request CreateTransitRouterRouteTableRequest
     * @return CreateTransitRouterRouteTableResponse
     */
    public CreateTransitRouterRouteTableResponse createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterRouteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li>You can use the following methods to create a VBR connection on an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters to create a VBR connection.</li>
     * <li>If no Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters to create a VBR connection. When you create a VBR connection, the system automatically creates an Enterprise Edition transit router in the specified region.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of a VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this case, you can query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The transit router and the VBR must belong to the same Alibaba Cloud account.</li>
     * <li>Transit routers can connect to VBRs that belong to the same or a different Alibaba Cloud account. To connect a transit router to a VBR that belongs to a different Alibaba Cloud account, grant permissions on the VBR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant a transit router permissions on a network instance that belongs to another Alibaba Cloud account</a>.</li>
     * <li>After you create a VBR connection, it is not in route learning or associated forwarding relationship with transit router route tables by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Connects the virtual border routers (VBRs) among which you want to establish network communication to the transit router in the region. Then, the transit router can exchange data between the VBR and CEN instance over private connections.</p>
     * 
     * @param request CreateTransitRouterVbrAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterVbrAttachmentResponse
     */
    public CreateTransitRouterVbrAttachmentResponse createTransitRouterVbrAttachmentWithOptions(CreateTransitRouterVbrAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrId)) {
            query.put("VbrId", request.vbrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrOwnerId)) {
            query.put("VbrOwnerId", request.vbrOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterVbrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVbrAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterVbrAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li>You can use the following methods to create a VBR connection on an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters to create a VBR connection.</li>
     * <li>If no Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters to create a VBR connection. When you create a VBR connection, the system automatically creates an Enterprise Edition transit router in the specified region.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of a VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this case, you can query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The transit router and the VBR must belong to the same Alibaba Cloud account.</li>
     * <li>Transit routers can connect to VBRs that belong to the same or a different Alibaba Cloud account. To connect a transit router to a VBR that belongs to a different Alibaba Cloud account, grant permissions on the VBR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant a transit router permissions on a network instance that belongs to another Alibaba Cloud account</a>.</li>
     * <li>After you create a VBR connection, it is not in route learning or associated forwarding relationship with transit router route tables by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Connects the virtual border routers (VBRs) among which you want to establish network communication to the transit router in the region. Then, the transit router can exchange data between the VBR and CEN instance over private connections.</p>
     * 
     * @param request CreateTransitRouterVbrAttachmentRequest
     * @return CreateTransitRouterVbrAttachmentResponse
     */
    public CreateTransitRouterVbrAttachmentResponse createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterVbrAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can use the following methods to create a VPC connection from an Enterprise Edition transit router:
     *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong> parameters.
     *     *   If no Enterprise Edition transit router is created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. Then, the system automatically creates an Enterprise Edition transit router in the specified region.</p>
     * <ul>
     * <li><strong>CreateTransitRouterVpcAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of a VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>By default, route learning and associated forwarding are disabled between transit router route tables and VPC connections.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The VPC in the zones of the Enterprise Edition transit router contains at least one vSwitch. Each vSwitch must have at least one idle IP address. For more information, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>To connect to a network instance that belongs to another Alibaba Cloud account, you must first acquire the permissions from the account. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>VPC connections incur fees. Make sure that you understand the billing rules of VPC connections before you create a VPC connection. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches virtual private clouds (VPCs) that you want to connect to a transit router. After you attach the VPCs to the same transit router, the VPCs can communicate with each other.</p>
     * 
     * @param tmpReq CreateTransitRouterVpcAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterVpcAttachmentResponse
     */
    public CreateTransitRouterVpcAttachmentResponse createTransitRouterVpcAttachmentWithOptions(CreateTransitRouterVpcAttachmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTransitRouterVpcAttachmentShrinkRequest request = new CreateTransitRouterVpcAttachmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transitRouterVPCAttachmentOptions)) {
            request.transitRouterVPCAttachmentOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transitRouterVPCAttachmentOptions, "TransitRouterVPCAttachmentOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterVPCAttachmentOptionsShrink)) {
            query.put("TransitRouterVPCAttachmentOptions", request.transitRouterVPCAttachmentOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcOwnerId)) {
            query.put("VpcOwnerId", request.vpcOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterVpcAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVpcAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterVpcAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can use the following methods to create a VPC connection from an Enterprise Edition transit router:
     *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong> parameters.
     *     *   If no Enterprise Edition transit router is created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. Then, the system automatically creates an Enterprise Edition transit router in the specified region.</p>
     * <ul>
     * <li><strong>CreateTransitRouterVpcAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of a VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>By default, route learning and associated forwarding are disabled between transit router route tables and VPC connections.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The VPC in the zones of the Enterprise Edition transit router contains at least one vSwitch. Each vSwitch must have at least one idle IP address. For more information, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>To connect to a network instance that belongs to another Alibaba Cloud account, you must first acquire the permissions from the account. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>VPC connections incur fees. Make sure that you understand the billing rules of VPC connections before you create a VPC connection. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches virtual private clouds (VPCs) that you want to connect to a transit router. After you attach the VPCs to the same transit router, the VPCs can communicate with each other.</p>
     * 
     * @param request CreateTransitRouterVpcAttachmentRequest
     * @return CreateTransitRouterVpcAttachmentResponse
     */
    public CreateTransitRouterVpcAttachmentResponse createTransitRouterVpcAttachment(CreateTransitRouterVpcAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterVpcAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  By default, route learning and associated forwarding are disabled between transit router route tables and IPsec-VPN attachments.</p>
     * <ul>
     * <li>When you call <code>CreateTransitRouterVpnAttachment</code>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong> and <strong>RegionId</strong>, you do not need to set <strong>CenId</strong>.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Before you attach an IPsec-VPN connection to a transit router, make sure that at least one IPsec-VPN connection is created in the region where the transit router is deployed. Make sure the IPsec-VPN connection is not associated with a resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the IPsec-VPN connection to be attached to the transit router belongs to a different Alibaba Cloud account, make sure that the transit router has obtained the required permissions from the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an IPsec-VPN connection to a transit router.</p>
     * 
     * @param request CreateTransitRouterVpnAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterVpnAttachmentResponse
     */
    public CreateTransitRouterVpnAttachmentResponse createTransitRouterVpnAttachmentWithOptions(CreateTransitRouterVpnAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpnId)) {
            query.put("VpnId", request.vpnId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpnOwnerId)) {
            query.put("VpnOwnerId", request.vpnOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            query.put("Zone", request.zone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransitRouterVpnAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVpnAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTransitRouterVpnAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  By default, route learning and associated forwarding are disabled between transit router route tables and IPsec-VPN attachments.</p>
     * <ul>
     * <li>When you call <code>CreateTransitRouterVpnAttachment</code>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong> and <strong>RegionId</strong>, you do not need to set <strong>CenId</strong>.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Before you attach an IPsec-VPN connection to a transit router, make sure that at least one IPsec-VPN connection is created in the region where the transit router is deployed. Make sure the IPsec-VPN connection is not associated with a resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the IPsec-VPN connection to be attached to the transit router belongs to a different Alibaba Cloud account, make sure that the transit router has obtained the required permissions from the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an IPsec-VPN connection to a transit router.</p>
     * 
     * @param request CreateTransitRouterVpnAttachmentRequest
     * @return CreateTransitRouterVpnAttachmentResponse
     */
    public CreateTransitRouterVpnAttachmentResponse createTransitRouterVpnAttachment(CreateTransitRouterVpnAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTransitRouterVpnAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>DeactiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being disabled. You can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Inactive</strong> state, the flow log is disabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a flow log. A disabled flow log no longer captures information about network traffic.</p>
     * 
     * @param request DeactiveFlowLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactiveFlowLogResponse
     */
    public DeactiveFlowLogResponse deactiveFlowLogWithOptions(DeactiveFlowLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "DeactiveFlowLog"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveFlowLogResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeactiveFlowLogResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>DeactiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being disabled. You can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Inactive</strong> state, the flow log is disabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a flow log. A disabled flow log no longer captures information about network traffic.</p>
     * 
     * @param request DeactiveFlowLogRequest
     * @return DeactiveFlowLogResponse
     */
    public DeactiveFlowLogResponse deactiveFlowLog(DeactiveFlowLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveFlowLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this case, you can query the CEN instance but cannot perform other operations.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The CEN instance that you want to delete is not associated with a bandwidth plan, and the transit router associated with the CEN instance does not have a network instance connection or a custom route table.</p>
     * <ul>
     * <li>For more information about how to detach a network instance, see the following topics:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>For more information about how to detach network instances from a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>For more information about how to delete custom route tables from an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>For more information about how to disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenResponse
     */
    public DeleteCenResponse deleteCenWithOptions(DeleteCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DeleteCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this case, you can query the CEN instance but cannot perform other operations.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The CEN instance that you want to delete is not associated with a bandwidth plan, and the transit router associated with the CEN instance does not have a network instance connection or a custom route table.</p>
     * <ul>
     * <li>For more information about how to detach a network instance, see the following topics:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>For more information about how to detach network instances from a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>For more information about how to delete custom route tables from an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>For more information about how to disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteCenRequest
     * @return DeleteCenResponse
     */
    public DeleteCenResponse deleteCen(DeleteCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCenBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenBandwidthPackageResponse
     */
    public DeleteCenBandwidthPackageResponse deleteCenBandwidthPackageWithOptions(DeleteCenBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DeleteCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenBandwidthPackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenBandwidthPackageResponse());
        }

    }

    /**
     * @param request DeleteCenBandwidthPackageRequest
     * @return DeleteCenBandwidthPackageResponse
     */
    public DeleteCenBandwidthPackageResponse deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can delete routes only from virtual private clouds (VPCs) and virtual border routers (VBRs) whose next hop is an <strong>Enterprise Edition transit router connection</strong>, which is the connection to the network instance.</p>
     * <ul>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Deleting</strong> state, the route is being deleted. You can query the route but cannot perform other operations.</li>
     * <li>If a route cannot be found, the route is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route of a network instance from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteCenChildInstanceRouteEntryToAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenChildInstanceRouteEntryToAttachmentResponse
     */
    public DeleteCenChildInstanceRouteEntryToAttachmentResponse deleteCenChildInstanceRouteEntryToAttachmentWithOptions(DeleteCenChildInstanceRouteEntryToAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenChildInstanceRouteEntryToAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenChildInstanceRouteEntryToAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can delete routes only from virtual private clouds (VPCs) and virtual border routers (VBRs) whose next hop is an <strong>Enterprise Edition transit router connection</strong>, which is the connection to the network instance.</p>
     * <ul>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Deleting</strong> state, the route is being deleted. You can query the route but cannot perform other operations.</li>
     * <li>If a route cannot be found, the route is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route of a network instance from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteCenChildInstanceRouteEntryToAttachmentRequest
     * @return DeleteCenChildInstanceRouteEntryToAttachmentResponse
     */
    public DeleteCenChildInstanceRouteEntryToAttachmentResponse deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenChildInstanceRouteEntryToAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the DeleteCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot delete a route entry from an Enterprise Edition transit router by calling the DeleteCenChildInstanceRouteEntryToCen operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route from a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteCenChildInstanceRouteEntryToCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenChildInstanceRouteEntryToCenResponse
     */
    public DeleteCenChildInstanceRouteEntryToCenResponse deleteCenChildInstanceRouteEntryToCenWithOptions(DeleteCenChildInstanceRouteEntryToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceAliUid)) {
            query.put("ChildInstanceAliUid", request.childInstanceAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenChildInstanceRouteEntryToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenChildInstanceRouteEntryToCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the DeleteCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot delete a route entry from an Enterprise Edition transit router by calling the DeleteCenChildInstanceRouteEntryToCen operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route from a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteCenChildInstanceRouteEntryToCenRequest
     * @return DeleteCenChildInstanceRouteEntryToCenResponse
     */
    public DeleteCenChildInstanceRouteEntryToCenResponse deleteCenChildInstanceRouteEntryToCen(DeleteCenChildInstanceRouteEntryToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenChildInstanceRouteEntryToCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a QoS policy, you must delete all queues in the QoS policy except the default queue. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a QoS policy.<ul>
     * <li>If a QoS policy is in the <strong>Deleting</strong> state, the QoS policy is being deleted. You can query the QoS policy but cannot perform other operations.</li>
     * <li>If a QoS policy cannot be found, the QoS policy is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quality of service (QoS) policy.</p>
     * 
     * @param request DeleteCenInterRegionTrafficQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenInterRegionTrafficQosPolicyResponse
     */
    public DeleteCenInterRegionTrafficQosPolicyResponse deleteCenInterRegionTrafficQosPolicyWithOptions(DeleteCenInterRegionTrafficQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyId)) {
            query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenInterRegionTrafficQosPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenInterRegionTrafficQosPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a QoS policy, you must delete all queues in the QoS policy except the default queue. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a QoS policy.<ul>
     * <li>If a QoS policy is in the <strong>Deleting</strong> state, the QoS policy is being deleted. You can query the QoS policy but cannot perform other operations.</li>
     * <li>If a QoS policy cannot be found, the QoS policy is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a quality of service (QoS) policy.</p>
     * 
     * @param request DeleteCenInterRegionTrafficQosPolicyRequest
     * @return DeleteCenInterRegionTrafficQosPolicyResponse
     */
    public DeleteCenInterRegionTrafficQosPolicyResponse deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenInterRegionTrafficQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the default queue.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a queue. If a queue cannot be found, the queue is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a queue from a quality of service (QoS) policy.</p>
     * 
     * @param request DeleteCenInterRegionTrafficQosQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenInterRegionTrafficQosQueueResponse
     */
    public DeleteCenInterRegionTrafficQosQueueResponse deleteCenInterRegionTrafficQosQueueWithOptions(DeleteCenInterRegionTrafficQosQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueId)) {
            query.put("QosQueueId", request.qosQueueId);
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
            new TeaPair("action", "DeleteCenInterRegionTrafficQosQueue"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosQueueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenInterRegionTrafficQosQueueResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the default queue.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a queue. If a queue cannot be found, the queue is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a queue from a quality of service (QoS) policy.</p>
     * 
     * @param request DeleteCenInterRegionTrafficQosQueueRequest
     * @return DeleteCenInterRegionTrafficQosQueueResponse
     */
    public DeleteCenInterRegionTrafficQosQueueResponse deleteCenInterRegionTrafficQosQueue(DeleteCenInterRegionTrafficQosQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenInterRegionTrafficQosQueueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>DeleteCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. You can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy cannot be found, it is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a routing policy.</p>
     * 
     * @param request DeleteCenRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCenRouteMapResponse
     */
    public DeleteCenRouteMapResponse deleteCenRouteMapWithOptions(DeleteCenRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenRegionId)) {
            query.put("CenRegionId", request.cenRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapId)) {
            query.put("RouteMapId", request.routeMapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCenRouteMapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>DeleteCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. You can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy cannot be found, it is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a routing policy.</p>
     * 
     * @param request DeleteCenRouteMapRequest
     * @return DeleteCenRouteMapResponse
     */
    public DeleteCenRouteMapResponse deleteCenRouteMap(DeleteCenRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>DeleteFlowlog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log cannot be found, the flow log is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow log.</p>
     * 
     * @param request DeleteFlowlogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowlogResponse
     */
    public DeleteFlowlogResponse deleteFlowlogWithOptions(DeleteFlowlogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "DeleteFlowlog"),
            new TeaPair("version", "2017-09-12"),
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
     * <b>description</b> :
     * <p><code>DeleteFlowlog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log cannot be found, the flow log is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a flow log.</p>
     * 
     * @param request DeleteFlowlogRequest
     * @return DeleteFlowlogResponse
     */
    public DeleteFlowlogResponse deleteFlowlog(DeleteFlowlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowlogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. If the request parameters are invalid, the system returns a request ID, but the cloud service configuration is not deleted. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a cloud service is in the <strong>Deleting</strong> state, the cloud service configuration is being deleted. In this case, you can only query the cloud service configuration and cannot perform other operations.</li>
     * <li>If the specified cloud service configuration cannot be found, the cloud service configuration is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configuration of a cloud service connected to a Basic Edition transit router.</p>
     * 
     * @param request DeleteRouteServiceInCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteServiceInCenResponse
     */
    public DeleteRouteServiceInCenResponse deleteRouteServiceInCenWithOptions(DeleteRouteServiceInCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionId)) {
            query.put("AccessRegionId", request.accessRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostRegionId)) {
            query.put("HostRegionId", request.hostRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostVpcId)) {
            query.put("HostVpcId", request.hostVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DeleteRouteServiceInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteServiceInCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRouteServiceInCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. If the request parameters are invalid, the system returns a request ID, but the cloud service configuration is not deleted. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a cloud service is in the <strong>Deleting</strong> state, the cloud service configuration is being deleted. In this case, you can only query the cloud service configuration and cannot perform other operations.</li>
     * <li>If the specified cloud service configuration cannot be found, the cloud service configuration is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the configuration of a cloud service connected to a Basic Edition transit router.</p>
     * 
     * @param request DeleteRouteServiceInCenRequest
     * @return DeleteRouteServiceInCenResponse
     */
    public DeleteRouteServiceInCenResponse deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteServiceInCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.
     *     *   If a traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. You can query the traffic marking policy but cannot perform other operations.
     *     *   If a traffic marking policy cannot be found, the traffic marking policy is deleted.</p>
     * <ul>
     * <li>Before you delete a traffic marking policy, you must delete all traffic classification rules from the policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified traffic marking policy.</p>
     * 
     * @param request DeleteTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrafficMarkingPolicyResponse
     */
    public DeleteTrafficMarkingPolicyResponse deleteTrafficMarkingPolicyWithOptions(DeleteTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  <strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.
     *     *   If a traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. You can query the traffic marking policy but cannot perform other operations.
     *     *   If a traffic marking policy cannot be found, the traffic marking policy is deleted.</p>
     * <ul>
     * <li>Before you delete a traffic marking policy, you must delete all traffic classification rules from the policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified traffic marking policy.</p>
     * 
     * @param request DeleteTrafficMarkingPolicyRequest
     * @return DeleteTrafficMarkingPolicyResponse
     */
    public DeleteTrafficMarkingPolicyResponse deleteTrafficMarkingPolicy(DeleteTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an aggregate route, make sure that your network has a redundant route to prevent service interruptions.</p>
     * <ul>
     * <li>After an aggregate route is deleted, the aggregate route is automatically withdrawn from virtual private clouds (VPCs). Specific routes that fall within the aggregate route are advertised to the VPCs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an aggregate route.</p>
     * 
     * @param request DeleteTransitRouteTableAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouteTableAggregationResponse
     */
    public DeleteTransitRouteTableAggregationResponse deleteTransitRouteTableAggregationWithOptions(DeleteTransitRouteTableAggregationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouteTableAggregation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouteTableAggregationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouteTableAggregationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you delete an aggregate route, make sure that your network has a redundant route to prevent service interruptions.</p>
     * <ul>
     * <li>After an aggregate route is deleted, the aggregate route is automatically withdrawn from virtual private clouds (VPCs). Specific routes that fall within the aggregate route are advertised to the VPCs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an aggregate route.</p>
     * 
     * @param request DeleteTransitRouteTableAggregationRequest
     * @return DeleteTransitRouteTableAggregationResponse
     */
    public DeleteTransitRouteTableAggregationResponse deleteTransitRouteTableAggregation(DeleteTransitRouteTableAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouteTableAggregationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouters</strong> to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Deleting</strong> state, the transit router is being deleted. In this case, you can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router cannot be found, the transit router is deleted.</li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you delete a transit router, make sure that the following prerequisites are met:</p>
     * <ul>
     * <li><p>No network instance connections are created on the transit router. </p>
     * <ul>
     * <li>For more information about how to delete a virtual private cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>. </li>
     * <li>For more information about how to delete a virtual border router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>. </li>
     * <li>For more information about how to delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>. </li>
     * <li>For more information about how to delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * </li>
     * <li><p>No custom route tables are created on the transit router. For more information about how to delete a custom route table, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a transit router.</p>
     * 
     * @param request DeleteTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterResponse
     */
    public DeleteTransitRouterResponse deleteTransitRouterWithOptions(DeleteTransitRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouters</strong> to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Deleting</strong> state, the transit router is being deleted. In this case, you can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router cannot be found, the transit router is deleted.</li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you delete a transit router, make sure that the following prerequisites are met:</p>
     * <ul>
     * <li><p>No network instance connections are created on the transit router. </p>
     * <ul>
     * <li>For more information about how to delete a virtual private cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>. </li>
     * <li>For more information about how to delete a virtual border router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>. </li>
     * <li>For more information about how to delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>. </li>
     * <li>For more information about how to delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * </li>
     * <li><p>No custom route tables are created on the transit router. For more information about how to delete a custom route table, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a transit router.</p>
     * 
     * @param request DeleteTransitRouterRequest
     * @return DeleteTransitRouterResponse
     */
    public DeleteTransitRouterResponse deleteTransitRouter(DeleteTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If IP addresses within the CIDR block have been allocated to network instances, the CIDR block cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CIDR block from a transit router.</p>
     * 
     * @param request DeleteTransitRouterCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterCidrResponse
     */
    public DeleteTransitRouterCidrResponse deleteTransitRouterCidrWithOptions(DeleteTransitRouterCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterCidrId)) {
            query.put("TransitRouterCidrId", request.transitRouterCidrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterCidr"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterCidrResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterCidrResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If IP addresses within the CIDR block have been allocated to network instances, the CIDR block cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CIDR block from a transit router.</p>
     * 
     * @param request DeleteTransitRouterCidrRequest
     * @return DeleteTransitRouterCidrResponse
     */
    public DeleteTransitRouterCidrResponse deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterCidrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If the ECR connection is in the Detaching state, the ECR connection is being deleted. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If the ECR connection cannot be found, the ECR connection is deleted. Before you call the DeleteTransitRouterEcrAttachment operation, make sure that all request parameters are valid. If a request is invalid, a request ID is returned but the ECR connection is not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect Router (ECR) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterEcrAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterEcrAttachmentResponse
     */
    public DeleteTransitRouterEcrAttachmentResponse deleteTransitRouterEcrAttachmentWithOptions(DeleteTransitRouterEcrAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterEcrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterEcrAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterEcrAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If the ECR connection is in the Detaching state, the ECR connection is being deleted. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If the ECR connection cannot be found, the ECR connection is deleted. Before you call the DeleteTransitRouterEcrAttachment operation, make sure that all request parameters are valid. If a request is invalid, a request ID is returned but the ECR connection is not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Express Connect Router (ECR) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterEcrAttachmentRequest
     * @return DeleteTransitRouterEcrAttachmentResponse
     */
    public DeleteTransitRouterEcrAttachmentResponse deleteTransitRouterEcrAttachment(DeleteTransitRouterEcrAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterEcrAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a multicast domain, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The multicast domain is disassociated from all vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>All multicast sources and members are removed from the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not added to other multicast domains as a multicast member. If the multicast domain is added to another multicast domain as a multicast member, you must remove the multicast domain from the other multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure all the request parameters are valid. If a request parameter is invalid, a request ID is returned after you call the operation, but the multicast domain is not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast domain.</p>
     * 
     * @param request DeleteTransitRouterMulticastDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterMulticastDomainResponse
     */
    public DeleteTransitRouterMulticastDomainResponse deleteTransitRouterMulticastDomainWithOptions(DeleteTransitRouterMulticastDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterMulticastDomain"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterMulticastDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterMulticastDomainResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you delete a multicast domain, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The multicast domain is disassociated from all vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>All multicast sources and members are removed from the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not added to other multicast domains as a multicast member. If the multicast domain is added to another multicast domain as a multicast member, you must remove the multicast domain from the other multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure all the request parameters are valid. If a request parameter is invalid, a request ID is returned after you call the operation, but the multicast domain is not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast domain.</p>
     * 
     * @param request DeleteTransitRouterMulticastDomainRequest
     * @return DeleteTransitRouterMulticastDomainResponse
     */
    public DeleteTransitRouterMulticastDomainResponse deleteTransitRouterMulticastDomain(DeleteTransitRouterMulticastDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterMulticastDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterPeerAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection cannot be found, the inter-region connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you begin, make sure that the Enterprise Edition transit router that you use to create inter-region connections meets the following prerequisites:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from route tables of Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route table does not contain a route whose next hop is the inter-region connection and that is generated from a prefix list. You can delete routes from a route table by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>No quality of service (QoS) policy is configured for the inter-region connection. For more information about how to delete QoS policies, see <a href="https://help.aliyun.com/document_detail/427547.html">DeleteCenInterRegionTrafficQosPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an inter-region connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterPeerAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterPeerAttachmentResponse
     */
    public DeleteTransitRouterPeerAttachmentResponse deleteTransitRouterPeerAttachmentWithOptions(DeleteTransitRouterPeerAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterPeerAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterPeerAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterPeerAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterPeerAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection cannot be found, the inter-region connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you begin, make sure that the Enterprise Edition transit router that you use to create inter-region connections meets the following prerequisites:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from route tables of Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route table does not contain a route whose next hop is the inter-region connection and that is generated from a prefix list. You can delete routes from a route table by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>No quality of service (QoS) policy is configured for the inter-region connection. For more information about how to delete QoS policies, see <a href="https://help.aliyun.com/document_detail/427547.html">DeleteCenInterRegionTrafficQosPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an inter-region connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterPeerAttachmentRequest
     * @return DeleteTransitRouterPeerAttachmentResponse
     */
    public DeleteTransitRouterPeerAttachmentResponse deleteTransitRouterPeerAttachment(DeleteTransitRouterPeerAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterPeerAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you disassociate a route table of an Enterprise Edition transit router from a prefix list, the routes that point to the CIDR blocks in the prefix list are automatically withdrawn from the route table. Before you disassociate the route table of an Enterprise Edition transit router from a prefix list, you must migrate workloads that use the routes in case services are interrupted.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates the route table of an Enterprise Edition transit router from a prefix list.</p>
     * 
     * @param request DeleteTransitRouterPrefixListAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterPrefixListAssociationResponse
     */
    public DeleteTransitRouterPrefixListAssociationResponse deleteTransitRouterPrefixListAssociationWithOptions(DeleteTransitRouterPrefixListAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            query.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            query.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixListId)) {
            query.put("PrefixListId", request.prefixListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterTableId)) {
            query.put("TransitRouterTableId", request.transitRouterTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterPrefixListAssociation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterPrefixListAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterPrefixListAssociationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you disassociate a route table of an Enterprise Edition transit router from a prefix list, the routes that point to the CIDR blocks in the prefix list are automatically withdrawn from the route table. Before you disassociate the route table of an Enterprise Edition transit router from a prefix list, you must migrate workloads that use the routes in case services are interrupted.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates the route table of an Enterprise Edition transit router from a prefix list.</p>
     * 
     * @param request DeleteTransitRouterPrefixListAssociationRequest
     * @return DeleteTransitRouterPrefixListAssociationResponse
     */
    public DeleteTransitRouterPrefixListAssociationResponse deleteTransitRouterPrefixListAssociation(DeleteTransitRouterPrefixListAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterPrefixListAssociationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you specify the <strong>TransitRouterRouteEntryId</strong> parameter to delete a specific route, you do not need to configure the <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, parameter conflicts occur.</li>
     * <li>If you do not specify the <strong>TransitRouterRouteEntryId</strong> parameter, configure the following parameters based on the next hop type of the route that you want to delete:<ul>
     * <li>To delete a blackhole route, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete routes other than blackhole routes, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteEntries</strong> operation to query the status of a route entry.<ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this case, you can query the route entry but cannot perform other operations.</li>
     * <li>If a route entry cannot be found, it is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can call this operation to delete only static routes. Automatically learned routes are not supported. You can call the <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> operation to query route types.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes blackhole routes and static routes that point to network instance connections from the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterRouteEntryResponse
     */
    public DeleteTransitRouterRouteEntryResponse deleteTransitRouterRouteEntryWithOptions(DeleteTransitRouterRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryDestinationCidrBlock)) {
            query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryId)) {
            query.put("TransitRouterRouteEntryId", request.transitRouterRouteEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopId)) {
            query.put("TransitRouterRouteEntryNextHopId", request.transitRouterRouteEntryNextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopType)) {
            query.put("TransitRouterRouteEntryNextHopType", request.transitRouterRouteEntryNextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterRouteEntryResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you specify the <strong>TransitRouterRouteEntryId</strong> parameter to delete a specific route, you do not need to configure the <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, parameter conflicts occur.</li>
     * <li>If you do not specify the <strong>TransitRouterRouteEntryId</strong> parameter, configure the following parameters based on the next hop type of the route that you want to delete:<ul>
     * <li>To delete a blackhole route, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete routes other than blackhole routes, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteEntries</strong> operation to query the status of a route entry.<ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this case, you can query the route entry but cannot perform other operations.</li>
     * <li>If a route entry cannot be found, it is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can call this operation to delete only static routes. Automatically learned routes are not supported. You can call the <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> operation to query route types.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes blackhole routes and static routes that point to network instance connections from the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterRouteEntryRequest
     * @return DeleteTransitRouterRouteEntryResponse
     */
    public DeleteTransitRouterRouteEntryResponse deleteTransitRouterRouteEntry(DeleteTransitRouterRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the default route table of an Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTables</strong> operation to query the status of a custom route table.<ul>
     * <li>If a custom route table is in the Deleting state, the custom route table is being deleted. In this case, you can query the custom route table but cannot perform other operations.</li>
     * <li>If a custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom route table from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterRouteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterRouteTableResponse
     */
    public DeleteTransitRouterRouteTableResponse deleteTransitRouterRouteTableWithOptions(DeleteTransitRouterRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterRouteTableResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the default route table of an Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTables</strong> operation to query the status of a custom route table.<ul>
     * <li>If a custom route table is in the Deleting state, the custom route table is being deleted. In this case, you can query the custom route table but cannot perform other operations.</li>
     * <li>If a custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom route table from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterRouteTableRequest
     * @return DeleteTransitRouterRouteTableResponse
     */
    public DeleteTransitRouterRouteTableResponse deleteTransitRouterRouteTable(DeleteTransitRouterRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterRouteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. You can query the VBR connection but cannot perform other operations.</li>
     * <li>If a VBR connection cannot be found, the VBR connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VBR connection for an Enterprise Edition transit router, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom route entries, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route whose next hop is the VBR connection and that is generated from a prefix list. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual border router (VBR) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterVbrAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterVbrAttachmentResponse
     */
    public DeleteTransitRouterVbrAttachmentResponse deleteTransitRouterVbrAttachmentWithOptions(DeleteTransitRouterVbrAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterVbrAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVbrAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterVbrAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. You can query the VBR connection but cannot perform other operations.</li>
     * <li>If a VBR connection cannot be found, the VBR connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VBR connection for an Enterprise Edition transit router, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom route entries, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route whose next hop is the VBR connection and that is generated from a prefix list. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual border router (VBR) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterVbrAttachmentRequest
     * @return DeleteTransitRouterVbrAttachmentResponse
     */
    public DeleteTransitRouterVbrAttachmentResponse deleteTransitRouterVbrAttachment(DeleteTransitRouterVbrAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterVbrAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection cannot be found, it is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VPC connection, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route table of the VPC does not contain routes that point to the VPC connection. For more information about how to delete routes from a VPC route table, see <a href="https://help.aliyun.com/document_detail/36013.html">DeleteRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from the route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route that is generated from a prefix list and the next hop is the VPC connection. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterVpcAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterVpcAttachmentResponse
     */
    public DeleteTransitRouterVpcAttachmentResponse deleteTransitRouterVpcAttachmentWithOptions(DeleteTransitRouterVpcAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterVpcAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVpcAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterVpcAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection cannot be found, it is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VPC connection, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route table of the VPC does not contain routes that point to the VPC connection. For more information about how to delete routes from a VPC route table, see <a href="https://help.aliyun.com/document_detail/36013.html">DeleteRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from the route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route that is generated from a prefix list and the next hop is the VPC connection. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) connection from an Enterprise Edition transit router.</p>
     * 
     * @param request DeleteTransitRouterVpcAttachmentRequest
     * @return DeleteTransitRouterVpcAttachmentResponse
     */
    public DeleteTransitRouterVpcAttachmentResponse deleteTransitRouterVpcAttachment(DeleteTransitRouterVpcAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterVpcAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the VPN attachment is not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPN attachment.</p>
     * 
     * @param request DeleteTransitRouterVpnAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTransitRouterVpnAttachmentResponse
     */
    public DeleteTransitRouterVpnAttachmentResponse deleteTransitRouterVpnAttachmentWithOptions(DeleteTransitRouterVpnAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTransitRouterVpnAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVpnAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteTransitRouterVpnAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the VPN attachment is not deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPN attachment.</p>
     * 
     * @param request DeleteTransitRouterVpnAttachmentRequest
     * @return DeleteTransitRouterVpnAttachmentResponse
     */
    public DeleteTransitRouterVpnAttachmentResponse deleteTransitRouterVpnAttachment(DeleteTransitRouterVpnAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTransitRouterVpnAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
     * <li>If a multicast member cannot be found, the multicast member is removed from the multicast group.``
     * Before you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that all request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast member is not removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast member from a multicast group.</p>
     * 
     * @param request DeregisterTransitRouterMulticastGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterTransitRouterMulticastGroupMembersResponse
     */
    public DeregisterTransitRouterMulticastGroupMembersResponse deregisterTransitRouterMulticastGroupMembersWithOptions(DeregisterTransitRouterMulticastGroupMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIpAddress)) {
            query.put("GroupIpAddress", request.groupIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIds)) {
            query.put("NetworkInterfaceIds", request.networkInterfaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerTransitRouterMulticastDomains)) {
            query.put("PeerTransitRouterMulticastDomains", request.peerTransitRouterMulticastDomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterTransitRouterMulticastGroupMembers"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterTransitRouterMulticastGroupMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeregisterTransitRouterMulticastGroupMembersResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
     * <li>If a multicast member cannot be found, the multicast member is removed from the multicast group.``
     * Before you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that all request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast member is not removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast member from a multicast group.</p>
     * 
     * @param request DeregisterTransitRouterMulticastGroupMembersRequest
     * @return DeregisterTransitRouterMulticastGroupMembersResponse
     */
    public DeregisterTransitRouterMulticastGroupMembersResponse deregisterTransitRouterMulticastGroupMembers(DeregisterTransitRouterMulticastGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterTransitRouterMulticastGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request a sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.</p>
     * <ul>
     * <li>If a multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. You can query the multicast source but cannot perform other operations.</li>
     * <li>If a multicast source cannot be found, the multicast source is deleted.
     * Before you call DeregisterTransitRouterMulticastGroupSources, make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast source is not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast source from a multicast group.</p>
     * 
     * @param request DeregisterTransitRouterMulticastGroupSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterTransitRouterMulticastGroupSourcesResponse
     */
    public DeregisterTransitRouterMulticastGroupSourcesResponse deregisterTransitRouterMulticastGroupSourcesWithOptions(DeregisterTransitRouterMulticastGroupSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIpAddress)) {
            query.put("GroupIpAddress", request.groupIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIds)) {
            query.put("NetworkInterfaceIds", request.networkInterfaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterTransitRouterMulticastGroupSources"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterTransitRouterMulticastGroupSourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeregisterTransitRouterMulticastGroupSourcesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request a sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.</p>
     * <ul>
     * <li>If a multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. You can query the multicast source but cannot perform other operations.</li>
     * <li>If a multicast source cannot be found, the multicast source is deleted.
     * Before you call DeregisterTransitRouterMulticastGroupSources, make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast source is not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast source from a multicast group.</p>
     * 
     * @param request DeregisterTransitRouterMulticastGroupSourcesRequest
     * @return DeregisterTransitRouterMulticastGroupSourcesResponse
     */
    public DeregisterTransitRouterMulticastGroupSourcesResponse deregisterTransitRouterMulticastGroupSources(DeregisterTransitRouterMulticastGroupSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterTransitRouterMulticastGroupSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a network instance, such as a virtual private cloud (VPC), a virtual border router, or a Cloud Connect Network (CCN) instance, that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenAttachedChildInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenAttachedChildInstanceAttributeResponse
     */
    public DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttributeWithOptions(DescribeCenAttachedChildInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DescribeCenAttachedChildInstanceAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstanceAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenAttachedChildInstanceAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a network instance, such as a virtual private cloud (VPC), a virtual border router, or a Cloud Connect Network (CCN) instance, that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenAttachedChildInstanceAttributeRequest
     * @return DescribeCenAttachedChildInstanceAttributeResponse
     */
    public DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenAttachedChildInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to query the information about the network instances that are attached to a CEN instance:</p>
     * <ul>
     * <li>You can query all the network instances that are attached to a CEN instance by setting the <code>CenId</code> parameter.</li>
     * <li>You can query the network instances that are attached to a CEN instance in a specified region by setting the <code>CenId</code> and <code>ChildInstanceRegionId</code> parameters.</li>
     * <li>You can query a specified type of network instances that are attached to a CEN instance by setting the <code>CenId</code> and <code>ChildInstanceType</code> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the network instances that are attached to a CEN instance.</p>
     * 
     * @param request DescribeCenAttachedChildInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenAttachedChildInstancesResponse
     */
    public DescribeCenAttachedChildInstancesResponse describeCenAttachedChildInstancesWithOptions(DescribeCenAttachedChildInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenAttachedChildInstances"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenAttachedChildInstancesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to query the information about the network instances that are attached to a CEN instance:</p>
     * <ul>
     * <li>You can query all the network instances that are attached to a CEN instance by setting the <code>CenId</code> parameter.</li>
     * <li>You can query the network instances that are attached to a CEN instance in a specified region by setting the <code>CenId</code> and <code>ChildInstanceRegionId</code> parameters.</li>
     * <li>You can query a specified type of network instances that are attached to a CEN instance by setting the <code>CenId</code> and <code>ChildInstanceType</code> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the network instances that are attached to a CEN instance.</p>
     * 
     * @param request DescribeCenAttachedChildInstancesRequest
     * @return DescribeCenAttachedChildInstancesResponse
     */
    public DescribeCenAttachedChildInstancesResponse describeCenAttachedChildInstances(DescribeCenAttachedChildInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenAttachedChildInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about bandwidth plans.</p>
     * 
     * @param request DescribeCenBandwidthPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenBandwidthPackagesResponse
     */
    public DescribeCenBandwidthPackagesResponse describeCenBandwidthPackagesWithOptions(DescribeCenBandwidthPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeReservationData)) {
            query.put("IncludeReservationData", request.includeReservationData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOrKey)) {
            query.put("IsOrKey", request.isOrKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenBandwidthPackages"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenBandwidthPackagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenBandwidthPackagesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about bandwidth plans.</p>
     * 
     * @param request DescribeCenBandwidthPackagesRequest
     * @return DescribeCenBandwidthPackagesResponse
     */
    public DescribeCenBandwidthPackagesResponse describeCenBandwidthPackages(DescribeCenBandwidthPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenBandwidthPackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenChildInstanceRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenChildInstanceRouteEntriesResponse
     */
    public DescribeCenChildInstanceRouteEntriesResponse describeCenChildInstanceRouteEntriesWithOptions(DescribeCenChildInstanceRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenChildInstanceRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenChildInstanceRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenChildInstanceRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routes of a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenChildInstanceRouteEntriesRequest
     * @return DescribeCenChildInstanceRouteEntriesResponse
     */
    public DescribeCenChildInstanceRouteEntriesResponse describeCenChildInstanceRouteEntries(DescribeCenChildInstanceRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenChildInstanceRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the remaining bandwidth of a bandwidth plan.</p>
     * 
     * @param request DescribeCenGeographicSpanRemainingBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenGeographicSpanRemainingBandwidthResponse
     */
    public DescribeCenGeographicSpanRemainingBandwidthResponse describeCenGeographicSpanRemainingBandwidthWithOptions(DescribeCenGeographicSpanRemainingBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.geographicRegionAId)) {
            query.put("GeographicRegionAId", request.geographicRegionAId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.geographicRegionBId)) {
            query.put("GeographicRegionBId", request.geographicRegionBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenGeographicSpanRemainingBandwidth"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpanRemainingBandwidthResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenGeographicSpanRemainingBandwidthResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the remaining bandwidth of a bandwidth plan.</p>
     * 
     * @param request DescribeCenGeographicSpanRemainingBandwidthRequest
     * @return DescribeCenGeographicSpanRemainingBandwidthResponse
     */
    public DescribeCenGeographicSpanRemainingBandwidthResponse describeCenGeographicSpanRemainingBandwidth(DescribeCenGeographicSpanRemainingBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenGeographicSpanRemainingBandwidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the areas that a Cloud Enterprise Network (CEN) instance can connect.</p>
     * 
     * @param request DescribeCenGeographicSpansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenGeographicSpansResponse
     */
    public DescribeCenGeographicSpansResponse describeCenGeographicSpansWithOptions(DescribeCenGeographicSpansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.geographicSpanId)) {
            query.put("GeographicSpanId", request.geographicSpanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenGeographicSpans"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpansResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenGeographicSpansResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the areas that a Cloud Enterprise Network (CEN) instance can connect.</p>
     * 
     * @param request DescribeCenGeographicSpansRequest
     * @return DescribeCenGeographicSpansResponse
     */
    public DescribeCenGeographicSpansResponse describeCenGeographicSpans(DescribeCenGeographicSpansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenGeographicSpansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bandwidth of connections between regions.</p>
     * 
     * @param request DescribeCenInterRegionBandwidthLimitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenInterRegionBandwidthLimitsResponse
     */
    public DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimitsWithOptions(DescribeCenInterRegionBandwidthLimitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trRegionId)) {
            query.put("TrRegionId", request.trRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenInterRegionBandwidthLimits"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenInterRegionBandwidthLimitsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenInterRegionBandwidthLimitsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bandwidth of connections between regions.</p>
     * 
     * @param request DescribeCenInterRegionBandwidthLimitsRequest
     * @return DescribeCenInterRegionBandwidthLimitsResponse
     */
    public DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenInterRegionBandwidthLimitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connections to PrivateZone.</p>
     * 
     * @param request DescribeCenPrivateZoneRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenPrivateZoneRoutesResponse
     */
    public DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutesWithOptions(DescribeCenPrivateZoneRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionId)) {
            query.put("AccessRegionId", request.accessRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostRegionId)) {
            query.put("HostRegionId", request.hostRegionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenPrivateZoneRoutes"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenPrivateZoneRoutesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenPrivateZoneRoutesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connections to PrivateZone.</p>
     * 
     * @param request DescribeCenPrivateZoneRoutesRequest
     * @return DescribeCenPrivateZoneRoutesResponse
     */
    public DescribeCenPrivateZoneRoutesResponse describeCenPrivateZoneRoutes(DescribeCenPrivateZoneRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenPrivateZoneRoutesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about routes in a region for a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenRegionDomainRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenRegionDomainRouteEntriesResponse
     */
    public DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntriesWithOptions(DescribeCenRegionDomainRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenRegionId)) {
            query.put("CenRegionId", request.cenRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenRegionDomainRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRegionDomainRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenRegionDomainRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about routes in a region for a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeCenRegionDomainRouteEntriesRequest
     * @return DescribeCenRegionDomainRouteEntriesResponse
     */
    public DescribeCenRegionDomainRouteEntriesResponse describeCenRegionDomainRouteEntries(DescribeCenRegionDomainRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenRegionDomainRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries routing policies.</p>
     * 
     * @param request DescribeCenRouteMapsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenRouteMapsResponse
     */
    public DescribeCenRouteMapsResponse describeCenRouteMapsWithOptions(DescribeCenRouteMapsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenRegionId)) {
            query.put("CenRegionId", request.cenRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapId)) {
            query.put("RouteMapId", request.routeMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmitDirection)) {
            query.put("TransmitDirection", request.transmitDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenRouteMaps"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRouteMapsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenRouteMapsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries routing policies.</p>
     * 
     * @param request DescribeCenRouteMapsRequest
     * @return DescribeCenRouteMapsResponse
     */
    public DescribeCenRouteMapsResponse describeCenRouteMaps(DescribeCenRouteMapsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenRouteMapsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check configurations of virtual border routers (VBRs) in a region.</p>
     * 
     * @param request DescribeCenVbrHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCenVbrHealthCheckResponse
     */
    public DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheckWithOptions(DescribeCenVbrHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceOwnerId)) {
            query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceRegionId)) {
            query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenVbrHealthCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCenVbrHealthCheckResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check configurations of virtual border routers (VBRs) in a region.</p>
     * 
     * @param request DescribeCenVbrHealthCheckRequest
     * @return DescribeCenVbrHealthCheckResponse
     */
    public DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheck(DescribeCenVbrHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCenVbrHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about your Cloud Enterprise Network (CEN) instances.</p>
     * 
     * @param request DescribeCensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCens"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeCensResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about your Cloud Enterprise Network (CEN) instances.</p>
     * 
     * @param request DescribeCensRequest
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The regions that support CEN vary based on the network instance type. To query the regions where you can attach a specified type of network instance to CEN, set the <code>ProductType</code> parameter. If you do not set the <code>ProductType</code> parameter, the system queries all regions in which you can attach network instances to CEN, regardless of the network instance type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions in which you can attach network instances to Cloud Enterprise Network (CEN) instances.</p>
     * 
     * @param request DescribeChildInstanceRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChildInstanceRegionsResponse
     */
    public DescribeChildInstanceRegionsResponse describeChildInstanceRegionsWithOptions(DescribeChildInstanceRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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
            new TeaPair("action", "DescribeChildInstanceRegions"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChildInstanceRegionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeChildInstanceRegionsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The regions that support CEN vary based on the network instance type. To query the regions where you can attach a specified type of network instance to CEN, set the <code>ProductType</code> parameter. If you do not set the <code>ProductType</code> parameter, the system queries all regions in which you can attach network instances to CEN, regardless of the network instance type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions in which you can attach network instances to Cloud Enterprise Network (CEN) instances.</p>
     * 
     * @param request DescribeChildInstanceRegionsRequest
     * @return DescribeChildInstanceRegionsResponse
     */
    public DescribeChildInstanceRegionsResponse describeChildInstanceRegions(DescribeChildInstanceRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChildInstanceRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries flow logs.</p>
     * 
     * @param request DescribeFlowlogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowlogsResponse
     */
    public DescribeFlowlogsResponse describeFlowlogsWithOptions(DescribeFlowlogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            query.put("FlowLogName", request.flowLogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogVersion)) {
            query.put("FlowLogVersion", request.flowLogVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            query.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowlogs"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowlogsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeFlowlogsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries flow logs.</p>
     * 
     * @param request DescribeFlowlogsRequest
     * @return DescribeFlowlogsResponse
     */
    public DescribeFlowlogsResponse describeFlowlogs(DescribeFlowlogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowlogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in an area.</p>
     * 
     * @param request DescribeGeographicRegionMembershipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGeographicRegionMembershipResponse
     */
    public DescribeGeographicRegionMembershipResponse describeGeographicRegionMembershipWithOptions(DescribeGeographicRegionMembershipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.geographicRegionId)) {
            query.put("GeographicRegionId", request.geographicRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGeographicRegionMembership"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGeographicRegionMembershipResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeGeographicRegionMembershipResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in an area.</p>
     * 
     * @param request DescribeGeographicRegionMembershipRequest
     * @return DescribeGeographicRegionMembershipResponse
     */
    public DescribeGeographicRegionMembershipResponse describeGeographicRegionMembership(DescribeGeographicRegionMembershipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGeographicRegionMembershipWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the network instances are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network instances of other Alibaba Cloud accounts that have granted permissions to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeGrantRulesToCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGrantRulesToCenResponse
     */
    public DescribeGrantRulesToCenResponse describeGrantRulesToCenWithOptions(DescribeGrantRulesToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceOwnerId)) {
            query.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledIpv6)) {
            query.put("EnabledIpv6", request.enabledIpv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "DescribeGrantRulesToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesToCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeGrantRulesToCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the network instances are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network instances of other Alibaba Cloud accounts that have granted permissions to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeGrantRulesToCenRequest
     * @return DescribeGrantRulesToCenResponse
     */
    public DescribeGrantRulesToCenResponse describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantRulesToCenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the permissions that the Alibaba Cloud account of a network instance granted to a Cloud Enterprise Network (CEN) instance in a different Alibaba Cloud account, the ID of the CEN instance, and the Alibaba Cloud account that pays the fees of the network instance.</p>
     * 
     * @param request DescribeGrantRulesToResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGrantRulesToResourceResponse
     */
    public DescribeGrantRulesToResourceResponse describeGrantRulesToResourceWithOptions(DescribeGrantRulesToResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("action", "DescribeGrantRulesToResource"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesToResourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeGrantRulesToResourceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the permissions that the Alibaba Cloud account of a network instance granted to a Cloud Enterprise Network (CEN) instance in a different Alibaba Cloud account, the ID of the CEN instance, and the Alibaba Cloud account that pays the fees of the network instance.</p>
     * 
     * @param request DescribeGrantRulesToResourceRequest
     * @return DescribeGrantRulesToResourceResponse
     */
    public DescribeGrantRulesToResourceResponse describeGrantRulesToResource(DescribeGrantRulesToResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGrantRulesToResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the routes of virtual private clouds (VPCs) and virtual border routers (VBRs) are advertised to the Cloud Enterprise Network (CEN) instance to which the VCPs and VBRs are attached.</p>
     * 
     * @param request DescribePublishedRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePublishedRouteEntriesResponse
     */
    public DescribePublishedRouteEntriesResponse describePublishedRouteEntriesWithOptions(DescribePublishedRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublishedRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublishedRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribePublishedRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the routes of virtual private clouds (VPCs) and virtual border routers (VBRs) are advertised to the Cloud Enterprise Network (CEN) instance to which the VCPs and VBRs are attached.</p>
     * 
     * @param request DescribePublishedRouteEntriesRequest
     * @return DescribePublishedRouteEntriesResponse
     */
    public DescribePublishedRouteEntriesResponse describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePublishedRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries overlapping routes.</p>
     * 
     * @param request DescribeRouteConflictRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRouteConflictResponse
     */
    public DescribeRouteConflictResponse describeRouteConflictWithOptions(DescribeRouteConflictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteConflict"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteConflictResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRouteConflictResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries overlapping routes.</p>
     * 
     * @param request DescribeRouteConflictRequest
     * @return DescribeRouteConflictResponse
     */
    public DescribeRouteConflictResponse describeRouteConflict(DescribeRouteConflictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteConflictWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of cloud services, such as the cloud service status and the ID of the associated VPC.</p>
     * 
     * @param request DescribeRouteServicesInCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRouteServicesInCenResponse
     */
    public DescribeRouteServicesInCenResponse describeRouteServicesInCenWithOptions(DescribeRouteServicesInCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionId)) {
            query.put("AccessRegionId", request.accessRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostRegionId)) {
            query.put("HostRegionId", request.hostRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostVpcId)) {
            query.put("HostVpcId", request.hostVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRouteServicesInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteServicesInCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRouteServicesInCenResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of cloud services, such as the cloud service status and the ID of the associated VPC.</p>
     * 
     * @param request DescribeRouteServicesInCenRequest
     * @return DescribeRouteServicesInCenResponse
     */
    public DescribeRouteServicesInCenResponse describeRouteServicesInCen(DescribeRouteServicesInCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRouteServicesInCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can set the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to specify the aggregate routes that you want to query. If you set only the <strong>TransitRouteTableId</strong> parameter, all aggregate routes in the specified route table are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the aggregate routes on an Enterprise Edition transit router.</p>
     * 
     * @param request DescribeTransitRouteTableAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransitRouteTableAggregationResponse
     */
    public DescribeTransitRouteTableAggregationResponse describeTransitRouteTableAggregationWithOptions(DescribeTransitRouteTableAggregationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransitRouteTableAggregation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransitRouteTableAggregationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTransitRouteTableAggregationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can set the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to specify the aggregate routes that you want to query. If you set only the <strong>TransitRouteTableId</strong> parameter, all aggregate routes in the specified route table are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the aggregate routes on an Enterprise Edition transit router.</p>
     * 
     * @param request DescribeTransitRouteTableAggregationRequest
     * @return DescribeTransitRouteTableAggregationResponse
     */
    public DescribeTransitRouteTableAggregationResponse describeTransitRouteTableAggregation(DescribeTransitRouteTableAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransitRouteTableAggregationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of an aggregate route.</p>
     * 
     * @param request DescribeTransitRouteTableAggregationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransitRouteTableAggregationDetailResponse
     */
    public DescribeTransitRouteTableAggregationDetailResponse describeTransitRouteTableAggregationDetailWithOptions(DescribeTransitRouteTableAggregationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransitRouteTableAggregationDetail"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransitRouteTableAggregationDetailResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTransitRouteTableAggregationDetailResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of an aggregate route.</p>
     * 
     * @param request DescribeTransitRouteTableAggregationDetailRequest
     * @return DescribeTransitRouteTableAggregationDetailResponse
     */
    public DescribeTransitRouteTableAggregationDetailResponse describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransitRouteTableAggregationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches a network instance from a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DetachCenChildInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachCenChildInstanceResponse
     */
    public DetachCenChildInstanceResponse detachCenChildInstanceWithOptions(DetachCenChildInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceOwnerId)) {
            query.put("ChildInstanceOwnerId", request.childInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DetachCenChildInstance"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCenChildInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetachCenChildInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Detaches a network instance from a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DetachCenChildInstanceRequest
     * @return DetachCenChildInstanceResponse
     */
    public DetachCenChildInstanceResponse detachCenChildInstance(DetachCenChildInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachCenChildInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If the health check configurations cannot be found, the health check configurations are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the health check feature for a virtual border router (VBR).</p>
     * 
     * @param request DisableCenVbrHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCenVbrHealthCheckResponse
     */
    public DisableCenVbrHealthCheckResponse disableCenVbrHealthCheckWithOptions(DisableCenVbrHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceOwnerId)) {
            query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceRegionId)) {
            query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCenVbrHealthCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableCenVbrHealthCheckResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If the health check configurations cannot be found, the health check configurations are deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the health check feature for a virtual border router (VBR).</p>
     * 
     * @param request DisableCenVbrHealthCheckRequest
     * @return DisableCenVbrHealthCheckResponse
     */
    public DisableCenVbrHealthCheckResponse disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCenVbrHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an synchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the status of a route learning correlation.</p>
     * <ul>
     * <li>If a route learning correlation is in the <strong>Disabling</strong> state, the route learning correlation is being deleted. You can query the route learning correlation but cannot perform other operations.</li>
     * <li>If a route learning correlation cannot be found, the route learning correlation is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route learning correlation.</p>
     * 
     * @param request DisableTransitRouterRouteTablePropagationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableTransitRouterRouteTablePropagationResponse
     */
    public DisableTransitRouterRouteTablePropagationResponse disableTransitRouterRouteTablePropagationWithOptions(DisableTransitRouterRouteTablePropagationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableTransitRouterRouteTablePropagation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTransitRouterRouteTablePropagationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisableTransitRouterRouteTablePropagationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an synchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the status of a route learning correlation.</p>
     * <ul>
     * <li>If a route learning correlation is in the <strong>Disabling</strong> state, the route learning correlation is being deleted. You can query the route learning correlation but cannot perform other operations.</li>
     * <li>If a route learning correlation cannot be found, the route learning correlation is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route learning correlation.</p>
     * 
     * @param request DisableTransitRouterRouteTablePropagationRequest
     * @return DisableTransitRouterRouteTablePropagationResponse
     */
    public DisableTransitRouterRouteTablePropagationResponse disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableTransitRouterRouteTablePropagationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a vSwitch from a multicast domain, make sure that the vSwitch does not contain a multicast source or a multicast member. For more information about how to remove a multicast source or member from a vSwitch, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</p>
     * <ul>
     * <li>If a request parameter is invalid, the system returns a request ID but does not disassociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation to query whether a vSwitch is disassociated from the specified multicast domain.<ul>
     * <li>If the status is <strong>Dissociating</strong>, it indicates that the vSwitch is being disassociated from the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the vSwitch cannot be found, the vSwitch is disassociated from the multicast domain.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a vSwitch from a multicast domain.</p>
     * 
     * @param request DisassociateTransitRouterMulticastDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateTransitRouterMulticastDomainResponse
     */
    public DisassociateTransitRouterMulticastDomainResponse disassociateTransitRouterMulticastDomainWithOptions(DisassociateTransitRouterMulticastDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateTransitRouterMulticastDomain"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateTransitRouterMulticastDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisassociateTransitRouterMulticastDomainResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a vSwitch from a multicast domain, make sure that the vSwitch does not contain a multicast source or a multicast member. For more information about how to remove a multicast source or member from a vSwitch, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</p>
     * <ul>
     * <li>If a request parameter is invalid, the system returns a request ID but does not disassociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation to query whether a vSwitch is disassociated from the specified multicast domain.<ul>
     * <li>If the status is <strong>Dissociating</strong>, it indicates that the vSwitch is being disassociated from the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the vSwitch cannot be found, the vSwitch is disassociated from the multicast domain.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a vSwitch from a multicast domain.</p>
     * 
     * @param request DisassociateTransitRouterMulticastDomainRequest
     * @return DisassociateTransitRouterMulticastDomainResponse
     */
    public DisassociateTransitRouterMulticastDomainResponse disassociateTransitRouterMulticastDomain(DisassociateTransitRouterMulticastDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateTransitRouterMulticastDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query an associated forwarding correlation between a network instance connection and a route table.</p>
     * <ul>
     * <li>If an associated forwarding correlation is in the <strong>Dissociating</strong> state, the associated forwarding correlation is being deleted. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation cannot be found, the associated forwarding correlation is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an associated forwarding correlation.</p>
     * 
     * @param request DissociateTransitRouterAttachmentFromRouteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateTransitRouterAttachmentFromRouteTableResponse
     */
    public DissociateTransitRouterAttachmentFromRouteTableResponse dissociateTransitRouterAttachmentFromRouteTableWithOptions(DissociateTransitRouterAttachmentFromRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateTransitRouterAttachmentFromRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateTransitRouterAttachmentFromRouteTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DissociateTransitRouterAttachmentFromRouteTableResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query an associated forwarding correlation between a network instance connection and a route table.</p>
     * <ul>
     * <li>If an associated forwarding correlation is in the <strong>Dissociating</strong> state, the associated forwarding correlation is being deleted. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation cannot be found, the associated forwarding correlation is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an associated forwarding correlation.</p>
     * 
     * @param request DissociateTransitRouterAttachmentFromRouteTableRequest
     * @return DissociateTransitRouterAttachmentFromRouteTableResponse
     */
    public DissociateTransitRouterAttachmentFromRouteTableResponse dissociateTransitRouterAttachmentFromRouteTable(DissociateTransitRouterAttachmentFromRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateTransitRouterAttachmentFromRouteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can enable the health check feature for a VBR to monitor the Express Connect circuit between your data center and Alibaba Cloud. This helps you detect connection issues in a timely manner.
     * Before you use the health check feature, take note of the following information:</p>
     * <ul>
     * <li>If your VBR uses static routing, you must add a static route for the data center that is connected to the VBR after you configure the health check feature. Set the destination CIDR block to the source IP address of health checks, set the mask length to 32, and set the next hop to the IP address of the VBR on the Alibaba Cloud side.</li>
     * <li>If your VBR uses dynamic Border Gateway Protocol (BGP) routing, you do not need to add routes for the data center.</li>
     * <li><strong>EnableCenVbrHealthCheck</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If health check configurations are returned, health check is configured or modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the health check feature for a virtual border router (VBR) to detect anomalies on Express Connect circuits. You can modify the health check configuration of a VBR based on business requirements.</p>
     * 
     * @param request EnableCenVbrHealthCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCenVbrHealthCheckResponse
     */
    public EnableCenVbrHealthCheckResponse enableCenVbrHealthCheckWithOptions(EnableCenVbrHealthCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckOnly)) {
            query.put("HealthCheckOnly", request.healthCheckOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckSourceIp)) {
            query.put("HealthCheckSourceIp", request.healthCheckSourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTargetIp)) {
            query.put("HealthCheckTargetIp", request.healthCheckTargetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceId)) {
            query.put("VbrInstanceId", request.vbrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceOwnerId)) {
            query.put("VbrInstanceOwnerId", request.vbrInstanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vbrInstanceRegionId)) {
            query.put("VbrInstanceRegionId", request.vbrInstanceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCenVbrHealthCheck"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCenVbrHealthCheckResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableCenVbrHealthCheckResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can enable the health check feature for a VBR to monitor the Express Connect circuit between your data center and Alibaba Cloud. This helps you detect connection issues in a timely manner.
     * Before you use the health check feature, take note of the following information:</p>
     * <ul>
     * <li>If your VBR uses static routing, you must add a static route for the data center that is connected to the VBR after you configure the health check feature. Set the destination CIDR block to the source IP address of health checks, set the mask length to 32, and set the next hop to the IP address of the VBR on the Alibaba Cloud side.</li>
     * <li>If your VBR uses dynamic Border Gateway Protocol (BGP) routing, you do not need to add routes for the data center.</li>
     * <li><strong>EnableCenVbrHealthCheck</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If health check configurations are returned, health check is configured or modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the health check feature for a virtual border router (VBR) to detect anomalies on Express Connect circuits. You can modify the health check configuration of a VBR based on business requirements.</p>
     * 
     * @param request EnableCenVbrHealthCheckRequest
     * @return EnableCenVbrHealthCheckResponse
     */
    public EnableCenVbrHealthCheckResponse enableCenVbrHealthCheck(EnableCenVbrHealthCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCenVbrHealthCheckWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you establish a network instance connection on a transit router, you can create a route learning correlation for the network instance connection. Then, the routes of the connected network instance are automatically advertised to the route table of the transit router. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>You can create route learning correlations only on Enterprise Edition transit routers. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li><strong>EnableTransitRouterRouteTablePropagation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning status between a network instance connection and a route table.<ul>
     * <li><strong>Enabling</strong> indicates that a route learning correlation is being created between the network instance connection and route table. You can query the route learning correlation but cannot perform other operations.</li>
     * <li><strong>Active</strong> indicates that the route learning correlation is created between the network instance connection and route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route learning correlation.</p>
     * 
     * @param request EnableTransitRouterRouteTablePropagationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableTransitRouterRouteTablePropagationResponse
     */
    public EnableTransitRouterRouteTablePropagationResponse enableTransitRouterRouteTablePropagationWithOptions(EnableTransitRouterRouteTablePropagationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableTransitRouterRouteTablePropagation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTransitRouterRouteTablePropagationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EnableTransitRouterRouteTablePropagationResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you establish a network instance connection on a transit router, you can create a route learning correlation for the network instance connection. Then, the routes of the connected network instance are automatically advertised to the route table of the transit router. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>You can create route learning correlations only on Enterprise Edition transit routers. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li><strong>EnableTransitRouterRouteTablePropagation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning status between a network instance connection and a route table.<ul>
     * <li><strong>Enabling</strong> indicates that a route learning correlation is being created between the network instance connection and route table. You can query the route learning correlation but cannot perform other operations.</li>
     * <li><strong>Active</strong> indicates that the route learning correlation is created between the network instance connection and route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route learning correlation.</p>
     * 
     * @param request EnableTransitRouterRouteTablePropagationRequest
     * @return EnableTransitRouterRouteTablePropagationResponse
     */
    public EnableTransitRouterRouteTablePropagationResponse enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableTransitRouterRouteTablePropagationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <code>GrantInstanceToTransitRouter</code> operation can be used to grant transit routers permissions on network instances that belong to other Alibaba Cloud accounts, including virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs).
     *     To grant transit routers permissions on Cloud Connect Network (CCN) instances, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * <ul>
     * <li>Before you call <code>GrantInstanceToTransitRouter</code>, take note of the billing rules, permission limits, and prerequisites on permission management of transit routers. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>Before you grant a transit router permissions on a network instance, make sure that the following requirements are met:
     * The account to which the network instance belongs and the account to which the transit router belongs are of the same type.
     * The ID of the Alibaba Cloud account to which the transit router belongs is obtained.
     * The ID of the Cloud Enterprise Network (CEN) instance to which the Enterprise Edition transit router belongs is obtained.
     * Before you grant a transit router permissions on a VBR, contact your account manager to acquire permissions on the VBR.
     * Before you grant a transit router permissions on an IPsec-VPN connection, make sure that the IPsec-VPN connection is not associated with a resource.
     * If the IPsec-VPN connection is attached to a VPN gateway, the IPsec-VPN connection cannot be attached to transit routers within the same account or different accounts.
     * If the IPsec-VPN connection is attached to a transit router, detach the IPsec-VPN connection from the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants a transit router permissions on network instances that belong to another Alibaba Cloud account. To connect a transit router of Account B to a network instance of Account A, you must use Account A to grant permissions to the transit router of Account B.</p>
     * 
     * @param request GrantInstanceToTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantInstanceToTransitRouterResponse
     */
    public GrantInstanceToTransitRouterResponse grantInstanceToTransitRouterWithOptions(GrantInstanceToTransitRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "GrantInstanceToTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToTransitRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GrantInstanceToTransitRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  The <code>GrantInstanceToTransitRouter</code> operation can be used to grant transit routers permissions on network instances that belong to other Alibaba Cloud accounts, including virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs).
     *     To grant transit routers permissions on Cloud Connect Network (CCN) instances, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * <ul>
     * <li>Before you call <code>GrantInstanceToTransitRouter</code>, take note of the billing rules, permission limits, and prerequisites on permission management of transit routers. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>Before you grant a transit router permissions on a network instance, make sure that the following requirements are met:
     * The account to which the network instance belongs and the account to which the transit router belongs are of the same type.
     * The ID of the Alibaba Cloud account to which the transit router belongs is obtained.
     * The ID of the Cloud Enterprise Network (CEN) instance to which the Enterprise Edition transit router belongs is obtained.
     * Before you grant a transit router permissions on a VBR, contact your account manager to acquire permissions on the VBR.
     * Before you grant a transit router permissions on an IPsec-VPN connection, make sure that the IPsec-VPN connection is not associated with a resource.
     * If the IPsec-VPN connection is attached to a VPN gateway, the IPsec-VPN connection cannot be attached to transit routers within the same account or different accounts.
     * If the IPsec-VPN connection is attached to a transit router, detach the IPsec-VPN connection from the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants a transit router permissions on network instances that belong to another Alibaba Cloud account. To connect a transit router of Account B to a network instance of Account A, you must use Account A to grant permissions to the transit router of Account B.</p>
     * 
     * @param request GrantInstanceToTransitRouterRequest
     * @return GrantInstanceToTransitRouterResponse
     */
    public GrantInstanceToTransitRouterResponse grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantInstanceToTransitRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that all request parameter values are valid. If a parameter is set to an invalid value, a request ID is returned, but the routes to the network instance are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries routes in route tables of network instances that point to network instance connections on Enterprise Edition transit routers.</p>
     * 
     * @param request ListCenChildInstanceRouteEntriesToAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCenChildInstanceRouteEntriesToAttachmentResponse
     */
    public ListCenChildInstanceRouteEntriesToAttachmentResponse listCenChildInstanceRouteEntriesToAttachmentWithOptions(ListCenChildInstanceRouteEntriesToAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeFilter)) {
            query.put("RouteFilter", request.routeFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCenChildInstanceRouteEntriesToAttachment"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenChildInstanceRouteEntriesToAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCenChildInstanceRouteEntriesToAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that all request parameter values are valid. If a parameter is set to an invalid value, a request ID is returned, but the routes to the network instance are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries routes in route tables of network instances that point to network instance connections on Enterprise Edition transit routers.</p>
     * 
     * @param request ListCenChildInstanceRouteEntriesToAttachmentRequest
     * @return ListCenChildInstanceRouteEntriesToAttachmentResponse
     */
    public ListCenChildInstanceRouteEntriesToAttachmentResponse listCenChildInstanceRouteEntriesToAttachment(ListCenChildInstanceRouteEntriesToAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCenChildInstanceRouteEntriesToAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation, take note of the following information:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The information about the queues in the QoS policies is not returned. In this case, the <strong>TrafficQosQueues</strong> parameter is not included in the response.</li>
     * <li>If you specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns the information about the QoS policy and queues in the QoS policy. In this case, the <strong>TrafficQosQueues</strong> parameter is included in the response. If the value of the <strong>TrafficQosQueues</strong> parameter is an empty string, it indicates that the QoS policy contains only the default queue.</li>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the information about the QoS policy is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) policies.</p>
     * 
     * @param request ListCenInterRegionTrafficQosPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCenInterRegionTrafficQosPoliciesResponse
     */
    public ListCenInterRegionTrafficQosPoliciesResponse listCenInterRegionTrafficQosPoliciesWithOptions(ListCenInterRegionTrafficQosPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyDescription)) {
            query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyId)) {
            query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyName)) {
            query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCenInterRegionTrafficQosPolicies"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenInterRegionTrafficQosPoliciesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCenInterRegionTrafficQosPoliciesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation, take note of the following information:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The information about the queues in the QoS policies is not returned. In this case, the <strong>TrafficQosQueues</strong> parameter is not included in the response.</li>
     * <li>If you specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns the information about the QoS policy and queues in the QoS policy. In this case, the <strong>TrafficQosQueues</strong> parameter is included in the response. If the value of the <strong>TrafficQosQueues</strong> parameter is an empty string, it indicates that the QoS policy contains only the default queue.</li>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the information about the QoS policy is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries quality of service (QoS) policies.</p>
     * 
     * @param request ListCenInterRegionTrafficQosPoliciesRequest
     * @return ListCenInterRegionTrafficQosPoliciesResponse
     */
    public ListCenInterRegionTrafficQosPoliciesResponse listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCenInterRegionTrafficQosPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must specify at least one of the <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, and <strong>TrafficQosQueueId</strong> parameters.
     * Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the QoS queue information is not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about quality of service (QoS) queues.</p>
     * 
     * @param request ListCenInterRegionTrafficQosQueuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCenInterRegionTrafficQosQueuesResponse
     */
    public ListCenInterRegionTrafficQosQueuesResponse listCenInterRegionTrafficQosQueuesWithOptions(ListCenInterRegionTrafficQosQueuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveBandwidthFilter)) {
            query.put("EffectiveBandwidthFilter", request.effectiveBandwidthFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyId)) {
            query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosQueueDescription)) {
            query.put("TrafficQosQueueDescription", request.trafficQosQueueDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosQueueId)) {
            query.put("TrafficQosQueueId", request.trafficQosQueueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosQueueName)) {
            query.put("TrafficQosQueueName", request.trafficQosQueueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCenInterRegionTrafficQosQueues"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenInterRegionTrafficQosQueuesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListCenInterRegionTrafficQosQueuesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You must specify at least one of the <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, and <strong>TrafficQosQueueId</strong> parameters.
     * Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the QoS queue information is not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about quality of service (QoS) queues.</p>
     * 
     * @param request ListCenInterRegionTrafficQosQueuesRequest
     * @return ListCenInterRegionTrafficQosQueuesResponse
     */
    public ListCenInterRegionTrafficQosQueuesResponse listCenInterRegionTrafficQosQueues(ListCenInterRegionTrafficQosQueuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCenInterRegionTrafficQosQueuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call <code>ListGrantVSwitchEnis</code>, make sure that the VPC is attached to a Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic network interfaces (ENIs) that can be used as multicast sources or members in a specified virtual private cloud (VPC).</p>
     * 
     * @param request ListGrantVSwitchEnisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGrantVSwitchEnisResponse
     */
    public ListGrantVSwitchEnisResponse listGrantVSwitchEnisWithOptions(ListGrantVSwitchEnisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceName)) {
            query.put("NetworkInterfaceName", request.networkInterfaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryIpAddress)) {
            query.put("PrimaryIpAddress", request.primaryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrantVSwitchEnis"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantVSwitchEnisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListGrantVSwitchEnisResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call <code>ListGrantVSwitchEnis</code>, make sure that the VPC is attached to a Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic network interfaces (ENIs) that can be used as multicast sources or members in a specified virtual private cloud (VPC).</p>
     * 
     * @param request ListGrantVSwitchEnisRequest
     * @return ListGrantVSwitchEnisResponse
     */
    public ListGrantVSwitchEnisResponse listGrantVSwitchEnis(ListGrantVSwitchEnisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGrantVSwitchEnisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the <code>ListGrantVSwitchesToCen</code> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The permissions on the VPC are granted to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>The VPC is attached to the CEN instance.<ul>
     * <li>For more information about how to connect an Enterprise Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to connect a Basic Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the vSwitches in a virtual private cloud (VPC) that belongs to another Alibaba Cloud account and is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ListGrantVSwitchesToCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGrantVSwitchesToCenResponse
     */
    public ListGrantVSwitchesToCenResponse listGrantVSwitchesToCenWithOptions(ListGrantVSwitchesToCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledIpv6)) {
            query.put("EnabledIpv6", request.enabledIpv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGrantVSwitchesToCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantVSwitchesToCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListGrantVSwitchesToCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <code>ListGrantVSwitchesToCen</code> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The permissions on the VPC are granted to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>The VPC is attached to the CEN instance.<ul>
     * <li>For more information about how to connect an Enterprise Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to connect a Basic Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the vSwitches in a virtual private cloud (VPC) that belongs to another Alibaba Cloud account and is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ListGrantVSwitchesToCenRequest
     * @return ListGrantVSwitchesToCenResponse
     */
    public ListGrantVSwitchesToCenResponse listGrantVSwitchesToCen(ListGrantVSwitchesToCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGrantVSwitchesToCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To call this operation, you must set at least one of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>.</p>
     * <ul>
     * <li>If you set only <strong>ResourceId.N</strong>, the tags that are added to the specified CEN instances are returned.</li>
     * <li>If you set only <strong>Tag.N.Key</strong>, the CEN instances that have the specified tags are returned.</li>
     * <li>If you set both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags that are added to the specified CEN instances are returned.<ul>
     * <li>Make sure that the CEN instance specified by <strong>ResourceId.N</strong> has the tag specified by <strong>Tag.N.Key</strong>. Otherwise, the response returns null.</li>
     * <li>If multiple tag keys are specified, the logical operator among these tag keys is <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about tags that are added to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-09-12"),
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
     * <b>description</b> :
     * <p>To call this operation, you must set at least one of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>.</p>
     * <ul>
     * <li>If you set only <strong>ResourceId.N</strong>, the tags that are added to the specified CEN instances are returned.</li>
     * <li>If you set only <strong>Tag.N.Key</strong>, the CEN instances that have the specified tags are returned.</li>
     * <li>If you set both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags that are added to the specified CEN instances are returned.<ul>
     * <li>Make sure that the CEN instance specified by <strong>ResourceId.N</strong> has the tag specified by <strong>Tag.N.Key</strong>. Otherwise, the response returns null.</li>
     * <li>If multiple tag keys are specified, the logical operator among these tag keys is <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about tags that are added to a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Before you call the <strong>ListTrafficMarkingPolicies</strong> operation, take note of the following limits:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries only the information about the traffic marking policy based on the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The <strong>TrafficMatchRules</strong> parameter that contains the information about the traffic classification rules is not returned.</li>
     * <li>If you specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries the information about the traffic marking policy and traffic classification rules. The <strong>TrafficMatchRules</strong> parameter is returned in the response. If the value of the <strong>TrafficMatchRules</strong> parameter is an empty array, the traffic marking policy does not contain a traffic classification rule.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a traffic marking policy, such as the status and priority.</p>
     * 
     * @param request ListTrafficMarkingPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrafficMarkingPoliciesResponse
     */
    public ListTrafficMarkingPoliciesResponse listTrafficMarkingPoliciesWithOptions(ListTrafficMarkingPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyDescription)) {
            query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyName)) {
            query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrafficMarkingPolicies"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficMarkingPoliciesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTrafficMarkingPoliciesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the <strong>ListTrafficMarkingPolicies</strong> operation, take note of the following limits:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries only the information about the traffic marking policy based on the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The <strong>TrafficMatchRules</strong> parameter that contains the information about the traffic classification rules is not returned.</li>
     * <li>If you specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries the information about the traffic marking policy and traffic classification rules. The <strong>TrafficMatchRules</strong> parameter is returned in the response. If the value of the <strong>TrafficMatchRules</strong> parameter is an empty array, the traffic marking policy does not contain a traffic classification rule.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a traffic marking policy, such as the status and priority.</p>
     * 
     * @param request ListTrafficMarkingPoliciesRequest
     * @return ListTrafficMarkingPoliciesResponse
     */
    public ListTrafficMarkingPoliciesResponse listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrafficMarkingPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>ListTransitRouterAvailableResource</strong> operation to query the zones that support Enterprise Edition transit routers in a specified region.
     *     *   If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, general-purpose zones that support Enterprise Edition transit routers are queried.
     *     *   If you set <strong>SupportMulticast</strong> to <strong>true</strong>, zones in which Enterprise Edition transit routers support multicast are queried.</p>
     * <ul>
     * <li>On May 31, 2022, VPC-connected Enterprise Edition transit routers were optimized. Optimized Enterprise Edition transit routers do not require you to specify the primary and secondary zones when you connect VPCs to the Enterprise Edition transit routers. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been optimized, you must specify the primary and secondary zones when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>MasterZones</strong> and <strong>SlaveZones</strong> to query the primary and secondary zones.</li>
     * <li>If your Enterprise Edition transit router has been optimized, you can specify a zone as needed when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>AvailableZones</strong> to query the zones.
     * For more information about the optimization, see <a href="https://help.aliyun.com/document_detail/434191.html">Announcement: Optimization on VPC-connected Enterprise Edition transit routers</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones that support Enterprise Edition transit routers in a region.</p>
     * 
     * @param request ListTransitRouterAvailableResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterAvailableResourceResponse
     */
    public ListTransitRouterAvailableResourceResponse listTransitRouterAvailableResourceWithOptions(ListTransitRouterAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportMulticast)) {
            query.put("SupportMulticast", request.supportMulticast);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterAvailableResource"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterAvailableResourceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterAvailableResourceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>ListTransitRouterAvailableResource</strong> operation to query the zones that support Enterprise Edition transit routers in a specified region.
     *     *   If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, general-purpose zones that support Enterprise Edition transit routers are queried.
     *     *   If you set <strong>SupportMulticast</strong> to <strong>true</strong>, zones in which Enterprise Edition transit routers support multicast are queried.</p>
     * <ul>
     * <li>On May 31, 2022, VPC-connected Enterprise Edition transit routers were optimized. Optimized Enterprise Edition transit routers do not require you to specify the primary and secondary zones when you connect VPCs to the Enterprise Edition transit routers. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been optimized, you must specify the primary and secondary zones when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>MasterZones</strong> and <strong>SlaveZones</strong> to query the primary and secondary zones.</li>
     * <li>If your Enterprise Edition transit router has been optimized, you can specify a zone as needed when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>AvailableZones</strong> to query the zones.
     * For more information about the optimization, see <a href="https://help.aliyun.com/document_detail/434191.html">Announcement: Optimization on VPC-connected Enterprise Edition transit routers</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones that support Enterprise Edition transit routers in a region.</p>
     * 
     * @param request ListTransitRouterAvailableResourceRequest
     * @return ListTransitRouterAvailableResourceResponse
     */
    public ListTransitRouterAvailableResourceResponse listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterAvailableResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CIDR blocks of a transit router.</p>
     * 
     * @param request ListTransitRouterCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterCidrResponse
     */
    public ListTransitRouterCidrResponse listTransitRouterCidrWithOptions(ListTransitRouterCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterCidrId)) {
            query.put("TransitRouterCidrId", request.transitRouterCidrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterCidr"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterCidrResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterCidrResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CIDR blocks of a transit router.</p>
     * 
     * @param request ListTransitRouterCidrRequest
     * @return ListTransitRouterCidrResponse
     */
    public ListTransitRouterCidrResponse listTransitRouterCidr(ListTransitRouterCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterCidrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries how a CIDR block is allocated.</p>
     * 
     * @param request ListTransitRouterCidrAllocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterCidrAllocationResponse
     */
    public ListTransitRouterCidrAllocationResponse listTransitRouterCidrAllocationWithOptions(ListTransitRouterCidrAllocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentId)) {
            query.put("AttachmentId", request.attachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachmentName)) {
            query.put("AttachmentName", request.attachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedOwnerId)) {
            query.put("DedicatedOwnerId", request.dedicatedOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterCidrId)) {
            query.put("TransitRouterCidrId", request.transitRouterCidrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterCidrAllocation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterCidrAllocationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterCidrAllocationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries how a CIDR block is allocated.</p>
     * 
     * @param request ListTransitRouterCidrAllocationRequest
     * @return ListTransitRouterCidrAllocationResponse
     */
    public ListTransitRouterCidrAllocationResponse listTransitRouterCidrAllocation(ListTransitRouterCidrAllocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterCidrAllocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query ECR connection information:</p>
     * <ul>
     * <li>Specify the ID of an Enterprise Edition transit router.</li>
     * <li>Specify the ID of an Enterprise Edition transit router and the ID of the region in which the Enterprise Edition transit router is deployed.</li>
     * <li>Configure the <strong>TransitRouterAttachmentId</strong> parameter to specify the ECR connection that you want to query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Express Connect Router (ECR) connections on an Enterprise Edition transit router, such as the connection status, connection ID, and the payer of instance fees.</p>
     * 
     * @param request ListTransitRouterEcrAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterEcrAttachmentsResponse
     */
    public ListTransitRouterEcrAttachmentsResponse listTransitRouterEcrAttachmentsWithOptions(ListTransitRouterEcrAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterEcrAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterEcrAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterEcrAttachmentsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query ECR connection information:</p>
     * <ul>
     * <li>Specify the ID of an Enterprise Edition transit router.</li>
     * <li>Specify the ID of an Enterprise Edition transit router and the ID of the region in which the Enterprise Edition transit router is deployed.</li>
     * <li>Configure the <strong>TransitRouterAttachmentId</strong> parameter to specify the ECR connection that you want to query.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about Express Connect Router (ECR) connections on an Enterprise Edition transit router, such as the connection status, connection ID, and the payer of instance fees.</p>
     * 
     * @param request ListTransitRouterEcrAttachmentsRequest
     * @return ListTransitRouterEcrAttachmentsResponse
     */
    public ListTransitRouterEcrAttachmentsResponse listTransitRouterEcrAttachments(ListTransitRouterEcrAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterEcrAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You must set at least <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. If you set <strong>TransitRouterAttachmentId</strong>, the information about the vSwitches in a virtual private cloud (VPC) that are associated with a multicast domain is returned. If you set <strong>TransitRouterMulticastDomainId</strong>, the information about the vSwitches that are associated with a multicast domain is returned.</p>
     * <ul>
     * <li>Before you call <strong>ListTransitRouterMulticastDomainAssociations</strong>, make sure that all the request parameters are valid. If a request parameter is invalid, the system returns a <strong>request ID</strong> but does not return the vSwitches that are associated with the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a multicast domain is associated with a vSwitch.</p>
     * 
     * @param request ListTransitRouterMulticastDomainAssociationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterMulticastDomainAssociationsResponse
     */
    public ListTransitRouterMulticastDomainAssociationsResponse listTransitRouterMulticastDomainAssociationsWithOptions(ListTransitRouterMulticastDomainAssociationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterMulticastDomainAssociations"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainAssociationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterMulticastDomainAssociationsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You must set at least <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. If you set <strong>TransitRouterAttachmentId</strong>, the information about the vSwitches in a virtual private cloud (VPC) that are associated with a multicast domain is returned. If you set <strong>TransitRouterMulticastDomainId</strong>, the information about the vSwitches that are associated with a multicast domain is returned.</p>
     * <ul>
     * <li>Before you call <strong>ListTransitRouterMulticastDomainAssociations</strong>, make sure that all the request parameters are valid. If a request parameter is invalid, the system returns a <strong>request ID</strong> but does not return the vSwitches that are associated with the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a multicast domain is associated with a vSwitch.</p>
     * 
     * @param request ListTransitRouterMulticastDomainAssociationsRequest
     * @return ListTransitRouterMulticastDomainAssociationsResponse
     */
    public ListTransitRouterMulticastDomainAssociationsResponse listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastDomainAssociationsWithOptions(request, runtime);
    }

    /**
     * @param request ListTransitRouterMulticastDomainVSwitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterMulticastDomainVSwitchesResponse
     */
    public ListTransitRouterMulticastDomainVSwitchesResponse listTransitRouterMulticastDomainVSwitchesWithOptions(ListTransitRouterMulticastDomainVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterMulticastDomainVSwitches"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainVSwitchesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterMulticastDomainVSwitchesResponse());
        }

    }

    /**
     * @param request ListTransitRouterMulticastDomainVSwitchesRequest
     * @return ListTransitRouterMulticastDomainVSwitchesResponse
     */
    public ListTransitRouterMulticastDomainVSwitchesResponse listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastDomainVSwitchesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you configure one of the RegionId and CenId parameters, you must configure the other parameter. Otherwise, no information about the multicast domain is returned. You can configure only one of the TransitRouterId and TransitRouterMulticastDomainId parameters.</p>
     * <ul>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the information about the multicast domain is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a multicast domain, such as the status, ID, and description.</p>
     * 
     * @param request ListTransitRouterMulticastDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterMulticastDomainsResponse
     */
    public ListTransitRouterMulticastDomainsResponse listTransitRouterMulticastDomainsWithOptions(ListTransitRouterMulticastDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterMulticastDomains"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterMulticastDomainsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  If you configure one of the RegionId and CenId parameters, you must configure the other parameter. Otherwise, no information about the multicast domain is returned. You can configure only one of the TransitRouterId and TransitRouterMulticastDomainId parameters.</p>
     * <ul>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the information about the multicast domain is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a multicast domain, such as the status, ID, and description.</p>
     * 
     * @param request ListTransitRouterMulticastDomainsRequest
     * @return ListTransitRouterMulticastDomainsResponse
     */
    public ListTransitRouterMulticastDomainsResponse listTransitRouterMulticastDomains(ListTransitRouterMulticastDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the multicast sources and members in a multicast domain. Multicast sources and members are also known as multicast resources.</p>
     * <ul>
     * <li>If you set <strong>GroupIpAddress</strong>, the system queries multicast resources in the multicast domain by multicast group.</li>
     * <li>If you set <strong>VSwitchIds</strong>, the system queries multicast resources in the multicast domain by vSwitch.</li>
     * <li>If you set <strong>PeerTransitRouterMulticastDomains</strong>, the system queries multicast resources that are also deployed in a different region.</li>
     * <li>If you set <strong>ResourceType</strong>, the system queries the multicast resources of the specified type in the multicast domain.</li>
     * <li>If you set <strong>ResourceId</strong>, the system queries multicast resources by resource.</li>
     * <li>If you set only <strong>TransitRouterMulticastDomainId</strong>, the system queries all the multicast resources in the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about the multicast members and sources in a multicast domain.</p>
     * 
     * @param request ListTransitRouterMulticastGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterMulticastGroupsResponse
     */
    public ListTransitRouterMulticastGroupsResponse listTransitRouterMulticastGroupsWithOptions(ListTransitRouterMulticastGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIpAddress)) {
            query.put("GroupIpAddress", request.groupIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGroupMember)) {
            query.put("IsGroupMember", request.isGroupMember);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGroupSource)) {
            query.put("IsGroupSource", request.isGroupSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIds)) {
            query.put("NetworkInterfaceIds", request.networkInterfaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerTransitRouterMulticastDomains)) {
            query.put("PeerTransitRouterMulticastDomains", request.peerTransitRouterMulticastDomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterMulticastGroups"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterMulticastGroupsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the multicast sources and members in a multicast domain. Multicast sources and members are also known as multicast resources.</p>
     * <ul>
     * <li>If you set <strong>GroupIpAddress</strong>, the system queries multicast resources in the multicast domain by multicast group.</li>
     * <li>If you set <strong>VSwitchIds</strong>, the system queries multicast resources in the multicast domain by vSwitch.</li>
     * <li>If you set <strong>PeerTransitRouterMulticastDomains</strong>, the system queries multicast resources that are also deployed in a different region.</li>
     * <li>If you set <strong>ResourceType</strong>, the system queries the multicast resources of the specified type in the multicast domain.</li>
     * <li>If you set <strong>ResourceId</strong>, the system queries multicast resources by resource.</li>
     * <li>If you set only <strong>TransitRouterMulticastDomainId</strong>, the system queries all the multicast resources in the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed information about the multicast members and sources in a multicast domain.</p>
     * 
     * @param request ListTransitRouterMulticastGroupsRequest
     * @return ListTransitRouterMulticastGroupsResponse
     */
    public ListTransitRouterMulticastGroupsResponse listTransitRouterMulticastGroups(ListTransitRouterMulticastGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query inter-region connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Enterprise Edition transit router.</li>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Cloud Enterprise Network (CEN) instance and the ID of the region where the transit router is deployed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries inter-region connections on an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterPeerAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterPeerAttachmentsResponse
     */
    public ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachmentsWithOptions(ListTransitRouterPeerAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterPeerAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterPeerAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterPeerAttachmentsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query inter-region connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Enterprise Edition transit router.</li>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Cloud Enterprise Network (CEN) instance and the ID of the region where the transit router is deployed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries inter-region connections on an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterPeerAttachmentsRequest
     * @return ListTransitRouterPeerAttachmentsResponse
     */
    public ListTransitRouterPeerAttachmentsResponse listTransitRouterPeerAttachments(ListTransitRouterPeerAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterPeerAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the prefix lists that are associated with an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterPrefixListAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterPrefixListAssociationResponse
     */
    public ListTransitRouterPrefixListAssociationResponse listTransitRouterPrefixListAssociationWithOptions(ListTransitRouterPrefixListAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextHop)) {
            query.put("NextHop", request.nextHop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopInstanceId)) {
            query.put("NextHopInstanceId", request.nextHopInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            query.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("OwnerUid", request.ownerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixListId)) {
            query.put("PrefixListId", request.prefixListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterTableId)) {
            query.put("TransitRouterTableId", request.transitRouterTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterPrefixListAssociation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterPrefixListAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterPrefixListAssociationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the prefix lists that are associated with an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterPrefixListAssociationRequest
     * @return ListTransitRouterPrefixListAssociationResponse
     */
    public ListTransitRouterPrefixListAssociationResponse listTransitRouterPrefixListAssociation(ListTransitRouterPrefixListAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterPrefixListAssociationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about routes in the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterRouteEntriesResponse
     */
    public ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntriesWithOptions(ListTransitRouterRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefixListId)) {
            query.put("PrefixListId", request.prefixListId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeFilter)) {
            query.put("RouteFilter", request.routeFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryDestinationCidrBlock)) {
            query.put("TransitRouterRouteEntryDestinationCidrBlock", request.transitRouterRouteEntryDestinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryIds)) {
            query.put("TransitRouterRouteEntryIds", request.transitRouterRouteEntryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNames)) {
            query.put("TransitRouterRouteEntryNames", request.transitRouterRouteEntryNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopId)) {
            query.put("TransitRouterRouteEntryNextHopId", request.transitRouterRouteEntryNextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopResourceId)) {
            query.put("TransitRouterRouteEntryNextHopResourceId", request.transitRouterRouteEntryNextHopResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopResourceType)) {
            query.put("TransitRouterRouteEntryNextHopResourceType", request.transitRouterRouteEntryNextHopResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryNextHopType)) {
            query.put("TransitRouterRouteEntryNextHopType", request.transitRouterRouteEntryNextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryOriginResourceId)) {
            query.put("TransitRouterRouteEntryOriginResourceId", request.transitRouterRouteEntryOriginResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryOriginResourceType)) {
            query.put("TransitRouterRouteEntryOriginResourceType", request.transitRouterRouteEntryOriginResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryStatus)) {
            query.put("TransitRouterRouteEntryStatus", request.transitRouterRouteEntryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryType)) {
            query.put("TransitRouterRouteEntryType", request.transitRouterRouteEntryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about routes in the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteEntriesRequest
     * @return ListTransitRouterRouteEntriesResponse
     */
    public ListTransitRouterRouteEntriesResponse listTransitRouterRouteEntries(ListTransitRouterRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>ListTransitRouterRouteTableAssociations</strong>, you must set at least one of <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>.</p>
     * <ul>
     * <li>If you set only <strong>TransitRouterRouteTableId</strong>, the network instance connections that are in associated forwarding correlation with a route table of an Enterprise Edition transit router are queried.</li>
     * <li>If you set only <strong>TransitRouterAttachmentId</strong>, the route table of an Enterprise Edition transit router that is in associated forwarding correlation with a network instance connection is queried.</li>
     * <li>If you set both <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>, the associated forwarding correlations between a specified network instance connection and a specified route table of an Enterprise Edition transit router are queried.<ul>
     * <li>If an associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, the information about the associated forwarding correlation is returned.</li>
     * <li>If no associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, <strong>TransitRouterAssociations</strong> in the response is empty.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the associated forwarding correlations that are created for a route table of an Enterprise Edition transit router or a network instance connection.</p>
     * 
     * @param request ListTransitRouterRouteTableAssociationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterRouteTableAssociationsResponse
     */
    public ListTransitRouterRouteTableAssociationsResponse listTransitRouterRouteTableAssociationsWithOptions(ListTransitRouterRouteTableAssociationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentResourceId)) {
            query.put("TransitRouterAttachmentResourceId", request.transitRouterAttachmentResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentResourceType)) {
            query.put("TransitRouterAttachmentResourceType", request.transitRouterAttachmentResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTableAssociations"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTableAssociationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterRouteTableAssociationsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>ListTransitRouterRouteTableAssociations</strong>, you must set at least one of <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>.</p>
     * <ul>
     * <li>If you set only <strong>TransitRouterRouteTableId</strong>, the network instance connections that are in associated forwarding correlation with a route table of an Enterprise Edition transit router are queried.</li>
     * <li>If you set only <strong>TransitRouterAttachmentId</strong>, the route table of an Enterprise Edition transit router that is in associated forwarding correlation with a network instance connection is queried.</li>
     * <li>If you set both <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>, the associated forwarding correlations between a specified network instance connection and a specified route table of an Enterprise Edition transit router are queried.<ul>
     * <li>If an associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, the information about the associated forwarding correlation is returned.</li>
     * <li>If no associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, <strong>TransitRouterAssociations</strong> in the response is empty.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the associated forwarding correlations that are created for a route table of an Enterprise Edition transit router or a network instance connection.</p>
     * 
     * @param request ListTransitRouterRouteTableAssociationsRequest
     * @return ListTransitRouterRouteTableAssociationsResponse
     */
    public ListTransitRouterRouteTableAssociationsResponse listTransitRouterRouteTableAssociations(ListTransitRouterRouteTableAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterRouteTableAssociationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route learning correlations of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteTablePropagationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterRouteTablePropagationsResponse
     */
    public ListTransitRouterRouteTablePropagationsResponse listTransitRouterRouteTablePropagationsWithOptions(ListTransitRouterRouteTablePropagationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentResourceId)) {
            query.put("TransitRouterAttachmentResourceId", request.transitRouterAttachmentResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentResourceType)) {
            query.put("TransitRouterAttachmentResourceType", request.transitRouterAttachmentResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTablePropagations"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablePropagationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterRouteTablePropagationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route learning correlations of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteTablePropagationsRequest
     * @return ListTransitRouterRouteTablePropagationsResponse
     */
    public ListTransitRouterRouteTablePropagationsResponse listTransitRouterRouteTablePropagations(ListTransitRouterRouteTablePropagationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterRouteTablePropagationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterRouteTablesResponse
     */
    public ListTransitRouterRouteTablesResponse listTransitRouterRouteTablesWithOptions(ListTransitRouterRouteTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableOptions)) {
            query.put("RouteTableOptions", request.routeTableOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableIds)) {
            query.put("TransitRouterRouteTableIds", request.transitRouterRouteTableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableNames)) {
            query.put("TransitRouterRouteTableNames", request.transitRouterRouteTableNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableStatus)) {
            query.put("TransitRouterRouteTableStatus", request.transitRouterRouteTableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableType)) {
            query.put("TransitRouterRouteTableType", request.transitRouterRouteTableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterRouteTables"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterRouteTablesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route tables of an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterRouteTablesRequest
     * @return ListTransitRouterRouteTablesResponse
     */
    public ListTransitRouterRouteTablesResponse listTransitRouterRouteTables(ListTransitRouterRouteTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterRouteTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query VBR connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual border router (VBR) connections on an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterVbrAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterVbrAttachmentsResponse
     */
    public ListTransitRouterVbrAttachmentsResponse listTransitRouterVbrAttachmentsWithOptions(ListTransitRouterVbrAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterVbrAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVbrAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterVbrAttachmentsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query VBR connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual border router (VBR) connections on an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterVbrAttachmentsRequest
     * @return ListTransitRouterVbrAttachmentsResponse
     */
    public ListTransitRouterVbrAttachmentsResponse listTransitRouterVbrAttachments(ListTransitRouterVbrAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterVbrAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query VPC connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the region where the Enterprise Edition transit router is deployed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, billing method, zones, vSwitches, and elastic network interfaces (ENIs) of virtual private cloud (VPC) connections.</p>
     * 
     * @param request ListTransitRouterVpcAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterVpcAttachmentsResponse
     */
    public ListTransitRouterVpcAttachmentsResponse listTransitRouterVpcAttachmentsWithOptions(ListTransitRouterVpcAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterVpcAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVpcAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterVpcAttachmentsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to query VPC connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the region where the Enterprise Edition transit router is deployed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, billing method, zones, vSwitches, and elastic network interfaces (ENIs) of virtual private cloud (VPC) connections.</p>
     * 
     * @param request ListTransitRouterVpcAttachmentsRequest
     * @return ListTransitRouterVpcAttachmentsResponse
     */
    public ListTransitRouterVpcAttachmentsResponse listTransitRouterVpcAttachments(ListTransitRouterVpcAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterVpcAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to call the ListTransitRouterVpnAttachments operation:</p>
     * <ul>
     * <li>Specify only the <strong>TransitRouterAttachmentId</strong> parameter to query the information about a VPN attachment.</li>
     * <li>Specify only the <strong>TransitRouterId</strong> parameter to query the information about all VPN attachments on a transit router.</li>
     * <li>Specify the <strong>CenId</strong> and <strong>RegionId</strong> parameter to query the information about VPN attachments in a specified region.
     * Before you call the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the information about the VPN attachments is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about VPN attachments, such as the status and billing method of a VPN attachment, and the ID of an IPsec-VPN connection.</p>
     * 
     * @param request ListTransitRouterVpnAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRouterVpnAttachmentsResponse
     */
    public ListTransitRouterVpnAttachmentsResponse listTransitRouterVpnAttachmentsWithOptions(ListTransitRouterVpnAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouterVpnAttachments"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVpnAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRouterVpnAttachmentsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can use the following methods to call the ListTransitRouterVpnAttachments operation:</p>
     * <ul>
     * <li>Specify only the <strong>TransitRouterAttachmentId</strong> parameter to query the information about a VPN attachment.</li>
     * <li>Specify only the <strong>TransitRouterId</strong> parameter to query the information about all VPN attachments on a transit router.</li>
     * <li>Specify the <strong>CenId</strong> and <strong>RegionId</strong> parameter to query the information about VPN attachments in a specified region.
     * Before you call the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the information about the VPN attachments is not returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about VPN attachments, such as the status and billing method of a VPN attachment, and the ID of an IPsec-VPN connection.</p>
     * 
     * @param request ListTransitRouterVpnAttachmentsRequest
     * @return ListTransitRouterVpnAttachmentsResponse
     */
    public ListTransitRouterVpnAttachmentsResponse listTransitRouterVpnAttachments(ListTransitRouterVpnAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterVpnAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can set the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters based on your requirements.</p>
     * <ul>
     * <li>If you do not set <strong>RegionId</strong> or <strong>TransitRouterId</strong>, the system queries all transit routers that are connected to the specified CEN instance.</li>
     * <li>If you set only <strong>RegionId</strong>, the system queries transit routers that are deployed in the specified region.</li>
     * <li>If you set only <strong>TransitRouterId</strong>, the system queries the specified transit router.</li>
     * <li>If you set both <strong>RegionId</strong> and <strong>TransitRouterId</strong>, the system queries the specified transit router in the specified region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about transit routers that are connected to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ListTransitRoutersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTransitRoutersResponse
     */
    public ListTransitRoutersResponse listTransitRoutersWithOptions(ListTransitRoutersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureFilter)) {
            query.put("FeatureFilter", request.featureFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterName)) {
            query.put("TransitRouterName", request.transitRouterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransitRouters"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRoutersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListTransitRoutersResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can set the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters based on your requirements.</p>
     * <ul>
     * <li>If you do not set <strong>RegionId</strong> or <strong>TransitRouterId</strong>, the system queries all transit routers that are connected to the specified CEN instance.</li>
     * <li>If you set only <strong>RegionId</strong>, the system queries transit routers that are deployed in the specified region.</li>
     * <li>If you set only <strong>TransitRouterId</strong>, the system queries the specified transit router.</li>
     * <li>If you set both <strong>RegionId</strong> and <strong>TransitRouterId</strong>, the system queries the specified transit router in the specified region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about transit routers that are connected to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ListTransitRoutersRequest
     * @return ListTransitRoutersResponse
     */
    public ListTransitRoutersResponse listTransitRouters(ListTransitRoutersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRoutersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns the <strong>request ID</strong> but the operation is still being performed in the system background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyCenAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCenAttributeResponse
     */
    public ModifyCenAttributeResponse modifyCenAttributeWithOptions(ModifyCenAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectionLevel)) {
            query.put("ProtectionLevel", request.protectionLevel);
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
            new TeaPair("action", "ModifyCenAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyCenAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns the <strong>request ID</strong> but the operation is still being performed in the system background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyCenAttributeRequest
     * @return ModifyCenAttributeResponse
     */
    public ModifyCenAttributeResponse modifyCenAttribute(ModifyCenAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCenAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a bandwidth plan.</p>
     * 
     * @param request ModifyCenBandwidthPackageAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCenBandwidthPackageAttributeResponse
     */
    public ModifyCenBandwidthPackageAttributeResponse modifyCenBandwidthPackageAttributeWithOptions(ModifyCenBandwidthPackageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "ModifyCenBandwidthPackageAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyCenBandwidthPackageAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a bandwidth plan.</p>
     * 
     * @param request ModifyCenBandwidthPackageAttributeRequest
     * @return ModifyCenBandwidthPackageAttributeResponse
     */
    public ModifyCenBandwidthPackageAttributeResponse modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCenBandwidthPackageAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth of a bandwidth plan.</p>
     * 
     * @param request ModifyCenBandwidthPackageSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCenBandwidthPackageSpecResponse
     */
    public ModifyCenBandwidthPackageSpecResponse modifyCenBandwidthPackageSpecWithOptions(ModifyCenBandwidthPackageSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "ModifyCenBandwidthPackageSpec"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageSpecResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyCenBandwidthPackageSpecResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the maximum bandwidth of a bandwidth plan.</p>
     * 
     * @param request ModifyCenBandwidthPackageSpecRequest
     * @return ModifyCenBandwidthPackageSpecResponse
     */
    public ModifyCenBandwidthPackageSpecResponse modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCenBandwidthPackageSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>ModifyCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li><strong>Modifying</strong>: indicates that the system is modifying the routing policy. You can only query the routing policy, but cannot perform other operations.</li>
     * <li><strong>Active</strong>: indicates that the routing policy is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a routing policy of a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyCenRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCenRouteMapResponse
     */
    public ModifyCenRouteMapResponse modifyCenRouteMapWithOptions(ModifyCenRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asPathMatchMode)) {
            query.put("AsPathMatchMode", request.asPathMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenRegionId)) {
            query.put("CenRegionId", request.cenRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrMatchMode)) {
            query.put("CidrMatchMode", request.cidrMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communityMatchMode)) {
            query.put("CommunityMatchMode", request.communityMatchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.communityOperateMode)) {
            query.put("CommunityOperateMode", request.communityOperateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationChildInstanceTypes)) {
            query.put("DestinationChildInstanceTypes", request.destinationChildInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlocks)) {
            query.put("DestinationCidrBlocks", request.destinationCidrBlocks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationInstanceIds)) {
            query.put("DestinationInstanceIds", request.destinationInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationInstanceIdsReverseMatch)) {
            query.put("DestinationInstanceIdsReverseMatch", request.destinationInstanceIdsReverseMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionIds)) {
            query.put("DestinationRegionIds", request.destinationRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRouteTableIds)) {
            query.put("DestinationRouteTableIds", request.destinationRouteTableIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapResult)) {
            query.put("MapResult", request.mapResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchAddressType)) {
            query.put("MatchAddressType", request.matchAddressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchAsns)) {
            query.put("MatchAsns", request.matchAsns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchCommunitySet)) {
            query.put("MatchCommunitySet", request.matchCommunitySet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPriority)) {
            query.put("NextPriority", request.nextPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateCommunitySet)) {
            query.put("OperateCommunitySet", request.operateCommunitySet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preference)) {
            query.put("Preference", request.preference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prependAsPath)) {
            query.put("PrependAsPath", request.prependAsPath);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapId)) {
            query.put("RouteMapId", request.routeMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeTypes)) {
            query.put("RouteTypes", request.routeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceChildInstanceTypes)) {
            query.put("SourceChildInstanceTypes", request.sourceChildInstanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceIds)) {
            query.put("SourceInstanceIds", request.sourceInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceIdsReverseMatch)) {
            query.put("SourceInstanceIdsReverseMatch", request.sourceInstanceIdsReverseMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionIds)) {
            query.put("SourceRegionIds", request.sourceRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRouteTableIds)) {
            query.put("SourceRouteTableIds", request.sourceRouteTableIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCenRouteMap"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyCenRouteMapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>ModifyCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li><strong>Modifying</strong>: indicates that the system is modifying the routing policy. You can only query the routing policy, but cannot perform other operations.</li>
     * <li><strong>Active</strong>: indicates that the routing policy is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a routing policy of a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyCenRouteMapRequest
     * @return ModifyCenRouteMapResponse
     */
    public ModifyCenRouteMapResponse modifyCenRouteMap(ModifyCenRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCenRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>ModifyFlowLogAttribute</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and capture window of a flow log.</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttributeWithOptions(ModifyFlowLogAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogId)) {
            query.put("FlowLogId", request.flowLogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowLogName)) {
            query.put("FlowLogName", request.flowLogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "ModifyFlowLogAttribute"),
            new TeaPair("version", "2017-09-12"),
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
     * <b>description</b> :
     * <p><code>ModifyFlowLogAttribute</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and capture window of a flow log.</p>
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
     * <p>Modifies the name and description of a traffic classification rule.</p>
     * 
     * @param request ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse modifyTrafficMatchRuleToTrafficMarkingPolicyWithOptions(ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRuleDescription)) {
            query.put("TrafficMatchRuleDescription", request.trafficMatchRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRuleId)) {
            query.put("TrafficMatchRuleId", request.trafficMatchRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMatchRuleName)) {
            query.put("TrafficMatchRuleName", request.trafficMatchRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrafficMatchRuleToTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a traffic classification rule.</p>
     * 
     * @param request ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    public ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse modifyTrafficMatchRuleToTrafficMarkingPolicy(ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrafficMatchRuleToTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑聚合路由</p>
     * 
     * @param tmpReq ModifyTransitRouteTableAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTransitRouteTableAggregationResponse
     */
    public ModifyTransitRouteTableAggregationResponse modifyTransitRouteTableAggregationWithOptions(ModifyTransitRouteTableAggregationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTransitRouteTableAggregationShrinkRequest request = new ModifyTransitRouteTableAggregationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transitRouteTableAggregationScopeList)) {
            request.transitRouteTableAggregationScopeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transitRouteTableAggregationScopeList, "TransitRouteTableAggregationScopeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationDescription)) {
            query.put("TransitRouteTableAggregationDescription", request.transitRouteTableAggregationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationName)) {
            query.put("TransitRouteTableAggregationName", request.transitRouteTableAggregationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationScope)) {
            query.put("TransitRouteTableAggregationScope", request.transitRouteTableAggregationScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationScopeListShrink)) {
            query.put("TransitRouteTableAggregationScopeList", request.transitRouteTableAggregationScopeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTransitRouteTableAggregation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouteTableAggregationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyTransitRouteTableAggregationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>编辑聚合路由</p>
     * 
     * @param request ModifyTransitRouteTableAggregationRequest
     * @return ModifyTransitRouteTableAggregationResponse
     */
    public ModifyTransitRouteTableAggregationResponse modifyTransitRouteTableAggregation(ModifyTransitRouteTableAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTransitRouteTableAggregationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you modify the CIDR block of a transit router, we recommend that you read the <a href="https://help.aliyun.com/document_detail/462635.html">limits on transit router CIDR blocks</a>.</p>
     * <ul>
     * <li>If IP addresses within the CIDR block have been allocated to network instances, you cannot modify the CIDR block.</li>
     * <li>When you call <strong>ModifyTransitRouterCidr</strong>, if no parameter of the <strong>PublishCidrRoute</strong> operation is modified, ModifyTransitRouterCidr is a synchronous operation. After you call the operation, the new settings are immediately applied.</li>
     * <li>If a parameter of the <strong>PublishCidrRoute</strong> operation is modified, <strong>ModifyTransitRouterCidr</strong> is an asynchronous operation. After you call the operation, the request ID (<strong>RequestId</strong>) is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterCidr</strong> to query the status of the CIDR block of the transit router.<ul>
     * <li>If the CIDR block of the transit router remains unchanged, the CIDR block is still being modified.</li>
     * <li>If the CIDR block of the transit router is changed to the one that you specify in the request, the CIDR block has been modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the CIDR block of a transit router.</p>
     * 
     * @param request ModifyTransitRouterCidrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTransitRouterCidrResponse
     */
    public ModifyTransitRouterCidrResponse modifyTransitRouterCidrWithOptions(ModifyTransitRouterCidrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            query.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishCidrRoute)) {
            query.put("PublishCidrRoute", request.publishCidrRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterCidrId)) {
            query.put("TransitRouterCidrId", request.transitRouterCidrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTransitRouterCidr"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouterCidrResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyTransitRouterCidrResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  Before you modify the CIDR block of a transit router, we recommend that you read the <a href="https://help.aliyun.com/document_detail/462635.html">limits on transit router CIDR blocks</a>.</p>
     * <ul>
     * <li>If IP addresses within the CIDR block have been allocated to network instances, you cannot modify the CIDR block.</li>
     * <li>When you call <strong>ModifyTransitRouterCidr</strong>, if no parameter of the <strong>PublishCidrRoute</strong> operation is modified, ModifyTransitRouterCidr is a synchronous operation. After you call the operation, the new settings are immediately applied.</li>
     * <li>If a parameter of the <strong>PublishCidrRoute</strong> operation is modified, <strong>ModifyTransitRouterCidr</strong> is an asynchronous operation. After you call the operation, the request ID (<strong>RequestId</strong>) is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterCidr</strong> to query the status of the CIDR block of the transit router.<ul>
     * <li>If the CIDR block of the transit router remains unchanged, the CIDR block is still being modified.</li>
     * <li>If the CIDR block of the transit router is changed to the one that you specify in the request, the CIDR block has been modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the CIDR block of a transit router.</p>
     * 
     * @param request ModifyTransitRouterCidrRequest
     * @return ModifyTransitRouterCidrResponse
     */
    public ModifyTransitRouterCidrResponse modifyTransitRouterCidr(ModifyTransitRouterCidrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTransitRouterCidrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the ModifyTransitRouterMulticastDomain operation to modify the name, description, and feature options of a multicast domain.</p>
     * 
     * @param request ModifyTransitRouterMulticastDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTransitRouterMulticastDomainResponse
     */
    public ModifyTransitRouterMulticastDomainResponse modifyTransitRouterMulticastDomainWithOptions(ModifyTransitRouterMulticastDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainDescription)) {
            query.put("TransitRouterMulticastDomainDescription", request.transitRouterMulticastDomainDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainName)) {
            query.put("TransitRouterMulticastDomainName", request.transitRouterMulticastDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTransitRouterMulticastDomain"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouterMulticastDomainResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyTransitRouterMulticastDomainResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call the ModifyTransitRouterMulticastDomain operation to modify the name, description, and feature options of a multicast domain.</p>
     * 
     * @param request ModifyTransitRouterMulticastDomainRequest
     * @return ModifyTransitRouterMulticastDomainResponse
     */
    public ModifyTransitRouterMulticastDomainResponse modifyTransitRouterMulticastDomain(ModifyTransitRouterMulticastDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTransitRouterMulticastDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, CEN instances and bandwidth plans are in the default resource group. You can call the <code>MoveResourceGroup</code> operation to move CEN instances or bandwidth plans to another resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a Cloud Enterprise Network (CEN) instance or a bandwidth plan to another resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2017-09-12"),
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
     * <b>description</b> :
     * <p>By default, CEN instances and bandwidth plans are in the default resource group. You can call the <code>MoveResourceGroup</code> operation to move CEN instances or bandwidth plans to another resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a Cloud Enterprise Network (CEN) instance or a bandwidth plan to another resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router feature free of charge. After the <code>OpenTransitRouterService</code> operation succeeds, an order is automatically generated. You can use the returned order ID to query the order information in <a href="https://usercenter2-intl.aliyun.com/billing/#/account/overview">Alibaba Cloud User Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates the transit router feature.</p>
     * 
     * @param request OpenTransitRouterServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenTransitRouterServiceResponse
     */
    public OpenTransitRouterServiceResponse openTransitRouterServiceWithOptions(OpenTransitRouterServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "OpenTransitRouterService"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OpenTransitRouterServiceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OpenTransitRouterServiceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router feature free of charge. After the <code>OpenTransitRouterService</code> operation succeeds, an order is automatically generated. You can use the returned order ID to query the order information in <a href="https://usercenter2-intl.aliyun.com/billing/#/account/overview">Alibaba Cloud User Center</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates the transit router feature.</p>
     * 
     * @param request OpenTransitRouterServiceRequest
     * @return OpenTransitRouterServiceResponse
     */
    public OpenTransitRouterServiceResponse openTransitRouterService(OpenTransitRouterServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openTransitRouterServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following table describes whether routes of different types are advertised to CEN by default. You can call the PublishRouteEntries operation to advertise routes to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route</th>
     * <th>Network instance</th>
     * <th>Advertised to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Routes that route network traffic to Elastic Compute Service (ECS) instances</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to VPN gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to high-availability virtual IP addresses (HAVIPs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to router interfaces</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to IPv6 gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to NAT gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>System routes of VPCs</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to data centers</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Border Gateway Protocol (BGP) routes</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) supports route advertisement. You can call this operation to advertise routes of virtual private clouds (VPCs) or virtual border routers (VBRs) attached to a CEN instance to the CEN instance. Other network instances attached to the CEN instance can learn the routes if route conflicts do not exist.</p>
     * 
     * @param request PublishRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishRouteEntriesResponse
     */
    public PublishRouteEntriesResponse publishRouteEntriesWithOptions(PublishRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
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
            new TeaPair("action", "PublishRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PublishRouteEntriesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>The following table describes whether routes of different types are advertised to CEN by default. You can call the PublishRouteEntries operation to advertise routes to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route</th>
     * <th>Network instance</th>
     * <th>Advertised to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Routes that route network traffic to Elastic Compute Service (ECS) instances</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to VPN gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to high-availability virtual IP addresses (HAVIPs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to router interfaces</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to IPv6 gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to NAT gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>System routes of VPCs</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to data centers</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Border Gateway Protocol (BGP) routes</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) supports route advertisement. You can call this operation to advertise routes of virtual private clouds (VPCs) or virtual border routers (VBRs) attached to a CEN instance to the CEN instance. Other network instances attached to the CEN instance can learn the routes if route conflicts do not exist.</p>
     * 
     * @param request PublishRouteEntriesRequest
     * @return PublishRouteEntriesResponse
     */
    public PublishRouteEntriesResponse publishRouteEntries(PublishRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Re-advertises an aggregate route.</p>
     * 
     * @param request RefreshTransitRouteTableAggregationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshTransitRouteTableAggregationResponse
     */
    public RefreshTransitRouteTableAggregationResponse refreshTransitRouteTableAggregationWithOptions(RefreshTransitRouteTableAggregationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableAggregationCidr)) {
            query.put("TransitRouteTableAggregationCidr", request.transitRouteTableAggregationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouteTableId)) {
            query.put("TransitRouteTableId", request.transitRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshTransitRouteTableAggregation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshTransitRouteTableAggregationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefreshTransitRouteTableAggregationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Re-advertises an aggregate route.</p>
     * 
     * @param request RefreshTransitRouteTableAggregationRequest
     * @return RefreshTransitRouteTableAggregationResponse
     */
    public RefreshTransitRouteTableAggregationResponse refreshTransitRouteTableAggregation(RefreshTransitRouteTableAggregationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshTransitRouteTableAggregationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify an ENI in the current region or a different region as a multicast member.</p>
     * <ul>
     * <li>If you specify a value for the <strong>NetworkInterfaceIds</strong> parameter, an ENI in the current region is to be specified as a multicast member. Make sure that the ENI and vSwitch are associated with the multicast group. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify a value for the <strong>PeerTransitRouterMulticastDomains</strong>, a multicast member in a multicast group that belongs to another region but has the same IP address as the current multicast group is to be specified as a multicast member for the current multicast group. Make sure that an inter-region connection is established between the regions. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you created Multicast Group 1 in Multicast Domain 1, which is in the China (Hangzhou) region. You created Multicast Group 2 in Multicast Domain 2, which is in the China (Shanghai) region. Multicast Group 1 and Multicast Group 2 use the same multicast IP address, and Multicast Member 2 is in Multicast Group 2 in the China (Shanghai) region. If you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to add multicast members to Multicast Group 1 in the China (Hangzhou) region and set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Group 2, which is in the China (Shanghai) region, Multicast Member 2, which is in Multicast Domain 2 in the China (Shanghai) region is added to Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li><code>RegisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong>, the multicast member is being created. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
     * <li>If the multicast member is in the <strong>Registered</strong> state, the multicast member is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or adds a multicast member.</p>
     * 
     * @param request RegisterTransitRouterMulticastGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterTransitRouterMulticastGroupMembersResponse
     */
    public RegisterTransitRouterMulticastGroupMembersResponse registerTransitRouterMulticastGroupMembersWithOptions(RegisterTransitRouterMulticastGroupMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIpAddress)) {
            query.put("GroupIpAddress", request.groupIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIds)) {
            query.put("NetworkInterfaceIds", request.networkInterfaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerTransitRouterMulticastDomains)) {
            query.put("PeerTransitRouterMulticastDomains", request.peerTransitRouterMulticastDomains);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterTransitRouterMulticastGroupMembers"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterTransitRouterMulticastGroupMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterTransitRouterMulticastGroupMembersResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify an ENI in the current region or a different region as a multicast member.</p>
     * <ul>
     * <li>If you specify a value for the <strong>NetworkInterfaceIds</strong> parameter, an ENI in the current region is to be specified as a multicast member. Make sure that the ENI and vSwitch are associated with the multicast group. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify a value for the <strong>PeerTransitRouterMulticastDomains</strong>, a multicast member in a multicast group that belongs to another region but has the same IP address as the current multicast group is to be specified as a multicast member for the current multicast group. Make sure that an inter-region connection is established between the regions. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you created Multicast Group 1 in Multicast Domain 1, which is in the China (Hangzhou) region. You created Multicast Group 2 in Multicast Domain 2, which is in the China (Shanghai) region. Multicast Group 1 and Multicast Group 2 use the same multicast IP address, and Multicast Member 2 is in Multicast Group 2 in the China (Shanghai) region. If you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to add multicast members to Multicast Group 1 in the China (Hangzhou) region and set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Group 2, which is in the China (Shanghai) region, Multicast Member 2, which is in Multicast Domain 2 in the China (Shanghai) region is added to Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li><code>RegisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong>, the multicast member is being created. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
     * <li>If the multicast member is in the <strong>Registered</strong> state, the multicast member is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or adds a multicast member.</p>
     * 
     * @param request RegisterTransitRouterMulticastGroupMembersRequest
     * @return RegisterTransitRouterMulticastGroupMembersResponse
     */
    public RegisterTransitRouterMulticastGroupMembersResponse registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerTransitRouterMulticastGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can specify only elastic network interfaces (ENIs) as multicast sources.</p>
     * <ul>
     * <li><code>RegisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.<ul>
     * <li>If a multicast source is in the <strong>Registering</strong> state, the multicast source is being created. You can query the multicast source but cannot perform other operations on the multicast source.</li>
     * <li>If a multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Prerequisite</h3>
     * <p>Before you call <code>RegisterTransitRouterMulticastGroupSources</code>, make sure that the vSwitch on which the ENI is created is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast source for a one-to-many multicast network.</p>
     * 
     * @param request RegisterTransitRouterMulticastGroupSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterTransitRouterMulticastGroupSourcesResponse
     */
    public RegisterTransitRouterMulticastGroupSourcesResponse registerTransitRouterMulticastGroupSourcesWithOptions(RegisterTransitRouterMulticastGroupSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIpAddress)) {
            query.put("GroupIpAddress", request.groupIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIds)) {
            query.put("NetworkInterfaceIds", request.networkInterfaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterMulticastDomainId)) {
            query.put("TransitRouterMulticastDomainId", request.transitRouterMulticastDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterTransitRouterMulticastGroupSources"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterTransitRouterMulticastGroupSourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RegisterTransitRouterMulticastGroupSourcesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can specify only elastic network interfaces (ENIs) as multicast sources.</p>
     * <ul>
     * <li><code>RegisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.<ul>
     * <li>If a multicast source is in the <strong>Registering</strong> state, the multicast source is being created. You can query the multicast source but cannot perform other operations on the multicast source.</li>
     * <li>If a multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Prerequisite</h3>
     * <p>Before you call <code>RegisterTransitRouterMulticastGroupSources</code>, make sure that the vSwitch on which the ENI is created is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast source for a one-to-many multicast network.</p>
     * 
     * @param request RegisterTransitRouterMulticastGroupSourcesRequest
     * @return RegisterTransitRouterMulticastGroupSourcesResponse
     */
    public RegisterTransitRouterMulticastGroupSourcesResponse registerTransitRouterMulticastGroupSources(RegisterTransitRouterMulticastGroupSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerTransitRouterMulticastGroupSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you call <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong>, take note of the following rules:
     *     *   If you specify the ID of a traffic classification rule in the <strong>TrafficMarkRuleIds</strong> parameter, the specified traffic classification rule is deleted.
     *     *   If you do not specify a traffic classification rule ID in the <strong>TrafficMarkRuleIds</strong> parameter, no operation is performed after you call this operation.
     *     If you want to delete a traffic classification rule, you must specify the rule ID before you call this operation.</p>
     * <ul>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.<ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the traffic classification rule is being deleted. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule cannot be found, the traffic classification rule is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified traffic classification rules from a traffic marking policy.</p>
     * 
     * @param request RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse
     */
    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse removeTrafficMatchRuleFromTrafficMarkingPolicyWithOptions(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkRuleIds)) {
            query.put("TrafficMarkRuleIds", request.trafficMarkRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTrafficMatchRuleFromTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  When you call <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong>, take note of the following rules:
     *     *   If you specify the ID of a traffic classification rule in the <strong>TrafficMarkRuleIds</strong> parameter, the specified traffic classification rule is deleted.
     *     *   If you do not specify a traffic classification rule ID in the <strong>TrafficMarkRuleIds</strong> parameter, no operation is performed after you call this operation.
     *     If you want to delete a traffic classification rule, you must specify the rule ID before you call this operation.</p>
     * <ul>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.<ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the traffic classification rule is being deleted. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule cannot be found, the traffic classification rule is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified traffic classification rules from a traffic marking policy.</p>
     * 
     * @param request RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest
     * @return RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse
     */
    public RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse removeTrafficMatchRuleFromTrafficMarkingPolicy(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTrafficMatchRuleFromTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The <strong>RemoveTraficMatchRuleFromTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued soon. To delete a traffic classification rule, call the <a href="https://help.aliyun.com/document_detail/452726.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a> operation. Maintenance on this document has stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a traffic classification rule from a traffic marking policy.</p>
     * 
     * @deprecated OpenAPI RemoveTraficMatchRuleFromTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::RemoveTrafficMatchRuleFromTrafficMarkingPolicy instead.
     * 
     * @param request RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse
     */
    @Deprecated
    // Deprecated
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse removeTraficMatchRuleFromTrafficMarkingPolicyWithOptions(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkRuleIds)) {
            query.put("TrafficMarkRuleIds", request.trafficMarkRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTraficMatchRuleFromTrafficMarkingPolicy"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The <strong>RemoveTraficMatchRuleFromTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued soon. To delete a traffic classification rule, call the <a href="https://help.aliyun.com/document_detail/452726.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a> operation. Maintenance on this document has stopped.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a traffic classification rule from a traffic marking policy.</p>
     * 
     * @deprecated OpenAPI RemoveTraficMatchRuleFromTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::RemoveTrafficMatchRuleFromTrafficMarkingPolicy instead.
     * 
     * @param request RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest
     * @return RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse
     */
    @Deprecated
    // Deprecated
    public RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTraficMatchRuleFromTrafficMarkingPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a network instance connection with another route table of a transit router.</p>
     * 
     * @param request ReplaceTransitRouterRouteTableAssociationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceTransitRouterRouteTableAssociationResponse
     */
    public ReplaceTransitRouterRouteTableAssociationResponse replaceTransitRouterRouteTableAssociationWithOptions(ReplaceTransitRouterRouteTableAssociationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceTransitRouterRouteTableAssociation"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceTransitRouterRouteTableAssociationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ReplaceTransitRouterRouteTableAssociationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Associates a network instance connection with another route table of a transit router.</p>
     * 
     * @param request ReplaceTransitRouterRouteTableAssociationRequest
     * @return ReplaceTransitRouterRouteTableAssociationResponse
     */
    public ReplaceTransitRouterRouteTableAssociationResponse replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceTransitRouterRouteTableAssociationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block to provide services. These cloud services include Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access a cloud service, you must attach the virtual border router (VBR) or Cloud Connect Network (CCN) instance that is connected to your on-premises network to a Cloud Enterprise Network (CEN) instance. In addition, you must attach a virtual private cloud (VPC) that is deployed in the same region as the cloud service to the CEN instance. This way, your on-premises network can connect to the VPC that is deployed in the same region as the cloud service and access the cloud service through the VPC.</p>
     * <ul>
     * <li>This operation is supported only by Basic Edition transit routers. An on-premises network associated with a VBR can use CEN to access only a cloud service that is deployed in the same region.
     * For example, if cloud services are deployed in the China (Beijing) region, only on-premises networks connected to VBRs in the China (Beijing) region can access the cloud services.</li>
     * <li><strong>ResolveAndRouteServiceInCen</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of a cloud service.<ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the connection to the cloud service is being created. In this case, you can query the cloud service but cannot perform other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the connection to the cloud service is created.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the connection to the cloud service failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance to which your on-premises network is connected is attached to a CEN instance.</li>
     * <li>A VPC that is deployed in the same region as the cloud service is attached to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Connects an on-premises network to a cloud service.</p>
     * 
     * @param request ResolveAndRouteServiceInCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResolveAndRouteServiceInCenResponse
     */
    public ResolveAndRouteServiceInCenResponse resolveAndRouteServiceInCenWithOptions(ResolveAndRouteServiceInCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionIds)) {
            query.put("AccessRegionIds", request.accessRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostRegionId)) {
            query.put("HostRegionId", request.hostRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostVpcId)) {
            query.put("HostVpcId", request.hostVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "ResolveAndRouteServiceInCen"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResolveAndRouteServiceInCenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResolveAndRouteServiceInCenResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block to provide services. These cloud services include Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access a cloud service, you must attach the virtual border router (VBR) or Cloud Connect Network (CCN) instance that is connected to your on-premises network to a Cloud Enterprise Network (CEN) instance. In addition, you must attach a virtual private cloud (VPC) that is deployed in the same region as the cloud service to the CEN instance. This way, your on-premises network can connect to the VPC that is deployed in the same region as the cloud service and access the cloud service through the VPC.</p>
     * <ul>
     * <li>This operation is supported only by Basic Edition transit routers. An on-premises network associated with a VBR can use CEN to access only a cloud service that is deployed in the same region.
     * For example, if cloud services are deployed in the China (Beijing) region, only on-premises networks connected to VBRs in the China (Beijing) region can access the cloud services.</li>
     * <li><strong>ResolveAndRouteServiceInCen</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of a cloud service.<ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the connection to the cloud service is being created. In this case, you can query the cloud service but cannot perform other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the connection to the cloud service is created.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the connection to the cloud service failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance to which your on-premises network is connected is attached to a CEN instance.</li>
     * <li>A VPC that is deployed in the same region as the cloud service is attached to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Connects an on-premises network to a cloud service.</p>
     * 
     * @param request ResolveAndRouteServiceInCenRequest
     * @return ResolveAndRouteServiceInCenResponse
     */
    public ResolveAndRouteServiceInCenResponse resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resolveAndRouteServiceInCenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><code>RevokeInstanceFromTransitRouter</code> can be used to revoke permissions on virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs) that belong to another Alibaba Cloud account.
     * To revoke permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call <code>RevokeInstanceFromTransitRouter</code>, you must detach the network instances from the transit router.</p>
     * <ul>
     * <li>For more information about how to detach VPCs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to detach VBRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>For more information about how to detach IPsec-VPN connections from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to detach ECRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>For more information about how to detach network instances from Basic Edition transit routers, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes the permissions that a transit router has on network instances that belong to another Alibaba Cloud account.</p>
     * 
     * @param request RevokeInstanceFromTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeInstanceFromTransitRouterResponse
     */
    public RevokeInstanceFromTransitRouterResponse revokeInstanceFromTransitRouterWithOptions(RevokeInstanceFromTransitRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("action", "RevokeInstanceFromTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromTransitRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RevokeInstanceFromTransitRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><code>RevokeInstanceFromTransitRouter</code> can be used to revoke permissions on virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs) that belong to another Alibaba Cloud account.
     * To revoke permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call <code>RevokeInstanceFromTransitRouter</code>, you must detach the network instances from the transit router.</p>
     * <ul>
     * <li>For more information about how to detach VPCs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to detach VBRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>For more information about how to detach IPsec-VPN connections from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to detach ECRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>For more information about how to detach network instances from Basic Edition transit routers, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes the permissions that a transit router has on network instances that belong to another Alibaba Cloud account.</p>
     * 
     * @param request RevokeInstanceFromTransitRouterRequest
     * @return RevokeInstanceFromTransitRouterResponse
     */
    public RevokeInstanceFromTransitRouterResponse revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeInstanceFromTransitRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud DNS PrivateZone (PrivateZone) is an Alibaba Cloud private domain name resolution and management service based on Virtual Private Cloud (VPC). After you attach virtual border routers (VBRs) and Cloud Connect Network (CCN) instances to a Cloud Enterprise Network (CEN) instance, you can enable the on-premises networks connected to the VBRs and CCN instances to access PrivateZone through the CEN instance. </p>
     * <h4>Usage notes</h4>
     * <ul>
     * <li>The on-premises networks connected to VBRs or CCN instances must be deployed in the same region as the PrivateZone service. For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks connected to VBRs or CCN instances in the China (Beijing) region can access the PrivateZone service. </li>
     * <li><strong>RoutePrivateZoneInCenToVpc</strong> is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>DescribeCenPrivateZoneRoutes</strong> to query the status of PrivateZone. <ul>
     * <li>If PrivateZone is in the <strong>Creating</strong> state, access to PrivateZone is being configured. In this case, you can query PrivateZone configurations but cannot perform other operations. </li>
     * <li>If PrivateZone is in the <strong>Active</strong> state, access to PrivateZone is enabled. </li>
     * <li>If PrivateZone is in the <strong>Failed</strong> state, configurations of access to PrivateZone failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you call <strong>RoutePrivateZoneInCenToVpc</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>PrivateZone is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">PrivateZone quick start</a>.</li>
     * <li>The following network instances are attached to the same CEN instance: the VPC that is associated with the PrivateZone service, and the VBR and CCN instance that want to access the PrivateZone service. For more information, see <a href="https://help.aliyun.com/document_detail/468684.html">AttachCenChildInstance</a>. </li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud and the account that owns the CCN instance is different from the account that owns the VPC or CEN instance, you must grant the CCN instance required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/181654.html">Grant permissions to CCN</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures PrivateZone.</p>
     * 
     * @param request RoutePrivateZoneInCenToVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RoutePrivateZoneInCenToVpcResponse
     */
    public RoutePrivateZoneInCenToVpcResponse routePrivateZoneInCenToVpcWithOptions(RoutePrivateZoneInCenToVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionId)) {
            query.put("AccessRegionId", request.accessRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostRegionId)) {
            query.put("HostRegionId", request.hostRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostVpcId)) {
            query.put("HostVpcId", request.hostVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "RoutePrivateZoneInCenToVpc"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RoutePrivateZoneInCenToVpcResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RoutePrivateZoneInCenToVpcResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud DNS PrivateZone (PrivateZone) is an Alibaba Cloud private domain name resolution and management service based on Virtual Private Cloud (VPC). After you attach virtual border routers (VBRs) and Cloud Connect Network (CCN) instances to a Cloud Enterprise Network (CEN) instance, you can enable the on-premises networks connected to the VBRs and CCN instances to access PrivateZone through the CEN instance. </p>
     * <h4>Usage notes</h4>
     * <ul>
     * <li>The on-premises networks connected to VBRs or CCN instances must be deployed in the same region as the PrivateZone service. For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks connected to VBRs or CCN instances in the China (Beijing) region can access the PrivateZone service. </li>
     * <li><strong>RoutePrivateZoneInCenToVpc</strong> is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>DescribeCenPrivateZoneRoutes</strong> to query the status of PrivateZone. <ul>
     * <li>If PrivateZone is in the <strong>Creating</strong> state, access to PrivateZone is being configured. In this case, you can query PrivateZone configurations but cannot perform other operations. </li>
     * <li>If PrivateZone is in the <strong>Active</strong> state, access to PrivateZone is enabled. </li>
     * <li>If PrivateZone is in the <strong>Failed</strong> state, configurations of access to PrivateZone failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you call <strong>RoutePrivateZoneInCenToVpc</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>PrivateZone is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">PrivateZone quick start</a>.</li>
     * <li>The following network instances are attached to the same CEN instance: the VPC that is associated with the PrivateZone service, and the VBR and CCN instance that want to access the PrivateZone service. For more information, see <a href="https://help.aliyun.com/document_detail/468684.html">AttachCenChildInstance</a>. </li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud and the account that owns the CCN instance is different from the account that owns the VPC or CEN instance, you must grant the CCN instance required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/181654.html">Grant permissions to CCN</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures PrivateZone.</p>
     * 
     * @param request RoutePrivateZoneInCenToVpcRequest
     * @return RoutePrivateZoneInCenToVpcResponse
     */
    public RoutePrivateZoneInCenToVpcResponse routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.routePrivateZoneInCenToVpcWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to manage bandwidth of inter-region connections only for Basic Edition transit routers.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The Cloud Enterprise Network (CEN) instance is associated with a bandwidth plan. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call the <strong>SetCenInterRegionBandwidthLimit</strong> operation to configure, change, or remove the bandwidth limit of an inter-region connection.</p>
     * <ul>
     * <li>If you set <strong>BandwidthLimit</strong> to a value other than 0, the bandwidth of the inter-region connection is set to the specified value.</li>
     * <li>If you set <strong>BandwidthLimit</strong> to 0, the bandwidth of the inter-region connection is no longer limited.</li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>The bandwidth limit of an inter-region connection cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>The sum of bandwidth limits of all inter-region connections cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>If bandwidth multiplexing is enabled for an inter-region connection, you cannot change the bandwidth of the inter-region connection.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation can be used to configure, modify, or delete the bandwidth of inter-region connections only for Basic Edition transit routers.
     * To configure, modify, or delete the bandwidth of inter-region connections for Enterprise Edition transit routers, call the <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, or <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures, modifies, or deletes the bandwidth of inter-region connections for a Basic Edition transit router.</p>
     * 
     * @param request SetCenInterRegionBandwidthLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCenInterRegionBandwidthLimitResponse
     */
    public SetCenInterRegionBandwidthLimitResponse setCenInterRegionBandwidthLimitWithOptions(SetCenInterRegionBandwidthLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthLimit)) {
            query.put("BandwidthLimit", request.bandwidthLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthType)) {
            query.put("BandwidthType", request.bandwidthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localRegionId)) {
            query.put("LocalRegionId", request.localRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oppositeRegionId)) {
            query.put("OppositeRegionId", request.oppositeRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "SetCenInterRegionBandwidthLimit"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetCenInterRegionBandwidthLimitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetCenInterRegionBandwidthLimitResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation is used to manage bandwidth of inter-region connections only for Basic Edition transit routers.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The Cloud Enterprise Network (CEN) instance is associated with a bandwidth plan. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call the <strong>SetCenInterRegionBandwidthLimit</strong> operation to configure, change, or remove the bandwidth limit of an inter-region connection.</p>
     * <ul>
     * <li>If you set <strong>BandwidthLimit</strong> to a value other than 0, the bandwidth of the inter-region connection is set to the specified value.</li>
     * <li>If you set <strong>BandwidthLimit</strong> to 0, the bandwidth of the inter-region connection is no longer limited.</li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>The bandwidth limit of an inter-region connection cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>The sum of bandwidth limits of all inter-region connections cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>If bandwidth multiplexing is enabled for an inter-region connection, you cannot change the bandwidth of the inter-region connection.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation can be used to configure, modify, or delete the bandwidth of inter-region connections only for Basic Edition transit routers.
     * To configure, modify, or delete the bandwidth of inter-region connections for Enterprise Edition transit routers, call the <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, or <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures, modifies, or deletes the bandwidth of inter-region connections for a Basic Edition transit router.</p>
     * 
     * @param request SetCenInterRegionBandwidthLimitRequest
     * @return SetCenInterRegionBandwidthLimitResponse
     */
    public SetCenInterRegionBandwidthLimitResponse setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCenInterRegionBandwidthLimitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each tag consists of a tag key and a tag value. When you add a tag, you must specify the tag key and tag value.</p>
     * <ul>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, each tag key must be unique.</li>
     * <li>You can add at most 20 tags to a CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-09-12"),
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
     * <b>description</b> :
     * <p>  Each tag consists of a tag key and a tag value. When you add a tag, you must specify the tag key and tag value.</p>
     * <ul>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, each tag key must be unique.</li>
     * <li>You can add at most 20 tags to a CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds them to a resource.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request TempUpgradeCenBandwidthPackageSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempUpgradeCenBandwidthPackageSpecResponse
     */
    public TempUpgradeCenBandwidthPackageSpecResponse tempUpgradeCenBandwidthPackageSpecWithOptions(TempUpgradeCenBandwidthPackageSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "TempUpgradeCenBandwidthPackageSpec"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new TempUpgradeCenBandwidthPackageSpecResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new TempUpgradeCenBandwidthPackageSpecResponse());
        }

    }

    /**
     * @param request TempUpgradeCenBandwidthPackageSpecRequest
     * @return TempUpgradeCenBandwidthPackageSpecResponse
     */
    public TempUpgradeCenBandwidthPackageSpecResponse tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempUpgradeCenBandwidthPackageSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>No inter-region connections are configured in the bandwidth plan. For more information about how to delete inter-region connections, see <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Cloud Enterprise Network (CEN) from a bandwidth plan. After the disassociation, the bandwidth can be associated with another CEN instance.</p>
     * 
     * @param request UnassociateCenBandwidthPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassociateCenBandwidthPackageResponse
     */
    public UnassociateCenBandwidthPackageResponse unassociateCenBandwidthPackageWithOptions(UnassociateCenBandwidthPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "UnassociateCenBandwidthPackage"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateCenBandwidthPackageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnassociateCenBandwidthPackageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>No inter-region connections are configured in the bandwidth plan. For more information about how to delete inter-region connections, see <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a Cloud Enterprise Network (CEN) from a bandwidth plan. After the disassociation, the bandwidth can be associated with another CEN instance.</p>
     * 
     * @param request UnassociateCenBandwidthPackageRequest
     * @return UnassociateCenBandwidthPackageResponse
     */
    public UnassociateCenBandwidthPackageResponse unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * @param request UnroutePrivateZoneInCenToVpcRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnroutePrivateZoneInCenToVpcResponse
     */
    public UnroutePrivateZoneInCenToVpcResponse unroutePrivateZoneInCenToVpcWithOptions(UnroutePrivateZoneInCenToVpcRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessRegionId)) {
            query.put("AccessRegionId", request.accessRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "UnroutePrivateZoneInCenToVpc"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnroutePrivateZoneInCenToVpcResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnroutePrivateZoneInCenToVpcResponse());
        }

    }

    /**
     * @param request UnroutePrivateZoneInCenToVpcRequest
     * @return UnroutePrivateZoneInCenToVpcResponse
     */
    public UnroutePrivateZoneInCenToVpcResponse unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unroutePrivateZoneInCenToVpcWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-09-12"),
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
     * <p>The ID of the request.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a quality of service (QoS) policy.</p>
     * 
     * @param request UpdateCenInterRegionTrafficQosPolicyAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCenInterRegionTrafficQosPolicyAttributeResponse
     */
    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse updateCenInterRegionTrafficQosPolicyAttributeWithOptions(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyDescription)) {
            query.put("TrafficQosPolicyDescription", request.trafficQosPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyId)) {
            query.put("TrafficQosPolicyId", request.trafficQosPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficQosPolicyName)) {
            query.put("TrafficQosPolicyName", request.trafficQosPolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCenInterRegionTrafficQosPolicyAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosPolicyAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateCenInterRegionTrafficQosPolicyAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a quality of service (QoS) policy.</p>
     * 
     * @param request UpdateCenInterRegionTrafficQosPolicyAttributeRequest
     * @return UpdateCenInterRegionTrafficQosPolicyAttributeResponse
     */
    public UpdateCenInterRegionTrafficQosPolicyAttributeResponse updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCenInterRegionTrafficQosPolicyAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, inter-region bandwidth, and Differentiated Services Code Point (DSCP) value of a quality of service (QoS) queue.</p>
     * 
     * @param request UpdateCenInterRegionTrafficQosQueueAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCenInterRegionTrafficQosQueueAttributeResponse
     */
    public UpdateCenInterRegionTrafficQosQueueAttributeResponse updateCenInterRegionTrafficQosQueueAttributeWithOptions(UpdateCenInterRegionTrafficQosQueueAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dscps)) {
            query.put("Dscps", request.dscps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueDescription)) {
            query.put("QosQueueDescription", request.qosQueueDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueId)) {
            query.put("QosQueueId", request.qosQueueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosQueueName)) {
            query.put("QosQueueName", request.qosQueueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remainBandwidthPercent)) {
            query.put("RemainBandwidthPercent", request.remainBandwidthPercent);
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
            new TeaPair("action", "UpdateCenInterRegionTrafficQosQueueAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosQueueAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateCenInterRegionTrafficQosQueueAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, inter-region bandwidth, and Differentiated Services Code Point (DSCP) value of a quality of service (QoS) queue.</p>
     * 
     * @param request UpdateCenInterRegionTrafficQosQueueAttributeRequest
     * @return UpdateCenInterRegionTrafficQosQueueAttributeResponse
     */
    public UpdateCenInterRegionTrafficQosQueueAttributeResponse updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCenInterRegionTrafficQosQueueAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, and traffic classification rules of a traffic marking policy.</p>
     * 
     * @param request UpdateTrafficMarkingPolicyAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTrafficMarkingPolicyAttributeResponse
     */
    public UpdateTrafficMarkingPolicyAttributeResponse updateTrafficMarkingPolicyAttributeWithOptions(UpdateTrafficMarkingPolicyAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addTrafficMatchRules)) {
            query.put("AddTrafficMatchRules", request.addTrafficMatchRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteTrafficMatchRules)) {
            query.put("DeleteTrafficMatchRules", request.deleteTrafficMatchRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyDescription)) {
            query.put("TrafficMarkingPolicyDescription", request.trafficMarkingPolicyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyId)) {
            query.put("TrafficMarkingPolicyId", request.trafficMarkingPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMarkingPolicyName)) {
            query.put("TrafficMarkingPolicyName", request.trafficMarkingPolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrafficMarkingPolicyAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficMarkingPolicyAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTrafficMarkingPolicyAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, and traffic classification rules of a traffic marking policy.</p>
     * 
     * @param request UpdateTrafficMarkingPolicyAttributeRequest
     * @return UpdateTrafficMarkingPolicyAttributeResponse
     */
    public UpdateTrafficMarkingPolicyAttributeResponse updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTrafficMarkingPolicyAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Modifying</strong> state, the configuration of the transit router is being modified. You can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router is in the <strong>Active</strong> state, the configuration of the transit router is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a transit router.</p>
     * 
     * @param request UpdateTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterResponse
     */
    public UpdateTransitRouterResponse updateTransitRouterWithOptions(UpdateTransitRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterDescription)) {
            query.put("TransitRouterDescription", request.transitRouterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterName)) {
            query.put("TransitRouterName", request.transitRouterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Modifying</strong> state, the configuration of the transit router is being modified. You can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router is in the <strong>Active</strong> state, the configuration of the transit router is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a transit router.</p>
     * 
     * @param request UpdateTransitRouterRequest
     * @return UpdateTransitRouterResponse
     */
    public UpdateTransitRouterResponse updateTransitRouter(UpdateTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If an ECR connection is in the Modifying state, the ECR connection is being modified. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If an ECR connection is in the Attached state, the ECR connection is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of an Express Connect Router (ECR) connection on a Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterEcrAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterEcrAttachmentAttributeResponse
     */
    public UpdateTransitRouterEcrAttachmentAttributeResponse updateTransitRouterEcrAttachmentAttributeWithOptions(UpdateTransitRouterEcrAttachmentAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterEcrAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterEcrAttachmentAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterEcrAttachmentAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If an ECR connection is in the Modifying state, the ECR connection is being modified. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If an ECR connection is in the Attached state, the ECR connection is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of an Express Connect Router (ECR) connection on a Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterEcrAttachmentAttributeRequest
     * @return UpdateTransitRouterEcrAttachmentAttributeResponse
     */
    public UpdateTransitRouterEcrAttachmentAttributeResponse updateTransitRouterEcrAttachmentAttribute(UpdateTransitRouterEcrAttachmentAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterEcrAttachmentAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterPeerAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterPeerAttachmentAttributeResponse
     */
    public UpdateTransitRouterPeerAttachmentAttributeResponse updateTransitRouterPeerAttachmentAttributeWithOptions(UpdateTransitRouterPeerAttachmentAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidthType)) {
            query.put("BandwidthType", request.bandwidthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenBandwidthPackageId)) {
            query.put("CenBandwidthPackageId", request.cenBandwidthPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLinkType)) {
            query.put("DefaultLinkType", request.defaultLinkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterPeerAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterPeerAttachmentAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterPeerAttachmentAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an inter-region connection on an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterPeerAttachmentAttributeRequest
     * @return UpdateTransitRouterPeerAttachmentAttributeResponse
     */
    public UpdateTransitRouterPeerAttachmentAttributeResponse updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterPeerAttachmentAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a route in a route table of an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterRouteEntryResponse
     */
    public UpdateTransitRouterRouteEntryResponse updateTransitRouterRouteEntryWithOptions(UpdateTransitRouterRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryDescription)) {
            query.put("TransitRouterRouteEntryDescription", request.transitRouterRouteEntryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryId)) {
            query.put("TransitRouterRouteEntryId", request.transitRouterRouteEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteEntryName)) {
            query.put("TransitRouterRouteEntryName", request.transitRouterRouteEntryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterRouteEntry"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterRouteEntryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a route in a route table of an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterRouteEntryRequest
     * @return UpdateTransitRouterRouteEntryResponse
     */
    public UpdateTransitRouterRouteEntryResponse updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a route table of an Enterprise Edition transit router and enables or disables multi-region equal-cost multi-path (ECMP) routing.</p>
     * 
     * @param request UpdateTransitRouterRouteTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterRouteTableResponse
     */
    public UpdateTransitRouterRouteTableResponse updateTransitRouterRouteTableWithOptions(UpdateTransitRouterRouteTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableOptions)) {
            query.put("RouteTableOptions", request.routeTableOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableDescription)) {
            query.put("TransitRouterRouteTableDescription", request.transitRouterRouteTableDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableId)) {
            query.put("TransitRouterRouteTableId", request.transitRouterRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterRouteTableName)) {
            query.put("TransitRouterRouteTableName", request.transitRouterRouteTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterRouteTable"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteTableResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterRouteTableResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a route table of an Enterprise Edition transit router and enables or disables multi-region equal-cost multi-path (ECMP) routing.</p>
     * 
     * @param request UpdateTransitRouterRouteTableRequest
     * @return UpdateTransitRouterRouteTableResponse
     */
    public UpdateTransitRouterRouteTableResponse updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterRouteTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. You can query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and enables or disables automatic route advertisement for a virtual border router (VBR) connection on an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterVbrAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterVbrAttachmentAttributeResponse
     */
    public UpdateTransitRouterVbrAttachmentAttributeResponse updateTransitRouterVbrAttachmentAttributeWithOptions(UpdateTransitRouterVbrAttachmentAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVbrAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVbrAttachmentAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterVbrAttachmentAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. You can query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and enables or disables automatic route advertisement for a virtual border router (VBR) connection on an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterVbrAttachmentAttributeRequest
     * @return UpdateTransitRouterVbrAttachmentAttributeResponse
     */
    public UpdateTransitRouterVbrAttachmentAttributeResponse updateTransitRouterVbrAttachmentAttribute(UpdateTransitRouterVbrAttachmentAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterVbrAttachmentAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a virtual private cloud (VPC) connection on an Enterprise Edition transit router.</p>
     * 
     * @param tmpReq UpdateTransitRouterVpcAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterVpcAttachmentAttributeResponse
     */
    public UpdateTransitRouterVpcAttachmentAttributeResponse updateTransitRouterVpcAttachmentAttributeWithOptions(UpdateTransitRouterVpcAttachmentAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTransitRouterVpcAttachmentAttributeShrinkRequest request = new UpdateTransitRouterVpcAttachmentAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transitRouterVPCAttachmentOptions)) {
            request.transitRouterVPCAttachmentOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transitRouterVPCAttachmentOptions, "TransitRouterVPCAttachmentOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterVPCAttachmentOptionsShrink)) {
            query.put("TransitRouterVPCAttachmentOptions", request.transitRouterVPCAttachmentOptionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVpcAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpcAttachmentAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterVpcAttachmentAttributeResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a virtual private cloud (VPC) connection on an Enterprise Edition transit router.</p>
     * 
     * @param request UpdateTransitRouterVpcAttachmentAttributeRequest
     * @return UpdateTransitRouterVpcAttachmentAttributeResponse
     */
    public UpdateTransitRouterVpcAttachmentAttributeResponse updateTransitRouterVpcAttachmentAttribute(UpdateTransitRouterVpcAttachmentAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterVpcAttachmentAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you add a zone and a vSwitch for a VPC connection, make sure that the vSwitch has at least one idle IP address. When you modify the zones and vSwitches of a VPC connection, the Enterprise Edition transit router creates an elastic network interface (ENI) in the vSwitch. The ENI occupies one IP address in the vSwitch. The ENI forwards traffic between the VPC and the Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>UpdateTransitRouterVpcAttachmentZones</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.<ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the zones and vSwitches that are associated with a virtual private cloud (VPC) connection.</p>
     * 
     * @param request UpdateTransitRouterVpcAttachmentZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterVpcAttachmentZonesResponse
     */
    public UpdateTransitRouterVpcAttachmentZonesResponse updateTransitRouterVpcAttachmentZonesWithOptions(UpdateTransitRouterVpcAttachmentZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addZoneMappings)) {
            query.put("AddZoneMappings", request.addZoneMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeZoneMappings)) {
            query.put("RemoveZoneMappings", request.removeZoneMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVpcAttachmentZones"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpcAttachmentZonesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterVpcAttachmentZonesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  When you add a zone and a vSwitch for a VPC connection, make sure that the vSwitch has at least one idle IP address. When you modify the zones and vSwitches of a VPC connection, the Enterprise Edition transit router creates an elastic network interface (ENI) in the vSwitch. The ENI occupies one IP address in the vSwitch. The ENI forwards traffic between the VPC and the Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>UpdateTransitRouterVpcAttachmentZones</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.<ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the zones and vSwitches that are associated with a virtual private cloud (VPC) connection.</p>
     * 
     * @param request UpdateTransitRouterVpcAttachmentZonesRequest
     * @return UpdateTransitRouterVpcAttachmentZonesResponse
     */
    public UpdateTransitRouterVpcAttachmentZonesResponse updateTransitRouterVpcAttachmentZones(UpdateTransitRouterVpcAttachmentZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterVpcAttachmentZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a VPN attachment.</p>
     * 
     * @param request UpdateTransitRouterVpnAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterVpnAttachmentAttributeResponse
     */
    public UpdateTransitRouterVpnAttachmentAttributeResponse updateTransitRouterVpnAttachmentAttributeWithOptions(UpdateTransitRouterVpnAttachmentAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPublishRouteEnabled)) {
            query.put("AutoPublishRouteEnabled", request.autoPublishRouteEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentDescription)) {
            query.put("TransitRouterAttachmentDescription", request.transitRouterAttachmentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentId)) {
            query.put("TransitRouterAttachmentId", request.transitRouterAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterAttachmentName)) {
            query.put("TransitRouterAttachmentName", request.transitRouterAttachmentName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTransitRouterVpnAttachmentAttribute"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpnAttachmentAttributeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateTransitRouterVpnAttachmentAttributeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a VPN attachment.</p>
     * 
     * @param request UpdateTransitRouterVpnAttachmentAttributeRequest
     * @return UpdateTransitRouterVpnAttachmentAttributeResponse
     */
    public UpdateTransitRouterVpnAttachmentAttributeResponse updateTransitRouterVpnAttachmentAttribute(UpdateTransitRouterVpnAttachmentAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTransitRouterVpnAttachmentAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Withdraws the routes of a virtual private cloud (VPC) or a virtual border router (VBR) from a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request WithdrawPublishedRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawPublishedRouteEntriesResponse
     */
    public WithdrawPublishedRouteEntriesResponse withdrawPublishedRouteEntriesWithOptions(WithdrawPublishedRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRegionId)) {
            query.put("ChildInstanceRegionId", request.childInstanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceRouteTableId)) {
            query.put("ChildInstanceRouteTableId", request.childInstanceRouteTableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceType)) {
            query.put("ChildInstanceType", request.childInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
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
            new TeaPair("action", "WithdrawPublishedRouteEntries"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawPublishedRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new WithdrawPublishedRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Withdraws the routes of a virtual private cloud (VPC) or a virtual border router (VBR) from a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request WithdrawPublishedRouteEntriesRequest
     * @return WithdrawPublishedRouteEntriesResponse
     */
    public WithdrawPublishedRouteEntriesResponse withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawPublishedRouteEntriesWithOptions(request, runtime);
    }
}
