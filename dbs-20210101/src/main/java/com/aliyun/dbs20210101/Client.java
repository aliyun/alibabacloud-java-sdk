// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101;

import com.aliyun.tea.*;
import com.aliyun.dbs20210101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-beijing", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dbs-api.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dbs-api.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dbs-api.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dbs-api.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dbs-api.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dbs-api.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "dbs-api.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("us-east-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("eu-central-1", "dbs-api.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dbs-api.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-south-1", "dbs-api.ap-south-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dbs-api.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dbs-api.me-east-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dbs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary Moves a resource from one resource group to another.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
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
            new TeaPair("version", "2021-01-01"),
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
     * @summary Moves a resource from one resource group to another.
     *
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary 开启高级备份策略
     *
     * @param request CreateAdvancedPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdvancedPolicyResponse
     */
    public CreateAdvancedPolicyResponse createAdvancedPolicyWithOptions(CreateAdvancedPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdvancedPolicy"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdvancedPolicyResponse());
    }

    /**
     * @summary 开启高级备份策略
     *
     * @param request CreateAdvancedPolicyRequest
     * @return CreateAdvancedPolicyResponse
     */
    public CreateAdvancedPolicyResponse createAdvancedPolicy(CreateAdvancedPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdvancedPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates an advanced download task for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request CreateDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadResponse
     */
    public CreateDownloadResponse createDownloadWithOptions(CreateDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bakSetId)) {
            query.put("BakSetId", request.bakSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bakSetSize)) {
            query.put("BakSetSize", request.bakSetSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bakSetType)) {
            query.put("BakSetType", request.bakSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadPointInTime)) {
            query.put("DownloadPointInTime", request.downloadPointInTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatType)) {
            query.put("FormatType", request.formatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBucket)) {
            query.put("TargetBucket", request.targetBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetOssRegion)) {
            query.put("TargetOssRegion", request.targetOssRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPath)) {
            query.put("TargetPath", request.targetPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDownload"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDownloadResponse());
    }

    /**
     * @summary Creates an advanced download task for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request CreateDownloadRequest
     * @return CreateDownloadResponse
     */
    public CreateDownloadResponse createDownload(CreateDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadWithOptions(request, runtime);
    }

    /**
     * @summary Releases a sandbox instance.
     *
     * @description This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DeleteSandboxInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSandboxInstanceResponse
     */
    public DeleteSandboxInstanceResponse deleteSandboxInstanceWithOptions(DeleteSandboxInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSandboxInstance"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSandboxInstanceResponse());
    }

    /**
     * @summary Releases a sandbox instance.
     *
     * @description This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DeleteSandboxInstanceRequest
     * @return DeleteSandboxInstanceResponse
     */
    public DeleteSandboxInstanceResponse deleteSandboxInstance(DeleteSandboxInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSandboxInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 备份数据列表查询接口
     *
     * @param request DescribeBackupDataListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupDataListResponse
     */
    public DescribeBackupDataListResponse describeBackupDataListWithOptions(DescribeBackupDataListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupScale)) {
            query.put("BackupScale", request.backupScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStatus)) {
            query.put("BackupStatus", request.backupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIsDeleted)) {
            query.put("InstanceIsDeleted", request.instanceIsDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegion)) {
            query.put("InstanceRegion", request.instanceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupDataList"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupDataListResponse());
    }

    /**
     * @summary 备份数据列表查询接口
     *
     * @param request DescribeBackupDataListRequest
     * @return DescribeBackupDataListResponse
     */
    public DescribeBackupDataListResponse describeBackupDataList(DescribeBackupDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDataListWithOptions(request, runtime);
    }

    /**
     * @summary 获取备份策略接口
     *
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    /**
     * @summary 获取备份策略接口
     *
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDBTablesRecoveryBackupSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    public DescribeDBTablesRecoveryBackupSetResponse describeDBTablesRecoveryBackupSetWithOptions(DescribeDBTablesRecoveryBackupSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBTablesRecoveryBackupSet"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBTablesRecoveryBackupSetResponse());
    }

    /**
     * @param request DescribeDBTablesRecoveryBackupSetRequest
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    public DescribeDBTablesRecoveryBackupSetResponse describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryBackupSetWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDBTablesRecoveryStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryStateResponse
     */
    public DescribeDBTablesRecoveryStateResponse describeDBTablesRecoveryStateWithOptions(DescribeDBTablesRecoveryStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBTablesRecoveryState"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBTablesRecoveryStateResponse());
    }

    /**
     * @param request DescribeDBTablesRecoveryStateRequest
     * @return DescribeDBTablesRecoveryStateResponse
     */
    public DescribeDBTablesRecoveryStateResponse describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryStateWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDBTablesRecoveryTimeRangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    public DescribeDBTablesRecoveryTimeRangeResponse describeDBTablesRecoveryTimeRangeWithOptions(DescribeDBTablesRecoveryTimeRangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBTablesRecoveryTimeRange"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBTablesRecoveryTimeRangeResponse());
    }

    /**
     * @param request DescribeDBTablesRecoveryTimeRangeRequest
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    public DescribeDBTablesRecoveryTimeRangeResponse describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryTimeRangeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the storage information of a downloaded backup set.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadBackupSetStorageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadBackupSetStorageInfoResponse
     */
    public DescribeDownloadBackupSetStorageInfoResponse describeDownloadBackupSetStorageInfoWithOptions(DescribeDownloadBackupSetStorageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadBackupSetStorageInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadBackupSetStorageInfoResponse());
    }

    /**
     * @summary Queries the storage information of a downloaded backup set.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadBackupSetStorageInfoRequest
     * @return DescribeDownloadBackupSetStorageInfoResponse
     */
    public DescribeDownloadBackupSetStorageInfoResponse describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadBackupSetStorageInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries whether an instance supports the advanced download feature.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadSupportResponse
     */
    public DescribeDownloadSupportResponse describeDownloadSupportWithOptions(DescribeDownloadSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadSupport"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadSupportResponse());
    }

    /**
     * @summary Queries whether an instance supports the advanced download feature.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadSupportRequest
     * @return DescribeDownloadSupportResponse
     */
    public DescribeDownloadSupportResponse describeDownloadSupport(DescribeDownloadSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadSupportWithOptions(request, runtime);
    }

    /**
     * @summary Queries the advanced download tasks for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTaskWithOptions(DescribeDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            query.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirect)) {
            query.put("OrderDirect", request.orderDirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadTask"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadTaskResponse());
    }

    /**
     * @summary Queries the advanced download tasks for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.
     *
     * @description ### [](#)Supported database engines
     * *   ApsaraDB RDS for MySQL
     * *   ApsaraDB RDS for PostgreSQL
     * *   PolarDB for MySQL
     * ### [](#)References
     * *   [Download the backup files of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/98819.html)
     * *   [Download the backup files of an ApsaraDB RDS for PostgreSQL instance](https://help.aliyun.com/document_detail/96774.html)
     * *   [Download the backup files of a PolarDB for MySQL cluster](https://help.aliyun.com/document_detail/2627635.html)
     *
     * @param request DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTask(DescribeDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries the snapshots of an instance.
     *
     * @description Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/203154.html) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](https://help.aliyun.com/document_detail/185577.html). This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxBackupSetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSandboxBackupSetsResponse
     */
    public DescribeSandboxBackupSetsResponse describeSandboxBackupSetsWithOptions(DescribeSandboxBackupSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
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
            new TeaPair("action", "DescribeSandboxBackupSets"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSandboxBackupSetsResponse());
    }

    /**
     * @summary Queries the snapshots of an instance.
     *
     * @description Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/203154.html) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](https://help.aliyun.com/document_detail/185577.html). This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxBackupSetsRequest
     * @return DescribeSandboxBackupSetsResponse
     */
    public DescribeSandboxBackupSetsResponse describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxBackupSetsWithOptions(request, runtime);
    }

    /**
     * @summary Queries sandbox instances that are created within an account.
     *
     * @description This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSandboxInstancesResponse
     */
    public DescribeSandboxInstancesResponse describeSandboxInstancesWithOptions(DescribeSandboxInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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
            new TeaPair("action", "DescribeSandboxInstances"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSandboxInstancesResponse());
    }

    /**
     * @summary Queries sandbox instances that are created within an account.
     *
     * @description This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxInstancesRequest
     * @return DescribeSandboxInstancesResponse
     */
    public DescribeSandboxInstancesResponse describeSandboxInstances(DescribeSandboxInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the recoverable time range of a sandbox instance.
     *
     * @description Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/203154.html) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](https://help.aliyun.com/document_detail/185577.html). This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxRecoveryTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSandboxRecoveryTimeResponse
     */
    public DescribeSandboxRecoveryTimeResponse describeSandboxRecoveryTimeWithOptions(DescribeSandboxRecoveryTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSandboxRecoveryTime"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSandboxRecoveryTimeResponse());
    }

    /**
     * @summary Queries the recoverable time range of a sandbox instance.
     *
     * @description Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see [Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance](https://help.aliyun.com/document_detail/203154.html) or [Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database](https://help.aliyun.com/document_detail/185577.html). This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.
     *
     * @param request DescribeSandboxRecoveryTimeRequest
     * @return DescribeSandboxRecoveryTimeResponse
     */
    public DescribeSandboxRecoveryTimeResponse describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxRecoveryTimeWithOptions(request, runtime);
    }

    /**
     * @summary 修改备份策略
     *
     * @param request ModifyBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advanceDataPolicies)) {
            query.put("AdvanceDataPolicies", request.advanceDataPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupWindowBegin)) {
            query.put("PreferredBackupWindowBegin", request.preferredBackupWindowBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupPolicyResponse());
    }

    /**
     * @summary 修改备份策略
     *
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDBTablesRecoveryStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBTablesRecoveryStateResponse
     */
    public ModifyDBTablesRecoveryStateResponse modifyDBTablesRecoveryStateWithOptions(ModifyDBTablesRecoveryStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBTablesRecoveryState"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBTablesRecoveryStateResponse());
    }

    /**
     * @param request ModifyDBTablesRecoveryStateRequest
     * @return ModifyDBTablesRecoveryStateResponse
     */
    public ModifyDBTablesRecoveryStateResponse modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBTablesRecoveryStateWithOptions(request, runtime);
    }

    /**
     * @param request SupportDBTableRecoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SupportDBTableRecoveryResponse
     */
    public SupportDBTableRecoveryResponse supportDBTableRecoveryWithOptions(SupportDBTableRecoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SupportDBTableRecovery"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SupportDBTableRecoveryResponse());
    }

    /**
     * @param request SupportDBTableRecoveryRequest
     * @return SupportDBTableRecoveryResponse
     */
    public SupportDBTableRecoveryResponse supportDBTableRecovery(SupportDBTableRecoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.supportDBTableRecoveryWithOptions(request, runtime);
    }
}
