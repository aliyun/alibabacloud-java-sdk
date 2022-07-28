// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306;

import com.aliyun.tea.*;
import com.aliyun.dbs20190306.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public ConfigureBackupPlanResponse configureBackupPlanWithOptions(ConfigureBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ConfigureBackupPlanResponse configureBackupPlan(ConfigureBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureBackupPlanWithOptions(request, runtime);
    }

    public CreateAndStartBackupPlanResponse createAndStartBackupPlanWithOptions(CreateAndStartBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAndStartBackupPlanResponse createAndStartBackupPlan(CreateAndStartBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAndStartBackupPlanWithOptions(request, runtime);
    }

    public CreateBackupPlanResponse createBackupPlanWithOptions(CreateBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateBackupPlanResponse createBackupPlan(CreateBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPlanWithOptions(request, runtime);
    }

    public CreateFullBackupSetDownloadResponse createFullBackupSetDownloadWithOptions(CreateFullBackupSetDownloadRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateFullBackupSetDownloadResponse createFullBackupSetDownload(CreateFullBackupSetDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFullBackupSetDownloadWithOptions(request, runtime);
    }

    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTaskWithOptions(CreateGetDBListFromAgentTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateGetDBListFromAgentTaskResponse createGetDBListFromAgentTask(CreateGetDBListFromAgentTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGetDBListFromAgentTaskWithOptions(request, runtime);
    }

    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownloadWithOptions(CreateIncrementBackupSetDownloadRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateIncrementBackupSetDownloadResponse createIncrementBackupSetDownload(CreateIncrementBackupSetDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIncrementBackupSetDownloadWithOptions(request, runtime);
    }

    public CreateRestoreTaskResponse createRestoreTaskWithOptions(CreateRestoreTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRestoreTaskResponse createRestoreTask(CreateRestoreTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRestoreTaskWithOptions(request, runtime);
    }

    public DescribeBackupGatewayListResponse describeBackupGatewayListWithOptions(DescribeBackupGatewayListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeBackupGatewayListResponse describeBackupGatewayList(DescribeBackupGatewayListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupGatewayListWithOptions(request, runtime);
    }

    public DescribeBackupPlanBillingResponse describeBackupPlanBillingWithOptions(DescribeBackupPlanBillingRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeBackupPlanBillingResponse describeBackupPlanBilling(DescribeBackupPlanBillingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanBillingWithOptions(request, runtime);
    }

    public DescribeBackupPlanListResponse describeBackupPlanListWithOptions(DescribeBackupPlanListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeBackupPlanListResponse describeBackupPlanList(DescribeBackupPlanListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPlanListWithOptions(request, runtime);
    }

    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskListWithOptions(DescribeBackupSetDownloadTaskListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeBackupSetDownloadTaskListResponse describeBackupSetDownloadTaskList(DescribeBackupSetDownloadTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupSetDownloadTaskListWithOptions(request, runtime);
    }

    public DescribeDLAServiceResponse describeDLAServiceWithOptions(DescribeDLAServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeDLAServiceResponse describeDLAService(DescribeDLAServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDLAServiceWithOptions(request, runtime);
    }

    public DescribeFullBackupListResponse describeFullBackupListWithOptions(DescribeFullBackupListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeFullBackupListResponse describeFullBackupList(DescribeFullBackupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFullBackupListWithOptions(request, runtime);
    }

    public DescribeIncrementBackupListResponse describeIncrementBackupListWithOptions(DescribeIncrementBackupListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeIncrementBackupListResponse describeIncrementBackupList(DescribeIncrementBackupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIncrementBackupListWithOptions(request, runtime);
    }

    public DescribeJobErrorCodeResponse describeJobErrorCodeWithOptions(DescribeJobErrorCodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeJobErrorCodeResponse describeJobErrorCode(DescribeJobErrorCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobErrorCodeWithOptions(request, runtime);
    }

    public DescribeNodeCidrListResponse describeNodeCidrListWithOptions(DescribeNodeCidrListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeNodeCidrListResponse describeNodeCidrList(DescribeNodeCidrListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodeCidrListWithOptions(request, runtime);
    }

    public DescribePreCheckProgressListResponse describePreCheckProgressListWithOptions(DescribePreCheckProgressListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribePreCheckProgressListResponse describePreCheckProgressList(DescribePreCheckProgressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePreCheckProgressListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfoWithOptions(DescribeRestoreRangeInfoRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRestoreRangeInfoResponse describeRestoreRangeInfo(DescribeRestoreRangeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreRangeInfoWithOptions(request, runtime);
    }

    public DescribeRestoreTaskListResponse describeRestoreTaskListWithOptions(DescribeRestoreTaskListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRestoreTaskListResponse describeRestoreTaskList(DescribeRestoreTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreTaskListWithOptions(request, runtime);
    }

    public DisableBackupLogResponse disableBackupLogWithOptions(DisableBackupLogRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableBackupLogResponse disableBackupLog(DisableBackupLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableBackupLogWithOptions(request, runtime);
    }

    public EnableBackupLogResponse enableBackupLogWithOptions(EnableBackupLogRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableBackupLogResponse enableBackupLog(EnableBackupLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableBackupLogWithOptions(request, runtime);
    }

    public GetDBListFromAgentResponse getDBListFromAgentWithOptions(GetDBListFromAgentRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetDBListFromAgentResponse getDBListFromAgent(GetDBListFromAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDBListFromAgentWithOptions(request, runtime);
    }

    public InitializeDbsServiceLinkedRoleResponse initializeDbsServiceLinkedRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public InitializeDbsServiceLinkedRoleResponse initializeDbsServiceLinkedRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeDbsServiceLinkedRoleWithOptions(runtime);
    }

    public ModifyBackupObjectsResponse modifyBackupObjectsWithOptions(ModifyBackupObjectsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBackupObjectsResponse modifyBackupObjects(ModifyBackupObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupObjectsWithOptions(request, runtime);
    }

    public ModifyBackupPlanNameResponse modifyBackupPlanNameWithOptions(ModifyBackupPlanNameRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBackupPlanNameResponse modifyBackupPlanName(ModifyBackupPlanNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPlanNameWithOptions(request, runtime);
    }

    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRulesWithOptions(ModifyBackupSetDownloadRulesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBackupSetDownloadRulesResponse modifyBackupSetDownloadRules(ModifyBackupSetDownloadRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupSetDownloadRulesWithOptions(request, runtime);
    }

    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpointWithOptions(ModifyBackupSourceEndpointRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBackupSourceEndpointResponse modifyBackupSourceEndpoint(ModifyBackupSourceEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupSourceEndpointWithOptions(request, runtime);
    }

    public ModifyBackupStrategyResponse modifyBackupStrategyWithOptions(ModifyBackupStrategyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyBackupStrategyResponse modifyBackupStrategy(ModifyBackupStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupStrategyWithOptions(request, runtime);
    }

    public ModifyStorageStrategyResponse modifyStorageStrategyWithOptions(ModifyStorageStrategyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyStorageStrategyResponse modifyStorageStrategy(ModifyStorageStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStorageStrategyWithOptions(request, runtime);
    }

    public ReleaseBackupPlanResponse releaseBackupPlanWithOptions(ReleaseBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ReleaseBackupPlanResponse releaseBackupPlan(ReleaseBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseBackupPlanWithOptions(request, runtime);
    }

    public RenewBackupPlanResponse renewBackupPlanWithOptions(RenewBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RenewBackupPlanResponse renewBackupPlan(RenewBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewBackupPlanWithOptions(request, runtime);
    }

    public StartBackupPlanResponse startBackupPlanWithOptions(StartBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StartBackupPlanResponse startBackupPlan(StartBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBackupPlanWithOptions(request, runtime);
    }

    public StartRestoreTaskResponse startRestoreTaskWithOptions(StartRestoreTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StartRestoreTaskResponse startRestoreTask(StartRestoreTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRestoreTaskWithOptions(request, runtime);
    }

    public StopBackupPlanResponse stopBackupPlanWithOptions(StopBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopBackupPlanResponse stopBackupPlan(StopBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopBackupPlanWithOptions(request, runtime);
    }

    public UpgradeBackupPlanResponse upgradeBackupPlanWithOptions(UpgradeBackupPlanRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpgradeBackupPlanResponse upgradeBackupPlan(UpgradeBackupPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeBackupPlanWithOptions(request, runtime);
    }
}
