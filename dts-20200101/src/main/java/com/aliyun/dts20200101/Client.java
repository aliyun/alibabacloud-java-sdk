// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101;

import com.aliyun.tea.*;
import com.aliyun.dts20200101.models.*;
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
            new TeaPair("cn-qingdao", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-east-1", "dts.aliyuncs.com"),
            new TeaPair("eu-central-1", "dts.aliyuncs.com"),
            new TeaPair("me-east-1", "dts.aliyuncs.com"),
            new TeaPair("ap-south-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dts.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dts.aliyuncs.com"),
            new TeaPair("cn-fujian", "dts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConfigureDtsJobResponse configureDtsJobWithOptions(ConfigureDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Checkpoint", request.checkpoint);
        query.put("DataInitialization", request.dataInitialization);
        query.put("DataSynchronization", request.dataSynchronization);
        query.put("DbList", request.dbList);
        query.put("DelayNotice", request.delayNotice);
        query.put("DelayPhone", request.delayPhone);
        query.put("DelayRuleTime", request.delayRuleTime);
        query.put("DestinationEndpointDataBaseName", request.destinationEndpointDataBaseName);
        query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        query.put("DestinationEndpointIP", request.destinationEndpointIP);
        query.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        query.put("DestinationEndpointInstanceType", request.destinationEndpointInstanceType);
        query.put("DestinationEndpointOracleSID", request.destinationEndpointOracleSID);
        query.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        query.put("DestinationEndpointPort", request.destinationEndpointPort);
        query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("DtsJobName", request.dtsJobName);
        query.put("ErrorNotice", request.errorNotice);
        query.put("ErrorPhone", request.errorPhone);
        query.put("JobType", request.jobType);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("Reserve", request.reserve);
        query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        query.put("SourceEndpointIP", request.sourceEndpointIP);
        query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
        query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        query.put("SourceEndpointPort", request.sourceEndpointPort);
        query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        query.put("SourceEndpointRole", request.sourceEndpointRole);
        query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        query.put("StructureInitialization", request.structureInitialization);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureDtsJobResponse());
    }

    public ConfigureDtsJobResponse configureDtsJob(ConfigureDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureDtsJobWithOptions(request, runtime);
    }

    public ConfigureMigrationJobResponse configureMigrationJobWithOptions(ConfigureMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("Checkpoint", request.checkpoint);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("MigrationJobName", request.migrationJobName);
        query.put("MigrationReserved", request.migrationReserved);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobResponse());
    }

    public ConfigureMigrationJobResponse configureMigrationJob(ConfigureMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureMigrationJobWithOptions(request, runtime);
    }

    public ConfigureMigrationJobAlertResponse configureMigrationJobAlertWithOptions(ConfigureMigrationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("DelayAlertPhone", request.delayAlertPhone);
        query.put("DelayAlertStatus", request.delayAlertStatus);
        query.put("DelayOverSeconds", request.delayOverSeconds);
        query.put("ErrorAlertPhone", request.errorAlertPhone);
        query.put("ErrorAlertStatus", request.errorAlertStatus);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobAlertResponse());
    }

    public ConfigureMigrationJobAlertResponse configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureMigrationJobAlertWithOptions(request, runtime);
    }

    public ConfigureSubscriptionResponse configureSubscriptionWithOptions(ConfigureSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Checkpoint", request.checkpoint);
        query.put("DbList", request.dbList);
        query.put("DelayNotice", request.delayNotice);
        query.put("DelayPhone", request.delayPhone);
        query.put("DelayRuleTime", request.delayRuleTime);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("DtsJobName", request.dtsJobName);
        query.put("ErrorNotice", request.errorNotice);
        query.put("ErrorPhone", request.errorPhone);
        query.put("RegionId", request.regionId);
        query.put("Reserve", request.reserve);
        query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        query.put("SourceEndpointIP", request.sourceEndpointIP);
        query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
        query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        query.put("SourceEndpointPort", request.sourceEndpointPort);
        query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        query.put("SourceEndpointRole", request.sourceEndpointRole);
        query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        query.put("SubscriptionInstanceVPCId", request.subscriptionInstanceVPCId);
        query.put("SubscriptionInstanceVSwitchId", request.subscriptionInstanceVSwitchId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionResponse());
    }

    public ConfigureSubscriptionResponse configureSubscription(ConfigureSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSubscriptionWithOptions(request, runtime);
    }

    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstanceWithOptions(ConfigureSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionInstanceResponse());
    }

    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSubscriptionInstanceWithOptions(request, runtime);
    }

    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlertWithOptions(ConfigureSubscriptionInstanceAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("DelayAlertPhone", request.delayAlertPhone);
        query.put("DelayAlertStatus", request.delayAlertStatus);
        query.put("DelayOverSeconds", request.delayOverSeconds);
        query.put("ErrorAlertPhone", request.errorAlertPhone);
        query.put("ErrorAlertStatus", request.errorAlertStatus);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionInstanceAlertResponse());
    }

    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobResponse configureSynchronizationJobWithOptions(ConfigureSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("Checkpoint", request.checkpoint);
        query.put("DataInitialization", request.dataInitialization);
        query.put("MigrationReserved", request.migrationReserved);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("StructureInitialization", request.structureInitialization);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        query.put("SynchronizationJobName", request.synchronizationJobName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobResponse());
    }

    public ConfigureSynchronizationJobResponse configureSynchronizationJob(ConfigureSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlertWithOptions(ConfigureSynchronizationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("DelayAlertPhone", request.delayAlertPhone);
        query.put("DelayAlertStatus", request.delayAlertStatus);
        query.put("DelayOverSeconds", request.delayOverSeconds);
        query.put("ErrorAlertPhone", request.errorAlertPhone);
        query.put("ErrorAlertStatus", request.errorAlertStatus);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobAlertResponse());
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobAlertWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompareWithOptions(ConfigureSynchronizationJobReplicatorCompareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        query.put("SynchronizationReplicatorCompareEnable", request.synchronizationReplicatorCompareEnable);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobReplicatorCompareResponse());
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    public CountJobByConditionResponse countJobByConditionWithOptions(CountJobByConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestDbType", request.destDbType);
        query.put("GroupId", request.groupId);
        query.put("JobType", request.jobType);
        query.put("Params", request.params);
        query.put("Region", request.region);
        query.put("RegionId", request.regionId);
        query.put("SrcDbType", request.srcDbType);
        query.put("Status", request.status);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountJobByCondition"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountJobByConditionResponse());
    }

    public CountJobByConditionResponse countJobByCondition(CountJobByConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countJobByConditionWithOptions(request, runtime);
    }

    public CreateConsumerChannelResponse createConsumerChannelWithOptions(CreateConsumerChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsumerGroupName", request.consumerGroupName);
        query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerChannelResponse());
    }

    public CreateConsumerChannelResponse createConsumerChannel(CreateConsumerChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerChannelWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ConsumerGroupName", request.consumerGroupName);
        query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateDtsInstanceResponse createDtsInstanceWithOptions(CreateDtsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AutoPay", request.autoPay);
        query.put("AutoStart", request.autoStart);
        query.put("ComputeUnit", request.computeUnit);
        query.put("DatabaseCount", request.databaseCount);
        query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        query.put("DestinationRegion", request.destinationRegion);
        query.put("FeeType", request.feeType);
        query.put("InstanceClass", request.instanceClass);
        query.put("JobId", request.jobId);
        query.put("PayType", request.payType);
        query.put("Period", request.period);
        query.put("Quantity", request.quantity);
        query.put("RegionId", request.regionId);
        query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        query.put("SourceRegion", request.sourceRegion);
        query.put("SyncArchitecture", request.syncArchitecture);
        query.put("Type", request.type);
        query.put("UsedTime", request.usedTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDtsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDtsInstanceResponse());
    }

    public CreateDtsInstanceResponse createDtsInstance(CreateDtsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDtsInstanceWithOptions(request, runtime);
    }

    public CreateJobMonitorRuleResponse createJobMonitorRuleWithOptions(CreateJobMonitorRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DelayRuleTime", request.delayRuleTime);
        query.put("DtsJobId", request.dtsJobId);
        query.put("Phone", request.phone);
        query.put("RegionId", request.regionId);
        query.put("State", request.state);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobMonitorRuleResponse());
    }

    public CreateJobMonitorRuleResponse createJobMonitorRule(CreateJobMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobMonitorRuleWithOptions(request, runtime);
    }

    public CreateMigrationJobResponse createMigrationJobWithOptions(CreateMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobClass", request.migrationJobClass);
        query.put("OwnerId", request.ownerId);
        query.put("Region", request.region);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMigrationJobResponse());
    }

    public CreateMigrationJobResponse createMigrationJob(CreateMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMigrationJobWithOptions(request, runtime);
    }

    public CreateSubscriptionInstanceResponse createSubscriptionInstanceWithOptions(CreateSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("PayType", request.payType);
        query.put("Period", request.period);
        query.put("Region", request.region);
        query.put("RegionId", request.regionId);
        query.put("UsedTime", request.usedTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionInstanceResponse());
    }

    public CreateSubscriptionInstanceResponse createSubscriptionInstance(CreateSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscriptionInstanceWithOptions(request, runtime);
    }

    public CreateSynchronizationJobResponse createSynchronizationJobWithOptions(CreateSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("DBInstanceCount", request.DBInstanceCount);
        query.put("DestRegion", request.destRegion);
        query.put("OwnerId", request.ownerId);
        query.put("PayType", request.payType);
        query.put("Period", request.period);
        query.put("RegionId", request.regionId);
        query.put("SourceRegion", request.sourceRegion);
        query.put("SynchronizationJobClass", request.synchronizationJobClass);
        query.put("Topology", request.topology);
        query.put("UsedTime", request.usedTime);
        query.put("networkType", request.networkType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynchronizationJobResponse());
    }

    public CreateSynchronizationJobResponse createSynchronizationJob(CreateSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSynchronizationJobWithOptions(request, runtime);
    }

    public DeleteConsumerChannelResponse deleteConsumerChannelWithOptions(DeleteConsumerChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsumerGroupId", request.consumerGroupId);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerChannelResponse());
    }

    public DeleteConsumerChannelResponse deleteConsumerChannel(DeleteConsumerChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerChannelWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ConsumerGroupID", request.consumerGroupID);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteDtsJobResponse deleteDtsJobWithOptions(DeleteDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDtsJobResponse());
    }

    public DeleteDtsJobResponse deleteDtsJob(DeleteDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDtsJobWithOptions(request, runtime);
    }

    public DeleteMigrationJobResponse deleteMigrationJobWithOptions(DeleteMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMigrationJobResponse());
    }

    public DeleteMigrationJobResponse deleteMigrationJob(DeleteMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMigrationJobWithOptions(request, runtime);
    }

    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstanceWithOptions(DeleteSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscriptionInstanceResponse());
    }

    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscriptionInstanceWithOptions(request, runtime);
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJobWithOptions(DeleteSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSynchronizationJobResponse());
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJob(DeleteSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSynchronizationJobWithOptions(request, runtime);
    }

    public DescribeConnectionStatusResponse describeConnectionStatusWithOptions(DescribeConnectionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestinationEndpointArchitecture", request.destinationEndpointArchitecture);
        query.put("DestinationEndpointDatabaseName", request.destinationEndpointDatabaseName);
        query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        query.put("DestinationEndpointIP", request.destinationEndpointIP);
        query.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        query.put("DestinationEndpointInstanceType", request.destinationEndpointInstanceType);
        query.put("DestinationEndpointOracleSID", request.destinationEndpointOracleSID);
        query.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        query.put("DestinationEndpointPort", request.destinationEndpointPort);
        query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        query.put("RegionId", request.regionId);
        query.put("SourceEndpointArchitecture", request.sourceEndpointArchitecture);
        query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        query.put("SourceEndpointIP", request.sourceEndpointIP);
        query.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        query.put("SourceEndpointInstanceType", request.sourceEndpointInstanceType);
        query.put("SourceEndpointOracleSID", request.sourceEndpointOracleSID);
        query.put("SourceEndpointPassword", request.sourceEndpointPassword);
        query.put("SourceEndpointPort", request.sourceEndpointPort);
        query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConnectionStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConnectionStatusResponse());
    }

    public DescribeConnectionStatusResponse describeConnectionStatus(DescribeConnectionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConnectionStatusWithOptions(request, runtime);
    }

    public DescribeConsumerChannelResponse describeConsumerChannelWithOptions(DescribeConsumerChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ParentChannelId", request.parentChannelId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerChannelResponse());
    }

    public DescribeConsumerChannelResponse describeConsumerChannel(DescribeConsumerChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConsumerChannelWithOptions(request, runtime);
    }

    public DescribeConsumerGroupResponse describeConsumerGroupWithOptions(DescribeConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerGroupResponse());
    }

    public DescribeConsumerGroupResponse describeConsumerGroup(DescribeConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConsumerGroupWithOptions(request, runtime);
    }

    public DescribeDTSIPResponse describeDTSIPWithOptions(DescribeDTSIPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        query.put("RegionId", request.regionId);
        query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDTSIP"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDTSIPResponse());
    }

    public DescribeDTSIPResponse describeDTSIP(DescribeDTSIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDTSIPWithOptions(request, runtime);
    }

    public DescribeDtsJobDetailResponse describeDtsJobDetailWithOptions(DescribeDtsJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceID", request.dtsInstanceID);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobDetailResponse());
    }

    public DescribeDtsJobDetailResponse describeDtsJobDetail(DescribeDtsJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDtsJobDetailWithOptions(request, runtime);
    }

    public DescribeDtsJobsResponse describeDtsJobsWithOptions(DescribeDtsJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupId", request.groupId);
        query.put("JobType", request.jobType);
        query.put("OrderColumn", request.orderColumn);
        query.put("OrderDirection", request.orderDirection);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("Params", request.params);
        query.put("Region", request.region);
        query.put("RegionId", request.regionId);
        query.put("Status", request.status);
        query.put("Tags", request.tags);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobsResponse());
    }

    public DescribeDtsJobsResponse describeDtsJobs(DescribeDtsJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDtsJobsWithOptions(request, runtime);
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusWithOptions(DescribeEndpointSwitchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointSwitchStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointSwitchStatusResponse());
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointSwitchStatusWithOptions(request, runtime);
    }

    public DescribeInitializationStatusResponse describeInitializationStatusWithOptions(DescribeInitializationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInitializationStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInitializationStatusResponse());
    }

    public DescribeInitializationStatusResponse describeInitializationStatus(DescribeInitializationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInitializationStatusWithOptions(request, runtime);
    }

    public DescribeJobMonitorRuleResponse describeJobMonitorRuleWithOptions(DescribeJobMonitorRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobMonitorRuleResponse());
    }

    public DescribeJobMonitorRuleResponse describeJobMonitorRule(DescribeJobMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJobMonitorRuleWithOptions(request, runtime);
    }

    public DescribeMigrationJobAlertResponse describeMigrationJobAlertWithOptions(DescribeMigrationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobAlertResponse());
    }

    public DescribeMigrationJobAlertResponse describeMigrationJobAlert(DescribeMigrationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobAlertWithOptions(request, runtime);
    }

    public DescribeMigrationJobDetailResponse describeMigrationJobDetailWithOptions(DescribeMigrationJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobDetailResponse());
    }

    public DescribeMigrationJobDetailResponse describeMigrationJobDetail(DescribeMigrationJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobDetailWithOptions(request, runtime);
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatusWithOptions(DescribeMigrationJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobStatusResponse());
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobStatusWithOptions(request, runtime);
    }

    public DescribeMigrationJobsResponse describeMigrationJobsWithOptions(DescribeMigrationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("MigrationJobName", request.migrationJobName);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobsResponse());
    }

    public DescribeMigrationJobsResponse describeMigrationJobs(DescribeMigrationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobsWithOptions(request, runtime);
    }

    public DescribePreCheckStatusResponse describePreCheckStatusWithOptions(DescribePreCheckStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("JobCode", request.jobCode);
        query.put("Name", request.name);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("StructPhase", request.structPhase);
        query.put("StructType", request.structType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckStatusResponse());
    }

    public DescribePreCheckStatusResponse describePreCheckStatus(DescribePreCheckStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePreCheckStatusWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertWithOptions(DescribeSubscriptionInstanceAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceAlertResponse());
    }

    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusWithOptions(DescribeSubscriptionInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceStatusResponse());
    }

    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstanceStatusWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstancesResponse describeSubscriptionInstancesWithOptions(DescribeSubscriptionInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstances"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstancesResponse());
    }

    public DescribeSubscriptionInstancesResponse describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstancesWithOptions(request, runtime);
    }

    public DescribeSubscriptionMetaResponse describeSubscriptionMetaWithOptions(DescribeSubscriptionMetaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSubscriptionMetaShrinkRequest request = new DescribeSubscriptionMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subMigrationJobIds)) {
            request.subMigrationJobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subMigrationJobIds, "SubMigrationJobIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.topics)) {
            request.topicsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.topics, "Topics", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("RegionId", request.regionId);
        query.put("Sid", request.sid);
        query.put("SubMigrationJobIds", request.subMigrationJobIdsShrink);
        query.put("Topics", request.topicsShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionMeta"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionMetaResponse());
    }

    public DescribeSubscriptionMetaResponse describeSubscriptionMeta(DescribeSubscriptionMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionMetaWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertWithOptions(DescribeSynchronizationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobAlertResponse());
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobAlertWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompareWithOptions(DescribeSynchronizationJobReplicatorCompareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobReplicatorCompareResponse());
    }

    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusWithOptions(DescribeSynchronizationJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusResponse());
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobStatusWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusListWithOptions(DescribeSynchronizationJobStatusListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationJobIdListJsonStr", request.synchronizationJobIdListJsonStr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatusList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusListResponse());
    }

    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobStatusListWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobsWithOptions(DescribeSynchronizationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationJobName", request.synchronizationJobName);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobsResponse());
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobsWithOptions(request, runtime);
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusWithOptions(DescribeSynchronizationObjectModifyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationObjectModifyStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationObjectModifyStatusResponse());
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationObjectModifyStatusWithOptions(request, runtime);
    }

    public InitDtsRdsInstanceResponse initDtsRdsInstanceWithOptions(InitDtsRdsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("EndpointCenId", request.endpointCenId);
        query.put("EndpointInstanceId", request.endpointInstanceId);
        query.put("EndpointInstanceType", request.endpointInstanceType);
        query.put("EndpointRegion", request.endpointRegion);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitDtsRdsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitDtsRdsInstanceResponse());
    }

    public InitDtsRdsInstanceResponse initDtsRdsInstance(InitDtsRdsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initDtsRdsInstanceWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyConsumerChannelResponse modifyConsumerChannelWithOptions(ModifyConsumerChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsumerGroupId", request.consumerGroupId);
        query.put("ConsumerGroupName", request.consumerGroupName);
        query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerChannelResponse());
    }

    public ModifyConsumerChannelResponse modifyConsumerChannel(ModifyConsumerChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConsumerChannelWithOptions(request, runtime);
    }

    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPasswordWithOptions(ModifyConsumerGroupPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ConsumerGroupID", request.consumerGroupID);
        query.put("ConsumerGroupName", request.consumerGroupName);
        query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        query.put("consumerGroupNewPassword", request.consumerGroupNewPassword);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerGroupPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerGroupPasswordResponse());
    }

    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConsumerGroupPasswordWithOptions(request, runtime);
    }

    public ModifyConsumptionTimestampResponse modifyConsumptionTimestampWithOptions(ModifyConsumptionTimestampRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ConsumptionTimestamp", request.consumptionTimestamp);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumptionTimestamp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumptionTimestampResponse());
    }

    public ModifyConsumptionTimestampResponse modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConsumptionTimestampWithOptions(request, runtime);
    }

    public ModifyDtsJobResponse modifyDtsJobWithOptions(ModifyDtsJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDtsJobShrinkRequest request = new ModifyDtsJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbList)) {
            request.dbListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbList, "DbList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobResponse());
    }

    public ModifyDtsJobResponse modifyDtsJob(ModifyDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDtsJobWithOptions(request, runtime);
    }

    public ModifyDtsJobNameResponse modifyDtsJobNameWithOptions(ModifyDtsJobNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("DtsJobName", request.dtsJobName);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobName"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobNameResponse());
    }

    public ModifyDtsJobNameResponse modifyDtsJobName(ModifyDtsJobNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDtsJobNameWithOptions(request, runtime);
    }

    public ModifyDtsJobPasswordResponse modifyDtsJobPasswordWithOptions(ModifyDtsJobPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("Endpoint", request.endpoint);
        query.put("Password", request.password);
        query.put("RegionId", request.regionId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobPasswordResponse());
    }

    public ModifyDtsJobPasswordResponse modifyDtsJobPassword(ModifyDtsJobPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDtsJobPasswordWithOptions(request, runtime);
    }

    public ModifySubscriptionResponse modifySubscriptionWithOptions(ModifySubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DbList", request.dbList);
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionResponse());
    }

    public ModifySubscriptionResponse modifySubscription(ModifySubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySubscriptionWithOptions(request, runtime);
    }

    public ModifySubscriptionObjectResponse modifySubscriptionObjectWithOptions(ModifySubscriptionObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        query.put("SubscriptionObject", request.subscriptionObject);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscriptionObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionObjectResponse());
    }

    public ModifySubscriptionObjectResponse modifySubscriptionObject(ModifySubscriptionObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySubscriptionObjectWithOptions(request, runtime);
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObjectWithOptions(ModifySynchronizationObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        query.put("SynchronizationObjects", request.synchronizationObjects);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySynchronizationObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySynchronizationObjectResponse());
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObject(ModifySynchronizationObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySynchronizationObjectWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BuyCount", request.buyCount);
        query.put("ChargeType", request.chargeType);
        query.put("DtsJobId", request.dtsJobId);
        query.put("Period", request.period);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public ResetDtsJobResponse resetDtsJobWithOptions(ResetDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDtsJobResponse());
    }

    public ResetDtsJobResponse resetDtsJob(ResetDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetDtsJobWithOptions(request, runtime);
    }

    public ResetSynchronizationJobResponse resetSynchronizationJobWithOptions(ResetSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSynchronizationJobResponse());
    }

    public ResetSynchronizationJobResponse resetSynchronizationJob(ResetSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSynchronizationJobWithOptions(request, runtime);
    }

    public ShieldPrecheckResponse shieldPrecheckWithOptions(ShieldPrecheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("PrecheckItems", request.precheckItems);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShieldPrecheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShieldPrecheckResponse());
    }

    public ShieldPrecheckResponse shieldPrecheck(ShieldPrecheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.shieldPrecheckWithOptions(request, runtime);
    }

    public SkipPreCheckResponse skipPreCheckWithOptions(SkipPreCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("JobId", request.jobId);
        query.put("RegionId", request.regionId);
        query.put("Skip", request.skip);
        query.put("SkipPreCheckItems", request.skipPreCheckItems);
        query.put("SkipPreCheckNames", request.skipPreCheckNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipPreCheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPreCheckResponse());
    }

    public SkipPreCheckResponse skipPreCheck(SkipPreCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.skipPreCheckWithOptions(request, runtime);
    }

    public StartDtsJobResponse startDtsJobWithOptions(StartDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDtsJobResponse());
    }

    public StartDtsJobResponse startDtsJob(StartDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDtsJobWithOptions(request, runtime);
    }

    public StartMigrationJobResponse startMigrationJobWithOptions(StartMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationJobResponse());
    }

    public StartMigrationJobResponse startMigrationJob(StartMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMigrationJobWithOptions(request, runtime);
    }

    public StartSubscriptionInstanceResponse startSubscriptionInstanceWithOptions(StartSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSubscriptionInstanceResponse());
    }

    public StartSubscriptionInstanceResponse startSubscriptionInstance(StartSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startSubscriptionInstanceWithOptions(request, runtime);
    }

    public StartSynchronizationJobResponse startSynchronizationJobWithOptions(StartSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSynchronizationJobResponse());
    }

    public StartSynchronizationJobResponse startSynchronizationJob(StartSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startSynchronizationJobWithOptions(request, runtime);
    }

    public StopDtsJobResponse stopDtsJobWithOptions(StopDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDtsJobResponse());
    }

    public StopDtsJobResponse stopDtsJob(StopDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDtsJobWithOptions(request, runtime);
    }

    public StopMigrationJobResponse stopMigrationJobWithOptions(StopMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMigrationJobResponse());
    }

    public StopMigrationJobResponse stopMigrationJob(StopMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMigrationJobWithOptions(request, runtime);
    }

    public SuspendDtsJobResponse suspendDtsJobWithOptions(SuspendDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsInstanceId", request.dtsInstanceId);
        query.put("DtsJobId", request.dtsJobId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendDtsJobResponse());
    }

    public SuspendDtsJobResponse suspendDtsJob(SuspendDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendDtsJobWithOptions(request, runtime);
    }

    public SuspendMigrationJobResponse suspendMigrationJobWithOptions(SuspendMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("ClientToken", request.clientToken);
        query.put("MigrationJobId", request.migrationJobId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendMigrationJobResponse());
    }

    public SuspendMigrationJobResponse suspendMigrationJob(SuspendMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendMigrationJobWithOptions(request, runtime);
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJobWithOptions(SuspendSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendSynchronizationJobResponse());
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJob(SuspendSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendSynchronizationJobWithOptions(request, runtime);
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpointWithOptions(SwitchSynchronizationEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountId", request.accountId);
        query.put("OwnerId", request.ownerId);
        query.put("RegionId", request.regionId);
        query.put("SynchronizationDirection", request.synchronizationDirection);
        query.put("SynchronizationJobId", request.synchronizationJobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSynchronizationEndpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSynchronizationEndpointResponse());
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchSynchronizationEndpointWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TransferInstanceClassResponse transferInstanceClassWithOptions(TransferInstanceClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DtsJobId", request.dtsJobId);
        query.put("InstanceClass", request.instanceClass);
        query.put("OrderType", request.orderType);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInstanceClass"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInstanceClassResponse());
    }

    public TransferInstanceClassResponse transferInstanceClass(TransferInstanceClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferInstanceClassWithOptions(request, runtime);
    }

    public TransferPayTypeResponse transferPayTypeWithOptions(TransferPayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BuyCount", request.buyCount);
        query.put("ChargeType", request.chargeType);
        query.put("DtsJobId", request.dtsJobId);
        query.put("Period", request.period);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferPayType"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferPayTypeResponse());
    }

    public TransferPayTypeResponse transferPayType(TransferPayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferPayTypeWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("RegionId", request.regionId);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeTwoWayResponse upgradeTwoWayWithOptions(UpgradeTwoWayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceClass", request.instanceClass);
        query.put("InstanceId", request.instanceId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeTwoWay"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeTwoWayResponse());
    }

    public UpgradeTwoWayResponse upgradeTwoWay(UpgradeTwoWayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeTwoWayWithOptions(request, runtime);
    }

    public WhiteIpListResponse whiteIpListWithOptions(WhiteIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DestinationRegion", request.destinationRegion);
        query.put("Region", request.region);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WhiteIpList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WhiteIpListResponse());
    }

    public WhiteIpListResponse whiteIpList(WhiteIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.whiteIpListWithOptions(request, runtime);
    }
}
