// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101;

import com.aliyun.tea.*;
import com.aliyun.dts20200101.models.*;
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureDtsJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureDtsJobResponse());
    }

    public ConfigureDtsJobResponse configureDtsJob(ConfigureDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureDtsJobWithOptions(request, runtime);
    }

    public ConfigureMigrationJobResponse configureMigrationJobWithOptions(ConfigureMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureMigrationJobResponse());
    }

    public ConfigureMigrationJobResponse configureMigrationJob(ConfigureMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureMigrationJobWithOptions(request, runtime);
    }

    public ConfigureMigrationJobAlertResponse configureMigrationJobAlertWithOptions(ConfigureMigrationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureMigrationJobAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureMigrationJobAlertResponse());
    }

    public ConfigureMigrationJobAlertResponse configureMigrationJobAlert(ConfigureMigrationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureMigrationJobAlertWithOptions(request, runtime);
    }

    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstanceWithOptions(ConfigureSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSubscriptionInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSubscriptionInstanceResponse());
    }

    public ConfigureSubscriptionInstanceResponse configureSubscriptionInstance(ConfigureSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSubscriptionInstanceWithOptions(request, runtime);
    }

    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlertWithOptions(ConfigureSubscriptionInstanceAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSubscriptionInstanceAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSubscriptionInstanceAlertResponse());
    }

    public ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlert(ConfigureSubscriptionInstanceAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobResponse configureSynchronizationJobWithOptions(ConfigureSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSynchronizationJobResponse());
    }

    public ConfigureSynchronizationJobResponse configureSynchronizationJob(ConfigureSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlertWithOptions(ConfigureSynchronizationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSynchronizationJobAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSynchronizationJobAlertResponse());
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobAlertWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompareWithOptions(ConfigureSynchronizationJobReplicatorCompareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigureSynchronizationJobReplicatorCompare", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigureSynchronizationJobReplicatorCompareResponse());
    }

    public ConfigureSynchronizationJobReplicatorCompareResponse configureSynchronizationJobReplicatorCompare(ConfigureSynchronizationJobReplicatorCompareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConsumerGroup", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateDtsInstanceResponse createDtsInstanceWithOptions(CreateDtsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDtsInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDtsInstanceResponse());
    }

    public CreateDtsInstanceResponse createDtsInstance(CreateDtsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDtsInstanceWithOptions(request, runtime);
    }

    public CreateMigrationJobResponse createMigrationJobWithOptions(CreateMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMigrationJobResponse());
    }

    public CreateMigrationJobResponse createMigrationJob(CreateMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMigrationJobWithOptions(request, runtime);
    }

    public CreateSubscriptionInstanceResponse createSubscriptionInstanceWithOptions(CreateSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubscriptionInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubscriptionInstanceResponse());
    }

    public CreateSubscriptionInstanceResponse createSubscriptionInstance(CreateSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscriptionInstanceWithOptions(request, runtime);
    }

    public CreateSynchronizationJobResponse createSynchronizationJobWithOptions(CreateSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSynchronizationJobResponse());
    }

    public CreateSynchronizationJobResponse createSynchronizationJob(CreateSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSynchronizationJobWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConsumerGroup", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteMigrationJobResponse deleteMigrationJobWithOptions(DeleteMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMigrationJobResponse());
    }

    public DeleteMigrationJobResponse deleteMigrationJob(DeleteMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMigrationJobWithOptions(request, runtime);
    }

    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstanceWithOptions(DeleteSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubscriptionInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubscriptionInstanceResponse());
    }

    public DeleteSubscriptionInstanceResponse deleteSubscriptionInstance(DeleteSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscriptionInstanceWithOptions(request, runtime);
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJobWithOptions(DeleteSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSynchronizationJobResponse());
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJob(DeleteSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSynchronizationJobWithOptions(request, runtime);
    }

    public DescribeConnectionStatusResponse describeConnectionStatusWithOptions(DescribeConnectionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConnectionStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConnectionStatusResponse());
    }

    public DescribeConnectionStatusResponse describeConnectionStatus(DescribeConnectionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConnectionStatusWithOptions(request, runtime);
    }

    public DescribeConsumerGroupResponse describeConsumerGroupWithOptions(DescribeConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConsumerGroup", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConsumerGroupResponse());
    }

    public DescribeConsumerGroupResponse describeConsumerGroup(DescribeConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConsumerGroupWithOptions(request, runtime);
    }

    public DescribeDTSIPResponse describeDTSIPWithOptions(DescribeDTSIPRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDTSIP", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDTSIPResponse());
    }

    public DescribeDTSIPResponse describeDTSIP(DescribeDTSIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDTSIPWithOptions(request, runtime);
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusWithOptions(DescribeEndpointSwitchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEndpointSwitchStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEndpointSwitchStatusResponse());
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEndpointSwitchStatusWithOptions(request, runtime);
    }

    public DescribeInitializationStatusResponse describeInitializationStatusWithOptions(DescribeInitializationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInitializationStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInitializationStatusResponse());
    }

    public DescribeInitializationStatusResponse describeInitializationStatus(DescribeInitializationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInitializationStatusWithOptions(request, runtime);
    }

    public DescribeMigrationJobAlertResponse describeMigrationJobAlertWithOptions(DescribeMigrationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrationJobAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrationJobAlertResponse());
    }

    public DescribeMigrationJobAlertResponse describeMigrationJobAlert(DescribeMigrationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobAlertWithOptions(request, runtime);
    }

    public DescribeMigrationJobDetailResponse describeMigrationJobDetailWithOptions(DescribeMigrationJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrationJobDetail", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrationJobDetailResponse());
    }

    public DescribeMigrationJobDetailResponse describeMigrationJobDetail(DescribeMigrationJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobDetailWithOptions(request, runtime);
    }

    public DescribeMigrationJobsResponse describeMigrationJobsWithOptions(DescribeMigrationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrationJobs", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrationJobsResponse());
    }

    public DescribeMigrationJobsResponse describeMigrationJobs(DescribeMigrationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobsWithOptions(request, runtime);
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatusWithOptions(DescribeMigrationJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMigrationJobStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMigrationJobStatusResponse());
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobStatusWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertWithOptions(DescribeSubscriptionInstanceAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubscriptionInstanceAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubscriptionInstanceAlertResponse());
    }

    public DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlert(DescribeSubscriptionInstanceAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstanceAlertWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstancesResponse describeSubscriptionInstancesWithOptions(DescribeSubscriptionInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubscriptionInstances", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubscriptionInstancesResponse());
    }

    public DescribeSubscriptionInstancesResponse describeSubscriptionInstances(DescribeSubscriptionInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstancesWithOptions(request, runtime);
    }

    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatusWithOptions(DescribeSubscriptionInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubscriptionInstanceStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubscriptionInstanceStatusResponse());
    }

    public DescribeSubscriptionInstanceStatusResponse describeSubscriptionInstanceStatus(DescribeSubscriptionInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubscriptionInstanceStatusWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertWithOptions(DescribeSynchronizationJobAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationJobAlert", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationJobAlertResponse());
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobAlertWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompareWithOptions(DescribeSynchronizationJobReplicatorCompareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationJobReplicatorCompare", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationJobReplicatorCompareResponse());
    }

    public DescribeSynchronizationJobReplicatorCompareResponse describeSynchronizationJobReplicatorCompare(DescribeSynchronizationJobReplicatorCompareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobReplicatorCompareWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobsWithOptions(DescribeSynchronizationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationJobs", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationJobsResponse());
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobsWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusWithOptions(DescribeSynchronizationJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationJobStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationJobStatusResponse());
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobStatusWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusListWithOptions(DescribeSynchronizationJobStatusListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationJobStatusList", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationJobStatusListResponse());
    }

    public DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusList(DescribeSynchronizationJobStatusListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationJobStatusListWithOptions(request, runtime);
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusWithOptions(DescribeSynchronizationObjectModifyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSynchronizationObjectModifyStatus", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSynchronizationObjectModifyStatusResponse());
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronizationObjectModifyStatusWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPasswordWithOptions(ModifyConsumerGroupPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyConsumerGroupPassword", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyConsumerGroupPasswordResponse());
    }

    public ModifyConsumerGroupPasswordResponse modifyConsumerGroupPassword(ModifyConsumerGroupPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConsumerGroupPasswordWithOptions(request, runtime);
    }

    public ModifyConsumptionTimestampResponse modifyConsumptionTimestampWithOptions(ModifyConsumptionTimestampRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyConsumptionTimestamp", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyConsumptionTimestampResponse());
    }

    public ModifyConsumptionTimestampResponse modifyConsumptionTimestamp(ModifyConsumptionTimestampRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConsumptionTimestampWithOptions(request, runtime);
    }

    public ModifySubscriptionObjectResponse modifySubscriptionObjectWithOptions(ModifySubscriptionObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySubscriptionObject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySubscriptionObjectResponse());
    }

    public ModifySubscriptionObjectResponse modifySubscriptionObject(ModifySubscriptionObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySubscriptionObjectWithOptions(request, runtime);
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObjectWithOptions(ModifySynchronizationObjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySynchronizationObject", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySynchronizationObjectResponse());
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObject(ModifySynchronizationObjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySynchronizationObjectWithOptions(request, runtime);
    }

    public ResetSynchronizationJobResponse resetSynchronizationJobWithOptions(ResetSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetSynchronizationJobResponse());
    }

    public ResetSynchronizationJobResponse resetSynchronizationJob(ResetSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetSynchronizationJobWithOptions(request, runtime);
    }

    public ShieldPrecheckResponse shieldPrecheckWithOptions(ShieldPrecheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ShieldPrecheck", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ShieldPrecheckResponse());
    }

    public ShieldPrecheckResponse shieldPrecheck(ShieldPrecheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.shieldPrecheckWithOptions(request, runtime);
    }

    public StartDtsJobResponse startDtsJobWithOptions(StartDtsJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDtsJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartDtsJobResponse());
    }

    public StartDtsJobResponse startDtsJob(StartDtsJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDtsJobWithOptions(request, runtime);
    }

    public StartMigrationJobResponse startMigrationJobWithOptions(StartMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartMigrationJobResponse());
    }

    public StartMigrationJobResponse startMigrationJob(StartMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMigrationJobWithOptions(request, runtime);
    }

    public StartSubscriptionInstanceResponse startSubscriptionInstanceWithOptions(StartSubscriptionInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartSubscriptionInstance", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartSubscriptionInstanceResponse());
    }

    public StartSubscriptionInstanceResponse startSubscriptionInstance(StartSubscriptionInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startSubscriptionInstanceWithOptions(request, runtime);
    }

    public StartSynchronizationJobResponse startSynchronizationJobWithOptions(StartSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartSynchronizationJobResponse());
    }

    public StartSynchronizationJobResponse startSynchronizationJob(StartSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startSynchronizationJobWithOptions(request, runtime);
    }

    public StopMigrationJobResponse stopMigrationJobWithOptions(StopMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopMigrationJobResponse());
    }

    public StopMigrationJobResponse stopMigrationJob(StopMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMigrationJobWithOptions(request, runtime);
    }

    public SuspendMigrationJobResponse suspendMigrationJobWithOptions(SuspendMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendMigrationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendMigrationJobResponse());
    }

    public SuspendMigrationJobResponse suspendMigrationJob(SuspendMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendMigrationJobWithOptions(request, runtime);
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJobWithOptions(SuspendSynchronizationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendSynchronizationJob", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendSynchronizationJobResponse());
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJob(SuspendSynchronizationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendSynchronizationJobWithOptions(request, runtime);
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpointWithOptions(SwitchSynchronizationEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchSynchronizationEndpoint", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchSynchronizationEndpointResponse());
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchSynchronizationEndpointWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2020-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }
}
