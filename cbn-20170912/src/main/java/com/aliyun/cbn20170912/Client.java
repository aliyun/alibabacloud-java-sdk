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
     * <ul>
     * <li><p>After a flow log is created, it is in the Active state by default. If you stopped a flow log, you can call this operation to reactivate it.</p>
     * </li>
     * <li><p><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but activate flow log is not fully activated. The activation task is still running in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of activate flow log.</p>
     * <ul>
     * <li>If activate flow log is in the <strong>Modifying</strong> state, activate flow log is being activated. In this state, you can only perform query operations.</li>
     * <li>If activate flow log is in the <strong>Active</strong> state, activate flow log is activated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a flow log to start capturing traffic of specified resources.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveFlowLogResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>After a flow log is created, it is in the Active state by default. If you stopped a flow log, you can call this operation to reactivate it.</p>
     * </li>
     * <li><p><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but activate flow log is not fully activated. The activation task is still running in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of activate flow log.</p>
     * <ul>
     * <li>If activate flow log is in the <strong>Modifying</strong> state, activate flow log is being activated. In this state, you can only perform query operations.</li>
     * <li>If activate flow log is in the <strong>Active</strong> state, activate flow log is activated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a flow log to start capturing traffic of specified resources.</p>
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
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic classification rule is not yet created. The creation task continues to run in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of the traffic classification rule. </p>
     * <ul>
     * <li>If the traffic classification rule is in the <strong>Creating</strong> state, the rule is being created. In this state, you can only query the rule and cannot perform other operations on it.</li>
     * <li>If the traffic classification rule is in the <strong>Active</strong> state, the rule is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds traffic classification rules to a traffic marking policy by calling the AddTrafficMatchRuleToTrafficMarkingPolicy operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTrafficMatchRuleToTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic classification rule is not yet created. The creation task continues to run in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of the traffic classification rule. </p>
     * <ul>
     * <li>If the traffic classification rule is in the <strong>Creating</strong> state, the rule is being created. In this state, you can only query the rule and cannot perform other operations on it.</li>
     * <li>If the traffic classification rule is in the <strong>Active</strong> state, the rule is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds traffic classification rules to a traffic marking policy by calling the AddTrafficMatchRuleToTrafficMarkingPolicy operation.</p>
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
     * <h3>Precautions</h3>
     * <p>The <strong>AddTraficMatchRuleToTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued. To add traffic classification rules to a traffic marking policy, use the <a href="https://help.aliyun.com/document_detail/427602.html">AddTrafficMatchRuleToTrafficMarkingPolicy</a> operation. This documentation is no longer maintained.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds traffic classification rules to a traffic marking policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTraficMatchRuleToTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <p>The <strong>AddTraficMatchRuleToTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued. To add traffic classification rules to a traffic marking policy, use the <a href="https://help.aliyun.com/document_detail/427602.html">AddTrafficMatchRuleToTrafficMarkingPolicy</a> operation. This documentation is no longer maintained.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds traffic classification rules to a traffic marking policy.</p>
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
     * <p>A CEN instance supports binding multiple bandwidth packages, but does not support binding multiple bandwidth packages with the same connected areas.
     * For example, if a CEN instance already has a bandwidth package bound for the Chinese mainland-to-Chinese mainland connected areas, you cannot bind another bandwidth package for the Chinese mainland-to-Chinese mainland connected areas. However, you can bind a bandwidth package for the Chinese mainland-to-North America connected areas.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth package instance with a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateCenBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>A CEN instance supports binding multiple bandwidth packages, but does not support binding multiple bandwidth packages with the same connected areas.
     * For example, if a CEN instance already has a bandwidth package bound for the Chinese mainland-to-Chinese mainland connected areas, you cannot bind another bandwidth package for the Chinese mainland-to-Chinese mainland connected areas. However, you can bind a bandwidth package for the Chinese mainland-to-North America connected areas.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a bandwidth package instance with a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>After you create a network instance connection, you must set the association and forwarding relationship for it by associating the network instance connection with an Enterprise Edition transit router route table. After the association is created, the Enterprise Edition transit router forwards traffic of the network instance based on the route entries in the route table. Before you invoke this operation, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit router route tables support route table associations. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>Each network instance connection can be associated with only one Enterprise Edition transit router route table.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the network instance connection and the route table is not complete. The association task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table.<ul>
     * <li>If the association status is <strong>Associating</strong>, the network instance connection is being associated with the route table. In this state, you can only query the association but cannot perform other operations.</li>
     * <li>If the association status is <strong>Active</strong>, the network instance connection is associated with the route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route table association.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTransitRouterAttachmentWithRouteTableResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you must set the association and forwarding relationship for it by associating the network instance connection with an Enterprise Edition transit router route table. After the association is created, the Enterprise Edition transit router forwards traffic of the network instance based on the route entries in the route table. Before you invoke this operation, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit router route tables support route table associations. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>Each network instance connection can be associated with only one Enterprise Edition transit router route table.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the network instance connection and the route table is not complete. The association task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table.<ul>
     * <li>If the association status is <strong>Associating</strong>, the network instance connection is being associated with the route table. In this state, you can only query the association but cannot perform other operations.</li>
     * <li>If the association status is <strong>Active</strong>, the network instance connection is associated with the route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route table association.</p>
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
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch to be associated is not already associated with another multicast domain. To disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li><strong>AssociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the vSwitch and the multicast domain is not yet complete. The association task continues to run in the background. You can call <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the association status between the vSwitch and the multicast domain.<ul>
     * <li>If the association status is <strong>Associating</strong>, the association between the vSwitch and the multicast domain is being established. In this state, you can only query the vSwitch but cannot perform other operations.</li>
     * <li>If the association status is <strong>Associated</strong>, the association between the vSwitch and the multicast domain is established.</li>
     * </ul>
     * </li>
     * <li>The VPC to which the vSwitch belongs must be connected to an Enterprise Edition transit router. To create a VPC connection, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a vSwitch in a virtual private cloud (VPC) with a multicast domain by calling the AssociateTransitRouterMulticastDomain operation so that resources in the VPC can communicate through multicast.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateTransitRouterMulticastDomainResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch to be associated is not already associated with another multicast domain. To disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li><strong>AssociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the vSwitch and the multicast domain is not yet complete. The association task continues to run in the background. You can call <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the association status between the vSwitch and the multicast domain.<ul>
     * <li>If the association status is <strong>Associating</strong>, the association between the vSwitch and the multicast domain is being established. In this state, you can only query the vSwitch but cannot perform other operations.</li>
     * <li>If the association status is <strong>Associated</strong>, the association between the vSwitch and the multicast domain is established.</li>
     * </ul>
     * </li>
     * <li>The VPC to which the vSwitch belongs must be connected to an Enterprise Edition transit router. To create a VPC connection, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a vSwitch in a virtual private cloud (VPC) with a multicast domain by calling the AssociateTransitRouterMulticastDomain operation so that resources in the VPC can communicate through multicast.</p>
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
     * <p>CEN supports attaching cross-account network instances. Before attaching a cross-account network instance, the CEN instance must be authorized by the cross-account network instance:</p>
     * <ul>
     * <li>For cross-account VPC instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For cross-account Cloud Connect Network instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>Cross-account border router instance authorization is not available by default. To use this feature, contact your account manager.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCenChildInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>CEN supports attaching cross-account network instances. Before attaching a cross-account network instance, the CEN instance must be authorized by the cross-account network instance:</p>
     * <ul>
     * <li>For cross-account VPC instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For cross-account Cloud Connect Network instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>Cross-account border router instance authorization is not available by default. To use this feature, contact your account manager.</li>
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
     * <p>Queries whether the transit router service is activated for the current Alibaba Cloud account.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTransitRouterServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the transit router service is activated for the current Alibaba Cloud account.</p>
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
     * <p>The <strong>CreateCen</strong> operation is asynchronous. The system returns a CEN instance ID before the CEN instance is fully created, while the creation task continues in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A Cloud Enterprise Network (CEN) instance is the fundamental resource for managing an integrated network. A CEN instance manages one network and can span one or more regions. Before enabling connectivity between network instances, call the CreateCen operation to create a CEN instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCen</strong> operation is asynchronous. The system returns a CEN instance ID before the CEN instance is fully created, while the creation task continues in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A Cloud Enterprise Network (CEN) instance is the fundamental resource for managing an integrated network. A CEN instance manages one network and can span one or more regions. Before enabling connectivity between network instances, call the CreateCen operation to create a CEN instance.</p>
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
     * <ul>
     * <li>When you create a bandwidth plan instance, you must specify the connected areas. An area of a bandwidth plan is a collection of regions. Each area contains one or more Alibaba Cloud regions. Select the connected areas based on the regions that you want to connect. For more information about the relationship between areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</li>
     * <li>For more information about the billing details of bandwidth plans, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you invoke the operation, the system returns a bandwidth plan instance ID but the bandwidth plan is not yet created. The creation node is still running in the background. You can invoke the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of the bandwidth plan. When the bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan for Cloud Enterprise Network (CEN) to enable cross-region connectivity between network instances.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you create a bandwidth plan instance, you must specify the connected areas. An area of a bandwidth plan is a collection of regions. Each area contains one or more Alibaba Cloud regions. Select the connected areas based on the regions that you want to connect. For more information about the relationship between areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</li>
     * <li>For more information about the billing details of bandwidth plans, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you invoke the operation, the system returns a bandwidth plan instance ID but the bandwidth plan is not yet created. The creation node is still running in the background. You can invoke the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of the bandwidth plan. When the bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a bandwidth plan for Cloud Enterprise Network (CEN) to enable cross-region connectivity between network instances.</p>
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
     * <ul>
     * <li>You can add route entries only to Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances that are connected to an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the <strong>transit router connection</strong> (network instance connection) and cannot be modified.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet created. The creation task continues to run in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Pending</strong> state, the route entry is being created. In this state, you can only query the route entry but cannot perform other operations.</li>
     * <li>If the route entry is in the <strong>Available</strong> state, the route entry is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance connected to an Enterprise Edition transit router. The destination CIDR block points to the transit router in the current region as the next hop.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can add route entries only to Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances that are connected to an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the <strong>transit router connection</strong> (network instance connection) and cannot be modified.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet created. The creation task continues to run in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Pending</strong> state, the route entry is being created. In this state, you can only query the route entry but cannot perform other operations.</li>
     * <li>If the route entry is in the <strong>Available</strong> state, the route entry is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance connected to an Enterprise Edition transit router. The destination CIDR block points to the transit router in the current region as the next hop.</p>
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
     * <ul>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation does not support adding route entries to network instances in an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the regional gateway of Cloud Enterprise Network (CEN) and cannot be modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance by calling the CreateCenChildInstanceRouteEntryToCen operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenChildInstanceRouteEntryToCenResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation does not support adding route entries to network instances in an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the regional gateway of Cloud Enterprise Network (CEN) and cannot be modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a network instance by calling the CreateCenChildInstanceRouteEntryToCen operation.</p>
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
     * <ul>
     * <li>Only inter-region connections of Enterprise Edition transit routers support the creation of cross-region traffic scheduling policies.</li>
     * <li>The traffic scheduling feature takes effect only in the outbound direction of an Enterprise Edition transit router.
     *    For example, if you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions and configure the traffic scheduling feature on the transit router in the China (Hangzhou) region, the traffic scheduling feature can guarantee bandwidth for various services when traffic flows from the China (Hangzhou) region to the China (Qingdao) region. However, the traffic scheduling feature does not guarantee service bandwidth when traffic flows from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic scheduling policy ID but the policy is not yet created. The creation task continues to run in the background. You can call <strong>ListCenInterRegionTrafficQosPolicies</strong> to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Creating</strong> state, the policy is being created. In this state, you can only query the policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call <strong>CreateCenInterRegionTrafficQosPolicy</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cross-region traffic scheduling policy for an Enterprise Edition transit router to optimize and control network traffic across regions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.consoleDryRun)) {
            query.put("ConsoleDryRun", request.consoleDryRun);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenInterRegionTrafficQosPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only inter-region connections of Enterprise Edition transit routers support the creation of cross-region traffic scheduling policies.</li>
     * <li>The traffic scheduling feature takes effect only in the outbound direction of an Enterprise Edition transit router.
     *    For example, if you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions and configure the traffic scheduling feature on the transit router in the China (Hangzhou) region, the traffic scheduling feature can guarantee bandwidth for various services when traffic flows from the China (Hangzhou) region to the China (Qingdao) region. However, the traffic scheduling feature does not guarantee service bandwidth when traffic flows from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic scheduling policy ID but the policy is not yet created. The creation task continues to run in the background. You can call <strong>ListCenInterRegionTrafficQosPolicies</strong> to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Creating</strong> state, the policy is being created. In this state, you can only query the policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call <strong>CreateCenInterRegionTrafficQosPolicy</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cross-region traffic scheduling policy for an Enterprise Edition transit router to optimize and control network traffic across regions.</p>
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
     * <p><em>CreateCenInterRegionTrafficQosQueue</em>* is an asynchronous operation. After you send a request, the system returns a queue ID but the queue is not yet created. The creation task continues to run in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy to determine the creation status of the queue. When you call this operation, you must specify the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If the traffic scheduling policy is in the <strong>Modifying</strong> state, the queue is being created. In this state, you can only query the traffic scheduling policy and queue. You cannot perform other operations.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a queue configuration under a traffic scheduling policy. If you need to manage different types and priorities of network traffic to ensure the performance of critical service traffic and comply with Service-Level Agreements (SLAs), you can call the CreateCenInterRegionTrafficQosQueue operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenInterRegionTrafficQosQueueResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>CreateCenInterRegionTrafficQosQueue</em>* is an asynchronous operation. After you send a request, the system returns a queue ID but the queue is not yet created. The creation task continues to run in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy to determine the creation status of the queue. When you call this operation, you must specify the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If the traffic scheduling policy is in the <strong>Modifying</strong> state, the queue is being created. In this state, you can only query the traffic scheduling policy and queue. You cannot perform other operations.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a queue configuration under a traffic scheduling policy. If you need to manage different types and priorities of network traffic to ensure the performance of critical service traffic and comply with Service-Level Agreements (SLAs), you can call the CreateCenInterRegionTrafficQosQueue operation.</p>
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
     * <p>Routing policies are sorted by priority. A smaller priority value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. When a routing policy is executed, routes are matched against conditional statements starting from the routing policy with the highest priority. For routes that match all conditions, the routing policy either permits or denies the routes based on the policy action. Routes that are permitted can have their attributes modified. For routes that do not match all conditions, the system permits the routes by default. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you call this operation, a routing policy ID is returned, but the routing policy has not been created. The system continues to create the routing policy in the background. You can call <code>DescribeCenRouteMaps</code> to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a routing policy. The routing policy feature allows you to filter route information and customize the management of cloud network connectivity.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCenRouteMapResponse());
    }

    /**
     * <b>description</b> :
     * <p>Routing policies are sorted by priority. A smaller priority value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. When a routing policy is executed, routes are matched against conditional statements starting from the routing policy with the highest priority. For routes that match all conditions, the routing policy either permits or denies the routes based on the policy action. Routes that are permitted can have their attributes modified. For routes that do not match all conditions, the system permits the routes by default. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you call this operation, a routing policy ID is returned, but the routing policy has not been created. The system continues to create the routing policy in the background. You can call <code>DescribeCenRouteMaps</code> to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a routing policy. The routing policy feature allows you to filter route information and customize the management of cloud network connectivity.</p>
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
     * <p>Flow logs help you catch traffic information transmitted by transit router instances and network instance connections (inter-region connections, VPC connections, VPN connections, ECR connections, and VBR connections). Before creating a flow log, note the following:</p>
     * <ul>
     * <li><p>Only Enterprise Edition transit routers support flow log creation.</p>
     * </li>
     * <li><p>For traffic information of inter-region connections, flow logs catch only outbound traffic of the transit router. Inbound traffic of the transit router is not caught.</p>
     * <p>  For example, an Elastic Computing Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you configure a flow log for the transit router in the US (Virginia) region, you can view the packet information sent from the US (Virginia) ECS instance to the US (Silicon Valley) ECS instance in the Simple Log Service console. However, you cannot view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance. To view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance, configure a flow log on the transit router in the US (Silicon Valley) region.</p>
     * </li>
     * <li><p>When a flow log catches traffic information of a VPC connection, it catches only the traffic transmitted by the transit router elastic network interface (ENI). To view traffic information of other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</p>
     * </li>
     * <li><p>The <code>CreateFlowlog</code> operation is asynchronous. After you send a request, the system returns a flow log ID while the flow log is still being created in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before creating a flow log for a resource, make sure that you have created the required resources. For information about how to create each resource, see:</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Flow logs help you catch traffic information transmitted by transit router instances and network instance connections (inter-region connections, VPC connections, VPN connections, ECR connections, and VBR connections). Before creating a flow log, note the following:</p>
     * <ul>
     * <li><p>Only Enterprise Edition transit routers support flow log creation.</p>
     * </li>
     * <li><p>For traffic information of inter-region connections, flow logs catch only outbound traffic of the transit router. Inbound traffic of the transit router is not caught.</p>
     * <p>  For example, an Elastic Computing Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you configure a flow log for the transit router in the US (Virginia) region, you can view the packet information sent from the US (Virginia) ECS instance to the US (Silicon Valley) ECS instance in the Simple Log Service console. However, you cannot view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance. To view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance, configure a flow log on the transit router in the US (Silicon Valley) region.</p>
     * </li>
     * <li><p>When a flow log catches traffic information of a VPC connection, it catches only the traffic transmitted by the transit router elastic network interface (ENI). To view traffic information of other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</p>
     * </li>
     * <li><p>The <code>CreateFlowlog</code> operation is asynchronous. After you send a request, the system returns a flow log ID while the flow log is still being created in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before creating a flow log for a resource, make sure that you have created the required resources. For information about how to create each resource, see:</p>
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
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating traffic marking policies.</li>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID but the traffic marking policy is not yet created. The system continues to create the traffic marking policy in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. In this state, you can only query the traffic marking policy but cannot perform other operations.</li>
     * <li>If the traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A traffic marking policy captures traffic that matches traffic classification rules and adds a Differentiated Services Code Point (DSCP) value to the traffic as a mark. Creates a traffic marking policy by calling CreateTrafficMarkingPolicy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating traffic marking policies.</li>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID but the traffic marking policy is not yet created. The system continues to create the traffic marking policy in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. In this state, you can only query the traffic marking policy but cannot perform other operations.</li>
     * <li>If the traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A traffic marking policy captures traffic that matches traffic classification rules and adds a Differentiated Services Code Point (DSCP) value to the traffic as a mark. Creates a traffic marking policy by calling CreateTrafficMarkingPolicy.</p>
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
     * <p>After you add an aggregate route to an Enterprise Edition transit router route table, the Enterprise Edition transit router propagates the aggregate route only to the route tables of VPC-connected instances that are associated with the current Enterprise Edition transit router route table and have route synchronization enabled.
     * Before creating an aggregate route, make sure that the following operations are completed. Otherwise, the Enterprise Edition transit router does not propagate the aggregate route to VPC instance route tables:</p>
     * <ul>
     * <li>The VPC instance is associated with the Enterprise Edition transit router route table. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPC instance. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouteTableAggregationResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you add an aggregate route to an Enterprise Edition transit router route table, the Enterprise Edition transit router propagates the aggregate route only to the route tables of VPC-connected instances that are associated with the current Enterprise Edition transit router route table and have route synchronization enabled.
     * Before creating an aggregate route, make sure that the following operations are completed. Otherwise, the Enterprise Edition transit router does not propagate the aggregate route to VPC instance route tables:</p>
     * <ul>
     * <li>The VPC instance is associated with the Enterprise Edition transit router route table. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPC instance. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
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
     * <ul>
     * <li>You can call the <strong>CreateTransitRouter</strong> operation to create an Enterprise Edition transit router instance. Enterprise Edition transit routers are available only in some regions. For more information about regions, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the system returns an Enterprise Edition transit router instance ID but the instance is not yet created. The creation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the status of the Enterprise Edition transit router instance.<ul>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Creating</strong> state, the instance is being created. In this state, you can only query the instance but cannot perform other operations on it.</li>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * </li>
     * <li>Only one transit router instance can be created in each region within a Cloud Enterprise Network (CEN) instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateTransitRouter operation to create an Enterprise Edition transit router instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call the <strong>CreateTransitRouter</strong> operation to create an Enterprise Edition transit router instance. Enterprise Edition transit routers are available only in some regions. For more information about regions, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the system returns an Enterprise Edition transit router instance ID but the instance is not yet created. The creation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the status of the Enterprise Edition transit router instance.<ul>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Creating</strong> state, the instance is being created. In this state, you can only query the instance but cannot perform other operations on it.</li>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * </li>
     * <li>Only one transit router instance can be created in each region within a Cloud Enterprise Network (CEN) instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateTransitRouter operation to create an Enterprise Edition transit router instance.</p>
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
     * <p>A transit router CIDR block is a custom CIDR block that you define for a transit router, similar to a CIDR block used to assign IP addresses to a router loopback interface. Transit router CIDR blocks are used to assign addresses to network instance connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation is used only to add a CIDR block to a transit router after the transit router is created.
     * Before you create a transit router CIDR block, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support transit router CIDR blocks.</li>
     * <li>For limits on transit router CIDR blocks, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits on transit router CIDR blocks</a>.</li>
     * <li>A maximum of five CIDR blocks can be configured for a transit router. The subnet mask of each CIDR block must be 16 to 24 bits in length.</li>
     * <li>CIDR blocks that fall within 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets are not supported.</li>
     * <li>Each CIDR block cannot conflict with any CIDR block that needs to communicate within the Cloud Enterprise Network (CEN) instance.</li>
     * <li>Each CIDR block must be unique within the same CEN instance.</li>
     * <li>After you add a CIDR block to a transit router, the system automatically reserves three CIDR blocks from the CIDR block when you create the first VPN connection on the transit router. The reserved CIDR blocks are used by the system to create VPN connections in the background. The system assigns IP addresses to IPsec connections from the remaining CIDR blocks.
     *   You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query the CIDR blocks that are reserved by the system or from which IP addresses are allocated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A transit router CIDR block is a custom CIDR block that you define for a transit router, similar to a CIDR block used to assign IP addresses to a router loopback interface. Calls the CreateTransitRouterCidr operation to create a CIDR block for a transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterCidrResponse());
    }

    /**
     * <b>description</b> :
     * <p>A transit router CIDR block is a custom CIDR block that you define for a transit router, similar to a CIDR block used to assign IP addresses to a router loopback interface. Transit router CIDR blocks are used to assign addresses to network instance connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation is used only to add a CIDR block to a transit router after the transit router is created.
     * Before you create a transit router CIDR block, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support transit router CIDR blocks.</li>
     * <li>For limits on transit router CIDR blocks, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits on transit router CIDR blocks</a>.</li>
     * <li>A maximum of five CIDR blocks can be configured for a transit router. The subnet mask of each CIDR block must be 16 to 24 bits in length.</li>
     * <li>CIDR blocks that fall within 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets are not supported.</li>
     * <li>Each CIDR block cannot conflict with any CIDR block that needs to communicate within the Cloud Enterprise Network (CEN) instance.</li>
     * <li>Each CIDR block must be unique within the same CEN instance.</li>
     * <li>After you add a CIDR block to a transit router, the system automatically reserves three CIDR blocks from the CIDR block when you create the first VPN connection on the transit router. The reserved CIDR blocks are used by the system to create VPN connections in the background. The system assigns IP addresses to IPsec connections from the remaining CIDR blocks.
     *   You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query the CIDR blocks that are reserved by the system or from which IP addresses are allocated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A transit router CIDR block is a custom CIDR block that you define for a transit router, similar to a CIDR block used to assign IP addresses to a router loopback interface. Calls the CreateTransitRouterCidr operation to create a CIDR block for a transit router.</p>
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
     * <ul>
     * <li>Only Enterprise Edition transit routers support ECR connections.</li>
     * <li>You can create an ECR connection on an Enterprise Edition transit router in the following ways: <ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>. </li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>The CreateTransitRouterEcrAttachment operation is asynchronous. After you send a request, the system returns an ECR connection ID but the ECR connection is not yet created. The creation node runs in the background. You can invoke the ListTransitRouterEcrAttachments operation to query the status of the ECR connection. <ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this state, you can only execute query operations on the ECR connection but cannot execute other operations on it. </li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After an ECR connection is created, the ECR connection does not have a routing learning relationship or an associated forwarding relationship with any Enterprise Edition transit router route table by default. 
     * After the ECR connection establishes a <a href="https://help.aliyun.com/document_detail/468300.html">routing learning relationship</a> with an Enterprise Edition transit router route table, the system automatically propagates the routes of the ECR instance to the Enterprise Edition transit router route table.</li>
     * <li>After an ECR connection is created, the system automatically propagates the routes in the Enterprise Edition transit router route table associated with the ECR connection to the route table of the ECR instance.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The Alibaba Cloud account that owns the Enterprise Edition transit router and the Alibaba Cloud account that owns the ECR instance must belong to the same enterprise. </li>
     * <li>Enterprise Edition transit routers support connections to ECR instances that belong to the same account or a different account. Before creating a cross-account ECR connection, obtain authorization from the cross-account ECR instance. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account authorization for network instances</a>.</li>
     * <li><strong>Before invoking this operation to create an ECR connection, invoke the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to associate the ECR instance with the Enterprise Edition transit router instance.</strong>
     * <strong>When you invoke the DeleteTransitRouterEcrAttachment operation to force delete an ECR connection, the system also deletes the association between the ECR instance and the Enterprise Edition transit router instance. You do not need to delete the association separately.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a connection between an Express Connect Router (ECR) instance and a transit router instance in the same region.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterEcrAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support ECR connections.</li>
     * <li>You can create an ECR connection on an Enterprise Edition transit router in the following ways: <ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>. </li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>The CreateTransitRouterEcrAttachment operation is asynchronous. After you send a request, the system returns an ECR connection ID but the ECR connection is not yet created. The creation node runs in the background. You can invoke the ListTransitRouterEcrAttachments operation to query the status of the ECR connection. <ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this state, you can only execute query operations on the ECR connection but cannot execute other operations on it. </li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After an ECR connection is created, the ECR connection does not have a routing learning relationship or an associated forwarding relationship with any Enterprise Edition transit router route table by default. 
     * After the ECR connection establishes a <a href="https://help.aliyun.com/document_detail/468300.html">routing learning relationship</a> with an Enterprise Edition transit router route table, the system automatically propagates the routes of the ECR instance to the Enterprise Edition transit router route table.</li>
     * <li>After an ECR connection is created, the system automatically propagates the routes in the Enterprise Edition transit router route table associated with the ECR connection to the route table of the ECR instance.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The Alibaba Cloud account that owns the Enterprise Edition transit router and the Alibaba Cloud account that owns the ECR instance must belong to the same enterprise. </li>
     * <li>Enterprise Edition transit routers support connections to ECR instances that belong to the same account or a different account. Before creating a cross-account ECR connection, obtain authorization from the cross-account ECR instance. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account authorization for network instances</a>.</li>
     * <li><strong>Before invoking this operation to create an ECR connection, invoke the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to associate the ECR instance with the Enterprise Edition transit router instance.</strong>
     * <strong>When you invoke the DeleteTransitRouterEcrAttachment operation to force delete an ECR connection, the system also deletes the association between the ECR instance and the Enterprise Edition transit router instance. You do not need to delete the association separately.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a connection between an Express Connect Router (ECR) instance and a transit router instance in the same region.</p>
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
     * <p>Before you begin:</p>
     * <ul>
     * <li>Make sure that you have created an Enterprise Edition transit router in the region where you want to establish a multicast network and that you have enabled the multicast feature for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     *   If you created an Enterprise Edition transit router instance before applying for multicast resources, the Enterprise Edition transit router instance does not support the multicast feature. You can delete the current Enterprise Edition transit router instance and create a new one. For information about how to delete an Enterprise Edition transit router instance, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call the <strong>CreateTransitRouterMulticastDomain</strong> operation, if you specify the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify the <strong>TransitRouterId</strong> parameter, you do not need to specify the <strong>CenId</strong> or <strong>RegionId</strong> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast domain. A multicast domain defines the scope of a multicast network within a region. Only resources within the multicast domain can send and receive multicast traffic. Resources outside the multicast domain cannot send or receive multicast traffic.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterMulticastDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Make sure that you have created an Enterprise Edition transit router in the region where you want to establish a multicast network and that you have enabled the multicast feature for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     *   If you created an Enterprise Edition transit router instance before applying for multicast resources, the Enterprise Edition transit router instance does not support the multicast feature. You can delete the current Enterprise Edition transit router instance and create a new one. For information about how to delete an Enterprise Edition transit router instance, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call the <strong>CreateTransitRouterMulticastDomain</strong> operation, if you specify the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify the <strong>TransitRouterId</strong> parameter, you do not need to specify the <strong>CenId</strong> or <strong>RegionId</strong> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a multicast domain. A multicast domain defines the scope of a multicast network within a region. Only resources within the multicast domain can send and receive multicast traffic. Resources outside the multicast domain cannot send or receive multicast traffic.</p>
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
     * <ul>
     * <li>Enterprise Edition transit routers support the following two bandwidth allocation methods:<ul>
     * <li><strong>Allocate from bandwidth package</strong>:
     * To use this method, you must first purchase a bandwidth package and allocate bandwidth from the bandwidth package to the inter-region connection. For more information about how to purchase a bandwidth package, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.</li>
     * <li><strong>Pay-by-data-transfer</strong>:
     * To use this method, you must set a bandwidth limit for the inter-region connection. The system charges you based on the actual traffic of the inter-region connection. For more information about billing, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After you send a request, the system returns an inter-region connection ID, but the inter-region connection is not yet created. The creation task still runs in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After network instances (VPCs, VBRs, and IPsec connections) are connected to a transit router, you must create an inter-region connection between transit routers to enable communication between network instances in different regions. You can call the CreateTransitRouterPeerAttachment operation to create an inter-region connection for an Enterprise Edition transit router instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterPeerAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Enterprise Edition transit routers support the following two bandwidth allocation methods:<ul>
     * <li><strong>Allocate from bandwidth package</strong>:
     * To use this method, you must first purchase a bandwidth package and allocate bandwidth from the bandwidth package to the inter-region connection. For more information about how to purchase a bandwidth package, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.</li>
     * <li><strong>Pay-by-data-transfer</strong>:
     * To use this method, you must set a bandwidth limit for the inter-region connection. The system charges you based on the actual traffic of the inter-region connection. For more information about billing, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After you send a request, the system returns an inter-region connection ID, but the inter-region connection is not yet created. The creation task still runs in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After network instances (VPCs, VBRs, and IPsec connections) are connected to a transit router, you must create an inter-region connection between transit routers to enable communication between network instances in different regions. You can call the CreateTransitRouterPeerAttachment operation to create an inter-region connection for an Enterprise Edition transit router instance.</p>
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
     * <p>Before you associate a prefix list with an Enterprise Edition transit router route table, make sure that the following conditions are met:</p>
     * <ul>
     * <li>You have learned about the limits and routing compatibility information of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>You have created a prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If you want to associate a cross-account prefix list with an Enterprise Edition transit router route table, make sure that the prefix list has been shared with the Alibaba Cloud account that owns the Enterprise Edition transit router route table. For more information about how to share a prefix list, see <a href="https://help.aliyun.com/document_detail/160622.html">Overview of resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API reference (Resource Sharing)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a prefix list with an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterPrefixListAssociationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you associate a prefix list with an Enterprise Edition transit router route table, make sure that the following conditions are met:</p>
     * <ul>
     * <li>You have learned about the limits and routing compatibility information of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>You have created a prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If you want to associate a cross-account prefix list with an Enterprise Edition transit router route table, make sure that the prefix list has been shared with the Alibaba Cloud account that owns the Enterprise Edition transit router route table. For more information about how to share a prefix list, see <a href="https://help.aliyun.com/document_detail/160622.html">Overview of resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API reference (Resource Sharing)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a prefix list with an Enterprise Edition transit router route table.</p>
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
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the system returns a route entry ID but the route entry is not yet created. The creation task continues to run in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. </p>
     * <ul>
     * <li>If the route entry is in the <strong>Creating</strong> state, the route entry is being created. In this state, you can only query the route entry. You cannot perform other operations on the route entry.</li>
     * <li>If the route entry is in the <strong>Active</strong> state, the route entry is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a route table of an Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteEntryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the system returns a route entry ID but the route entry is not yet created. The creation task continues to run in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. </p>
     * <ul>
     * <li>If the route entry is in the <strong>Creating</strong> state, the route entry is being created. In this state, you can only query the route entry. You cannot perform other operations on the route entry.</li>
     * <li>If the route entry is in the <strong>Active</strong> state, the route entry is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a route entry to a route table of an Enterprise Edition transit router.</p>
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
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom route tables. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a>.</li>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a route table ID but the route table is not yet created. The system continues to create the route table in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the route table.<ul>
     * <li>If the route table is in the <strong>Creating</strong> state, the route table is being created. In this state, you can only perform query operations.</li>
     * <li>If the route table is in the <strong>Active</strong> state, the route table is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom route table for an Enterprise Edition transit router by calling the CreateTransitRouterRouteTable operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterRouteTableResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom route tables. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a>.</li>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a route table ID but the route table is not yet created. The system continues to create the route table in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the route table.<ul>
     * <li>If the route table is in the <strong>Creating</strong> state, the route table is being created. In this state, you can only perform query operations.</li>
     * <li>If the route table is in the <strong>Active</strong> state, the route table is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom route table for an Enterprise Edition transit router by calling the CreateTransitRouterRouteTable operation.</p>
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
     * <ul>
     * <li>For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>You can create a VBR connection on an Enterprise Edition transit router in the following ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system automatically creates an Enterprise Edition transit router instance when the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After you send a request, the system returns a VBR connection ID but the VBR connection is not yet created. The creation task runs in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this state, you can only query the VBR connection and cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The Alibaba Cloud account that owns the transit router and the Alibaba Cloud account that owns the VBR instance must belong to the same enterprise.</li>
     * <li>Transit routers support connecting to VBR instances that belong to the same account or a different account. Before creating a cross-account VBR connection, obtain authorization from the VBR instance owner. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant permissions for cross-account network instances</a>.</li>
     * <li>After a VBR connection is created, the VBR connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the CreateTransitRouterVbrAttachment operation to connect a Virtual Border Router (VBR) network instance to a transit router instance in the same region. After the connection is established, the transit router can help you achieve private network peering.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVbrAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>You can create a VBR connection on an Enterprise Edition transit router in the following ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system automatically creates an Enterprise Edition transit router instance when the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After you send a request, the system returns a VBR connection ID but the VBR connection is not yet created. The creation task runs in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this state, you can only query the VBR connection and cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The Alibaba Cloud account that owns the transit router and the Alibaba Cloud account that owns the VBR instance must belong to the same enterprise.</li>
     * <li>Transit routers support connecting to VBR instances that belong to the same account or a different account. Before creating a cross-account VBR connection, obtain authorization from the VBR instance owner. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant permissions for cross-account network instances</a>.</li>
     * <li>After a VBR connection is created, the VBR connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the CreateTransitRouterVbrAttachment operation to connect a Virtual Border Router (VBR) network instance to a transit router instance in the same region. After the connection is established, the transit router can help you achieve private network peering.</p>
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
     * <ul>
     * <li>You can create a VPC connection on an Enterprise Edition transit router in the following two ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateTransitRouterVpcAttachment</strong> operation is asynchronous. After you send a request, the system returns a VPC connection ID, but the VPC connection is not yet created. The creation node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. In this state, you can only execute query operations on the VPC connection but cannot execute other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>After a VPC connection is created, the VPC connection does not establish routing learning or associate forwarding relationships with any transit router routing table by default.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation to create a VPC connection, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VPC instance has at least one vSwitch instance in a zone supported by the Enterprise Edition transit router, and the vSwitch instance has at least one idle IP address. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>If you want to connect a cross-account VPC-connected instance, obtain the cross-account VPC-connected instance authorization first. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account VPC-connected instance authorization</a>.</li>
     * <li>Fees are incurred after a VPC connection is created. Make sure that you understand the billing rules. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateTransitRouterVpcAttachment operation to connect a Virtual Private Cloud (VPC) instance to a transit router instance for private network peering. After the connection is established, the transit router instance can help you achieve private network peering.</p>
     * 
     * @param tmpReq CreateTransitRouterVpcAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTransitRouterVpcAttachmentResponse
     */
    public CreateTransitRouterVpcAttachmentResponse createTransitRouterVpcAttachmentWithOptions(CreateTransitRouterVpcAttachmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTransitRouterVpcAttachmentShrinkRequest request = new CreateTransitRouterVpcAttachmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "Options", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("Options", request.optionsShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVpcAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create a VPC connection on an Enterprise Edition transit router in the following two ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateTransitRouterVpcAttachment</strong> operation is asynchronous. After you send a request, the system returns a VPC connection ID, but the VPC connection is not yet created. The creation node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. In this state, you can only execute query operations on the VPC connection but cannot execute other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>After a VPC connection is created, the VPC connection does not establish routing learning or associate forwarding relationships with any transit router routing table by default.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation to create a VPC connection, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VPC instance has at least one vSwitch instance in a zone supported by the Enterprise Edition transit router, and the vSwitch instance has at least one idle IP address. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>If you want to connect a cross-account VPC-connected instance, obtain the cross-account VPC-connected instance authorization first. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account VPC-connected instance authorization</a>.</li>
     * <li>Fees are incurred after a VPC connection is created. Make sure that you understand the billing rules. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateTransitRouterVpcAttachment operation to connect a Virtual Private Cloud (VPC) instance to a transit router instance for private network peering. After the connection is established, the transit router instance can help you achieve private network peering.</p>
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
     * <ul>
     * <li>After a VPN connection is created, the VPN connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * <li>When you call the <code>CreateTransitRouterVpnAttachment</code> operation, if you specify values for the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify values for the <strong>TransitRouterId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>CenId</strong> parameter.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you create a VPN connection, make sure that you have created an IPsec connection in the region where the transit router instance resides and that the IPsec connection is not bindeded to any resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the transit router instance needs to connect to an IPsec connection that belongs to a different Alibaba Cloud account, make sure that the IPsec connection has been authorized to the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
     * <li>Before you create a VPN connection, make sure that you have configured the TR CIDR block for the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/468230.html">CreateTransitRouterCidr</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transit routers support connections to IPsec connections of VPN gateways. An on-premises data center can directly connect to a transit router through an IPsec connection, and then communicate with other networks through the transit router. Calls the CreateTransitRouterVpnAttachment operation to create a VPN connection.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransitRouterVpnAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After a VPN connection is created, the VPN connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * <li>When you call the <code>CreateTransitRouterVpnAttachment</code> operation, if you specify values for the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify values for the <strong>TransitRouterId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>CenId</strong> parameter.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you create a VPN connection, make sure that you have created an IPsec connection in the region where the transit router instance resides and that the IPsec connection is not bindeded to any resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the transit router instance needs to connect to an IPsec connection that belongs to a different Alibaba Cloud account, make sure that the IPsec connection has been authorized to the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
     * <li>Before you create a VPN connection, make sure that you have configured the TR CIDR block for the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/468230.html">CreateTransitRouterCidr</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Transit routers support connections to IPsec connections of VPN gateways. An on-premises data center can directly connect to a transit router through an IPsec connection, and then communicate with other networks through the transit router. Calls the CreateTransitRouterVpnAttachment operation to create a VPN connection.</p>
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
     * <p>The <code>DeactiveFlowLog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deactivated. The deactivation task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being deactivated. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Inactive</strong> state, the flow log is deactivated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deactivates a flow log. After the flow log is deactivated, traffic of the specified resource is no longer captured.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveFlowLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>DeactiveFlowLog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deactivated. The deactivation task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being deactivated. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Inactive</strong> state, the flow log is deactivated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deactivates a flow log. After the flow log is deactivated, traffic of the specified resource is no longer captured.</p>
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
     * <p><em>DeleteCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this state, you can only query the CEN instance. You cannot perform other operations on it.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a CEN instance, make sure that no bandwidth plans exist under the CEN instance, and that no network instance connections or custom route tables exist under the transit routers of the CEN instance:</p>
     * <ul>
     * <li>To delete network instance connections, see:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>To delete network instance connections under a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>To delete custom route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>To disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this state, you can only query the CEN instance. You cannot perform other operations on it.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a CEN instance, make sure that no bandwidth plans exist under the CEN instance, and that no network instance connections or custom route tables exist under the transit routers of the CEN instance:</p>
     * <ul>
     * <li>To delete network instance connections, see:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>To delete network instance connections under a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>To delete custom route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>To disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * <li>To delete a bandwidth plan instance whose billing method is PREPAY (subscription), go to the <a href="https://usercenter2.aliyun.com/refund/refund">Order Center</a> to unsubscribe. If you have questions about unsubscription, see <a href="https://www.alibabacloud.com/help/en/user-center/user-guide/unsubscription-rules#p-1qo-3ce-m7z">Unsubscription rules</a>. This operation does not support deleting subscription bandwidth plan instances.
     * &lt;props=&quot;intl&quot;&gt;
     * Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bandwidth plan instance by calling the DeleteCenBandwidthPackage operation.</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * <li>To delete a bandwidth plan instance whose billing method is PREPAY (subscription), go to the <a href="https://usercenter2.aliyun.com/refund/refund">Order Center</a> to unsubscribe. If you have questions about unsubscription, see <a href="https://www.alibabacloud.com/help/en/user-center/user-guide/unsubscription-rules#p-1qo-3ce-m7z">Unsubscription rules</a>. This operation does not support deleting subscription bandwidth plan instances.
     * &lt;props=&quot;intl&quot;&gt;
     * Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bandwidth plan instance by calling the DeleteCenBandwidthPackage operation.</p>
     * 
     * @param request DeleteCenBandwidthPackageRequest
     * @return DeleteCenBandwidthPackageResponse
     */
    public DeleteCenBandwidthPackageResponse deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only route entries whose next hop is a <strong>transit router connection</strong> (network instance connection) in Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances can be deleted.</li>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the specified route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route entry from a network instance connected to an Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only route entries whose next hop is a <strong>transit router connection</strong> (network instance connection) in Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances can be deleted.</li>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the specified route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route entry from a network instance connected to an Enterprise Edition transit router.</p>
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
     * <ul>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation does not support deleting route entries from network instances attached to an Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route entry from a network instance by calling the DeleteCenChildInstanceRouteEntryToCen operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenChildInstanceRouteEntryToCenResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation does not support deleting route entries from network instances attached to an Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a route entry from a network instance by calling the DeleteCenChildInstanceRouteEntryToCen operation.</p>
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
     * <ul>
     * <li>Before you delete a traffic scheduling policy, you must delete all queues except the default queue from the traffic scheduling policy. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic scheduling policy is not yet deleted. The deletion task runs in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Deleting</strong> state, the traffic scheduling policy is being deleted. In this state, you can only query the traffic scheduling policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy cannot be found, the traffic scheduling policy is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a traffic scheduling policy by calling the DeleteCenInterRegionTrafficQosPolicy operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you delete a traffic scheduling policy, you must delete all queues except the default queue from the traffic scheduling policy. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic scheduling policy is not yet deleted. The deletion task runs in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Deleting</strong> state, the traffic scheduling policy is being deleted. In this state, you can only query the traffic scheduling policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy cannot be found, the traffic scheduling policy is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a traffic scheduling policy by calling the DeleteCenInterRegionTrafficQosPolicy operation.</p>
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
     * <ul>
     * <li>The default queue cannot be deleted.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the queue is not yet deleted because the deletion task is still running in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the queue information. If the specified queue cannot be found, the queue is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a queue from a traffic scheduling policy by calling the DeleteCenInterRegionTrafficQosQueue operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenInterRegionTrafficQosQueueResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The default queue cannot be deleted.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the queue is not yet deleted because the deletion task is still running in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the queue information. If the specified queue cannot be found, the queue is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a queue from a traffic scheduling policy by calling the DeleteCenInterRegionTrafficQosQueue operation.</p>
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
     * <p>DeleteCenRouteMap is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy is not yet fully deleted because the deletion task is still running in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the routing policy cannot be found by calling the <code>DescribeCenRouteMaps</code> operation, the routing policy is fully deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified routing policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCenRouteMapResponse());
    }

    /**
     * <b>description</b> :
     * <p>DeleteCenRouteMap is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy is not yet fully deleted because the deletion task is still running in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the routing policy cannot be found by calling the <code>DescribeCenRouteMaps</code> operation, the routing policy is fully deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified routing policy.</p>
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
     * <p>The <code>DeleteFlowlog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deleted. The deletion task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this state, you can only perform query operations but cannot perform other operations.</li>
     * <li>If the <code>DescribeFlowlogs</code> operation cannot find the flow log, the flow log is completely deleted.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>DeleteFlowlog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deleted. The deletion task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this state, you can only perform query operations but cannot perform other operations.</li>
     * <li>If the <code>DescribeFlowlogs</code> operation cannot find the flow log, the flow log is completely deleted.</li>
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
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the operation continues in the background. The system returns a request ID even if you specify an invalid parameter. In this case, the Alibaba Cloud service configuration is not deleted. You can call the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the Alibaba Cloud service.</p>
     * <ul>
     * <li>If the Alibaba Cloud service is in the <strong>Deleting</strong> state, you can only query its configuration. You cannot perform other operations.</li>
     * <li>If the specified Alibaba Cloud service configuration is not found, the configuration has been deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the DeleteRouteServiceInCen operation to delete the configuration of an Alibaba Cloud service from a Basic Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteServiceInCenResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the operation continues in the background. The system returns a request ID even if you specify an invalid parameter. In this case, the Alibaba Cloud service configuration is not deleted. You can call the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the Alibaba Cloud service.</p>
     * <ul>
     * <li>If the Alibaba Cloud service is in the <strong>Deleting</strong> state, you can only query its configuration. You cannot perform other operations.</li>
     * <li>If the specified Alibaba Cloud service configuration is not found, the configuration has been deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the DeleteRouteServiceInCen operation to delete the configuration of an Alibaba Cloud service from a Basic Edition transit router.</p>
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
     * <ul>
     * <li><strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic marking policy is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. In this state, you can only query the traffic marking policy but cannot perform other operations on it.</li>
     * <li>If the specified traffic marking policy cannot be found, the traffic marking policy is deleted.</li>
     * </ul>
     * </li>
     * <li>Before you delete a traffic marking policy, delete all traffic classification rules from the traffic marking policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a traffic marking policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic marking policy is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. In this state, you can only query the traffic marking policy but cannot perform other operations on it.</li>
     * <li>If the specified traffic marking policy cannot be found, the traffic marking policy is deleted.</li>
     * </ul>
     * </li>
     * <li>Before you delete a traffic marking policy, delete all traffic classification rules from the traffic marking policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a traffic marking policy.</p>
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
     * <ul>
     * <li>Before you delete an aggregate route, make sure that redundant routes exist in the current network. Otherwise, service breaks may occur.</li>
     * <li>After you delete an aggregate route, the system automatically withdraws the aggregate routing that has been propagated to Virtual Private Cloud (VPC)-connected instances and re-propagates the specific routes within the destination CIDR block of the aggregation route to the VPC-connected instances.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouteTableAggregationResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you delete an aggregate route, make sure that redundant routes exist in the current network. Otherwise, service breaks may occur.</li>
     * <li>After you delete an aggregate route, the system automatically withdraws the aggregate routing that has been propagated to Virtual Private Cloud (VPC)-connected instances and re-propagates the specific routes within the destination CIDR block of the aggregation route to the VPC-connected instances.</li>
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
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the transit router instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Deleting</strong> state, the transit router instance is being deleted. In this state, you can only query the transit router instance. You cannot perform other operations on the transit router instance.</li>
     * <li>If the transit router instance cannot be found, the transit router instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a transit router instance, make sure that the following conditions are met:</p>
     * <ul>
     * <li>No connections exist on the transit router instance.<ul>
     * <li>To delete a Virtual Private Cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete an Express Connect Router (ECR) connection, see <a href="https://help.aliyun.com/document_detail/2715447.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * <li>To delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * <li>To delete a Virtual Border Router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * </ul>
     * </li>
     * <li>No custom route tables exist on the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>No custom route entries, route prefixes, or aggregate routes exist in the default route table of the transit router instance. For more information, see<ul>
     * <li>To delete custom route entries of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468291.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>To disassociate a prefix list, see <a href="https://help.aliyun.com/document_detail/468312.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>To delete an aggregate route, see <a href="https://help.aliyun.com/document_detail/476070.html">DeleteTransitRouteTableAggregation</a>.</li>
     * </ul>
     * </li>
     * <li>No multicast domains exist on the transit router instance. To delete a multicast domain, see <a href="https://help.aliyun.com/document_detail/468386.html">DeleteTransitRouterMulticastDomain</a>.</li>
     * <li>No traffic marking policies exist on the transit router instance. To delete a traffic marking policy, see <a href="https://help.aliyun.com/document_detail/468324.html">DeleteTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouter operation to delete an Enterprise Edition transit router instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the transit router instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Deleting</strong> state, the transit router instance is being deleted. In this state, you can only query the transit router instance. You cannot perform other operations on the transit router instance.</li>
     * <li>If the transit router instance cannot be found, the transit router instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a transit router instance, make sure that the following conditions are met:</p>
     * <ul>
     * <li>No connections exist on the transit router instance.<ul>
     * <li>To delete a Virtual Private Cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete an Express Connect Router (ECR) connection, see <a href="https://help.aliyun.com/document_detail/2715447.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * <li>To delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * <li>To delete a Virtual Border Router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * </ul>
     * </li>
     * <li>No custom route tables exist on the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>No custom route entries, route prefixes, or aggregate routes exist in the default route table of the transit router instance. For more information, see<ul>
     * <li>To delete custom route entries of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468291.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>To disassociate a prefix list, see <a href="https://help.aliyun.com/document_detail/468312.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>To delete an aggregate route, see <a href="https://help.aliyun.com/document_detail/476070.html">DeleteTransitRouteTableAggregation</a>.</li>
     * </ul>
     * </li>
     * <li>No multicast domains exist on the transit router instance. To delete a multicast domain, see <a href="https://help.aliyun.com/document_detail/468386.html">DeleteTransitRouterMulticastDomain</a>.</li>
     * <li>No traffic marking policies exist on the transit router instance. To delete a traffic marking policy, see <a href="https://help.aliyun.com/document_detail/468324.html">DeleteTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouter operation to delete an Enterprise Edition transit router instance.</p>
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
     * <p>A transit router CIDR block that has allocated IP addresses cannot be deleted.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterCidrResponse());
    }

    /**
     * <b>description</b> :
     * <p>A transit router CIDR block that has allocated IP addresses cannot be deleted.</p>
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
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After you call this operation, the system returns a RequestId, but the ECR connection is not immediately deleted. The deletion task runs in the background. You can call the <a href="~~2361China~~">ListTransitRouterEcrAttachments</a> operation to query the status of the ECR connection.
     * If the ECR connection is in the <strong>Detaching</strong> state, the ECR connection is being deleted. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the specified ECR connection cannot be found, the ECR connection is deleted.
     * When you call the DeleteTransitRouterEcrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the ECR connection from the Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterEcrAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After you call this operation, the system returns a RequestId, but the ECR connection is not immediately deleted. The deletion task runs in the background. You can call the <a href="~~2361China~~">ListTransitRouterEcrAttachments</a> operation to query the status of the ECR connection.
     * If the ECR connection is in the <strong>Detaching</strong> state, the ECR connection is being deleted. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the specified ECR connection cannot be found, the ECR connection is deleted.
     * When you call the DeleteTransitRouterEcrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the ECR connection from the Enterprise Edition transit router.</p>
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
     * <p>Before you delete a multicast domain, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The multicast domain is not associated with any vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>No multicast sources or multicast members exist in the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not associated with other multicast domains as a multicast member. You can delete the multicast member from other multicast domains to dissociate the other multicast domains from the current multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure that the parameter values you specify are valid when you call this operation. If you specify invalid parameter values, the system still returns a RequestId but does not delete the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast domain by calling the DeleteTransitRouterMulticastDomain operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterMulticastDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a multicast domain, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The multicast domain is not associated with any vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>No multicast sources or multicast members exist in the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not associated with other multicast domains as a multicast member. You can delete the multicast member from other multicast domains to dissociate the other multicast domains from the current multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure that the parameter values you specify are valid when you call this operation. If you specify invalid parameter values, the system still returns a RequestId but does not delete the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a multicast domain by calling the DeleteTransitRouterMulticastDomain operation.</p>
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
     * <p>The <strong>DeleteTransitRouterPeerAttachment</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the specified inter-region connection cannot be found, the inter-region connection is deleted.
     * When calling the <strong>DeleteTransitRouterPeerAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the inter-region connection from the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterPeerAttachment operation to delete an inter-region connection from an Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterPeerAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteTransitRouterPeerAttachment</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the specified inter-region connection cannot be found, the inter-region connection is deleted.
     * When calling the <strong>DeleteTransitRouterPeerAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the inter-region connection from the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterPeerAttachment operation to delete an inter-region connection from an Enterprise Edition transit router.</p>
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
     * <blockquote>
     * <p>Warning: After a prefix list is dissociated from an Enterprise Edition transit router route table, the system automatically withdraws all route entries related to the prefix list from the Enterprise Edition transit router route table. Before dissociating the prefix list, make sure that redundant routes exist in the Enterprise Edition transit router route table. Otherwise, network interruptions may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a prefix list from an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterPrefixListAssociationResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After a prefix list is dissociated from an Enterprise Edition transit router route table, the system automatically withdraws all route entries related to the prefix list from the Enterprise Edition transit router route table. Before dissociating the prefix list, make sure that redundant routes exist in the Enterprise Edition transit router route table. Otherwise, network interruptions may occur.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a prefix list from an Enterprise Edition transit router route table.</p>
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
     * <p>Before you call this operation to delete a route entry, take note of the following information:</p>
     * <ul>
     * <li>If you specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, you do not need to specify <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, a parameter conflict error occurs.</li>
     * <li>If you do not specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, specify the corresponding parameters based on the next hop type of the route entry:<ul>
     * <li>To delete a blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete a non-blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Limits</h3>
     * <p>This operation can delete only static route entries. Automatically learned route entries cannot be deleted. You can call <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> to query the type of a route entry.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterRouteEntry operation to delete static route entries of the blackhole or connection instance type from an Enterprise Edition transit router forward route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteEntryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete a route entry, take note of the following information:</p>
     * <ul>
     * <li>If you specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, you do not need to specify <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, a parameter conflict error occurs.</li>
     * <li>If you do not specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, specify the corresponding parameters based on the next hop type of the route entry:<ul>
     * <li>To delete a blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete a non-blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Limits</h3>
     * <p>This operation can delete only static route entries. Automatically learned route entries cannot be deleted. You can call <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> to query the type of a route entry.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterRouteEntry operation to delete static route entries of the blackhole or connection instance type from an Enterprise Edition transit router forward route table.</p>
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
     * <ul>
     * <li>The default route table of an Enterprise Edition transit router cannot be deleted.</li>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the custom route table is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the custom route table. <ul>
     * <li>If the custom route table is in the Deleting state, the custom route table is being deleted. In this state, you can only query the custom route table but cannot perform other operations on it.</li>
     * <li>If the custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom route table from an Enterprise Edition transit router by calling the DeleteTransitRouterRouteTable operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterRouteTableResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The default route table of an Enterprise Edition transit router cannot be deleted.</li>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the custom route table is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the custom route table. <ul>
     * <li>If the custom route table is in the Deleting state, the custom route table is being deleted. In this state, you can only query the custom route table but cannot perform other operations on it.</li>
     * <li>If the custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom route table from an Enterprise Edition transit router by calling the DeleteTransitRouterRouteTable operation.</p>
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
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. In this state, you can only query the VBR connection but cannot perform other operations on it.</li>
     * <li>If the specified VBR connection cannot be found, the VBR connection is deleted.
     * When calling the DeleteTransitRouterVbrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the VBR connection from the Enterprise Edition transit router.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVbrAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. In this state, you can only query the VBR connection but cannot perform other operations on it.</li>
     * <li>If the specified VBR connection cannot be found, the VBR connection is deleted.
     * When calling the DeleteTransitRouterVbrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the VBR connection from the Enterprise Edition transit router.</li>
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
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. In this state, you can only query the VPC connection. You cannot perform other operations on the VPC connection.</li>
     * <li>If the VPC connection cannot be found, the VPC connection is deleted.
     * When you call <strong>DeleteTransitRouterVpcAttachment</strong>, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPC connection from the Enterprise Edition transit router.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a VPC connection, make sure that you have not configured a routing rule to access PrivateZone by using the VPC-connected instance. To delete the routing rule to PrivateZone, see <a href="https://help.aliyun.com/document_detail/468375.html">UnroutePrivateZoneInCenToVpc</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterVpcAttachment operation to delete a virtual private cloud (VPC) connection from an Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVpcAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. In this state, you can only query the VPC connection. You cannot perform other operations on the VPC connection.</li>
     * <li>If the VPC connection cannot be found, the VPC connection is deleted.
     * When you call <strong>DeleteTransitRouterVpcAttachment</strong>, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPC connection from the Enterprise Edition transit router.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a VPC connection, make sure that you have not configured a routing rule to access PrivateZone by using the VPC-connected instance. To delete the routing rule to PrivateZone, see <a href="https://help.aliyun.com/document_detail/468375.html">UnroutePrivateZoneInCenToVpc</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeleteTransitRouterVpcAttachment operation to delete a virtual private cloud (VPC) connection from an Enterprise Edition transit router.</p>
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
     * <p>When you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPN connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPN connection by calling the DeleteTransitRouterVpnAttachment operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTransitRouterVpnAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPN connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a VPN connection by calling the DeleteTransitRouterVpnAttachment operation.</p>
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
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast member is not immediately removed. The removal task continues to run in the background. You can call <code>ListTransitRouterMulticastGroups</code> to query the status of the multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this state, you can only query the multicast member but cannot perform other operations on it.</li>
     * <li>If the multicast member cannot be found in the multicast domain when you call the <code>ListTransitRouterMulticastGroups</code> operation, the multicast member has been removed.
     * When you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not remove the multicast member.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast member from a multicast group if the member no longer needs to receive multicast traffic by calling the DeregisterTransitRouterMulticastGroupMembers operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterTransitRouterMulticastGroupMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast member is not immediately removed. The removal task continues to run in the background. You can call <code>ListTransitRouterMulticastGroups</code> to query the status of the multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this state, you can only query the multicast member but cannot perform other operations on it.</li>
     * <li>If the multicast member cannot be found in the multicast domain when you call the <code>ListTransitRouterMulticastGroups</code> operation, the multicast member has been removed.
     * When you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not remove the multicast member.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast member from a multicast group if the member no longer needs to receive multicast traffic by calling the DeregisterTransitRouterMulticastGroupMembers operation.</p>
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
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast source is not immediately deleted. The deletion task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source.</p>
     * <ul>
     * <li>If the multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. In this state, you can only query the multicast source but cannot perform other operations on it.</li>
     * <li>If the <code>ListTransitRouterMulticastGroups</code> operation cannot find the multicast source in the multicast domain, the multicast source has been deleted.
     * When you call the DeregisterTransitRouterMulticastGroupSources operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the multicast source.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast source from a multicast group if you no longer need the multicast source to send multicast traffic.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterTransitRouterMulticastGroupSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast source is not immediately deleted. The deletion task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source.</p>
     * <ul>
     * <li>If the multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. In this state, you can only query the multicast source but cannot perform other operations on it.</li>
     * <li>If the <code>ListTransitRouterMulticastGroups</code> operation cannot find the multicast source in the multicast domain, the multicast source has been deleted.
     * When you call the DeregisterTransitRouterMulticastGroupSources operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the multicast source.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a multicast source from a multicast group if you no longer need the multicast source to send multicast traffic.</p>
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
     * <p>Queries the details of a network instance (VPC, VBR, or CCN) attached to a Cloud Enterprise Network (CEN) instance, including the attachment status and network instance type.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a network instance (VPC, VBR, or CCN) attached to a Cloud Enterprise Network (CEN) instance, including the attachment status and network instance type.</p>
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
     * <p>You can use this operation to query network instances attached to a CEN instance in the following ways:</p>
     * <ul>
     * <li>Specify <code>CenId</code> to query all network instances attached to the CEN instance.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceRegionId</code> to query network instances attached to the CEN instance in a specific region.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceType</code> to query network instances of a specific type attached to the CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about network instances attached to a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenAttachedChildInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query network instances attached to a CEN instance in the following ways:</p>
     * <ul>
     * <li>Specify <code>CenId</code> to query all network instances attached to the CEN instance.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceRegionId</code> to query network instances attached to the CEN instance in a specific region.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceType</code> to query network instances of a specific type attached to the CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about network instances attached to a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries information about bandwidth package instances by calling the DescribeCenBandwidthPackages operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenBandwidthPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about bandwidth package instances by calling the DescribeCenBandwidthPackages operation.</p>
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
     * <p>Invokes the DescribeCenChildInstanceRouteEntries operation to query the route entries of a network instance in a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenChildInstanceRouteEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes the DescribeCenChildInstanceRouteEntries operation to query the route entries of a network instance in a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries the remaining bandwidth of a specified bandwidth plan instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpanRemainingBandwidthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the remaining bandwidth of a specified bandwidth plan instance.</p>
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
     * <p>Queries information about connected areas supported by Cloud Enterprise Network (CEN) by calling the DescribeCenGeographicSpans operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenGeographicSpansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about connected areas supported by Cloud Enterprise Network (CEN) by calling the DescribeCenGeographicSpans operation.</p>
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
     * <p>Queries the inter-region bandwidth information between regions by calling the DescribeCenInterRegionBandwidthLimits operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenInterRegionBandwidthLimitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the inter-region bandwidth information between regions by calling the DescribeCenInterRegionBandwidthLimits operation.</p>
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
     * <p>Queries the PrivateZone service configuration of a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenPrivateZoneRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the PrivateZone service configuration of a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries the details of route entries in a specific region of a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRegionDomainRouteEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of route entries in a specific region of a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries the configured information in route maps by calling the DescribeCenRouteMaps operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenRouteMapsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configured information in route maps by calling the DescribeCenRouteMaps operation.</p>
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
     * <p>Queries health check information about virtual border routers (VBRs) in a specified region.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCenVbrHealthCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health check information about virtual border routers (VBRs) in a specified region.</p>
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
     * <p>Queries information about Cloud Enterprise Network (CEN) instances under the current Alibaba Cloud account, including the instance status, whether IPv6 is enabled, and the list of bandwidth packages associated with the instances.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Cloud Enterprise Network (CEN) instances under the current Alibaba Cloud account, including the instance status, whether IPv6 is enabled, and the list of bandwidth packages associated with the instances.</p>
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
     * <p>CEN supports different regions for different network instance types. You can specify the ProductType parameter to query the regions supported by CEN for a specific network instance type. If you do not specify the ProductType parameter, the system queries the regions supported by CEN for all network instance types by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions that support network instances loaded to Cloud Enterprise Network (CEN).</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChildInstanceRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>CEN supports different regions for different network instance types. You can specify the ProductType parameter to query the regions supported by CEN for a specific network instance type. If you do not specify the ProductType parameter, the system queries the regions supported by CEN for all network instance types by default.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions that support network instances loaded to Cloud Enterprise Network (CEN).</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowlogsResponse());
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
     * <p>Queries region information within a specified area.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGeographicRegionMembershipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries region information within a specified area.</p>
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
     * <p>When you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, a <strong>RequestId</strong> is still returned, but information about the cross-account network instances authorized to the CEN instance is not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about cross-account network instances that are authorized to be associated with a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesToCenResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, a <strong>RequestId</strong> is still returned, but information about the cross-account network instances authorized to the CEN instance is not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about cross-account network instances that are authorized to be associated with a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries the authorization information of a network instance for a cross-account Cloud Enterprise Network (CEN) instance, including the Alibaba Cloud account ID of the CEN instance owner and the payer of the network instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGrantRulesToResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the authorization information of a network instance for a cross-account Cloud Enterprise Network (CEN) instance, including the Alibaba Cloud account ID of the CEN instance owner and the payer of the network instance.</p>
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
     * <p>Queries the publish status, next hop associated instance type, and whether publishing or withdrawing is allowed for route entries of network instances (VPCs and VBRs) that are loaded into a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublishedRouteEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the publish status, next hop associated instance type, and whether publishing or withdrawing is allowed for route entries of network instances (VPCs and VBRs) that are loaded into a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>Queries information about conflicting route entries in a network instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteConflictResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about conflicting route entries in a network instance.</p>
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
     * <p>Queries the cloud service configurations under a Basic Edition transit router by calling the DescribeRouteServicesInCen operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRouteServicesInCenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud service configurations under a Basic Edition transit router by calling the DescribeRouteServicesInCen operation.</p>
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
     * <p>You can specify the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to query information about a specific aggregate route. If you specify only the <strong>TransitRouteTableId</strong> parameter, the system queries information about all aggregate routes in the specified Enterprise Edition transit router route table.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries aggregate routes in an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransitRouteTableAggregationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can specify the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to query information about a specific aggregate route. If you specify only the <strong>TransitRouteTableId</strong> parameter, the system queries information about all aggregate routes in the specified Enterprise Edition transit router route table.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries aggregate routes in an Enterprise Edition transit router route table.</p>
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
     * <p>Queries the configuration details of a specified aggregate route.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransitRouteTableAggregationDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration details of a specified aggregate route.</p>
     * 
     * @param request DescribeTransitRouteTableAggregationDetailRequest
     * @return DescribeTransitRouteTableAggregationDetailResponse
     */
    public DescribeTransitRouteTableAggregationDetailResponse describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransitRouteTableAggregationDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The <strong>DetachCenChildInstance</strong> operation supports detaching only network instances from a Basic Edition transit router.</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCenChildInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <strong>DetachCenChildInstance</strong> operation supports detaching only network instances from a Basic Edition transit router.</p>
     * 
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
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong>, but the health check configuration has not been deleted. The deletion task continues to run in the background. You can call <strong>DescribeCenVbrHealthCheck</strong> to query the health check configuration. If the specified health check configuration is not found, the deletion is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables health checks for a specified virtual border router (VBR).</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCenVbrHealthCheckResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong>, but the health check configuration has not been deleted. The deletion task continues to run in the background. You can call <strong>DescribeCenVbrHealthCheck</strong> to query the health check configuration. If the specified health check configuration is not found, the deletion is complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables health checks for a specified virtual border router (VBR).</p>
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
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> before the route learning relationship between the network instance connection and the route table is fully removed. The removal task continues to run in the background. You can call <strong>ListTransitRouterRouteTablePropagations</strong> to query the route learning relationship between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the route learning relationship is in the <strong>Disabling</strong> state, the network instance connection and the route table are being disassociated. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the route learning relationship between the network instance connection and the route table, the route learning relationship is successfully removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables route learning between a network instance connection and a transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTransitRouterRouteTablePropagationResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> before the route learning relationship between the network instance connection and the route table is fully removed. The removal task continues to run in the background. You can call <strong>ListTransitRouterRouteTablePropagations</strong> to query the route learning relationship between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the route learning relationship is in the <strong>Disabling</strong> state, the network instance connection and the route table are being disassociated. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the route learning relationship between the network instance connection and the route table, the route learning relationship is successfully removed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables route learning between a network instance connection and a transit router route table.</p>
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
     * <ul>
     * <li>Before dissociating a vSwitch from a multicast domain, make sure that no multicast sources or multicast members exist under the vSwitch. To delete multicast sources and multicast members, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>If you specify invalid parameters, the system still returns a RequestId but does not dissociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you invoke this operation, the system returns a <strong>RequestId</strong> but the dissociation has not yet completed. The dissociation node continues to run in the background. You can invoke <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the associate status between the vSwitch and the multicast domain.<ul>
     * <li>If the associate status is <strong>Dissociating</strong>, the vSwitch is being dissociated from the multicast domain. In this state, you can only execute query operations on the vSwitch but cannot execute other operations.</li>
     * <li>If the vSwitch information cannot be found under the multicast domain, the vSwitch has been successfully dissociated from the multicast domain.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateTransitRouterMulticastDomainResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before dissociating a vSwitch from a multicast domain, make sure that no multicast sources or multicast members exist under the vSwitch. To delete multicast sources and multicast members, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>If you specify invalid parameters, the system still returns a RequestId but does not dissociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you invoke this operation, the system returns a <strong>RequestId</strong> but the dissociation has not yet completed. The dissociation node continues to run in the background. You can invoke <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the associate status between the vSwitch and the multicast domain.<ul>
     * <li>If the associate status is <strong>Dissociating</strong>, the vSwitch is being dissociated from the multicast domain. In this state, you can only execute query operations on the vSwitch but cannot execute other operations.</li>
     * <li>If the vSwitch information cannot be found under the multicast domain, the vSwitch has been successfully dissociated from the multicast domain.</li>
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
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the dissociation between the network instance connection and the route table is not complete. The dissociation task continues to run in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the association status is <strong>Dissociating</strong>, the network instance connection is being dissociated from the route table. In this state, you can only query the forwarding association between the network instance connection and the route table. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the forwarding association between the network instance connection and the route table, the dissociation is successful.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a network instance connection from a route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateTransitRouterAttachmentFromRouteTableResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the dissociation between the network instance connection and the route table is not complete. The dissociation task continues to run in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the association status is <strong>Dissociating</strong>, the network instance connection is being dissociated from the route table. In this state, you can only query the forwarding association between the network instance connection and the route table. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the forwarding association between the network instance connection and the route table, the dissociation is successful.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a network instance connection from a route table.</p>
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
     * <p>You can configure health checks for a VBR instance to monitor the connectivity of the physical Express Connect circuit between your on-premises data center and Alibaba Cloud, so that issues can be detected promptly.
     * Before using the health check feature, note the following information:</p>
     * <ul>
     * <li>If your VBR instance uses static routing, after you configure the health check, you must add a static route entry in the on-premises data center connected to the VBR instance.
     *   The destination CIDR block of the static route is the source IP address of the health check with a 32-bit subnet mask, and the next hop is the Alibaba Cloud-side IP address of the VBR instance.</li>
     * <li>If your border router instance uses the BGP dynamic routing protocol, you do not need to add a route entry in the on-premises data center.</li>
     * <li>The <strong>EnableCenVbrHealthCheck</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the health check instance is not yet created or modified. The creation or modification task continues to run in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the health check configuration. If the health check configuration is returned, the health check has been created or modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the health check feature for a virtual border router (VBR) to detect faults on physical Express Connect circuits in a timely manner. You can also use this operation to modify the health check configuration of a VBR.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCenVbrHealthCheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can configure health checks for a VBR instance to monitor the connectivity of the physical Express Connect circuit between your on-premises data center and Alibaba Cloud, so that issues can be detected promptly.
     * Before using the health check feature, note the following information:</p>
     * <ul>
     * <li>If your VBR instance uses static routing, after you configure the health check, you must add a static route entry in the on-premises data center connected to the VBR instance.
     *   The destination CIDR block of the static route is the source IP address of the health check with a 32-bit subnet mask, and the next hop is the Alibaba Cloud-side IP address of the VBR instance.</li>
     * <li>If your border router instance uses the BGP dynamic routing protocol, you do not need to add a route entry in the on-premises data center.</li>
     * <li>The <strong>EnableCenVbrHealthCheck</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the health check instance is not yet created or modified. The creation or modification task continues to run in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the health check configuration. If the health check configuration is returned, the health check has been created or modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the health check feature for a virtual border router (VBR) to detect faults on physical Express Connect circuits in a timely manner. You can also use this operation to modify the health check configuration of a VBR.</p>
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
     * <p>After you create a network instance connection, you can set up a route learning relationship for it. Once configured, the network instance connection automatically propagates routes from the network instance to its associated route table. Before calling this operation to create a route learning relationship, note the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating route learning relationships. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>The <strong>EnableTransitRouterRouteTablePropagation</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the route learning relationship between the network instance connection and the route table is not fully established. The creation task is still running in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning relationship between the network instance connection and the route table.<ul>
     * <li>If the route learning relationship is in the <strong>Enabling</strong> state, the route learning relationship between the network instance connection and the route table is being established. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the route learning relationship is in the <strong>Active</strong> state, the route learning relationship between the network instance connection and the route table is established.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route learning relationship.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTransitRouterRouteTablePropagationResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you can set up a route learning relationship for it. Once configured, the network instance connection automatically propagates routes from the network instance to its associated route table. Before calling this operation to create a route learning relationship, note the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating route learning relationships. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>The <strong>EnableTransitRouterRouteTablePropagation</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the route learning relationship between the network instance connection and the route table is not fully established. The creation task is still running in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning relationship between the network instance connection and the route table.<ul>
     * <li>If the route learning relationship is in the <strong>Enabling</strong> state, the route learning relationship between the network instance connection and the route table is being established. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the route learning relationship is in the <strong>Active</strong> state, the route learning relationship between the network instance connection and the route table is established.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a route learning relationship.</p>
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
     * <ul>
     * <li><p>The GrantInstanceToTransitRouter operation only supports granting a transit router instance permissions to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.</p>
     * <p>  To grant a transit router instance permissions to connect to a Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * </li>
     * <li><p>Before you call the GrantInstanceToTransitRouter operation, make sure that you understand the billing rules of transit routers, the limits on authorization operations, and the prerequisites for authorization operations. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account network instance authorization</a>.</p>
     * </li>
     * <li><p>Before you authorize a network instance, make sure that the following operations are completed:
     * Confirm that the account to which the network instance belongs and the account to which the transit router instance belongs are of the same type.
     * Obtain the Alibaba Cloud account ID of the account to which the transit router instance belongs.
     * Obtain the Cloud Enterprise Network (CEN) instance ID to which the transit router instance belongs.
     * Before you authorize a VBR instance, contact your account manager to activate the VBR instance authorization feature.
     * Before you authorize an IPsec connection, make sure that the IPsec connection is not associated with any resource:
     * If the IPsec connection is already associated with a VPN gateway instance, it cannot be associated with a transit router instance in the same account or a different account.
     * If the IPsec connection is already associated with a transit router instance, you must disassociate it first. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions to a transit router instance to connect to a network instance that belongs to a different Alibaba Cloud account. Before a transit router instance can connect to a network instance that belongs to a different account, the network instance owner must authorize the transit router instance by calling the GrantInstanceToTransitRouter operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantInstanceToTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>The GrantInstanceToTransitRouter operation only supports granting a transit router instance permissions to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.</p>
     * <p>  To grant a transit router instance permissions to connect to a Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * </li>
     * <li><p>Before you call the GrantInstanceToTransitRouter operation, make sure that you understand the billing rules of transit routers, the limits on authorization operations, and the prerequisites for authorization operations. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account network instance authorization</a>.</p>
     * </li>
     * <li><p>Before you authorize a network instance, make sure that the following operations are completed:
     * Confirm that the account to which the network instance belongs and the account to which the transit router instance belongs are of the same type.
     * Obtain the Alibaba Cloud account ID of the account to which the transit router instance belongs.
     * Obtain the Cloud Enterprise Network (CEN) instance ID to which the transit router instance belongs.
     * Before you authorize a VBR instance, contact your account manager to activate the VBR instance authorization feature.
     * Before you authorize an IPsec connection, make sure that the IPsec connection is not associated with any resource:
     * If the IPsec connection is already associated with a VPN gateway instance, it cannot be associated with a transit router instance in the same account or a different account.
     * If the IPsec connection is already associated with a transit router instance, you must disassociate it first. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</p>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions to a transit router instance to connect to a network instance that belongs to a different Alibaba Cloud account. Before a transit router instance can connect to a network instance that belongs to a different account, the network instance owner must authorize the transit router instance by calling the GrantInstanceToTransitRouter operation.</p>
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
     * <p>When you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the operation returns a RequestId but does not display the route entries of network instances connected to the Enterprise Edition transit router.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries route entries that forward traffic to a network instance connection in the route table of a network instance associated with an Enterprise Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenChildInstanceRouteEntriesToAttachmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the operation returns a RequestId but does not display the route entries of network instances connected to the Enterprise Edition transit router.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries route entries that forward traffic to a network instance connection in the route table of a network instance associated with an Enterprise Edition transit router.</p>
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
     * <p>When you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic scheduling policy ID (that is, you do not specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns only the traffic scheduling policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The queue information under the traffic scheduling policy is not returned (that is, the response does not include the <strong>TrafficQosQueues</strong> field).</li>
     * <li>If you specify a traffic scheduling policy ID (that is, you specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns the traffic scheduling policy information and the queue information under the traffic scheduling policy (that is, the response includes the <strong>TrafficQosQueues</strong> field). If the <strong>TrafficQosQueues</strong> field is an empty array, only the default queue exists under the traffic scheduling policy.</li>
     * <li>Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a RequestId but does not return traffic scheduling policy information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about traffic scheduling policies by calling the ListCenInterRegionTrafficQosPolicies operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenInterRegionTrafficQosPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic scheduling policy ID (that is, you do not specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns only the traffic scheduling policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The queue information under the traffic scheduling policy is not returned (that is, the response does not include the <strong>TrafficQosQueues</strong> field).</li>
     * <li>If you specify a traffic scheduling policy ID (that is, you specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns the traffic scheduling policy information and the queue information under the traffic scheduling policy (that is, the response includes the <strong>TrafficQosQueues</strong> field). If the <strong>TrafficQosQueues</strong> field is an empty array, only the default queue exists under the traffic scheduling policy.</li>
     * <li>Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a RequestId but does not return traffic scheduling policy information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about traffic scheduling policies by calling the ListCenInterRegionTrafficQosPolicies operation.</p>
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
     * <p>When you call this operation, specify at least one of the following parameters: <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, or <strong>TrafficQosQueueId</strong>.
     * Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system returns a <strong>RequestId</strong> but does not return information about traffic scheduling policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about traffic scheduling policy queues by calling the ListCenInterRegionTrafficQosQueues operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCenInterRegionTrafficQosQueuesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, specify at least one of the following parameters: <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, or <strong>TrafficQosQueueId</strong>.
     * Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system returns a <strong>RequestId</strong> but does not return information about traffic scheduling policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about traffic scheduling policy queues by calling the ListCenInterRegionTrafficQosQueues operation.</p>
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
     * <p>Before you invoke the <code>ListGrantVSwitchEnis</code> operation, make sure that the VPC-connected instance is connected to Cloud Enterprise Network (CEN). For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic network interfaces (ENIs) within a virtual private cloud (VPC) that can serve as multicast sources or multicast members for multicast communication.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantVSwitchEnisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchEnis</code> operation, make sure that the VPC-connected instance is connected to Cloud Enterprise Network (CEN). For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic network interfaces (ENIs) within a virtual private cloud (VPC) that can serve as multicast sources or multicast members for multicast communication.</p>
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
     * <p>Before you invoke the <code>ListGrantVSwitchesToCen</code> operation, make sure that the CEN instance has been granted authorization to access the cross-account VPC-connected instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about vSwitches in a cross-account virtual private cloud (VPC) that is connected to a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGrantVSwitchesToCenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchesToCen</code> operation, make sure that the CEN instance has been granted authorization to access the cross-account VPC-connected instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about vSwitches in a cross-account virtual private cloud (VPC) that is connected to a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>When you call the ListTagResources operation, you must specify at least one of the request parameters <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>:</p>
     * <ul>
     * <li>If you specify only <strong>ResourceId.N</strong>, the tags bound to the specified CEN instance are queried.</li>
     * <li>If you specify only <strong>Tag.N.Key</strong>, all CEN instances that have the specified tag key bound are queried.</li>
     * <li>If you specify both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags bound to the specified CEN instance are queried.<ul>
     * <li>Make sure that the values of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong> correspond to each other. Otherwise, an empty result is returned.</li>
     * <li>If you specify multiple tag keys, the tag keys are evaluated by using the logical AND operator.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to a Cloud Enterprise Network (CEN) instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListTagResources operation, you must specify at least one of the request parameters <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>:</p>
     * <ul>
     * <li>If you specify only <strong>ResourceId.N</strong>, the tags bound to the specified CEN instance are queried.</li>
     * <li>If you specify only <strong>Tag.N.Key</strong>, all CEN instances that have the specified tag key bound are queried.</li>
     * <li>If you specify both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags bound to the specified CEN instance are queried.<ul>
     * <li>Make sure that the values of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong> correspond to each other. Otherwise, an empty result is returned.</li>
     * <li>If you specify multiple tag keys, the tag keys are evaluated by using the logical AND operator.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags bound to a Cloud Enterprise Network (CEN) instance.</p>
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
     * <p>When you call the <strong>ListTrafficMarkingPolicies</strong> operation:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (that is, you do not specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns only the traffic marking policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The traffic classification rule information under the traffic marking policy is not returned (that is, the response does not contain the <strong>TrafficMatchRules</strong> field).</li>
     * <li>If you specify a traffic marking policy ID (that is, you specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns the traffic marking policy information and the traffic classification rule information under the traffic marking policy (that is, the response contains the <strong>TrafficMatchRules</strong> field).
     * If the <strong>TrafficMatchRules</strong> field is an empty array, no traffic classification rules exist under the current traffic marking policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries details about traffic marking policies, such as the status and priority of the traffic marking policies.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrafficMarkingPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListTrafficMarkingPolicies</strong> operation:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (that is, you do not specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns only the traffic marking policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The traffic classification rule information under the traffic marking policy is not returned (that is, the response does not contain the <strong>TrafficMatchRules</strong> field).</li>
     * <li>If you specify a traffic marking policy ID (that is, you specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns the traffic marking policy information and the traffic classification rule information under the traffic marking policy (that is, the response contains the <strong>TrafficMatchRules</strong> field).
     * If the <strong>TrafficMatchRules</strong> field is an empty array, no traffic classification rules exist under the current traffic marking policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries details about traffic marking policies, such as the status and priority of the traffic marking policies.</p>
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
     * <ul>
     * <li>You can invoke <strong>ListTransitRouterAvailableResource</strong> to query information about regular zones or zones that support the multicast feature for Enterprise Edition transit routers in a specified region.<ul>
     * <li>If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the regular zones supported by Enterprise Edition transit routers by default.</li>
     * <li>If you set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the zones that support the multicast feature for Enterprise Edition transit routers.</li>
     * </ul>
     * </li>
     * <li>On May 31, 2022, Cloud Enterprise Network (CEN) performed an optimization upgrade on the mode in which Enterprise Edition transit routers connect to virtual private clouds (VPCs). After the upgrade, you no longer need to specify primary and secondary zones when connecting an Enterprise Edition transit router to a VPC-connected instance. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been upgraded, you must specify primary and secondary zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the primary and secondary zone information from the <strong>MasterZones</strong> and <strong>SlaveZones</strong> parameters.</li>
     * <li>If your Enterprise Edition transit router has been upgraded, you can specify any zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the zone information supported by the Enterprise Edition transit router from the <strong>AvailableZones</strong> parameter.
     * For more information about the Enterprise Edition transit router upgrade, see <a href="https://help.aliyun.com/document_detail/434191.html">Upgrade the mode in which an Enterprise Edition transit router connects to a VPC</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones supported by Enterprise Edition transit routers in a specified region.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterAvailableResourceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke <strong>ListTransitRouterAvailableResource</strong> to query information about regular zones or zones that support the multicast feature for Enterprise Edition transit routers in a specified region.<ul>
     * <li>If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the regular zones supported by Enterprise Edition transit routers by default.</li>
     * <li>If you set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the zones that support the multicast feature for Enterprise Edition transit routers.</li>
     * </ul>
     * </li>
     * <li>On May 31, 2022, Cloud Enterprise Network (CEN) performed an optimization upgrade on the mode in which Enterprise Edition transit routers connect to virtual private clouds (VPCs). After the upgrade, you no longer need to specify primary and secondary zones when connecting an Enterprise Edition transit router to a VPC-connected instance. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been upgraded, you must specify primary and secondary zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the primary and secondary zone information from the <strong>MasterZones</strong> and <strong>SlaveZones</strong> parameters.</li>
     * <li>If your Enterprise Edition transit router has been upgraded, you can specify any zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the zone information supported by the Enterprise Edition transit router from the <strong>AvailableZones</strong> parameter.
     * For more information about the Enterprise Edition transit router upgrade, see <a href="https://help.aliyun.com/document_detail/434191.html">Upgrade the mode in which an Enterprise Edition transit router connects to a VPC</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones supported by Enterprise Edition transit routers in a specified region.</p>
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
     * <p>Queries information about CIDR blocks of a transit router by calling the ListTransitRouterCidr operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterCidrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about CIDR blocks of a transit router by calling the ListTransitRouterCidr operation.</p>
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
     * <p>Queries the allocation information of a CIDR block by calling the ListTransitRouterCidrAllocation operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterCidrAllocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the allocation information of a CIDR block by calling the ListTransitRouterCidrAllocation operation.</p>
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
     * <p>You can query the information about ECR connections under an Enterprise Edition transit router in the following three ways: </p>
     * <ul>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the transit router instance ID. </li>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance. </li>
     * <li>Query the information about a specific ECR connection by specifying only the <strong>TransitRouterAttachmentId</strong> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection information about Express Connect Router (ECR) instances under an Enterprise Edition transit router, including the total number of entries, connection status, connection IDs, and the payer of network instances.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterEcrAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about ECR connections under an Enterprise Edition transit router in the following three ways: </p>
     * <ul>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the transit router instance ID. </li>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance. </li>
     * <li>Query the information about a specific ECR connection by specifying only the <strong>TransitRouterAttachmentId</strong> parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection information about Express Connect Router (ECR) instances under an Enterprise Edition transit router, including the total number of entries, connection status, connection IDs, and the payer of network instances.</p>
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
     * <ul>
     * <li>When calling this operation, you must specify at least one of the request parameters <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. Specifying <strong>TransitRouterAttachmentId</strong> queries the information about vSwitches that are associated with a multicast domain under a VPC-connected instance. Specifying <strong>TransitRouterMulticastDomainId</strong> queries the information about vSwitches that are associated with the multicast domain.</li>
     * <li>When calling the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a <strong>RequestId</strong> but does not return the associations between the multicast domain and vSwitches.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the associations between a multicast domain and vSwitches.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainAssociationsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When calling this operation, you must specify at least one of the request parameters <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. Specifying <strong>TransitRouterAttachmentId</strong> queries the information about vSwitches that are associated with a multicast domain under a VPC-connected instance. Specifying <strong>TransitRouterMulticastDomainId</strong> queries the information about vSwitches that are associated with the multicast domain.</li>
     * <li>When calling the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a <strong>RequestId</strong> but does not return the associations between the multicast domain and vSwitches.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the associations between a multicast domain and vSwitches.</p>
     * 
     * @param request ListTransitRouterMulticastDomainAssociationsRequest
     * @return ListTransitRouterMulticastDomainAssociationsResponse
     */
    public ListTransitRouterMulticastDomainAssociationsResponse listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastDomainAssociationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListTransitRouterMulticastDomainVSwitches operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not return information about vSwitches that are associated with multicast domains in the VPC-connected instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about vSwitches that are associated with multicast domains in a VPC-connected instance after the VPC-connected instance is connected to an Enterprise Edition transit router.</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainVSwitchesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListTransitRouterMulticastDomainVSwitches operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not return information about vSwitches that are associated with multicast domains in the VPC-connected instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about vSwitches that are associated with multicast domains in a VPC-connected instance after the VPC-connected instance is connected to an Enterprise Edition transit router.</p>
     * 
     * @param request ListTransitRouterMulticastDomainVSwitchesRequest
     * @return ListTransitRouterMulticastDomainVSwitchesResponse
     */
    public ListTransitRouterMulticastDomainVSwitchesResponse listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTransitRouterMulticastDomainVSwitchesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RegionId must be used together with CenId and cannot be used alone. Otherwise, multicast domain information is not displayed. However, TransitRouterId and TransitRouterMulticastDomainId can be used independently.</li>
     * <li>Ensure that the parameter values you specify are correct when you call this operation. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not display detailed multicast domain information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about multicast domains, such as the status, multicast domain ID, and description of multicast domains.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RegionId must be used together with CenId and cannot be used alone. Otherwise, multicast domain information is not displayed. However, TransitRouterId and TransitRouterMulticastDomainId can be used independently.</li>
     * <li>Ensure that the parameter values you specify are correct when you call this operation. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not display detailed multicast domain information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about multicast domains, such as the status, multicast domain ID, and description of multicast domains.</p>
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
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query information about multicast members and multicast sources (hereinafter referred to as multicast resources) in a multicast domain.</p>
     * <ul>
     * <li>If you specify the <strong>GroupIpAddress</strong> parameter, you can query multicast resources in a specified multicast group within the multicast domain.</li>
     * <li>If you specify the <strong>VSwitchIds</strong> parameter, you can query multicast resources under a specified vSwitch within the multicast domain.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you can query cross-region multicast resources within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceType</strong> parameter, you can query multicast resources of a specified resource type within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceId</strong> parameter, you can query multicast resources associated with a specified resource.</li>
     * <li>If you specify only the <strong>TransitRouterMulticastDomainId</strong> parameter, you can query all multicast resources within the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of multicast members and multicast sources in a multicast domain.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterMulticastGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query information about multicast members and multicast sources (hereinafter referred to as multicast resources) in a multicast domain.</p>
     * <ul>
     * <li>If you specify the <strong>GroupIpAddress</strong> parameter, you can query multicast resources in a specified multicast group within the multicast domain.</li>
     * <li>If you specify the <strong>VSwitchIds</strong> parameter, you can query multicast resources under a specified vSwitch within the multicast domain.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you can query cross-region multicast resources within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceType</strong> parameter, you can query multicast resources of a specified resource type within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceId</strong> parameter, you can query multicast resources associated with a specified resource.</li>
     * <li>If you specify only the <strong>TransitRouterMulticastDomainId</strong> parameter, you can query all multicast resources within the multicast domain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of multicast members and multicast sources in a multicast domain.</p>
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
     * <p>You can query inter-region connections under an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of inter-region connections under an Enterprise Edition transit router by calling the ListTransitRouterPeerAttachments operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterPeerAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query inter-region connections under an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of inter-region connections under an Enterprise Edition transit router by calling the ListTransitRouterPeerAttachments operation.</p>
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
     * <p>Queries information about prefix lists associated with an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterPrefixListAssociationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about prefix lists associated with an Enterprise Edition transit router route table.</p>
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
     * <p>Calls the ListTransitRouterRouteEntries operation to query the details of route entries in an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the ListTransitRouterRouteEntries operation to query the details of route entries in an Enterprise Edition transit router route table.</p>
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
     * <p>When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, specify at least one of the request parameters <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>:</p>
     * <ul>
     * <li>If you specify only the <strong>TransitRouterRouteTableId</strong> parameter, the system queries the network instance connections that have route association relationships with the specified Enterprise Edition transit router route table.</li>
     * <li>If you specify only the <strong>TransitRouterAttachmentId</strong> parameter, the system queries the Enterprise Edition transit router route tables that have route association relationships with the specified network instance connection.</li>
     * <li>If you specify both the <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong> parameters, the system queries the route association relationship between the specified network instance connection and the specified Enterprise Edition transit router route table.<ul>
     * <li>If a route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the system returns the information about the route association relationship.</li>
     * <li>If no route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the <strong>TransitRouterAssociations</strong> array is empty.
     * When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, make sure that the parameter values you specify are correct.
     * If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not return the route association relationships created for the Enterprise Edition transit router route table or network instance connection.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the route association relationships created for an Enterprise Edition transit router route table or a network instance connection.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTableAssociationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, specify at least one of the request parameters <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>:</p>
     * <ul>
     * <li>If you specify only the <strong>TransitRouterRouteTableId</strong> parameter, the system queries the network instance connections that have route association relationships with the specified Enterprise Edition transit router route table.</li>
     * <li>If you specify only the <strong>TransitRouterAttachmentId</strong> parameter, the system queries the Enterprise Edition transit router route tables that have route association relationships with the specified network instance connection.</li>
     * <li>If you specify both the <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong> parameters, the system queries the route association relationship between the specified network instance connection and the specified Enterprise Edition transit router route table.<ul>
     * <li>If a route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the system returns the information about the route association relationship.</li>
     * <li>If no route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the <strong>TransitRouterAssociations</strong> array is empty.
     * When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, make sure that the parameter values you specify are correct.
     * If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not return the route association relationships created for the Enterprise Edition transit router route table or network instance connection.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the route association relationships created for an Enterprise Edition transit router route table or a network instance connection.</p>
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
     * <p>Queries the route learning relationships of an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablePropagationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route learning relationships of an Enterprise Edition transit router route table.</p>
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
     * <p>Queries the details of route tables of an Enterprise Edition transit router by calling the ListTransitRouterRouteTables operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterRouteTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of route tables of an Enterprise Edition transit router by calling the ListTransitRouterRouteTables operation.</p>
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
     * <p>You can query information about virtual border router (VBR) connections on an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance.</li>
     * <li>Query information about a VBR connection by specifying only the TransitRouterAttachmentId parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection information of virtual border routers (VBRs) under an Enterprise Edition transit router, including the total number of entries, connection status, connection IDs, and payers of network instances.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVbrAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query information about virtual border router (VBR) connections on an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance.</li>
     * <li>Query information about a VBR connection by specifying only the TransitRouterAttachmentId parameter.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the connection information of virtual border routers (VBRs) under an Enterprise Edition transit router, including the total number of entries, connection status, connection IDs, and payers of network instances.</p>
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
     * <p>You can query information about VPC connections under an Enterprise Edition transit router in the following three ways:</p>
     * <ul>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the transit router instance ID.</li>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * <li>Query information about all VPC connections in a region by specifying the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about Virtual Private Cloud (VPC) connections under an Enterprise Edition transit router, including the status, billing type, zone information, and associated vSwitch and network interface controller (NIC) details of VPC connections that are active for forwarding and routing traffic.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVpcAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query information about VPC connections under an Enterprise Edition transit router in the following three ways:</p>
     * <ul>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the transit router instance ID.</li>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * <li>Query information about all VPC connections in a region by specifying the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about Virtual Private Cloud (VPC) connections under an Enterprise Edition transit router, including the status, billing type, zone information, and associated vSwitch and network interface controller (NIC) details of VPC connections that are active for forwarding and routing traffic.</p>
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
     * <p>The ListTransitRouterVpnAttachments operation supports the following three query methods:</p>
     * <ul>
     * <li>Specify only <strong>TransitRouterAttachmentId</strong> to query information about a specific VPN connection.</li>
     * <li>Specify only <strong>TransitRouterId</strong> to query information about all VPN connections associated with the specified transit router.</li>
     * <li>Specify <strong>CenId</strong> and <strong>RegionId</strong> to query information about VPN connections in a specific region of the Cloud Enterprise Network (CEN) instance.
     * When calling the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that the parameter values are correct. If you specify incorrect parameter values, the response still returns a <strong>RequestId</strong>, but does not include the information about the target VPN connections.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about VPN connections, such as the status, IPsec connection ID, and billing method of VPN connections.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRouterVpnAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ListTransitRouterVpnAttachments operation supports the following three query methods:</p>
     * <ul>
     * <li>Specify only <strong>TransitRouterAttachmentId</strong> to query information about a specific VPN connection.</li>
     * <li>Specify only <strong>TransitRouterId</strong> to query information about all VPN connections associated with the specified transit router.</li>
     * <li>Specify <strong>CenId</strong> and <strong>RegionId</strong> to query information about VPN connections in a specific region of the Cloud Enterprise Network (CEN) instance.
     * When calling the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that the parameter values are correct. If you specify incorrect parameter values, the response still returns a <strong>RequestId</strong>, but does not include the information about the target VPN connections.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about VPN connections, such as the status, IPsec connection ID, and billing method of VPN connections.</p>
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
     * <p>When you call this operation to query information about transit router instances under a CEN instance, you can specify the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters as needed. The following describes the relationship between these two parameters:</p>
     * <ul>
     * <li>If you do not specify <strong>RegionId</strong> or <strong>TransitRouterId</strong>, all transit router instances under the CEN instance are queried.</li>
     * <li>If you specify only <strong>RegionId</strong>, transit router instances in the specified region under the CEN instance are queried.</li>
     * <li>If you specify only <strong>TransitRouterId</strong>, the specified transit router instance under the CEN instance is queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about transit router instances under a Cloud Enterprise Network (CEN) instance, including the instance type, instance status, transit router instance ID, and whether the multicast feature is enabled.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransitRoutersResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to query information about transit router instances under a CEN instance, you can specify the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters as needed. The following describes the relationship between these two parameters:</p>
     * <ul>
     * <li>If you do not specify <strong>RegionId</strong> or <strong>TransitRouterId</strong>, all transit router instances under the CEN instance are queried.</li>
     * <li>If you specify only <strong>RegionId</strong>, transit router instances in the specified region under the CEN instance are queried.</li>
     * <li>If you specify only <strong>TransitRouterId</strong>, the specified transit router instance under the CEN instance is queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about transit router instances under a Cloud Enterprise Network (CEN) instance, including the instance type, instance status, transit router instance ID, and whether the multicast feature is enabled.</p>
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
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance has not been modified yet. The modification task is still running in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance has been modified.</li>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance has not been modified yet. The modification task is still running in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance has been modified.</li>
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
     * <p>Modifies the name and description of a bandwidth plan instance by calling the ModifyCenBandwidthPackageAttribute operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a bandwidth plan instance by calling the ModifyCenBandwidthPackageAttribute operation.</p>
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
     * <p>Modifies the peak bandwidth of a bandwidth plan instance by calling the ModifyCenBandwidthPackageSpec operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenBandwidthPackageSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the peak bandwidth of a bandwidth plan instance by calling the ModifyCenBandwidthPackageSpec operation.</p>
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
     * <p>The <code>ModifyCenRouteMap</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy has not been modified yet. The modification task runs in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Modifying</strong> state, the routing policy is being modified. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a routing policy by calling the ModifyCenRouteMap operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCenRouteMapResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>ModifyCenRouteMap</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy has not been modified yet. The modification task runs in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Modifying</strong> state, the routing policy is being modified. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a routing policy by calling the ModifyCenRouteMap operation.</p>
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
     * <p>The <code>ModifyFlowLogAttribute</code> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the modification has not been completed. The modification continues in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and capture window duration of a flow log.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFlowLogAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>ModifyFlowLogAttribute</code> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the modification has not been completed. The modification continues in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and capture window duration of a flow log.</p>
     * 
     * @param request ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    public ModifyFlowLogAttributeResponse modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFlowLogAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ModifyGrantInstanceToTransitRouter operation supports modifying only the payer for cross-account virtual private cloud (VPC), virtual border router (VBR), and IPsec connection instances connected to a transit router instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the payer for a cross-account network instance connection of a transit router instance.</p>
     * 
     * @param request ModifyGrantInstanceToTransitRouterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGrantInstanceToTransitRouterResponse
     */
    public ModifyGrantInstanceToTransitRouterResponse modifyGrantInstanceToTransitRouterWithOptions(ModifyGrantInstanceToTransitRouterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGrantInstanceToTransitRouter"),
            new TeaPair("version", "2017-09-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGrantInstanceToTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ModifyGrantInstanceToTransitRouter operation supports modifying only the payer for cross-account virtual private cloud (VPC), virtual border router (VBR), and IPsec connection instances connected to a transit router instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the payer for a cross-account network instance connection of a transit router instance.</p>
     * 
     * @param request ModifyGrantInstanceToTransitRouterRequest
     * @return ModifyGrantInstanceToTransitRouterResponse
     */
    public ModifyGrantInstanceToTransitRouterResponse modifyGrantInstanceToTransitRouter(ModifyGrantInstanceToTransitRouterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGrantInstanceToTransitRouterWithOptions(request, runtime);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse());
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
     * <p>Modifies an aggregate route.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouteTableAggregationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an aggregate route.</p>
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
     * <ul>
     * <li>Before you modify a transit router CIDR block, we recommend that you familiarize yourself with the <a href="https://help.aliyun.com/document_detail/462635.html">usage limits of transit router CIDR blocks</a>.</li>
     * <li>A transit router CIDR block that has allocated IP addresses cannot be modified.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation without modifying the <strong>PublishCidrRoute</strong> parameter, this operation is synchronous and the modification takes effect immediately.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation and modify the <strong>PublishCidrRoute</strong> parameter, this operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the transit router CIDR block is not yet modified. The modification task runs in the background. You can call the <strong>ListTransitRouterCidr</strong> operation to query the modification status of the transit router CIDR block.<ul>
     * <li>If the transit router CIDR block still shows the information before the modification, the transit router CIDR block is being modified.</li>
     * <li>If the transit router CIDR block shows the updated information, the transit router CIDR block has been modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the ModifyTransitRouterCidr operation to modify a CIDR block of a transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouterCidrResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you modify a transit router CIDR block, we recommend that you familiarize yourself with the <a href="https://help.aliyun.com/document_detail/462635.html">usage limits of transit router CIDR blocks</a>.</li>
     * <li>A transit router CIDR block that has allocated IP addresses cannot be modified.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation without modifying the <strong>PublishCidrRoute</strong> parameter, this operation is synchronous and the modification takes effect immediately.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation and modify the <strong>PublishCidrRoute</strong> parameter, this operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the transit router CIDR block is not yet modified. The modification task runs in the background. You can call the <strong>ListTransitRouterCidr</strong> operation to query the modification status of the transit router CIDR block.<ul>
     * <li>If the transit router CIDR block still shows the information before the modification, the transit router CIDR block is being modified.</li>
     * <li>If the transit router CIDR block shows the updated information, the transit router CIDR block has been modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the ModifyTransitRouterCidr operation to modify a CIDR block of a transit router.</p>
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
     * <p>Modifies the name, description, and feature options of a multicast domain.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTransitRouterMulticastDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, and feature options of a multicast domain.</p>
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
     * <p>CEN instances and bandwidth plan instances belong to the default resource group by default. You can call the <code>MoveResourceGroup</code> operation to modify the resource group to which a CEN instance or a bandwidth plan instance belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a Cloud Enterprise Network (CEN) instance or a bandwidth plan instance belongs.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>CEN instances and bandwidth plan instances belong to the default resource group by default. You can call the <code>MoveResourceGroup</code> operation to modify the resource group to which a CEN instance or a bandwidth plan instance belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a Cloud Enterprise Network (CEN) instance or a bandwidth plan instance belongs.</p>
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
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router service free of charge. After the transit router service is activated, the system automatically generates an order. You can use the order ID returned by the <code>OpenTransitRouterService</code> operation to query order information in the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/order/list?pageIndex=1&pageSize=20">Alibaba Cloud Management Console Order Center</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list">Alibaba Cloud Management Console Order Center</a>.</p>
     * <blockquote>
     * <p>Before calling this operation, call <a href="~~CheckTransitRouterService~~">CheckTransitRouterService</a> to check whether the transit router service is already activated for the current account. If it is already activated, you do not need to call this operation again.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates the transit router service.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenTransitRouterServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router service free of charge. After the transit router service is activated, the system automatically generates an order. You can use the order ID returned by the <code>OpenTransitRouterService</code> operation to query order information in the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/order/list?pageIndex=1&pageSize=20">Alibaba Cloud Management Console Order Center</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list">Alibaba Cloud Management Console Order Center</a>.</p>
     * <blockquote>
     * <p>Before calling this operation, call <a href="~~CheckTransitRouterService~~">CheckTransitRouterService</a> to check whether the transit router service is already activated for the current account. If it is already activated, you do not need to call this operation again.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates the transit router service.</p>
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
     * <p>The following table lists the default publish status of each type of route entry in CEN. You can call the PublishRouteEntries operation to publish route entries that are not published to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route entry</th>
     * <th>Instance to which the route entry belongs</th>
     * <th>Published to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Route entry that points to an ECS instance</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a VPN gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a high availability (HA) virtual IP address</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a router interface</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an IPv6 gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a NAT gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>VPC system route entry</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an on-premises data center</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>BGP route</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) supports the publish route entry feature. You can publish routing entries from a VPC or VBR loaded into CEN to CEN by invoking the PublishRouteEntries operation. If no route conflict exists, other network instances in CEN can learn the published routes.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishRouteEntriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The following table lists the default publish status of each type of route entry in CEN. You can call the PublishRouteEntries operation to publish route entries that are not published to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route entry</th>
     * <th>Instance to which the route entry belongs</th>
     * <th>Published to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Route entry that points to an ECS instance</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a VPN gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a high availability (HA) virtual IP address</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a router interface</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an IPv6 gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a NAT gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>VPC system route entry</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an on-premises data center</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>BGP route</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Cloud Enterprise Network (CEN) supports the publish route entry feature. You can publish routing entries from a VPC or VBR loaded into CEN to CEN by invoking the PublishRouteEntries operation. If no route conflict exists, other network instances in CEN can learn the published routes.</p>
     * 
     * @param request PublishRouteEntriesRequest
     * @return PublishRouteEntriesResponse
     */
    public PublishRouteEntriesResponse publishRouteEntries(PublishRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For aggregate routes that failed to be published or were partially published, you can call the <strong>RefreshTransitRouteTableAggregation</strong> operation to republish the aggregate route to Virtual Private Cloud (VPC) instances after you resolve the route issue.
     * If you resolve the problematic route by using one of the following methods, the system automatically republishes the aggregate route and you do not need to manually republish it:</p>
     * <ul>
     * <li>Delete the association forwarding relationship.</li>
     * <li>Disable the route synchronization feature.</li>
     * <li>Delete the VPC route table.</li>
     * <li>Delete the aggregate route.
     * You can call the <strong>DescribeTransitRouteTableAggregationDetail</strong> operation to query the propagation status of an aggregate route.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Republishes an aggregate route.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshTransitRouteTableAggregationResponse());
    }

    /**
     * <b>description</b> :
     * <p>For aggregate routes that failed to be published or were partially published, you can call the <strong>RefreshTransitRouteTableAggregation</strong> operation to republish the aggregate route to Virtual Private Cloud (VPC) instances after you resolve the route issue.
     * If you resolve the problematic route by using one of the following methods, the system automatically republishes the aggregate route and you do not need to manually republish it:</p>
     * <ul>
     * <li>Delete the association forwarding relationship.</li>
     * <li>Disable the route synchronization feature.</li>
     * <li>Delete the VPC route table.</li>
     * <li>Delete the aggregate route.
     * You can call the <strong>DescribeTransitRouteTableAggregationDetail</strong> operation to query the propagation status of an aggregate route.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Republishes an aggregate route.</p>
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
     * <p>Currently, Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify ENIs in the same region or cross-region ENIs as multicast members.</p>
     * <ul>
     * <li>If you specify the <strong>NetworkInterfaceIds</strong> parameter, you want to specify ENIs in the current region as multicast members. Make sure that the vSwitch to which the ENI belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you want to specify multicast members in a multicast group with the same multicast IP address in a different region as multicast members of your current multicast group. Make sure that you have created an inter-region connection. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you have Multicast Domain 1 in the China (Hangzhou) region with Multicast Group 1, and Multicast Domain 2 in the China (Shanghai) region with Multicast Group 2. Multicast Group 1 and Multicast Group 2 have the same multicast IP address, and Multicast Group 2 in the China (Shanghai) region has Multicast Member 2. When you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to create multicast members for Multicast Group 1 in the China (Hangzhou) region, if you set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Domain 2 in the China (Shanghai) region, Multicast Member 2 in Multicast Group 2 in the China (Shanghai) region also becomes a multicast member of Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li>The <code>RegisterTransitRouterMulticastGroupMembers</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the multicast member is not completely created. The creation task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong> state, the multicast member is being created. In this state, you can only query the multicast member but cannot perform other operations.</li>
     * <li>If the multicast member is in the <strong>Registered</strong> state, the multicast member is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the RegisterTransitRouterMulticastGroupMembers operation to create or add multicast members.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterTransitRouterMulticastGroupMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify ENIs in the same region or cross-region ENIs as multicast members.</p>
     * <ul>
     * <li>If you specify the <strong>NetworkInterfaceIds</strong> parameter, you want to specify ENIs in the current region as multicast members. Make sure that the vSwitch to which the ENI belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you want to specify multicast members in a multicast group with the same multicast IP address in a different region as multicast members of your current multicast group. Make sure that you have created an inter-region connection. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you have Multicast Domain 1 in the China (Hangzhou) region with Multicast Group 1, and Multicast Domain 2 in the China (Shanghai) region with Multicast Group 2. Multicast Group 1 and Multicast Group 2 have the same multicast IP address, and Multicast Group 2 in the China (Shanghai) region has Multicast Member 2. When you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to create multicast members for Multicast Group 1 in the China (Hangzhou) region, if you set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Domain 2 in the China (Shanghai) region, Multicast Member 2 in Multicast Group 2 in the China (Shanghai) region also becomes a multicast member of Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li>The <code>RegisterTransitRouterMulticastGroupMembers</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the multicast member is not completely created. The creation task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong> state, the multicast member is being created. In this state, you can only query the multicast member but cannot perform other operations.</li>
     * <li>If the multicast member is in the <strong>Registered</strong> state, the multicast member is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the RegisterTransitRouterMulticastGroupMembers operation to create or add multicast members.</p>
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
     * <ul>
     * <li><p>Only elastic network interfaces (ENIs) can be specified as multicast sources.</p>
     * </li>
     * <li><p>RegisterTransitRouterMulticastGroupSources is an asynchronous operation. After a request is sent, the system returns a <strong>RequestId</strong> but the multicast source is not completely created. The creation task still runs in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source. </p>
     * <ul>
     * <li>If the multicast source is in the <strong>Registering</strong> state, the multicast source is being created. In this state, you can only query the multicast source but cannot perform other operations.</li>
     * <li>If the multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the <code>RegisterTransitRouterMulticastGroupSources</code> operation to create a multicast source, make sure that the vSwitch to which the network interface controller (NIC) of the elastic network interfaces (ENIs) belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates multicast sources to implement one-to-many multicast communication.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterTransitRouterMulticastGroupSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>Only elastic network interfaces (ENIs) can be specified as multicast sources.</p>
     * </li>
     * <li><p>RegisterTransitRouterMulticastGroupSources is an asynchronous operation. After a request is sent, the system returns a <strong>RequestId</strong> but the multicast source is not completely created. The creation task still runs in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source. </p>
     * <ul>
     * <li>If the multicast source is in the <strong>Registering</strong> state, the multicast source is being created. In this state, you can only query the multicast source but cannot perform other operations.</li>
     * <li>If the multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the <code>RegisterTransitRouterMulticastGroupSources</code> operation to create a multicast source, make sure that the vSwitch to which the network interface controller (NIC) of the elastic network interfaces (ENIs) belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates multicast sources to implement one-to-many multicast communication.</p>
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
     * <ul>
     * <li>When you call the <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> operation:<ul>
     * <li>If you specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation deletes the specified traffic classification rules.</li>
     * <li>If you do not specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation does not perform any action.
     *   If you want to delete specific traffic classification rules, make sure that you have specified the IDs of the traffic classification rules before you call this operation.</li>
     * </ul>
     * </li>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the traffic classification rules are not immediately deleted. The deletion task runs in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of traffic classification rules. <ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the rule is being deleted. In this state, you can only query the traffic classification rule. You cannot perform other operations on it.</li>
     * <li>If the specified traffic classification rule cannot be found, the rule has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes traffic classification rules from a traffic marking policy by calling the RemoveTrafficMatchRuleFromTrafficMarkingPolicy operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call the <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> operation:<ul>
     * <li>If you specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation deletes the specified traffic classification rules.</li>
     * <li>If you do not specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation does not perform any action.
     *   If you want to delete specific traffic classification rules, make sure that you have specified the IDs of the traffic classification rules before you call this operation.</li>
     * </ul>
     * </li>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the traffic classification rules are not immediately deleted. The deletion task runs in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of traffic classification rules. <ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the rule is being deleted. In this state, you can only query the traffic classification rule. You cannot perform other operations on it.</li>
     * <li>If the specified traffic classification rule cannot be found, the rule has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes traffic classification rules from a traffic marking policy by calling the RemoveTrafficMatchRuleFromTrafficMarkingPolicy operation.</p>
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
     * <h3>Precautions</h3>
     * <p>The <strong>RemoveTraficMatchRuleFromTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued. To delete traffic classification rules from a traffic marking policy, use the <a href="https://help.aliyun.com/document_detail/452726.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a> operation. This API documentation is no longer maintained.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes traffic classification rules from a traffic marking policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <p>The <strong>RemoveTraficMatchRuleFromTrafficMarkingPolicy</strong> operation is deprecated and will be discontinued. To delete traffic classification rules from a traffic marking policy, use the <a href="https://help.aliyun.com/document_detail/452726.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a> operation. This API documentation is no longer maintained.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes traffic classification rules from a traffic marking policy.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Only network instance connections under an Enterprise Edition transit router support changing the associated transit router route table.</li>
     * <li><strong>ReplaceTransitRouterRouteTableAssociation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the transit router route table associated with the network instance connection has not been replaced yet. The replacement task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association forwarding status between the network instance connection and the new transit router route table.<ul>
     * <li>If the association forwarding status is <strong>Replacing</strong>, the network instance connection is changing the associated transit router route table. In this state, you can only query the association forwarding relationship between the network instance connection and the transit router route table. You cannot perform other operations.</li>
     * <li>If the association forwarding status is <strong>Active</strong>, the network instance connection has successfully changed the associated transit router route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces the transit router route table associated with a network instance connection.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceTransitRouterRouteTableAssociationResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only network instance connections under an Enterprise Edition transit router support changing the associated transit router route table.</li>
     * <li><strong>ReplaceTransitRouterRouteTableAssociation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the transit router route table associated with the network instance connection has not been replaced yet. The replacement task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association forwarding status between the network instance connection and the new transit router route table.<ul>
     * <li>If the association forwarding status is <strong>Replacing</strong>, the network instance connection is changing the associated transit router route table. In this state, you can only query the association forwarding relationship between the network instance connection and the transit router route table. You cannot perform other operations.</li>
     * <li>If the association forwarding status is <strong>Active</strong>, the network instance connection has successfully changed the associated transit router route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces the transit router route table associated with a network instance connection.</p>
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
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block, such as Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access cloud services, you must load the Virtual Border Router (VBR) instance or Cloud Connect Network (CCN) instance associated with your on-premises network to a Cloud Enterprise Network (CEN) instance. You must also load a VPC-connected instance in the region where the cloud service resides to the same CEN instance. After loading, your on-premises network can access the VPC-connected instance in the region of the cloud service through CEN, and then access the cloud service through the VPC by forwarding traffic. The CEN handles the routing accordingly.</p>
     * <ul>
     * <li>Limits: This operation applies only to Basic Edition transit routers. On-premises networks associated with VBR instances can access only cloud services in the same region through CEN.
     *   For example, if the cloud service resides in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region can access the cloud service.</li>
     * <li>The <strong>ResolveAndRouteServiceInCen</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the cloud service configuration is not yet complete. The background node for adding the configuration continues to run. You can invoke the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the cloud service. <ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the cloud service configuration is being added. In this state, you can only execute a query on the cloud service configuration and cannot execute other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the cloud service configuration is added.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the cloud service configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the ResolveAndRouteServiceInCen operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance with network connectivity to your on-premises network is loaded to the CEN instance.</li>
     * <li>A VPC-connected instance in the region where the cloud service resides is loaded to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a cloud service to add access configurations for on-premises networks by calling the ResolveAndRouteServiceInCen operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResolveAndRouteServiceInCenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block, such as Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access cloud services, you must load the Virtual Border Router (VBR) instance or Cloud Connect Network (CCN) instance associated with your on-premises network to a Cloud Enterprise Network (CEN) instance. You must also load a VPC-connected instance in the region where the cloud service resides to the same CEN instance. After loading, your on-premises network can access the VPC-connected instance in the region of the cloud service through CEN, and then access the cloud service through the VPC by forwarding traffic. The CEN handles the routing accordingly.</p>
     * <ul>
     * <li>Limits: This operation applies only to Basic Edition transit routers. On-premises networks associated with VBR instances can access only cloud services in the same region through CEN.
     *   For example, if the cloud service resides in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region can access the cloud service.</li>
     * <li>The <strong>ResolveAndRouteServiceInCen</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the cloud service configuration is not yet complete. The background node for adding the configuration continues to run. You can invoke the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the cloud service. <ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the cloud service configuration is being added. In this state, you can only execute a query on the cloud service configuration and cannot execute other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the cloud service configuration is added.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the cloud service configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the ResolveAndRouteServiceInCen operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance with network connectivity to your on-premises network is loaded to the CEN instance.</li>
     * <li>A VPC-connected instance in the region where the cloud service resides is loaded to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a cloud service to add access configurations for on-premises networks by calling the ResolveAndRouteServiceInCen operation.</p>
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
     * <p>The <code>RevokeInstanceFromTransitRouter</code> operation only supports revoking the permissions that allow a transit router to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.
     * To revoke the permissions that allow a transit router to connect to a cross-account Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3>Before you begin</h3>
     * <p>Before you call the <code>RevokeInstanceFromTransitRouter</code> operation, make sure that the connection between the transit router and the VPC-connected instance is deleted.</p>
     * <ul>
     * <li>To delete the connection between an Enterprise Edition transit router and a VPC instance, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and a VBR instance, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an IPsec connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an ECR instance, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete the connection between a Basic Edition transit router and a VPC-connected instance, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes the permissions that allow a transit router to connect to a cross-account network instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeInstanceFromTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The <code>RevokeInstanceFromTransitRouter</code> operation only supports revoking the permissions that allow a transit router to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.
     * To revoke the permissions that allow a transit router to connect to a cross-account Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3>Before you begin</h3>
     * <p>Before you call the <code>RevokeInstanceFromTransitRouter</code> operation, make sure that the connection between the transit router and the VPC-connected instance is deleted.</p>
     * <ul>
     * <li>To delete the connection between an Enterprise Edition transit router and a VPC instance, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and a VBR instance, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an IPsec connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an ECR instance, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete the connection between a Basic Edition transit router and a VPC-connected instance, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Revokes the permissions that allow a transit router to connect to a cross-account network instance.</p>
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
     * <p>PrivateZone is a private DNS resolution and management service based on the Alibaba Cloud Virtual Private Cloud (VPC) environment. After a Virtual Border Router (VBR) instance or a Cloud Connect Network (CCN) instance is attached to a Cloud Enterprise Network (CEN) instance, the associated on-premises network can access the PrivateZone service through CEN.</p>
     * <ul>
     * <li>On-premises networks associated with VBR instances and CCN instances can access only the PrivateZone service in the same region.
     *   For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region and CCN instances in the Chinese mainland can access the PrivateZone service.</li>
     * <li>The <strong>RoutePrivateZoneInCenToVpc</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not complete. The configuration task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. <ul>
     * <li>If the PrivateZone service is in the <strong>Creating</strong> state, the configuration is being added. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the PrivateZone service is in the <strong>Active</strong> state, the configuration is complete.</li>
     * <li>If the PrivateZone service is in the <strong>Failed</strong> state, the configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Before you begin</h4>
     * <p>Before you invoke the <strong>RoutePrivateZoneInCenToVpc</strong> operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The PrivateZone service is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">Alibaba Cloud DNS PrivateZone Getting Started</a>.</li>
     * <li>The VPC-connected instance associated with the PrivateZone service, and the VBR instance or CCN instance in the access region are attached to the same CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud, and the CCN instance belongs to a different account from the VPC-connected instance or the CEN instance, complete the authorization for the CCN instance first. For more information, see <a href="https://help.aliyun.com/document_detail/106674.html">Cloud Connect Network authorization</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the PrivateZone service by calling the RoutePrivateZoneInCenToVpc operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RoutePrivateZoneInCenToVpcResponse());
    }

    /**
     * <b>description</b> :
     * <p>PrivateZone is a private DNS resolution and management service based on the Alibaba Cloud Virtual Private Cloud (VPC) environment. After a Virtual Border Router (VBR) instance or a Cloud Connect Network (CCN) instance is attached to a Cloud Enterprise Network (CEN) instance, the associated on-premises network can access the PrivateZone service through CEN.</p>
     * <ul>
     * <li>On-premises networks associated with VBR instances and CCN instances can access only the PrivateZone service in the same region.
     *   For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region and CCN instances in the Chinese mainland can access the PrivateZone service.</li>
     * <li>The <strong>RoutePrivateZoneInCenToVpc</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not complete. The configuration task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. <ul>
     * <li>If the PrivateZone service is in the <strong>Creating</strong> state, the configuration is being added. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the PrivateZone service is in the <strong>Active</strong> state, the configuration is complete.</li>
     * <li>If the PrivateZone service is in the <strong>Failed</strong> state, the configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Before you begin</h4>
     * <p>Before you invoke the <strong>RoutePrivateZoneInCenToVpc</strong> operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The PrivateZone service is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">Alibaba Cloud DNS PrivateZone Getting Started</a>.</li>
     * <li>The VPC-connected instance associated with the PrivateZone service, and the VBR instance or CCN instance in the access region are attached to the same CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud, and the CCN instance belongs to a different account from the VPC-connected instance or the CEN instance, complete the authorization for the CCN instance first. For more information, see <a href="https://help.aliyun.com/document_detail/106674.html">Cloud Connect Network authorization</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the PrivateZone service by calling the RoutePrivateZoneInCenToVpc operation.</p>
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
     * <p>This operation supports setting the inter-region bandwidth between two regions only in bandwidth packages of Basic Edition transit routers.</p>
     * <h3>Before you begin</h3>
     * <p>A bandwidth package instance is already associated with the target Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call <strong>SetCenInterRegionBandwidthLimit</strong> to set, modify, or delete the inter-region bandwidth:</p>
     * <ul>
     * <li>If <strong>BandwidthLimit</strong> is not 0, the inter-region bandwidth is set or modified.</li>
     * <li>If <strong>BandwidthLimit</strong> is 0, the inter-region bandwidth is deleted.</li>
     * </ul>
     * <h3>Settings</h3>
     * <ul>
     * <li>The maximum inter-region bandwidth cannot exceed the peak bandwidth of the bandwidth package instance to which it belongs.</li>
     * <li>The total inter-region bandwidth under a bandwidth package instance cannot exceed the peak bandwidth of that bandwidth package instance.</li>
     * <li>If the bandwidth multiplexing feature is enabled for the inter-region connection, modifying the inter-region bandwidth is not supported.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation supports setting, modifying, or deleting inter-region bandwidth only for Basic Edition transit routers.
     *   To set, modify, or delete inter-region bandwidth for Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, and <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets, modifies, or deletes the inter-region bandwidth between two regions in a bandwidth package of a Basic Edition transit router.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCenInterRegionBandwidthLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports setting the inter-region bandwidth between two regions only in bandwidth packages of Basic Edition transit routers.</p>
     * <h3>Before you begin</h3>
     * <p>A bandwidth package instance is already associated with the target Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call <strong>SetCenInterRegionBandwidthLimit</strong> to set, modify, or delete the inter-region bandwidth:</p>
     * <ul>
     * <li>If <strong>BandwidthLimit</strong> is not 0, the inter-region bandwidth is set or modified.</li>
     * <li>If <strong>BandwidthLimit</strong> is 0, the inter-region bandwidth is deleted.</li>
     * </ul>
     * <h3>Settings</h3>
     * <ul>
     * <li>The maximum inter-region bandwidth cannot exceed the peak bandwidth of the bandwidth package instance to which it belongs.</li>
     * <li>The total inter-region bandwidth under a bandwidth package instance cannot exceed the peak bandwidth of that bandwidth package instance.</li>
     * <li>If the bandwidth multiplexing feature is enabled for the inter-region connection, modifying the inter-region bandwidth is not supported.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation supports setting, modifying, or deleting inter-region bandwidth only for Basic Edition transit routers.
     *   To set, modify, or delete inter-region bandwidth for Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, and <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets, modifies, or deletes the inter-region bandwidth between two regions in a bandwidth package of a Basic Edition transit router.</p>
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
     * <ul>
     * <li>A tag consists of a tag key and a tag value. Both the tag key and tag value are required when you add a tag.</li>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, the tag keys of the tags must be unique within the instance.</li>
     * <li>You can attach up to 20 tags to a CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and attaches tags to resources.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A tag consists of a tag key and a tag value. Both the tag key and tag value are required when you add a tag.</li>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, the tag keys of the tags must be unique within the instance.</li>
     * <li>You can attach up to 20 tags to a CEN instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates and attaches tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Subscription bandwidth plans support the temporary upgrade feature. You can use this feature to increase the bandwidth value of a bandwidth plan within a specified period to flexibly handle business bandwidth fluctuations.
     * The minimum interval for a temporary upgrade is 3 hours. After the payment is completed, the bandwidth is upgraded immediately without service interruptions.</p>
     * <blockquote>
     * <p>After a temporary upgrade expires, the subscription bandwidth plan reverts to the original peak bandwidth. If the service traffic on the instance exceeds the original peak bandwidth limit, the traffic may be dropped due to throttling. Plan the expiration time of the temporary upgrade properly and make sure that the peak bandwidth matches your business requirements.</p>
     * </blockquote>
     * <ul>
     * <li>The temporary upgrade feature is not available by default. To use this feature, contact your account manager.</li>
     * <li>Pay-as-you-go bandwidth plans and expired subscription bandwidth plans do not support the temporary upgrade feature.</li>
     * <li>The <strong>TempUpgradeCenBandwidthPackageSpec</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong> but the bandwidth plan is not yet upgraded. The upgrade task continues to run in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the specifications of the bandwidth plan. If the specifications meet your expectations, the upgrade is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the TempUpgradeCenBandwidthPackageSpec operation to temporarily upgrade the specifications of a subscription bandwidth plan for Cloud Enterprise Network (CEN).</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempUpgradeCenBandwidthPackageSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>Subscription bandwidth plans support the temporary upgrade feature. You can use this feature to increase the bandwidth value of a bandwidth plan within a specified period to flexibly handle business bandwidth fluctuations.
     * The minimum interval for a temporary upgrade is 3 hours. After the payment is completed, the bandwidth is upgraded immediately without service interruptions.</p>
     * <blockquote>
     * <p>After a temporary upgrade expires, the subscription bandwidth plan reverts to the original peak bandwidth. If the service traffic on the instance exceeds the original peak bandwidth limit, the traffic may be dropped due to throttling. Plan the expiration time of the temporary upgrade properly and make sure that the peak bandwidth matches your business requirements.</p>
     * </blockquote>
     * <ul>
     * <li>The temporary upgrade feature is not available by default. To use this feature, contact your account manager.</li>
     * <li>Pay-as-you-go bandwidth plans and expired subscription bandwidth plans do not support the temporary upgrade feature.</li>
     * <li>The <strong>TempUpgradeCenBandwidthPackageSpec</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong> but the bandwidth plan is not yet upgraded. The upgrade task continues to run in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the specifications of the bandwidth plan. If the specifications meet your expectations, the upgrade is complete.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the TempUpgradeCenBandwidthPackageSpec operation to temporarily upgrade the specifications of a subscription bandwidth plan for Cloud Enterprise Network (CEN).</p>
     * 
     * @param request TempUpgradeCenBandwidthPackageSpecRequest
     * @return TempUpgradeCenBandwidthPackageSpecResponse
     */
    public TempUpgradeCenBandwidthPackageSpecResponse tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempUpgradeCenBandwidthPackageSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disassociates a bandwidth package from a Cloud Enterprise Network (CEN) instance. Before you call this operation, make sure that no inter-region bandwidth is configured for the bandwidth package. You can call <a href="https://help.aliyun.com/document_detail/468275.html">DescribeCenInterRegionBandwidthLimits</a> to query inter-region bandwidth, and then call <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a> to set BandwidthLimit to 0 to delete the configured inter-region bandwidth.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a bandwidth package from a Cloud Enterprise Network (CEN) instance. After the disassociation, the bandwidth package can be associated with another CEN instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateCenBandwidthPackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disassociates a bandwidth package from a Cloud Enterprise Network (CEN) instance. Before you call this operation, make sure that no inter-region bandwidth is configured for the bandwidth package. You can call <a href="https://help.aliyun.com/document_detail/468275.html">DescribeCenInterRegionBandwidthLimits</a> to query inter-region bandwidth, and then call <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a> to set BandwidthLimit to 0 to delete the configured inter-region bandwidth.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a bandwidth package from a Cloud Enterprise Network (CEN) instance. After the disassociation, the bandwidth package can be associated with another CEN instance.</p>
     * 
     * @param request UnassociateCenBandwidthPackageRequest
     * @return UnassociateCenBandwidthPackageResponse
     */
    public UnassociateCenBandwidthPackageResponse unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateCenBandwidthPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UnroutePrivateZoneInCenToVpc</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. </p>
     * <ul>
     * <li>If the PrivateZone service is in the <strong>Deleting</strong> state, the PrivateZone service configuration is being deleted. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the specified PrivateZone service configuration cannot be found, the deletion is complete.
     * If a PrivateZone configuration exists with the access region set to a Cloud Connect Network region, delete the PrivateZone configuration for the Cloud Connect Network region first, and then delete the PrivateZone configurations for other access regions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a PrivateZone service configuration by calling the UnroutePrivateZoneInCenToVpc operation.</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnroutePrivateZoneInCenToVpcResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UnroutePrivateZoneInCenToVpc</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. </p>
     * <ul>
     * <li>If the PrivateZone service is in the <strong>Deleting</strong> state, the PrivateZone service configuration is being deleted. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the specified PrivateZone service configuration cannot be found, the deletion is complete.
     * If a PrivateZone configuration exists with the access region set to a Cloud Connect Network region, delete the PrivateZone configuration for the Cloud Connect Network region first, and then delete the PrivateZone configurations for other access regions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a PrivateZone service configuration by calling the UnroutePrivateZoneInCenToVpc operation.</p>
     * 
     * @param request UnroutePrivateZoneInCenToVpcRequest
     * @return UnroutePrivateZoneInCenToVpcResponse
     */
    public UnroutePrivateZoneInCenToVpcResponse unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unroutePrivateZoneInCenToVpcWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove tags from resources.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove tags from resources.</p>
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
     * <p>Modifies the name and description of a traffic scheduling policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosPolicyAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a traffic scheduling policy.</p>
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
     * <p>Calls the UpdateCenInterRegionTrafficQosQueueAttribute operation to modify the name, description, cross-region bandwidth, and DSCP value configurations of a queue in a traffic scheduling policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCenInterRegionTrafficQosQueueAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdateCenInterRegionTrafficQosQueueAttribute operation to modify the name, description, cross-region bandwidth, and DSCP value configurations of a queue in a traffic scheduling policy.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrafficMarkingPolicyAttributeResponse());
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
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the modification of the transit router instance is not yet complete. The modification task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Modifying</strong> state, the transit router instance is being modified. In this state, you can only query the transit router instance but cannot perform other operations on it.</li>
     * <li>If the transit router instance is in the <strong>Active</strong> state, the transit router instance has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a transit router instance.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the modification of the transit router instance is not yet complete. The modification task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Modifying</strong> state, the transit router instance is being modified. In this state, you can only query the transit router instance but cannot perform other operations on it.</li>
     * <li>If the transit router instance is in the <strong>Active</strong> state, the transit router instance has been modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name and description of a transit router instance.</p>
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
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. The system returns a RequestId immediately, but the ECR connection has not been modified yet because the modification task is still running in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of the ECR connection.
     * If the ECR connection is in the Modifying state, the ECR connection is being modified. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the ECR connection is in the Attached state, the ECR connection has been modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the UpdateTransitRouterEcrAttachmentAttribute operation to modify the name and description of an Express Connect Router (ECR) connection under an Enterprise Edition transit router.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterEcrAttachmentAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. The system returns a RequestId immediately, but the ECR connection has not been modified yet because the modification task is still running in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of the ECR connection.
     * If the ECR connection is in the Modifying state, the ECR connection is being modified. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the ECR connection is in the Attached state, the ECR connection has been modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the UpdateTransitRouterEcrAttachmentAttribute operation to modify the name and description of an Express Connect Router (ECR) connection under an Enterprise Edition transit router.</p>
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
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an inter-region connection on an Enterprise Edition transit router by calling the UpdateTransitRouterPeerAttachmentAttribute operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterPeerAttachmentAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of an inter-region connection on an Enterprise Edition transit router by calling the UpdateTransitRouterPeerAttachmentAttribute operation.</p>
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
     * <p>Modifies the name and description of a route entry in an Enterprise Edition transit router route table.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name and description of a route entry in an Enterprise Edition transit router route table.</p>
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
     * <p>Calls the UpdateTransitRouterRouteTable operation to modify the name and description of an Enterprise Edition transit router route table and to enable or disable multi-region equal-cost multi-path (ECMP) routing.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterRouteTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdateTransitRouterRouteTable operation to modify the name and description of an Enterprise Edition transit router route table and to enable or disable multi-region equal-cost multi-path (ECMP) routing.</p>
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
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. In this state, you can only query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and automatic route forwarding settings of a virtual border router (VBR) connection on an Enterprise Edition transit router.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVbrAttachmentAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. In this state, you can only query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, and automatic route forwarding settings of a virtual border router (VBR) connection on an Enterprise Edition transit router.</p>
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
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection has not been modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the UpdateTransitRouterVpcAttachmentAttribute operation to modify the name and description of a VPC connection under an Enterprise Edition transit router and specifies whether the Enterprise Edition transit router automatically publishes routing to the VPC-connected instance.</p>
     * 
     * @param tmpReq UpdateTransitRouterVpcAttachmentAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTransitRouterVpcAttachmentAttributeResponse
     */
    public UpdateTransitRouterVpcAttachmentAttributeResponse updateTransitRouterVpcAttachmentAttributeWithOptions(UpdateTransitRouterVpcAttachmentAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTransitRouterVpcAttachmentAttributeShrinkRequest request = new UpdateTransitRouterVpcAttachmentAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "Options", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("Options", request.optionsShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpcAttachmentAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection has not been modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the UpdateTransitRouterVpcAttachmentAttribute operation to modify the name and description of a VPC connection under an Enterprise Edition transit router and specifies whether the Enterprise Edition transit router automatically publishes routing to the VPC-connected instance.</p>
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
     * <ul>
     * <li>When you add zones and vSwitches to a VPC connection, make sure that the vSwitch has an idle IP address. During the modification procedure, the Enterprise Edition transit router creates an elastic network interfaces (ENIs) in the vSwitch (which occupies one IP address of the vSwitch) as the interface for routing traffic between the VPC-connected instance and the Enterprise Edition transit router.</li>
     * <li>The <strong>UpdateTransitRouterVpcAttachmentZones</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet modified. The modification task continues to run in the background. You can invoke the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
     * <li>At least one zone and vSwitch mapping must be retained under a <strong>VPC connection ID</strong>. You cannot delete all zone and vSwitch mappings.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the zones and vSwitches associated with a virtual private cloud (VPC) connection by calling the UpdateTransitRouterVpcAttachmentZones operation.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpcAttachmentZonesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you add zones and vSwitches to a VPC connection, make sure that the vSwitch has an idle IP address. During the modification procedure, the Enterprise Edition transit router creates an elastic network interfaces (ENIs) in the vSwitch (which occupies one IP address of the vSwitch) as the interface for routing traffic between the VPC-connected instance and the Enterprise Edition transit router.</li>
     * <li>The <strong>UpdateTransitRouterVpcAttachmentZones</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet modified. The modification task continues to run in the background. You can invoke the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
     * <li>At least one zone and vSwitch mapping must be retained under a <strong>VPC connection ID</strong>. You cannot delete all zone and vSwitch mappings.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the zones and vSwitches associated with a virtual private cloud (VPC) connection by calling the UpdateTransitRouterVpcAttachmentZones operation.</p>
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
     * <p>Calls the UpdateTransitRouterVpnAttachmentAttribute operation to modify the name, description, and whether to automatically publish route entries for a VPN connection under an Enterprise Edition transit router.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTransitRouterVpnAttachmentAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UpdateTransitRouterVpnAttachmentAttribute operation to modify the name, description, and whether to automatically publish route entries for a VPN connection under an Enterprise Edition transit router.</p>
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
     * <p>Calls the WithdrawPublishedRouteEntries operation to withdraw routing entries that have been published from a virtual private cloud (VPC) or virtual border router (VBR) instance to Cloud Enterprise Network (CEN).</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawPublishedRouteEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the WithdrawPublishedRouteEntries operation to withdraw routing entries that have been published from a virtual private cloud (VPC) or virtual border router (VBR) instance to Cloud Enterprise Network (CEN).</p>
     * 
     * @param request WithdrawPublishedRouteEntriesRequest
     * @return WithdrawPublishedRouteEntriesResponse
     */
    public WithdrawPublishedRouteEntriesResponse withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawPublishedRouteEntriesWithOptions(request, runtime);
    }
}
