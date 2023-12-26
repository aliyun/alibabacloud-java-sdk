// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201;

import com.aliyun.tea.*;
import com.aliyun.dds20151201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mongodb.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mongodb.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mongodb.aliyuncs.com"),
            new TeaPair("cn-heyuan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mongodb.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mongodb.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mongodb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mongodb.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mongodb.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mongodb.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mongodb.ap-southeast-5.aliyuncs.com"),
            new TeaPair("us-east-1", "mongodb.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "mongodb.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "mongodb.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "mongodb.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "mongodb.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "mongodb.me-east-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mongodb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-fujian", "mongodb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mongodb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mongodb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mongodb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mongodb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mongodb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * This operation applies only to sharded cluster instances. For more information, see [Apply for an endpoint for a shard or Configserver node](~~134037~~).
      * >  The requested endpoint can only be accessed over the internal network. If you want to access the endpoint over the Internet, call the [AllocatePublicNetworkAddress](~~67602~~) operation to apply for a public endpoint.
      *
      * @param request AllocateNodePrivateNetworkAddressRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AllocateNodePrivateNetworkAddressResponse
     */
    public AllocateNodePrivateNetworkAddressResponse allocateNodePrivateNetworkAddressWithOptions(AllocateNodePrivateNetworkAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateNodePrivateNetworkAddress"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateNodePrivateNetworkAddressResponse());
    }

    /**
      * This operation applies only to sharded cluster instances. For more information, see [Apply for an endpoint for a shard or Configserver node](~~134037~~).
      * >  The requested endpoint can only be accessed over the internal network. If you want to access the endpoint over the Internet, call the [AllocatePublicNetworkAddress](~~67602~~) operation to apply for a public endpoint.
      *
      * @param request AllocateNodePrivateNetworkAddressRequest
      * @return AllocateNodePrivateNetworkAddressResponse
     */
    public AllocateNodePrivateNetworkAddressResponse allocateNodePrivateNetworkAddress(AllocateNodePrivateNetworkAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateNodePrivateNetworkAddressWithOptions(request, runtime);
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddressWithOptions(AllocatePublicNetworkAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "AllocatePublicNetworkAddress"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocatePublicNetworkAddressResponse());
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocatePublicNetworkAddressWithOptions(request, runtime);
    }

    /**
      * Before you enable Transparent Data Encryption (TDE) by calling the [ModifyDBInstanceTDE](~~131267~~) operation, you can call this operation to check whether KMS keys are authorized to ApsaraDB for MongoDB instances.
      *
      * @param request CheckCloudResourceAuthorizedRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CheckCloudResourceAuthorizedResponse
     */
    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            query.put("TargetRegionId", request.targetRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckCloudResourceAuthorized"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckCloudResourceAuthorizedResponse());
    }

    /**
      * Before you enable Transparent Data Encryption (TDE) by calling the [ModifyDBInstanceTDE](~~131267~~) operation, you can call this operation to check whether KMS keys are authorized to ApsaraDB for MongoDB instances.
      *
      * @param request CheckCloudResourceAuthorizedRequest
      * @return CheckCloudResourceAuthorizedResponse
     */
    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to replica set instances or sharded cluster instances.
      * >  After you confirm that the data recovery conditions are met by calling this operation, you can call the [CreateDBInstance](~~61763~~) operation to restore data to a new instance.
      *
      * @param request CheckRecoveryConditionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CheckRecoveryConditionResponse
     */
    public CheckRecoveryConditionResponse checkRecoveryConditionWithOptions(CheckRecoveryConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseNames)) {
            query.put("DatabaseNames", request.databaseNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBInstance)) {
            query.put("SourceDBInstance", request.sourceDBInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBInstance)) {
            query.put("SourceDBInstance", request.sourceDBInstance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRecoveryCondition"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRecoveryConditionResponse());
    }

    /**
      * This operation is applicable to replica set instances or sharded cluster instances.
      * >  After you confirm that the data recovery conditions are met by calling this operation, you can call the [CreateDBInstance](~~61763~~) operation to restore data to a new instance.
      *
      * @param request CheckRecoveryConditionRequest
      * @return CheckRecoveryConditionResponse
     */
    public CheckRecoveryConditionResponse checkRecoveryCondition(CheckRecoveryConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkRecoveryConditionWithOptions(request, runtime);
    }

    /**
      * Database accounts can be created only for shards in sharded cluster instances that use cloud disks.
      *
      * @param request CreateAccountRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
      * Database accounts can be created only for shards in sharded cluster instances that use cloud disks.
      *
      * @param request CreateAccountRequest
      * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
      * ## Usage
      * When you call this operation, the instance must be in the Running state.
      *
      * @param request CreateBackupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupMethod)) {
            query.put("BackupMethod", request.backupMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "CreateBackup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupResponse());
    }

    /**
      * ## Usage
      * When you call this operation, the instance must be in the Running state.
      *
      * @param request CreateBackupRequest
      * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    /**
      * Creates or clones an ApsaraDB for MongoDB replica set instance.
      *
      * @param request CreateDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceStorage)) {
            query.put("DBInstanceStorage", request.DBInstanceStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseNames)) {
            query.put("DatabaseNames", request.databaseNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupIds)) {
            query.put("GlobalSecurityGroupIds", request.globalSecurityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiddenZoneId)) {
            query.put("HiddenZoneId", request.hiddenZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedIops)) {
            query.put("ProvisionedIops", request.provisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readonlyReplicas)) {
            query.put("ReadonlyReplicas", request.readonlyReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
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

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZoneId)) {
            query.put("SecondaryZoneId", request.secondaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDBInstanceId)) {
            query.put("SrcDBInstanceId", request.srcDBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageEngine)) {
            query.put("StorageEngine", request.storageEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
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
            new TeaPair("action", "CreateDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBInstanceResponse());
    }

    /**
      * Creates or clones an ApsaraDB for MongoDB replica set instance.
      *
      * @param request CreateDBInstanceRequest
      * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public CreateGlobalSecurityIPGroupResponse createGlobalSecurityIPGroupWithOptions(CreateGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGlobalSecurityIPGroup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGlobalSecurityIPGroupResponse());
    }

    public CreateGlobalSecurityIPGroupResponse createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation is applicable only to sharded cluster instances.
      *
      * @param request CreateNodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateNodeResponse
     */
    public CreateNodeResponse createNodeWithOptions(CreateNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeClass)) {
            query.put("NodeClass", request.nodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStorage)) {
            query.put("NodeStorage", request.nodeStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readonlyReplicas)) {
            query.put("ReadonlyReplicas", request.readonlyReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardDirect)) {
            query.put("ShardDirect", request.shardDirect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNode"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeResponse());
    }

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation is applicable only to sharded cluster instances.
      *
      * @param request CreateNodeRequest
      * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeWithOptions(request, runtime);
    }

    /**
      * The ID of the request.
      *
      * @param request CreateNodeBatchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateNodeBatchResponse
     */
    public CreateNodeBatchResponse createNodeBatchWithOptions(CreateNodeBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesInfo)) {
            query.put("NodesInfo", request.nodesInfo);
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

        if (!com.aliyun.teautil.Common.isUnset(request.shardDirect)) {
            query.put("ShardDirect", request.shardDirect);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeBatch"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeBatchResponse());
    }

    /**
      * The ID of the request.
      *
      * @param request CreateNodeBatchRequest
      * @return CreateNodeBatchResponse
     */
    public CreateNodeBatchResponse createNodeBatch(CreateNodeBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeBatchWithOptions(request, runtime);
    }

    /**
      * *   Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * *   For more information about the instance types of ApsaraDB for MongoDB, see [Instance types](~~57141~~).
      * *   To create standalone instances and replica set instances, you can call the [CreateDBInstance](~~61763~~) operation.
      *
      * @param request CreateShardingDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateShardingDBInstanceResponse
     */
    public CreateShardingDBInstanceResponse createShardingDBInstanceWithOptions(CreateShardingDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configServer)) {
            query.put("ConfigServer", request.configServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupIds)) {
            query.put("GlobalSecurityGroupIds", request.globalSecurityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiddenZoneId)) {
            query.put("HiddenZoneId", request.hiddenZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mongos)) {
            query.put("Mongos", request.mongos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedIops)) {
            query.put("ProvisionedIops", request.provisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaSet)) {
            query.put("ReplicaSet", request.replicaSet);
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

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZoneId)) {
            query.put("SecondaryZoneId", request.secondaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDBInstanceId)) {
            query.put("SrcDBInstanceId", request.srcDBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageEngine)) {
            query.put("StorageEngine", request.storageEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
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
            new TeaPair("action", "CreateShardingDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShardingDBInstanceResponse());
    }

    /**
      * *   Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * *   For more information about the instance types of ApsaraDB for MongoDB, see [Instance types](~~57141~~).
      * *   To create standalone instances and replica set instances, you can call the [CreateDBInstance](~~61763~~) operation.
      *
      * @param request CreateShardingDBInstanceRequest
      * @return CreateShardingDBInstanceResponse
     */
    public CreateShardingDBInstanceResponse createShardingDBInstance(CreateShardingDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createShardingDBInstanceWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is in the running state.
      * *   A pay-as-you-go instance is used.
      * > After you release an ApsaraDB for MongoDB instance, data in the instance can no longer be recovered. Proceed with caution.
      *
      * @param request DeleteDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DeleteDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBInstanceResponse());
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is in the running state.
      * *   A pay-as-you-go instance is used.
      * > After you release an ApsaraDB for MongoDB instance, data in the instance can no longer be recovered. Proceed with caution.
      *
      * @param request DeleteDBInstanceRequest
      * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DeleteGlobalSecurityIPGroupResponse deleteGlobalSecurityIPGroupWithOptions(DeleteGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGlobalSecurityIPGroup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGlobalSecurityIPGroupResponse());
    }

    public DeleteGlobalSecurityIPGroupResponse deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a sharded cluster instance.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The number of the shard or mongos nodes in the instance is greater than two.
      *
      * @param request DeleteNodeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNodeWithOptions(DeleteNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "DeleteNode"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeResponse());
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a sharded cluster instance.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The number of the shard or mongos nodes in the instance is greater than two.
      *
      * @param request DeleteNodeRequest
      * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodeWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation to query only the information of the root account.
      *
      * @param request DescribeAccountsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountsResponse());
    }

    /**
      * >  You can call this operation to query only the information of the root account.
      *
      * @param request DescribeAccountsRequest
      * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCountWithOptions(DescribeActiveOperationTaskCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTaskCount"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTaskCountResponse());
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTaskCountWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskTypeResponse describeActiveOperationTaskTypeWithOptions(DescribeActiveOperationTaskTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isHistory)) {
            query.put("IsHistory", request.isHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTaskType"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTaskTypeResponse());
    }

    public DescribeActiveOperationTaskTypeResponse describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTaskTypeWithOptions(request, runtime);
    }

    public DescribeActiveOperationTasksResponse describeActiveOperationTasksWithOptions(DescribeActiveOperationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowCancel)) {
            query.put("AllowCancel", request.allowCancel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowChange)) {
            query.put("AllowChange", request.allowChange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeLevel)) {
            query.put("ChangeLevel", request.changeLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insName)) {
            query.put("InsName", request.insName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveOperationTasks"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveOperationTasksResponse());
    }

    public DescribeActiveOperationTasksResponse describeActiveOperationTasks(DescribeActiveOperationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveOperationTasksWithOptions(request, runtime);
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditLogFilterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAuditLogFilterResponse
     */
    public DescribeAuditLogFilterResponse describeAuditLogFilterWithOptions(DescribeAuditLogFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditLogFilter"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditLogFilterResponse());
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditLogFilterRequest
      * @return DescribeAuditLogFilterResponse
     */
    public DescribeAuditLogFilterResponse describeAuditLogFilter(DescribeAuditLogFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditLogFilterWithOptions(request, runtime);
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAuditPolicyResponse
     */
    public DescribeAuditPolicyResponse describeAuditPolicyWithOptions(DescribeAuditPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeAuditPolicy"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditPolicyResponse());
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditPolicyRequest
      * @return DescribeAuditPolicyResponse
     */
    public DescribeAuditPolicyResponse describeAuditPolicy(DescribeAuditPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditPolicyWithOptions(request, runtime);
    }

    /**
      * *   When you call this operation, ensure that the audit log feature of the instance is enabled. Otherwise, the operation returns an empty audit log.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditRecordsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAuditRecordsResponse
     */
    public DescribeAuditRecordsResponse describeAuditRecordsWithOptions(DescribeAuditRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.form)) {
            query.put("Form", request.form);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywords)) {
            query.put("QueryKeywords", request.queryKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditRecords"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditRecordsResponse());
    }

    /**
      * *   When you call this operation, ensure that the audit log feature of the instance is enabled. Otherwise, the operation returns an empty audit log.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeAuditRecordsRequest
      * @return DescribeAuditRecordsResponse
     */
    public DescribeAuditRecordsResponse describeAuditRecords(DescribeAuditRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditRecordsWithOptions(request, runtime);
    }

    /**
      * You can call this operation to query zones in which you can create an ApsaraDB for MongoDB instance.
      *
      * @param request DescribeAvailabilityZonesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeAvailabilityZonesResponse
     */
    public DescribeAvailabilityZonesResponse describeAvailabilityZonesWithOptions(DescribeAvailabilityZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeSecondaryZoneId)) {
            query.put("ExcludeSecondaryZoneId", request.excludeSecondaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeZoneId)) {
            query.put("ExcludeZoneId", request.excludeZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mongoType)) {
            query.put("MongoType", request.mongoType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSupport)) {
            query.put("StorageSupport", request.storageSupport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailabilityZones"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailabilityZonesResponse());
    }

    /**
      * You can call this operation to query zones in which you can create an ApsaraDB for MongoDB instance.
      *
      * @param request DescribeAvailabilityZonesRequest
      * @return DescribeAvailabilityZonesResponse
     */
    public DescribeAvailabilityZonesResponse describeAvailabilityZones(DescribeAvailabilityZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailabilityZonesWithOptions(request, runtime);
    }

    public DescribeAvailableEngineVersionResponse describeAvailableEngineVersionWithOptions(DescribeAvailableEngineVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeAvailableEngineVersion"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableEngineVersionResponse());
    }

    public DescribeAvailableEngineVersionResponse describeAvailableEngineVersion(DescribeAvailableEngineVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableEngineVersionWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    /**
      * ## Precautions
      * You can call the [CreateDBInstance](~~61763~~) operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see [Restore one or more databases of an ApsaraDB for MongoDB instance](~~112274~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance was created after March 26, 2019.
      * *   The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore (Singapore) region. Other regions are not supported.
      * *   The instance is a replica set instance.
      * *   The version of the database engine is 3.4, 4.0, or 4.2.
      * *   The storage engine of the instance is WiredTiger.
      *
      * @param request DescribeBackupDBsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeBackupDBsResponse
     */
    public DescribeBackupDBsResponse describeBackupDBsWithOptions(DescribeBackupDBsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBInstance)) {
            query.put("SourceDBInstance", request.sourceDBInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBInstance)) {
            query.put("SourceDBInstance", request.sourceDBInstance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupDBs"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupDBsResponse());
    }

    /**
      * ## Precautions
      * You can call the [CreateDBInstance](~~61763~~) operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see [Restore one or more databases of an ApsaraDB for MongoDB instance](~~112274~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance was created after March 26, 2019.
      * *   The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore (Singapore) region. Other regions are not supported.
      * *   The instance is a replica set instance.
      * *   The version of the database engine is 3.4, 4.0, or 4.2.
      * *   The storage engine of the instance is WiredTiger.
      *
      * @param request DescribeBackupDBsRequest
      * @return DescribeBackupDBsResponse
     */
    public DescribeBackupDBsResponse describeBackupDBs(DescribeBackupDBsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDBsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2015-12-01"),
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

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackups"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    /**
      * For a sharded cluster instance that is created before October 19, 2023 and uses cloud disks, you must call the [TransferClusterBackup](~~2587931~~) operation to switch the instance from the shard backup mode to the cluster backup mode before you call the DescribeClusterBackups operation.
      * By default, cloud disk-based sharded cluster instances that are created after October 19, 2023 are in the cluster backup mode.
      *
      * @param request DescribeClusterBackupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeClusterBackupsResponse
     */
    public DescribeClusterBackupsResponse describeClusterBackupsWithOptions(DescribeClusterBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOnlyGetClusterBackUp)) {
            query.put("IsOnlyGetClusterBackUp", request.isOnlyGetClusterBackUp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterBackups"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterBackupsResponse());
    }

    /**
      * For a sharded cluster instance that is created before October 19, 2023 and uses cloud disks, you must call the [TransferClusterBackup](~~2587931~~) operation to switch the instance from the shard backup mode to the cluster backup mode before you call the DescribeClusterBackups operation.
      * By default, cloud disk-based sharded cluster instances that are created after October 19, 2023 are in the cluster backup mode.
      *
      * @param request DescribeClusterBackupsRequest
      * @return DescribeClusterBackupsResponse
     */
    public DescribeClusterBackupsResponse describeClusterBackups(DescribeClusterBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterBackupsWithOptions(request, runtime);
    }

    /**
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. The DescribeClusterRecoverTime operation is applicable only to instances that are switched to the cluster backup mode or instances that are created on or after October 19, 2023.
      *
      * @param request DescribeClusterRecoverTimeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeClusterRecoverTimeResponse
     */
    public DescribeClusterRecoverTimeResponse describeClusterRecoverTimeWithOptions(DescribeClusterRecoverTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterRecoverTime"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterRecoverTimeResponse());
    }

    /**
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. The DescribeClusterRecoverTime operation is applicable only to instances that are switched to the cluster backup mode or instances that are created on or after October 19, 2023.
      *
      * @param request DescribeClusterRecoverTimeRequest
      * @return DescribeClusterRecoverTimeResponse
     */
    public DescribeClusterRecoverTimeResponse describeClusterRecoverTime(DescribeClusterRecoverTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterRecoverTimeWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDelete)) {
            query.put("IsDelete", request.isDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceAttribute"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    /**
      * ## Usage
      * When you call the DescribeDBInstanceEncryptionKey operation, the instance must have transparent data encryption (TDE) enabled in BYOK mode. You can call the [ModifyDBInstanceTDE](~~131267~~) operation to enable TDE.
      *
      * @param request DescribeDBInstanceEncryptionKeyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstanceEncryptionKeyResponse
     */
    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKeyWithOptions(DescribeDBInstanceEncryptionKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
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
            new TeaPair("action", "DescribeDBInstanceEncryptionKey"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceEncryptionKeyResponse());
    }

    /**
      * ## Usage
      * When you call the DescribeDBInstanceEncryptionKey operation, the instance must have transparent data encryption (TDE) enabled in BYOK mode. You can call the [ModifyDBInstanceTDE](~~131267~~) operation to enable TDE.
      *
      * @param request DescribeDBInstanceEncryptionKeyRequest
      * @return DescribeDBInstanceEncryptionKeyResponse
     */
    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceEncryptionKeyWithOptions(request, runtime);
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitorWithOptions(DescribeDBInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceMonitor"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceMonitorResponse());
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaSetRole)) {
            query.put("ReplicaSetRole", request.replicaSetRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstancePerformance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancePerformanceResponse());
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance is a replica set instance.
      * *   The instance runs MongoDB 3.4 or later.
      *
      * @param request DescribeDBInstanceSSLRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceSSL"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceSSLResponse());
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance is a replica set instance.
      * *   The instance runs MongoDB 3.4 or later.
      *
      * @param request DescribeDBInstanceSSLRequest
      * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance uses local physical disks to store data.
      *
      * @param request DescribeDBInstanceSwitchLogRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstanceSwitchLogResponse
     */
    public DescribeDBInstanceSwitchLogResponse describeDBInstanceSwitchLogWithOptions(DescribeDBInstanceSwitchLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceSwitchLog"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceSwitchLogResponse());
    }

    /**
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance uses local physical disks to store data.
      *
      * @param request DescribeDBInstanceSwitchLogRequest
      * @return DescribeDBInstanceSwitchLogResponse
     */
    public DescribeDBInstanceSwitchLogResponse describeDBInstanceSwitchLog(DescribeDBInstanceSwitchLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSwitchLogWithOptions(request, runtime);
    }

    /**
      * >  For more information about this function, see [Configure TDE](~~131048~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
      * @param request DescribeDBInstanceTDEInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstanceTDEInfoResponse
     */
    public DescribeDBInstanceTDEInfoResponse describeDBInstanceTDEInfoWithOptions(DescribeDBInstanceTDEInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceTDEInfo"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceTDEInfoResponse());
    }

    /**
      * >  For more information about this function, see [Configure TDE](~~131048~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
      * @param request DescribeDBInstanceTDEInfoRequest
      * @return DescribeDBInstanceTDEInfoResponse
     */
    public DescribeDBInstanceTDEInfoResponse describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceTDEInfoWithOptions(request, runtime);
    }

    /**
      * The list of replica set and standalone instances is displayed when the **DBInstanceType** parameter uses the default value **replicate**. To query a list of sharded cluster instances, you must set the **DBInstanceType** parameter to **sharding**.
      *
      * @param request DescribeDBInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionDomain)) {
            query.put("ConnectionDomain", request.connectionDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceStatus)) {
            query.put("DBInstanceStatus", request.DBInstanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceType)) {
            query.put("DBInstanceType", request.DBInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeType)) {
            query.put("DBNodeType", request.DBNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            query.put("Expired", request.expired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
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
            new TeaPair("action", "DescribeDBInstances"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancesResponse());
    }

    /**
      * The list of replica set and standalone instances is displayed when the **DBInstanceType** parameter uses the default value **replicate**. To query a list of sharded cluster instances, you must set the **DBInstanceType** parameter to **sharding**.
      *
      * @param request DescribeDBInstancesRequest
      * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    /**
      * *   If you do not specify an instance when you call this operation, the overview information of all instances in the specified region within this account is returned.
      * *   Paged query is disabled for this operation.
      *
      * @param request DescribeDBInstancesOverviewRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeDBInstancesOverviewResponse
     */
    public DescribeDBInstancesOverviewResponse describeDBInstancesOverviewWithOptions(DescribeDBInstancesOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            query.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstancesOverview"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancesOverviewResponse());
    }

    /**
      * *   If you do not specify an instance when you call this operation, the overview information of all instances in the specified region within this account is returned.
      * *   Paged query is disabled for this operation.
      *
      * @param request DescribeDBInstancesOverviewRequest
      * @return DescribeDBInstancesOverviewResponse
     */
    public DescribeDBInstancesOverviewResponse describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesOverviewWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeErrorLogRecordsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeErrorLogRecordsResponse
     */
    public DescribeErrorLogRecordsResponse describeErrorLogRecordsWithOptions(DescribeErrorLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeErrorLogRecords"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeErrorLogRecordsResponse());
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeErrorLogRecordsRequest
      * @return DescribeErrorLogRecordsResponse
     */
    public DescribeErrorLogRecordsResponse describeErrorLogRecords(DescribeErrorLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeErrorLogRecordsWithOptions(request, runtime);
    }

    public DescribeGlobalSecurityIPGroupResponse describeGlobalSecurityIPGroupWithOptions(DescribeGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalSecurityIPGroup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalSecurityIPGroupResponse());
    }

    public DescribeGlobalSecurityIPGroupResponse describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    public DescribeGlobalSecurityIPGroupRelationResponse describeGlobalSecurityIPGroupRelationWithOptions(DescribeGlobalSecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalSecurityIPGroupRelation"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalSecurityIPGroupRelationResponse());
    }

    public DescribeGlobalSecurityIPGroupRelationResponse describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalSecurityIPGroupRelationWithOptions(request, runtime);
    }

    public DescribeHistoryTasksResponse describeHistoryTasksWithOptions(DescribeHistoryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromExecTime)) {
            query.put("FromExecTime", request.fromExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromStartTime)) {
            query.put("FromStartTime", request.fromStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toExecTime)) {
            query.put("ToExecTime", request.toExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toStartTime)) {
            query.put("ToStartTime", request.toStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryTasks"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryTasksResponse());
    }

    public DescribeHistoryTasksResponse describeHistoryTasks(DescribeHistoryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHistoryTasksWithOptions(request, runtime);
    }

    public DescribeHistoryTasksStatResponse describeHistoryTasksStatWithOptions(DescribeHistoryTasksStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromExecTime)) {
            query.put("FromExecTime", request.fromExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromStartTime)) {
            query.put("FromStartTime", request.fromStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toExecTime)) {
            query.put("ToExecTime", request.toExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toStartTime)) {
            query.put("ToStartTime", request.toStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryTasksStat"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryTasksStatResponse());
    }

    public DescribeHistoryTasksStatResponse describeHistoryTasksStat(DescribeHistoryTasksStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHistoryTasksStatWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to subscription instances.
      *
      * @param request DescribeInstanceAutoRenewalAttributeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeWithOptions(DescribeInstanceAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceType)) {
            query.put("DBInstanceType", request.DBInstanceType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAutoRenewalAttribute"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAutoRenewalAttributeResponse());
    }

    /**
      * This operation is applicable to subscription instances.
      *
      * @param request DescribeInstanceAutoRenewalAttributeRequest
      * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public DescribeKernelReleaseNotesResponse describeKernelReleaseNotesWithOptions(DescribeKernelReleaseNotesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kernelVersion)) {
            query.put("KernelVersion", request.kernelVersion);
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
            new TeaPair("action", "DescribeKernelReleaseNotes"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKernelReleaseNotesResponse());
    }

    public DescribeKernelReleaseNotesResponse describeKernelReleaseNotes(DescribeKernelReleaseNotesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKernelReleaseNotesWithOptions(request, runtime);
    }

    /**
      * Queried keys are available only for disk encryption.
      *
      * @param request DescribeKmsKeysRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeKmsKeysResponse
     */
    public DescribeKmsKeysResponse describeKmsKeysWithOptions(DescribeKmsKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "DescribeKmsKeys"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKmsKeysResponse());
    }

    /**
      * Queried keys are available only for disk encryption.
      *
      * @param request DescribeKmsKeysRequest
      * @return DescribeKmsKeysResponse
     */
    public DescribeKmsKeysResponse describeKmsKeys(DescribeKmsKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKmsKeysWithOptions(request, runtime);
    }

    /**
      * This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * This operation depends on the audit log feature of ApsaraDB for MongoDB. You can enable the audit log feature based on your business needs. For more information, see [Enable the audit log feature](~~59903~~)
      * *   Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. For more information, see [Notice on official launch of the pay-as-you-go audit log feature and no more application for the free trial edition](~~377480~~)
      * *   The official edition is charged based on the storage usage and retention period. For more information, see the [Pricing](https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing) tab of the ApsaraDB for MongoDB product page.
      *
      * @param request DescribeMongoDBLogConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeMongoDBLogConfigResponse
     */
    public DescribeMongoDBLogConfigResponse describeMongoDBLogConfigWithOptions(DescribeMongoDBLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeMongoDBLogConfig"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMongoDBLogConfigResponse());
    }

    /**
      * This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * This operation depends on the audit log feature of ApsaraDB for MongoDB. You can enable the audit log feature based on your business needs. For more information, see [Enable the audit log feature](~~59903~~)
      * *   Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. For more information, see [Notice on official launch of the pay-as-you-go audit log feature and no more application for the free trial edition](~~377480~~)
      * *   The official edition is charged based on the storage usage and retention period. For more information, see the [Pricing](https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing) tab of the ApsaraDB for MongoDB product page.
      *
      * @param request DescribeMongoDBLogConfigRequest
      * @return DescribeMongoDBLogConfigResponse
     */
    public DescribeMongoDBLogConfigResponse describeMongoDBLogConfig(DescribeMongoDBLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMongoDBLogConfigWithOptions(request, runtime);
    }

    public DescribeParameterModificationHistoryResponse describeParameterModificationHistoryWithOptions(DescribeParameterModificationHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterModificationHistory"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterModificationHistoryResponse());
    }

    public DescribeParameterModificationHistoryResponse describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterModificationHistoryWithOptions(request, runtime);
    }

    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
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
            new TeaPair("action", "DescribeParameterTemplates"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterTemplatesResponse());
    }

    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParam)) {
            query.put("ExtraParam", request.extraParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "DescribeParameters"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParamOut)) {
            query.put("OrderParamOut", request.orderParamOut);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    /**
      * >  To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the [DescribeAvailableResource](~~149719~~) operation.
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2015-12-01"),
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
      * >  To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the [DescribeAvailableResource](~~149719~~) operation.
      *
      * @param request DescribeRegionsRequest
      * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to subscription instances.
      *
      * @param request DescribeRenewalPriceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRenewalPriceResponse
     */
    public DescribeRenewalPriceResponse describeRenewalPriceWithOptions(DescribeRenewalPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeRenewalPrice"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenewalPriceResponse());
    }

    /**
      * This operation is applicable to subscription instances.
      *
      * @param request DescribeRenewalPriceRequest
      * @return DescribeRenewalPriceResponse
     */
    public DescribeRenewalPriceResponse describeRenewalPrice(DescribeRenewalPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenewalPriceWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to replica set instances and standalone instances, but not to sharded cluster instances.
      *
      * @param request DescribeReplicaSetRoleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeReplicaSetRoleResponse
     */
    public DescribeReplicaSetRoleResponse describeReplicaSetRoleWithOptions(DescribeReplicaSetRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeReplicaSetRole"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReplicaSetRoleResponse());
    }

    /**
      * This operation is applicable to replica set instances and standalone instances, but not to sharded cluster instances.
      *
      * @param request DescribeReplicaSetRoleRequest
      * @return DescribeReplicaSetRoleResponse
     */
    public DescribeReplicaSetRoleResponse describeReplicaSetRole(DescribeReplicaSetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReplicaSetRoleWithOptions(request, runtime);
    }

    /**
      * > For more information, see [View the zone of a node](~~123825~~).
      * This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      *
      * @param request DescribeRoleZoneInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRoleZoneInfoResponse
     */
    public DescribeRoleZoneInfoResponse describeRoleZoneInfoWithOptions(DescribeRoleZoneInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeRoleZoneInfo"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRoleZoneInfoResponse());
    }

    /**
      * > For more information, see [View the zone of a node](~~123825~~).
      * This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      *
      * @param request DescribeRoleZoneInfoRequest
      * @return DescribeRoleZoneInfoResponse
     */
    public DescribeRoleZoneInfoResponse describeRoleZoneInfo(DescribeRoleZoneInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoleZoneInfoWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeRunningLogRecordsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeRunningLogRecordsResponse
     */
    public DescribeRunningLogRecordsResponse describeRunningLogRecordsWithOptions(DescribeRunningLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRunningLogRecords"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRunningLogRecordsResponse());
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeRunningLogRecordsRequest
      * @return DescribeRunningLogRecordsResponse
     */
    public DescribeRunningLogRecordsResponse describeRunningLogRecords(DescribeRunningLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRunningLogRecordsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationWithOptions(DescribeSecurityGroupConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeSecurityGroupConfiguration"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupConfigurationResponse());
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupConfigurationWithOptions(request, runtime);
    }

    public DescribeSecurityIpsResponse describeSecurityIpsWithOptions(DescribeSecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.showHDMIps)) {
            query.put("ShowHDMIps", request.showHDMIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityIps"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityIpsResponse());
    }

    public DescribeSecurityIpsResponse describeSecurityIps(DescribeSecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityIpsWithOptions(request, runtime);
    }

    /**
      * This operation supports sharded cluster instances only.
      *
      * @param request DescribeShardingNetworkAddressRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeShardingNetworkAddressResponse
     */
    public DescribeShardingNetworkAddressResponse describeShardingNetworkAddressWithOptions(DescribeShardingNetworkAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "DescribeShardingNetworkAddress"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeShardingNetworkAddressResponse());
    }

    /**
      * This operation supports sharded cluster instances only.
      *
      * @param request DescribeShardingNetworkAddressRequest
      * @return DescribeShardingNetworkAddressResponse
     */
    public DescribeShardingNetworkAddressResponse describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShardingNetworkAddressWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeSlowLogRecordsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogRecords"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogRecordsResponse());
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request DescribeSlowLogRecordsRequest
      * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
      * You can use the custom key obtained by calling the DescribeUserEncryptionKeyList operation to enable TDE. For more information, see [ModifyDBInstanceTDE](~~131267~~).
      *
      * @param request DescribeUserEncryptionKeyListRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            query.put("TargetRegionId", request.targetRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEncryptionKeyList"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    /**
      * You can use the custom key obtained by calling the DescribeUserEncryptionKeyList operation to enable TDE. For more information, see [ModifyDBInstanceTDE](~~131267~~).
      *
      * @param request DescribeUserEncryptionKeyListRequest
      * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The billing method of the instance is subscription.
      * *   The instance has expired and is in the **Locking** state.
      *
      * @param request DestroyInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DestroyInstanceResponse
     */
    public DestroyInstanceResponse destroyInstanceWithOptions(DestroyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyInstanceResponse());
    }

    /**
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The billing method of the instance is subscription.
      * *   The instance has expired and is in the **Locking** state.
      *
      * @param request DestroyInstanceRequest
      * @return DestroyInstanceResponse
     */
    public DestroyInstanceResponse destroyInstance(DestroyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyInstanceWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to replica set instances and sharded cluster instances. You can call this operation to check whether resources are sufficient for creating an instance, upgrading a replica set or sharded cluster instance, or upgrading a single node of the sharded cluster instance.
      * > You can call this operation a maximum of 200 times per minute.
      *
      * @param request EvaluateResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EvaluateResourceResponse
     */
    public EvaluateResourceResponse evaluateResourceWithOptions(EvaluateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readonlyReplicas)) {
            query.put("ReadonlyReplicas", request.readonlyReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardsInfo)) {
            query.put("ShardsInfo", request.shardsInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EvaluateResource"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvaluateResourceResponse());
    }

    /**
      * This operation is applicable to replica set instances and sharded cluster instances. You can call this operation to check whether resources are sufficient for creating an instance, upgrading a replica set or sharded cluster instance, or upgrading a single node of the sharded cluster instance.
      * > You can call this operation a maximum of 200 times per minute.
      *
      * @param request EvaluateResourceRequest
      * @return EvaluateResourceResponse
     */
    public EvaluateResourceResponse evaluateResource(EvaluateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluateResourceWithOptions(request, runtime);
    }

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
            new TeaPair("version", "2015-12-01"),
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

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
      * *   This operation is available only for replica set instances that run MongoDB 4.2 or earlier and sharded cluster instances.
      * *   If you have applied for a public endpoint for the ApsaraDB for MongoDB instance, you must call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint before you call the MigrateAvailableZone operation.
      * *   Transparent data encryption (TDE) is disabled for the ApsaraDB for MongoDB instance.
      * *   The source zone and the destination zone belong to the same region.
      * *   A vSwitch is created in the destination zone. This prerequisite must be met if the instance resides in a virtual private cloud (VPC). For more information about how to create a vSwitch, see [Work with vSwitches](~~65387~~).
      *
      * @param request MigrateAvailableZoneRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return MigrateAvailableZoneResponse
     */
    public MigrateAvailableZoneResponse migrateAvailableZoneWithOptions(MigrateAvailableZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vswitch)) {
            query.put("Vswitch", request.vswitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateAvailableZone"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateAvailableZoneResponse());
    }

    /**
      * *   This operation is available only for replica set instances that run MongoDB 4.2 or earlier and sharded cluster instances.
      * *   If you have applied for a public endpoint for the ApsaraDB for MongoDB instance, you must call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint before you call the MigrateAvailableZone operation.
      * *   Transparent data encryption (TDE) is disabled for the ApsaraDB for MongoDB instance.
      * *   The source zone and the destination zone belong to the same region.
      * *   A vSwitch is created in the destination zone. This prerequisite must be met if the instance resides in a virtual private cloud (VPC). For more information about how to create a vSwitch, see [Work with vSwitches](~~65387~~).
      *
      * @param request MigrateAvailableZoneRequest
      * @return MigrateAvailableZoneResponse
     */
    public MigrateAvailableZoneResponse migrateAvailableZone(MigrateAvailableZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateAvailableZoneWithOptions(request, runtime);
    }

    /**
      * This operation is applicable only to replica set instances, but not to standalone instances or sharded cluster instances.
      * >  If you have applied for a public endpoint of the instance, you must first call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint.
      *
      * @param request MigrateToOtherZoneRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return MigrateToOtherZoneResponse
     */
    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(MigrateToOtherZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateToOtherZone"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateToOtherZoneResponse());
    }

    /**
      * This operation is applicable only to replica set instances, but not to standalone instances or sharded cluster instances.
      * >  If you have applied for a public endpoint of the instance, you must first call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint.
      *
      * @param request MigrateToOtherZoneRequest
      * @return MigrateToOtherZoneResponse
     */
    public MigrateToOtherZoneResponse migrateToOtherZone(MigrateToOtherZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateToOtherZoneWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** or **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request ModifyAuditLogFilterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyAuditLogFilterResponse
     */
    public ModifyAuditLogFilterResponse modifyAuditLogFilterWithOptions(ModifyAuditLogFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAuditLogFilter"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAuditLogFilterResponse());
    }

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** or **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request ModifyAuditLogFilterRequest
      * @return ModifyAuditLogFilterResponse
     */
    public ModifyAuditLogFilterResponse modifyAuditLogFilter(ModifyAuditLogFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAuditLogFilterWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request ModifyAuditPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyAuditPolicyResponse
     */
    public ModifyAuditPolicyResponse modifyAuditPolicyWithOptions(ModifyAuditPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditLogSwitchSource)) {
            query.put("AuditLogSwitchSource", request.auditLogSwitchSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePeriod)) {
            query.put("StoragePeriod", request.storagePeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAuditPolicy"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAuditPolicyResponse());
    }

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
      * @param request ModifyAuditPolicyRequest
      * @return ModifyAuditPolicyResponse
     */
    public ModifyAuditPolicyResponse modifyAuditPolicy(ModifyAuditPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAuditPolicyWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupInterval)) {
            query.put("BackupInterval", request.backupInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackupLog)) {
            query.put("EnableBackupLog", request.enableBackupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupRetentionPeriod)) {
            query.put("LogBackupRetentionPeriod", request.logBackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotBackupType)) {
            query.put("SnapshotBackupType", request.snapshotBackupType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2015-12-01"),
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

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newConnectionString)) {
            query.put("NewConnectionString", request.newConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPort)) {
            query.put("NewPort", request.newPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "ModifyDBInstanceConnectionString"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "ModifyDBInstanceDescription"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainEndTime)) {
            query.put("MaintainEndTime", request.maintainEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainStartTime)) {
            query.put("MaintainStartTime", request.maintainStartTime);
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
            new TeaPair("action", "ModifyDBInstanceMaintainTime"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    /**
      * >  This operation is applicable only to the ApsaraDB for MongoDB console of the previous version due to the change in the frequency at which the monitoring data of an ApsaraDB for MongoDB instance is collected.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance runs MongoDB 3.4 (the latest minor version) or 4.0.
      *
      * @param request ModifyDBInstanceMonitorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceMonitorResponse
     */
    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitorWithOptions(ModifyDBInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
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
            new TeaPair("action", "ModifyDBInstanceMonitor"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceMonitorResponse());
    }

    /**
      * >  This operation is applicable only to the ApsaraDB for MongoDB console of the previous version due to the change in the frequency at which the monitoring data of an ApsaraDB for MongoDB instance is collected.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The instance runs MongoDB 3.4 (the latest minor version) or 4.0.
      *
      * @param request ModifyDBInstanceMonitorRequest
      * @return ModifyDBInstanceMonitorResponse
     */
    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMonitorWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The network of the instance is in hybrid access mode.
      * >  This operation is applicable only to replica set and sharded cluster instances, but not to standalone instances.
      *
      * @param request ModifyDBInstanceNetExpireTimeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceNetExpireTimeResponse
     */
    public ModifyDBInstanceNetExpireTimeResponse modifyDBInstanceNetExpireTimeWithOptions(ModifyDBInstanceNetExpireTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classicExpendExpiredDays)) {
            query.put("ClassicExpendExpiredDays", request.classicExpendExpiredDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ModifyDBInstanceNetExpireTime"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceNetExpireTimeResponse());
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The network of the instance is in hybrid access mode.
      * >  This operation is applicable only to replica set and sharded cluster instances, but not to standalone instances.
      *
      * @param request ModifyDBInstanceNetExpireTimeRequest
      * @return ModifyDBInstanceNetExpireTimeResponse
     */
    public ModifyDBInstanceNetExpireTimeResponse modifyDBInstanceNetExpireTime(ModifyDBInstanceNetExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceNetExpireTimeWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to replica set instances and sharded cluster instances, but not standalone instances. You can call this operation to change the network of an instance from a classic network to a VPC.
      *
      * @param request ModifyDBInstanceNetworkTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceNetworkTypeResponse
     */
    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkTypeWithOptions(ModifyDBInstanceNetworkTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classicExpiredDays)) {
            query.put("ClassicExpiredDays", request.classicExpiredDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.retainClassic)) {
            query.put("RetainClassic", request.retainClassic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
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
            new TeaPair("action", "ModifyDBInstanceNetworkType"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceNetworkTypeResponse());
    }

    /**
      * This operation is applicable to replica set instances and sharded cluster instances, but not standalone instances. You can call this operation to change the network of an instance from a classic network to a VPC.
      *
      * @param request ModifyDBInstanceNetworkTypeRequest
      * @return ModifyDBInstanceNetworkTypeResponse
     */
    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceNetworkTypeWithOptions(request, runtime);
    }

    /**
      * ## Usage
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a replica set instance.
      * *   The engine version of the instance is \\<ph props="intl">3.4 or 4.0\\</ph>\\<ph props="china">3.4, 4.0, or 4.2\\</ph>.
      * >  When you enable or disable SSL encryption or update the SSL certificate, the instance restarts. We recommend that you call this operation during off-peak hours.
      *
      * @param request ModifyDBInstanceSSLRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceSSLResponse
     */
    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.SSLAction)) {
            query.put("SSLAction", request.SSLAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceSSL"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceSSLResponse());
    }

    /**
      * ## Usage
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a replica set instance.
      * *   The engine version of the instance is \\<ph props="intl">3.4 or 4.0\\</ph>\\<ph props="china">3.4, 4.0, or 4.2\\</ph>.
      * >  When you enable or disable SSL encryption or update the SSL certificate, the instance restarts. We recommend that you call this operation during off-peak hours.
      *
      * @param request ModifyDBInstanceSSLRequest
      * @return ModifyDBInstanceSSLResponse
     */
    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation applies only to standalone and replica set instances. To modify the specifications of sharded cluster instances, you can call the [ModifyNodeSpec](~~61911~~), [CreateNode](~~61922~~), [DeleteNode](~~61816~~), or [ModifyNodeSpecBatch](~~61923~~) operation.
      *
      * @param request ModifyDBInstanceSpecRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceSpecResponse
     */
    public ModifyDBInstanceSpecResponse modifyDBInstanceSpecWithOptions(ModifyDBInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceStorage)) {
            query.put("DBInstanceStorage", request.DBInstanceStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParam)) {
            query.put("ExtraParam", request.extraParam);
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

        if (!com.aliyun.teautil.Common.isUnset(request.readonlyReplicas)) {
            query.put("ReadonlyReplicas", request.readonlyReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
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
            new TeaPair("action", "ModifyDBInstanceSpec"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceSpecResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation applies only to standalone and replica set instances. To modify the specifications of sharded cluster instances, you can call the [ModifyNodeSpec](~~61911~~), [CreateNode](~~61922~~), [DeleteNode](~~61816~~), or [ModifyNodeSpecBatch](~~61923~~) operation.
      *
      * @param request ModifyDBInstanceSpecRequest
      * @return ModifyDBInstanceSpecResponse
     */
    public ModifyDBInstanceSpecResponse modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSpecWithOptions(request, runtime);
    }

    /**
      * TDE allows you to perform real-time I/O encryption and decryption on data files. Data is encrypted before it is written to a disk and is decrypted when it is read from the disk to the memory. For more information, see [Configure TDE](~~131048~~).
      * > You cannot disable TDE after it is enabled.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
      * @param request ModifyDBInstanceTDERequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyDBInstanceTDEResponse
     */
    public ModifyDBInstanceTDEResponse modifyDBInstanceTDEWithOptions(ModifyDBInstanceTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptorName)) {
            query.put("EncryptorName", request.encryptorName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleARN)) {
            query.put("RoleARN", request.roleARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDEStatus)) {
            query.put("TDEStatus", request.TDEStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceTDE"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceTDEResponse());
    }

    /**
      * TDE allows you to perform real-time I/O encryption and decryption on data files. Data is encrypted before it is written to a disk and is decrypted when it is read from the disk to the memory. For more information, see [Configure TDE](~~131048~~).
      * > You cannot disable TDE after it is enabled.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is a replica set or sharded cluster instance.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
      * @param request ModifyDBInstanceTDERequest
      * @return ModifyDBInstanceTDEResponse
     */
    public ModifyDBInstanceTDEResponse modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceTDEWithOptions(request, runtime);
    }

    public ModifyGlobalSecurityIPGroupResponse modifyGlobalSecurityIPGroupWithOptions(ModifyGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
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
            new TeaPair("action", "ModifyGlobalSecurityIPGroup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupResponse());
    }

    public ModifyGlobalSecurityIPGroupResponse modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    public ModifyGlobalSecurityIPGroupNameResponse modifyGlobalSecurityIPGroupNameWithOptions(ModifyGlobalSecurityIPGroupNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
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
            new TeaPair("action", "ModifyGlobalSecurityIPGroupName"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupNameResponse());
    }

    public ModifyGlobalSecurityIPGroupNameResponse modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupNameWithOptions(request, runtime);
    }

    public ModifyGlobalSecurityIPGroupRelationResponse modifyGlobalSecurityIPGroupRelationWithOptions(ModifyGlobalSecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
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
            new TeaPair("action", "ModifyGlobalSecurityIPGroupRelation"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupRelationResponse());
    }

    public ModifyGlobalSecurityIPGroupRelationResponse modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupRelationWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * This operation is applicable to subscription instances.
      * >  When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.
      *
      * @param request ModifyInstanceAutoRenewalAttributeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
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
            new TeaPair("action", "ModifyInstanceAutoRenewalAttribute"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * This operation is applicable to subscription instances.
      * >  When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.
      *
      * @param request ModifyInstanceAutoRenewalAttributeRequest
      * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   The database version of the instance is 4.0 (with the minor version of mongodb\\_20190408\\_3.0.11 or later) or 4.2. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to view the database engine version of the instance. If necessary, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      * *   The instance is in a VPC. If the network type is Classic Network, you can call the [ModifyDBInstanceNetworkType](~~62138~~) operation to switch the network type to VPC.
      *
      * @param request ModifyInstanceVpcAuthModeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyInstanceVpcAuthModeResponse
     */
    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthModeWithOptions(ModifyInstanceVpcAuthModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vpcAuthMode)) {
            query.put("VpcAuthMode", request.vpcAuthMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceVpcAuthMode"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceVpcAuthModeResponse());
    }

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   The database version of the instance is 4.0 (with the minor version of mongodb\\_20190408\\_3.0.11 or later) or 4.2. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to view the database engine version of the instance. If necessary, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      * *   The instance is in a VPC. If the network type is Classic Network, you can call the [ModifyDBInstanceNetworkType](~~62138~~) operation to switch the network type to VPC.
      *
      * @param request ModifyInstanceVpcAuthModeRequest
      * @return ModifyInstanceVpcAuthModeResponse
     */
    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceVpcAuthModeWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * > This operation is applicable only to sharded cluster instances.
      *
      * @param request ModifyNodeSpecRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyNodeSpecResponse
     */
    public ModifyNodeSpecResponse modifyNodeSpecWithOptions(ModifyNodeSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            query.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeClass)) {
            query.put("NodeClass", request.nodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStorage)) {
            query.put("NodeStorage", request.nodeStorage);
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

        if (!com.aliyun.teautil.Common.isUnset(request.readonlyReplicas)) {
            query.put("ReadonlyReplicas", request.readonlyReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodeSpec"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeSpecResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * > This operation is applicable only to sharded cluster instances.
      *
      * @param request ModifyNodeSpecRequest
      * @return ModifyNodeSpecResponse
     */
    public ModifyNodeSpecResponse modifyNodeSpec(ModifyNodeSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNodeSpecWithOptions(request, runtime);
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * This operation is applicable to only sharded cluster instances.
      *
      * @param request ModifyNodeSpecBatchRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyNodeSpecBatchResponse
     */
    public ModifyNodeSpecBatchResponse modifyNodeSpecBatchWithOptions(ModifyNodeSpecBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesInfo)) {
            query.put("NodesInfo", request.nodesInfo);
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
            new TeaPair("action", "ModifyNodeSpecBatch"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodeSpecBatchResponse());
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * This operation is applicable to only sharded cluster instances.
      *
      * @param request ModifyNodeSpecBatchRequest
      * @return ModifyNodeSpecBatchResponse
     */
    public ModifyNodeSpecBatchResponse modifyNodeSpecBatch(ModifyNodeSpecBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNodeSpecBatchWithOptions(request, runtime);
    }

    /**
      * ### Precautions
      * *   The instance must be in the Running state when you call this operation.
      * *   If you call this operation to modify specific instance parameters and the modification for part of the parameters can take effect only after an instance restart, the instance is automatically restarted after this operation is called. You can call the [DescribeParameterTemplates](~~67618~~) operation to query the parameters that take effect only after the instance is restarted.
      *
      * @param request ModifyParametersRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParametersWithOptions(ModifyParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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
            new TeaPair("action", "ModifyParameters"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyParametersResponse());
    }

    /**
      * ### Precautions
      * *   The instance must be in the Running state when you call this operation.
      * *   If you call this operation to modify specific instance parameters and the modification for part of the parameters can take effect only after an instance restart, the instance is automatically restarted after this operation is called. You can call the [DescribeParameterTemplates](~~67618~~) operation to query the parameters that take effect only after the instance is restarted.
      *
      * @param request ModifyParametersRequest
      * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    /**
      * Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
      *
      * @param request ModifyResourceGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyResourceGroupResponse
     */
    public ModifyResourceGroupResponse modifyResourceGroupWithOptions(ModifyResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "ModifyResourceGroup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyResourceGroupResponse());
    }

    /**
      * Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
      *
      * @param request ModifyResourceGroupRequest
      * @return ModifyResourceGroupResponse
     */
    public ModifyResourceGroupResponse modifyResourceGroup(ModifyResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceGroupWithOptions(request, runtime);
    }

    /**
      * >  For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.
      *
      * @param request ModifySecurityGroupConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifySecurityGroupConfigurationResponse
     */
    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationWithOptions(ModifySecurityGroupConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupConfiguration"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupConfigurationResponse());
    }

    /**
      * >  For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.
      *
      * @param request ModifySecurityGroupConfigurationRequest
      * @return ModifySecurityGroupConfigurationResponse
     */
    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupConfigurationWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
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

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupAttribute)) {
            query.put("SecurityIpGroupAttribute", request.securityIpGroupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            query.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIps"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    /**
      * The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.
      *
      * @param request ModifyTaskInfoRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyTaskInfoResponse
     */
    public ModifyTaskInfoResponse modifyTaskInfoWithOptions(ModifyTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionParams)) {
            query.put("ActionParams", request.actionParams);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stepName)) {
            query.put("StepName", request.stepName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTaskInfo"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTaskInfoResponse());
    }

    /**
      * The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.
      *
      * @param request ModifyTaskInfoRequest
      * @return ModifyTaskInfoResponse
     */
    public ModifyTaskInfoResponse modifyTaskInfo(ModifyTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTaskInfoWithOptions(request, runtime);
    }

    /**
      * *   This operation can be used to release the internal endpoint of a shard or Configserver node in a sharded cluster instance. For more information, see [Release the endpoint of a shard or Configserver node](~~134067~~).
      * *   To release the public endpoint of a shard or Configserver node in a sharded cluster instance, you can call the [ReleasePublicNetworkAddress](~~67604~~) operation.
      *
      * @param request ReleaseNodePrivateNetworkAddressRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReleaseNodePrivateNetworkAddressResponse
     */
    public ReleaseNodePrivateNetworkAddressResponse releaseNodePrivateNetworkAddressWithOptions(ReleaseNodePrivateNetworkAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "ReleaseNodePrivateNetworkAddress"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseNodePrivateNetworkAddressResponse());
    }

    /**
      * *   This operation can be used to release the internal endpoint of a shard or Configserver node in a sharded cluster instance. For more information, see [Release the endpoint of a shard or Configserver node](~~134067~~).
      * *   To release the public endpoint of a shard or Configserver node in a sharded cluster instance, you can call the [ReleasePublicNetworkAddress](~~67604~~) operation.
      *
      * @param request ReleaseNodePrivateNetworkAddressRequest
      * @return ReleaseNodePrivateNetworkAddressResponse
     */
    public ReleaseNodePrivateNetworkAddressResponse releaseNodePrivateNetworkAddress(ReleaseNodePrivateNetworkAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseNodePrivateNetworkAddressWithOptions(request, runtime);
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddressWithOptions(ReleasePublicNetworkAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "ReleasePublicNetworkAddress"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePublicNetworkAddressResponse());
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePublicNetworkAddressWithOptions(request, runtime);
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB before you call this operation.
      * This parameter is only applicable to Subscription instances.
      *
      * @param request RenewDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RenewDBInstanceResponse
     */
    public RenewDBInstanceResponse renewDBInstanceWithOptions(RenewDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "RenewDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDBInstanceResponse());
    }

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB before you call this operation.
      * This parameter is only applicable to Subscription instances.
      *
      * @param request RenewDBInstanceRequest
      * @return RenewDBInstanceResponse
     */
    public RenewDBInstanceResponse renewDBInstance(RenewDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewDBInstanceWithOptions(request, runtime);
    }

    /**
      * >  This operation can reset only the password of the root account of an instance.
      *
      * @param request ResetAccountPasswordRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterType)) {
            query.put("CharacterType", request.characterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordResponse());
    }

    /**
      * >  This operation can reset only the password of the root account of an instance.
      *
      * @param request ResetAccountPasswordRequest
      * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
      * This operation can also be used to restart an instance, or restart a shard or mongos node in a sharded cluster instance.
      *
      * @param request RestartDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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
            new TeaPair("action", "RestartDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBInstanceResponse());
    }

    /**
      * This operation can also be used to restart an instance, or restart a shard or mongos node in a sharded cluster instance.
      *
      * @param request RestartDBInstanceRequest
      * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to replica set instances, but cannot be called on standalone instances or sharded cluster instances. You can use the following methods to clone an instance: [Create an instance from a backup](~~55013~~) to clone a standalone instance. Call the [CreateShardingDBInstance](~~61884~~) operation to clone a sharded cluster instance.
      * >  This operation overwrites the data of the current instance, and the data cannot be recovered. Exercise caution when performing this operation.
      *
      * @param request RestoreDBInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RestoreDBInstanceResponse
     */
    public RestoreDBInstanceResponse restoreDBInstanceWithOptions(RestoreDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "RestoreDBInstance"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreDBInstanceResponse());
    }

    /**
      * This operation is applicable to replica set instances, but cannot be called on standalone instances or sharded cluster instances. You can use the following methods to clone an instance: [Create an instance from a backup](~~55013~~) to clone a standalone instance. Call the [CreateShardingDBInstance](~~61884~~) operation to clone a sharded cluster instance.
      * >  This operation overwrites the data of the current instance, and the data cannot be recovered. Exercise caution when performing this operation.
      *
      * @param request RestoreDBInstanceRequest
      * @return RestoreDBInstanceResponse
     */
    public RestoreDBInstanceResponse restoreDBInstance(RestoreDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreDBInstanceWithOptions(request, runtime);
    }

    /**
      * The instance must be running when you call this operation.
      * > 
      * *   This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      * *   On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.
      *
      * @param request SwitchDBInstanceHARequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SwitchDBInstanceHAResponse
     */
    public SwitchDBInstanceHAResponse switchDBInstanceHAWithOptions(SwitchDBInstanceHARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            query.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchDBInstanceHA"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchDBInstanceHAResponse());
    }

    /**
      * The instance must be running when you call this operation.
      * > 
      * *   This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      * *   On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.
      *
      * @param request SwitchDBInstanceHARequest
      * @return SwitchDBInstanceHAResponse
     */
    public SwitchDBInstanceHAResponse switchDBInstanceHA(SwitchDBInstanceHARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceHAWithOptions(request, runtime);
    }

    /**
      * You can create multiple tags and bind them to multiple instances. This allows you to classify and filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can have the same value.
      * *   If the tag you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances each time you call the operation.
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("version", "2015-12-01"),
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
      * You can create multiple tags and bind them to multiple instances. This allows you to classify and filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can have the same value.
      * *   If the tag you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances each time you call the operation.
      *
      * @param request TagResourcesRequest
      * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.
      *
      * @param request TransferClusterBackupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TransferClusterBackupResponse
     */
    public TransferClusterBackupResponse transferClusterBackupWithOptions(TransferClusterBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "TransferClusterBackup"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferClusterBackupResponse());
    }

    /**
      * *   The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.
      * *   You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.
      *
      * @param request TransferClusterBackupRequest
      * @return TransferClusterBackupResponse
     */
    public TransferClusterBackupResponse transferClusterBackup(TransferClusterBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferClusterBackupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the Running state.
      * *   Your instance has no unpaid billing method change orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * > To change the billing method of an instance whose instance type is no longer available to purchase, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
      * @param request TransformInstanceChargeTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TransformInstanceChargeTypeResponse
     */
    public TransformInstanceChargeTypeResponse transformInstanceChargeTypeWithOptions(TransformInstanceChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformInstanceChargeType"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformInstanceChargeTypeResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the Running state.
      * *   Your instance has no unpaid billing method change orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * > To change the billing method of an instance whose instance type is no longer available to purchase, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
      * @param request TransformInstanceChargeTypeRequest
      * @return TransformInstanceChargeTypeResponse
     */
    public TransformInstanceChargeTypeResponse transformInstanceChargeType(TransformInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformInstanceChargeTypeWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the running state.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The instance has no unpaid subscription orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * >  To change the billing method of an instance whose instance type is no longer available to subscription, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
      * @param request TransformToPrePaidRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return TransformToPrePaidResponse
     */
    public TransformToPrePaidResponse transformToPrePaidWithOptions(TransformToPrePaidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessInfo)) {
            query.put("BusinessInfo", request.businessInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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
            new TeaPair("action", "TransformToPrePaid"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformToPrePaidResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the running state.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The instance has no unpaid subscription orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * >  To change the billing method of an instance whose instance type is no longer available to subscription, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
      * @param request TransformToPrePaidRequest
      * @return TransformToPrePaidResponse
     */
    public TransformToPrePaidResponse transformToPrePaid(TransformToPrePaidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformToPrePaidWithOptions(request, runtime);
    }

    /**
      * > 
      * *   You can remove up to 20 tags at a time.
      * *   If you remove a tag from all instances, the tag is automatically deleted.
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("version", "2015-12-01"),
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
      * > 
      * *   You can remove up to 20 tags at a time.
      * *   If you remove a tag from all instances, the tag is automatically deleted.
      *
      * @param request UntagResourcesRequest
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
      * The instance must be in the running state when you call this operation.
      * > * The available database versions depend on the storage engine used by the instance. For more information, see [Upgrades of MongoDB major versions](~~398673~~). You can also call the [DescribeAvailableEngineVersion](~~141355~~) operation to query the available database versions.
      * > * You cannot downgrade the MongoDB version of an instance after you upgrade it.
      * > * The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.
      *
      * @param request UpgradeDBInstanceEngineVersionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradeDBInstanceEngineVersionResponse
     */
    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersionWithOptions(UpgradeDBInstanceEngineVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
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
            new TeaPair("action", "UpgradeDBInstanceEngineVersion"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBInstanceEngineVersionResponse());
    }

    /**
      * The instance must be in the running state when you call this operation.
      * > * The available database versions depend on the storage engine used by the instance. For more information, see [Upgrades of MongoDB major versions](~~398673~~). You can also call the [DescribeAvailableEngineVersion](~~141355~~) operation to query the available database versions.
      * > * You cannot downgrade the MongoDB version of an instance after you upgrade it.
      * > * The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.
      *
      * @param request UpgradeDBInstanceEngineVersionRequest
      * @return UpgradeDBInstanceEngineVersionResponse
     */
    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceEngineVersionWithOptions(request, runtime);
    }

    /**
      * When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.
      * > * The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.
      * > * The instance will be restarted once during the upgrade. Call this operation during off-peak hours.
      *
      * @param request UpgradeDBInstanceKernelVersionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradeDBInstanceKernelVersionResponse
     */
    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "UpgradeDBInstanceKernelVersion"),
            new TeaPair("version", "2015-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    /**
      * When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.
      * > * The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.
      * > * The instance will be restarted once during the upgrade. Call this operation during off-peak hours.
      *
      * @param request UpgradeDBInstanceKernelVersionRequest
      * @return UpgradeDBInstanceKernelVersionResponse
     */
    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }
}
