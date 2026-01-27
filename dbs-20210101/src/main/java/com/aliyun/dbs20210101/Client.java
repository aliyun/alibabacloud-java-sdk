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
     * <b>summary</b> : 
     * <p>Moves a resource from one resource group to another.</p>
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
     * <b>summary</b> : 
     * <p>Moves a resource from one resource group to another.</p>
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
     * <p>配置备份集信息</p>
     * 
     * @param request ConfigureBackupSetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureBackupSetInfoResponse
     */
    public ConfigureBackupSetInfoResponse configureBackupSetInfoWithOptions(ConfigureBackupSetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetName)) {
            query.put("BackupSetName", request.backupSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkSum)) {
            query.put("CheckSum", request.checkSum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraMeta)) {
            query.put("ExtraMeta", request.extraMeta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadStatus)) {
            query.put("UploadStatus", request.uploadStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureBackupSetInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureBackupSetInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置备份集信息</p>
     * 
     * @param request ConfigureBackupSetInfoRequest
     * @return ConfigureBackupSetInfoResponse
     */
    public ConfigureBackupSetInfoResponse configureBackupSetInfo(ConfigureBackupSetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureBackupSetInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables an advanced backup policy for a PolarDB instance.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables an advanced backup policy for a PolarDB instance.</p>
     * 
     * @param request CreateAdvancedPolicyRequest
     * @return CreateAdvancedPolicyResponse
     */
    public CreateAdvancedPolicyResponse createAdvancedPolicy(CreateAdvancedPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdvancedPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an advanced download task for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.</p>
     * 
     * @param request CreateDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadResponse
     */
    public CreateDownloadResponse createDownloadWithOptions(CreateDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminDatabase)) {
            query.put("AdminDatabase", request.adminDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bakSetId)) {
            query.put("BakSetId", request.bakSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bakSetSize)) {
            query.put("BakSetSize", request.bakSetSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bakSetType)) {
            query.put("BakSetType", request.bakSetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.isCluster)) {
            query.put("IsCluster", request.isCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isPhysical)) {
            query.put("IsPhysical", request.isPhysical);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKeyTypeOnly)) {
            query.put("PrimaryKeyTypeOnly", request.primaryKeyTypeOnly);
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

        if (!com.aliyun.teautil.Common.isUnset(request.useZstd)) {
            query.put("UseZstd", request.useZstd);
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>For the instances that meet your business requirements, you can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an advanced download task for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.</p>
     * 
     * @param request CreateDownloadRequest
     * @return CreateDownloadResponse
     */
    public CreateDownloadResponse createDownload(CreateDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a sandbox instance.</p>
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
     * <b>description</b> :
     * <p>This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a sandbox instance.</p>
     * 
     * @param request DeleteSandboxInstanceRequest
     * @return DeleteSandboxInstanceResponse
     */
    public DeleteSandboxInstanceResponse deleteSandboxInstance(DeleteSandboxInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSandboxInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID: 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/88172.html">Back up data of PolarDB for MySQL</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup data of a PolarDB for MySQL cluster.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID: 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/88172.html">Back up data of PolarDB for MySQL</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup data of a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeBackupDataListRequest
     * @return DescribeBackupDataListResponse
     */
    public DescribeBackupDataListResponse describeBackupDataList(DescribeBackupDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDataListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> The API operation is available only to specific customers. If you want to call this API operation, request permissions by joining the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/280422.html">Topics related to backup policies of PolarDB for MySQL instances</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup policy of a PolarDB for MySQL instance.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> The API operation is available only to specific customers. If you want to call this API operation, request permissions by joining the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation.</p>
     * </blockquote>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/280422.html">Topics related to backup policies of PolarDB for MySQL instances</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup policy of a PolarDB for MySQL instance.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询存储介质访问详情</p>
     * 
     * @param request DescribeBakDataSourceStorageAccessInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBakDataSourceStorageAccessInfoResponse
     */
    public DescribeBakDataSourceStorageAccessInfoResponse describeBakDataSourceStorageAccessInfoWithOptions(DescribeBakDataSourceStorageAccessInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupType)) {
            query.put("BackupType", request.backupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationSeconds)) {
            query.put("DurationSeconds", request.durationSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBakDataSourceStorageAccessInfo"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBakDataSourceStorageAccessInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询存储介质访问详情</p>
     * 
     * @param request DescribeBakDataSourceStorageAccessInfoRequest
     * @return DescribeBakDataSourceStorageAccessInfoResponse
     */
    public DescribeBakDataSourceStorageAccessInfoResponse describeBakDataSourceStorageAccessInfo(DescribeBakDataSourceStorageAccessInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBakDataSourceStorageAccessInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据dbs实例id获取费用列表</p>
     * 
     * @param request DescribeCostInfoByDbsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCostInfoByDbsInstanceResponse
     */
    public DescribeCostInfoByDbsInstanceResponse describeCostInfoByDbsInstanceWithOptions(DescribeCostInfoByDbsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCostInfoByDbsInstance"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostInfoByDbsInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据dbs实例id获取费用列表</p>
     * 
     * @param request DescribeCostInfoByDbsInstanceRequest
     * @return DescribeCostInfoByDbsInstanceResponse
     */
    public DescribeCostInfoByDbsInstanceResponse describeCostInfoByDbsInstance(DescribeCostInfoByDbsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostInfoByDbsInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查库表恢复可用的备份集</p>
     * 
     * @param request DescribeDBTablesRecoveryBackupSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    public DescribeDBTablesRecoveryBackupSetResponse describeDBTablesRecoveryBackupSetWithOptions(DescribeDBTablesRecoveryBackupSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

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
     * <b>summary</b> : 
     * <p>查库表恢复可用的备份集</p>
     * 
     * @param request DescribeDBTablesRecoveryBackupSetRequest
     * @return DescribeDBTablesRecoveryBackupSetResponse
     */
    public DescribeDBTablesRecoveryBackupSetResponse describeDBTablesRecoveryBackupSet(DescribeDBTablesRecoveryBackupSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryBackupSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查库表恢复状态</p>
     * 
     * @param request DescribeDBTablesRecoveryStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryStateResponse
     */
    public DescribeDBTablesRecoveryStateResponse describeDBTablesRecoveryStateWithOptions(DescribeDBTablesRecoveryStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

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
     * <b>summary</b> : 
     * <p>查库表恢复状态</p>
     * 
     * @param request DescribeDBTablesRecoveryStateRequest
     * @return DescribeDBTablesRecoveryStateResponse
     */
    public DescribeDBTablesRecoveryStateResponse describeDBTablesRecoveryState(DescribeDBTablesRecoveryStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查库表恢复可恢复的时间范围</p>
     * 
     * @param request DescribeDBTablesRecoveryTimeRangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    public DescribeDBTablesRecoveryTimeRangeResponse describeDBTablesRecoveryTimeRangeWithOptions(DescribeDBTablesRecoveryTimeRangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

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
     * <b>summary</b> : 
     * <p>查库表恢复可恢复的时间范围</p>
     * 
     * @param request DescribeDBTablesRecoveryTimeRangeRequest
     * @return DescribeDBTablesRecoveryTimeRangeResponse
     */
    public DescribeDBTablesRecoveryTimeRangeResponse describeDBTablesRecoveryTimeRange(DescribeDBTablesRecoveryTimeRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBTablesRecoveryTimeRangeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL that uses Enterprise SSDs (ESSDs)</li>
     * <li>RDS PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage information of a downloaded backup set.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL that uses Enterprise SSDs (ESSDs)</li>
     * <li>RDS PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage information of a downloaded backup set.</p>
     * 
     * @param request DescribeDownloadBackupSetStorageInfoRequest
     * @return DescribeDownloadBackupSetStorageInfoResponse
     */
    public DescribeDownloadBackupSetStorageInfoResponse describeDownloadBackupSetStorageInfo(DescribeDownloadBackupSetStorageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadBackupSetStorageInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an instance supports the advanced download feature.</p>
     * 
     * @param request DescribeDownloadSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadSupportResponse
     */
    public DescribeDownloadSupportResponse describeDownloadSupportWithOptions(DescribeDownloadSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <p>You can create an advanced download task by point in time or backup set. You can set the download destination to a URL or directly upload the downloaded backup set to your Object Storage Service (OSS) bucket to facilitate data analysis and offline archiving.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an instance supports the advanced download feature.</p>
     * 
     * @param request DescribeDownloadSupportRequest
     * @return DescribeDownloadSupportResponse
     */
    public DescribeDownloadSupportResponse describeDownloadSupport(DescribeDownloadSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadSupportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the advanced download tasks for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * <h3><a href="#"></a>References</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/98819.html">Download the backup files of an ApsaraDB RDS for MySQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/96774.html">Download the backup files of an ApsaraDB RDS for PostgreSQL instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2627635.html">Download the backup files of a PolarDB for MySQL cluster</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the advanced download tasks for an ApsaraDB RDS for MySQL instance, an ApsaraDB RDS for PostgreSQL instance, or a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTask(DescribeDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the snapshots of an instance.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only for the Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the snapshots of an instance.</p>
     * 
     * @param request DescribeSandboxBackupSetsRequest
     * @return DescribeSandboxBackupSetsResponse
     */
    public DescribeSandboxBackupSetsResponse describeSandboxBackupSets(DescribeSandboxBackupSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxBackupSetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sandbox instances that are created within an account.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sandbox instances that are created within an account.</p>
     * 
     * @param request DescribeSandboxInstancesRequest
     * @return DescribeSandboxInstancesResponse
     */
    public DescribeSandboxInstancesResponse describeSandboxInstances(DescribeSandboxInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recoverable time range of a sandbox instance.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the sandbox feature for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/203154.html">Use the emergency recovery feature of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/185577.html">Create a sandbox instance for emergency disaster recovery of a self-managed MySQL database</a>. This operation is available only in Database Backup (DBS) API of the 2021-01-01 version.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recoverable time range of a sandbox instance.</p>
     * 
     * @param request DescribeSandboxRecoveryTimeRequest
     * @return DescribeSandboxRecoveryTimeResponse
     */
    public DescribeSandboxRecoveryTimeResponse describeSandboxRecoveryTime(DescribeSandboxRecoveryTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxRecoveryTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of a PolarDB instance.</p>
     * 
     * @param tmpReq ModifyBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBackupPolicyShrinkRequest request = new ModifyBackupPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advanceDataPolicies)) {
            request.advanceDataPoliciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advanceDataPolicies, "AdvanceDataPolicies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advanceIncPolicies)) {
            request.advanceIncPoliciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advanceIncPolicies, "AdvanceIncPolicies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advanceLogPolicies)) {
            request.advanceLogPoliciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advanceLogPolicies, "AdvanceLogPolicies", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advanceDataPoliciesShrink)) {
            query.put("AdvanceDataPolicies", request.advanceDataPoliciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.advanceIncPoliciesShrink)) {
            query.put("AdvanceIncPolicies", request.advanceIncPoliciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.advanceLogPoliciesShrink)) {
            query.put("AdvanceLogPolicies", request.advanceLogPoliciesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPriority)) {
            query.put("BackupPriority", request.backupPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPolicyOnClusterDeletion)) {
            query.put("BackupRetentionPolicyOnClusterDeletion", request.backupRetentionPolicyOnClusterDeletion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIncBackup)) {
            query.put("EnableIncBackup", request.enableIncBackup);
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
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engines</h3>
     * <p>PolarDB for MySQL</p>
     * <blockquote>
     * <p> This API operation is available only to specific customers. If you want to call this API operation, join the Database Backup (DBS) DingTalk group (ID 35585947) for customer consultation to request permissions.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of a PolarDB instance.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改库表恢复状态</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
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
     * <b>summary</b> : 
     * <p>修改库表恢复状态</p>
     * 
     * @param request ModifyDBTablesRecoveryStateRequest
     * @return ModifyDBTablesRecoveryStateResponse
     */
    public ModifyDBTablesRecoveryStateResponse modifyDBTablesRecoveryState(ModifyDBTablesRecoveryStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBTablesRecoveryStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重试高级下载任务</p>
     * 
     * @param request RetryDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryDownloadTaskResponse
     */
    public RetryDownloadTaskResponse retryDownloadTaskWithOptions(RetryDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
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
            new TeaPair("action", "RetryDownloadTask"),
            new TeaPair("version", "2021-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryDownloadTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重试高级下载任务</p>
     * 
     * @param request RetryDownloadTaskRequest
     * @return RetryDownloadTaskResponse
     */
    public RetryDownloadTaskResponse retryDownloadTask(RetryDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询是否支持库表恢复</p>
     * 
     * @param request SupportDBTableRecoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SupportDBTableRecoveryResponse
     */
    public SupportDBTableRecoveryResponse supportDBTableRecoveryWithOptions(SupportDBTableRecoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

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
     * <b>summary</b> : 
     * <p>查询是否支持库表恢复</p>
     * 
     * @param request SupportDBTableRecoveryRequest
     * @return SupportDBTableRecoveryResponse
     */
    public SupportDBTableRecoveryResponse supportDBTableRecovery(SupportDBTableRecoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.supportDBTableRecoveryWithOptions(request, runtime);
    }
}
