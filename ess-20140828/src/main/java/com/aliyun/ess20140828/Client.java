// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828;

import com.aliyun.tea.*;
import com.aliyun.ess20140828.models.*;
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
            new TeaPair("cn-qingdao", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ess.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ess.aliyuncs.com"),
            new TeaPair("us-west-1", "ess.aliyuncs.com"),
            new TeaPair("us-east-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ess.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ess.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ess.aliyuncs.com"),
            new TeaPair("cn-fujian", "ess.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ess.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ess.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ess.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ess", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AttachDBInstancesResponse attachDBInstancesWithOptions(AttachDBInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachDBInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new AttachDBInstancesResponse());
    }

    public AttachDBInstancesResponse attachDBInstances(AttachDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachDBInstancesWithOptions(request, runtime);
    }

    public AttachInstancesResponse attachInstancesWithOptions(AttachInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new AttachInstancesResponse());
    }

    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachInstancesWithOptions(request, runtime);
    }

    public AttachLoadBalancersResponse attachLoadBalancersWithOptions(AttachLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachLoadBalancers", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new AttachLoadBalancersResponse());
    }

    public AttachLoadBalancersResponse attachLoadBalancers(AttachLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachLoadBalancersWithOptions(request, runtime);
    }

    public AttachVServerGroupsResponse attachVServerGroupsWithOptions(AttachVServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachVServerGroups", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new AttachVServerGroupsResponse());
    }

    public AttachVServerGroupsResponse attachVServerGroups(AttachVServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachVServerGroupsWithOptions(request, runtime);
    }

    public CompleteLifecycleActionResponse completeLifecycleActionWithOptions(CompleteLifecycleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteLifecycleAction", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteLifecycleActionResponse());
    }

    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeLifecycleActionWithOptions(request, runtime);
    }

    public CreateAlarmResponse createAlarmWithOptions(CreateAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlarm", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlarmResponse());
    }

    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlarmWithOptions(request, runtime);
    }

    public CreateLifecycleHookResponse createLifecycleHookWithOptions(CreateLifecycleHookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLifecycleHook", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLifecycleHookResponse());
    }

    public CreateLifecycleHookResponse createLifecycleHook(CreateLifecycleHookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLifecycleHookWithOptions(request, runtime);
    }

    public CreateNotificationConfigurationResponse createNotificationConfigurationWithOptions(CreateNotificationConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNotificationConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNotificationConfigurationResponse());
    }

    public CreateNotificationConfigurationResponse createNotificationConfiguration(CreateNotificationConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNotificationConfigurationWithOptions(request, runtime);
    }

    public CreateScalingConfigurationResponse createScalingConfigurationWithOptions(CreateScalingConfigurationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScalingConfigurationShrinkRequest request = new CreateScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingConfigurationResponse());
    }

    public CreateScalingConfigurationResponse createScalingConfiguration(CreateScalingConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingConfigurationWithOptions(request, runtime);
    }

    public CreateScalingGroupResponse createScalingGroupWithOptions(CreateScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingGroup", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingGroupResponse());
    }

    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingGroupWithOptions(request, runtime);
    }

    public CreateScalingRuleResponse createScalingRuleWithOptions(CreateScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScalingRule", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScalingRuleResponse());
    }

    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScalingRuleWithOptions(request, runtime);
    }

    public CreateScheduledTaskResponse createScheduledTaskWithOptions(CreateScheduledTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScheduledTask", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScheduledTaskResponse());
    }

    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    public DeactivateScalingConfigurationResponse deactivateScalingConfigurationWithOptions(DeactivateScalingConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactivateScalingConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeactivateScalingConfigurationResponse());
    }

    public DeactivateScalingConfigurationResponse deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactivateScalingConfigurationWithOptions(request, runtime);
    }

    public DeleteAlarmResponse deleteAlarmWithOptions(DeleteAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlarm", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlarmResponse());
    }

    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlarmWithOptions(request, runtime);
    }

    public DeleteLifecycleHookResponse deleteLifecycleHookWithOptions(DeleteLifecycleHookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLifecycleHook", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLifecycleHookResponse());
    }

    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLifecycleHookWithOptions(request, runtime);
    }

    public DeleteNotificationConfigurationResponse deleteNotificationConfigurationWithOptions(DeleteNotificationConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNotificationConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNotificationConfigurationResponse());
    }

    public DeleteNotificationConfigurationResponse deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNotificationConfigurationWithOptions(request, runtime);
    }

    public DeleteScalingConfigurationResponse deleteScalingConfigurationWithOptions(DeleteScalingConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScalingConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScalingConfigurationResponse());
    }

    public DeleteScalingConfigurationResponse deleteScalingConfiguration(DeleteScalingConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScalingConfigurationWithOptions(request, runtime);
    }

    public DeleteScalingGroupResponse deleteScalingGroupWithOptions(DeleteScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScalingGroup", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScalingGroupResponse());
    }

    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScalingGroupWithOptions(request, runtime);
    }

    public DeleteScalingRuleResponse deleteScalingRuleWithOptions(DeleteScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScalingRule", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScalingRuleResponse());
    }

    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScalingRuleWithOptions(request, runtime);
    }

    public DeleteScheduledTaskResponse deleteScheduledTaskWithOptions(DeleteScheduledTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScheduledTask", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScheduledTaskResponse());
    }

    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScheduledTaskWithOptions(request, runtime);
    }

    public DescribeAlarmsResponse describeAlarmsWithOptions(DescribeAlarmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlarms", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlarmsResponse());
    }

    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmsWithOptions(request, runtime);
    }

    public DescribeLifecycleActionsResponse describeLifecycleActionsWithOptions(DescribeLifecycleActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLifecycleActions", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLifecycleActionsResponse());
    }

    public DescribeLifecycleActionsResponse describeLifecycleActions(DescribeLifecycleActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLifecycleActionsWithOptions(request, runtime);
    }

    public DescribeLifecycleHooksResponse describeLifecycleHooksWithOptions(DescribeLifecycleHooksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLifecycleHooks", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLifecycleHooksResponse());
    }

    public DescribeLifecycleHooksResponse describeLifecycleHooks(DescribeLifecycleHooksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLifecycleHooksWithOptions(request, runtime);
    }

    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLimitation", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLimitationResponse());
    }

    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    public DescribeNotificationConfigurationsResponse describeNotificationConfigurationsWithOptions(DescribeNotificationConfigurationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNotificationConfigurations", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNotificationConfigurationsResponse());
    }

    public DescribeNotificationConfigurationsResponse describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNotificationConfigurationsWithOptions(request, runtime);
    }

    public DescribeNotificationTypesResponse describeNotificationTypesWithOptions(DescribeNotificationTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNotificationTypes", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNotificationTypesResponse());
    }

    public DescribeNotificationTypesResponse describeNotificationTypes(DescribeNotificationTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNotificationTypesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeScalingActivitiesResponse describeScalingActivitiesWithOptions(DescribeScalingActivitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingActivities", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingActivitiesResponse());
    }

    public DescribeScalingActivitiesResponse describeScalingActivities(DescribeScalingActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingActivitiesWithOptions(request, runtime);
    }

    public DescribeScalingActivityDetailResponse describeScalingActivityDetailWithOptions(DescribeScalingActivityDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingActivityDetail", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingActivityDetailResponse());
    }

    public DescribeScalingActivityDetailResponse describeScalingActivityDetail(DescribeScalingActivityDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingActivityDetailWithOptions(request, runtime);
    }

    public DescribeScalingConfigurationsResponse describeScalingConfigurationsWithOptions(DescribeScalingConfigurationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingConfigurations", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingConfigurationsResponse());
    }

    public DescribeScalingConfigurationsResponse describeScalingConfigurations(DescribeScalingConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingConfigurationsWithOptions(request, runtime);
    }

    public DescribeScalingInstancesResponse describeScalingInstancesWithOptions(DescribeScalingInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingInstancesResponse());
    }

    public DescribeScalingInstancesResponse describeScalingInstances(DescribeScalingInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingInstancesWithOptions(request, runtime);
    }

    public DescribeScalingRulesResponse describeScalingRulesWithOptions(DescribeScalingRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScalingRules", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScalingRulesResponse());
    }

    public DescribeScalingRulesResponse describeScalingRules(DescribeScalingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScalingRulesWithOptions(request, runtime);
    }

    public DescribeScheduledTasksResponse describeScheduledTasksWithOptions(DescribeScheduledTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScheduledTasks", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScheduledTasksResponse());
    }

    public DescribeScheduledTasksResponse describeScheduledTasks(DescribeScheduledTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduledTasksWithOptions(request, runtime);
    }

    public DetachDBInstancesResponse detachDBInstancesWithOptions(DetachDBInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachDBInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DetachDBInstancesResponse());
    }

    public DetachDBInstancesResponse detachDBInstances(DetachDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachDBInstancesWithOptions(request, runtime);
    }

    public DetachInstancesResponse detachInstancesWithOptions(DetachInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DetachInstancesResponse());
    }

    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachInstancesWithOptions(request, runtime);
    }

    public DetachLoadBalancersResponse detachLoadBalancersWithOptions(DetachLoadBalancersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachLoadBalancers", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DetachLoadBalancersResponse());
    }

    public DetachLoadBalancersResponse detachLoadBalancers(DetachLoadBalancersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachLoadBalancersWithOptions(request, runtime);
    }

    public DetachVServerGroupsResponse detachVServerGroupsWithOptions(DetachVServerGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachVServerGroups", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DetachVServerGroupsResponse());
    }

    public DetachVServerGroupsResponse detachVServerGroups(DetachVServerGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachVServerGroupsWithOptions(request, runtime);
    }

    public DisableAlarmResponse disableAlarmWithOptions(DisableAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAlarm", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableAlarmResponse());
    }

    public DisableAlarmResponse disableAlarm(DisableAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAlarmWithOptions(request, runtime);
    }

    public DisableScalingGroupResponse disableScalingGroupWithOptions(DisableScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableScalingGroup", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new DisableScalingGroupResponse());
    }

    public DisableScalingGroupResponse disableScalingGroup(DisableScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableScalingGroupWithOptions(request, runtime);
    }

    public EnableAlarmResponse enableAlarmWithOptions(EnableAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableAlarm", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableAlarmResponse());
    }

    public EnableAlarmResponse enableAlarm(EnableAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAlarmWithOptions(request, runtime);
    }

    public EnableScalingGroupResponse enableScalingGroupWithOptions(EnableScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableScalingGroup", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnableScalingGroupResponse());
    }

    public EnableScalingGroupResponse enableScalingGroup(EnableScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableScalingGroupWithOptions(request, runtime);
    }

    public EnterStandbyResponse enterStandbyWithOptions(EnterStandbyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnterStandby", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new EnterStandbyResponse());
    }

    public EnterStandbyResponse enterStandby(EnterStandbyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enterStandbyWithOptions(request, runtime);
    }

    public ExecuteScalingRuleResponse executeScalingRuleWithOptions(ExecuteScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteScalingRule", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteScalingRuleResponse());
    }

    public ExecuteScalingRuleResponse executeScalingRule(ExecuteScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeScalingRuleWithOptions(request, runtime);
    }

    public ExitStandbyResponse exitStandbyWithOptions(ExitStandbyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExitStandby", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ExitStandbyResponse());
    }

    public ExitStandbyResponse exitStandby(ExitStandbyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exitStandbyWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagValues", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    public ModifyAlarmResponse modifyAlarmWithOptions(ModifyAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAlarm", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAlarmResponse());
    }

    public ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAlarmWithOptions(request, runtime);
    }

    public ModifyLifecycleHookResponse modifyLifecycleHookWithOptions(ModifyLifecycleHookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLifecycleHook", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLifecycleHookResponse());
    }

    public ModifyLifecycleHookResponse modifyLifecycleHook(ModifyLifecycleHookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLifecycleHookWithOptions(request, runtime);
    }

    public ModifyNotificationConfigurationResponse modifyNotificationConfigurationWithOptions(ModifyNotificationConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNotificationConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNotificationConfigurationResponse());
    }

    public ModifyNotificationConfigurationResponse modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNotificationConfigurationWithOptions(request, runtime);
    }

    public ModifyScalingConfigurationResponse modifyScalingConfigurationWithOptions(ModifyScalingConfigurationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyScalingConfigurationShrinkRequest request = new ModifyScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingConfiguration", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingConfigurationResponse());
    }

    public ModifyScalingConfigurationResponse modifyScalingConfiguration(ModifyScalingConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingConfigurationWithOptions(request, runtime);
    }

    public ModifyScalingGroupResponse modifyScalingGroupWithOptions(ModifyScalingGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingGroup", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingGroupResponse());
    }

    public ModifyScalingGroupResponse modifyScalingGroup(ModifyScalingGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingGroupWithOptions(request, runtime);
    }

    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScalingRule", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScalingRuleResponse());
    }

    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScalingRuleWithOptions(request, runtime);
    }

    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(ModifyScheduledTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyScheduledTask", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyScheduledTaskResponse());
    }

    public ModifyScheduledTaskResponse modifyScheduledTask(ModifyScheduledTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyScheduledTaskWithOptions(request, runtime);
    }

    public RebalanceInstancesResponse rebalanceInstancesWithOptions(RebalanceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RebalanceInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new RebalanceInstancesResponse());
    }

    public RebalanceInstancesResponse rebalanceInstances(RebalanceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rebalanceInstancesWithOptions(request, runtime);
    }

    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeatWithOptions(RecordLifecycleActionHeartbeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecordLifecycleActionHeartbeat", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new RecordLifecycleActionHeartbeatResponse());
    }

    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recordLifecycleActionHeartbeatWithOptions(request, runtime);
    }

    public RemoveInstancesResponse removeInstancesWithOptions(RemoveInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveInstances", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveInstancesResponse());
    }

    public RemoveInstancesResponse removeInstances(RemoveInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeInstancesWithOptions(request, runtime);
    }

    public ResumeProcessesResponse resumeProcessesWithOptions(ResumeProcessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeProcesses", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeProcessesResponse());
    }

    public ResumeProcessesResponse resumeProcesses(ResumeProcessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeProcessesWithOptions(request, runtime);
    }

    public SetGroupDeletionProtectionResponse setGroupDeletionProtectionWithOptions(SetGroupDeletionProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGroupDeletionProtection", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new SetGroupDeletionProtectionResponse());
    }

    public SetGroupDeletionProtectionResponse setGroupDeletionProtection(SetGroupDeletionProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGroupDeletionProtectionWithOptions(request, runtime);
    }

    public SetInstanceHealthResponse setInstanceHealthWithOptions(SetInstanceHealthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstanceHealth", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstanceHealthResponse());
    }

    public SetInstanceHealthResponse setInstanceHealth(SetInstanceHealthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstanceHealthWithOptions(request, runtime);
    }

    public SetInstancesProtectionResponse setInstancesProtectionWithOptions(SetInstancesProtectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetInstancesProtection", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new SetInstancesProtectionResponse());
    }

    public SetInstancesProtectionResponse setInstancesProtection(SetInstancesProtectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setInstancesProtectionWithOptions(request, runtime);
    }

    public SuspendProcessesResponse suspendProcessesWithOptions(SuspendProcessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendProcesses", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendProcessesResponse());
    }

    public SuspendProcessesResponse suspendProcesses(SuspendProcessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendProcessesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public VerifyAuthenticationResponse verifyAuthenticationWithOptions(VerifyAuthenticationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyAuthentication", "2014-08-28", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyAuthenticationResponse());
    }

    public VerifyAuthenticationResponse verifyAuthentication(VerifyAuthenticationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyAuthenticationWithOptions(request, runtime);
    }

    public VerifyUserResponse verifyUserWithOptions(VerifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyUser", "2014-08-28", "HTTPS", "POST", "AK", "none", req, runtime), new VerifyUserResponse());
    }

    public VerifyUserResponse verifyUser(VerifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyUserWithOptions(request, runtime);
    }
}
