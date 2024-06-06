// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101;

import com.aliyun.tea.*;
import com.aliyun.dts20200101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @summary 配置DTS任务
     *
     * @description The name of the DTS instance.
     *
     * @param request ConfigureDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureDtsJobResponse
     */
    public ConfigureDtsJobResponse configureDtsJobWithOptions(ConfigureDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCheckConfigure)) {
            query.put("DataCheckConfigure", request.dataCheckConfigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSynchronization)) {
            query.put("DataSynchronization", request.dataSynchronization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayNotice)) {
            query.put("DelayNotice", request.delayNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayPhone)) {
            query.put("DelayPhone", request.delayPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCaCertificateOssUrl)) {
            query.put("DestCaCertificateOssUrl", request.destCaCertificateOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destCaCertificatePassword)) {
            query.put("DestCaCertificatePassword", request.destCaCertificatePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientCertOssUrl)) {
            query.put("DestClientCertOssUrl", request.destClientCertOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientKeyOssUrl)) {
            query.put("DestClientKeyOssUrl", request.destClientKeyOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destClientPassword)) {
            query.put("DestClientPassword", request.destClientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointDataBaseName)) {
            query.put("DestinationEndpointDataBaseName", request.destinationEndpointDataBaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointOwnerID)) {
            query.put("DestinationEndpointOwnerID", request.destinationEndpointOwnerID);
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

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRole)) {
            query.put("DestinationEndpointRole", request.destinationEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointUserName)) {
            query.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disasterRecoveryJob)) {
            query.put("DisasterRecoveryJob", request.disasterRecoveryJob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorNotice)) {
            query.put("ErrorNotice", request.errorNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorPhone)) {
            query.put("ErrorPhone", request.errorPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrl)) {
            query.put("FileOssUrl", request.fileOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOwnerID)) {
            query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRole)) {
            query.put("SourceEndpointRole", request.sourceEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointVSwitchID)) {
            query.put("SourceEndpointVSwitchID", request.sourceEndpointVSwitchID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificateOssUrl)) {
            query.put("SrcCaCertificateOssUrl", request.srcCaCertificateOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCaCertificatePassword)) {
            query.put("SrcCaCertificatePassword", request.srcCaCertificatePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientCertOssUrl)) {
            query.put("SrcClientCertOssUrl", request.srcClientCertOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientKeyOssUrl)) {
            query.put("SrcClientKeyOssUrl", request.srcClientKeyOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcClientPassword)) {
            query.put("SrcClientPassword", request.srcClientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            body.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserve)) {
            body.put("Reserve", request.reserve);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureDtsJobResponse());
    }

    /**
     * @summary 配置DTS任务
     *
     * @description The name of the DTS instance.
     *
     * @param request ConfigureDtsJobRequest
     * @return ConfigureDtsJobResponse
     */
    public ConfigureDtsJobResponse configureDtsJob(ConfigureDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureDtsJobWithOptions(request, runtime);
    }

    public ConfigureDtsJobResponse configureDtsJobAdvance(ConfigureDtsJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "Dts"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ConfigureDtsJobRequest configureDtsJobReq = new ConfigureDtsJobRequest();
        com.aliyun.openapiutil.Client.convert(request, configureDtsJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileOssUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            configureDtsJobReq.fileOssUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        ConfigureDtsJobResponse configureDtsJobResp = this.configureDtsJobWithOptions(configureDtsJobReq, runtime);
        return configureDtsJobResp;
    }

    /**
     * @summary Configures a data migration task.
     *
     * @description After you call this operation to configure a data migration task, the task will be automatically started. You do not need to call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to start the task.
     * A data migration task may fail to be started due to precheck failures. You can call the [DescribeMigrationJobStatus](https://help.aliyun.com/document_detail/49433.html) operation to query the error messages about precheck failures. Then, you can fix the issue based on the error messages. After you fix the issue, you must call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to restart the data migration task.
     *
     * @param request ConfigureMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureMigrationJobResponse
     */
    public ConfigureMigrationJobResponse configureMigrationJobWithOptions(ConfigureMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationReserved)) {
            query.put("MigrationReserved", request.migrationReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationMode)) {
            query.put("MigrationMode", request.migrationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationObject)) {
            body.put("MigrationObject", request.migrationObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Configures a data migration task.
     *
     * @description After you call this operation to configure a data migration task, the task will be automatically started. You do not need to call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to start the task.
     * A data migration task may fail to be started due to precheck failures. You can call the [DescribeMigrationJobStatus](https://help.aliyun.com/document_detail/49433.html) operation to query the error messages about precheck failures. Then, you can fix the issue based on the error messages. After you fix the issue, you must call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to restart the data migration task.
     *
     * @param request ConfigureMigrationJobRequest
     * @return ConfigureMigrationJobResponse
     */
    public ConfigureMigrationJobResponse configureMigrationJob(ConfigureMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureMigrationJobWithOptions(request, runtime);
    }

    /**
     * @param request ConfigureMigrationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureMigrationJobAlertResponse
     */
    public ConfigureMigrationJobAlertResponse configureMigrationJobAlertWithOptions(ConfigureMigrationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobAlertResponse());
    }

    /**
     * @param request ConfigureMigrationJobAlertRequest
     * @return ConfigureMigrationJobAlertResponse
     */
    public ConfigureMigrationJobAlertResponse configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureMigrationJobAlertWithOptions(request, runtime);
    }

    /**
     * @param request ConfigureSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionResponse
     */
    public ConfigureSubscriptionResponse configureSubscriptionWithOptions(ConfigureSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            query.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayNotice)) {
            query.put("DelayNotice", request.delayNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayPhone)) {
            query.put("DelayPhone", request.delayPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorNotice)) {
            query.put("ErrorNotice", request.errorNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorPhone)) {
            query.put("ErrorPhone", request.errorPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserve)) {
            query.put("Reserve", request.reserve);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointOwnerID)) {
            query.put("SourceEndpointOwnerID", request.sourceEndpointOwnerID);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRole)) {
            query.put("SourceEndpointRole", request.sourceEndpointRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            query.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDDL)) {
            query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDML)) {
            query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceNetworkType)) {
            query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceVPCId)) {
            query.put("SubscriptionInstanceVPCId", request.subscriptionInstanceVPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceVSwitchId)) {
            query.put("SubscriptionInstanceVSwitchId", request.subscriptionInstanceVSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionResponse());
    }

    /**
     * @param request ConfigureSubscriptionRequest
     * @return ConfigureSubscriptionResponse
     */
    public ConfigureSubscriptionResponse configureSubscription(ConfigureSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionWithOptions(request, runtime);
    }

    /**
     * @summary Before you call this operation, you must call the [CreateSubscriptionInstance](https://help.aliyun.com/document_detail/49436.html) operation to create a change tracking instance.
     *
     * @description The operation that you want to perform. Set the value to **ConfigureSubscriptionInstance**.
     *
     * @param request ConfigureSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionInstanceResponse
     */
    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstanceWithOptions(ConfigureSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceName)) {
            query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceNetworkType)) {
            query.put("SubscriptionInstanceNetworkType", request.subscriptionInstanceNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataType)) {
            query.put("SubscriptionDataType", request.subscriptionDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstance)) {
            query.put("SubscriptionInstance", request.subscriptionInstance);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionObject)) {
            body.put("SubscriptionObject", request.subscriptionObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Before you call this operation, you must call the [CreateSubscriptionInstance](https://help.aliyun.com/document_detail/49436.html) operation to create a change tracking instance.
     *
     * @description The operation that you want to perform. Set the value to **ConfigureSubscriptionInstance**.
     *
     * @param request ConfigureSubscriptionInstanceRequest
     * @return ConfigureSubscriptionInstanceResponse
     */
    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * @param request ConfigureSubscriptionInstanceAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlertWithOptions(ConfigureSubscriptionInstanceAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSubscriptionInstanceAlertResponse());
    }

    /**
     * @param request ConfigureSubscriptionInstanceAlertRequest
     * @return ConfigureSubscriptionInstanceAlertResponse
     */
    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, you must call the [CreateSynchronizationJob](https://help.aliyun.com/document_detail/49446.html) operation to create a data synchronization instance.
     * > 
     * *   After you call this operation to configure a data synchronization task, the task will be automatically started and prechecked. You do not need to call the [StartSynchronizationJob](https://help.aliyun.com/document_detail/49448.html) operation to start the task.
     * *   A data synchronization task may fail to be started due to precheck failures. You can call the [DescribeSynchronizationJobStatus](https://help.aliyun.com/document_detail/49453.html) operation to query the status of the task. Then, you can change parameter settings based on the error messages about the precheck failures. After you fix the issue, you must call the [StartSynchronizationJob](https://help.aliyun.com/document_detail/49448.html) operation to restart the data synchronization task.
     *
     * @param request ConfigureSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobResponse
     */
    public ConfigureSynchronizationJobResponse configureSynchronizationJobWithOptions(ConfigureSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationReserved)) {
            query.put("MigrationReserved", request.migrationReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionKey)) {
            query.put("PartitionKey", request.partitionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            body.put("SynchronizationObjects", request.synchronizationObjects);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @description Before you call this operation, you must call the [CreateSynchronizationJob](https://help.aliyun.com/document_detail/49446.html) operation to create a data synchronization instance.
     * > 
     * *   After you call this operation to configure a data synchronization task, the task will be automatically started and prechecked. You do not need to call the [StartSynchronizationJob](https://help.aliyun.com/document_detail/49448.html) operation to start the task.
     * *   A data synchronization task may fail to be started due to precheck failures. You can call the [DescribeSynchronizationJobStatus](https://help.aliyun.com/document_detail/49453.html) operation to query the status of the task. Then, you can change parameter settings based on the error messages about the precheck failures. After you fix the issue, you must call the [StartSynchronizationJob](https://help.aliyun.com/document_detail/49448.html) operation to restart the data synchronization task.
     *
     * @param request ConfigureSynchronizationJobRequest
     * @return ConfigureSynchronizationJobResponse
     */
    public ConfigureSynchronizationJobResponse configureSynchronizationJob(ConfigureSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @param request ConfigureSynchronizationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobAlertResponse
     */
    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlertWithOptions(ConfigureSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobAlertResponse());
    }

    /**
     * @param request ConfigureSynchronizationJobAlertRequest
     * @return ConfigureSynchronizationJobAlertResponse
     */
    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobAlertWithOptions(request, runtime);
    }

    /**
     * @description When you use Data Transmission Service (DTS) to synchronize data, other data sources may write data to the destination instance. In this case, data may become inconsistent between the source and destination instances. To ensure data consistency, you can enable image matching.
     * After you call this operation, you can call the [DescribeSynchronizationJobReplicatorCompare](https://help.aliyun.com/document_detail/199183.html) operation to verify whether image matching is enabled for the data synchronization instance.
     *
     * @param request ConfigureSynchronizationJobReplicatorCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompareWithOptions(ConfigureSynchronizationJobReplicatorCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationReplicatorCompareEnable)) {
            query.put("SynchronizationReplicatorCompareEnable", request.synchronizationReplicatorCompareEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobReplicatorCompareResponse());
    }

    /**
     * @description When you use Data Transmission Service (DTS) to synchronize data, other data sources may write data to the destination instance. In this case, data may become inconsistent between the source and destination instances. To ensure data consistency, you can enable image matching.
     * After you call this operation, you can call the [DescribeSynchronizationJobReplicatorCompare](https://help.aliyun.com/document_detail/199183.html) operation to verify whether image matching is enabled for the data synchronization instance.
     *
     * @param request ConfigureSynchronizationJobReplicatorCompareRequest
     * @return ConfigureSynchronizationJobReplicatorCompareResponse
     */
    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    /**
     * @summary 查询符合条件的任务数
     *
     * @param request CountJobByConditionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CountJobByConditionResponse
     */
    public CountJobByConditionResponse countJobByConditionWithOptions(CountJobByConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destDbType)) {
            query.put("DestDbType", request.destDbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbType)) {
            query.put("SrcDbType", request.srcDbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountJobByCondition"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountJobByConditionResponse());
    }

    /**
     * @summary 查询符合条件的任务数
     *
     * @param request CountJobByConditionRequest
     * @return CountJobByConditionResponse
     */
    public CountJobByConditionResponse countJobByCondition(CountJobByConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.countJobByConditionWithOptions(request, runtime);
    }

    /**
     * @param request CreateConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerChannelResponse
     */
    public CreateConsumerChannelResponse createConsumerChannelWithOptions(CreateConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerChannelResponse());
    }

    /**
     * @param request CreateConsumerChannelRequest
     * @return CreateConsumerChannelResponse
     */
    public CreateConsumerChannelResponse createConsumerChannel(CreateConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerChannelWithOptions(request, runtime);
    }

    /**
     * @param request CreateConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsumerGroupResponse());
    }

    /**
     * @param request CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates an alert rule.
     *
     * @param request CreateDedicatedClusterMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    public CreateDedicatedClusterMonitorRuleResponse createDedicatedClusterMonitorRuleWithOptions(CreateDedicatedClusterMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuAlarmThreshold)) {
            query.put("CpuAlarmThreshold", request.cpuAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskAlarmThreshold)) {
            query.put("DiskAlarmThreshold", request.diskAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duAlarmThreshold)) {
            query.put("DuAlarmThreshold", request.duAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memAlarmThreshold)) {
            query.put("MemAlarmThreshold", request.memAlarmThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeSwitch)) {
            query.put("NoticeSwitch", request.noticeSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phones)) {
            query.put("Phones", request.phones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedClusterMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedClusterMonitorRuleResponse());
    }

    /**
     * @summary Creates an alert rule.
     *
     * @param request CreateDedicatedClusterMonitorRuleRequest
     * @return CreateDedicatedClusterMonitorRuleResponse
     */
    public CreateDedicatedClusterMonitorRuleResponse createDedicatedClusterMonitorRule(CreateDedicatedClusterMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDedicatedClusterMonitorRuleWithOptions(request, runtime);
    }

    /**
     * @description *   Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of DTS.
     * *   If you want to run a DTS task on a DTS dedicated cluster, you must configure the task before you purchase a DTS instance. You can call the [ConfigureDtsJob](https://help.aliyun.com/document_detail/208399.html) operation to configure a DTS task.
     *
     * @param request CreateDtsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDtsInstanceResponse
     */
    public CreateDtsInstanceResponse createDtsInstanceWithOptions(CreateDtsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeUnit)) {
            query.put("ComputeUnit", request.computeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseCount)) {
            query.put("DatabaseCount", request.databaseCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegion)) {
            query.put("DestinationRegion", request.destinationRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.du)) {
            query.put("Du", request.du);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feeType)) {
            query.put("FeeType", request.feeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            query.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncArchitecture)) {
            query.put("SyncArchitecture", request.syncArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDtsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDtsInstanceResponse());
    }

    /**
     * @description *   Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of DTS.
     * *   If you want to run a DTS task on a DTS dedicated cluster, you must configure the task before you purchase a DTS instance. You can call the [ConfigureDtsJob](https://help.aliyun.com/document_detail/208399.html) operation to configure a DTS task.
     *
     * @param request CreateDtsInstanceRequest
     * @return CreateDtsInstanceResponse
     */
    public CreateDtsInstanceResponse createDtsInstance(CreateDtsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDtsInstanceWithOptions(request, runtime);
    }

    /**
     * @description DTS provides the following metrics for DTS tasks:************
     * *   **Latency**: DTS monitors the latency of a DTS task. If the latency of the task exceeds the specified threshold, an alert is triggered. Unit: seconds.
     * *   **Status**: DTS monitors the status of a DTS task. If the state of the task changes to **Error** or **Restore**, an alert is triggered.
     * *   **Full Timeout**: DTS monitors the duration of a DTS task. If the duration of the task exceeds the specified threshold, an alert is triggered. Unit: hours.
     *
     * @param request CreateJobMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobMonitorRuleResponse
     */
    public CreateJobMonitorRuleResponse createJobMonitorRuleWithOptions(CreateJobMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delayRuleTime)) {
            query.put("DelayRuleTime", request.delayRuleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeValue)) {
            query.put("NoticeValue", request.noticeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.times)) {
            query.put("Times", request.times);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobMonitorRuleResponse());
    }

    /**
     * @description DTS provides the following metrics for DTS tasks:************
     * *   **Latency**: DTS monitors the latency of a DTS task. If the latency of the task exceeds the specified threshold, an alert is triggered. Unit: seconds.
     * *   **Status**: DTS monitors the status of a DTS task. If the state of the task changes to **Error** or **Restore**, an alert is triggered.
     * *   **Full Timeout**: DTS monitors the duration of a DTS task. If the duration of the task exceeds the specified threshold, an alert is triggered. Unit: hours.
     *
     * @param request CreateJobMonitorRuleRequest
     * @return CreateJobMonitorRuleResponse
     */
    public CreateJobMonitorRuleResponse createJobMonitorRule(CreateJobMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobMonitorRuleWithOptions(request, runtime);
    }

    /**
     * @description >  This API operation is outdated. We recommend that you use the new version. For more information, see [CreateDtsInstance](https://help.aliyun.com/document_detail/208270.html).
     * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     * After you purchase a data migration instance, you must call the [ConfigureMigrationJob](https://help.aliyun.com/document_detail/324260.html) operation to configure a data migration task.
     *
     * @param request CreateMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMigrationJobResponse
     */
    public CreateMigrationJobResponse createMigrationJobWithOptions(CreateMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobClass)) {
            query.put("MigrationJobClass", request.migrationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMigrationJobResponse());
    }

    /**
     * @description >  This API operation is outdated. We recommend that you use the new version. For more information, see [CreateDtsInstance](https://help.aliyun.com/document_detail/208270.html).
     * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     * After you purchase a data migration instance, you must call the [ConfigureMigrationJob](https://help.aliyun.com/document_detail/324260.html) operation to configure a data migration task.
     *
     * @param request CreateMigrationJobRequest
     * @return CreateMigrationJobResponse
     */
    public CreateMigrationJobResponse createMigrationJob(CreateMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMigrationJobWithOptions(request, runtime);
    }

    /**
     * @summary 创建DTS反向增量同步任务
     *
     * @param request CreateReverseDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReverseDtsJobResponse
     */
    public CreateReverseDtsJobResponse createReverseDtsJobWithOptions(CreateReverseDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardPassword)) {
            query.put("ShardPassword", request.shardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardUsername)) {
            query.put("ShardUsername", request.shardUsername);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReverseDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReverseDtsJobResponse());
    }

    /**
     * @summary 创建DTS反向增量同步任务
     *
     * @param request CreateReverseDtsJobRequest
     * @return CreateReverseDtsJobResponse
     */
    public CreateReverseDtsJobResponse createReverseDtsJob(CreateReverseDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReverseDtsJobWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     *
     * @param request CreateSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubscriptionInstanceResponse
     */
    public CreateSubscriptionInstanceResponse createSubscriptionInstanceWithOptions(CreateSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscriptionInstanceResponse());
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     *
     * @param request CreateSubscriptionInstanceRequest
     * @return CreateSubscriptionInstanceResponse
     */
    public CreateSubscriptionInstanceResponse createSubscriptionInstance(CreateSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     * After you purchase a data synchronization instance, you must call the [ConfigureSynchronizationJob](https://help.aliyun.com/document_detail/49447.html) operation to configure a data synchronization task. Then, the task is automatically started.
     *
     * @param request CreateSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSynchronizationJobResponse
     */
    public CreateSynchronizationJobResponse createSynchronizationJobWithOptions(CreateSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceCount)) {
            query.put("DBInstanceCount", request.DBInstanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destRegion)) {
            query.put("DestRegion", request.destRegion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            query.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobClass)) {
            query.put("SynchronizationJobClass", request.synchronizationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topology)) {
            query.put("Topology", request.topology);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynchronizationJobResponse());
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS).
     * After you purchase a data synchronization instance, you must call the [ConfigureSynchronizationJob](https://help.aliyun.com/document_detail/49447.html) operation to configure a data synchronization task. Then, the task is automatically started.
     *
     * @param request CreateSynchronizationJobRequest
     * @return CreateSynchronizationJobResponse
     */
    public CreateSynchronizationJobResponse createSynchronizationJob(CreateSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @param request DeleteConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerChannelResponse
     */
    public DeleteConsumerChannelResponse deleteConsumerChannelWithOptions(DeleteConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerChannelResponse());
    }

    /**
     * @param request DeleteConsumerChannelRequest
     * @return DeleteConsumerChannelResponse
     */
    public DeleteConsumerChannelResponse deleteConsumerChannel(DeleteConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerChannelWithOptions(request, runtime);
    }

    /**
     * @param request DeleteConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupID)) {
            query.put("ConsumerGroupID", request.consumerGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    /**
     * @param request DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    /**
     * @summary The HTTP status code.
     *
     * @param request DeleteDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDtsJobResponse
     */
    public DeleteDtsJobResponse deleteDtsJobWithOptions(DeleteDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDtsJobResponse());
    }

    /**
     * @summary The HTTP status code.
     *
     * @param request DeleteDtsJobRequest
     * @return DeleteDtsJobResponse
     */
    public DeleteDtsJobResponse deleteDtsJob(DeleteDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDtsJobWithOptions(request, runtime);
    }

    /**
     * @summary Deletes multiple data migration, data synchronization, or change tracking tasks.
     *
     * @param request DeleteDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDtsJobsResponse
     */
    public DeleteDtsJobsResponse deleteDtsJobsWithOptions(DeleteDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDtsJobsResponse());
    }

    /**
     * @summary Deletes multiple data migration, data synchronization, or change tracking tasks.
     *
     * @param request DeleteDtsJobsRequest
     * @return DeleteDtsJobsResponse
     */
    public DeleteDtsJobsResponse deleteDtsJobs(DeleteDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDtsJobsWithOptions(request, runtime);
    }

    /**
     * @description >  After a data migration instance is released, it cannot be recovered.
     *
     * @param request DeleteMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMigrationJobResponse
     */
    public DeleteMigrationJobResponse deleteMigrationJobWithOptions(DeleteMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMigrationJobResponse());
    }

    /**
     * @description >  After a data migration instance is released, it cannot be recovered.
     *
     * @param request DeleteMigrationJobRequest
     * @return DeleteMigrationJobResponse
     */
    public DeleteMigrationJobResponse deleteMigrationJob(DeleteMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMigrationJobWithOptions(request, runtime);
    }

    /**
     * @description >  After a change tracking instance is released, it cannot be recovered.
     *
     * @param request DeleteSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubscriptionInstanceResponse
     */
    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstanceWithOptions(DeleteSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscriptionInstanceResponse());
    }

    /**
     * @description >  After a change tracking instance is released, it cannot be recovered.
     *
     * @param request DeleteSubscriptionInstanceRequest
     * @return DeleteSubscriptionInstanceResponse
     */
    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * @description >  After a data synchronization instance is released, it cannot be recovered.
     *
     * @param request DeleteSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSynchronizationJobResponse
     */
    public DeleteSynchronizationJobResponse deleteSynchronizationJobWithOptions(DeleteSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSynchronizationJobResponse());
    }

    /**
     * @description >  After a data synchronization instance is released, it cannot be recovered.
     *
     * @param request DeleteSynchronizationJobRequest
     * @return DeleteSynchronizationJobResponse
     */
    public DeleteSynchronizationJobResponse deleteSynchronizationJob(DeleteSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @summary 查询数据投递链路store账号
     *
     * @param request DescribeChannelAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelAccountResponse
     */
    public DescribeChannelAccountResponse describeChannelAccountWithOptions(DescribeChannelAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelAccount"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelAccountResponse());
    }

    /**
     * @summary 查询数据投递链路store账号
     *
     * @param request DescribeChannelAccountRequest
     * @return DescribeChannelAccountResponse
     */
    public DescribeChannelAccountResponse describeChannelAccount(DescribeChannelAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAccountWithOptions(request, runtime);
    }

    /**
     * @summary 请求所有数据校验任务数据
     *
     * @param request DescribeCheckJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCheckJobsResponse
     */
    public DescribeCheckJobsResponse describeCheckJobsWithOptions(DescribeCheckJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCheckJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCheckJobsResponse());
    }

    /**
     * @summary 请求所有数据校验任务数据
     *
     * @param request DescribeCheckJobsRequest
     * @return DescribeCheckJobsResponse
     */
    public DescribeCheckJobsResponse describeCheckJobs(DescribeCheckJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCheckJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries operation logs of a Data Transmission Service (DTS) dedicated cluster.
     *
     * @param request DescribeClusterOperateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterOperateLogsResponse
     */
    public DescribeClusterOperateLogsResponse describeClusterOperateLogsWithOptions(DescribeClusterOperateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            body.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterOperateLogs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterOperateLogsResponse());
    }

    /**
     * @summary Queries operation logs of a Data Transmission Service (DTS) dedicated cluster.
     *
     * @param request DescribeClusterOperateLogsRequest
     * @return DescribeClusterOperateLogsResponse
     */
    public DescribeClusterOperateLogsResponse describeClusterOperateLogs(DescribeClusterOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterOperateLogsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the resource usage of a cluster.
     *
     * @param request DescribeClusterUsedUtilizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterUsedUtilizationResponse
     */
    public DescribeClusterUsedUtilizationResponse describeClusterUsedUtilizationWithOptions(DescribeClusterUsedUtilizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            body.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterUsedUtilization"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterUsedUtilizationResponse());
    }

    /**
     * @summary Queries the resource usage of a cluster.
     *
     * @param request DescribeClusterUsedUtilizationRequest
     * @return DescribeClusterUsedUtilizationResponse
     */
    public DescribeClusterUsedUtilizationResponse describeClusterUsedUtilization(DescribeClusterUsedUtilizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterUsedUtilizationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConnectionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConnectionStatusResponse
     */
    public DescribeConnectionStatusResponse describeConnectionStatusWithOptions(DescribeConnectionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointArchitecture)) {
            query.put("DestinationEndpointArchitecture", request.destinationEndpointArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointDatabaseName)) {
            query.put("DestinationEndpointDatabaseName", request.destinationEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointEngineName)) {
            query.put("DestinationEndpointEngineName", request.destinationEndpointEngineName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointArchitecture)) {
            query.put("SourceEndpointArchitecture", request.sourceEndpointArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointDatabaseName)) {
            query.put("SourceEndpointDatabaseName", request.sourceEndpointDatabaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointEngineName)) {
            query.put("SourceEndpointEngineName", request.sourceEndpointEngineName);
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
            new TeaPair("action", "DescribeConnectionStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConnectionStatusResponse());
    }

    /**
     * @param request DescribeConnectionStatusRequest
     * @return DescribeConnectionStatusResponse
     */
    public DescribeConnectionStatusResponse describeConnectionStatus(DescribeConnectionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConnectionStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsumerChannelResponse
     */
    public DescribeConsumerChannelResponse describeConsumerChannelWithOptions(DescribeConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentChannelId)) {
            query.put("ParentChannelId", request.parentChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerChannelResponse());
    }

    /**
     * @param request DescribeConsumerChannelRequest
     * @return DescribeConsumerChannelResponse
     */
    public DescribeConsumerChannelResponse describeConsumerChannel(DescribeConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsumerChannelWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of consumer groups in a change tracking instance.
     *
     * @param request DescribeConsumerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsumerGroupResponse
     */
    public DescribeConsumerGroupResponse describeConsumerGroupWithOptions(DescribeConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsumerGroup"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsumerGroupResponse());
    }

    /**
     * @summary Queries the details of consumer groups in a change tracking instance.
     *
     * @param request DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     */
    public DescribeConsumerGroupResponse describeConsumerGroup(DescribeConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsumerGroupWithOptions(request, runtime);
    }

    /**
     * @description If the **source or destination instance** is an **on-premises database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](https://help.aliyun.com/document_detail/176627.html).
     * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on ECS**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically add the CIDR blocks of DTS servers to the security settings of the source or destination instance.
     *
     * @param request DescribeDTSIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDTSIPResponse
     */
    public DescribeDTSIPResponse describeDTSIPWithOptions(DescribeDTSIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointRegion)) {
            query.put("DestinationEndpointRegion", request.destinationEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            query.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDTSIP"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDTSIPResponse());
    }

    /**
     * @description If the **source or destination instance** is an **on-premises database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](https://help.aliyun.com/document_detail/176627.html).
     * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on ECS**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically add the CIDR blocks of DTS servers to the security settings of the source or destination instance.
     *
     * @param request DescribeDTSIPRequest
     * @return DescribeDTSIPResponse
     */
    public DescribeDTSIPResponse describeDTSIP(DescribeDTSIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDTSIPWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the data consistency verification report.
     *
     * @param request DescribeDataCheckReportUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckReportUrlResponse
     */
    public DescribeDataCheckReportUrlResponse describeDataCheckReportUrlWithOptions(DescribeDataCheckReportUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbName)) {
            query.put("TbName", request.tbName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckReportUrl"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckReportUrlResponse());
    }

    /**
     * @summary Queries the download URL of the data consistency verification report.
     *
     * @param request DescribeDataCheckReportUrlRequest
     * @return DescribeDataCheckReportUrlResponse
     */
    public DescribeDataCheckReportUrlResponse describeDataCheckReportUrl(DescribeDataCheckReportUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckReportUrlWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a data verification task.
     *
     * @param request DescribeDataCheckTableDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckTableDetailsResponse
     */
    public DescribeDataCheckTableDetailsResponse describeDataCheckTableDetailsWithOptions(DescribeDataCheckTableDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckTableDetails"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckTableDetailsResponse());
    }

    /**
     * @summary Queries the details of a data verification task.
     *
     * @param request DescribeDataCheckTableDetailsRequest
     * @return DescribeDataCheckTableDetailsResponse
     */
    public DescribeDataCheckTableDetailsResponse describeDataCheckTableDetails(DescribeDataCheckTableDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckTableDetailsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDataCheckTableDiffDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    public DescribeDataCheckTableDiffDetailsResponse describeDataCheckTableDiffDetailsWithOptions(DescribeDataCheckTableDiffDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkType)) {
            query.put("CheckType", request.checkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tbName)) {
            query.put("TbName", request.tbName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataCheckTableDiffDetails"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCheckTableDiffDetailsResponse());
    }

    /**
     * @param request DescribeDataCheckTableDiffDetailsRequest
     * @return DescribeDataCheckTableDiffDetailsResponse
     */
    public DescribeDataCheckTableDiffDetailsResponse describeDataCheckTableDiffDetails(DescribeDataCheckTableDiffDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCheckTableDiffDetailsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a dedicated cluster.
     *
     * @param request DescribeDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedClusterResponse
     */
    public DescribeDedicatedClusterResponse describeDedicatedClusterWithOptions(DescribeDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedClusterResponse());
    }

    /**
     * @summary Queries the information about a dedicated cluster.
     *
     * @param request DescribeDedicatedClusterRequest
     * @return DescribeDedicatedClusterResponse
     */
    public DescribeDedicatedClusterResponse describeDedicatedCluster(DescribeDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * @summary The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).
     *
     * @param request DescribeDedicatedClusterMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    public DescribeDedicatedClusterMonitorRuleResponse describeDedicatedClusterMonitorRuleWithOptions(DescribeDedicatedClusterMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDedicatedClusterMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDedicatedClusterMonitorRuleResponse());
    }

    /**
     * @summary The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).
     *
     * @param request DescribeDedicatedClusterMonitorRuleRequest
     * @return DescribeDedicatedClusterMonitorRuleResponse
     */
    public DescribeDedicatedClusterMonitorRuleResponse describeDedicatedClusterMonitorRule(DescribeDedicatedClusterMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDedicatedClusterMonitorRuleWithOptions(request, runtime);
    }

    /**
     * @summary 查询ETL任务版本信息
     *
     * @param request DescribeDtsEtlJobVersionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    public DescribeDtsEtlJobVersionInfoResponse describeDtsEtlJobVersionInfoWithOptions(DescribeDtsEtlJobVersionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsEtlJobVersionInfo"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsEtlJobVersionInfoResponse());
    }

    /**
     * @summary 查询ETL任务版本信息
     *
     * @param request DescribeDtsEtlJobVersionInfoRequest
     * @return DescribeDtsEtlJobVersionInfoResponse
     */
    public DescribeDtsEtlJobVersionInfoResponse describeDtsEtlJobVersionInfo(DescribeDtsEtlJobVersionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsEtlJobVersionInfoWithOptions(request, runtime);
    }

    /**
     * @summary The latency of incremental data migration or synchronization.
     * >  If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.
     *
     * @param request DescribeDtsJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsJobDetailResponse
     */
    public DescribeDtsJobDetailResponse describeDtsJobDetailWithOptions(DescribeDtsJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceID)) {
            query.put("DtsInstanceID", request.dtsInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncSubJobHistory)) {
            query.put("SyncSubJobHistory", request.syncSubJobHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobDetailResponse());
    }

    /**
     * @summary The latency of incremental data migration or synchronization.
     * >  If you query data migration tasks, the unit of this parameter is milliseconds. If you query data synchronization tasks, the unit of this parameter is seconds.
     *
     * @param request DescribeDtsJobDetailRequest
     * @return DescribeDtsJobDetailResponse
     */
    public DescribeDtsJobDetailResponse describeDtsJobDetail(DescribeDtsJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsJobDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of Data Transmission Service (DTS) tasks and the details of each task.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Dts\\&api=DescribeDtsJobs\\&type=RPC\\&version=2020-01-01)
     *
     * @param request DescribeDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsJobsResponse
     */
    public DescribeDtsJobsResponse describeDtsJobsWithOptions(DescribeDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsBisLabel)) {
            query.put("DtsBisLabel", request.dtsBisLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("OrderDirection", request.orderDirection);
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

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutDbList)) {
            query.put("WithoutDbList", request.withoutDbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsJobsResponse());
    }

    /**
     * @summary Queries the list of Data Transmission Service (DTS) tasks and the details of each task.
     *
     * @description ## Debugging
     * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Dts\\&api=DescribeDtsJobs\\&type=RPC\\&version=2020-01-01)
     *
     * @param request DescribeDtsJobsRequest
     * @return DescribeDtsJobsResponse
     */
    public DescribeDtsJobsResponse describeDtsJobs(DescribeDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the logs of a data migration or synchronization task.
     *
     * @param request DescribeDtsServiceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDtsServiceLogResponse
     */
    public DescribeDtsServiceLogResponse describeDtsServiceLogWithOptions(DescribeDtsServiceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subJobType)) {
            query.put("SubJobType", request.subJobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDtsServiceLog"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDtsServiceLogResponse());
    }

    /**
     * @summary Queries the logs of a data migration or synchronization task.
     *
     * @param request DescribeDtsServiceLogRequest
     * @return DescribeDtsServiceLogResponse
     */
    public DescribeDtsServiceLogResponse describeDtsServiceLog(DescribeDtsServiceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDtsServiceLogWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, you must call the [SwitchSynchronizationEndpoint](https://help.aliyun.com/document_detail/201858.html) operation to change the database connection settings.
     *
     * @param request DescribeEndpointSwitchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEndpointSwitchStatusResponse
     */
    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusWithOptions(DescribeEndpointSwitchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointSwitchStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointSwitchStatusResponse());
    }

    /**
     * @description Before you call this operation, you must call the [SwitchSynchronizationEndpoint](https://help.aliyun.com/document_detail/201858.html) operation to change the database connection settings.
     *
     * @param request DescribeEndpointSwitchStatusRequest
     * @return DescribeEndpointSwitchStatusResponse
     */
    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndpointSwitchStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEtlJobLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEtlJobLogsResponse
     */
    public DescribeEtlJobLogsResponse describeEtlJobLogsWithOptions(DescribeEtlJobLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEtlJobLogs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEtlJobLogsResponse());
    }

    /**
     * @param request DescribeEtlJobLogsRequest
     * @return DescribeEtlJobLogsResponse
     */
    public DescribeEtlJobLogsResponse describeEtlJobLogs(DescribeEtlJobLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEtlJobLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInitializationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInitializationStatusResponse
     */
    public DescribeInitializationStatusResponse describeInitializationStatusWithOptions(DescribeInitializationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInitializationStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInitializationStatusResponse());
    }

    /**
     * @param request DescribeInitializationStatusRequest
     * @return DescribeInitializationStatusResponse
     */
    public DescribeInitializationStatusResponse describeInitializationStatus(DescribeInitializationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInitializationStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeJobMonitorRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobMonitorRuleResponse
     */
    public DescribeJobMonitorRuleResponse describeJobMonitorRuleWithOptions(DescribeJobMonitorRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobMonitorRule"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobMonitorRuleResponse());
    }

    /**
     * @param request DescribeJobMonitorRuleRequest
     * @return DescribeJobMonitorRuleResponse
     */
    public DescribeJobMonitorRuleResponse describeJobMonitorRule(DescribeJobMonitorRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobMonitorRuleWithOptions(request, runtime);
    }

    /**
     * @summary Queries the metrics of a cluster.
     *
     * @param request DescribeMetricListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            body.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            body.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            body.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            body.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            body.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricListResponse());
    }

    /**
     * @summary Queries the metrics of a cluster.
     *
     * @param request DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMigrationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobAlertResponse
     */
    public DescribeMigrationJobAlertResponse describeMigrationJobAlertWithOptions(DescribeMigrationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobAlertResponse());
    }

    /**
     * @param request DescribeMigrationJobAlertRequest
     * @return DescribeMigrationJobAlertResponse
     */
    public DescribeMigrationJobAlertResponse describeMigrationJobAlert(DescribeMigrationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobAlertWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a data migration task.
     *
     * @description When you call this operation, the data migration task must be in the Migrating, Failed, Paused, or Finished state.
     *
     * @param request DescribeMigrationJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobDetailResponse
     */
    public DescribeMigrationJobDetailResponse describeMigrationJobDetailWithOptions(DescribeMigrationJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationMode)) {
            query.put("MigrationMode", request.migrationMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobDetailResponse());
    }

    /**
     * @summary Queries the details of a data migration task.
     *
     * @description When you call this operation, the data migration task must be in the Migrating, Failed, Paused, or Finished state.
     *
     * @param request DescribeMigrationJobDetailRequest
     * @return DescribeMigrationJobDetailResponse
     */
    public DescribeMigrationJobDetailResponse describeMigrationJobDetail(DescribeMigrationJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the status of a data migration task.
     *
     * @param request DescribeMigrationJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobStatusResponse
     */
    public DescribeMigrationJobStatusResponse describeMigrationJobStatusWithOptions(DescribeMigrationJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobStatusResponse());
    }

    /**
     * @summary Queries the status of a data migration task.
     *
     * @param request DescribeMigrationJobStatusRequest
     * @return DescribeMigrationJobStatusResponse
     */
    public DescribeMigrationJobStatusResponse describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of data migration instances and the details of each instance.
     *
     * @param request DescribeMigrationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMigrationJobsResponse
     */
    public DescribeMigrationJobsResponse describeMigrationJobsWithOptions(DescribeMigrationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
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
            new TeaPair("action", "DescribeMigrationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobsResponse());
    }

    /**
     * @summary Queries the list of data migration instances and the details of each instance.
     *
     * @param request DescribeMigrationJobsRequest
     * @return DescribeMigrationJobsResponse
     */
    public DescribeMigrationJobsResponse describeMigrationJobs(DescribeMigrationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMigrationJobsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePreCheckStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePreCheckStatusResponse
     */
    public DescribePreCheckStatusResponse describePreCheckStatusWithOptions(DescribePreCheckStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
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

        if (!com.aliyun.teautil.Common.isUnset(request.structPhase)) {
            query.put("StructPhase", request.structPhase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structType)) {
            query.put("StructType", request.structType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePreCheckStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePreCheckStatusResponse());
    }

    /**
     * @param request DescribePreCheckStatusRequest
     * @return DescribePreCheckStatusResponse
     */
    public DescribePreCheckStatusResponse describePreCheckStatus(DescribePreCheckStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSubscriptionInstanceAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertWithOptions(DescribeSubscriptionInstanceAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceAlertResponse());
    }

    /**
     * @param request DescribeSubscriptionInstanceAlertRequest
     * @return DescribeSubscriptionInstanceAlertResponse
     */
    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    /**
     * @summary Queries the status of a change tracking instance.
     *
     * @param request DescribeSubscriptionInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusWithOptions(DescribeSubscriptionInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstanceStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstanceStatusResponse());
    }

    /**
     * @summary Queries the status of a change tracking instance.
     *
     * @param request DescribeSubscriptionInstanceStatusRequest
     * @return DescribeSubscriptionInstanceStatusResponse
     */
    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstanceStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of change tracking instances and the details of each instance.
     *
     * @param request DescribeSubscriptionInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionInstancesResponse
     */
    public DescribeSubscriptionInstancesResponse describeSubscriptionInstancesWithOptions(DescribeSubscriptionInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceName)) {
            query.put("SubscriptionInstanceName", request.subscriptionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionInstances"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionInstancesResponse());
    }

    /**
     * @summary Queries the list of change tracking instances and the details of each instance.
     *
     * @param request DescribeSubscriptionInstancesRequest
     * @return DescribeSubscriptionInstancesResponse
     */
    public DescribeSubscriptionInstancesResponse describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionInstancesWithOptions(request, runtime);
    }

    /**
     * @description *   When Data Transmission Service (DTS) tracks data changes from a PolarDB-X 1.0 instance, data is distributed across the attached ApsaraDB RDS for MySQL instances. DTS runs a subtask for each ApsaraDB RDS for MySQL instance. You can call this operation to query the details of the subtasks in a distributed change tracking task.
     * *   You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the ID of the change tracking instance and the ID of the consumer group.
     *
     * @param tmpReq DescribeSubscriptionMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscriptionMetaResponse
     */
    public DescribeSubscriptionMetaResponse describeSubscriptionMetaWithOptions(DescribeSubscriptionMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subMigrationJobIdsShrink)) {
            query.put("SubMigrationJobIds", request.subMigrationJobIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicsShrink)) {
            query.put("Topics", request.topicsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscriptionMeta"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscriptionMetaResponse());
    }

    /**
     * @description *   When Data Transmission Service (DTS) tracks data changes from a PolarDB-X 1.0 instance, data is distributed across the attached ApsaraDB RDS for MySQL instances. DTS runs a subtask for each ApsaraDB RDS for MySQL instance. You can call this operation to query the details of the subtasks in a distributed change tracking task.
     * *   You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the ID of the change tracking instance and the ID of the consumer group.
     *
     * @param request DescribeSubscriptionMetaRequest
     * @return DescribeSubscriptionMetaResponse
     */
    public DescribeSubscriptionMetaResponse describeSubscriptionMeta(DescribeSubscriptionMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscriptionMetaWithOptions(request, runtime);
    }

    /**
     * @summary 查看同步和迁移任务的增量写入延迟信息
     *
     * @param request DescribeSyncStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyncStatusResponse
     */
    public DescribeSyncStatusResponse describeSyncStatusWithOptions(DescribeSyncStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyncStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyncStatusResponse());
    }

    /**
     * @summary 查看同步和迁移任务的增量写入延迟信息
     *
     * @param request DescribeSyncStatusRequest
     * @return DescribeSyncStatusResponse
     */
    public DescribeSyncStatusResponse describeSyncStatus(DescribeSyncStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSyncStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSynchronizationJobAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobAlertResponse
     */
    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertWithOptions(DescribeSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobAlert"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobAlertResponse());
    }

    /**
     * @param request DescribeSynchronizationJobAlertRequest
     * @return DescribeSynchronizationJobAlertResponse
     */
    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobAlertWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSynchronizationJobReplicatorCompareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompareWithOptions(DescribeSynchronizationJobReplicatorCompareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobReplicatorCompare"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobReplicatorCompareResponse());
    }

    /**
     * @param request DescribeSynchronizationJobReplicatorCompareRequest
     * @return DescribeSynchronizationJobReplicatorCompareResponse
     */
    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    /**
     * @summary Queries the status of a data synchronization instance.
     *
     * @param request DescribeSynchronizationJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobStatusResponse
     */
    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusWithOptions(DescribeSynchronizationJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusResponse());
    }

    /**
     * @summary Queries the status of a data synchronization instance.
     *
     * @param request DescribeSynchronizationJobStatusRequest
     * @return DescribeSynchronizationJobStatusResponse
     */
    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSynchronizationJobStatusListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobStatusListResponse
     */
    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusListWithOptions(DescribeSynchronizationJobStatusListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobIdListJsonStr)) {
            query.put("SynchronizationJobIdListJsonStr", request.synchronizationJobIdListJsonStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatusList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusListResponse());
    }

    /**
     * @param request DescribeSynchronizationJobStatusListRequest
     * @return DescribeSynchronizationJobStatusListResponse
     */
    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobStatusListWithOptions(request, runtime);
    }

    /**
     * @summary The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.
     *
     * @param request DescribeSynchronizationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationJobsResponse
     */
    public DescribeSynchronizationJobsResponse describeSynchronizationJobsWithOptions(DescribeSynchronizationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobsResponse());
    }

    /**
     * @summary The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.
     *
     * @param request DescribeSynchronizationJobsRequest
     * @return DescribeSynchronizationJobsResponse
     */
    public DescribeSynchronizationJobsResponse describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobsWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, you must call the [ModifySynchronizationObject](https://help.aliyun.com/document_detail/49451.html) operation to obtain the task ID.
     *
     * @param request DescribeSynchronizationObjectModifyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusWithOptions(DescribeSynchronizationObjectModifyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationObjectModifyStatus"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationObjectModifyStatusResponse());
    }

    /**
     * @description Before you call this operation, you must call the [ModifySynchronizationObject](https://help.aliyun.com/document_detail/49451.html) operation to obtain the task ID.
     *
     * @param request DescribeSynchronizationObjectModifyStatusRequest
     * @return DescribeSynchronizationObjectModifyStatusResponse
     */
    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationObjectModifyStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeysWithOptions(DescribeTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
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
            new TeaPair("action", "DescribeTagKeys"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagKeysResponse());
    }

    /**
     * @param request DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
    public DescribeTagKeysResponse describeTagKeys(DescribeTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagKeysWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValuesWithOptions(DescribeTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
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
            new TeaPair("action", "DescribeTagValues"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagValuesResponse());
    }

    /**
     * @param request DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValues(DescribeTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagValuesWithOptions(request, runtime);
    }

    /**
     * @summary Initializes a built-in account on a node of an active geo-redundancy database cluster. Data Transmission Service (DTS) uses the built-in account to connect to the node and perform data synchronization tasks.
     *
     * @description *   The node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database that is connected over Cloud Enterprise Network (CEN).
     * *   This operation is used to initialize the built-in account named rdsdt_dtsacct on a node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform data synchronization tasks.
     *
     * @param request InitDtsRdsInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitDtsRdsInstanceResponse
     */
    public InitDtsRdsInstanceResponse initDtsRdsInstanceWithOptions(InitDtsRdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointCenId)) {
            query.put("EndpointCenId", request.endpointCenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceId)) {
            query.put("EndpointInstanceId", request.endpointInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceType)) {
            query.put("EndpointInstanceType", request.endpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRegion)) {
            query.put("EndpointRegion", request.endpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitDtsRdsInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitDtsRdsInstanceResponse());
    }

    /**
     * @summary Initializes a built-in account on a node of an active geo-redundancy database cluster. Data Transmission Service (DTS) uses the built-in account to connect to the node and perform data synchronization tasks.
     *
     * @description *   The node must be an ApsaraDB RDS for MySQL instance or a self-managed MySQL database that is connected over Cloud Enterprise Network (CEN).
     * *   This operation is used to initialize the built-in account named rdsdt_dtsacct on a node of an active geo-redundancy database cluster. DTS uses this account to connect to the node and perform data synchronization tasks.
     *
     * @param request InitDtsRdsInstanceRequest
     * @return InitDtsRdsInstanceResponse
     */
    public InitDtsRdsInstanceResponse initDtsRdsInstance(InitDtsRdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initDtsRdsInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries all clusters that are created within an Alibaba Cloud account. You can also query clusters based on the specified conditions.
     *
     * @param request ListDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDedicatedClusterResponse
     */
    public ListDedicatedClusterResponse listDedicatedClusterWithOptions(ListDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            query.put("OrderDirection", request.orderDirection);
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

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDedicatedClusterResponse());
    }

    /**
     * @summary Queries all clusters that are created within an Alibaba Cloud account. You can also query clusters based on the specified conditions.
     *
     * @param request ListDedicatedClusterRequest
     * @return ListDedicatedClusterResponse
     */
    public ListDedicatedClusterResponse listDedicatedCluster(ListDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * @description ****
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("version", "2020-01-01"),
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
     * @description ****
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request ModifyConsumerChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumerChannelResponse
     */
    public ModifyConsumerChannelResponse modifyConsumerChannelWithOptions(ModifyConsumerChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupId)) {
            query.put("ConsumerGroupId", request.consumerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerChannel"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerChannelResponse());
    }

    /**
     * @param request ModifyConsumerChannelRequest
     * @return ModifyConsumerChannelResponse
     */
    public ModifyConsumerChannelResponse modifyConsumerChannel(ModifyConsumerChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumerChannelWithOptions(request, runtime);
    }

    /**
     * @description > 
     * *   This operation is applicable to only the new version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the ConfigureSubscriptionInstance operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
     * *   When you call this operation, the change tracking task must be in the NotStarted, Failed, Normal, or Abnormal state.
     *
     * @param request ModifyConsumerGroupPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumerGroupPasswordResponse
     */
    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPasswordWithOptions(ModifyConsumerGroupPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupID)) {
            query.put("ConsumerGroupID", request.consumerGroupID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupName)) {
            query.put("ConsumerGroupName", request.consumerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupPassword)) {
            query.put("ConsumerGroupPassword", request.consumerGroupPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupUserName)) {
            query.put("ConsumerGroupUserName", request.consumerGroupUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroupNewPassword)) {
            query.put("consumerGroupNewPassword", request.consumerGroupNewPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumerGroupPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumerGroupPasswordResponse());
    }

    /**
     * @description > 
     * *   This operation is applicable to only the new version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the ConfigureSubscriptionInstance operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
     * *   When you call this operation, the change tracking task must be in the NotStarted, Failed, Normal, or Abnormal state.
     *
     * @param request ModifyConsumerGroupPasswordRequest
     * @return ModifyConsumerGroupPasswordResponse
     */
    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumerGroupPasswordWithOptions(request, runtime);
    }

    /**
     * @description > 
     * *   This operation is applicable to only the previous version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the [ConfigureSubscriptionInstance](https://help.aliyun.com/document_detail/49437.html) operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
     * *   If you use the new version, you need to set the consumption checkpoint on the change tracking client.
     * *   When you call this operation, you must stop the change tracking client, and the change tracking task must be in the Normal state.
     *
     * @param request ModifyConsumptionTimestampRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyConsumptionTimestampResponse
     */
    public ModifyConsumptionTimestampResponse modifyConsumptionTimestampWithOptions(ModifyConsumptionTimestampRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumptionTimestamp)) {
            query.put("ConsumptionTimestamp", request.consumptionTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyConsumptionTimestamp"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyConsumptionTimestampResponse());
    }

    /**
     * @description > 
     * *   This operation is applicable to only the previous version of the change tracking feature. To use the new version, you must specify the SubscriptionInstanceNetworkType parameter when you call the [ConfigureSubscriptionInstance](https://help.aliyun.com/document_detail/49437.html) operation. If you use the previous version, you do not need to specify the **SubscriptionInstanceNetworkType** parameter.
     * *   If you use the new version, you need to set the consumption checkpoint on the change tracking client.
     * *   When you call this operation, you must stop the change tracking client, and the change tracking task must be in the Normal state.
     *
     * @param request ModifyConsumptionTimestampRequest
     * @return ModifyConsumptionTimestampResponse
     */
    public ModifyConsumptionTimestampResponse modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyConsumptionTimestampWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configuration of a cluster.
     *
     * @description You can modify only the overcommit ratio.
     *
     * @param request ModifyDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDedicatedClusterResponse
     */
    public ModifyDedicatedClusterResponse modifyDedicatedClusterWithOptions(ModifyDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterName)) {
            query.put("DedicatedClusterName", request.dedicatedClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldRatio)) {
            query.put("OversoldRatio", request.oversoldRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDedicatedClusterResponse());
    }

    /**
     * @summary Modifies the configuration of a cluster.
     *
     * @description You can modify only the overcommit ratio.
     *
     * @param request ModifyDedicatedClusterRequest
     * @return ModifyDedicatedClusterResponse
     */
    public ModifyDedicatedClusterResponse modifyDedicatedCluster(ModifyDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configurations of a data synchronization task.
     *
     * @description When you configure a data synchronization task in the Data Transmission Service (DTS) console, you can move the pointer over **Next: Save Task Settings and Precheck** in the **Advanced Settings** step and click **Preview OpenAPI parameters** to view the parameters that are used to configure the task by calling an API operation.
     *
     * @param tmpReq ModifyDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobResponse
     */
    public ModifyDtsJobResponse modifyDtsJobWithOptions(ModifyDtsJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDtsJobShrinkRequest request = new ModifyDtsJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbList)) {
            request.dbListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbList, "DbList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSynchronization)) {
            query.put("DataSynchronization", request.dataSynchronization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrl)) {
            query.put("FileOssUrl", request.fileOssUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbListShrink)) {
            body.put("DbList", request.dbListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.etlOperatorColumnReference)) {
            body.put("EtlOperatorColumnReference", request.etlOperatorColumnReference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTableName)) {
            body.put("FilterTableName", request.filterTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyTypeEnum)) {
            body.put("ModifyTypeEnum", request.modifyTypeEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reserved)) {
            body.put("Reserved", request.reserved);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Modifies the configurations of a data synchronization task.
     *
     * @description When you configure a data synchronization task in the Data Transmission Service (DTS) console, you can move the pointer over **Next: Save Task Settings and Precheck** in the **Advanced Settings** step and click **Preview OpenAPI parameters** to view the parameters that are used to configure the task by calling an API operation.
     *
     * @param request ModifyDtsJobRequest
     * @return ModifyDtsJobResponse
     */
    public ModifyDtsJobResponse modifyDtsJob(ModifyDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobWithOptions(request, runtime);
    }

    public ModifyDtsJobResponse modifyDtsJobAdvance(ModifyDtsJobAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "Dts"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ModifyDtsJobRequest modifyDtsJobReq = new ModifyDtsJobRequest();
        com.aliyun.openapiutil.Client.convert(request, modifyDtsJobReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileOssUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileOssUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            modifyDtsJobReq.fileOssUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        ModifyDtsJobResponse modifyDtsJobResp = this.modifyDtsJobWithOptions(modifyDtsJobReq, runtime);
        return modifyDtsJobResp;
    }

    /**
     * @summary 修改DTS任务配置
     *
     * @param request ModifyDtsJobConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobConfigResponse
     */
    public ModifyDtsJobConfigResponse modifyDtsJobConfigWithOptions(ModifyDtsJobConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobConfigResponse());
    }

    /**
     * @summary 修改DTS任务配置
     *
     * @param request ModifyDtsJobConfigRequest
     * @return ModifyDtsJobConfigResponse
     */
    public ModifyDtsJobConfigResponse modifyDtsJobConfig(ModifyDtsJobConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobConfigWithOptions(request, runtime);
    }

    /**
     * @summary 迁移专属集群任务
     *
     * @param request ModifyDtsJobDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    public ModifyDtsJobDedicatedClusterResponse modifyDtsJobDedicatedClusterWithOptions(ModifyDtsJobDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobDedicatedClusterResponse());
    }

    /**
     * @summary 迁移专属集群任务
     *
     * @param request ModifyDtsJobDedicatedClusterRequest
     * @return ModifyDtsJobDedicatedClusterResponse
     */
    public ModifyDtsJobDedicatedClusterResponse modifyDtsJobDedicatedCluster(ModifyDtsJobDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the upper limit of DTS units (DUs) for a Data Transmission Service (DTS) task.
     *
     * @description *   DTS allows you to upgrade or downgrade the configurations of DTS instances in a dedicated cluster. You can adjust the resources that are occupied for task execution to dynamically adjust the number of tasks that can be scheduled in the cluster. This way, you can reduce the total number of DUs required for the cluster or release DUs.
     * *   Before you modify the upper limit of DUs for a DTS task, make sure that sufficient DUs are available.
     *
     * @param request ModifyDtsJobDuLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobDuLimitResponse
     */
    public ModifyDtsJobDuLimitResponse modifyDtsJobDuLimitWithOptions(ModifyDtsJobDuLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duLimit)) {
            query.put("DuLimit", request.duLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobDuLimit"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobDuLimitResponse());
    }

    /**
     * @summary Modifies the upper limit of DTS units (DUs) for a Data Transmission Service (DTS) task.
     *
     * @description *   DTS allows you to upgrade or downgrade the configurations of DTS instances in a dedicated cluster. You can adjust the resources that are occupied for task execution to dynamically adjust the number of tasks that can be scheduled in the cluster. This way, you can reduce the total number of DUs required for the cluster or release DUs.
     * *   Before you modify the upper limit of DUs for a DTS task, make sure that sufficient DUs are available.
     *
     * @param request ModifyDtsJobDuLimitRequest
     * @return ModifyDtsJobDuLimitResponse
     */
    public ModifyDtsJobDuLimitResponse modifyDtsJobDuLimit(ModifyDtsJobDuLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobDuLimitWithOptions(request, runtime);
    }

    /**
     * @summary 替换源端或目标端实例
     *
     * @param request ModifyDtsJobEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobEndpointResponse
     */
    public ModifyDtsJobEndpointResponse modifyDtsJobEndpointWithOptions(ModifyDtsJobEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceId)) {
            query.put("EndpointInstanceId", request.endpointInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointInstanceType)) {
            query.put("EndpointInstanceType", request.endpointInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointIp)) {
            query.put("EndpointIp", request.endpointIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointPort)) {
            query.put("EndpointPort", request.endpointPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointRegionId)) {
            query.put("EndpointRegionId", request.endpointRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyAccount)) {
            query.put("ModifyAccount", request.modifyAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardPassword)) {
            query.put("ShardPassword", request.shardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardUsername)) {
            query.put("ShardUsername", request.shardUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobEndpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobEndpointResponse());
    }

    /**
     * @summary 替换源端或目标端实例
     *
     * @param request ModifyDtsJobEndpointRequest
     * @return ModifyDtsJobEndpointResponse
     */
    public ModifyDtsJobEndpointResponse modifyDtsJobEndpoint(ModifyDtsJobEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobEndpointWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDtsJobNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobNameResponse
     */
    public ModifyDtsJobNameResponse modifyDtsJobNameWithOptions(ModifyDtsJobNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobName)) {
            query.put("DtsJobName", request.dtsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobName"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobNameResponse());
    }

    /**
     * @param request ModifyDtsJobNameRequest
     * @return ModifyDtsJobNameResponse
     */
    public ModifyDtsJobNameResponse modifyDtsJobName(ModifyDtsJobNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobNameWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDtsJobPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDtsJobPasswordResponse
     */
    public ModifyDtsJobPasswordResponse modifyDtsJobPasswordWithOptions(ModifyDtsJobPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDtsJobPassword"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDtsJobPasswordResponse());
    }

    /**
     * @param request ModifyDtsJobPasswordRequest
     * @return ModifyDtsJobPasswordResponse
     */
    public ModifyDtsJobPasswordResponse modifyDtsJobPassword(ModifyDtsJobPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDtsJobPasswordWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDynamicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDynamicConfigResponse
     */
    public ModifyDynamicConfigResponse modifyDynamicConfigWithOptions(ModifyDynamicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configList)) {
            query.put("ConfigList", request.configList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLimit)) {
            query.put("EnableLimit", request.enableLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDynamicConfig"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDynamicConfigResponse());
    }

    /**
     * @param request ModifyDynamicConfigRequest
     * @return ModifyDynamicConfigResponse
     */
    public ModifyDynamicConfigResponse modifyDynamicConfig(ModifyDynamicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDynamicConfigWithOptions(request, runtime);
    }

    /**
     * @param request ModifySubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySubscriptionResponse
     */
    public ModifySubscriptionResponse modifySubscriptionWithOptions(ModifySubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            query.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDDL)) {
            query.put("SubscriptionDataTypeDDL", request.subscriptionDataTypeDDL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionDataTypeDML)) {
            query.put("SubscriptionDataTypeDML", request.subscriptionDataTypeDML);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscription"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionResponse());
    }

    /**
     * @param request ModifySubscriptionRequest
     * @return ModifySubscriptionResponse
     */
    public ModifySubscriptionResponse modifySubscription(ModifySubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySubscriptionWithOptions(request, runtime);
    }

    /**
     * @description When you call this operation, the change tracking task must be in the Normal, NotStarted, or Failed state.
     * > 
     * *   If you call this operation to modify the objects of a change tracking task that is in the Normal state, DTS automatically calls the [StartSubscriptionInstance](https://help.aliyun.com/document_detail/49438.html) to restart the task.
     * *   If you call this operation to modify the objects of a change tracking task that is in the NotStarted or Failed state, DTS does not automatically start the task. You must call the [StartSubscriptionInstance](https://help.aliyun.com/document_detail/49438.html) to restart the task.
     *
     * @param request ModifySubscriptionObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySubscriptionObjectResponse
     */
    public ModifySubscriptionObjectResponse modifySubscriptionObjectWithOptions(ModifySubscriptionObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionObject)) {
            query.put("SubscriptionObject", request.subscriptionObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubscriptionObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubscriptionObjectResponse());
    }

    /**
     * @description When you call this operation, the change tracking task must be in the Normal, NotStarted, or Failed state.
     * > 
     * *   If you call this operation to modify the objects of a change tracking task that is in the Normal state, DTS automatically calls the [StartSubscriptionInstance](https://help.aliyun.com/document_detail/49438.html) to restart the task.
     * *   If you call this operation to modify the objects of a change tracking task that is in the NotStarted or Failed state, DTS does not automatically start the task. You must call the [StartSubscriptionInstance](https://help.aliyun.com/document_detail/49438.html) to restart the task.
     *
     * @param request ModifySubscriptionObjectRequest
     * @return ModifySubscriptionObjectResponse
     */
    public ModifySubscriptionObjectResponse modifySubscriptionObject(ModifySubscriptionObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySubscriptionObjectWithOptions(request, runtime);
    }

    /**
     * @description >  When you call this operation, the data synchronization task must be in the Not Started or Synchronizing state.
     *
     * @param request ModifySynchronizationObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySynchronizationObjectResponse
     */
    public ModifySynchronizationObjectResponse modifySynchronizationObjectWithOptions(ModifySynchronizationObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            body.put("SynchronizationObjects", request.synchronizationObjects);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySynchronizationObject"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySynchronizationObjectResponse());
    }

    /**
     * @description >  When you call this operation, the data synchronization task must be in the Not Started or Synchronizing state.
     *
     * @param request ModifySynchronizationObjectRequest
     * @return ModifySynchronizationObjectResponse
     */
    public ModifySynchronizationObjectResponse modifySynchronizationObject(ModifySynchronizationObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySynchronizationObjectWithOptions(request, runtime);
    }

    /**
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyCount)) {
            query.put("BuyCount", request.buyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * @description >  If you clear the configurations of a data synchronization or change tracking task, DTS deletes the task. Then, DTS creates another task. The task is in the Not Configured state. You must call the [ConfigureDtsJob](https://help.aliyun.com/document_detail/208399.html) operation reconfigure the task.
     *
     * @param request ResetDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDtsJobResponse
     */
    public ResetDtsJobResponse resetDtsJobWithOptions(ResetDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDtsJobResponse());
    }

    /**
     * @description >  If you clear the configurations of a data synchronization or change tracking task, DTS deletes the task. Then, DTS creates another task. The task is in the Not Configured state. You must call the [ConfigureDtsJob](https://help.aliyun.com/document_detail/208399.html) operation reconfigure the task.
     *
     * @param request ResetDtsJobRequest
     * @return ResetDtsJobResponse
     */
    public ResetDtsJobResponse resetDtsJob(ResetDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDtsJobWithOptions(request, runtime);
    }

    /**
     * @description >  If you clear the configurations of a data synchronization task, the task will be released. To start the task again, you must call the **ConfigureSynchronizationJob** operation to reconfigure the task.
     *
     * @param request ResetSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSynchronizationJobResponse
     */
    public ResetSynchronizationJobResponse resetSynchronizationJobWithOptions(ResetSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSynchronizationJobResponse());
    }

    /**
     * @description >  If you clear the configurations of a data synchronization task, the task will be released. To start the task again, you must call the **ConfigureSynchronizationJob** operation to reconfigure the task.
     *
     * @param request ResetSynchronizationJobRequest
     * @return ResetSynchronizationJobResponse
     */
    public ResetSynchronizationJobResponse resetSynchronizationJob(ResetSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @summary 调转双向任务的方向
     *
     * @param request ReverseTwoWayDirectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReverseTwoWayDirectionResponse
     */
    public ReverseTwoWayDirectionResponse reverseTwoWayDirectionWithOptions(ReverseTwoWayDirectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreErrorSubJob)) {
            query.put("IgnoreErrorSubJob", request.ignoreErrorSubJob);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReverseTwoWayDirection"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReverseTwoWayDirectionResponse());
    }

    /**
     * @summary 调转双向任务的方向
     *
     * @param request ReverseTwoWayDirectionRequest
     * @return ReverseTwoWayDirectionResponse
     */
    public ReverseTwoWayDirectionResponse reverseTwoWayDirection(ReverseTwoWayDirectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reverseTwoWayDirectionWithOptions(request, runtime);
    }

    /**
     * @summary Ignores the precheck items that a data migration or synchronization task may fail to pass.
     *
     * @description If you call this operation to ignore all precheck items, you must call the [StartMigrationJob](https://www.alibabacloud.com/help/zh/doc-detail/49429.htm) or [StartSynchronizationJob](https://www.alibabacloud.com/help/zh/doc-detail/49448.htm) operation. DTS performs a precheck again. After the data migration or synchronization task passes the precheck, the task will be automatically started.
     *
     * @param request ShieldPrecheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ShieldPrecheckResponse
     */
    public ShieldPrecheckResponse shieldPrecheckWithOptions(ShieldPrecheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.precheckItems)) {
            query.put("PrecheckItems", request.precheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShieldPrecheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShieldPrecheckResponse());
    }

    /**
     * @summary Ignores the precheck items that a data migration or synchronization task may fail to pass.
     *
     * @description If you call this operation to ignore all precheck items, you must call the [StartMigrationJob](https://www.alibabacloud.com/help/zh/doc-detail/49429.htm) or [StartSynchronizationJob](https://www.alibabacloud.com/help/zh/doc-detail/49448.htm) operation. DTS performs a precheck again. After the data migration or synchronization task passes the precheck, the task will be automatically started.
     *
     * @param request ShieldPrecheckRequest
     * @return ShieldPrecheckResponse
     */
    public ShieldPrecheckResponse shieldPrecheck(ShieldPrecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.shieldPrecheckWithOptions(request, runtime);
    }

    /**
     * @summary Skips one or more precheck items.
     *
     * @param request SkipPreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipPreCheckResponse
     */
    public SkipPreCheckResponse skipPreCheckWithOptions(SkipPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPreCheckItems)) {
            query.put("SkipPreCheckItems", request.skipPreCheckItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipPreCheckNames)) {
            query.put("SkipPreCheckNames", request.skipPreCheckNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipPreCheck"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipPreCheckResponse());
    }

    /**
     * @summary Skips one or more precheck items.
     *
     * @param request SkipPreCheckRequest
     * @return SkipPreCheckResponse
     */
    public SkipPreCheckResponse skipPreCheck(SkipPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipPreCheckWithOptions(request, runtime);
    }

    /**
     * @param request StartDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDtsJobResponse
     */
    public StartDtsJobResponse startDtsJobWithOptions(StartDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDtsJobResponse());
    }

    /**
     * @param request StartDtsJobRequest
     * @return StartDtsJobResponse
     */
    public StartDtsJobResponse startDtsJob(StartDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDtsJobWithOptions(request, runtime);
    }

    /**
     * @param request StartDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDtsJobsResponse
     */
    public StartDtsJobsResponse startDtsJobsWithOptions(StartDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDtsJobsResponse());
    }

    /**
     * @param request StartDtsJobsRequest
     * @return StartDtsJobsResponse
     */
    public StartDtsJobsResponse startDtsJobs(StartDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDtsJobsWithOptions(request, runtime);
    }

    /**
     * @description >  When you call this operation, the data migration task must be in the Not Started, Paused, or Migration Failed state.
     *
     * @param request StartMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMigrationJobResponse
     */
    public StartMigrationJobResponse startMigrationJobWithOptions(StartMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationJobResponse());
    }

    /**
     * @description >  When you call this operation, the data migration task must be in the Not Started, Paused, or Migration Failed state.
     *
     * @param request StartMigrationJobRequest
     * @return StartMigrationJobResponse
     */
    public StartMigrationJobResponse startMigrationJob(StartMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMigrationJobWithOptions(request, runtime);
    }

    /**
     * @summary Starts the reverse task that is created by calling the CreateReverseDtsJob operation.
     *
     * @description Before you call this operation, make sure that your instance is not released and is paused. You can check the status of the instance in the Data Transmission Service (DTS) console or by calling the [DescribeDtsJobDetail](https://help.aliyun.com/document_detail/208925.html) operation.
     *
     * @param request StartReverseWriterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartReverseWriterResponse
     */
    public StartReverseWriterResponse startReverseWriterWithOptions(StartReverseWriterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkPoint)) {
            query.put("CheckPoint", request.checkPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartReverseWriter"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartReverseWriterResponse());
    }

    /**
     * @summary Starts the reverse task that is created by calling the CreateReverseDtsJob operation.
     *
     * @description Before you call this operation, make sure that your instance is not released and is paused. You can check the status of the instance in the Data Transmission Service (DTS) console or by calling the [DescribeDtsJobDetail](https://help.aliyun.com/document_detail/208925.html) operation.
     *
     * @param request StartReverseWriterRequest
     * @return StartReverseWriterResponse
     */
    public StartReverseWriterResponse startReverseWriter(StartReverseWriterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startReverseWriterWithOptions(request, runtime);
    }

    /**
     * @description When you call this operation, the change tracking task must be in the NotStarted or Failed state.
     *
     * @param request StartSubscriptionInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSubscriptionInstanceResponse
     */
    public StartSubscriptionInstanceResponse startSubscriptionInstanceWithOptions(StartSubscriptionInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionInstanceId)) {
            query.put("SubscriptionInstanceId", request.subscriptionInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSubscriptionInstance"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSubscriptionInstanceResponse());
    }

    /**
     * @description When you call this operation, the change tracking task must be in the NotStarted or Failed state.
     *
     * @param request StartSubscriptionInstanceRequest
     * @return StartSubscriptionInstanceResponse
     */
    public StartSubscriptionInstanceResponse startSubscriptionInstance(StartSubscriptionInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSubscriptionInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Starts a data synchronization task.
     *
     * @param request StartSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSynchronizationJobResponse
     */
    public StartSynchronizationJobResponse startSynchronizationJobWithOptions(StartSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSynchronizationJobResponse());
    }

    /**
     * @summary Starts a data synchronization task.
     *
     * @param request StartSynchronizationJobRequest
     * @return StartSynchronizationJobResponse
     */
    public StartSynchronizationJobResponse startSynchronizationJob(StartSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @summary Releases a cluster.
     *
     * @param request StopDedicatedClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDedicatedClusterResponse
     */
    public StopDedicatedClusterResponse stopDedicatedClusterWithOptions(StopDedicatedClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterName)) {
            query.put("DedicatedClusterName", request.dedicatedClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDedicatedCluster"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDedicatedClusterResponse());
    }

    /**
     * @summary Releases a cluster.
     *
     * @param request StopDedicatedClusterRequest
     * @return StopDedicatedClusterResponse
     */
    public StopDedicatedClusterResponse stopDedicatedCluster(StopDedicatedClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDedicatedClusterWithOptions(request, runtime);
    }

    /**
     * @param request StopDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDtsJobResponse
     */
    public StopDtsJobResponse stopDtsJobWithOptions(StopDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDtsJobResponse());
    }

    /**
     * @param request StopDtsJobRequest
     * @return StopDtsJobResponse
     */
    public StopDtsJobResponse stopDtsJob(StopDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDtsJobWithOptions(request, runtime);
    }

    /**
     * @param request StopDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDtsJobsResponse
     */
    public StopDtsJobsResponse stopDtsJobsWithOptions(StopDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDtsJobsResponse());
    }

    /**
     * @param request StopDtsJobsRequest
     * @return StopDtsJobsResponse
     */
    public StopDtsJobsResponse stopDtsJobs(StopDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDtsJobsWithOptions(request, runtime);
    }

    /**
     * @description >  After you call this operation to stop a data migration task, the status of the task changes to Finished and you cannot restart the task by calling the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation.
     *
     * @param request StopMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMigrationJobResponse
     */
    public StopMigrationJobResponse stopMigrationJobWithOptions(StopMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMigrationJobResponse());
    }

    /**
     * @description >  After you call this operation to stop a data migration task, the status of the task changes to Finished and you cannot restart the task by calling the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation.
     *
     * @param request StopMigrationJobRequest
     * @return StopMigrationJobResponse
     */
    public StopMigrationJobResponse stopMigrationJob(StopMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMigrationJobWithOptions(request, runtime);
    }

    /**
     * @param request SummaryJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SummaryJobDetailResponse
     */
    public SummaryJobDetailResponse summaryJobDetailWithOptions(SummaryJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobCode)) {
            query.put("JobCode", request.jobCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structType)) {
            query.put("StructType", request.structType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SummaryJobDetail"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SummaryJobDetailResponse());
    }

    /**
     * @param request SummaryJobDetailRequest
     * @return SummaryJobDetailResponse
     */
    public SummaryJobDetailResponse summaryJobDetail(SummaryJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.summaryJobDetailWithOptions(request, runtime);
    }

    /**
     * @description ****
     *
     * @param request SuspendDtsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendDtsJobResponse
     */
    public SuspendDtsJobResponse suspendDtsJobWithOptions(SuspendDtsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendDtsJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendDtsJobResponse());
    }

    /**
     * @description ****
     *
     * @param request SuspendDtsJobRequest
     * @return SuspendDtsJobResponse
     */
    public SuspendDtsJobResponse suspendDtsJob(SuspendDtsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendDtsJobWithOptions(request, runtime);
    }

    /**
     * @param request SuspendDtsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendDtsJobsResponse
     */
    public SuspendDtsJobsResponse suspendDtsJobsWithOptions(SuspendDtsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobIds)) {
            query.put("DtsJobIds", request.dtsJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendDtsJobs"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendDtsJobsResponse());
    }

    /**
     * @param request SuspendDtsJobsRequest
     * @return SuspendDtsJobsResponse
     */
    public SuspendDtsJobsResponse suspendDtsJobs(SuspendDtsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendDtsJobsWithOptions(request, runtime);
    }

    /**
     * @description > 
     * *   If a data migration task is performing incremental data migration, we recommend that you do not pause the task for more than 6 hours. Otherwise, you will not be able to call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to restart the task.
     * *   If you select incremental data migration as the migration type for a pay-as-you-go instance, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, incremental data migration consumes resources such as the bandwidth of the source database.
     *
     * @param request SuspendMigrationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendMigrationJobResponse
     */
    public SuspendMigrationJobResponse suspendMigrationJobWithOptions(SuspendMigrationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendMigrationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendMigrationJobResponse());
    }

    /**
     * @description > 
     * *   If a data migration task is performing incremental data migration, we recommend that you do not pause the task for more than 6 hours. Otherwise, you will not be able to call the [StartMigrationJob](https://help.aliyun.com/document_detail/49429.html) operation to restart the task.
     * *   If you select incremental data migration as the migration type for a pay-as-you-go instance, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, incremental data migration consumes resources such as the bandwidth of the source database.
     *
     * @param request SuspendMigrationJobRequest
     * @return SuspendMigrationJobResponse
     */
    public SuspendMigrationJobResponse suspendMigrationJob(SuspendMigrationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendMigrationJobWithOptions(request, runtime);
    }

    /**
     * @description > 
     * *   When you call this operation, the data synchronization task must be in the Synchronizing state.
     * *   We recommend that you do not pause a data synchronization task for more than 6 hours. Otherwise, the task cannot be started again.
     * *   If the billing method is pay-as-you-go, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, data synchronization consumes resources such as the bandwidth of the source database.
     *
     * @param request SuspendSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendSynchronizationJobResponse
     */
    public SuspendSynchronizationJobResponse suspendSynchronizationJobWithOptions(SuspendSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendSynchronizationJob"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendSynchronizationJobResponse());
    }

    /**
     * @description > 
     * *   When you call this operation, the data synchronization task must be in the Synchronizing state.
     * *   We recommend that you do not pause a data synchronization task for more than 6 hours. Otherwise, the task cannot be started again.
     * *   If the billing method is pay-as-you-go, DTS charges a fee even when the task is paused. This is because DTS only stops writing data to the destination database. DTS continues to pull the logs of the source database so that the task can resume quickly after it is restarted. Therefore, data synchronization consumes resources such as the bandwidth of the source database.
     *
     * @param request SuspendSynchronizationJobRequest
     * @return SuspendSynchronizationJobResponse
     */
    public SuspendSynchronizationJobResponse suspendSynchronizationJob(SuspendSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * @summary 物理迁移任务切换上云
     *
     * @param request SwitchPhysicalDtsJobToCloudRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    public SwitchPhysicalDtsJobToCloudResponse switchPhysicalDtsJobToCloudWithOptions(SwitchPhysicalDtsJobToCloudRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsInstanceId)) {
            query.put("DtsInstanceId", request.dtsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchPhysicalDtsJobToCloud"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchPhysicalDtsJobToCloudResponse());
    }

    /**
     * @summary 物理迁移任务切换上云
     *
     * @param request SwitchPhysicalDtsJobToCloudRequest
     * @return SwitchPhysicalDtsJobToCloudResponse
     */
    public SwitchPhysicalDtsJobToCloudResponse switchPhysicalDtsJobToCloud(SwitchPhysicalDtsJobToCloudRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchPhysicalDtsJobToCloudWithOptions(request, runtime);
    }

    /**
     * @description *   If the source or destination database is a self-managed MySQL database connected over the Internet, Elastic Compute Service (ECS) or Express Connect, you must call this operation to update the connection settings.
     * *   If the source or destination database is hosted on an ApsaraDB instance (such as ApsaraDB RDS instance and ApsaraDB for MongoDB instance), DTS automatically updates the connection settings. You do not need to call this operation.
     * > *   For two-way synchronization tasks, if you perform a primary/secondary switchover on the source or destination database, you must call this operation twice to update the connection settings.
     *         For example, if you perform a primary/secondary switchover on the destination database of the forward direction, you must call this operation twice. In the first call, set the **SynchronizationDirection** parameter to **Forward**, set the **Endpoint.Type **parameter to **Destination**, and configure the connection settings. In the second call, set the **SynchronizationDirection** parameter to **Reverse**, set the **Endpoint.Type **parameter to **Source**, and configure the connection settings.
     *
     * @param request SwitchSynchronizationEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchSynchronizationEndpointResponse
     */
    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpointWithOptions(SwitchSynchronizationEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSynchronizationEndpoint"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSynchronizationEndpointResponse());
    }

    /**
     * @description *   If the source or destination database is a self-managed MySQL database connected over the Internet, Elastic Compute Service (ECS) or Express Connect, you must call this operation to update the connection settings.
     * *   If the source or destination database is hosted on an ApsaraDB instance (such as ApsaraDB RDS instance and ApsaraDB for MongoDB instance), DTS automatically updates the connection settings. You do not need to call this operation.
     * > *   For two-way synchronization tasks, if you perform a primary/secondary switchover on the source or destination database, you must call this operation twice to update the connection settings.
     *         For example, if you perform a primary/secondary switchover on the destination database of the forward direction, you must call this operation twice. In the first call, set the **SynchronizationDirection** parameter to **Forward**, set the **Endpoint.Type **parameter to **Destination**, and configure the connection settings. In the second call, set the **SynchronizationDirection** parameter to **Reverse**, set the **Endpoint.Type **parameter to **Source**, and configure the connection settings.
     *
     * @param request SwitchSynchronizationEndpointRequest
     * @return SwitchSynchronizationEndpointResponse
     */
    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSynchronizationEndpointWithOptions(request, runtime);
    }

    /**
     * @description If you have a large number of instances, you can create multiple tags and bind these tags to the instances. Then, you can filter the instances by tag.
     * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
     * *   If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.
     * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
     * *   You can bind up to 20 tags to each instance.
     * *   You can bind tags to up to 50 instances in each call.
     *
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("version", "2020-01-01"),
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
     * @description If you have a large number of instances, you can create multiple tags and bind these tags to the instances. Then, you can filter the instances by tag.
     * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
     * *   If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.
     * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
     * *   You can bind up to 20 tags to each instance.
     * *   You can bind tags to up to 50 instances in each call.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request TransferInstanceClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferInstanceClassResponse
     */
    public TransferInstanceClassResponse transferInstanceClassWithOptions(TransferInstanceClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferInstanceClass"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferInstanceClassResponse());
    }

    /**
     * @param request TransferInstanceClassRequest
     * @return TransferInstanceClassResponse
     */
    public TransferInstanceClassResponse transferInstanceClass(TransferInstanceClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferInstanceClassWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of DTS.
     * *   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.
     * *   Data migration instances are all pay-as-you-go instances. You do not need to change the billing method of data migration instances.
     * *   After you change the billing method from pay-as-you-go to subscription, the DTS instance is not affected.
     *
     * @param request TransferPayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferPayTypeResponse
     */
    public TransferPayTypeResponse transferPayTypeWithOptions(TransferPayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyCount)) {
            query.put("BuyCount", request.buyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDu)) {
            query.put("MaxDu", request.maxDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDu)) {
            query.put("MinDu", request.minDu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferPayType"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferPayTypeResponse());
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of DTS.
     * *   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.
     * *   Data migration instances are all pay-as-you-go instances. You do not need to change the billing method of data migration instances.
     * *   After you change the billing method from pay-as-you-go to subscription, the DTS instance is not affected.
     *
     * @param request TransferPayTypeRequest
     * @return TransferPayTypeResponse
     */
    public TransferPayTypeResponse transferPayType(TransferPayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferPayTypeWithOptions(request, runtime);
    }

    /**
     * @description >  If a tag is unbound from an instance and is not bound to other instances, the tag is deleted.
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("version", "2020-01-01"),
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
     * @description >  If a tag is unbound from an instance and is not bound to other instances, the tag is deleted.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS)
     * When you call this operation, take note of the following information:
     * *   The source and destination databases of the data synchronization task are both **MySQL** databases.
     * *   The synchronization topology of the data synchronization task is **one-way synchronization**.
     * *   The data synchronization task is in the **Synchronizing** state.
     * *   The upgrade operation causes data synchronization latency of about 5 seconds. We recommend that you perform this operation during off-peak hours.
     *
     * @param request UpgradeTwoWayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeTwoWayResponse
     */
    public UpgradeTwoWayResponse upgradeTwoWayWithOptions(UpgradeTwoWayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeTwoWay"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeTwoWayResponse());
    }

    /**
     * @description Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/data-transmission-service/pricing) of Data Transmission Service (DTS)
     * When you call this operation, take note of the following information:
     * *   The source and destination databases of the data synchronization task are both **MySQL** databases.
     * *   The synchronization topology of the data synchronization task is **one-way synchronization**.
     * *   The data synchronization task is in the **Synchronizing** state.
     * *   The upgrade operation causes data synchronization latency of about 5 seconds. We recommend that you perform this operation during off-peak hours.
     *
     * @param request UpgradeTwoWayRequest
     * @return UpgradeTwoWayResponse
     */
    public UpgradeTwoWayResponse upgradeTwoWay(UpgradeTwoWayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeTwoWayWithOptions(request, runtime);
    }

    /**
     * @summary If the **source or destination instance** is a **self-managed database** or a **third-party cloud database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](https://help.aliyun.com/document_detail/176627.html).
     * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on Elastic Compute Service (ECS)**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically adds the CIDR blocks of DTS servers to the security settings of the source or destination instance.
     *
     * @description The operation that you want to perform. Set the value to **WhiteIpList**.
     *
     * @param request WhiteIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WhiteIpListResponse
     */
    public WhiteIpListResponse whiteIpListWithOptions(WhiteIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegion)) {
            query.put("DestinationRegion", request.destinationRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zeroEtlJob)) {
            query.put("ZeroEtlJob", request.zeroEtlJob);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WhiteIpList"),
            new TeaPair("version", "2020-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WhiteIpListResponse());
    }

    /**
     * @summary If the **source or destination instance** is a **self-managed database** or a **third-party cloud database**, you need to call this operation to query the CIDR blocks of DTS servers. Then, you need to add the CIDR blocks of DTS servers to the security settings of the source or destination instance, for example, the firewall of your database. For more information, see [Add the CIDR blocks of DTS servers to the security settings of on-premises databases](https://help.aliyun.com/document_detail/176627.html).
     * >  If the **source or destination database** is an **ApsaraDB database instance** (such as RDS instance and ApsaraDB for MongoDB instance) or a **self-managed database hosted on Elastic Compute Service (ECS)**, you do not need to add the CIDR blocks. When you click **Set Whitelist and Next** in the DTS console, DTS automatically adds the CIDR blocks of DTS servers to the security settings of the source or destination instance.
     *
     * @description The operation that you want to perform. Set the value to **WhiteIpList**.
     *
     * @param request WhiteIpListRequest
     * @return WhiteIpListResponse
     */
    public WhiteIpListResponse whiteIpList(WhiteIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.whiteIpListWithOptions(request, runtime);
    }
}
