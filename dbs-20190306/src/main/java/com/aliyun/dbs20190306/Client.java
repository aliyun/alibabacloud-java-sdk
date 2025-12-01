// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306;

import com.aliyun.tea.*;
import com.aliyun.dbs20190306.models.*;

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
     * <p>Configures a DBS backup schedule.</p>
     * 
     * @param request ConfigureBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureBackupPlanResponse
     */
    public ConfigureBackupPlanResponse configureBackupPlanWithOptions(ConfigureBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStartBackup)) {
            query.put("AutoStartBackup", request.autoStartBackup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLogIntervalSeconds)) {
            query.put("BackupLogIntervalSeconds", request.backupLogIntervalSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupObjects)) {
            query.put("BackupObjects", request.backupObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPeriod)) {
            query.put("BackupPeriod", request.backupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanName)) {
            query.put("BackupPlanName", request.backupPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRateLimit)) {
            query.put("BackupRateLimit", request.backupRateLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSpeedLimit)) {
            query.put("BackupSpeedLimit", request.backupSpeedLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStartTime)) {
            query.put("BackupStartTime", request.backupStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStorageType)) {
            query.put("BackupStorageType", request.backupStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStrategyType)) {
            query.put("BackupStrategyType", request.backupStrategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAliyunId)) {
            query.put("CrossAliyunId", request.crossAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRoleName)) {
            query.put("CrossRoleName", request.crossRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationArchivePeriod)) {
            query.put("DuplicationArchivePeriod", request.duplicationArchivePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationInfrequentAccessPeriod)) {
            query.put("DuplicationInfrequentAccessPeriod", request.duplicationInfrequentAccessPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackupLog)) {
            query.put("EnableBackupLog", request.enableBackupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucketName)) {
            query.put("OSSBucketName", request.OSSBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a DBS backup schedule.</p>
     * 
     * @param request ConfigureBackupPlanRequest
     * @return ConfigureBackupPlanResponse
     */
    public ConfigureBackupPlanResponse configureBackupPlan(ConfigureBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/70005.html">pricing</a> of Database Backup (DBS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates, configures, and starts a backup schedule.</p>
     * 
     * @param request CreateAndStartBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndStartBackupPlanResponse
     */
    public CreateAndStartBackupPlanResponse createAndStartBackupPlanWithOptions(CreateAndStartBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupLogIntervalSeconds)) {
            query.put("BackupLogIntervalSeconds", request.backupLogIntervalSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupObjects)) {
            query.put("BackupObjects", request.backupObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPeriod)) {
            query.put("BackupPeriod", request.backupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanName)) {
            query.put("BackupPlanName", request.backupPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRateLimit)) {
            query.put("BackupRateLimit", request.backupRateLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSpeedLimit)) {
            query.put("BackupSpeedLimit", request.backupSpeedLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStartTime)) {
            query.put("BackupStartTime", request.backupStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStorageType)) {
            query.put("BackupStorageType", request.backupStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStrategyType)) {
            query.put("BackupStrategyType", request.backupStrategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAliyunId)) {
            query.put("CrossAliyunId", request.crossAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRoleName)) {
            query.put("CrossRoleName", request.crossRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseRegion)) {
            query.put("DatabaseRegion", request.databaseRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationArchivePeriod)) {
            query.put("DuplicationArchivePeriod", request.duplicationArchivePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationInfrequentAccessPeriod)) {
            query.put("DuplicationInfrequentAccessPeriod", request.duplicationInfrequentAccessPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackupLog)) {
            query.put("EnableBackupLog", request.enableBackupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucketName)) {
            query.put("OSSBucketName", request.OSSBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageRegion)) {
            query.put("StorageRegion", request.storageRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndStartBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndStartBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/70005.html">pricing</a> of Database Backup (DBS).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates, configures, and starts a backup schedule.</p>
     * 
     * @param request CreateAndStartBackupPlanRequest
     * @return CreateAndStartBackupPlanResponse
     */
    public CreateAndStartBackupPlanResponse createAndStartBackupPlan(CreateAndStartBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndStartBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to create a backup schedule in the Database Backup (DBS) console, see <a href="https://help.aliyun.com/document_detail/65909.html">Purchase a backup schedule</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup schedule.</p>
     * 
     * @param request CreateBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupPlanResponse
     */
    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseRegion)) {
            query.put("DatabaseRegion", request.databaseRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageRegion)) {
            query.put("StorageRegion", request.storageRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackupPlan"),
            new TeaPair("version", "2019-03-06"),
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
     * <p>For more information about how to create a backup schedule in the Database Backup (DBS) console, see <a href="https://help.aliyun.com/document_detail/65909.html">Purchase a backup schedule</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a backup schedule.</p>
     * 
     * @param request CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts a full backup set download task.</p>
     * 
     * @param request CreateFullBackupSetDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFullBackupSetDownloadResponse
     */
    public CreateFullBackupSetDownloadResponse createFullBackupSetDownloadWithOptions(CreateFullBackupSetDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDataFormat)) {
            query.put("BackupSetDataFormat", request.backupSetDataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFullBackupSetDownload"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFullBackupSetDownloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts a full backup set download task.</p>
     * 
     * @param request CreateFullBackupSetDownloadRequest
     * @return CreateFullBackupSetDownloadResponse
     */
    public CreateFullBackupSetDownloadResponse createFullBackupSetDownload(CreateFullBackupSetDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFullBackupSetDownloadWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation returns a task ID. You can call the <a href="https://help.aliyun.com/document_detail/2869852.html">GetDBListFromAgent</a> operation to query the task result based on the task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to obtain a database list by using a backup gateway.</p>
     * 
     * @param request CreateGetDBListFromAgentTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGetDBListFromAgentTaskResponse
     */
    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTaskWithOptions(CreateGetDBListFromAgentTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseType)) {
            query.put("DatabaseType", request.databaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGetDBListFromAgentTask"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGetDBListFromAgentTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation returns a task ID. You can call the <a href="https://help.aliyun.com/document_detail/2869852.html">GetDBListFromAgent</a> operation to query the task result based on the task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to obtain a database list by using a backup gateway.</p>
     * 
     * @param request CreateGetDBListFromAgentTaskRequest
     * @return CreateGetDBListFromAgentTaskResponse
     */
    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTask(CreateGetDBListFromAgentTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGetDBListFromAgentTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts an incremental backup set download task.</p>
     * 
     * @param request CreateIncrementBackupSetDownloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIncrementBackupSetDownloadResponse
     */
    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownloadWithOptions(CreateIncrementBackupSetDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDataFormat)) {
            query.put("BackupSetDataFormat", request.backupSetDataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetName)) {
            query.put("BackupSetName", request.backupSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIncrementBackupSetDownload"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIncrementBackupSetDownloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and starts an incremental backup set download task.</p>
     * 
     * @param request CreateIncrementBackupSetDownloadRequest
     * @return CreateIncrementBackupSetDownloadResponse
     */
    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownload(CreateIncrementBackupSetDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIncrementBackupSetDownloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a restoration task.</p>
     * 
     * @param request CreateRestoreTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRestoreTaskResponse
     */
    public CreateRestoreTaskResponse createRestoreTaskWithOptions(CreateRestoreTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAliyunId)) {
            query.put("CrossAliyunId", request.crossAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRoleName)) {
            query.put("CrossRoleName", request.crossRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointDatabaseName)) {
            query.put("DestinationEndpointDatabaseName", request.destinationEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointIP)) {
            query.put("DestinationEndpointIP", request.destinationEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceID)) {
            query.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceType)) {
            query.put("DestinationEndpointInstanceType", request.destinationEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointOracleSID)) {
            query.put("DestinationEndpointOracleSID", request.destinationEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPassword)) {
            query.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPort)) {
            query.put("DestinationEndpointPort", request.destinationEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRegion)) {
            query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointUserName)) {
            query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicateConflict)) {
            query.put("DuplicateConflict", request.duplicateConflict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreDir)) {
            query.put("RestoreDir", request.restoreDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreHome)) {
            query.put("RestoreHome", request.restoreHome);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreObjects)) {
            query.put("RestoreObjects", request.restoreObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTaskName)) {
            query.put("RestoreTaskName", request.restoreTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRestoreTask"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRestoreTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a restoration task.</p>
     * 
     * @param request CreateRestoreTaskRequest
     * @return CreateRestoreTaskResponse
     */
    public CreateRestoreTaskResponse createRestoreTask(CreateRestoreTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRestoreTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup gateways.</p>
     * 
     * @param request DescribeBackupGatewayListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupGatewayListResponse
     */
    public DescribeBackupGatewayListResponse describeBackupGatewayListWithOptions(DescribeBackupGatewayListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupGatewayList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupGatewayListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup gateways.</p>
     * 
     * @param request DescribeBackupGatewayListRequest
     * @return DescribeBackupGatewayListResponse
     */
    public DescribeBackupGatewayListResponse describeBackupGatewayList(DescribeBackupGatewayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupGatewayListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing information of a backup schedule.</p>
     * 
     * @param request DescribeBackupPlanBillingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPlanBillingResponse
     */
    public DescribeBackupPlanBillingResponse describeBackupPlanBillingWithOptions(DescribeBackupPlanBillingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showStorageType)) {
            query.put("ShowStorageType", request.showStorageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPlanBilling"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPlanBillingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing information of a backup schedule.</p>
     * 
     * @param request DescribeBackupPlanBillingRequest
     * @return DescribeBackupPlanBillingResponse
     */
    public DescribeBackupPlanBillingResponse describeBackupPlanBilling(DescribeBackupPlanBillingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPlanBillingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before using this interface, please activate the OSS service in advance. For more information, see <a href="https://help.aliyun.com/document_detail/31817.html">Object Storage Service (OSS)</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of backup plans</p>
     * 
     * @param request DescribeBackupPlanListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPlanListResponse
     */
    public DescribeBackupPlanListResponse describeBackupPlanListWithOptions(DescribeBackupPlanListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanName)) {
            query.put("BackupPlanName", request.backupPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanStatus)) {
            query.put("BackupPlanStatus", request.backupPlanStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPlanList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPlanListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before using this interface, please activate the OSS service in advance. For more information, see <a href="https://help.aliyun.com/document_detail/31817.html">Object Storage Service (OSS)</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of backup plans</p>
     * 
     * @param request DescribeBackupPlanListRequest
     * @return DescribeBackupPlanListResponse
     */
    public DescribeBackupPlanListResponse describeBackupPlanList(DescribeBackupPlanListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPlanListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup set download tasks.</p>
     * 
     * @param request DescribeBackupSetDownloadTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupSetDownloadTaskListResponse
     */
    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskListWithOptions(DescribeBackupSetDownloadTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDownloadTaskId)) {
            query.put("BackupSetDownloadTaskId", request.backupSetDownloadTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupSetDownloadTaskList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetDownloadTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup set download tasks.</p>
     * 
     * @param request DescribeBackupSetDownloadTaskListRequest
     * @return DescribeBackupSetDownloadTaskListResponse
     */
    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskList(DescribeBackupSetDownloadTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetDownloadTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Data Lake Analytics (DLA) service for a backup schedule.</p>
     * 
     * @param request DescribeDLAServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDLAServiceResponse
     */
    public DescribeDLAServiceResponse describeDLAServiceWithOptions(DescribeDLAServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDLAService"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDLAServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Data Lake Analytics (DLA) service for a backup schedule.</p>
     * 
     * @param request DescribeDLAServiceRequest
     * @return DescribeDLAServiceResponse
     */
    public DescribeDLAServiceResponse describeDLAService(DescribeDLAServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDLAServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>cn-hangzhou</p>
     * 
     * @param request DescribeFullBackupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFullBackupListResponse
     */
    public DescribeFullBackupListResponse describeFullBackupListWithOptions(DescribeFullBackupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showStorageType)) {
            query.put("ShowStorageType", request.showStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFullBackupList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFullBackupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>cn-hangzhou</p>
     * 
     * @param request DescribeFullBackupListRequest
     * @return DescribeFullBackupListResponse
     */
    public DescribeFullBackupListResponse describeFullBackupList(DescribeFullBackupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFullBackupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries incremental backup tasks.</p>
     * 
     * @param request DescribeIncrementBackupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIncrementBackupListResponse
     */
    public DescribeIncrementBackupListResponse describeIncrementBackupListWithOptions(DescribeIncrementBackupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showStorageType)) {
            query.put("ShowStorageType", request.showStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIncrementBackupList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIncrementBackupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries incremental backup tasks.</p>
     * 
     * @param request DescribeIncrementBackupListRequest
     * @return DescribeIncrementBackupListResponse
     */
    public DescribeIncrementBackupListResponse describeIncrementBackupList(DescribeIncrementBackupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIncrementBackupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the error information of a Database Backup (DBS) task.</p>
     * 
     * @param request DescribeJobErrorCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobErrorCodeResponse
     */
    public DescribeJobErrorCodeResponse describeJobErrorCodeWithOptions(DescribeJobErrorCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobErrorCode"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobErrorCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the error information of a Database Backup (DBS) task.</p>
     * 
     * @param request DescribeJobErrorCodeRequest
     * @return DescribeJobErrorCodeResponse
     */
    public DescribeJobErrorCodeResponse describeJobErrorCode(DescribeJobErrorCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobErrorCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CIDR blocks of nodes on which Database Backup (DBS) is running.</p>
     * 
     * @param request DescribeNodeCidrListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeCidrListResponse
     */
    public DescribeNodeCidrListResponse describeNodeCidrListWithOptions(DescribeNodeCidrListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeCidrList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeCidrListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the CIDR blocks of nodes on which Database Backup (DBS) is running.</p>
     * 
     * @param request DescribeNodeCidrListRequest
     * @return DescribeNodeCidrListResponse
     */
    public DescribeNodeCidrListResponse describeNodeCidrList(DescribeNodeCidrListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeCidrListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the precheck progress of a backup schedule or a restore task.</p>
     * 
     * @param request DescribePreCheckProgressListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreCheckProgressListResponse
     */
    public DescribePreCheckProgressListResponse describePreCheckProgressListWithOptions(DescribePreCheckProgressListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTaskId)) {
            query.put("RestoreTaskId", request.restoreTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckProgressList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckProgressListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the precheck progress of a backup schedule or a restore task.</p>
     * 
     * @param request DescribePreCheckProgressListRequest
     * @return DescribePreCheckProgressListResponse
     */
    public DescribePreCheckProgressListResponse describePreCheckProgressList(DescribePreCheckProgressListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckProgressListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that Database Backup (DBS) supports.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-03-06"),
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
     * <p>Queries the regions that Database Backup (DBS) supports.</p>
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
     * <p>Queries the range of time to which you can restore data in a backup schedule.</p>
     * 
     * @param request DescribeRestoreRangeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRestoreRangeInfoResponse
     */
    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfoWithOptions(DescribeRestoreRangeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTimestampForRestore)) {
            query.put("BeginTimestampForRestore", request.beginTimestampForRestore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestampForRestore)) {
            query.put("EndTimestampForRestore", request.endTimestampForRestore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentlyRestore)) {
            query.put("RecentlyRestore", request.recentlyRestore);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRestoreRangeInfo"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRestoreRangeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the range of time to which you can restore data in a backup schedule.</p>
     * 
     * @param request DescribeRestoreRangeInfoRequest
     * @return DescribeRestoreRangeInfoResponse
     */
    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfo(DescribeRestoreRangeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreRangeInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries restore tasks.</p>
     * 
     * @param request DescribeRestoreTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRestoreTaskListResponse
     */
    public DescribeRestoreTaskListResponse describeRestoreTaskListWithOptions(DescribeRestoreTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTaskId)) {
            query.put("RestoreTaskId", request.restoreTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRestoreTaskList"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRestoreTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries restore tasks.</p>
     * 
     * @param request DescribeRestoreTaskListRequest
     * @return DescribeRestoreTaskListResponse
     */
    public DescribeRestoreTaskListResponse describeRestoreTaskList(DescribeRestoreTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreTaskListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Impact</h3>
     * <p>After you disable the incremental log backup feature, your backup schedule no longer performs incremental log backups.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables incremental backup for a backup schedule.</p>
     * 
     * @param request DisableBackupLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableBackupLogResponse
     */
    public DisableBackupLogResponse disableBackupLogWithOptions(DisableBackupLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableBackupLog"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableBackupLogResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Impact</h3>
     * <p>After you disable the incremental log backup feature, your backup schedule no longer performs incremental log backups.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables incremental backup for a backup schedule.</p>
     * 
     * @param request DisableBackupLogRequest
     * @return DisableBackupLogResponse
     */
    public DisableBackupLogResponse disableBackupLog(DisableBackupLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableBackupLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Impact</h2>
     * <p>It is free to enable the incremental log backup feature. However, the backup traffic and storage capacity generated by the feature are billed in the same way as the full backup feature, and can be offset by the free quota of backup schedules or storage plans.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables incremental backup for a backup schedule.</p>
     * 
     * @param request EnableBackupLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableBackupLogResponse
     */
    public EnableBackupLogResponse enableBackupLogWithOptions(EnableBackupLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableBackupLog"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableBackupLogResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Impact</h2>
     * <p>It is free to enable the incremental log backup feature. However, the backup traffic and storage capacity generated by the feature are billed in the same way as the full backup feature, and can be offset by the free quota of backup schedules or storage plans.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables incremental backup for a backup schedule.</p>
     * 
     * @param request EnableBackupLogRequest
     * @return EnableBackupLogResponse
     */
    public EnableBackupLogResponse enableBackupLog(EnableBackupLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBackupLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a task that is used to query a database list by using a backup gateway based on the ID of the task.</p>
     * 
     * @param request GetDBListFromAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDBListFromAgentResponse
     */
    public GetDBListFromAgentResponse getDBListFromAgentWithOptions(GetDBListFromAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDBListFromAgent"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDBListFromAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of a task that is used to query a database list by using a backup gateway based on the ID of the task.</p>
     * 
     * @param request GetDBListFromAgentRequest
     * @return GetDBListFromAgentResponse
     */
    public GetDBListFromAgentResponse getDBListFromAgent(GetDBListFromAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBListFromAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the AliyunServiceRoleForDBS role to Database Backup (DBS).</p>
     * 
     * @param request InitializeDbsServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeDbsServiceLinkedRoleResponse
     */
    public InitializeDbsServiceLinkedRoleResponse initializeDbsServiceLinkedRoleWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeDbsServiceLinkedRole"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeDbsServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the AliyunServiceRoleForDBS role to Database Backup (DBS).</p>
     * @return InitializeDbsServiceLinkedRoleResponse
     */
    public InitializeDbsServiceLinkedRoleResponse initializeDbsServiceLinkedRole() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeDbsServiceLinkedRoleWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies backup objects of a backup schedule in Database Backup (DBS).</p>
     * 
     * @param request ModifyBackupObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupObjectsResponse
     */
    public ModifyBackupObjectsResponse modifyBackupObjectsWithOptions(ModifyBackupObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupObjects)) {
            query.put("BackupObjects", request.backupObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupObjects"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies backup objects of a backup schedule in Database Backup (DBS).</p>
     * 
     * @param request ModifyBackupObjectsRequest
     * @return ModifyBackupObjectsResponse
     */
    public ModifyBackupObjectsResponse modifyBackupObjects(ModifyBackupObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a backup schedule.</p>
     * 
     * @param request ModifyBackupPlanNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPlanNameResponse
     */
    public ModifyBackupPlanNameResponse modifyBackupPlanNameWithOptions(ModifyBackupPlanNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanName)) {
            query.put("BackupPlanName", request.backupPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPlanName"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupPlanNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a backup schedule.</p>
     * 
     * @param request ModifyBackupPlanNameRequest
     * @return ModifyBackupPlanNameResponse
     */
    public ModifyBackupPlanNameResponse modifyBackupPlanName(ModifyBackupPlanNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPlanNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables, configures, or disables the automatic download feature.</p>
     * 
     * @param request ModifyBackupSetDownloadRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupSetDownloadRulesResponse
     */
    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRulesWithOptions(ModifyBackupSetDownloadRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDownloadDir)) {
            query.put("BackupSetDownloadDir", request.backupSetDownloadDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDownloadTargetType)) {
            query.put("BackupSetDownloadTargetType", request.backupSetDownloadTargetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupSetDownloadTargetTypeLocation)) {
            query.put("BackupSetDownloadTargetTypeLocation", request.backupSetDownloadTargetTypeLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullDataFormat)) {
            query.put("FullDataFormat", request.fullDataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementDataFormat)) {
            query.put("IncrementDataFormat", request.incrementDataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openAutoDownload)) {
            query.put("OpenAutoDownload", request.openAutoDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupSetDownloadRules"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupSetDownloadRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables, configures, or disables the automatic download feature.</p>
     * 
     * @param request ModifyBackupSetDownloadRulesRequest
     * @return ModifyBackupSetDownloadRulesResponse
     */
    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRules(ModifyBackupSetDownloadRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupSetDownloadRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the data source of a backup schedule.</p>
     * 
     * @param request ModifyBackupSourceEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupSourceEndpointResponse
     */
    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpointWithOptions(ModifyBackupSourceEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupGatewayId)) {
            query.put("BackupGatewayId", request.backupGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupObjects)) {
            query.put("BackupObjects", request.backupObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossAliyunId)) {
            query.put("CrossAliyunId", request.crossAliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossRoleName)) {
            query.put("CrossRoleName", request.crossRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointIP)) {
            query.put("SourceEndpointIP", request.sourceEndpointIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceType)) {
            query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOracleSID)) {
            query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPort)) {
            query.put("SourceEndpointPort", request.sourceEndpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupSourceEndpoint"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupSourceEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the data source of a backup schedule.</p>
     * 
     * @param request ModifyBackupSourceEndpointRequest
     * @return ModifyBackupSourceEndpointResponse
     */
    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpoint(ModifyBackupSourceEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupSourceEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the backup time of a backup schedule.</p>
     * 
     * @param request ModifyBackupStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupStrategyResponse
     */
    public ModifyBackupStrategyResponse modifyBackupStrategyWithOptions(ModifyBackupStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupLogIntervalSeconds)) {
            query.put("BackupLogIntervalSeconds", request.backupLogIntervalSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPeriod)) {
            query.put("BackupPeriod", request.backupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStartTime)) {
            query.put("BackupStartTime", request.backupStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStrategyType)) {
            query.put("BackupStrategyType", request.backupStrategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupStrategy"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the backup time of a backup schedule.</p>
     * 
     * @param request ModifyBackupStrategyRequest
     * @return ModifyBackupStrategyResponse
     */
    public ModifyBackupStrategyResponse modifyBackupStrategy(ModifyBackupStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the lifecycle of data that is backed up based on a backup schedule.</p>
     * 
     * @param request ModifyStorageStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyStorageStrategyResponse
     */
    public ModifyStorageStrategyResponse modifyStorageStrategyWithOptions(ModifyStorageStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationArchivePeriod)) {
            query.put("DuplicationArchivePeriod", request.duplicationArchivePeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationInfrequentAccessPeriod)) {
            query.put("DuplicationInfrequentAccessPeriod", request.duplicationInfrequentAccessPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStorageStrategy"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStorageStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the lifecycle of data that is backed up based on a backup schedule.</p>
     * 
     * @param request ModifyStorageStrategyRequest
     * @return ModifyStorageStrategyResponse
     */
    public ModifyStorageStrategyResponse modifyStorageStrategy(ModifyStorageStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStorageStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Impacts</h2>
     * <p>After a pay-as-you-go backup schedule is released, it stops providing services. Database Backup (DBS) no longer charges you fees for this backup schedule.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go backup schedule.</p>
     * 
     * @param request ReleaseBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseBackupPlanResponse
     */
    public ReleaseBackupPlanResponse releaseBackupPlanWithOptions(ReleaseBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseBackupPlanResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Impacts</h2>
     * <p>After a pay-as-you-go backup schedule is released, it stops providing services. Database Backup (DBS) no longer charges you fees for this backup schedule.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go backup schedule.</p>
     * 
     * @param request ReleaseBackupPlanRequest
     * @return ReleaseBackupPlanResponse
     */
    public ReleaseBackupPlanResponse releaseBackupPlan(ReleaseBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a backup schedule.</p>
     * 
     * @param request RenewBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewBackupPlanResponse
     */
    public RenewBackupPlanResponse renewBackupPlanWithOptions(RenewBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a backup schedule.</p>
     * 
     * @param request RenewBackupPlanRequest
     * @return RenewBackupPlanResponse
     */
    public RenewBackupPlanResponse renewBackupPlan(RenewBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a backup schedule.</p>
     * 
     * @param request StartBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartBackupPlanResponse
     */
    public StartBackupPlanResponse startBackupPlanWithOptions(StartBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a backup schedule.</p>
     * 
     * @param request StartBackupPlanRequest
     * @return StartBackupPlanResponse
     */
    public StartBackupPlanResponse startBackupPlan(StartBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a restore task.</p>
     * 
     * @param request StartRestoreTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRestoreTaskResponse
     */
    public StartRestoreTaskResponse startRestoreTaskWithOptions(StartRestoreTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTaskId)) {
            query.put("RestoreTaskId", request.restoreTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRestoreTask"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRestoreTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a restore task.</p>
     * 
     * @param request StartRestoreTaskRequest
     * @return StartRestoreTaskResponse
     */
    public StartRestoreTaskResponse startRestoreTask(StartRestoreTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRestoreTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a backup schedule.</p>
     * 
     * @param request StopBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopBackupPlanResponse
     */
    public StopBackupPlanResponse stopBackupPlanWithOptions(StopBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopMethod)) {
            query.put("StopMethod", request.stopMethod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a backup schedule.</p>
     * 
     * @param request StopBackupPlanRequest
     * @return StopBackupPlanResponse
     */
    public StopBackupPlanResponse stopBackupPlan(StopBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopBackupPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a backup schedule.</p>
     * 
     * @param request UpgradeBackupPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeBackupPlanResponse
     */
    public UpgradeBackupPlanResponse upgradeBackupPlanWithOptions(UpgradeBackupPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupPlanId)) {
            query.put("BackupPlanId", request.backupPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeBackupPlan"),
            new TeaPair("version", "2019-03-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeBackupPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a backup schedule.</p>
     * 
     * @param request UpgradeBackupPlanRequest
     * @return UpgradeBackupPlanResponse
     */
    public UpgradeBackupPlanResponse upgradeBackupPlan(UpgradeBackupPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeBackupPlanWithOptions(request, runtime);
    }
}
