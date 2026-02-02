// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730;

import com.aliyun.tea.*;
import com.aliyun.ebs20210730.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ebs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>A replication pair and a replication pair-consistent group replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added only to a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>Before you can add a replication pair to a replication pair-consistent group, make sure that the pair and the group are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>Up to 17 replication pairs can be added to a single replication pair-consistent group.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs in place of their original RPOs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a replication pair to a replication pair-consistent group. You can use a replication pair-consistent group to batch manage replication pairs. When you call this operation, you can specify parameters, such as ReplicaGroupId, ReplicaPairId, and ClientToken, in the request.</p>
     * 
     * @param request AddDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDiskReplicaPairResponse
     */
    public AddDiskReplicaPairResponse addDiskReplicaPairWithOptions(AddDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>A replication pair and a replication pair-consistent group replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added only to a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>Before you can add a replication pair to a replication pair-consistent group, make sure that the pair and the group are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>Up to 17 replication pairs can be added to a single replication pair-consistent group.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs in place of their original RPOs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a replication pair to a replication pair-consistent group. You can use a replication pair-consistent group to batch manage replication pairs. When you call this operation, you can specify parameters, such as ReplicaGroupId, ReplicaPairId, and ClientToken, in the request.</p>
     * 
     * @param request AddDiskReplicaPairRequest
     * @return AddDiskReplicaPairResponse
     */
    public AddDiskReplicaPairResponse addDiskReplicaPair(AddDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables CloudLens for EBS.</p>
     * 
     * @param request ApplyLensServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyLensServiceResponse
     */
    public ApplyLensServiceResponse applyLensServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyLensService"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyLensServiceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables CloudLens for EBS.</p>
     * @return ApplyLensServiceResponse
     */
    public ApplyLensServiceResponse applyLensService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyLensServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Bind disks into a enterprise-level snapshot policy.</p>
     * 
     * @param request BindEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindEnterpriseSnapshotPolicyResponse
     */
    public BindEnterpriseSnapshotPolicyResponse bindEnterpriseSnapshotPolicyWithOptions(BindEnterpriseSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskTargets)) {
            query.put("DiskTargets", request.diskTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Bind disks into a enterprise-level snapshot policy.</p>
     * 
     * @param request BindEnterpriseSnapshotPolicyRequest
     * @return BindEnterpriseSnapshotPolicyResponse
     */
    public BindEnterpriseSnapshotPolicyResponse bindEnterpriseSnapshotPolicy(BindEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables CloudLens for EBS.</p>
     * 
     * @param request CancelLensServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelLensServiceResponse
     */
    public CancelLensServiceResponse cancelLensServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelLensService"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelLensServiceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables CloudLens for EBS.</p>
     * @return CancelLensServiceResponse
     */
    public CancelLensServiceResponse cancelLensService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelLensServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an Elastic Block Storage (EBS) resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an Elastic Block Storage (EBS) resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the disaster recovery drills that were initiated from the secondary disk of a replication pair and deletes the auto-created drill disks.</p>
     * 
     * @param request ClearPairDrillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearPairDrillResponse
     */
    public ClearPairDrillResponse clearPairDrillWithOptions(ClearPairDrillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drillId)) {
            query.put("DrillId", request.drillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairId)) {
            query.put("PairId", request.pairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearPairDrill"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearPairDrillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the disaster recovery drills that were initiated from the secondary disk of a replication pair and deletes the auto-created drill disks.</p>
     * 
     * @param request ClearPairDrillRequest
     * @return ClearPairDrillResponse
     */
    public ClearPairDrillResponse clearPairDrill(ClearPairDrillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearPairDrillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the disaster recovery drills that were initiated from the secondary disks of a replication pair-consistent group and deletes the auto-created drill disks.</p>
     * 
     * @param request ClearReplicaGroupDrillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearReplicaGroupDrillResponse
     */
    public ClearReplicaGroupDrillResponse clearReplicaGroupDrillWithOptions(ClearReplicaGroupDrillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drillId)) {
            query.put("DrillId", request.drillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearReplicaGroupDrill"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearReplicaGroupDrillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clears the disaster recovery drills that were initiated from the secondary disks of a replication pair-consistent group and deletes the auto-created drill disks.</p>
     * 
     * @param request ClearReplicaGroupDrillRequest
     * @return ClearReplicaGroupDrillResponse
     */
    public ClearReplicaGroupDrillResponse clearReplicaGroupDrill(ClearReplicaGroupDrillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearReplicaGroupDrillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：创建App</p>
     * 
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTags)) {
            query.put("AppTags", request.appTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportSendEnabled)) {
            query.put("ReportSendEnabled", request.reportSendEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribePeriod)) {
            query.put("SubscribePeriod", request.subscribePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeStatus)) {
            query.put("SubscribeStatus", request.subscribeStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：创建App</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Dedicated block storage clusters are physically isolated from public block storage clusters. The owner of each dedicated block storage cluster has exclusive access to all resources in the cluster.</li>
     * <li>Disks created in a dedicated block storage cluster can be attached only to Elastic Compute Service (ECS) instances that reside in the same zone as the cluster. Before you create a dedicated block storage cluster, decide the regions and zones in which to deploy your cloud resources.</li>
     * <li>Dedicated block storage clusters are classified into basic and performance types. When you create a dedicated block storage cluster, select a cluster type based on your business requirements.</li>
     * <li>You are charged for creating dedicated block storage clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dedicated block storage cluster. When you call this operation, you can specify parameters, such as Azone, Capacity, Type, and PeriodUnit, in the request.</p>
     * 
     * @param request CreateDedicatedBlockStorageClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDedicatedBlockStorageClusterResponse
     */
    public CreateDedicatedBlockStorageClusterResponse createDedicatedBlockStorageClusterWithOptions(CreateDedicatedBlockStorageClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.azone)) {
            query.put("Azone", request.azone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbscId)) {
            query.put("DbscId", request.dbscId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbscName)) {
            query.put("DbscName", request.dbscName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedBlockStorageCluster"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedBlockStorageClusterResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Dedicated block storage clusters are physically isolated from public block storage clusters. The owner of each dedicated block storage cluster has exclusive access to all resources in the cluster.</li>
     * <li>Disks created in a dedicated block storage cluster can be attached only to Elastic Compute Service (ECS) instances that reside in the same zone as the cluster. Before you create a dedicated block storage cluster, decide the regions and zones in which to deploy your cloud resources.</li>
     * <li>Dedicated block storage clusters are classified into basic and performance types. When you create a dedicated block storage cluster, select a cluster type based on your business requirements.</li>
     * <li>You are charged for creating dedicated block storage clusters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dedicated block storage cluster. When you call this operation, you can specify parameters, such as Azone, Capacity, Type, and PeriodUnit, in the request.</p>
     * 
     * @param request CreateDedicatedBlockStorageClusterRequest
     * @return CreateDedicatedBlockStorageClusterResponse
     */
    public CreateDedicatedBlockStorageClusterResponse createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedBlockStorageClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The replication pair-consistent group feature allows you to batch manage multiple disks in disaster recovery scenarios. You can restore the data of all disks in the same replication pair-consistent group to the same point in time to allow for disaster recovery of instances.
     * Take note of the following items:</p>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Replication pair-consistent groups can be used to implement disaster recovery across zones within the same region and disaster recovery across regions.</li>
     * <li>A replication pair and a replication pair-consistent group can replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added to only a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs instead of their original RPOs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a replication pair-consistent group.</p>
     * 
     * @param request CreateDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiskReplicaGroupResponse
     */
    public CreateDiskReplicaGroupResponse createDiskReplicaGroupWithOptions(CreateDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionId)) {
            query.put("DestinationRegionId", request.destinationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationZoneId)) {
            query.put("DestinationZoneId", request.destinationZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRtc)) {
            query.put("EnableRtc", request.enableRtc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RPO)) {
            query.put("RPO", request.RPO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceZoneId)) {
            query.put("SourceZoneId", request.sourceZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The replication pair-consistent group feature allows you to batch manage multiple disks in disaster recovery scenarios. You can restore the data of all disks in the same replication pair-consistent group to the same point in time to allow for disaster recovery of instances.
     * Take note of the following items:</p>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Replication pair-consistent groups can be used to implement disaster recovery across zones within the same region and disaster recovery across regions.</li>
     * <li>A replication pair and a replication pair-consistent group can replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added to only a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs instead of their original RPOs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a replication pair-consistent group.</p>
     * 
     * @param request CreateDiskReplicaGroupRequest
     * @return CreateDiskReplicaGroupResponse
     */
    public CreateDiskReplicaGroupResponse createDiskReplicaGroup(CreateDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Async replication is a feature that protects data across regions by using the data replication capability of Elastic Block Storage (EBS). This feature can be used to asynchronously replicate data from a disk in one region to a disk in another region for disaster recovery purposes. You can use this feature to implement disaster recovery for critical business to protect data in your databases and improve business continuity. You are charged on a subscription basis for the bandwidth that is used by the async replication feature.
     * Currently, the async replication feature can asynchronously replicate data only between enhanced SSDs (ESSDs). The functionality of disks in replication pairs is limited.
     * Take note of the following items:</p>
     * <ul>
     * <li>Make sure that the source disk (primary disk) from which to replicate data and the destination disk (secondary disk) to which to replicate data are created. You can call the <a href="https://help.aliyun.com/document_detail/25513.html">CreateDisk</a> operation to create disks.</li>
     * <li>The secondary disk cannot reside in the same region as the primary disk. For information about the regions that support async replication, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>After you call this operation to create a replication pair for the primary disk and the secondary disk, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation to enable async replication to replicate data from the primary disk to the secondary disk cross regions on a periodic basis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a replication pair to asynchronously replicate data between disks.</p>
     * 
     * @param request CreateDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiskReplicaPairResponse
     */
    public CreateDiskReplicaPairResponse createDiskReplicaPairWithOptions(CreateDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationDiskId)) {
            query.put("DestinationDiskId", request.destinationDiskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionId)) {
            query.put("DestinationRegionId", request.destinationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationZoneId)) {
            query.put("DestinationZoneId", request.destinationZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRtc)) {
            query.put("EnableRtc", request.enableRtc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairName)) {
            query.put("PairName", request.pairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RPO)) {
            query.put("RPO", request.RPO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceZoneId)) {
            query.put("SourceZoneId", request.sourceZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Async replication is a feature that protects data across regions by using the data replication capability of Elastic Block Storage (EBS). This feature can be used to asynchronously replicate data from a disk in one region to a disk in another region for disaster recovery purposes. You can use this feature to implement disaster recovery for critical business to protect data in your databases and improve business continuity. You are charged on a subscription basis for the bandwidth that is used by the async replication feature.
     * Currently, the async replication feature can asynchronously replicate data only between enhanced SSDs (ESSDs). The functionality of disks in replication pairs is limited.
     * Take note of the following items:</p>
     * <ul>
     * <li>Make sure that the source disk (primary disk) from which to replicate data and the destination disk (secondary disk) to which to replicate data are created. You can call the <a href="https://help.aliyun.com/document_detail/25513.html">CreateDisk</a> operation to create disks.</li>
     * <li>The secondary disk cannot reside in the same region as the primary disk. For information about the regions that support async replication, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>After you call this operation to create a replication pair for the primary disk and the secondary disk, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation to enable async replication to replicate data from the primary disk to the secondary disk cross regions on a periodic basis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a replication pair to asynchronously replicate data between disks.</p>
     * 
     * @param request CreateDiskReplicaPairRequest
     * @return CreateDiskReplicaPairResponse
     */
    public CreateDiskReplicaPairResponse createDiskReplicaPair(CreateDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an enterprise-level snapshot policy</p>
     * 
     * @param tmpReq CreateEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnterpriseSnapshotPolicyResponse
     */
    public CreateEnterpriseSnapshotPolicyResponse createEnterpriseSnapshotPolicyWithOptions(CreateEnterpriseSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEnterpriseSnapshotPolicyShrinkRequest request = new CreateEnterpriseSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.crossRegionCopyInfo)) {
            request.crossRegionCopyInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.crossRegionCopyInfo, "CrossRegionCopyInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retainRule)) {
            request.retainRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retainRule, "RetainRule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "Schedule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.specialRetainRules)) {
            request.specialRetainRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.specialRetainRules, "SpecialRetainRules", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storageRule)) {
            request.storageRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storageRule, "StorageRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionCopyInfoShrink)) {
            query.put("CrossRegionCopyInfo", request.crossRegionCopyInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainRuleShrink)) {
            query.put("RetainRule", request.retainRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleShrink)) {
            query.put("Schedule", request.scheduleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialRetainRulesShrink)) {
            query.put("SpecialRetainRules", request.specialRetainRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageRuleShrink)) {
            query.put("StorageRule", request.storageRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an enterprise-level snapshot policy</p>
     * 
     * @param request CreateEnterpriseSnapshotPolicyRequest
     * @return CreateEnterpriseSnapshotPolicyResponse
     */
    public CreateEnterpriseSnapshotPolicyResponse createEnterpriseSnapshotPolicy(CreateEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：删除App</p>
     * 
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：删除App</p>
     * 
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Before you can delete a replication pair-consistent group, make sure that no replication pairs exist in the group.</li>
     * <li>The replication pair-consistent group that you want to delete must be in the <strong>Created</strong> (<code>created</code>), <strong>Creation Failed</strong> (<code>create_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>Failovered</strong> (<code>failovered</code>), <strong>Deleting</strong> (<code>deleting</code>), <strong>Deletion Failed</strong> (<code>delete_failed</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a replication pair-consistent group.</p>
     * 
     * @param request DeleteDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDiskReplicaGroupResponse
     */
    public DeleteDiskReplicaGroupResponse deleteDiskReplicaGroupWithOptions(DeleteDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Before you can delete a replication pair-consistent group, make sure that no replication pairs exist in the group.</li>
     * <li>The replication pair-consistent group that you want to delete must be in the <strong>Created</strong> (<code>created</code>), <strong>Creation Failed</strong> (<code>create_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>Failovered</strong> (<code>failovered</code>), <strong>Deleting</strong> (<code>deleting</code>), <strong>Deletion Failed</strong> (<code>delete_failed</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a replication pair-consistent group.</p>
     * 
     * @param request DeleteDiskReplicaGroupRequest
     * @return DeleteDiskReplicaGroupResponse
     */
    public DeleteDiskReplicaGroupResponse deleteDiskReplicaGroup(DeleteDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Stopped</strong> (<code>stopped</code>), <strong>Invalid</strong> (<code>invalid</code>), or <strong>Failovered</strong> (<code>failovered</code>) state can be deleted. This operation deletes only replication pairs. The primary and secondary disks in the deleted replication pairs are retained.</li>
     * <li>To delete a replication pair, you must call this operation in the region where the primary disk is located. After the replication pair is deleted, the functionality limits are lifted from the primary and secondary disks. For example, you can attach the secondary disk, resize the disk, or read data from or write data to the disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes replication pairs.</p>
     * 
     * @param request DeleteDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDiskReplicaPairResponse
     */
    public DeleteDiskReplicaPairResponse deleteDiskReplicaPairWithOptions(DeleteDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Stopped</strong> (<code>stopped</code>), <strong>Invalid</strong> (<code>invalid</code>), or <strong>Failovered</strong> (<code>failovered</code>) state can be deleted. This operation deletes only replication pairs. The primary and secondary disks in the deleted replication pairs are retained.</li>
     * <li>To delete a replication pair, you must call this operation in the region where the primary disk is located. After the replication pair is deleted, the functionality limits are lifted from the primary and secondary disks. For example, you can attach the secondary disk, resize the disk, or read data from or write data to the disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes replication pairs.</p>
     * 
     * @param request DeleteDiskReplicaPairRequest
     * @return DeleteDiskReplicaPairResponse
     */
    public DeleteDiskReplicaPairResponse deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a enterprise-level snapshot policy.</p>
     * 
     * @param request DeleteEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseSnapshotPolicyResponse
     */
    public DeleteEnterpriseSnapshotPolicyResponse deleteEnterpriseSnapshotPolicyWithOptions(DeleteEnterpriseSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a enterprise-level snapshot policy.</p>
     * 
     * @param request DeleteEnterpriseSnapshotPolicyRequest
     * @return DeleteEnterpriseSnapshotPolicyResponse
     */
    public DeleteEnterpriseSnapshotPolicyResponse deleteEnterpriseSnapshotPolicy(DeleteEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：查询App信息</p>
     * 
     * @param request DescribeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appNames)) {
            query.put("AppNames", request.appNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：查询App信息</p>
     * 
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can use one of the following methods to check the responses:
     *     *   Method 1: Use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value that is returned in the last call to the DescribeDisks operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.
     *     *   Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return.
     *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When <code>NextToken</code> is specified, <code>PageSize</code> and <code>PageNumber</code> do not take effect and <code>TotalCount</code> in the response is invalid.</p>
     * <ul>
     * <li>A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the <code>Attachment</code> values in the response.
     * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more disks in a dedicated block storage cluster.</p>
     * 
     * @param request DescribeDedicatedBlockStorageClusterDisksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedBlockStorageClusterDisksResponse
     */
    public DescribeDedicatedBlockStorageClusterDisksResponse describeDedicatedBlockStorageClusterDisksWithOptions(DescribeDedicatedBlockStorageClusterDisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbscId)) {
            query.put("DbscId", request.dbscId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedBlockStorageClusterDisks"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedBlockStorageClusterDisksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can use one of the following methods to check the responses:
     *     *   Method 1: Use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value that is returned in the last call to the DescribeDisks operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.
     *     *   Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return.
     *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When <code>NextToken</code> is specified, <code>PageSize</code> and <code>PageNumber</code> do not take effect and <code>TotalCount</code> in the response is invalid.</p>
     * <ul>
     * <li>A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the <code>Attachment</code> values in the response.
     * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more disks in a dedicated block storage cluster.</p>
     * 
     * @param request DescribeDedicatedBlockStorageClusterDisksRequest
     * @return DescribeDedicatedBlockStorageClusterDisksResponse
     */
    public DescribeDedicatedBlockStorageClusterDisksResponse describeDedicatedBlockStorageClusterDisks(DescribeDedicatedBlockStorageClusterDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedBlockStorageClusterDisksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> The Dedicated Block Storage Cluster feature is available only in the China (Heyuan), Indonesia (Jakarta), and China (Shenzhen) regions.</p>
     * </blockquote>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions.</li>
     * <li>We recommend that you use NextToken and MaxResults to perform paged queries. We recommend that you use MaxResults to specify the maximum number of entries to return in each request. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeDedicatedBlockStorageClusters operation to retrieve a new page of results, set NextToken to the NextToken value that is returned in the previous call and specify MaxResults to limit the number of entries returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the dedicated block storage clusters that are created.</p>
     * 
     * @param request DescribeDedicatedBlockStorageClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedBlockStorageClustersResponse
     */
    public DescribeDedicatedBlockStorageClustersResponse describeDedicatedBlockStorageClustersWithOptions(DescribeDedicatedBlockStorageClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedBlockStorageClusterId)) {
            query.put("DedicatedBlockStorageClusterId", request.dedicatedBlockStorageClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.azoneId)) {
            body.put("AzoneId", request.azoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedBlockStorageClusters"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedBlockStorageClustersResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> The Dedicated Block Storage Cluster feature is available only in the China (Heyuan), Indonesia (Jakarta), and China (Shenzhen) regions.</p>
     * </blockquote>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions.</li>
     * <li>We recommend that you use NextToken and MaxResults to perform paged queries. We recommend that you use MaxResults to specify the maximum number of entries to return in each request. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeDedicatedBlockStorageClusters operation to retrieve a new page of results, set NextToken to the NextToken value that is returned in the previous call and specify MaxResults to limit the number of entries returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the dedicated block storage clusters that are created.</p>
     * 
     * @param request DescribeDedicatedBlockStorageClustersRequest
     * @return DescribeDedicatedBlockStorageClustersResponse
     */
    public DescribeDedicatedBlockStorageClustersResponse describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedBlockStorageClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the risk events of a disk.</p>
     * 
     * @param request DescribeDiskEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskEventsResponse
     */
    public DescribeDiskEventsResponse describeDiskEventsWithOptions(DescribeDiskEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskCategory)) {
            query.put("DiskCategory", request.diskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskEvents"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskEventsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the risk events of a disk.</p>
     * 
     * @param request DescribeDiskEventsRequest
     * @return DescribeDiskEventsResponse
     */
    public DescribeDiskEventsResponse describeDiskEvents(DescribeDiskEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: <code>(EndTime - StartTime)/Period</code>.</li>
     * <li>You can query the monitoring data collected in the last three days. An error is returned if the time specified by <code>StartTime</code> is more than three days prior to the current time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the near real-time monitoring data of a disk.</p>
     * 
     * @param request DescribeDiskMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskMonitorDataResponse
     */
    public DescribeDiskMonitorDataResponse describeDiskMonitorDataWithOptions(DescribeDiskMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskMonitorData"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskMonitorDataResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: <code>(EndTime - StartTime)/Period</code>.</li>
     * <li>You can query the monitoring data collected in the last three days. An error is returned if the time specified by <code>StartTime</code> is more than three days prior to the current time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the near real-time monitoring data of a disk.</p>
     * 
     * @param request DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
     */
    public DescribeDiskMonitorDataResponse describeDiskMonitorData(DescribeDiskMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the near real-time monitoring data of disks. You can query only the burst performance data of ESSD AutoPL disks. The data is aggregated by hour.</p>
     * 
     * @param request DescribeDiskMonitorDataListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskMonitorDataListResponse
     */
    public DescribeDiskMonitorDataListResponse describeDiskMonitorDataListWithOptions(DescribeDiskMonitorDataListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskMonitorDataList"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskMonitorDataListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the near real-time monitoring data of disks. You can query only the burst performance data of ESSD AutoPL disks. The data is aggregated by hour.</p>
     * 
     * @param request DescribeDiskMonitorDataListRequest
     * @return DescribeDiskMonitorDataListResponse
     */
    public DescribeDiskMonitorDataListResponse describeDiskMonitorDataList(DescribeDiskMonitorDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskMonitorDataListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>To perform a paged query, specify the MaxResults and NextToken parameters.
     * During a paged query, when you call the DescribeDiskReplicaGroups operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaGroups operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of replication pair-consistent groups in a specific region.</p>
     * 
     * @param request DescribeDiskReplicaGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskReplicaGroupsResponse
     */
    public DescribeDiskReplicaGroupsResponse describeDiskReplicaGroupsWithOptions(DescribeDiskReplicaGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.site)) {
            query.put("Site", request.site);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskReplicaGroups"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskReplicaGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>To perform a paged query, specify the MaxResults and NextToken parameters.
     * During a paged query, when you call the DescribeDiskReplicaGroups operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaGroups operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of replication pair-consistent groups in a specific region.</p>
     * 
     * @param request DescribeDiskReplicaGroupsRequest
     * @return DescribeDiskReplicaGroupsResponse
     */
    public DescribeDiskReplicaGroupsResponse describeDiskReplicaGroups(DescribeDiskReplicaGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskReplicaGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the replication progress of a replication pair.</p>
     * 
     * @param request DescribeDiskReplicaPairProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskReplicaPairProgressResponse
     */
    public DescribeDiskReplicaPairProgressResponse describeDiskReplicaPairProgressWithOptions(DescribeDiskReplicaPairProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskReplicaPairProgress"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskReplicaPairProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the replication progress of a replication pair.</p>
     * 
     * @param request DescribeDiskReplicaPairProgressRequest
     * @return DescribeDiskReplicaPairProgressResponse
     */
    public DescribeDiskReplicaPairProgressResponse describeDiskReplicaPairProgress(DescribeDiskReplicaPairProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskReplicaPairProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>When you call this operation for a specific region, if the primary disk (source disk) or secondary disk (destination disk) of a replication pair resides in the region, information about the replication pair is displayed in the response.</li>
     * <li>If you want to perform a paged query, configure the <code>NextToken</code> and <code>MaxResults</code> parameters. During a paged query, when you call the DescribeDiskReplicaPairs operation to retrieve the first page of results, set <code>MaxResults</code> to limit the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaPairs operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about replication pairs in a specific region.</p>
     * 
     * @param request DescribeDiskReplicaPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiskReplicaPairsResponse
     */
    public DescribeDiskReplicaPairsResponse describeDiskReplicaPairsWithOptions(DescribeDiskReplicaPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairIds)) {
            query.put("PairIds", request.pairIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.site)) {
            query.put("Site", request.site);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiskReplicaPairs"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiskReplicaPairsResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>When you call this operation for a specific region, if the primary disk (source disk) or secondary disk (destination disk) of a replication pair resides in the region, information about the replication pair is displayed in the response.</li>
     * <li>If you want to perform a paged query, configure the <code>NextToken</code> and <code>MaxResults</code> parameters. During a paged query, when you call the DescribeDiskReplicaPairs operation to retrieve the first page of results, set <code>MaxResults</code> to limit the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaPairs operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about replication pairs in a specific region.</p>
     * 
     * @param request DescribeDiskReplicaPairsRequest
     * @return DescribeDiskReplicaPairsResponse
     */
    public DescribeDiskReplicaPairsResponse describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiskReplicaPairsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about enterprise-level snapshot policies. When you call this operation, you can specify parameters, such as PolicyIds, ResourceGroupId, and Tag, in the request.</p>
     * 
     * @param request DescribeEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnterpriseSnapshotPolicyResponse
     */
    public DescribeEnterpriseSnapshotPolicyResponse describeEnterpriseSnapshotPolicyWithOptions(DescribeEnterpriseSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyIds)) {
            query.put("PolicyIds", request.policyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about enterprise-level snapshot policies. When you call this operation, you can specify parameters, such as PolicyIds, ResourceGroupId, and Tag, in the request.</p>
     * 
     * @param request DescribeEnterpriseSnapshotPolicyRequest
     * @return DescribeEnterpriseSnapshotPolicyResponse
     */
    public DescribeEnterpriseSnapshotPolicyResponse describeEnterpriseSnapshotPolicy(DescribeEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk events of a disk.</p>
     * 
     * @param request DescribeEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventLevel)) {
            query.put("EventLevel", request.eventLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk events of a disk.</p>
     * 
     * @param request DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more Elastic Block Storage (EBS) devices that you created.</p>
     * 
     * @param request DescribeLensMonitorDisksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLensMonitorDisksResponse
     */
    public DescribeLensMonitorDisksResponse describeLensMonitorDisksWithOptions(DescribeLensMonitorDisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskCategory)) {
            query.put("DiskCategory", request.diskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskIdPattern)) {
            query.put("DiskIdPattern", request.diskIdPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lensTags)) {
            query.put("LensTags", request.lensTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLensMonitorDisks"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLensMonitorDisksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more Elastic Block Storage (EBS) devices that you created.</p>
     * 
     * @param request DescribeLensMonitorDisksRequest
     * @return DescribeLensMonitorDisksResponse
     */
    public DescribeLensMonitorDisksResponse describeLensMonitorDisks(DescribeLensMonitorDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLensMonitorDisksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户开通ebs数据洞察服务状态</p>
     * 
     * @param request DescribeLensServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLensServiceStatusResponse
     */
    public DescribeLensServiceStatusResponse describeLensServiceStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLensServiceStatus"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLensServiceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户开通ebs数据洞察服务状态</p>
     * @return DescribeLensServiceStatusResponse
     */
    public DescribeLensServiceStatusResponse describeLensServiceStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLensServiceStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query single metric monitoring information</p>
     * 
     * @param tmpReq DescribeMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricDataWithOptions(DescribeMetricDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeMetricDataShrinkRequest request = new DescribeMetricDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupByLabels)) {
            request.groupByLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupByLabels, "GroupByLabels", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggreOps)) {
            query.put("AggreOps", request.aggreOps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggreOverLineOps)) {
            query.put("AggreOverLineOps", request.aggreOverLineOps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByLabelsShrink)) {
            query.put("GroupByLabels", request.groupByLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricData"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query single metric monitoring information</p>
     * 
     * @param request DescribeMetricDataRequest
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disaster recovery drills that were performed on the replication pair whose secondary disk resides in a specific region.</p>
     * 
     * @param request DescribePairDrillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePairDrillsResponse
     */
    public DescribePairDrillsResponse describePairDrillsWithOptions(DescribePairDrillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drillId)) {
            query.put("DrillId", request.drillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairId)) {
            query.put("PairId", request.pairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePairDrills"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePairDrillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disaster recovery drills that were performed on the replication pair whose secondary disk resides in a specific region.</p>
     * 
     * @param request DescribePairDrillsRequest
     * @return DescribePairDrillsResponse
     */
    public DescribePairDrillsResponse describePairDrills(DescribePairDrillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePairDrillsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of regions in which Elastic Block Storage (EBS) features (such as async replication, CloudLens for EBS, and Dedicated Block Storage Cluster) are supported.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of regions in which Elastic Block Storage (EBS) features (such as async replication, CloudLens for EBS, and Dedicated Block Storage Cluster) are supported.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disaster recovery drills that were performed on the replication pair-consistent group whose secondary disk resides in a specific region.</p>
     * 
     * @param request DescribeReplicaGroupDrillsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeReplicaGroupDrillsResponse
     */
    public DescribeReplicaGroupDrillsResponse describeReplicaGroupDrillsWithOptions(DescribeReplicaGroupDrillsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drillId)) {
            query.put("DrillId", request.drillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReplicaGroupDrills"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicaGroupDrillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disaster recovery drills that were performed on the replication pair-consistent group whose secondary disk resides in a specific region.</p>
     * 
     * @param request DescribeReplicaGroupDrillsRequest
     * @return DescribeReplicaGroupDrillsResponse
     */
    public DescribeReplicaGroupDrillsResponse describeReplicaGroupDrills(DescribeReplicaGroupDrillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReplicaGroupDrillsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询解决方案实例默认配置</p>
     * 
     * @param request DescribeSolutionInstanceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSolutionInstanceConfigurationResponse
     */
    public DescribeSolutionInstanceConfigurationResponse describeSolutionInstanceConfigurationWithOptions(DescribeSolutionInstanceConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSolutionInstanceConfiguration"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSolutionInstanceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询解决方案实例默认配置</p>
     * 
     * @param request DescribeSolutionInstanceConfigurationRequest
     * @return DescribeSolutionInstanceConfigurationResponse
     */
    public DescribeSolutionInstanceConfigurationResponse describeSolutionInstanceConfiguration(DescribeSolutionInstanceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSolutionInstanceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>Query the tag key-value pairs of user\&quot;s cloud disk and snapshot. The search scope can be narrowed down by using filterTagKey.</p>
     * 
     * <b>summary</b> : 
     * <p>Centralized Role: Query User Disk Snapshot tagKeys</p>
     * 
     * @param request DescribeUserTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserTagKeysResponse
     */
    public DescribeUserTagKeysResponse describeUserTagKeysWithOptions(DescribeUserTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagFilterKey)) {
            body.put("TagFilterKey", request.tagFilterKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserTagKeys"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserTagKeysResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>Query the tag key-value pairs of user\&quot;s cloud disk and snapshot. The search scope can be narrowed down by using filterTagKey.</p>
     * 
     * <b>summary</b> : 
     * <p>Centralized Role: Query User Disk Snapshot tagKeys</p>
     * 
     * @param request DescribeUserTagKeysRequest
     * @return DescribeUserTagKeysResponse
     */
    public DescribeUserTagKeysResponse describeUserTagKeys(DescribeUserTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <blockquote>
     * <p>The dedicated block storage cluster feature is currently supported in the following regions: South China 2 (Heyuan), Indonesia (Jakarta), and South China 1 (Shenzhen).</p>
     * </blockquote>
     * <ul>
     * <li>The request parameters act as a filter, with a logical AND relationship. If any parameter is empty, the filter does not take effect.</li>
     * <li>For paginated queries, it is recommended to use the MaxResults and NextToken parameters. Usage instructions: When querying the first page, set only MaxResults to limit the number of returned entries. The NextToken in the response will serve as the token for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the value obtained from the previous response, and set MaxResults to limit the number of returned entries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Centralized Role: Query User Disk and Snapshot tagValues</p>
     * 
     * @param request DescribeUserTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserTagValuesResponse
     */
    public DescribeUserTagValuesResponse describeUserTagValuesWithOptions(DescribeUserTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagFilterValue)) {
            body.put("TagFilterValue", request.tagFilterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            body.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserTagValues"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserTagValuesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <blockquote>
     * <p>The dedicated block storage cluster feature is currently supported in the following regions: South China 2 (Heyuan), Indonesia (Jakarta), and South China 1 (Shenzhen).</p>
     * </blockquote>
     * <ul>
     * <li>The request parameters act as a filter, with a logical AND relationship. If any parameter is empty, the filter does not take effect.</li>
     * <li>For paginated queries, it is recommended to use the MaxResults and NextToken parameters. Usage instructions: When querying the first page, set only MaxResults to limit the number of returned entries. The NextToken in the response will serve as the token for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the value obtained from the previous response, and set MaxResults to limit the number of returned entries.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Centralized Role: Query User Disk and Snapshot tagValues</p>
     * 
     * @param request DescribeUserTagValuesRequest
     * @return DescribeUserTagValuesResponse
     */
    public DescribeUserTagValuesResponse describeUserTagValues(DescribeUserTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>In Failover</strong> (<code>failovering</code>), <strong>Failover Failed</strong> (<code>failover_failed</code>), or <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>After a failover is performed, the replication pair-consistent group enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>Before you perform a failover, make sure that the first full data synchronization is completed between the primary site and secondary site.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the failover feature for replication pairs in a replication pair-consistent group. When the primary disks of specific replication pairs in a replication pair-consistent group fail, you can call this operation to enable the read and write permissions on the secondary disks.</p>
     * 
     * @param request FailoverDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailoverDiskReplicaGroupResponse
     */
    public FailoverDiskReplicaGroupResponse failoverDiskReplicaGroupWithOptions(FailoverDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailoverDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailoverDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>In Failover</strong> (<code>failovering</code>), <strong>Failover Failed</strong> (<code>failover_failed</code>), or <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>After a failover is performed, the replication pair-consistent group enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>Before you perform a failover, make sure that the first full data synchronization is completed between the primary site and secondary site.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the failover feature for replication pairs in a replication pair-consistent group. When the primary disks of specific replication pairs in a replication pair-consistent group fail, you can call this operation to enable the read and write permissions on the secondary disks.</p>
     * 
     * @param request FailoverDiskReplicaGroupRequest
     * @return FailoverDiskReplicaGroupResponse
     */
    public FailoverDiskReplicaGroupResponse failoverDiskReplicaGroup(FailoverDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failoverDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable failover cannot be in the <strong>Invalid</strong> (<code>invalid</code>) or <strong>Deleted</strong> (<code>deleted</code>) state.</li>
     * <li>After a failover is performed, the replication pair enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the failover feature for replication pairs.</p>
     * 
     * @param request FailoverDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailoverDiskReplicaPairResponse
     */
    public FailoverDiskReplicaPairResponse failoverDiskReplicaPairWithOptions(FailoverDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailoverDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailoverDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable failover cannot be in the <strong>Invalid</strong> (<code>invalid</code>) or <strong>Deleted</strong> (<code>deleted</code>) state.</li>
     * <li>After a failover is performed, the replication pair enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the failover feature for replication pairs.</p>
     * 
     * @param request FailoverDiskReplicaPairRequest
     * @return FailoverDiskReplicaPairResponse
     */
    public FailoverDiskReplicaPairResponse failoverDiskReplicaPair(FailoverDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failoverDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Centralized Role: Obtain User Usage Report with reportId</p>
     * 
     * @param request GetReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportResponse
     */
    public GetReportResponse getReportWithOptions(GetReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReport"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Centralized Role: Obtain User Usage Report with reportId</p>
     * 
     * @param request GetReportRequest
     * @return GetReportResponse
     */
    public GetReportResponse getReport(GetReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步复制支持的目的地域和可用区</p>
     * 
     * @param request ListReplicaEdgeSupportedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReplicaEdgeSupportedResponse
     */
    public ListReplicaEdgeSupportedResponse listReplicaEdgeSupportedWithOptions(ListReplicaEdgeSupportedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.azone)) {
            query.put("Azone", request.azone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReplicaEdgeSupported"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReplicaEdgeSupportedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询异步复制支持的目的地域和可用区</p>
     * 
     * @param request ListReplicaEdgeSupportedRequest
     * @return ListReplicaEdgeSupportedResponse
     */
    public ListReplicaEdgeSupportedResponse listReplicaEdgeSupported(ListReplicaEdgeSupportedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReplicaEdgeSupportedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Centralized Role: Query Historical Reports</p>
     * 
     * @param request ListReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReportsResponse
     */
    public ListReportsResponse listReportsWithOptions(ListReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReports"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Centralized Role: Query Historical Reports</p>
     * 
     * @param request ListReportsRequest
     * @return ListReportsResponse
     */
    public ListReportsResponse listReports(ListReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReportsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> parameter pair (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)
     * If you set <code>Tag.N</code> and <code>ResourceId.N</code> at the same time, the EBS resources that match both the parameters are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to one or more Elastic Block Storage (EBS) resources, or queries the IDs and tags of resources in a specified non-default resource group.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("version", "2021-07-30"),
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
     * <p>Specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> parameter pair (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)
     * If you set <code>Tag.N</code> and <code>ResourceId.N</code> at the same time, the EBS resources that match both the parameters are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to one or more Elastic Block Storage (EBS) resources, or queries the IDs and tags of resources in a specified non-default resource group.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：修改App</p>
     * 
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTags)) {
            query.put("AppTags", request.appTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportSendEnabled)) {
            query.put("ReportSendEnabled", request.reportSendEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribePeriod)) {
            query.put("SubscribePeriod", request.subscribePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeStatus)) {
            query.put("SubscribeStatus", request.subscribeStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>中心化角色：修改App</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the information of a dedicated block storage cluster. The information includes the name and description of the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>修改专属集群属性OpenApi</p>
     * 
     * @param request ModifyDedicatedBlockStorageClusterAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDedicatedBlockStorageClusterAttributeResponse
     */
    public ModifyDedicatedBlockStorageClusterAttributeResponse modifyDedicatedBlockStorageClusterAttributeWithOptions(ModifyDedicatedBlockStorageClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbscId)) {
            query.put("DbscId", request.dbscId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbscName)) {
            query.put("DbscName", request.dbscName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedBlockStorageClusterAttribute"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedBlockStorageClusterAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the information of a dedicated block storage cluster. The information includes the name and description of the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>修改专属集群属性OpenApi</p>
     * 
     * @param request ModifyDedicatedBlockStorageClusterAttributeRequest
     * @return ModifyDedicatedBlockStorageClusterAttributeResponse
     */
    public ModifyDedicatedBlockStorageClusterAttributeResponse modifyDedicatedBlockStorageClusterAttribute(ModifyDedicatedBlockStorageClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedBlockStorageClusterAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, or recovery point objective (RPO) of a replication pair-consistent group.</p>
     * 
     * @param request ModifyDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskReplicaGroupResponse
     */
    public ModifyDiskReplicaGroupResponse modifyDiskReplicaGroupWithOptions(ModifyDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRtc)) {
            query.put("EnableRtc", request.enableRtc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RPO)) {
            query.put("RPO", request.RPO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name, description, or recovery point objective (RPO) of a replication pair-consistent group.</p>
     * 
     * @param request ModifyDiskReplicaGroupRequest
     * @return ModifyDiskReplicaGroupResponse
     */
    public ModifyDiskReplicaGroupResponse modifyDiskReplicaGroup(ModifyDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can have their names or descriptions modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a replication pair.</p>
     * 
     * @param request ModifyDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskReplicaPairResponse
     */
    public ModifyDiskReplicaPairResponse modifyDiskReplicaPairWithOptions(ModifyDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRtc)) {
            query.put("EnableRtc", request.enableRtc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairName)) {
            query.put("PairName", request.pairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RPO)) {
            query.put("RPO", request.RPO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can have their names or descriptions modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a replication pair.</p>
     * 
     * @param request ModifyDiskReplicaPairRequest
     * @return ModifyDiskReplicaPairResponse
     */
    public ModifyDiskReplicaPairResponse modifyDiskReplicaPair(ModifyDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the throughput status of a dedicated block storage cluster disk which has been set through the SetDedicatedBlockStorageClusterDiskThroughput API.</p>
     * 
     * @param request QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse
     */
    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse queryDedicatedBlockStorageClusterDiskThroughputStatusWithOptions(QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.qosRequestId)) {
            body.put("QosRequestId", request.qosRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDedicatedBlockStorageClusterDiskThroughputStatus"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the throughput status of a dedicated block storage cluster disk which has been set through the SetDedicatedBlockStorageClusterDiskThroughput API.</p>
     * 
     * @param request QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest
     * @return QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse
     */
    public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse queryDedicatedBlockStorageClusterDiskThroughputStatus(QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDedicatedBlockStorageClusterDiskThroughputStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Period is the time interval between data retrieval points. When set to 60 (minute interval), a maximum of 1440 data points can be returned; when set to 3600 (hour interval), a maximum of 744 data points can be returned; and when set to 86400 (day interval), a maximum of 366 data points can be returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Query dedicated block storage cluster capacity trend data, includ available capacity size and total capacity size.</p>
     * 
     * @param request QueryDedicatedBlockStorageClusterInventoryDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDedicatedBlockStorageClusterInventoryDataResponse
     */
    public QueryDedicatedBlockStorageClusterInventoryDataResponse queryDedicatedBlockStorageClusterInventoryDataWithOptions(QueryDedicatedBlockStorageClusterInventoryDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbscId)) {
            body.put("DbscId", request.dbscId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDedicatedBlockStorageClusterInventoryData"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDedicatedBlockStorageClusterInventoryDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Period is the time interval between data retrieval points. When set to 60 (minute interval), a maximum of 1440 data points can be returned; when set to 3600 (hour interval), a maximum of 744 data points can be returned; and when set to 86400 (day interval), a maximum of 366 data points can be returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Query dedicated block storage cluster capacity trend data, includ available capacity size and total capacity size.</p>
     * 
     * @param request QueryDedicatedBlockStorageClusterInventoryDataRequest
     * @return QueryDedicatedBlockStorageClusterInventoryDataResponse
     */
    public QueryDedicatedBlockStorageClusterInventoryDataResponse queryDedicatedBlockStorageClusterInventoryData(QueryDedicatedBlockStorageClusterInventoryDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDedicatedBlockStorageClusterInventoryDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group from which you want to remove a replication pair must be in the <strong>Created</strong> (<code>created</code>), <strong>Stopped</strong> (<code>stopped</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a replication pair from a replication pair-consistent group. After a replication pair is removed from a replication pair-consistent group, the pair is disassociated from the group but is not deleted.</p>
     * 
     * @param request RemoveDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDiskReplicaPairResponse
     */
    public RemoveDiskReplicaPairResponse removeDiskReplicaPairWithOptions(RemoveDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group from which you want to remove a replication pair must be in the <strong>Created</strong> (<code>created</code>), <strong>Stopped</strong> (<code>stopped</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a replication pair from a replication pair-consistent group. After a replication pair is removed from a replication pair-consistent group, the pair is disassociated from the group but is not deleted.</p>
     * 
     * @param request RemoveDiskReplicaPairRequest
     * @return RemoveDiskReplicaPairResponse
     */
    public RemoveDiskReplicaPairResponse removeDiskReplicaPair(RemoveDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <code>FailoverDiskReplicaPair</code> operation to enable failover.</li>
     * <li>Before a reverse replication is performed, the primary disks must be detached from its associated Elastic Compute Service (ECS) instance and must be in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disks.</li>
     * <li>After you enable reverse replication, you must call the <code>StartDiskReplicaPair</code> operation again to enable the async replication feature before data can be replicated from the original secondary disks to the original primary disks.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the reverse replication feature for replication pairs that belong to a replication pair-consistent group. After reverse replication is enabled, data stored on the original secondary disks is replicated to the original primary disks. When a reverse replication is being performed, the primary and secondary sites of the replication pair-consistent group remain unchanged, but data is replicated from the secondary site to the primary site.</p>
     * 
     * @param request ReprotectDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReprotectDiskReplicaGroupResponse
     */
    public ReprotectDiskReplicaGroupResponse reprotectDiskReplicaGroupWithOptions(ReprotectDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverseReplicate)) {
            query.put("ReverseReplicate", request.reverseReplicate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReprotectDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReprotectDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <code>FailoverDiskReplicaPair</code> operation to enable failover.</li>
     * <li>Before a reverse replication is performed, the primary disks must be detached from its associated Elastic Compute Service (ECS) instance and must be in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disks.</li>
     * <li>After you enable reverse replication, you must call the <code>StartDiskReplicaPair</code> operation again to enable the async replication feature before data can be replicated from the original secondary disks to the original primary disks.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the reverse replication feature for replication pairs that belong to a replication pair-consistent group. After reverse replication is enabled, data stored on the original secondary disks is replicated to the original primary disks. When a reverse replication is being performed, the primary and secondary sites of the replication pair-consistent group remain unchanged, but data is replicated from the secondary site to the primary site.</p>
     * 
     * @param request ReprotectDiskReplicaGroupRequest
     * @return ReprotectDiskReplicaGroupResponse
     */
    public ReprotectDiskReplicaGroupResponse reprotectDiskReplicaGroup(ReprotectDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reprotectDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/354358.html">FailoverDiskReplicaPair</a> operation to enable failover.</li>
     * <li>The primary disk must be detached from its associated Elastic Compute Service (ECS) instance and is in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disk.</li>
     * <li>After you enable reverse replication, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation again to activate the replication pair before data can be replicated from the original secondary disk to the original primary disk.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the reverse replication feature for a replication pair.</p>
     * 
     * @param request ReprotectDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReprotectDiskReplicaPairResponse
     */
    public ReprotectDiskReplicaPairResponse reprotectDiskReplicaPairWithOptions(ReprotectDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverseReplicate)) {
            query.put("ReverseReplicate", request.reverseReplicate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReprotectDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReprotectDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/354358.html">FailoverDiskReplicaPair</a> operation to enable failover.</li>
     * <li>The primary disk must be detached from its associated Elastic Compute Service (ECS) instance and is in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disk.</li>
     * <li>After you enable reverse replication, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation again to activate the replication pair before data can be replicated from the original secondary disk to the original primary disk.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the reverse replication feature for a replication pair.</p>
     * 
     * @param request ReprotectDiskReplicaPairRequest
     * @return ReprotectDiskReplicaPairResponse
     */
    public ReprotectDiskReplicaPairResponse reprotectDiskReplicaPair(ReprotectDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reprotectDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>In the elastic type dedicated block storage cluster, you can easily achieve the specified throughput (Bps) for the target disk. You only need to set the cloud disk ID and the target throughput, simplifying the process of configuring.</p>
     * 
     * @param request SetDedicatedBlockStorageClusterDiskThroughputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDedicatedBlockStorageClusterDiskThroughputResponse
     */
    public SetDedicatedBlockStorageClusterDiskThroughputResponse setDedicatedBlockStorageClusterDiskThroughputWithOptions(SetDedicatedBlockStorageClusterDiskThroughputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bps)) {
            body.put("Bps", request.bps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            body.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDedicatedBlockStorageClusterDiskThroughput"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDedicatedBlockStorageClusterDiskThroughputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>In the elastic type dedicated block storage cluster, you can easily achieve the specified throughput (Bps) for the target disk. You only need to set the cloud disk ID and the target throughput, simplifying the process of configuring.</p>
     * 
     * @param request SetDedicatedBlockStorageClusterDiskThroughputRequest
     * @return SetDedicatedBlockStorageClusterDiskThroughputResponse
     */
    public SetDedicatedBlockStorageClusterDiskThroughputResponse setDedicatedBlockStorageClusterDiskThroughput(SetDedicatedBlockStorageClusterDiskThroughputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDedicatedBlockStorageClusterDiskThroughputWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>If you set the <code>OneShot</code> to <code>false</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>Synchronizing</strong> (<code>syncing</code> ), <strong>Normal</strong> (<code>normal</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>If you set <code>OneShot</code> to <code>true</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>One-time Syncing</strong> (<code>manual_syncing</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state. The time interval between two consecutive one-time synchronizations must be longer than one half of the recovery point objective (RPO).</li>
     * <li>After a replication pair-consistent group is activated, the group enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first async replication to replicate all data from the primary disks to secondary disks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the async replication feature for replication pairs that belong to a replication pair-consistent group. When the async replication feature is enabled for the pairs for the first time, the system first performs a full synchronization to synchronize all data from disks at the primary site (primary disks) to disks at the secondary site (secondary disks) and then periodically synchronizes incremental data based on the recovery point objective (RPO) of the replication pair-consistent group.</p>
     * 
     * @param request StartDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDiskReplicaGroupResponse
     */
    public StartDiskReplicaGroupResponse startDiskReplicaGroupWithOptions(StartDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneShot)) {
            query.put("OneShot", request.oneShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>If you set the <code>OneShot</code> to <code>false</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>Synchronizing</strong> (<code>syncing</code> ), <strong>Normal</strong> (<code>normal</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>If you set <code>OneShot</code> to <code>true</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>One-time Syncing</strong> (<code>manual_syncing</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state. The time interval between two consecutive one-time synchronizations must be longer than one half of the recovery point objective (RPO).</li>
     * <li>After a replication pair-consistent group is activated, the group enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first async replication to replicate all data from the primary disks to secondary disks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the async replication feature for replication pairs that belong to a replication pair-consistent group. When the async replication feature is enabled for the pairs for the first time, the system first performs a full synchronization to synchronize all data from disks at the primary site (primary disks) to disks at the secondary site (secondary disks) and then periodically synchronizes incremental data based on the recovery point objective (RPO) of the replication pair-consistent group.</p>
     * 
     * @param request StartDiskReplicaGroupRequest
     * @return StartDiskReplicaGroupResponse
     */
    public StartDiskReplicaGroupResponse startDiskReplicaGroup(StartDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can be activated.</li>
     * <li>After a replication pair is activated, it enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first asynchronous replication to replicate all data from the primary disk to the secondary disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a replication pair.</p>
     * 
     * @param request StartDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDiskReplicaPairResponse
     */
    public StartDiskReplicaPairResponse startDiskReplicaPairWithOptions(StartDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneShot)) {
            query.put("OneShot", request.oneShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can be activated.</li>
     * <li>After a replication pair is activated, it enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first asynchronous replication to replicate all data from the primary disk to the secondary disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates a replication pair.</p>
     * 
     * @param request StartDiskReplicaPairRequest
     * @return StartDiskReplicaPairResponse
     */
    public StartDiskReplicaPairResponse startDiskReplicaPair(StartDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on the secondary disk, a pay-as-you-go drill disk that has the same capacity and category as the secondary disk is created in the zone where the secondary disk resides. The drill disk contains last-recovery-point data that can be used to test the completeness and correctness of applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a disaster recovery drill to ensure the continued replication and clone the data from the last recovery point of the secondary disk to a new disk. This helps you test the completeness and correctness of applications that are deployed on the disaster recovery site on a regular basis.</p>
     * 
     * @param request StartPairDrillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPairDrillResponse
     */
    public StartPairDrillResponse startPairDrillWithOptions(StartPairDrillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pairId)) {
            query.put("PairId", request.pairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPairDrill"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPairDrillResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on the secondary disk, a pay-as-you-go drill disk that has the same capacity and category as the secondary disk is created in the zone where the secondary disk resides. The drill disk contains last-recovery-point data that can be used to test the completeness and correctness of applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a disaster recovery drill to ensure the continued replication and clone the data from the last recovery point of the secondary disk to a new disk. This helps you test the completeness and correctness of applications that are deployed on the disaster recovery site on a regular basis.</p>
     * 
     * @param request StartPairDrillRequest
     * @return StartPairDrillResponse
     */
    public StartPairDrillResponse startPairDrill(StartPairDrillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPairDrillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on secondary disks, a pay-as-you-go drill disk is created in the zone where the secondary disk of each replication pair resides. The latest-recovery-point data is restored to the drill disks to test the completeness and correctness of applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a disaster recovery drill in a replication pair-consistent group to ensure the continued replication and restores data from the latest recovery point of secondary disks to new disks. This helps test the completeness and correctness of applications that are deployed on the disaster recovery site on a regular basis.</p>
     * 
     * @param request StartReplicaGroupDrillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartReplicaGroupDrillResponse
     */
    public StartReplicaGroupDrillResponse startReplicaGroupDrillWithOptions(StartReplicaGroupDrillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartReplicaGroupDrill"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartReplicaGroupDrillResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on secondary disks, a pay-as-you-go drill disk is created in the zone where the secondary disk of each replication pair resides. The latest-recovery-point data is restored to the drill disks to test the completeness and correctness of applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a disaster recovery drill in a replication pair-consistent group to ensure the continued replication and restores data from the latest recovery point of secondary disks to new disks. This helps test the completeness and correctness of applications that are deployed on the disaster recovery site on a regular basis.</p>
     * 
     * @param request StartReplicaGroupDrillRequest
     * @return StartReplicaGroupDrillResponse
     */
    public StartReplicaGroupDrillResponse startReplicaGroupDrill(StartReplicaGroupDrillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startReplicaGroupDrillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group that you want to stop must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>When a replication pair-consistent group is stopped, it enters the <strong>Stopped</strong> (<code>stopped</code>) state. If a replication pair-consistent group cannot be stopped, the state of the group remains unchanged or changes to <strong>Stop Failed</strong> (<code>stop_failed</code>). In this case, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a replication pair-consistent group. This operation stops all replication pairs in the replication pair-consistent group.</p>
     * 
     * @param request StopDiskReplicaGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDiskReplicaGroupResponse
     */
    public StopDiskReplicaGroupResponse stopDiskReplicaGroupWithOptions(StopDiskReplicaGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaGroupId)) {
            query.put("ReplicaGroupId", request.replicaGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDiskReplicaGroup"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDiskReplicaGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group that you want to stop must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>When a replication pair-consistent group is stopped, it enters the <strong>Stopped</strong> (<code>stopped</code>) state. If a replication pair-consistent group cannot be stopped, the state of the group remains unchanged or changes to <strong>Stop Failed</strong> (<code>stop_failed</code>). In this case, try again later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a replication pair-consistent group. This operation stops all replication pairs in the replication pair-consistent group.</p>
     * 
     * @param request StopDiskReplicaGroupRequest
     * @return StopDiskReplicaGroupResponse
     */
    public StopDiskReplicaGroupResponse stopDiskReplicaGroup(StopDiskReplicaGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDiskReplicaGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Initial Syncing</strong> (<code>initial_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>One-time Syncing</strong> (<code>manual_syncing</code>), or <strong>Normal</strong> (<code>normal</code>) state can be stopped. When a replication pair is stopped, it enters the Stopped (<code>stopped</code>) state. The secondary disk rolls back to the point in time when the last async replication was complete and drops all the data that is being replicated from the primary disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a replication pair.</p>
     * 
     * @param request StopDiskReplicaPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDiskReplicaPairResponse
     */
    public StopDiskReplicaPairResponse stopDiskReplicaPairWithOptions(StopDiskReplicaPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaPairId)) {
            query.put("ReplicaPairId", request.replicaPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDiskReplicaPair"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDiskReplicaPairResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Initial Syncing</strong> (<code>initial_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>One-time Syncing</strong> (<code>manual_syncing</code>), or <strong>Normal</strong> (<code>normal</code>) state can be stopped. When a replication pair is stopped, it enters the Stopped (<code>stopped</code>) state. The secondary disk rolls back to the point in time when the last async replication was complete and drops all the data that is being replicated from the primary disk.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a replication pair.</p>
     * 
     * @param request StopDiskReplicaPairRequest
     * @return StopDiskReplicaPairResponse
     */
    public StopDiskReplicaPairResponse stopDiskReplicaPair(StopDiskReplicaPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDiskReplicaPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the &quot;Tag limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds the tags to Elastic Block Storage (EBS) resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("version", "2021-07-30"),
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
     * <p>Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the &quot;Tag limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates tags and adds the tags to Elastic Block Storage (EBS) resources.</p>
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
     * <p>Unbind disks from a enterprise-level snapshot policy.</p>
     * 
     * @param request UnbindEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindEnterpriseSnapshotPolicyResponse
     */
    public UnbindEnterpriseSnapshotPolicyResponse unbindEnterpriseSnapshotPolicyWithOptions(UnbindEnterpriseSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskTargets)) {
            query.put("DiskTargets", request.diskTargets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind disks from a enterprise-level snapshot policy.</p>
     * 
     * @param request UnbindEnterpriseSnapshotPolicyRequest
     * @return UnbindEnterpriseSnapshotPolicyResponse
     */
    public UnbindEnterpriseSnapshotPolicyResponse unbindEnterpriseSnapshotPolicy(UnbindEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can remove up to 20 tags at a time.</p>
     * <ul>
     * <li>After a tag is removed from an EBS resource, the tag is automatically deleted if the tag is not added to any instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from specified Elastic Block Storage (EBS) resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("version", "2021-07-30"),
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
     * <b>description</b> :
     * <p>  You can remove up to 20 tags at a time.</p>
     * <ul>
     * <li>After a tag is removed from an EBS resource, the tag is automatically deleted if the tag is not added to any instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from specified Elastic Block Storage (EBS) resources.</p>
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
     * <p>Search for a enterprise-level snapshot policy.</p>
     * 
     * @param tmpReq UpdateEnterpriseSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnterpriseSnapshotPolicyResponse
     */
    public UpdateEnterpriseSnapshotPolicyResponse updateEnterpriseSnapshotPolicyWithOptions(UpdateEnterpriseSnapshotPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEnterpriseSnapshotPolicyShrinkRequest request = new UpdateEnterpriseSnapshotPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.crossRegionCopyInfo)) {
            request.crossRegionCopyInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.crossRegionCopyInfo, "CrossRegionCopyInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retainRule)) {
            request.retainRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retainRule, "RetainRule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "Schedule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.specialRetainRules)) {
            request.specialRetainRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.specialRetainRules, "SpecialRetainRules", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storageRule)) {
            request.storageRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storageRule, "StorageRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionCopyInfoShrink)) {
            query.put("CrossRegionCopyInfo", request.crossRegionCopyInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainRuleShrink)) {
            query.put("RetainRule", request.retainRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleShrink)) {
            query.put("Schedule", request.scheduleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialRetainRulesShrink)) {
            query.put("SpecialRetainRules", request.specialRetainRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageRuleShrink)) {
            query.put("StorageRule", request.storageRuleShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnterpriseSnapshotPolicy"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnterpriseSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Search for a enterprise-level snapshot policy.</p>
     * 
     * @param request UpdateEnterpriseSnapshotPolicyRequest
     * @return UpdateEnterpriseSnapshotPolicyResponse
     */
    public UpdateEnterpriseSnapshotPolicyResponse updateEnterpriseSnapshotPolicy(UpdateEnterpriseSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnterpriseSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新解决方案实例属性</p>
     * 
     * @param request UpdateSolutionInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSolutionInstanceAttributeResponse
     */
    public UpdateSolutionInstanceAttributeResponse updateSolutionInstanceAttributeWithOptions(UpdateSolutionInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionInstanceId)) {
            query.put("SolutionInstanceId", request.solutionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSolutionInstanceAttribute"),
            new TeaPair("version", "2021-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSolutionInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新解决方案实例属性</p>
     * 
     * @param request UpdateSolutionInstanceAttributeRequest
     * @return UpdateSolutionInstanceAttributeResponse
     */
    public UpdateSolutionInstanceAttributeResponse updateSolutionInstanceAttribute(UpdateSolutionInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSolutionInstanceAttributeWithOptions(request, runtime);
    }
}
