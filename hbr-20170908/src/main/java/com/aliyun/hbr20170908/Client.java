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
            new TeaPair("cn-beijing-finance-1", "hbr.aliyuncs.com"),
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
            new TeaPair("cn-wulanchabu", "hbr.aliyuncs.com"),
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

    public AddContainerClusterResponse addContainerCluster(AddContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addContainerClusterWithOptions(request, runtime);
    }

    public AttachNasFileSystemResponse attachNasFileSystemWithOptions(AttachNasFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AttachNasFileSystem"),
            new TeaPair("version", "2017-09-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachNasFileSystemResponse());
    }

    public AttachNasFileSystemResponse attachNasFileSystem(AttachNasFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachNasFileSystemWithOptions(request, runtime);
    }

    public CancelBackupJobResponse cancelBackupJobWithOptions(CancelBackupJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public CancelBackupJobResponse cancelBackupJob(CancelBackupJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelBackupJobWithOptions(request, runtime);
    }

    public CancelRestoreJobResponse cancelRestoreJobWithOptions(CancelRestoreJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public CancelRestoreJobResponse cancelRestoreJob(CancelRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRestoreJobWithOptions(request, runtime);
    }

    /**
      * *   In the Hybrid Backup Recovery (HBR), you can use resource groups to manage resources such as backup vaults, backup clients, and SAP HANA instances.
      * *   A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, a backup vault, or an SAP HANA instance.
      * *   You can sort resources owned by your Alibaba Cloud account into various resource groups. This facilitates resource management among multiple projects or applications within your Alibaba Cloud account and simplifies permission management.
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
      * *   In the Hybrid Backup Recovery (HBR), you can use resource groups to manage resources such as backup vaults, backup clients, and SAP HANA instances.
      * *   A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, a backup vault, or an SAP HANA instance.
      * *   You can sort resources owned by your Alibaba Cloud account into various resource groups. This facilitates resource management among multiple projects or applications within your Alibaba Cloud account and simplifies permission management.
      *
      * @param request ChangeResourceGroupRequest
      * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

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

    public CheckRoleResponse checkRole(CheckRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkRoleWithOptions(request, runtime);
    }

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

    public CreateBackupJobResponse createBackupJob(CreateBackupJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupJobWithOptions(request, runtime);
    }

    /**
      * *   A backup schedule defines the data source, backup policy, and other configurations. After you execute a backup schedule, a backup job is generated to record the backup progress and the backup result. If a backup job is complete, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup schedule.
      * *   You can specify only one interval as a backup cycle in a backup schedule.
      * *   Each backup schedule allows you to back up data to only one backup vault.
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
      * *   A backup schedule defines the data source, backup policy, and other configurations. After you execute a backup schedule, a backup job is generated to record the backup progress and the backup result. If a backup job is complete, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup schedule.
      * *   You can specify only one interval as a backup cycle in a backup schedule.
      * *   Each backup schedule allows you to back up data to only one backup vault.
      *
      * @param request CreateBackupPlanRequest
      * @return CreateBackupPlanResponse
     */
    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and pricing of Hybrid Backup Recovery (HBR). For more information, see [Billable items and billing methods](~~89062~~).
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
      * Before you call this operation, make sure that you fully understand the billing methods and pricing of Hybrid Backup Recovery (HBR). For more information, see [Billable items and billing methods](~~89062~~).
      *
      * @param request CreateClientsRequest
      * @return CreateClientsResponse
     */
    public CreateClientsResponse createClients(CreateClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientsWithOptions(request, runtime);
    }

    /**
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
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
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
      *
      * @param request CreateHanaBackupPlanRequest
      * @return CreateHanaBackupPlanResponse
     */
    public CreateHanaBackupPlanResponse createHanaBackupPlan(CreateHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaBackupPlanWithOptions(request, runtime);
    }

    /**
      * To register an SAP HANA instance, you must configure the connection parameters of the SAP HANA instance. After the SAP HANA instance is registered, HBR installs an HBR client on the ECS instance that hosts the SAP HANA instance.
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
      * To register an SAP HANA instance, you must configure the connection parameters of the SAP HANA instance. After the SAP HANA instance is registered, HBR installs an HBR client on the ECS instance that hosts the SAP HANA instance.
      *
      * @param request CreateHanaInstanceRequest
      * @return CreateHanaInstanceResponse
     */
    public CreateHanaInstanceResponse createHanaInstance(CreateHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaInstanceWithOptions(request, runtime);
    }

    /**
      * If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see [Restore databases to an SAP HANA instance](~~101178~~).
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
      * If you call this operation to restore a database, the database is restored to a specified state. Proceed with caution. For more information, see [Restore databases to an SAP HANA instance](~~101178~~).
      *
      * @param request CreateHanaRestoreRequest
      * @return CreateHanaRestoreResponse
     */
    public CreateHanaRestoreResponse createHanaRestore(CreateHanaRestoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHanaRestoreWithOptions(request, runtime);
    }

    /**
      * *   You can bind data sources to only one policy in each request.
      * *   Elastic Compute Service (ECS) instances can be bound to only one policy.
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
      * *   You can bind data sources to only one policy in each request.
      * *   Elastic Compute Service (ECS) instances can be bound to only one policy.
      *
      * @param request CreatePolicyBindingsRequest
      * @return CreatePolicyBindingsResponse
     */
    public CreatePolicyBindingsResponse createPolicyBindings(CreatePolicyBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyBindingsWithOptions(request, runtime);
    }

    /**
      * A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.
      * *   You can specify only one interval as a backup cycle in a backup policy.
      * *   Each backup policy allows you to back up data to only one backup vault.
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
      * A backup policy records the information required for backup. After you execute a backup policy, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   A backup policy supports multiple data sources. The data sources can be only Elastic Compute Service (ECS) instances.
      * *   You can specify only one interval as a backup cycle in a backup policy.
      * *   Each backup policy allows you to back up data to only one backup vault.
      *
      * @param request CreatePolicyV2Request
      * @return CreatePolicyV2Response
     */
    public CreatePolicyV2Response createPolicyV2(CreatePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyV2WithOptions(request, runtime);
    }

    /**
      * After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.
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
      * After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state.
      *
      * @param request CreateReplicationVaultRequest
      * @return CreateReplicationVaultResponse
     */
    public CreateReplicationVaultResponse createReplicationVault(CreateReplicationVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReplicationVaultWithOptions(request, runtime);
    }

    /**
      * *   You must create a restore job based on the specified backup snapshot and restore destination.
      * *   The type of the data source from which you restore data must be the same as the type of the restore destination.
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
      * *   You must create a restore job based on the specified backup snapshot and restore destination.
      * *   The type of the data source from which you restore data must be the same as the type of the restore destination.
      *
      * @param request CreateRestoreJobRequest
      * @return CreateRestoreJobResponse
     */
    public CreateRestoreJobResponse createRestoreJob(CreateRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRestoreJobWithOptions(request, runtime);
    }

    /**
      * 1.  You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.
      * 2.  For more information about how to upload a file to OSS by using a form, see OSS documentation.
      * 3.  The system periodically deletes files that are uploaded to OSS.
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
      * 1.  You can directly upload a file to Object Storage Service (OSS) by using a form based on the returned value of this operation.
      * 2.  For more information about how to upload a file to OSS by using a form, see OSS documentation.
      * 3.  The system periodically deletes files that are uploaded to OSS.
      *
      * @param request CreateTempFileUploadUrlRequest
      * @return CreateTempFileUploadUrlResponse
     */
    public CreateTempFileUploadUrlResponse createTempFileUploadUrl(CreateTempFileUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTempFileUploadUrlWithOptions(request, runtime);
    }

    /**
      * *   Each Alibaba Cloud account can create up to 100 backup vaults.
      * *   After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
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
      * *   Each Alibaba Cloud account can create up to 100 backup vaults.
      * *   After a backup vault is created, the backup vault is in the INITIALIZING state, and the system automatically runs an initialization task to initialize the backup vault. After the initialization task is completed, the backup vault is in the CREATED state. A backup job can use a backup vault to store backup data only if the backup vault is in the CREATED state.
      *
      * @param request CreateVaultRequest
      * @return CreateVaultResponse
     */
    public CreateVaultResponse createVault(CreateVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVaultWithOptions(request, runtime);
    }

    /**
      * *   You cannot delete an active backup client from which a heartbeat packet is received within the previous hour. After you call the UninstallBackupClients operation to uninstall a backup client, the status of the backup client changes to inactive.
      * *   This operation deletes the resources that are related to the backup client. The following resources are included:
      *     *   Backup plans
      *     *   Backup jobs
      *     *   Backup files
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
      * *   You cannot delete an active backup client from which a heartbeat packet is received within the previous hour. After you call the UninstallBackupClients operation to uninstall a backup client, the status of the backup client changes to inactive.
      * *   This operation deletes the resources that are related to the backup client. The following resources are included:
      *     *   Backup plans
      *     *   Backup jobs
      *     *   Backup files
      *
      * @param request DeleteBackupClientRequest
      * @return DeleteBackupClientResponse
     */
    public DeleteBackupClientResponse deleteBackupClient(DeleteBackupClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupClientWithOptions(request, runtime);
    }

    /**
      * This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.
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
      * This operation deletes only the resources that are related to HBR clients. The resources include backup plans, backup jobs, and backup snapshots. The operation does not delete HBR clients.
      *
      * @param request DeleteBackupClientResourceRequest
      * @return DeleteBackupClientResourceResponse
     */
    public DeleteBackupClientResourceResponse deleteBackupClientResource(DeleteBackupClientResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupClientResourceWithOptions(request, runtime);
    }

    /**
      * *   If you delete a backup plan, the backup jobs are also deleted.
      * *   If you delete a backup plan, the created snapshot files are not deleted.
      *
      * @param request DeleteBackupPlanRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteBackupPlanResponse
     */
    public DeleteBackupPlanResponse deleteBackupPlanWithOptions(DeleteBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
      * *   If you delete a backup plan, the backup jobs are also deleted.
      * *   If you delete a backup plan, the created snapshot files are not deleted.
      *
      * @param request DeleteBackupPlanRequest
      * @return DeleteBackupPlanResponse
     */
    public DeleteBackupPlanResponse deleteBackupPlan(DeleteBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupPlanWithOptions(request, runtime);
    }

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

    public DeleteClientResponse deleteClient(DeleteClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientWithOptions(request, runtime);
    }

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

    public DeleteHanaBackupPlanResponse deleteHanaBackupPlan(DeleteHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHanaBackupPlanWithOptions(request, runtime);
    }

    /**
      * If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the data in the HBR client of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?)
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
      * If you delete an SAP HANA instance, the existing backup data is also deleted and the running backup and restore jobs fail to be completed. Before you delete the SAP HANA instance, make sure that you no longer need the data in the HBR client of the instance and no backup or restore jobs are running for the instance. To delete an SAP HANA instance, you must specify the security identifier (SID) of the instance. The SID is three characters in length and starts with a letter. For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?)
      *
      * @param request DeleteHanaInstanceRequest
      * @return DeleteHanaInstanceResponse
     */
    public DeleteHanaInstanceResponse deleteHanaInstance(DeleteHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHanaInstanceWithOptions(request, runtime);
    }

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

    public DeletePolicyBindingResponse deletePolicyBinding(DeletePolicyBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyBindingWithOptions(request, runtime);
    }

    /**
      * If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.
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
      * If you delete a backup policy, the backup policy is disassociated with all data sources. Proceed with caution.
      *
      * @param request DeletePolicyV2Request
      * @return DeletePolicyV2Response
     */
    public DeletePolicyV2Response deletePolicyV2(DeletePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyV2WithOptions(request, runtime);
    }

    /**
      * If you delete the most recent backup file for a data source, you must set the `Force parameter to true`. Otherwise, an error occurs.
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
      * If you delete the most recent backup file for a data source, you must set the `Force parameter to true`. Otherwise, an error occurs.
      *
      * @param request DeleteSnapshotRequest
      * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
      * *   You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.
      * *   After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include backup clients of earlier versions, backup plans, backup jobs, snapshots, and restore jobs.
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
      * *   You cannot delete a backup vault within 2 hours after the backup vault is created or a backup vault that is in the INITIALIZING state.
      * *   After you delete a backup vault, all resources that are associated with the backup vault are deleted. The resources include backup clients of earlier versions, backup plans, backup jobs, snapshots, and restore jobs.
      *
      * @param request DeleteVaultRequest
      * @return DeleteVaultResponse
     */
    public DeleteVaultResponse deleteVault(DeleteVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVaultWithOptions(request, runtime);
    }

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

    public DescribeBackupClientsResponse describeBackupClients(DescribeBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupClientsWithOptions(request, runtime);
    }

    public DescribeBackupJobs2Response describeBackupJobs2WithOptions(DescribeBackupJobs2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public DescribeBackupJobs2Response describeBackupJobs2(DescribeBackupJobs2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupJobs2WithOptions(request, runtime);
    }

    public DescribeBackupPlansResponse describeBackupPlansWithOptions(DescribeBackupPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public DescribeBackupPlansResponse describeBackupPlans(DescribeBackupPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPlansWithOptions(request, runtime);
    }

    /**
      * This operation is applicable only to SAP HANA backup. For backup clients of other data sources, call the DescribeBackupClients operation.
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
      * This operation is applicable only to SAP HANA backup. For backup clients of other data sources, call the DescribeBackupClients operation.
      *
      * @param request DescribeClientsRequest
      * @return DescribeClientsResponse
     */
    public DescribeClientsResponse describeClients(DescribeClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query only Container Service for Kubernetes (ACK) clusters.
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
      * You can call this operation to query only Container Service for Kubernetes (ACK) clusters.
      *
      * @param request DescribeContainerClusterRequest
      * @return DescribeContainerClusterResponse
     */
    public DescribeContainerClusterResponse describeContainerCluster(DescribeContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerClusterWithOptions(request, runtime);
    }

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

    public DescribeCrossAccountsResponse describeCrossAccounts(DescribeCrossAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCrossAccountsWithOptions(request, runtime);
    }

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

    public DescribeHanaBackupPlansResponse describeHanaBackupPlans(DescribeHanaBackupPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupPlansWithOptions(request, runtime);
    }

    /**
      * If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.
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
      * If you want to query the backup retention period of a database, you can call the DescribeHanaRetentionSetting operation.
      *
      * @param request DescribeHanaBackupSettingRequest
      * @return DescribeHanaBackupSettingResponse
     */
    public DescribeHanaBackupSettingResponse describeHanaBackupSetting(DescribeHanaBackupSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupSettingWithOptions(request, runtime);
    }

    /**
      * After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the execution result of the asynchronous job.
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
      * After you call the DescribeHanaBackupsAsync operation to query the SAP HANA backups that meet the specified conditions, call the DescribeTask operation to query the execution result of the asynchronous job.
      *
      * @param request DescribeHanaBackupsAsyncRequest
      * @return DescribeHanaBackupsAsyncResponse
     */
    public DescribeHanaBackupsAsyncResponse describeHanaBackupsAsync(DescribeHanaBackupsAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaBackupsAsyncWithOptions(request, runtime);
    }

    /**
      * After you register an SAP HANA instance and install a backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.
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
      * After you register an SAP HANA instance and install a backup client on the instance, you can call this operation to query the information about SAP HANA databases. You can call the StartHanaDatabaseAsync operation to start a database and call the StopHanaDatabaseAsync operation to stop a database.
      *
      * @param request DescribeHanaDatabasesRequest
      * @return DescribeHanaDatabasesResponse
     */
    public DescribeHanaDatabasesResponse describeHanaDatabases(DescribeHanaDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaDatabasesWithOptions(request, runtime);
    }

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

    public DescribeHanaInstancesResponse describeHanaInstances(DescribeHanaInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaInstancesWithOptions(request, runtime);
    }

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

    public DescribeHanaRestoresResponse describeHanaRestores(DescribeHanaRestoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaRestoresWithOptions(request, runtime);
    }

    /**
      * *   If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
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
      * *   If you want to query the backup parameters of a database, you can call the DescribeHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
      *
      * @param request DescribeHanaRetentionSettingRequest
      * @return DescribeHanaRetentionSettingResponse
     */
    public DescribeHanaRetentionSettingResponse describeHanaRetentionSetting(DescribeHanaRetentionSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHanaRetentionSettingWithOptions(request, runtime);
    }

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

    public DescribeOtsTableSnapshotsResponse describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOtsTableSnapshotsWithOptions(request, runtime);
    }

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

    public DescribePoliciesV2Response describePoliciesV2(DescribePoliciesV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePoliciesV2WithOptions(request, runtime);
    }

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

    public DescribePolicyBindingsResponse describePolicyBindings(DescribePolicyBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyBindingsWithOptions(request, runtime);
    }

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

    public DescribeRecoverableOtsInstancesResponse describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecoverableOtsInstancesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needVaultCount)) {
            query.put("NeedVaultCount", request.needVaultCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRestoreJobs2Response describeRestoreJobs2WithOptions(DescribeRestoreJobs2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public DescribeRestoreJobs2Response describeRestoreJobs2(DescribeRestoreJobs2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreJobs2WithOptions(request, runtime);
    }

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

    public DescribeTaskResponse describeTask(DescribeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTaskWithOptions(request, runtime);
    }

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

    public DescribeUdmSnapshotsResponse describeUdmSnapshots(DescribeUdmSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUdmSnapshotsWithOptions(request, runtime);
    }

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

    public DescribeVaultReplicationRegionsResponse describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVaultReplicationRegionsWithOptions(request, runtime);
    }

    public DescribeVaultsResponse describeVaultsWithOptions(DescribeVaultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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

    public DescribeVaultsResponse describeVaults(DescribeVaultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVaultsWithOptions(request, runtime);
    }

    /**
      * *   If the request is successful, the mount target is deleted.
      * *   After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the **Status** column of the mount target of the NAS file system, the following information is displayed: **This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR**.
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
      * *   If the request is successful, the mount target is deleted.
      * *   After you create a backup plan for an Apsara File Storage NAS file system, HBR automatically creates a mount target for the file system. You can call this operation to delete the mount target. In the **Status** column of the mount target of the NAS file system, the following information is displayed: **This mount target is created by an Alibaba Cloud internal service and cannot be operated. Service name: HBR**.
      *
      * @param request DetachNasFileSystemRequest
      * @return DetachNasFileSystemResponse
     */
    public DetachNasFileSystemResponse detachNasFileSystem(DetachNasFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachNasFileSystemWithOptions(request, runtime);
    }

    /**
      * If the request is successful, the specified backup plan is disabled. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is set to true for the backup plan.
      *
      * @param request DisableBackupPlanRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DisableBackupPlanResponse
     */
    public DisableBackupPlanResponse disableBackupPlanWithOptions(DisableBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
      * If the request is successful, the specified backup plan is disabled. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is set to true for the backup plan.
      *
      * @param request DisableBackupPlanRequest
      * @return DisableBackupPlanResponse
     */
    public DisableBackupPlanResponse disableBackupPlan(DisableBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableBackupPlanWithOptions(request, runtime);
    }

    /**
      * To enable the backup plan again, call the EnableHanaBackupPlan operation.
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
      * To enable the backup plan again, call the EnableHanaBackupPlan operation.
      *
      * @param request DisableHanaBackupPlanRequest
      * @return DisableHanaBackupPlanResponse
     */
    public DisableHanaBackupPlanResponse disableHanaBackupPlan(DisableHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableHanaBackupPlanWithOptions(request, runtime);
    }

    /**
      * If the request is successful, the system enables the backup plan and backs up data based on the polices that are specified in the backup plan. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is automatically set to false for the backup plan.
      *
      * @param request EnableBackupPlanRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EnableBackupPlanResponse
     */
    public EnableBackupPlanResponse enableBackupPlanWithOptions(EnableBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
      * If the request is successful, the system enables the backup plan and backs up data based on the polices that are specified in the backup plan. If you call the DescribeBackupPlans operation to query backup plans, the Disabled parameter is automatically set to false for the backup plan.
      *
      * @param request EnableBackupPlanRequest
      * @return EnableBackupPlanResponse
     */
    public EnableBackupPlanResponse enableBackupPlan(EnableBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBackupPlanWithOptions(request, runtime);
    }

    /**
      * To disable the backup plan again, call the DisableHanaBackupPlan operation.
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
      * To disable the backup plan again, call the DisableHanaBackupPlan operation.
      *
      * @param request EnableHanaBackupPlanRequest
      * @return EnableHanaBackupPlanResponse
     */
    public EnableHanaBackupPlanResponse enableHanaBackupPlan(EnableHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableHanaBackupPlanWithOptions(request, runtime);
    }

    public ExecuteBackupPlanResponse executeBackupPlanWithOptions(ExecuteBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public ExecuteBackupPlanResponse executeBackupPlan(ExecuteBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeBackupPlanWithOptions(request, runtime);
    }

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

    public ExecutePolicyV2Response executePolicyV2(ExecutePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executePolicyV2WithOptions(request, runtime);
    }

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

    public GenerateRamPolicyResponse generateRamPolicy(GenerateRamPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateRamPolicyWithOptions(request, runtime);
    }

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

    public GetTempFileDownloadLinkResponse getTempFileDownloadLink(GetTempFileDownloadLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTempFileDownloadLinkWithOptions(request, runtime);
    }

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.
      * *   You can call the [DescribeTask](~~431265~~) operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.
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
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to install an HBR client on an ECS instance.
      * *   You can call the [DescribeTask](~~431265~~) operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 60 seconds after you call the InstallBackupClients operation to install HBR clients. Then, run the next queries at an interval of 30 seconds.
      *
      * @param request InstallBackupClientsRequest
      * @return InstallBackupClientsResponse
     */
    public InstallBackupClientsResponse installBackupClients(InstallBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installBackupClientsWithOptions(request, runtime);
    }

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

    public OpenHbrServiceResponse openHbrService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openHbrServiceWithOptions(runtime);
    }

    public SearchHistoricalSnapshotsResponse searchHistoricalSnapshotsWithOptions(SearchHistoricalSnapshotsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchHistoricalSnapshotsShrinkRequest request = new SearchHistoricalSnapshotsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public SearchHistoricalSnapshotsResponse searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchHistoricalSnapshotsWithOptions(request, runtime);
    }

    /**
      * To stop the database again, call the StopHanaDatabaseAsync operation.
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
      * To stop the database again, call the StopHanaDatabaseAsync operation.
      *
      * @param request StartHanaDatabaseAsyncRequest
      * @return StartHanaDatabaseAsyncResponse
     */
    public StartHanaDatabaseAsyncResponse startHanaDatabaseAsync(StartHanaDatabaseAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startHanaDatabaseAsyncWithOptions(request, runtime);
    }

    /**
      * To start the database again, call the StartHanaDatabaseAsync operation.
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
      * To start the database again, call the StartHanaDatabaseAsync operation.
      *
      * @param request StopHanaDatabaseAsyncRequest
      * @return StopHanaDatabaseAsyncResponse
     */
    public StopHanaDatabaseAsyncResponse stopHanaDatabaseAsync(StopHanaDatabaseAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopHanaDatabaseAsyncWithOptions(request, runtime);
    }

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.
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
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to uninstall a backup client from an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes. We recommend that you call the DescribeTask operation to run the first query 30 seconds after you call the UninstallBackupClients operation to uninstall backup clients. Then, run the next queries at an interval of 30 seconds.
      *
      * @param request UninstallBackupClientsRequest
      * @return UninstallBackupClientsResponse
     */
    public UninstallBackupClientsResponse uninstallBackupClients(UninstallBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallBackupClientsWithOptions(request, runtime);
    }

    /**
      * If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.
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
      * If you call this operation, the specified HBR client is uninstalled. To reinstall the HBR client, call the CreateClients operation.
      *
      * @param request UninstallClientRequest
      * @return UninstallClientResponse
     */
    public UninstallClientResponse uninstallClient(UninstallClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallClientWithOptions(request, runtime);
    }

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

    public UpdateBackupPlanResponse updateBackupPlan(UpdateBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBackupPlanWithOptions(request, runtime);
    }

    /**
      * You can call this operation to update the configurations of both the old and new HBR clients.
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
      * You can call this operation to update the configurations of both the old and new HBR clients.
      *
      * @param request UpdateClientSettingsRequest
      * @return UpdateClientSettingsResponse
     */
    public UpdateClientSettingsResponse updateClientSettings(UpdateClientSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientSettingsWithOptions(request, runtime);
    }

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

    public UpdateContainerClusterResponse updateContainerCluster(UpdateContainerClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContainerClusterWithOptions(request, runtime);
    }

    /**
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
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
      * *   A backup plan defines the data source, backup policy, and other configurations. After you execute a backup plan, a backup job is generated to record the backup progress and the backup result. If a backup job is completed, a backup snapshot is generated. You can use a backup snapshot to create a restore job.
      * *   You can specify only one type of data source in a backup plan.
      * *   You can specify only one interval as a backup cycle in a backup plan.
      * *   Each backup plan allows you to back up data to only one backup vault.
      *
      * @param request UpdateHanaBackupPlanRequest
      * @return UpdateHanaBackupPlanResponse
     */
    public UpdateHanaBackupPlanResponse updateHanaBackupPlan(UpdateHanaBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaBackupPlanWithOptions(request, runtime);
    }

    /**
      * You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.
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
      * You can call the UpdateHanaRetentionSetting operation to update the backup retention period of a database.
      *
      * @param request UpdateHanaBackupSettingRequest
      * @return UpdateHanaBackupSettingResponse
     */
    public UpdateHanaBackupSettingResponse updateHanaBackupSetting(UpdateHanaBackupSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaBackupSettingWithOptions(request, runtime);
    }

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

    public UpdateHanaInstanceResponse updateHanaInstance(UpdateHanaInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaInstanceWithOptions(request, runtime);
    }

    /**
      * *   If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
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
      * *   If you want to update the backup parameters of a database, you can call the UpdateHanaBackupSetting operation.
      * *   HBR deletes the expired catalogs and data that are related to Backint and file backup. The deleted catalogs and data cannot be restored. We recommend that you set the retention period based on your business requirements.
      *
      * @param request UpdateHanaRetentionSettingRequest
      * @return UpdateHanaRetentionSettingResponse
     */
    public UpdateHanaRetentionSettingResponse updateHanaRetentionSetting(UpdateHanaRetentionSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateHanaRetentionSettingWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.policyBindingDescription)) {
            query.put("PolicyBindingDescription", request.policyBindingDescription);
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

    public UpdatePolicyBindingResponse updatePolicyBinding(UpdatePolicyBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyBindingWithOptions(request, runtime);
    }

    /**
      * If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.
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
      * If you modify a backup policy, the modification takes effect on all data sources that are bound to the backup policy. Proceed with caution.
      *
      * @param request UpdatePolicyV2Request
      * @return UpdatePolicyV2Response
     */
    public UpdatePolicyV2Response updatePolicyV2(UpdatePolicyV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyV2WithOptions(request, runtime);
    }

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

    public UpdateVaultResponse updateVault(UpdateVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVaultWithOptions(request, runtime);
    }

    /**
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes.
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
      * *   This operation creates an asynchronous job at the backend and calls Cloud Assistant to upgrade an HBR client that is installed on an ECS instance.
      * *   You can call the DescribeTask operation to query the execution result of an asynchronous job.
      * *   The timeout period of an asynchronous job is 15 minutes.
      *
      * @param request UpgradeBackupClientsRequest
      * @return UpgradeBackupClientsResponse
     */
    public UpgradeBackupClientsResponse upgradeBackupClients(UpgradeBackupClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeBackupClientsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to upgrade a backup client to the latest version. After the backup client is upgraded, the version of the backup client cannot be rolled back.
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
      * You can call this operation to upgrade a backup client to the latest version. After the backup client is upgraded, the version of the backup client cannot be rolled back.
      *
      * @param request UpgradeClientRequest
      * @return UpgradeClientResponse
     */
    public UpgradeClientResponse upgradeClient(UpgradeClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClientWithOptions(request, runtime);
    }
}
