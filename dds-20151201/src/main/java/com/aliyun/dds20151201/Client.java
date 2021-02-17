// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201;

import com.aliyun.tea.*;
import com.aliyun.dds20151201.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "mongodb.aliyuncs.com"),
            new TeaPair("cn-beijing", "mongodb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mongodb.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "mongodb.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "mongodb.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "mongodb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "mongodb.aliyuncs.com"),
            new TeaPair("cn-heyuan", "mongodb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "mongodb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "mongodb.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mongodb.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mongodb.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "mongodb.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "mongodb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "mongodb.eu-west-1.aliyuncs.com"),
            new TeaPair("us-west-1", "mongodb.aliyuncs.com"),
            new TeaPair("us-east-1", "mongodb.aliyuncs.com"),
            new TeaPair("eu-central-1", "mongodb.eu-central-1.aliyuncs.com"),
            new TeaPair("me-east-1", "mongodb.me-east-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "mongodb.ap-south-1.aliyuncs.com"),
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
            new TeaPair("cn-wulanchabu", "mongodb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mongodb.aliyuncs.com"),
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

    public AllocateNodePrivateNetworkAddressResponse allocateNodePrivateNetworkAddressWithOptions(AllocateNodePrivateNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateNodePrivateNetworkAddress", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateNodePrivateNetworkAddressResponse());
    }

    public AllocateNodePrivateNetworkAddressResponse allocateNodePrivateNetworkAddress(AllocateNodePrivateNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateNodePrivateNetworkAddressWithOptions(request, runtime);
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddressWithOptions(AllocatePublicNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocatePublicNetworkAddress", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllocatePublicNetworkAddressResponse());
    }

    public AllocatePublicNetworkAddressResponse allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocatePublicNetworkAddressWithOptions(request, runtime);
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorizedWithOptions(CheckCloudResourceAuthorizedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckCloudResourceAuthorized", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckCloudResourceAuthorizedResponse());
    }

    public CheckCloudResourceAuthorizedResponse checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkCloudResourceAuthorizedWithOptions(request, runtime);
    }

    public CheckRecoveryConditionResponse checkRecoveryConditionWithOptions(CheckRecoveryConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckRecoveryCondition", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckRecoveryConditionResponse());
    }

    public CheckRecoveryConditionResponse checkRecoveryCondition(CheckRecoveryConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRecoveryConditionWithOptions(request, runtime);
    }

    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackup", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupResponse());
    }

    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDBInstanceResponse());
    }

    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    public CreateNodeResponse createNodeWithOptions(CreateNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNode", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNodeResponse());
    }

    public CreateNodeResponse createNode(CreateNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNodeWithOptions(request, runtime);
    }

    public CreateRecommendationTaskResponse createRecommendationTaskWithOptions(CreateRecommendationTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRecommendationTask", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRecommendationTaskResponse());
    }

    public CreateRecommendationTaskResponse createRecommendationTask(CreateRecommendationTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecommendationTaskWithOptions(request, runtime);
    }

    public CreateServerlessDBInstanceResponse createServerlessDBInstanceWithOptions(CreateServerlessDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServerlessDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServerlessDBInstanceResponse());
    }

    public CreateServerlessDBInstanceResponse createServerlessDBInstance(CreateServerlessDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServerlessDBInstanceWithOptions(request, runtime);
    }

    public CreateShardingDBInstanceResponse createShardingDBInstanceWithOptions(CreateShardingDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateShardingDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateShardingDBInstanceResponse());
    }

    public CreateShardingDBInstanceResponse createShardingDBInstance(CreateShardingDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createShardingDBInstanceWithOptions(request, runtime);
    }

    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDBInstanceResponse());
    }

    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    public DeleteNodeResponse deleteNodeWithOptions(DeleteNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNode", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNodeResponse());
    }

    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNodeWithOptions(request, runtime);
    }

    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccounts", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountsResponse());
    }

    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCountWithOptions(DescribeActiveOperationTaskCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveOperationTaskCount", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActiveOperationTaskCountResponse());
    }

    public DescribeActiveOperationTaskCountResponse describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveOperationTaskCountWithOptions(request, runtime);
    }

    public DescribeActiveOperationTaskTypeResponse describeActiveOperationTaskTypeWithOptions(DescribeActiveOperationTaskTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveOperationTaskType", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActiveOperationTaskTypeResponse());
    }

    public DescribeActiveOperationTaskTypeResponse describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveOperationTaskTypeWithOptions(request, runtime);
    }

    public DescribeAuditFilesResponse describeAuditFilesWithOptions(DescribeAuditFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditFiles", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditFilesResponse());
    }

    public DescribeAuditFilesResponse describeAuditFiles(DescribeAuditFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditFilesWithOptions(request, runtime);
    }

    public DescribeAuditLogFilterResponse describeAuditLogFilterWithOptions(DescribeAuditLogFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditLogFilter", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditLogFilterResponse());
    }

    public DescribeAuditLogFilterResponse describeAuditLogFilter(DescribeAuditLogFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditLogFilterWithOptions(request, runtime);
    }

    public DescribeAuditPolicyResponse describeAuditPolicyWithOptions(DescribeAuditPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditPolicy", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditPolicyResponse());
    }

    public DescribeAuditPolicyResponse describeAuditPolicy(DescribeAuditPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditPolicyWithOptions(request, runtime);
    }

    public DescribeAuditRecordsResponse describeAuditRecordsWithOptions(DescribeAuditRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAuditRecords", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAuditRecordsResponse());
    }

    public DescribeAuditRecordsResponse describeAuditRecords(DescribeAuditRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAuditRecordsWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableResource", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableResourceResponse());
    }

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    public DescribeAvailableTimeRangeResponse describeAvailableTimeRangeWithOptions(DescribeAvailableTimeRangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAvailableTimeRange", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAvailableTimeRangeResponse());
    }

    public DescribeAvailableTimeRangeResponse describeAvailableTimeRange(DescribeAvailableTimeRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAvailableTimeRangeWithOptions(request, runtime);
    }

    public DescribeBackupDBsResponse describeBackupDBsWithOptions(DescribeBackupDBsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupDBs", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupDBsResponse());
    }

    public DescribeBackupDBsResponse describeBackupDBs(DescribeBackupDBsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupDBsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackups", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupsResponse());
    }

    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceAttribute", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKeyWithOptions(DescribeDBInstanceEncryptionKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceEncryptionKey", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceEncryptionKeyResponse());
    }

    public DescribeDBInstanceEncryptionKeyResponse describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceEncryptionKeyWithOptions(request, runtime);
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitorWithOptions(DescribeDBInstanceMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceMonitor", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceMonitorResponse());
    }

    public DescribeDBInstanceMonitorResponse describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancePerformance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancePerformanceResponse());
    }

    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstances", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesResponse());
    }

    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSSL", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSSLResponse());
    }

    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    public DescribeDBInstanceTDEInfoResponse describeDBInstanceTDEInfoWithOptions(DescribeDBInstanceTDEInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceTDEInfo", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceTDEInfoResponse());
    }

    public DescribeDBInstanceTDEInfoResponse describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceTDEInfoWithOptions(request, runtime);
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceListWithOptions(DescribeDedicatedClusterInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDedicatedClusterInstanceList", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDedicatedClusterInstanceListResponse());
    }

    public DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDedicatedClusterInstanceListWithOptions(request, runtime);
    }

    public DescribeErrorLogRecordsResponse describeErrorLogRecordsWithOptions(DescribeErrorLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeErrorLogRecords", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeErrorLogRecordsResponse());
    }

    public DescribeErrorLogRecordsResponse describeErrorLogRecords(DescribeErrorLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeErrorLogRecordsWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttributeWithOptions(DescribeInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAutoRenewalAttribute", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAutoRenewalAttributeResponse());
    }

    public DescribeInstanceAutoRenewalAttributeResponse describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public DescribeKernelReleaseNotesResponse describeKernelReleaseNotesWithOptions(DescribeKernelReleaseNotesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeKernelReleaseNotes", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeKernelReleaseNotesResponse());
    }

    public DescribeKernelReleaseNotesResponse describeKernelReleaseNotes(DescribeKernelReleaseNotesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeKernelReleaseNotesWithOptions(request, runtime);
    }

    public DescribeMongoDBLogConfigResponse describeMongoDBLogConfigWithOptions(DescribeMongoDBLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMongoDBLogConfig", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMongoDBLogConfigResponse());
    }

    public DescribeMongoDBLogConfigResponse describeMongoDBLogConfig(DescribeMongoDBLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMongoDBLogConfigWithOptions(request, runtime);
    }

    public DescribeParameterModificationHistoryResponse describeParameterModificationHistoryWithOptions(DescribeParameterModificationHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterModificationHistory", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterModificationHistoryResponse());
    }

    public DescribeParameterModificationHistoryResponse describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterModificationHistoryWithOptions(request, runtime);
    }

    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameters", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParametersResponse());
    }

    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParameterTemplates", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParameterTemplatesResponse());
    }

    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrice", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePriceResponse());
    }

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeReplicaSetRoleResponse describeReplicaSetRoleWithOptions(DescribeReplicaSetRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReplicaSetRole", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReplicaSetRoleResponse());
    }

    public DescribeReplicaSetRoleResponse describeReplicaSetRole(DescribeReplicaSetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReplicaSetRoleWithOptions(request, runtime);
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfoWithOptions(DescribeRoleZoneInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoleZoneInfo", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoleZoneInfoResponse());
    }

    public DescribeRoleZoneInfoResponse describeRoleZoneInfo(DescribeRoleZoneInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoleZoneInfoWithOptions(request, runtime);
    }

    public DescribeRunningLogRecordsResponse describeRunningLogRecordsWithOptions(DescribeRunningLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRunningLogRecords", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRunningLogRecordsResponse());
    }

    public DescribeRunningLogRecordsResponse describeRunningLogRecords(DescribeRunningLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRunningLogRecordsWithOptions(request, runtime);
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfigurationWithOptions(DescribeSecurityGroupConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityGroupConfiguration", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityGroupConfigurationResponse());
    }

    public DescribeSecurityGroupConfigurationResponse describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityGroupConfigurationWithOptions(request, runtime);
    }

    public DescribeSecurityIpsResponse describeSecurityIpsWithOptions(DescribeSecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityIps", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityIpsResponse());
    }

    public DescribeSecurityIpsResponse describeSecurityIps(DescribeSecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityIpsWithOptions(request, runtime);
    }

    public DescribeShardingNetworkAddressResponse describeShardingNetworkAddressWithOptions(DescribeShardingNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeShardingNetworkAddress", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeShardingNetworkAddressResponse());
    }

    public DescribeShardingNetworkAddressResponse describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeShardingNetworkAddressWithOptions(request, runtime);
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSlowLogRecords", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSlowLogRecordsResponse());
    }

    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    public DestroyInstanceResponse destroyInstanceWithOptions(DestroyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DestroyInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new DestroyInstanceResponse());
    }

    public DestroyInstanceResponse destroyInstance(DestroyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyInstanceWithOptions(request, runtime);
    }

    public EvaluateResourceResponse evaluateResourceWithOptions(EvaluateResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EvaluateResource", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new EvaluateResourceResponse());
    }

    public EvaluateResourceResponse evaluateResource(EvaluateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.evaluateResourceWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public MigrateAvailableZoneResponse migrateAvailableZoneWithOptions(MigrateAvailableZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateAvailableZone", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateAvailableZoneResponse());
    }

    public MigrateAvailableZoneResponse migrateAvailableZone(MigrateAvailableZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateAvailableZoneWithOptions(request, runtime);
    }

    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(MigrateToOtherZoneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MigrateToOtherZone", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new MigrateToOtherZoneResponse());
    }

    public MigrateToOtherZoneResponse migrateToOtherZone(MigrateToOtherZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateToOtherZoneWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountDescription", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ModifyAuditLogFilterResponse modifyAuditLogFilterWithOptions(ModifyAuditLogFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAuditLogFilter", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAuditLogFilterResponse());
    }

    public ModifyAuditLogFilterResponse modifyAuditLogFilter(ModifyAuditLogFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAuditLogFilterWithOptions(request, runtime);
    }

    public ModifyAuditPolicyResponse modifyAuditPolicyWithOptions(ModifyAuditPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAuditPolicy", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAuditPolicyResponse());
    }

    public ModifyAuditPolicyResponse modifyAuditPolicy(ModifyAuditPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAuditPolicyWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceConnectionString", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceDescription", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceMaintainTime", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitorWithOptions(ModifyDBInstanceMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceMonitor", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceMonitorResponse());
    }

    public ModifyDBInstanceMonitorResponse modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceMonitorWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetExpireTimeResponse modifyDBInstanceNetExpireTimeWithOptions(ModifyDBInstanceNetExpireTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceNetExpireTime", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceNetExpireTimeResponse());
    }

    public ModifyDBInstanceNetExpireTimeResponse modifyDBInstanceNetExpireTime(ModifyDBInstanceNetExpireTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceNetExpireTimeWithOptions(request, runtime);
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkTypeWithOptions(ModifyDBInstanceNetworkTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceNetworkType", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceNetworkTypeResponse());
    }

    public ModifyDBInstanceNetworkTypeResponse modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceNetworkTypeWithOptions(request, runtime);
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpecWithOptions(ModifyDBInstanceSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSpec", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSpecResponse());
    }

    public ModifyDBInstanceSpecResponse modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSpecWithOptions(request, runtime);
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSSL", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSSLResponse());
    }

    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDEWithOptions(ModifyDBInstanceTDERequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceTDE", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceTDEResponse());
    }

    public ModifyDBInstanceTDEResponse modifyDBInstanceTDE(ModifyDBInstanceTDERequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceTDEWithOptions(request, runtime);
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttributeWithOptions(ModifyInstanceAutoRenewalAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAutoRenewalAttribute", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAutoRenewalAttributeResponse());
    }

    public ModifyInstanceAutoRenewalAttributeResponse modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAutoRenewalAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthModeWithOptions(ModifyInstanceVpcAuthModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceVpcAuthMode", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceVpcAuthModeResponse());
    }

    public ModifyInstanceVpcAuthModeResponse modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceVpcAuthModeWithOptions(request, runtime);
    }

    public ModifyNodeSpecResponse modifyNodeSpecWithOptions(ModifyNodeSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNodeSpec", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNodeSpecResponse());
    }

    public ModifyNodeSpecResponse modifyNodeSpec(ModifyNodeSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNodeSpecWithOptions(request, runtime);
    }

    public ModifyParametersResponse modifyParametersWithOptions(ModifyParametersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParameters", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParametersResponse());
    }

    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfigurationWithOptions(ModifySecurityGroupConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityGroupConfiguration", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityGroupConfigurationResponse());
    }

    public ModifySecurityGroupConfigurationResponse modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityGroupConfigurationWithOptions(request, runtime);
    }

    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityIps", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityIpsResponse());
    }

    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    public ReleaseNodePrivateNetworkAddressResponse releaseNodePrivateNetworkAddressWithOptions(ReleaseNodePrivateNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseNodePrivateNetworkAddress", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseNodePrivateNetworkAddressResponse());
    }

    public ReleaseNodePrivateNetworkAddressResponse releaseNodePrivateNetworkAddress(ReleaseNodePrivateNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseNodePrivateNetworkAddressWithOptions(request, runtime);
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddressWithOptions(ReleasePublicNetworkAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleasePublicNetworkAddress", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleasePublicNetworkAddressResponse());
    }

    public ReleasePublicNetworkAddressResponse releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releasePublicNetworkAddressWithOptions(request, runtime);
    }

    public RenewDBInstanceResponse renewDBInstanceWithOptions(RenewDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenewDBInstanceResponse());
    }

    public RenewDBInstanceResponse renewDBInstance(RenewDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewDBInstanceWithOptions(request, runtime);
    }

    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAccountPassword", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAccountPasswordResponse());
    }

    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestartDBInstanceResponse());
    }

    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    public RestoreDBInstanceResponse restoreDBInstanceWithOptions(RestoreDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreDBInstance", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreDBInstanceResponse());
    }

    public RestoreDBInstanceResponse restoreDBInstance(RestoreDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreDBInstanceWithOptions(request, runtime);
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHAWithOptions(SwitchDBInstanceHARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDBInstanceHA", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDBInstanceHAResponse());
    }

    public SwitchDBInstanceHAResponse switchDBInstanceHA(SwitchDBInstanceHARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDBInstanceHAWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TransformToPrePaidResponse transformToPrePaidWithOptions(TransformToPrePaidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransformToPrePaid", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new TransformToPrePaidResponse());
    }

    public TransformToPrePaidResponse transformToPrePaid(TransformToPrePaidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transformToPrePaidWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersionWithOptions(UpgradeDBInstanceEngineVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstanceEngineVersion", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceEngineVersionResponse());
    }

    public UpgradeDBInstanceEngineVersionResponse upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceEngineVersionWithOptions(request, runtime);
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersionWithOptions(UpgradeDBInstanceKernelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeDBInstanceKernelVersion", "2015-12-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeDBInstanceKernelVersionResponse());
    }

    public UpgradeDBInstanceKernelVersionResponse upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeDBInstanceKernelVersionWithOptions(request, runtime);
    }
}
