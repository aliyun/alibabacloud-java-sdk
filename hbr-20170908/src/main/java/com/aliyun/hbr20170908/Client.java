// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908;

import com.aliyun.tea.*;
import com.aliyun.hbr20170908.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-fujian", "hbr.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hbr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hbr.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hbr.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hbr.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hbr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hbr.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hbr.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hbr.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hbr.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hbr.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hbr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Registers a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @param request AddContainerClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddContainerClusterResponse
     */
    public AddContainerClusterResponse addContainerClusterWithOptions(AddContainerClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddContainerCluster"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddContainerClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers a Container Service for Kubernetes (ACK) cluster.</p>
     * 
     * @param request AddContainerClusterRequest
     * @return AddContainerClusterResponse
     */
    public AddContainerClusterResponse addContainerCluster(AddContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addContainerClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a backup job.</p>
     * 
     * @param request CancelBackupJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelBackupJobResponse
     */
    public CancelBackupJobResponse cancelBackupJobWithOptions(CancelBackupJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelBackupJob"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelBackupJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a backup job.</p>
     * 
     * @param request CancelBackupJobRequest
     * @return CancelBackupJobResponse
     */
    public CancelBackupJobResponse cancelBackupJob(CancelBackupJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelBackupJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a restore job.</p>
     * 
     * @param request CancelRestoreJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRestoreJobResponse
     */
    public CancelRestoreJobResponse cancelRestoreJobWithOptions(CancelRestoreJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreId)) {
            query.put("RestoreId", request.restoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRestoreJob"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRestoreJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a restore job.</p>
     * 
     * @param request CancelRestoreJobRequest
     * @return CancelRestoreJobResponse
     */
    public CancelRestoreJobResponse cancelRestoreJob(CancelRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRestoreJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  In the Cloud Backup console, you can use resource groups to manage resources such as backup vaults, Cloud Backup clients, and SAP HANA instances.</p>
     * <ul>
     * <li>A resource is a cloud service entity that you create on Alibaba Cloud, such as an Elastic Compute Service (ECS) instance, a backup vault, or an SAP HANA instance.</li>
     * <li>You can sort resources owned by your Alibaba Cloud account into various resource groups. Resource groups facilitate resource management among multiple projects or applications within your Alibaba Cloud account and simplify permission management.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which an instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2017-09-08"),
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
     * <b>description</b> :
     * <p>  In the Cloud Backup console, you can use resource groups to manage resources such as backup vaults, Cloud Backup clients, and SAP HANA instances.</p>
     * <ul>
     * <li>A resource is a cloud service entity that you create on Alibaba Cloud, such as an Elastic Compute Service (ECS) instance, a backup vault, or an SAP HANA instance.</li>
     * <li>You can sort resources owned by your Alibaba Cloud account into various resource groups. Resource groups facilitate resource management among multiple projects or applications within your Alibaba Cloud account and simplify permission management.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the resource group to which an instance belongs.</p>
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
     * <p>Checks whether the user has permissions to access the current resource or page.</p>
     * 
     * @param request CheckRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckRoleResponse
     */
    public CheckRoleResponse checkRoleWithOptions(CheckRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkRoleType)) {
            query.put("CheckRoleType", request.checkRoleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRole"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the user has permissions to access the current resource or page.</p>
     * 
     * @param request CheckRoleRequest
     * @return CheckRoleResponse
     */
    public CheckRoleResponse checkRole(CheckRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a backup job.</p>
     * 
     * @param tmpReq CreateBackupJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupJobResponse
     */
    public CreateBackupJobResponse createBackupJobWithOptions(CreateBackupJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBackupJobShrinkRequest request = new CreateBackupJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detail)) {
            request.detailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detail, "Detail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerClusterId)) {
            query.put("ContainerClusterId", request.containerClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerResources)) {
            query.put("ContainerResources", request.containerResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailShrink)) {
            query.put("Detail", request.detailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclude)) {
            query.put("Exclude", request.exclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.include)) {
            query.put("Include", request.include);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiatedByAck)) {
            query.put("InitiatedByAck", request.initiatedByAck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speedLimit)) {
            query.put("SpeedLimit", request.speedLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackupJob"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a backup job.</p>
     * 
     * @param request CreateBackupJobRequest
     * @return CreateBackupJobResponse
     */
    public CreateBackupJobResponse createBackupJob(CreateBackupJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup plan associates data sources with backup policies and other necessary information for backups. After the execution of a backup plan, it generates a backup task that records the progress and results of the backup. If the backup task is successful, a backup snapshot is created. You can use the backup snapshot to create a recovery task.</li>
     * <li>A backup plan supports only one type of data source.</li>
     * <li>A backup plan supports only a single fixed interval backup cycle strategy.</li>
     * <li>A backup plan can back up to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a backup plan.</p>
     * 
     * @param tmpReq CreateBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupPlanResponse
     */
    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBackupPlanShrinkRequest request = new CreateBackupPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destDataSourceDetail)) {
            request.destDataSourceDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destDataSourceDetail, "DestDataSourceDetail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detail)) {
            request.detailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detail, "Detail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otsDetail)) {
            request.otsDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otsDetail, "OtsDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeListPath)) {
            query.put("ChangeListPath", request.changeListPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destDataSourceDetailShrink)) {
            query.put("DestDataSourceDetail", request.destDataSourceDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destDataSourceId)) {
            query.put("DestDataSourceId", request.destDataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destSourceType)) {
            query.put("DestSourceType", request.destSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailShrink)) {
            query.put("Detail", request.detailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepLatestSnapshots)) {
            query.put("KeepLatestSnapshots", request.keepLatestSnapshots);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            query.put("Schedule", request.schedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udmRegionId)) {
            query.put("UdmRegionId", request.udmRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclude)) {
            body.put("Exclude", request.exclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.include)) {
            body.put("Include", request.include);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otsDetailShrink)) {
            body.put("OtsDetail", request.otsDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            body.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speedLimit)) {
            body.put("SpeedLimit", request.speedLimit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A backup plan associates data sources with backup policies and other necessary information for backups. After the execution of a backup plan, it generates a backup task that records the progress and results of the backup. If the backup task is successful, a backup snapshot is created. You can use the backup snapshot to create a recovery task.</li>
     * <li>A backup plan supports only one type of data source.</li>
     * <li>A backup plan supports only a single fixed interval backup cycle strategy.</li>
     * <li>A backup plan can back up to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a backup plan.</p>
     * 
     * @param request CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Cloud Backup. For more information, see <a href="https://help.aliyun.com/document_detail/89062.html">Billing methods and billable items</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs one or more Cloud Backup clients on specified instances.</p>
     * 
     * @param request CreateClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientsResponse
     */
    public CreateClientsResponse createClientsWithOptions(CreateClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertSetting)) {
            query.put("AlertSetting", request.alertSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfo)) {
            query.put("ClientInfo", request.clientInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useHttps)) {
            query.put("UseHttps", request.useHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of Cloud Backup. For more information, see <a href="https://help.aliyun.com/document_detail/89062.html">Billing methods and billable items</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs one or more Cloud Backup clients on specified instances.</p>
     * 
     * @param request CreateClientsRequest
     * @return CreateClientsResponse
     */
    public CreateClientsResponse createClients(CreateClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup plan for an SAP HANA instance.</p>
     * 
     * @param request CreateHanaBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHanaBackupPlanResponse
     */
    public CreateHanaBackupPlanResponse createHanaBackupPlanWithOptions(CreateHanaBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPrefix)) {
            query.put("BackupPrefix", request.backupPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            query.put("Schedule", request.schedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHanaBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHanaBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup plan for an SAP HANA instance.</p>
     * 
     * @param request CreateHanaBackupPlanRequest
     * @return CreateHanaBackupPlanResponse
     */
    public CreateHanaBackupPlanResponse createHanaBackupPlan(CreateHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To register an SAP HANA instance, you must configure the SAP HANA connection information. After the SAP HANA instance is registered, Cloud Backup installs a backup client on the node of the SAP HANA instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers an SAP HANA instance.</p>
     * 
     * @param request CreateHanaInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHanaInstanceResponse
     */
    public CreateHanaInstanceResponse createHanaInstanceWithOptions(CreateHanaInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertSetting)) {
            query.put("AlertSetting", request.alertSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hanaName)) {
            query.put("HanaName", request.hanaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNumber)) {
            query.put("InstanceNumber", request.instanceNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSsl)) {
            query.put("UseSsl", request.useSsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateCertificate)) {
            query.put("ValidateCertificate", request.validateCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHanaInstance"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHanaInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>To register an SAP HANA instance, you must configure the SAP HANA connection information. After the SAP HANA instance is registered, Cloud Backup installs a backup client on the node of the SAP HANA instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers an SAP HANA instance.</p>
     * 
     * @param request CreateHanaInstanceRequest
     * @return CreateHanaInstanceResponse
     */
    public CreateHanaInstanceResponse createHanaInstance(CreateHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see <a href="https://help.aliyun.com/document_detail/101178.html">Restore databases to an SAP HANA instance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a restore job for an SAP HANA database.</p>
     * 
     * @param request CreateHanaRestoreRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHanaRestoreResponse
     */
    public CreateHanaRestoreResponse createHanaRestoreWithOptions(CreateHanaRestoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPrefix)) {
            query.put("BackupPrefix", request.backupPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkAccess)) {
            query.put("CheckAccess", request.checkAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clearLog)) {
            query.put("ClearLog", request.clearLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logPosition)) {
            query.put("LogPosition", request.logPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterClientId)) {
            query.put("MasterClientId", request.masterClientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointInTime)) {
            query.put("RecoveryPointInTime", request.recoveryPointInTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidAdmin)) {
            query.put("SidAdmin", request.sidAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceClusterId)) {
            query.put("SourceClusterId", request.sourceClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemCopy)) {
            query.put("SystemCopy", request.systemCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCatalog)) {
            query.put("UseCatalog", request.useCatalog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDelta)) {
            query.put("UseDelta", request.useDelta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeId)) {
            query.put("VolumeId", request.volumeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHanaRestore"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHanaRestoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see <a href="https://help.aliyun.com/document_detail/101178.html">Restore databases to an SAP HANA instance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a restore job for an SAP HANA database.</p>
     * 
     * @param request CreateHanaRestoreRequest
     * @return CreateHanaRestoreResponse
     */
    public CreateHanaRestoreResponse createHanaRestore(CreateHanaRestoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaRestoreWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can bind data sources to only one policy in each request.</p>
     * <ul>
     * <li>Elastic Compute Service (ECS) instances can be bound to only one policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds one or more data sources to a backup policy.</p>
     * 
     * @param tmpReq CreatePolicyBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyBindingsResponse
     */
    public CreatePolicyBindingsResponse createPolicyBindingsWithOptions(CreatePolicyBindingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePolicyBindingsShrinkRequest request = new CreatePolicyBindingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policyBindingList)) {
            request.policyBindingListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policyBindingList, "PolicyBindingList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyBindingListShrink)) {
            query.put("PolicyBindingList", request.policyBindingListShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyBindings"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyBindingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can bind data sources to only one policy in each request.</p>
     * <ul>
     * <li>Elastic Compute Service (ECS) instances can be bound to only one policy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds one or more data sources to a backup policy.</p>
     * 
     * @param request CreatePolicyBindingsRequest
     * @return CreatePolicyBindingsResponse
     */
    public CreatePolicyBindingsResponse createPolicyBindings(CreatePolicyBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyBindingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.</li>
     * <li>You can specify only one interval as a backup cycle in a backup policy.</li>
     * <li>Each backup policy allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup policy.</p>
     * 
     * @param tmpReq CreatePolicyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyV2Response
     */
    public CreatePolicyV2Response createPolicyV2WithOptions(CreatePolicyV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePolicyV2ShrinkRequest request = new CreatePolicyV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyDescription)) {
            body.put("PolicyDescription", request.policyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            body.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            body.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyV2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.</li>
     * <li>You can specify only one interval as a backup cycle in a backup policy.</li>
     * <li>Each backup policy allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup policy.</p>
     * 
     * @param request CreatePolicyV2Request
     * @return CreatePolicyV2Response
     */
    public CreatePolicyV2Response createPolicyV2(CreatePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.Call this operation in the region where the mirror vault resides, which is specified by the VaultRegionId parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mirror vault.</p>
     * 
     * @param request CreateReplicationVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReplicationVaultResponse
     */
    public CreateReplicationVaultResponse createReplicationVaultWithOptions(CreateReplicationVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundancyType)) {
            query.put("RedundancyType", request.redundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceRegionId)) {
            query.put("ReplicationSourceRegionId", request.replicationSourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceVaultId)) {
            query.put("ReplicationSourceVaultId", request.replicationSourceVaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultName)) {
            query.put("VaultName", request.vaultName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultRegionId)) {
            query.put("VaultRegionId", request.vaultRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultStorageClass)) {
            query.put("VaultStorageClass", request.vaultStorageClass);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReplicationVault"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReplicationVaultResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.Call this operation in the region where the mirror vault resides, which is specified by the VaultRegionId parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mirror vault.</p>
     * 
     * @param request CreateReplicationVaultRequest
     * @return CreateReplicationVaultResponse
     */
    public CreateReplicationVaultResponse createReplicationVault(CreateReplicationVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReplicationVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Create a restore job based on the selected snapshot and the restore destination.</li>
     * <li>Currently, the data source type must match the restore destination data source type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a restore job.</p>
     * 
     * @param tmpReq CreateRestoreJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRestoreJobResponse
     */
    public CreateRestoreJobResponse createRestoreJobWithOptions(CreateRestoreJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRestoreJobShrinkRequest request = new CreateRestoreJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.failbackDetail)) {
            request.failbackDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.failbackDetail, "FailbackDetail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otsDetail)) {
            request.otsDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otsDetail, "OtsDetail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.udmDetail)) {
            request.udmDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.udmDetail, "UdmDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failbackDetailShrink)) {
            query.put("FailbackDetail", request.failbackDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiatedByAck)) {
            query.put("InitiatedByAck", request.initiatedByAck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreType)) {
            query.put("RestoreType", request.restoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotHash)) {
            query.put("SnapshotHash", request.snapshotHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBucket)) {
            query.put("TargetBucket", request.targetBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetContainer)) {
            query.put("TargetContainer", request.targetContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetContainerClusterId)) {
            query.put("TargetContainerClusterId", request.targetContainerClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCreateTime)) {
            query.put("TargetCreateTime", request.targetCreateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFileSystemId)) {
            query.put("TargetFileSystemId", request.targetFileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceName)) {
            query.put("TargetInstanceName", request.targetInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPrefix)) {
            query.put("TargetPrefix", request.targetPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableName)) {
            query.put("TargetTableName", request.targetTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTime)) {
            query.put("TargetTime", request.targetTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udmDetailShrink)) {
            query.put("UdmDetail", request.udmDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udmRegionId)) {
            query.put("UdmRegionId", request.udmRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exclude)) {
            body.put("Exclude", request.exclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.include)) {
            body.put("Include", request.include);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otsDetailShrink)) {
            body.put("OtsDetail", request.otsDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            body.put("TargetInstanceId", request.targetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPath)) {
            body.put("TargetPath", request.targetPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRestoreJob"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRestoreJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Create a restore job based on the selected snapshot and the restore destination.</li>
     * <li>Currently, the data source type must match the restore destination data source type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a restore job.</p>
     * 
     * @param request CreateRestoreJobRequest
     * @return CreateRestoreJobResponse
     */
    public CreateRestoreJobResponse createRestoreJob(CreateRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRestoreJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.</li>
     * <li>For more information about how to upload a file to OSS by using a form, see OSS documentation.</li>
     * <li>The system periodically deletes files that are uploaded to OSS.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Generates the parameters and signature required for a file upload URL.</p>
     * 
     * @param request CreateTempFileUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTempFileUploadUrlResponse
     */
    public CreateTempFileUploadUrlResponse createTempFileUploadUrlWithOptions(CreateTempFileUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTempFileUploadUrl"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTempFileUploadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.</li>
     * <li>For more information about how to upload a file to OSS by using a form, see OSS documentation.</li>
     * <li>The system periodically deletes files that are uploaded to OSS.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Generates the parameters and signature required for a file upload URL.</p>
     * 
     * @param request CreateTempFileUploadUrlRequest
     * @return CreateTempFileUploadUrlResponse
     */
    public CreateTempFileUploadUrlResponse createTempFileUploadUrl(CreateTempFileUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTempFileUploadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create up to 100 backup vaults.</p>
     * <ul>
     * <li>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
     * **
     * <strong>Note</strong> Before you call this operation, make sure that you fully understand the billing of Cloud Backup.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup vault.</p>
     * 
     * @param request CreateVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVaultResponse
     */
    public CreateVaultResponse createVaultWithOptions(CreateVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replication)) {
            query.put("Replication", request.replication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultName)) {
            query.put("VaultName", request.vaultName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultRegionId)) {
            query.put("VaultRegionId", request.vaultRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultStorageClass)) {
            query.put("VaultStorageClass", request.vaultStorageClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultType)) {
            query.put("VaultType", request.vaultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wormEnabled)) {
            query.put("WormEnabled", request.wormEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVault"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVaultResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can create up to 100 backup vaults.</p>
     * <ul>
     * <li>After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
     * **
     * <strong>Note</strong> Before you call this operation, make sure that you fully understand the billing of Cloud Backup.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup vault.</p>
     * 
     * @param request CreateVaultRequest
     * @return CreateVaultResponse
     */
    public CreateVaultResponse createVault(CreateVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建备份库复制</p>
     * 
     * @param request CreateVaultReplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVaultReplicationResponse
     */
    public CreateVaultReplicationResponse createVaultReplicationWithOptions(CreateVaultReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceRegionId)) {
            query.put("ReplicationSourceRegionId", request.replicationSourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceVaultId)) {
            query.put("ReplicationSourceVaultId", request.replicationSourceVaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationTargetVaultId)) {
            query.put("ReplicationTargetVaultId", request.replicationTargetVaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVaultReplication"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVaultReplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建备份库复制</p>
     * 
     * @param request CreateVaultReplicationRequest
     * @return CreateVaultReplicationResponse
     */
    public CreateVaultReplicationResponse createVaultReplication(CreateVaultReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVaultReplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the Elastic Compute Service (ECS) instance that is used for restoration only in ECS Backup Essential Edition.</p>
     * 
     * @param tmpReq DeleteAirEcsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAirEcsInstanceResponse
     */
    public DeleteAirEcsInstanceResponse deleteAirEcsInstanceWithOptions(DeleteAirEcsInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAirEcsInstanceShrinkRequest request = new DeleteAirEcsInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uninstallClientSourceTypes)) {
            request.uninstallClientSourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uninstallClientSourceTypes, "UninstallClientSourceTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uninstallClientSourceTypesShrink)) {
            query.put("UninstallClientSourceTypes", request.uninstallClientSourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAirEcsInstance"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAirEcsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the Elastic Compute Service (ECS) instance that is used for restoration only in ECS Backup Essential Edition.</p>
     * 
     * @param request DeleteAirEcsInstanceRequest
     * @return DeleteAirEcsInstanceResponse
     */
    public DeleteAirEcsInstanceResponse deleteAirEcsInstance(DeleteAirEcsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAirEcsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the active Cloud Backup clients that receive heartbeat packets within 1 hour. You can call the UninstallBackupClients operation to uninstall a Cloud Backup client. Then, the client becomes inactive.</p>
     * <ul>
     * <li>When you perform this operation, resources that are associated with the client are also deleted, including:<ul>
     * <li>Backup plans</li>
     * <li>Backup jobs</li>
     * <li>Snapshots</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Backup client.</p>
     * 
     * @param request DeleteBackupClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupClientResponse
     */
    public DeleteBackupClientResponse deleteBackupClientWithOptions(DeleteBackupClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupClient"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupClientResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete the active Cloud Backup clients that receive heartbeat packets within 1 hour. You can call the UninstallBackupClients operation to uninstall a Cloud Backup client. Then, the client becomes inactive.</p>
     * <ul>
     * <li>When you perform this operation, resources that are associated with the client are also deleted, including:<ul>
     * <li>Backup plans</li>
     * <li>Backup jobs</li>
     * <li>Snapshots</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Cloud Backup client.</p>
     * 
     * @param request DeleteBackupClientRequest
     * @return DeleteBackupClientResponse
     */
    public DeleteBackupClientResponse deleteBackupClient(DeleteBackupClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupClientWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the resources that are related to one or more HBR clients.</p>
     * 
     * @param tmpReq DeleteBackupClientResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupClientResourceResponse
     */
    public DeleteBackupClientResourceResponse deleteBackupClientResourceWithOptions(DeleteBackupClientResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteBackupClientResourceShrinkRequest request = new DeleteBackupClientResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIdsShrink)) {
            query.put("ClientIds", request.clientIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupClientResource"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupClientResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the resources that are related to one or more HBR clients.</p>
     * 
     * @param request DeleteBackupClientResourceRequest
     * @return DeleteBackupClientResourceResponse
     */
    public DeleteBackupClientResourceResponse deleteBackupClientResource(DeleteBackupClientResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupClientResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you delete a backup plan, the backup jobs are also deleted.</p>
     * <ul>
     * <li>If you delete a backup plan, the created snapshot files are not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup plan.</p>
     * 
     * @param request DeleteBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupPlanResponse
     */
    public DeleteBackupPlanResponse deleteBackupPlanWithOptions(DeleteBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireNoRunningJobs)) {
            query.put("RequireNoRunningJobs", request.requireNoRunningJobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you delete a backup plan, the backup jobs are also deleted.</p>
     * <ul>
     * <li>If you delete a backup plan, the created snapshot files are not deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup plan.</p>
     * 
     * @param request DeleteBackupPlanRequest
     * @return DeleteBackupPlanResponse
     */
    public DeleteBackupPlanResponse deleteBackupPlan(DeleteBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupPlanWithOptions(request, runtime);
    }

    /**
     * @param request DeleteClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientResponse
     */
    public DeleteClientResponse deleteClientWithOptions(DeleteClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClient"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientResponse());
    }

    /**
     * @param request DeleteClientRequest
     * @return DeleteClientResponse
     */
    public DeleteClientResponse deleteClient(DeleteClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an SAP HANA backup plan.</p>
     * 
     * @param request DeleteHanaBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHanaBackupPlanResponse
     */
    public DeleteHanaBackupPlanResponse deleteHanaBackupPlanWithOptions(DeleteHanaBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHanaBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHanaBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an SAP HANA backup plan.</p>
     * 
     * @param request DeleteHanaBackupPlanRequest
     * @return DeleteHanaBackupPlanResponse
     */
    public DeleteHanaBackupPlanResponse deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHanaBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the backup data of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?">How to find sid user and instance number of HANA db?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an SAP HANA instance.</p>
     * 
     * @param request DeleteHanaInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHanaInstanceResponse
     */
    public DeleteHanaInstanceResponse deleteHanaInstanceWithOptions(DeleteHanaInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHanaInstance"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHanaInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the backup data of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see <a href="https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?">How to find sid user and instance number of HANA db?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an SAP HANA instance.</p>
     * 
     * @param request DeleteHanaInstanceRequest
     * @return DeleteHanaInstanceResponse
     */
    public DeleteHanaInstanceResponse deleteHanaInstance(DeleteHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHanaInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates one or more data sources from a backup policy. After you disassociate the data sources from the backup policy, the backup policy no longer protects the data sources. Proceed with caution.</p>
     * 
     * @param tmpReq DeletePolicyBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyBindingResponse
     */
    public DeletePolicyBindingResponse deletePolicyBindingWithOptions(DeletePolicyBindingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeletePolicyBindingShrinkRequest request = new DeletePolicyBindingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyBinding"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates one or more data sources from a backup policy. After you disassociate the data sources from the backup policy, the backup policy no longer protects the data sources. Proceed with caution.</p>
     * 
     * @param request DeletePolicyBindingRequest
     * @return DeletePolicyBindingResponse
     */
    public DeletePolicyBindingResponse deletePolicyBinding(DeletePolicyBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyBindingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup policy.</p>
     * 
     * @param request DeletePolicyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyV2Response
     */
    public DeletePolicyV2Response deletePolicyV2WithOptions(DeletePolicyV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyV2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup policy.</p>
     * 
     * @param request DeletePolicyV2Request
     * @return DeletePolicyV2Response
     */
    public DeletePolicyV2Response deletePolicyV2(DeletePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a backup snapshot.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a backup snapshot.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a protected disk.</p>
     * 
     * @param request DeleteUdmDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUdmDiskResponse
     */
    public DeleteUdmDiskResponse deleteUdmDiskWithOptions(DeleteUdmDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUdmDisk"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUdmDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a protected disk.</p>
     * 
     * @param request DeleteUdmDiskRequest
     * @return DeleteUdmDiskResponse
     */
    public DeleteUdmDiskResponse deleteUdmDisk(DeleteUdmDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUdmDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops protection for Elastic Compute Service (ECS) instance backup.</p>
     * 
     * @param request DeleteUdmEcsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUdmEcsInstanceResponse
     */
    public DeleteUdmEcsInstanceResponse deleteUdmEcsInstanceWithOptions(DeleteUdmEcsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUdmEcsInstance"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUdmEcsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops protection for Elastic Compute Service (ECS) instance backup.</p>
     * 
     * @param request DeleteUdmEcsInstanceRequest
     * @return DeleteUdmEcsInstanceResponse
     */
    public DeleteUdmEcsInstanceResponse deleteUdmEcsInstance(DeleteUdmEcsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUdmEcsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.</p>
     * <ul>
     * <li>After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include the Cloud Backup client of the old version, backup plans, backup jobs, snapshots, and restore jobs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup vault.</p>
     * 
     * @param request DeleteVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVaultResponse
     */
    public DeleteVaultResponse deleteVaultWithOptions(DeleteVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVault"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVaultResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.</p>
     * <ul>
     * <li>After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include the Cloud Backup client of the old version, backup plans, backup jobs, snapshots, and restore jobs.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a backup vault.</p>
     * 
     * @param request DeleteVaultRequest
     * @return DeleteVaultResponse
     */
    public DeleteVaultResponse deleteVault(DeleteVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭备份库复制</p>
     * 
     * @param request DeleteVaultReplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVaultReplicationResponse
     */
    public DeleteVaultReplicationResponse deleteVaultReplicationWithOptions(DeleteVaultReplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceRegionId)) {
            query.put("ReplicationSourceRegionId", request.replicationSourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationSourceVaultId)) {
            query.put("ReplicationSourceVaultId", request.replicationSourceVaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationTargetVaultId)) {
            query.put("ReplicationTargetVaultId", request.replicationTargetVaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVaultReplication"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVaultReplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭备份库复制</p>
     * 
     * @param request DeleteVaultReplicationRequest
     * @return DeleteVaultReplicationResponse
     */
    public DeleteVaultReplicationResponse deleteVaultReplication(DeleteVaultReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVaultReplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more HBR clients that meet the specified conditions.</p>
     * 
     * @param tmpReq DescribeBackupClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupClientsResponse
     */
    public DescribeBackupClientsResponse describeBackupClientsWithOptions(DescribeBackupClientsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeBackupClientsShrinkRequest request = new DescribeBackupClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIdsShrink)) {
            body.put("ClientIds", request.clientIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            body.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more HBR clients that meet the specified conditions.</p>
     * 
     * @param request DescribeBackupClientsRequest
     * @return DescribeBackupClientsResponse
     */
    public DescribeBackupClientsResponse describeBackupClients(DescribeBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeBackupJobs2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupJobs2Response
     */
    public DescribeBackupJobs2Response describeBackupJobs2WithOptions(DescribeBackupJobs2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupJobs2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupJobs2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeBackupJobs2Request
     * @return DescribeBackupJobs2Response
     */
    public DescribeBackupJobs2Response describeBackupJobs2(DescribeBackupJobs2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupJobs2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup plans that meet the specified conditions.</p>
     * 
     * @param request DescribeBackupPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPlansResponse
     */
    public DescribeBackupPlansResponse describeBackupPlansWithOptions(DescribeBackupPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPlans"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup plans that meet the specified conditions.</p>
     * 
     * @param request DescribeBackupPlansRequest
     * @return DescribeBackupPlansResponse
     */
    public DescribeBackupPlansResponse describeBackupPlans(DescribeBackupPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPlansWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to SAP HANA backup. For Cloud Backup clients of other data sources, call the DescribeBackupClients operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more Cloud Backup clients that meet the specified conditions.</p>
     * 
     * @param request DescribeClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientsResponse
     */
    public DescribeClientsResponse describeClientsWithOptions(DescribeClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to SAP HANA backup. For Cloud Backup clients of other data sources, call the DescribeBackupClients operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more Cloud Backup clients that meet the specified conditions.</p>
     * 
     * @param request DescribeClientsRequest
     * @return DescribeClientsResponse
     */
    public DescribeClientsResponse describeClients(DescribeClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only Container Service for Kubernetes (ACK) clusters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more container clusters that meet the specified conditions.</p>
     * 
     * @param request DescribeContainerClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerClusterResponse
     */
    public DescribeContainerClusterResponse describeContainerClusterWithOptions(DescribeContainerClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerCluster"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only Container Service for Kubernetes (ACK) clusters.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more container clusters that meet the specified conditions.</p>
     * 
     * @param request DescribeContainerClusterRequest
     * @return DescribeContainerClusterResponse
     */
    public DescribeContainerClusterResponse describeContainerCluster(DescribeContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the accounts used in cross-account backup.</p>
     * 
     * @param request DescribeCrossAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCrossAccountsResponse
     */
    public DescribeCrossAccountsResponse describeCrossAccountsWithOptions(DescribeCrossAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCrossAccounts"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCrossAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the accounts used in cross-account backup.</p>
     * 
     * @param request DescribeCrossAccountsRequest
     * @return DescribeCrossAccountsResponse
     */
    public DescribeCrossAccountsResponse describeCrossAccounts(DescribeCrossAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA backup plans that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaBackupPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaBackupPlansResponse
     */
    public DescribeHanaBackupPlansResponse describeHanaBackupPlansWithOptions(DescribeHanaBackupPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaBackupPlans"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaBackupPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA backup plans that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaBackupPlansRequest
     * @return DescribeHanaBackupPlansResponse
     */
    public DescribeHanaBackupPlansResponse describeHanaBackupPlans(DescribeHanaBackupPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupPlansWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup parameters of an SAP HANA database.</p>
     * 
     * @param request DescribeHanaBackupSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaBackupSettingResponse
     */
    public DescribeHanaBackupSettingResponse describeHanaBackupSettingWithOptions(DescribeHanaBackupSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaBackupSetting"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaBackupSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup parameters of an SAP HANA database.</p>
     * 
     * @param request DescribeHanaBackupSettingRequest
     * @return DescribeHanaBackupSettingResponse
     */
    public DescribeHanaBackupSettingResponse describeHanaBackupSetting(DescribeHanaBackupSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the final result.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA backups that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaBackupsAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaBackupsAsyncResponse
     */
    public DescribeHanaBackupsAsyncResponse describeHanaBackupsAsyncWithOptions(DescribeHanaBackupsAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDifferential)) {
            query.put("IncludeDifferential", request.includeDifferential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeIncremental)) {
            query.put("IncludeIncremental", request.includeIncremental);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeLog)) {
            query.put("IncludeLog", request.includeLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logPosition)) {
            query.put("LogPosition", request.logPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointInTime)) {
            query.put("RecoveryPointInTime", request.recoveryPointInTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceClusterId)) {
            query.put("SourceClusterId", request.sourceClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemCopy)) {
            query.put("SystemCopy", request.systemCopy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBackint)) {
            query.put("UseBackint", request.useBackint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeId)) {
            query.put("VolumeId", request.volumeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaBackupsAsync"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaBackupsAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the final result.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA backups that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaBackupsAsyncRequest
     * @return DescribeHanaBackupsAsyncResponse
     */
    public DescribeHanaBackupsAsyncResponse describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupsAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you register an SAP HANA instance and install a Cloud Backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SAP HANA databases.</p>
     * 
     * @param request DescribeHanaDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaDatabasesResponse
     */
    public DescribeHanaDatabasesResponse describeHanaDatabasesWithOptions(DescribeHanaDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaDatabases"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaDatabasesResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you register an SAP HANA instance and install a Cloud Backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SAP HANA databases.</p>
     * 
     * @param request DescribeHanaDatabasesRequest
     * @return DescribeHanaDatabasesResponse
     */
    public DescribeHanaDatabasesResponse describeHanaDatabases(DescribeHanaDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA instances that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaInstancesResponse
     */
    public DescribeHanaInstancesResponse describeHanaInstancesWithOptions(DescribeHanaInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaInstances"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA instances that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaInstancesRequest
     * @return DescribeHanaInstancesResponse
     */
    public DescribeHanaInstancesResponse describeHanaInstances(DescribeHanaInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA restore jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaRestoresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaRestoresResponse
     */
    public DescribeHanaRestoresResponse describeHanaRestoresWithOptions(DescribeHanaRestoresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.restoreId)) {
            query.put("RestoreId", request.restoreId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreStatus)) {
            query.put("RestoreStatus", request.restoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaRestores"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaRestoresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more SAP HANA restore jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeHanaRestoresRequest
     * @return DescribeHanaRestoresResponse
     */
    public DescribeHanaRestoresResponse describeHanaRestores(DescribeHanaRestoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaRestoresWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup retention period of an SAP HANA database.</p>
     * 
     * @param request DescribeHanaRetentionSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHanaRetentionSettingResponse
     */
    public DescribeHanaRetentionSettingResponse describeHanaRetentionSettingWithOptions(DescribeHanaRetentionSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHanaRetentionSetting"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHanaRetentionSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup retention period of an SAP HANA database.</p>
     * 
     * @param request DescribeHanaRetentionSettingRequest
     * @return DescribeHanaRetentionSettingResponse
     */
    public DescribeHanaRetentionSettingResponse describeHanaRetentionSetting(DescribeHanaRetentionSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaRetentionSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about Tablestore instances that are backed up.</p>
     * 
     * @param request DescribeOtsTableSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOtsTableSnapshotsResponse
     */
    public DescribeOtsTableSnapshotsResponse describeOtsTableSnapshotsWithOptions(DescribeOtsTableSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.otsInstances)) {
            bodyFlat.put("OtsInstances", request.otsInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            bodyFlat.put("SnapshotIds", request.snapshotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOtsTableSnapshots"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOtsTableSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about Tablestore instances that are backed up.</p>
     * 
     * @param request DescribeOtsTableSnapshotsRequest
     * @return DescribeOtsTableSnapshotsResponse
     */
    public DescribeOtsTableSnapshotsResponse describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOtsTableSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more backup policies.</p>
     * 
     * @param request DescribePoliciesV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePoliciesV2Response
     */
    public DescribePoliciesV2Response describePoliciesV2WithOptions(DescribePoliciesV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePoliciesV2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePoliciesV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more backup policies.</p>
     * 
     * @param request DescribePoliciesV2Request
     * @return DescribePoliciesV2Response
     */
    public DescribePoliciesV2Response describePoliciesV2(DescribePoliciesV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePoliciesV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query one or more data sources bound to a policy, or query one or more policies bound to a data source.</p>
     * 
     * @param tmpReq DescribePolicyBindingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyBindingsResponse
     */
    public DescribePolicyBindingsResponse describePolicyBindingsWithOptions(DescribePolicyBindingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePolicyBindingsShrinkRequest request = new DescribePolicyBindingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSourceIds)) {
            request.dataSourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSourceIds, "DataSourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceIdsShrink)) {
            body.put("DataSourceIds", request.dataSourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyBindings"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyBindingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query one or more data sources bound to a policy, or query one or more policies bound to a data source.</p>
     * 
     * @param request DescribePolicyBindingsRequest
     * @return DescribePolicyBindingsResponse
     */
    public DescribePolicyBindingsResponse describePolicyBindings(DescribePolicyBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyBindingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tables of a restorable Tablestore instance.</p>
     * 
     * @param request DescribeRecoverableOtsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecoverableOtsInstancesResponse
     */
    public DescribeRecoverableOtsInstancesResponse describeRecoverableOtsInstancesWithOptions(DescribeRecoverableOtsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecoverableOtsInstances"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecoverableOtsInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tables of a restorable Tablestore instance.</p>
     * 
     * @param request DescribeRecoverableOtsInstancesRequest
     * @return DescribeRecoverableOtsInstancesResponse
     */
    public DescribeRecoverableOtsInstancesResponse describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecoverableOtsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-09-08"),
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
     * <p>Queries available regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more restore jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeRestoreJobs2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRestoreJobs2Response
     */
    public DescribeRestoreJobs2Response describeRestoreJobs2WithOptions(DescribeRestoreJobs2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreType)) {
            query.put("RestoreType", request.restoreType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRestoreJobs2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRestoreJobs2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more restore jobs that meet the specified conditions.</p>
     * 
     * @param request DescribeRestoreJobs2Request
     * @return DescribeRestoreJobs2Response
     */
    public DescribeRestoreJobs2Response describeRestoreJobs2(DescribeRestoreJobs2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreJobs2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an asynchronous job.</p>
     * 
     * @param request DescribeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTaskWithOptions(DescribeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTask"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an asynchronous job.</p>
     * 
     * @param request DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    public DescribeTaskResponse describeTask(DescribeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup snapshots of an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param tmpReq DescribeUdmSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUdmSnapshotsResponse
     */
    public DescribeUdmSnapshotsResponse describeUdmSnapshotsWithOptions(DescribeUdmSnapshotsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeUdmSnapshotsShrinkRequest request = new DescribeUdmSnapshotsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.snapshotIds)) {
            request.snapshotIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.snapshotIds, "SnapshotIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udmRegionId)) {
            query.put("UdmRegionId", request.udmRegionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIdsShrink)) {
            body.put("SnapshotIds", request.snapshotIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUdmSnapshots"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUdmSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup snapshots of an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request DescribeUdmSnapshotsRequest
     * @return DescribeUdmSnapshotsResponse
     */
    public DescribeUdmSnapshotsResponse describeUdmSnapshots(DescribeUdmSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUdmSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that support cross-region replication.</p>
     * 
     * @param request DescribeVaultReplicationRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVaultReplicationRegionsResponse
     */
    public DescribeVaultReplicationRegionsResponse describeVaultReplicationRegionsWithOptions(DescribeVaultReplicationRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVaultReplicationRegions"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVaultReplicationRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that support cross-region replication.</p>
     * 
     * @param request DescribeVaultReplicationRegionsRequest
     * @return DescribeVaultReplicationRegionsResponse
     */
    public DescribeVaultReplicationRegionsResponse describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVaultReplicationRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup vaults that meet the specified conditions.</p>
     * 
     * @param request DescribeVaultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVaultsResponse
     */
    public DescribeVaultsResponse describeVaultsWithOptions(DescribeVaultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replication)) {
            query.put("Replication", request.replication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultName)) {
            query.put("VaultName", request.vaultName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultOwnerId)) {
            query.put("VaultOwnerId", request.vaultOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultRegionId)) {
            query.put("VaultRegionId", request.vaultRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultType)) {
            query.put("VaultType", request.vaultType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVaults"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVaultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup vaults that meet the specified conditions.</p>
     * 
     * @param request DescribeVaultsRequest
     * @return DescribeVaultsResponse
     */
    public DescribeVaultsResponse describeVaults(DescribeVaultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVaultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If the request is successful, the mount target is deleted.</p>
     * <ul>
     * <li>After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the <strong>Status</strong> column of the mount target of the NAS file system, the following information is displayed: <strong>This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal mount target created by Cloud Backup.</p>
     * 
     * @param request DetachNasFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachNasFileSystemResponse
     */
    public DetachNasFileSystemResponse detachNasFileSystemWithOptions(DetachNasFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachNasFileSystem"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachNasFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If the request is successful, the mount target is deleted.</p>
     * <ul>
     * <li>After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the <strong>Status</strong> column of the mount target of the NAS file system, the following information is displayed: <strong>This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an internal mount target created by Cloud Backup.</p>
     * 
     * @param request DetachNasFileSystemRequest
     * @return DetachNasFileSystemResponse
     */
    public DetachNasFileSystemResponse detachNasFileSystem(DetachNasFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachNasFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is suspended. In the DescribeBackupPlans operation, the Disabled parameter is set to true.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a backup plan.</p>
     * 
     * @param request DisableBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableBackupPlanResponse
     */
    public DisableBackupPlanResponse disableBackupPlanWithOptions(DisableBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is suspended. In the DescribeBackupPlans operation, the Disabled parameter is set to true.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a backup plan.</p>
     * 
     * @param request DisableBackupPlanRequest
     * @return DisableBackupPlanResponse
     */
    public DisableBackupPlanResponse disableBackupPlan(DisableBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To enable the backup plan again, call the EnableHanaBackupPlan operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an SAP HANA backup plan.</p>
     * 
     * @param request DisableHanaBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableHanaBackupPlanResponse
     */
    public DisableHanaBackupPlanResponse disableHanaBackupPlanWithOptions(DisableHanaBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableHanaBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableHanaBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>To enable the backup plan again, call the EnableHanaBackupPlan operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an SAP HANA backup plan.</p>
     * 
     * @param request DisableHanaBackupPlanRequest
     * @return DisableHanaBackupPlanResponse
     */
    public DisableHanaBackupPlanResponse disableHanaBackupPlan(DisableHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableHanaBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is restarted (Disabled is set to false in the DescribeBackupPlans operation). Cloud Backup continues to perform backups based on the policy specified in the backup plan.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a backup plan.</p>
     * 
     * @param request EnableBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableBackupPlanResponse
     */
    public EnableBackupPlanResponse enableBackupPlanWithOptions(EnableBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you call this operation, the backup plan is restarted (Disabled is set to false in the DescribeBackupPlans operation). Cloud Backup continues to perform backups based on the policy specified in the backup plan.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a backup plan.</p>
     * 
     * @param request EnableBackupPlanRequest
     * @return EnableBackupPlanResponse
     */
    public EnableBackupPlanResponse enableBackupPlan(EnableBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To disable the backup plan again, call the DisableHanaBackupPlan operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an SAP HANA backup plan.</p>
     * 
     * @param request EnableHanaBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableHanaBackupPlanResponse
     */
    public EnableHanaBackupPlanResponse enableHanaBackupPlanWithOptions(EnableHanaBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableHanaBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableHanaBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>To disable the backup plan again, call the DisableHanaBackupPlan operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an SAP HANA backup plan.</p>
     * 
     * @param request EnableHanaBackupPlanRequest
     * @return EnableHanaBackupPlanResponse
     */
    public EnableHanaBackupPlanResponse enableHanaBackupPlan(EnableHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableHanaBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a backup plan.</p>
     * 
     * @param request ExecuteBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteBackupPlanResponse
     */
    public ExecuteBackupPlanResponse executeBackupPlanWithOptions(ExecuteBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a backup plan.</p>
     * 
     * @param request ExecuteBackupPlanRequest
     * @return ExecuteBackupPlanResponse
     */
    public ExecuteBackupPlanResponse executeBackupPlan(ExecuteBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Execute a policy for one or all bound data sources.</p>
     * 
     * @param request ExecutePolicyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecutePolicyV2Response
     */
    public ExecutePolicyV2Response executePolicyV2WithOptions(ExecutePolicyV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecutePolicyV2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecutePolicyV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Execute a policy for one or all bound data sources.</p>
     * 
     * @param request ExecutePolicyV2Request
     * @return ExecutePolicyV2Response
     */
    public ExecutePolicyV2Response executePolicyV2(ExecutePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executePolicyV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a Resource Access Management (RAM) policy.</p>
     * 
     * @param request GenerateRamPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateRamPolicyResponse
     */
    public GenerateRamPolicyResponse generateRamPolicyWithOptions(GenerateRamPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireBasePolicy)) {
            query.put("RequireBasePolicy", request.requireBasePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateRamPolicy"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateRamPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a Resource Access Management (RAM) policy.</p>
     * 
     * @param request GenerateRamPolicyRequest
     * @return GenerateRamPolicyResponse
     */
    public GenerateRamPolicyResponse generateRamPolicy(GenerateRamPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateRamPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains download links of files such as job reports.</p>
     * 
     * @param request GetTempFileDownloadLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTempFileDownloadLinkResponse
     */
    public GetTempFileDownloadLinkResponse getTempFileDownloadLinkWithOptions(GetTempFileDownloadLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tempFileKey)) {
            query.put("TempFileKey", request.tempFileKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTempFileDownloadLink"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTempFileDownloadLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains download links of files such as job reports.</p>
     * 
     * @param request GetTempFileDownloadLinkRequest
     * @return GetTempFileDownloadLinkResponse
     */
    public GetTempFileDownloadLinkResponse getTempFileDownloadLink(GetTempFileDownloadLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTempFileDownloadLinkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/431265.html">DescribeTask</a> operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Installs an HBR client on one or more Elastic Compute Service (ECS) instances.</p>
     * 
     * @param tmpReq InstallBackupClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallBackupClientsResponse
     */
    public InstallBackupClientsResponse installBackupClientsWithOptions(InstallBackupClientsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallBackupClientsShrinkRequest request = new InstallBackupClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallBackupClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallBackupClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/431265.html">DescribeTask</a> operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Installs an HBR client on one or more Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request InstallBackupClientsRequest
     * @return InstallBackupClientsResponse
     */
    public InstallBackupClientsResponse installBackupClients(InstallBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installBackupClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已保护的资源列表</p>
     * 
     * @param request ListProtectedResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProtectedResourcesResponse
     */
    public ListProtectedResourcesResponse listProtectedResourcesWithOptions(ListProtectedResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createdByProduct)) {
            query.put("CreatedByProduct", request.createdByProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProtectedResources"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProtectedResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已保护的资源列表</p>
     * 
     * @param request ListProtectedResourcesRequest
     * @return ListProtectedResourcesResponse
     */
    public ListProtectedResourcesResponse listProtectedResources(ListProtectedResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProtectedResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates Cloud Backup.</p>
     * 
     * @param request OpenHbrServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenHbrServiceResponse
     */
    public OpenHbrServiceResponse openHbrServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenHbrService"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenHbrServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates Cloud Backup.</p>
     * @return OpenHbrServiceResponse
     */
    public OpenHbrServiceResponse openHbrService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openHbrServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup snapshots that meet the specified conditions.</p>
     * 
     * @param tmpReq SearchHistoricalSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchHistoricalSnapshotsResponse
     */
    public SearchHistoricalSnapshotsResponse searchHistoricalSnapshotsWithOptions(SearchHistoricalSnapshotsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchHistoricalSnapshotsShrinkRequest request = new SearchHistoricalSnapshotsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            query.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchHistoricalSnapshots"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchHistoricalSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more backup snapshots that meet the specified conditions.</p>
     * 
     * @param request SearchHistoricalSnapshotsRequest
     * @return SearchHistoricalSnapshotsResponse
     */
    public SearchHistoricalSnapshotsResponse searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchHistoricalSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To stop the database again, call the StopHanaDatabaseAsync operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an SAP HANA database.</p>
     * 
     * @param request StartHanaDatabaseAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartHanaDatabaseAsyncResponse
     */
    public StartHanaDatabaseAsyncResponse startHanaDatabaseAsyncWithOptions(StartHanaDatabaseAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartHanaDatabaseAsync"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartHanaDatabaseAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>To stop the database again, call the StopHanaDatabaseAsync operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an SAP HANA database.</p>
     * 
     * @param request StartHanaDatabaseAsyncRequest
     * @return StartHanaDatabaseAsyncResponse
     */
    public StartHanaDatabaseAsyncResponse startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startHanaDatabaseAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To start the database again, call the StartHanaDatabaseAsync operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an SAP HANA database.</p>
     * 
     * @param request StopHanaDatabaseAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopHanaDatabaseAsyncResponse
     */
    public StopHanaDatabaseAsyncResponse stopHanaDatabaseAsyncWithOptions(StopHanaDatabaseAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopHanaDatabaseAsync"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopHanaDatabaseAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>To start the database again, call the StartHanaDatabaseAsync operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an SAP HANA database.</p>
     * 
     * @param request StopHanaDatabaseAsyncRequest
     * @return StopHanaDatabaseAsyncResponse
     */
    public StopHanaDatabaseAsyncResponse stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopHanaDatabaseAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a Cloud Backup client from one or more Elastic Compute Service (ECS) instance.</p>
     * 
     * @param tmpReq UninstallBackupClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallBackupClientsResponse
     */
    public UninstallBackupClientsResponse uninstallBackupClientsWithOptions(UninstallBackupClientsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UninstallBackupClientsShrinkRequest request = new UninstallBackupClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIdsShrink)) {
            query.put("ClientIds", request.clientIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallBackupClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallBackupClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls a Cloud Backup client from one or more Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request UninstallBackupClientsRequest
     * @return UninstallBackupClientsResponse
     */
    public UninstallBackupClientsResponse uninstallBackupClients(UninstallBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallBackupClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls an HBR client.</p>
     * 
     * @param request UninstallClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallClientResponse
     */
    public UninstallClientResponse uninstallClientWithOptions(UninstallClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallClient"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallClientResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls an HBR client.</p>
     * 
     * @param request UninstallClientRequest
     * @return UninstallClientResponse
     */
    public UninstallClientResponse uninstallClient(UninstallClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a backup plan.</p>
     * 
     * @param tmpReq UpdateBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBackupPlanResponse
     */
    public UpdateBackupPlanResponse updateBackupPlanWithOptions(UpdateBackupPlanRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBackupPlanShrinkRequest request = new UpdateBackupPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detail)) {
            request.detailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detail, "Detail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otsDetail)) {
            request.otsDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otsDetail, "OtsDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeListPath)) {
            query.put("ChangeListPath", request.changeListPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailShrink)) {
            query.put("Detail", request.detailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepLatestSnapshots)) {
            query.put("KeepLatestSnapshots", request.keepLatestSnapshots);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            query.put("Schedule", request.schedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speedLimit)) {
            query.put("SpeedLimit", request.speedLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updatePaths)) {
            query.put("UpdatePaths", request.updatePaths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exclude)) {
            body.put("Exclude", request.exclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.include)) {
            body.put("Include", request.include);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otsDetailShrink)) {
            body.put("OtsDetail", request.otsDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            body.put("Rule", request.rule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a backup plan.</p>
     * 
     * @param request UpdateBackupPlanRequest
     * @return UpdateBackupPlanResponse
     */
    public UpdateBackupPlanResponse updateBackupPlan(UpdateBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of both the old and new HBR clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of an HBR client.</p>
     * 
     * @param request UpdateClientSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientSettingsResponse
     */
    public UpdateClientSettingsResponse updateClientSettingsWithOptions(UpdateClientSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertOnPartialComplete)) {
            query.put("AlertOnPartialComplete", request.alertOnPartialComplete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataNetworkType)) {
            query.put("DataNetworkType", request.dataNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataProxySetting)) {
            query.put("DataProxySetting", request.dataProxySetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCpuCore)) {
            query.put("MaxCpuCore", request.maxCpuCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMemory)) {
            query.put("MaxMemory", request.maxMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxWorker)) {
            query.put("MaxWorker", request.maxWorker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyHost)) {
            query.put("ProxyHost", request.proxyHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPassword)) {
            query.put("ProxyPassword", request.proxyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPort)) {
            query.put("ProxyPort", request.proxyPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyUser)) {
            query.put("ProxyUser", request.proxyUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useHttps)) {
            query.put("UseHttps", request.useHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientSettings"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the configurations of both the old and new HBR clients.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of an HBR client.</p>
     * 
     * @param request UpdateClientSettingsRequest
     * @return UpdateClientSettingsResponse
     */
    public UpdateClientSettingsResponse updateClientSettings(UpdateClientSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update container cluster information, including the container cluster name, network type, etc.</p>
     * 
     * @param request UpdateContainerClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContainerClusterResponse
     */
    public UpdateContainerClusterResponse updateContainerClusterWithOptions(UpdateContainerClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewToken)) {
            query.put("RenewToken", request.renewToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContainerCluster"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContainerClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update container cluster information, including the container cluster name, network type, etc.</p>
     * 
     * @param request UpdateContainerClusterRequest
     * @return UpdateContainerClusterResponse
     */
    public UpdateContainerClusterResponse updateContainerCluster(UpdateContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContainerClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an SAP HANA backup plan.</p>
     * 
     * @param request UpdateHanaBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHanaBackupPlanResponse
     */
    public UpdateHanaBackupPlanResponse updateHanaBackupPlanWithOptions(UpdateHanaBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPrefix)) {
            query.put("BackupPrefix", request.backupPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            query.put("Schedule", request.schedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHanaBackupPlan"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHanaBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>  A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.</p>
     * <ul>
     * <li>You can specify only one type of data source in a backup plan.</li>
     * <li>You can specify only one interval as a backup cycle in a backup plan.</li>
     * <li>Each backup plan allows you to back up data to only one backup vault.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an SAP HANA backup plan.</p>
     * 
     * @param request UpdateHanaBackupPlanRequest
     * @return UpdateHanaBackupPlanResponse
     */
    public UpdateHanaBackupPlanResponse updateHanaBackupPlan(UpdateHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the backup parameters of an SAP HANA database.</p>
     * 
     * @param request UpdateHanaBackupSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHanaBackupSettingResponse
     */
    public UpdateHanaBackupSettingResponse updateHanaBackupSettingWithOptions(UpdateHanaBackupSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogBackupParameterFile)) {
            query.put("CatalogBackupParameterFile", request.catalogBackupParameterFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogBackupUsingBackint)) {
            query.put("CatalogBackupUsingBackint", request.catalogBackupUsingBackint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataBackupParameterFile)) {
            query.put("DataBackupParameterFile", request.dataBackupParameterFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutoLogBackup)) {
            query.put("EnableAutoLogBackup", request.enableAutoLogBackup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupParameterFile)) {
            query.put("LogBackupParameterFile", request.logBackupParameterFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupTimeout)) {
            query.put("LogBackupTimeout", request.logBackupTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupUsingBackint)) {
            query.put("LogBackupUsingBackint", request.logBackupUsingBackint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHanaBackupSetting"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHanaBackupSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the backup parameters of an SAP HANA database.</p>
     * 
     * @param request UpdateHanaBackupSettingRequest
     * @return UpdateHanaBackupSettingResponse
     */
    public UpdateHanaBackupSettingResponse updateHanaBackupSetting(UpdateHanaBackupSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaBackupSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an SAP HANA instance.</p>
     * 
     * @param request UpdateHanaInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHanaInstanceResponse
     */
    public UpdateHanaInstanceResponse updateHanaInstanceWithOptions(UpdateHanaInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertSetting)) {
            query.put("AlertSetting", request.alertSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hanaName)) {
            query.put("HanaName", request.hanaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNumber)) {
            query.put("InstanceNumber", request.instanceNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSsl)) {
            query.put("UseSsl", request.useSsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateCertificate)) {
            query.put("ValidateCertificate", request.validateCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHanaInstance"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHanaInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an SAP HANA instance.</p>
     * 
     * @param request UpdateHanaInstanceRequest
     * @return UpdateHanaInstanceResponse
     */
    public UpdateHanaInstanceResponse updateHanaInstance(UpdateHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the backup retention period of an SAP HANA database.</p>
     * 
     * @param request UpdateHanaRetentionSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateHanaRetentionSettingResponse
     */
    public UpdateHanaRetentionSettingResponse updateHanaRetentionSettingWithOptions(UpdateHanaRetentionSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            query.put("Schedule", request.schedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateHanaRetentionSetting"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHanaRetentionSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.</p>
     * <ul>
     * <li>Cloud Backup deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the backup retention period of an SAP HANA database.</p>
     * 
     * @param request UpdateHanaRetentionSettingRequest
     * @return UpdateHanaRetentionSettingResponse
     */
    public UpdateHanaRetentionSettingResponse updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaRetentionSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the association between a backup policy and a data source.</p>
     * 
     * @param tmpReq UpdatePolicyBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyBindingResponse
     */
    public UpdatePolicyBindingResponse updatePolicyBindingWithOptions(UpdatePolicyBindingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePolicyBindingShrinkRequest request = new UpdatePolicyBindingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advancedOptions)) {
            request.advancedOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advancedOptions, "AdvancedOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedOptionsShrink)) {
            query.put("AdvancedOptions", request.advancedOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disabled)) {
            query.put("Disabled", request.disabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclude)) {
            query.put("Exclude", request.exclude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.include)) {
            query.put("Include", request.include);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyBindingDescription)) {
            query.put("PolicyBindingDescription", request.policyBindingDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speedLimit)) {
            query.put("SpeedLimit", request.speedLimit);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicyBinding"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the association between a backup policy and a data source.</p>
     * 
     * @param request UpdatePolicyBindingRequest
     * @return UpdatePolicyBindingResponse
     */
    public UpdatePolicyBindingResponse updatePolicyBinding(UpdatePolicyBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyBindingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a backup policy.</p>
     * 
     * @param tmpReq UpdatePolicyV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyV2Response
     */
    public UpdatePolicyV2Response updatePolicyV2WithOptions(UpdatePolicyV2Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePolicyV2ShrinkRequest request = new UpdatePolicyV2ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyDescription)) {
            body.put("PolicyDescription", request.policyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            body.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            body.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicyV2"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyV2Response());
    }

    /**
     * <b>description</b> :
     * <p>If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a backup policy.</p>
     * 
     * @param request UpdatePolicyV2Request
     * @return UpdatePolicyV2Response
     */
    public UpdatePolicyV2Response updatePolicyV2(UpdatePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration information about the backup vault.</p>
     * 
     * @param request UpdateVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVaultResponse
     */
    public UpdateVaultResponse updateVaultWithOptions(UpdateVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultName)) {
            query.put("VaultName", request.vaultName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wormEnabled)) {
            query.put("WormEnabled", request.wormEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVault"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration information about the backup vault.</p>
     * 
     * @param request UpdateVaultRequest
     * @return UpdateVaultResponse
     */
    public UpdateVaultResponse updateVault(UpdateVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an HBR client on one or more Elastic Compute Service (ECS) instances.</p>
     * 
     * @param tmpReq UpgradeBackupClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeBackupClientsResponse
     */
    public UpgradeBackupClientsResponse upgradeBackupClientsWithOptions(UpgradeBackupClientsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradeBackupClientsShrinkRequest request = new UpgradeBackupClientsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientIds)) {
            request.clientIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientIds, "ClientIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIdsShrink)) {
            query.put("ClientIds", request.clientIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountRoleName)) {
            query.put("CrossAccountRoleName", request.crossAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountType)) {
            query.put("CrossAccountType", request.crossAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAccountUserId)) {
            query.put("CrossAccountUserId", request.crossAccountUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeBackupClients"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeBackupClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.</p>
     * <ul>
     * <li>You can call the DescribeTask operation to query the execution result of an asynchronous job.</li>
     * <li>The timeout period of an asynchronous job is 15 minutes.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an HBR client on one or more Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request UpgradeBackupClientsRequest
     * @return UpgradeBackupClientsResponse
     */
    public UpgradeBackupClientsResponse upgradeBackupClients(UpgradeBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeBackupClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to upgrade a Cloud Backup client to the latest version. After the Cloud Backup client is upgraded, the version of the client cannot be rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the Cloud Backup client.</p>
     * 
     * @param request UpgradeClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClientResponse
     */
    public UpgradeClientResponse upgradeClientWithOptions(UpgradeClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaultId)) {
            query.put("VaultId", request.vaultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeClient"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClientResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to upgrade a Cloud Backup client to the latest version. After the Cloud Backup client is upgraded, the version of the client cannot be rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the Cloud Backup client.</p>
     * 
     * @param request UpgradeClientRequest
     * @return UpgradeClientResponse
     */
    public UpgradeClientResponse upgradeClient(UpgradeClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClientWithOptions(request, runtime);
    }
}
