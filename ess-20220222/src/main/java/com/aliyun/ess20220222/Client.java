// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222;

import com.aliyun.tea.*;
import com.aliyun.ess20220222.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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
            new TeaPair("us-east-1", "ess.aliyuncs.com"),
            new TeaPair("us-west-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ess.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ess.aliyuncs.com"),
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
            new TeaPair("cn-huhehaote-nebula-1", "ess.aliyuncs.com"),
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
            new TeaPair("cn-zhangbei", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ess.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ess.aliyuncs.com")
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

    public ApplyScalingGroupResponse applyScalingGroupWithOptions(ApplyScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            query.put("Format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyScalingGroupResponse());
    }

    public ApplyScalingGroupResponse applyScalingGroup(ApplyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyScalingGroupWithOptions(request, runtime);
    }

    /**
      * Before you associate an ALB server group with a scaling group, make sure that the following requirements are met:
      * *   The scaling group resides in a virtual private cloud (VPC). The scaling group and the ALB server group must reside in the same VPC.
      * *   The ALB server group is in the Available state.
      * *   You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
      *
      * @param request AttachAlbServerGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachAlbServerGroupsResponse
     */
    public AttachAlbServerGroupsResponse attachAlbServerGroupsWithOptions(AttachAlbServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachAlbServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachAlbServerGroupsResponse());
    }

    /**
      * Before you associate an ALB server group with a scaling group, make sure that the following requirements are met:
      * *   The scaling group resides in a virtual private cloud (VPC). The scaling group and the ALB server group must reside in the same VPC.
      * *   The ALB server group is in the Available state.
      * *   You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
      *
      * @param request AttachAlbServerGroupsRequest
      * @return AttachAlbServerGroupsResponse
     */
    public AttachAlbServerGroupsResponse attachAlbServerGroups(AttachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAlbServerGroupsWithOptions(request, runtime);
    }

    /**
      * Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
      * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](~~41872~~).
      * *   The ApsaraDB RDS instance must be in the Running state.
      * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](~~43185~~).
      *
      * @param request AttachDBInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachDBInstancesResponse
     */
    public AttachDBInstancesResponse attachDBInstancesWithOptions(AttachDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDBInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDBInstancesResponse());
    }

    /**
      * Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
      * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](~~41872~~).
      * *   The ApsaraDB RDS instance must be in the Running state.
      * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](~~43185~~).
      *
      * @param request AttachDBInstancesRequest
      * @return AttachDBInstancesResponse
     */
    public AttachDBInstancesResponse attachDBInstances(AttachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDBInstancesWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:
      * *   The instances reside in the same region as the scaling group.
      * *   The instances must be in the Running state.
      * *   The instances are not added to other scaling groups.
      * *   The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.
      * *   If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.
      * *   If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
      * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
      * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.
      *
      * @param request AttachInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstancesWithOptions(AttachInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entrusted)) {
            query.put("Entrusted", request.entrusted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHook)) {
            query.put("LifecycleHook", request.lifecycleHook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeights)) {
            query.put("LoadBalancerWeights", request.loadBalancerWeights);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachInstancesResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:
      * *   The instances reside in the same region as the scaling group.
      * *   The instances must be in the Running state.
      * *   The instances are not added to other scaling groups.
      * *   The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.
      * *   If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.
      * *   If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
      * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
      * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.
      *
      * @param request AttachInstancesRequest
      * @return AttachInstancesResponse
     */
    public AttachInstancesResponse attachInstances(AttachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachInstancesWithOptions(request, runtime);
    }

    /**
      * Before you call this operation to attach a CLB instance to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same virtual private cloud (VPC) if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the CLB backend server groups contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   You can attach only a limited number of CLB instances to a scaling group. Fore more information, see [Limits](~~25863~~).
      *
      * @param request AttachLoadBalancersRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachLoadBalancersResponse
     */
    public AttachLoadBalancersResponse attachLoadBalancersWithOptions(AttachLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerConfigs)) {
            query.put("LoadBalancerConfigs", request.loadBalancerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancers)) {
            query.put("LoadBalancers", request.loadBalancers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachLoadBalancers"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachLoadBalancersResponse());
    }

    /**
      * Before you call this operation to attach a CLB instance to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same virtual private cloud (VPC) if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the CLB backend server groups contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   You can attach only a limited number of CLB instances to a scaling group. Fore more information, see [Limits](~~25863~~).
      *
      * @param request AttachLoadBalancersRequest
      * @return AttachLoadBalancersResponse
     */
    public AttachLoadBalancersResponse attachLoadBalancers(AttachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachLoadBalancersWithOptions(request, runtime);
    }

    public AttachServerGroupsResponse attachServerGroupsWithOptions(AttachServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachServerGroupsResponse());
    }

    public AttachServerGroupsResponse attachServerGroups(AttachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachServerGroupsWithOptions(request, runtime);
    }

    /**
      * Before you call this operation to attach a vServer group to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same VPC if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the vServer groups of the CLB instance contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   The vServer group that you want to attach to your scaling group must belong to the CLB instance.
      * *   You can attach only a limited number of vServer groups to a scaling group. For information about the quota on vServer groups, see [Limits](~~25863~~).
      * When you call this operation, you must specify the following parameters:
      * *   LoadBalancerId: the ID of the CLB instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If a vServer group is attached to a scaling group by using different ports, Auto Scaling considers that more than one vServer group is attached to the scaling group. If multiple vServer groups with the same group ID and port number are specified in the request parameters, only the first vServer group is used. The other vServer groups are ignored.
      *
      * @param request AttachVServerGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachVServerGroupsResponse
     */
    public AttachVServerGroupsResponse attachVServerGroupsWithOptions(AttachVServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAttach)) {
            query.put("ForceAttach", request.forceAttach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVServerGroupsResponse());
    }

    /**
      * Before you call this operation to attach a vServer group to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same VPC if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the vServer groups of the CLB instance contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   The vServer group that you want to attach to your scaling group must belong to the CLB instance.
      * *   You can attach only a limited number of vServer groups to a scaling group. For information about the quota on vServer groups, see [Limits](~~25863~~).
      * When you call this operation, you must specify the following parameters:
      * *   LoadBalancerId: the ID of the CLB instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If a vServer group is attached to a scaling group by using different ports, Auto Scaling considers that more than one vServer group is attached to the scaling group. If multiple vServer groups with the same group ID and port number are specified in the request parameters, only the first vServer group is used. The other vServer groups are ignored.
      *
      * @param request AttachVServerGroupsRequest
      * @return AttachVServerGroupsResponse
     */
    public AttachVServerGroupsResponse attachVServerGroups(AttachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVServerGroupsWithOptions(request, runtime);
    }

    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2022-02-22"),
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

    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
      * If you set the LifecycleActionResult parameter for a lifecycle hook of a scaling group to CONTINUE in the operation, Auto Scaling continues to complete the scaling activity in the scaling group after the lifecycle hook times out. If you set the LifecycleActionResult parameter to ABANDON, Auto Scaling stops the scaling activity in the scaling group after the lifecycle hook times out.
      *
      * @param request CompleteLifecycleActionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CompleteLifecycleActionResponse
     */
    public CompleteLifecycleActionResponse completeLifecycleActionWithOptions(CompleteLifecycleActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionResult)) {
            query.put("LifecycleActionResult", request.lifecycleActionResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionToken)) {
            query.put("LifecycleActionToken", request.lifecycleActionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteLifecycleAction"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteLifecycleActionResponse());
    }

    /**
      * If you set the LifecycleActionResult parameter for a lifecycle hook of a scaling group to CONTINUE in the operation, Auto Scaling continues to complete the scaling activity in the scaling group after the lifecycle hook times out. If you set the LifecycleActionResult parameter to ABANDON, Auto Scaling stops the scaling activity in the scaling group after the lifecycle hook times out.
      *
      * @param request CompleteLifecycleActionRequest
      * @return CompleteLifecycleActionResponse
     */
    public CompleteLifecycleActionResponse completeLifecycleAction(CompleteLifecycleActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeLifecycleActionWithOptions(request, runtime);
    }

    public CreateAlarmResponse createAlarmWithOptions(CreateAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmActions)) {
            query.put("AlarmActions", request.alarmActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comparisonOperator)) {
            query.put("ComparisonOperator", request.comparisonOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effective)) {
            query.put("Effective", request.effective);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressions)) {
            query.put("Expressions", request.expressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionsLogicOperator)) {
            query.put("ExpressionsLogicOperator", request.expressionsLogicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statistics)) {
            query.put("Statistics", request.statistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlarmResponse());
    }

    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlarmWithOptions(request, runtime);
    }

    /**
      * A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
      * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      *
      * @param request CreateEciScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateEciScalingConfigurationResponse
     */
    public CreateEciScalingConfigurationResponse createEciScalingConfigurationWithOptions(CreateEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfos)) {
            query.put("AcrRegistryInfos", request.acrRegistryInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeDeadlineSeconds)) {
            query.put("ActiveDeadlineSeconds", request.activeDeadlineSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateEip)) {
            query.put("AutoCreateEip", request.autoCreateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containers)) {
            query.put("Containers", request.containers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costOptimization)) {
            query.put("CostOptimization", request.costOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsCore)) {
            query.put("CpuOptionsCore", request.cpuOptionsCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsThreadsPerCore)) {
            query.put("CpuOptionsThreadsPerCore", request.cpuOptionsThreadsPerCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBucket)) {
            query.put("DataCacheBucket", request.dataCacheBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBurstingEnabled)) {
            query.put("DataCacheBurstingEnabled", request.dataCacheBurstingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCachePL)) {
            query.put("DataCachePL", request.dataCachePL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheProvisionedIops)) {
            query.put("DataCacheProvisionedIops", request.dataCacheProvisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigNameServers)) {
            query.put("DnsConfigNameServers", request.dnsConfigNameServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigOptions)) {
            query.put("DnsConfigOptions", request.dnsConfigOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigSearchs)) {
            query.put("DnsConfigSearchs", request.dnsConfigSearchs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsPolicy)) {
            query.put("DnsPolicy", request.dnsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressBandwidth)) {
            query.put("EgressBandwidth", request.egressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSls)) {
            query.put("EnableSls", request.enableSls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAliases)) {
            query.put("HostAliases", request.hostAliases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredentials)) {
            query.put("ImageRegistryCredentials", request.imageRegistryCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSnapshotId)) {
            query.put("ImageSnapshotId", request.imageSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressBandwidth)) {
            query.put("IngressBandwidth", request.ingressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceFamilyLevel)) {
            query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ntpServers)) {
            query.put("NtpServers", request.ntpServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityContextSysctls)) {
            query.put("SecurityContextSysctls", request.securityContextSysctls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEciScalingConfigurationResponse());
    }

    /**
      * A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
      * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      *
      * @param request CreateEciScalingConfigurationRequest
      * @return CreateEciScalingConfigurationResponse
     */
    public CreateEciScalingConfigurationResponse createEciScalingConfiguration(CreateEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEciScalingConfigurationWithOptions(request, runtime);
    }

    /**
      * You can create up to six lifecycle hooks for each scaling group. Elastic Compute Service (ECS) instances are not immediately added to or removed from scaling groups that have effective lifecycle hooks during scaling activities. The ECS instances are added to or removed from the scaling groups only after the lifecycle hooks time out. The period of time before the lifecycle hooks time out is specified by the HeartbeatTimeout parameter. Before lifecycle hooks time out, you can initialize the configurations of ECS instances and query data on the ECS instances.
      * If lifecycle hooks take effect for scale-out activities, the private IP addresses of ECS instances are added to the IP address whitelists of the associated ApsaraDB RDS instances and the ECS instances are added to the backend server groups of the associated Server Load Balancer (SLB) instances only after the lifecycle hooks time out. If lifecycle hooks take effect for scale-in activities, the private IP addresses of ECS instances are removed from the IP address whitelists of the disassociated ApsaraDB RDS instances and the ECS instances are removed from the backend server groups of the disassociated SLB instances only after the lifecycle hooks time out.
      * You can configure a notification method for a lifecycle hook. When the lifecycle hook takes effect, a notification can be sent by using a Message Service (MNS) topic, an MNS queue, or an Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a RAM role for OOS. For more information, see [Grant RAM permissions to OOS](~~120810~~).
      * > If your scaling group contains ECS instances and you configure an OOS template to add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the IP address whitelists of cloud databases other than ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to the IP address whitelists of the cloud databases.
      *
      * @param request CreateLifecycleHookRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateLifecycleHookResponse
     */
    public CreateLifecycleHookResponse createLifecycleHookWithOptions(CreateLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultResult)) {
            query.put("DefaultResult", request.defaultResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("HeartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleTransition)) {
            query.put("LifecycleTransition", request.lifecycleTransition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationMetadata)) {
            query.put("NotificationMetadata", request.notificationMetadata);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecycleHookResponse());
    }

    /**
      * You can create up to six lifecycle hooks for each scaling group. Elastic Compute Service (ECS) instances are not immediately added to or removed from scaling groups that have effective lifecycle hooks during scaling activities. The ECS instances are added to or removed from the scaling groups only after the lifecycle hooks time out. The period of time before the lifecycle hooks time out is specified by the HeartbeatTimeout parameter. Before lifecycle hooks time out, you can initialize the configurations of ECS instances and query data on the ECS instances.
      * If lifecycle hooks take effect for scale-out activities, the private IP addresses of ECS instances are added to the IP address whitelists of the associated ApsaraDB RDS instances and the ECS instances are added to the backend server groups of the associated Server Load Balancer (SLB) instances only after the lifecycle hooks time out. If lifecycle hooks take effect for scale-in activities, the private IP addresses of ECS instances are removed from the IP address whitelists of the disassociated ApsaraDB RDS instances and the ECS instances are removed from the backend server groups of the disassociated SLB instances only after the lifecycle hooks time out.
      * You can configure a notification method for a lifecycle hook. When the lifecycle hook takes effect, a notification can be sent by using a Message Service (MNS) topic, an MNS queue, or an Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a RAM role for OOS. For more information, see [Grant RAM permissions to OOS](~~120810~~).
      * > If your scaling group contains ECS instances and you configure an OOS template to add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the IP address whitelists of cloud databases other than ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to the IP address whitelists of the cloud databases.
      *
      * @param request CreateLifecycleHookRequest
      * @return CreateLifecycleHookResponse
     */
    public CreateLifecycleHookResponse createLifecycleHook(CreateLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleHookWithOptions(request, runtime);
    }

    /**
      * ## Description
      * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
      *
      * @param request CreateNotificationConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfigurationWithOptions(CreateNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTypes)) {
            query.put("NotificationTypes", request.notificationTypes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNotificationConfigurationResponse());
    }

    /**
      * ## Description
      * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
      *
      * @param request CreateNotificationConfigurationRequest
      * @return CreateNotificationConfigurationResponse
     */
    public CreateNotificationConfigurationResponse createNotificationConfiguration(CreateNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNotificationConfigurationWithOptions(request, runtime);
    }

    /**
      * Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:
      * *   InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.
      * *   InstanceType: In this mode, you must specify one instance type.
      * *   InstanceTypes: In this mode, you can specify more than one instance type.
      * *   InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.
      * *   Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      * > You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.
      *
      * @param tmpReq CreateScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateScalingConfigurationResponse
     */
    public CreateScalingConfigurationResponse createScalingConfigurationWithOptions(CreateScalingConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScalingConfigurationShrinkRequest request = new CreateScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            query.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditSpecification)) {
            query.put("CreditSpecification", request.creditSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPriorities)) {
            query.put("CustomPriorities", request.customPriorities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisks)) {
            query.put("DataDisks", request.dataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostId)) {
            query.put("DedicatedHostId", request.dedicatedHostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSetId)) {
            query.put("DeploymentSetId", request.deploymentSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpcClusterId)) {
            query.put("HpcClusterId", request.hpcClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFamily)) {
            query.put("ImageFamily", request.imageFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancePatternInfos)) {
            query.put("InstancePatternInfos", request.instancePatternInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeOverrides)) {
            query.put("InstanceTypeOverrides", request.instanceTypeOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthIn)) {
            query.put("InternetMaxBandwidthIn", request.internetMaxBandwidthIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerOptionsShrink)) {
            query.put("SchedulerOptions", request.schedulerOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEnhancementStrategy)) {
            query.put("SecurityEnhancementStrategy", request.securityEnhancementStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInterruptionBehavior)) {
            query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimits)) {
            query.put("SpotPriceLimits", request.spotPriceLimits);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetId)) {
            query.put("StorageSetId", request.storageSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetPartitionNumber)) {
            query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategories)) {
            query.put("SystemDiskCategories", request.systemDiskCategories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenancy)) {
            query.put("Tenancy", request.tenancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOptions)) {
            query.put("ImageOptions", request.imageOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privatePoolOptions)) {
            query.put("PrivatePoolOptions", request.privatePoolOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingConfigurationResponse());
    }

    /**
      * Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:
      * *   InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.
      * *   InstanceType: In this mode, you must specify one instance type.
      * *   InstanceTypes: In this mode, you can specify more than one instance type.
      * *   InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.
      * *   Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      * > You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.
      *
      * @param request CreateScalingConfigurationRequest
      * @return CreateScalingConfigurationResponse
     */
    public CreateScalingConfigurationResponse createScalingConfiguration(CreateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingConfigurationWithOptions(request, runtime);
    }

    /**
      * A scaling group is a group of Elastic Compute Service (ECS) instances that can be used in similar business scenarios.
      * You can create only a limited number of scaling groups in a region. Go to Quota Center to check the quota of the scaling groups.
      * A scaling group does not immediately take effect after you create the scaling group. You must call the EnableScalingGroup operation to enable the scaling group. After you enable the scaling group, Auto Scaling can execute scaling rules to trigger scaling activities in the scaling group.
      * The Classic Load Balancer (CLB) instances and ApsaraDB RDS instances that you want to associate with a scaling group must reside in the same region as the scaling group. CLB instances are formerly known as Server Load Balancer (SLB) instances. For more information, see the "Regions and zones" topic.
      * If you associate a CLB instance when you create a scaling group, Auto Scaling automatically adds ECS instances in the scaling group to the backend server group of the associated CLB instance. You can specify a server group to which ECS instances can be added. You can add ECS instances to the following types of server groups:
      * *   Default server group: a group of ECS instances that are used to receive requests. If you do not specify a vServer group or a primary/secondary server group for a listener, requests are forwarded to the ECS instances in the default server group.
      * *   vServer group: If you want to forward requests to backend servers that are not in the default server group or configure domain name-based or URL-based forwarding rules, you can use vServer groups.
      * > If you specify the default server group and multiple vServer groups at the same time, ECS instances are added to all specified server groups.
      * The default weight of an ECS instance that is added as a backend server of a CLB instance is 50. The CLB instance that you want to associate with your scaling group must meet the following requirements:
      * *   The CLB instance must be in the Active state. You can call the DescribeLoadBalancers operation to query the state of the CLB instance.
      * *   The health check feature must be enabled on all listener ports that are configured for the CLB instance. Otherwise, the scaling group fails to be created.
      * If you associate an Application Load Balancer (ALB) server group with a scaling group, Auto Scaling automatically adds ECS instances that are in the scaling group to the ALB server group to process requests distributed by the ALB instance to which the ALB server group belongs. You can specify multiple ALB server groups. The server groups must reside in the same virtual private cloud (VPC) as the scaling group. For more information, see the "AttachAlbServerGroups" topic.
      * If you associate an ApsaraDB RDS instance with a scaling group, Auto Scaling automatically adds the private IP addresses of the ECS instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. The ApsaraDB RDS instance that you want to associate with your scaling group must meet the following requirements:
      * *   The ApsaraDB RDS instance must be in the Running state. You can call the DescribeDBInstances operation to query the state of the ApsaraDB RDS instance.
      * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see the "Configure whitelists" topic.
      * If you set the MultiAZPolicy parameter of the scaling group to COST_OPTIMIZED, take note of the following items:
      * *   You can use the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters to specify the instance allocation method based on the cost optimization policy. This instance allocation method is prioritized during scaling.
      * *   If you do not specify the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter, the instance types that are provided at the lowest price are used to create instances based on the cost optimization policy.
      * If you set the `Tags.Propagate` parameter of the scaling group to true, the following rules apply:
      * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
      * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
      * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
      *
      * @param request CreateScalingGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroupWithOptions(CreateScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationStrategy)) {
            query.put("AllocationStrategy", request.allocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compensateWithOnDemand)) {
            query.put("CompensateWithOnDemand", request.compensateWithOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPolicyARN)) {
            query.put("CustomPolicyARN", request.customPolicyARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIds)) {
            query.put("DBInstanceIds", request.DBInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCooldown)) {
            query.put("DefaultCooldown", request.defaultCooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTypes)) {
            query.put("HealthCheckTypes", request.healthCheckTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHooks)) {
            query.put("LifecycleHooks", request.lifecycleHooks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerConfigs)) {
            query.put("LoadBalancerConfigs", request.loadBalancerConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            query.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInstanceLifetime)) {
            query.put("MaxInstanceLifetime", request.maxInstanceLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSize)) {
            query.put("MaxSize", request.maxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSize)) {
            query.put("MinSize", request.minSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAZPolicy)) {
            query.put("MultiAZPolicy", request.multiAZPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandBaseCapacity)) {
            query.put("OnDemandBaseCapacity", request.onDemandBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandPercentageAboveBaseCapacity)) {
            query.put("OnDemandPercentageAboveBaseCapacity", request.onDemandPercentageAboveBaseCapacity);
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

        if (!com.aliyun.teautil.Common.isUnset(request.removalPolicies)) {
            query.put("RemovalPolicies", request.removalPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotAllocationStrategy)) {
            query.put("SpotAllocationStrategy", request.spotAllocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstancePools)) {
            query.put("SpotInstancePools", request.spotInstancePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstanceRemedy)) {
            query.put("SpotInstanceRemedy", request.spotInstanceRemedy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncAlarmRuleToCms)) {
            query.put("SyncAlarmRuleToCms", request.syncAlarmRuleToCms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingGroupResponse());
    }

    /**
      * A scaling group is a group of Elastic Compute Service (ECS) instances that can be used in similar business scenarios.
      * You can create only a limited number of scaling groups in a region. Go to Quota Center to check the quota of the scaling groups.
      * A scaling group does not immediately take effect after you create the scaling group. You must call the EnableScalingGroup operation to enable the scaling group. After you enable the scaling group, Auto Scaling can execute scaling rules to trigger scaling activities in the scaling group.
      * The Classic Load Balancer (CLB) instances and ApsaraDB RDS instances that you want to associate with a scaling group must reside in the same region as the scaling group. CLB instances are formerly known as Server Load Balancer (SLB) instances. For more information, see the "Regions and zones" topic.
      * If you associate a CLB instance when you create a scaling group, Auto Scaling automatically adds ECS instances in the scaling group to the backend server group of the associated CLB instance. You can specify a server group to which ECS instances can be added. You can add ECS instances to the following types of server groups:
      * *   Default server group: a group of ECS instances that are used to receive requests. If you do not specify a vServer group or a primary/secondary server group for a listener, requests are forwarded to the ECS instances in the default server group.
      * *   vServer group: If you want to forward requests to backend servers that are not in the default server group or configure domain name-based or URL-based forwarding rules, you can use vServer groups.
      * > If you specify the default server group and multiple vServer groups at the same time, ECS instances are added to all specified server groups.
      * The default weight of an ECS instance that is added as a backend server of a CLB instance is 50. The CLB instance that you want to associate with your scaling group must meet the following requirements:
      * *   The CLB instance must be in the Active state. You can call the DescribeLoadBalancers operation to query the state of the CLB instance.
      * *   The health check feature must be enabled on all listener ports that are configured for the CLB instance. Otherwise, the scaling group fails to be created.
      * If you associate an Application Load Balancer (ALB) server group with a scaling group, Auto Scaling automatically adds ECS instances that are in the scaling group to the ALB server group to process requests distributed by the ALB instance to which the ALB server group belongs. You can specify multiple ALB server groups. The server groups must reside in the same virtual private cloud (VPC) as the scaling group. For more information, see the "AttachAlbServerGroups" topic.
      * If you associate an ApsaraDB RDS instance with a scaling group, Auto Scaling automatically adds the private IP addresses of the ECS instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. The ApsaraDB RDS instance that you want to associate with your scaling group must meet the following requirements:
      * *   The ApsaraDB RDS instance must be in the Running state. You can call the DescribeDBInstances operation to query the state of the ApsaraDB RDS instance.
      * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see the "Configure whitelists" topic.
      * If you set the MultiAZPolicy parameter of the scaling group to COST_OPTIMIZED, take note of the following items:
      * *   You can use the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters to specify the instance allocation method based on the cost optimization policy. This instance allocation method is prioritized during scaling.
      * *   If you do not specify the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter, the instance types that are provided at the lowest price are used to create instances based on the cost optimization policy.
      * If you set the `Tags.Propagate` parameter of the scaling group to true, the following rules apply:
      * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
      * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
      * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
      *
      * @param request CreateScalingGroupRequest
      * @return CreateScalingGroupResponse
     */
    public CreateScalingGroupResponse createScalingGroup(CreateScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingGroupWithOptions(request, runtime);
    }

    /**
      * ## Description
      * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling adjusts the number of ECS instances that you want to add or remove. This way, the number of ECS instances can be maintained within the valid range after the scaling rule is executed. The number of ECS instances that is specified in the scaling rule remains unchanged. Example:
      * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * Before you call this operation, take note of the following items:
      * *   If you set the AdjustmentType parameter to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of the AdjustmentValue parameter must be greater than or equal to 0.
      * *   If you set the AdjustmentType parameter to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
      * *   If you set the AdjustmentType parameter to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
      * *   If the cooldown time is specified in a scaling rule, the specified time applies to the scaling group after the rule is executed. Otherwise, the value of the DefaultCooldown parameter of the scaling group applies to the scaling group.
      * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
      * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
      *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule by setting the ScalingRuleAri parameter to the unique identifier of the scaling rule.
      *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a specific scaling rule by setting the ScheduledAction parameter to the unique identifier of the scaling rule.
      *
      * @param request CreateScalingRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRuleWithOptions(CreateScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmDimensions)) {
            query.put("AlarmDimensions", request.alarmDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cooldown)) {
            query.put("Cooldown", request.cooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableScaleIn)) {
            query.put("DisableScaleIn", request.disableScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estimatedInstanceWarmup)) {
            query.put("EstimatedInstanceWarmup", request.estimatedInstanceWarmup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveScalingMode)) {
            query.put("PredictiveScalingMode", request.predictiveScalingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveTaskBufferTime)) {
            query.put("PredictiveTaskBufferTime", request.predictiveTaskBufferTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBehavior)) {
            query.put("PredictiveValueBehavior", request.predictiveValueBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBuffer)) {
            query.put("PredictiveValueBuffer", request.predictiveValueBuffer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInEvaluationCount)) {
            query.put("ScaleInEvaluationCount", request.scaleInEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutEvaluationCount)) {
            query.put("ScaleOutEvaluationCount", request.scaleOutEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepAdjustments)) {
            query.put("StepAdjustments", request.stepAdjustments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScalingRuleResponse());
    }

    /**
      * ## Description
      * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling adjusts the number of ECS instances that you want to add or remove. This way, the number of ECS instances can be maintained within the valid range after the scaling rule is executed. The number of ECS instances that is specified in the scaling rule remains unchanged. Example:
      * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * Before you call this operation, take note of the following items:
      * *   If you set the AdjustmentType parameter to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of the AdjustmentValue parameter must be greater than or equal to 0.
      * *   If you set the AdjustmentType parameter to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
      * *   If you set the AdjustmentType parameter to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
      * *   If the cooldown time is specified in a scaling rule, the specified time applies to the scaling group after the rule is executed. Otherwise, the value of the DefaultCooldown parameter of the scaling group applies to the scaling group.
      * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
      * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
      *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule by setting the ScalingRuleAri parameter to the unique identifier of the scaling rule.
      *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a specific scaling rule by setting the ScheduledAction parameter to the unique identifier of the scaling rule.
      *
      * @param request CreateScalingRuleRequest
      * @return CreateScalingRuleResponse
     */
    public CreateScalingRuleResponse createScalingRule(CreateScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScalingRuleWithOptions(request, runtime);
    }

    /**
      * *   If a scheduled task fails to trigger a scaling activity due to an ongoing scaling activity in a scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the period that is specified by the LaunchExpirationTime parameter. If the scheduled task still fails to trigger a scaling activity after the period ends, the task is automatically skipped.
      * *   If multiple tasks are scheduled at similar points in time to trigger scaling activities in the same scaling group, the earliest task triggers the scaling activity first. Other tasks trigger scaling activities within their launch expiration time. Only one scaling activity can be triggered in a scaling group at a time.`` If the previous scaling activity is complete and another scheduled task attempts to trigger a scaling activity, Auto Scaling executes the scaling rule that is specified in the scheduled task and then triggers a scaling activity.``
      * *   A scheduled task supports the following scaling methods:
      *     *   `ScheduledAction`: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
      *     *   `ScalingGroupId`: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you created the scheduled task.
      * > You cannot specify the `ScheduledAction` and ScalingGroupId parameters at the same time.
      *
      * @param request CreateScheduledTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTaskWithOptions(CreateScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchExpirationTime)) {
            query.put("LaunchExpirationTime", request.launchExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTime)) {
            query.put("LaunchTime", request.launchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            query.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            query.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceEndTime)) {
            query.put("RecurrenceEndTime", request.recurrenceEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceType)) {
            query.put("RecurrenceType", request.recurrenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValue)) {
            query.put("RecurrenceValue", request.recurrenceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledAction)) {
            query.put("ScheduledAction", request.scheduledAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskName)) {
            query.put("ScheduledTaskName", request.scheduledTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskEnabled)) {
            query.put("TaskEnabled", request.taskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    /**
      * *   If a scheduled task fails to trigger a scaling activity due to an ongoing scaling activity in a scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the period that is specified by the LaunchExpirationTime parameter. If the scheduled task still fails to trigger a scaling activity after the period ends, the task is automatically skipped.
      * *   If multiple tasks are scheduled at similar points in time to trigger scaling activities in the same scaling group, the earliest task triggers the scaling activity first. Other tasks trigger scaling activities within their launch expiration time. Only one scaling activity can be triggered in a scaling group at a time.`` If the previous scaling activity is complete and another scheduled task attempts to trigger a scaling activity, Auto Scaling executes the scaling rule that is specified in the scheduled task and then triggers a scaling activity.``
      * *   A scheduled task supports the following scaling methods:
      *     *   `ScheduledAction`: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
      *     *   `ScalingGroupId`: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you created the scheduled task.
      * > You cannot specify the `ScheduledAction` and ScalingGroupId parameters at the same time.
      *
      * @param request CreateScheduledTaskRequest
      * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    public DeactivateScalingConfigurationResponse deactivateScalingConfigurationWithOptions(DeactivateScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateScalingConfigurationResponse());
    }

    public DeactivateScalingConfigurationResponse deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateScalingConfigurationWithOptions(request, runtime);
    }

    public DeleteAlarmResponse deleteAlarmWithOptions(DeleteAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlarmResponse());
    }

    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlarmWithOptions(request, runtime);
    }

    /**
      * You cannot delete a scaling configuration that is used to create elastic container instances in the following scenarios:
      * *   The scaling configuration is in the Active state.
      * *   The scaling group contains elastic container instances that are created based on the scaling configuration.
      *
      * @param request DeleteEciScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteEciScalingConfigurationResponse
     */
    public DeleteEciScalingConfigurationResponse deleteEciScalingConfigurationWithOptions(DeleteEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEciScalingConfigurationResponse());
    }

    /**
      * You cannot delete a scaling configuration that is used to create elastic container instances in the following scenarios:
      * *   The scaling configuration is in the Active state.
      * *   The scaling group contains elastic container instances that are created based on the scaling configuration.
      *
      * @param request DeleteEciScalingConfigurationRequest
      * @return DeleteEciScalingConfigurationResponse
     */
    public DeleteEciScalingConfigurationResponse deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEciScalingConfigurationWithOptions(request, runtime);
    }

    public DeleteLifecycleHookResponse deleteLifecycleHookWithOptions(DeleteLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLifecycleHookResponse());
    }

    public DeleteLifecycleHookResponse deleteLifecycleHook(DeleteLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecycleHookWithOptions(request, runtime);
    }

    public DeleteNotificationConfigurationResponse deleteNotificationConfigurationWithOptions(DeleteNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNotificationConfigurationResponse());
    }

    public DeleteNotificationConfigurationResponse deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNotificationConfigurationWithOptions(request, runtime);
    }

    /**
      * You cannot delete a scaling configuration in one of the following scenarios:
      * *   The scaling configuration in your scaling group is in the Active state.
      * *   The scaling group contains ECS instances that were created based on the scaling configuration.
      *
      * @param request DeleteScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteScalingConfigurationResponse
     */
    public DeleteScalingConfigurationResponse deleteScalingConfigurationWithOptions(DeleteScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingConfigurationResponse());
    }

    /**
      * You cannot delete a scaling configuration in one of the following scenarios:
      * *   The scaling configuration in your scaling group is in the Active state.
      * *   The scaling group contains ECS instances that were created based on the scaling configuration.
      *
      * @param request DeleteScalingConfigurationRequest
      * @return DeleteScalingConfigurationResponse
     */
    public DeleteScalingConfigurationResponse deleteScalingConfiguration(DeleteScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingConfigurationWithOptions(request, runtime);
    }

    public DeleteScalingGroupResponse deleteScalingGroupWithOptions(DeleteScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            query.put("ForceDelete", request.forceDelete);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingGroupResponse());
    }

    public DeleteScalingGroupResponse deleteScalingGroup(DeleteScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingGroupWithOptions(request, runtime);
    }

    public DeleteScalingRuleResponse deleteScalingRuleWithOptions(DeleteScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScalingRuleResponse());
    }

    public DeleteScalingRuleResponse deleteScalingRule(DeleteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScalingRuleWithOptions(request, runtime);
    }

    public DeleteScheduledTaskResponse deleteScheduledTaskWithOptions(DeleteScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskId)) {
            query.put("ScheduledTaskId", request.scheduledTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledTaskResponse());
    }

    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledTaskWithOptions(request, runtime);
    }

    public DescribeAlarmsResponse describeAlarmsWithOptions(DescribeAlarmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlarms"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlarmsResponse());
    }

    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlarmsWithOptions(request, runtime);
    }

    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurationsWithOptions(DescribeEciScalingConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationIds)) {
            query.put("ScalingConfigurationIds", request.scalingConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationNames)) {
            query.put("ScalingConfigurationNames", request.scalingConfigurationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEciScalingConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEciScalingConfigurationsResponse());
    }

    public DescribeEciScalingConfigurationsResponse describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEciScalingConfigurationsWithOptions(request, runtime);
    }

    /**
      * If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
      * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
      * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
      * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
      * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
      *
      * @param request DescribeLifecycleActionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeLifecycleActionsResponse
     */
    public DescribeLifecycleActionsResponse describeLifecycleActionsWithOptions(DescribeLifecycleActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionStatus)) {
            query.put("LifecycleActionStatus", request.lifecycleActionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecycleActions"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecycleActionsResponse());
    }

    /**
      * If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
      * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
      * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
      * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
      * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
      *
      * @param request DescribeLifecycleActionsRequest
      * @return DescribeLifecycleActionsResponse
     */
    public DescribeLifecycleActionsResponse describeLifecycleActions(DescribeLifecycleActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleActionsWithOptions(request, runtime);
    }

    public DescribeLifecycleHooksResponse describeLifecycleHooksWithOptions(DescribeLifecycleHooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookIds)) {
            query.put("LifecycleHookIds", request.lifecycleHookIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecycleHooks"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecycleHooksResponse());
    }

    public DescribeLifecycleHooksResponse describeLifecycleHooks(DescribeLifecycleHooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecycleHooksWithOptions(request, runtime);
    }

    public DescribeLimitationResponse describeLimitationWithOptions(DescribeLimitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLimitation"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLimitationResponse());
    }

    public DescribeLimitationResponse describeLimitation(DescribeLimitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLimitationWithOptions(request, runtime);
    }

    public DescribeNotificationConfigurationsResponse describeNotificationConfigurationsWithOptions(DescribeNotificationConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNotificationConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNotificationConfigurationsResponse());
    }

    public DescribeNotificationConfigurationsResponse describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationConfigurationsWithOptions(request, runtime);
    }

    public DescribeNotificationTypesResponse describeNotificationTypesWithOptions(DescribeNotificationTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNotificationTypes"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNotificationTypesResponse());
    }

    public DescribeNotificationTypesResponse describeNotificationTypes(DescribeNotificationTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotificationTypesWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2022-02-22"),
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
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
      * You can specify a scaling group ID to query all scaling activities in the scaling group.
      * You can filter query results based on the status of scaling activities.
      * You can query scaling activities that are executed in the previous 30 days.
      *
      * @param request DescribeScalingActivitiesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivitiesWithOptions(DescribeScalingActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityIds)) {
            query.put("ScalingActivityIds", request.scalingActivityIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingActivities"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingActivitiesResponse());
    }

    /**
      * You can specify a scaling group ID to query all scaling activities in the scaling group.
      * You can filter query results based on the status of scaling activities.
      * You can query scaling activities that are executed in the previous 30 days.
      *
      * @param request DescribeScalingActivitiesRequest
      * @return DescribeScalingActivitiesResponse
     */
    public DescribeScalingActivitiesResponse describeScalingActivities(DescribeScalingActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivitiesWithOptions(request, runtime);
    }

    public DescribeScalingActivityDetailResponse describeScalingActivityDetailWithOptions(DescribeScalingActivityDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingActivityDetail"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingActivityDetailResponse());
    }

    public DescribeScalingActivityDetailResponse describeScalingActivityDetail(DescribeScalingActivityDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingActivityDetailWithOptions(request, runtime);
    }

    public DescribeScalingConfigurationsResponse describeScalingConfigurationsWithOptions(DescribeScalingConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationIds)) {
            query.put("ScalingConfigurationIds", request.scalingConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationNames)) {
            query.put("ScalingConfigurationNames", request.scalingConfigurationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingConfigurations"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingConfigurationsResponse());
    }

    public DescribeScalingConfigurationsResponse describeScalingConfigurations(DescribeScalingConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingConfigurationsWithOptions(request, runtime);
    }

    public DescribeScalingGroupsResponse describeScalingGroupsWithOptions(DescribeScalingGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupIds)) {
            query.put("ScalingGroupIds", request.scalingGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupNames)) {
            query.put("ScalingGroupNames", request.scalingGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingGroupsResponse());
    }

    public DescribeScalingGroupsResponse describeScalingGroups(DescribeScalingGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingGroupsWithOptions(request, runtime);
    }

    public DescribeScalingInstancesResponse describeScalingInstancesWithOptions(DescribeScalingInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creationType)) {
            query.put("CreationType", request.creationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creationTypes)) {
            query.put("CreationTypes", request.creationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleState)) {
            query.put("LifecycleState", request.lifecycleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleStates)) {
            query.put("LifecycleStates", request.lifecycleStates);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingInstancesResponse());
    }

    public DescribeScalingInstancesResponse describeScalingInstances(DescribeScalingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingInstancesWithOptions(request, runtime);
    }

    /**
      * You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
      *
      * @param request DescribeScalingRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeScalingRulesResponse
     */
    public DescribeScalingRulesResponse describeScalingRulesWithOptions(DescribeScalingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleAris)) {
            query.put("ScalingRuleAris", request.scalingRuleAris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleIds)) {
            query.put("ScalingRuleIds", request.scalingRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleNames)) {
            query.put("ScalingRuleNames", request.scalingRuleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAlarmRules)) {
            query.put("ShowAlarmRules", request.showAlarmRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScalingRules"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScalingRulesResponse());
    }

    /**
      * You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
      *
      * @param request DescribeScalingRulesRequest
      * @return DescribeScalingRulesResponse
     */
    public DescribeScalingRulesResponse describeScalingRules(DescribeScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScalingRulesWithOptions(request, runtime);
    }

    public DescribeScheduledTasksResponse describeScheduledTasksWithOptions(DescribeScheduledTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledActions)) {
            query.put("ScheduledActions", request.scheduledActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskIds)) {
            query.put("ScheduledTaskIds", request.scheduledTaskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskNames)) {
            query.put("ScheduledTaskNames", request.scheduledTaskNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScheduledTasks"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduledTasksResponse());
    }

    public DescribeScheduledTasksResponse describeScheduledTasks(DescribeScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScheduledTasksWithOptions(request, runtime);
    }

    public DetachAlbServerGroupsResponse detachAlbServerGroupsWithOptions(DetachAlbServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albServerGroups)) {
            query.put("AlbServerGroups", request.albServerGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachAlbServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachAlbServerGroupsResponse());
    }

    public DetachAlbServerGroupsResponse detachAlbServerGroups(DetachAlbServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAlbServerGroupsWithOptions(request, runtime);
    }

    public DetachDBInstancesResponse detachDBInstancesWithOptions(DetachDBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstances)) {
            query.put("DBInstances", request.DBInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDBInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDBInstancesResponse());
    }

    public DetachDBInstancesResponse detachDBInstances(DetachDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDBInstancesWithOptions(request, runtime);
    }

    /**
      * After ECS instances or elastic container instances are removed from a scaling group, you can call the AttachInstances operation to add the ECS instances or elastic container instances that are removed from the scaling group to other scaling groups.
      * After you remove an ECS instance or elastic container instance by calling the DetachInstances operation, the instance is not stopped or released.
      * Before you call this operation, make sure that the following conditions are met:
      * *   The specified scaling group is enabled.
      * *   No scaling activities in the specified scaling group are in progress.
      * > If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates only that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
      * The number of ECS instances or elastic container instances in a scaling group after you remove a specific number of instances from the scaling group must be equal to or greater than the value of the MinSize parameter. Otherwise, an error is reported when you call the DetachInstances operation.
      *
      * @param request DetachInstancesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstancesWithOptions(DetachInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseDesiredCapacity)) {
            query.put("DecreaseDesiredCapacity", request.decreaseDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detachOption)) {
            query.put("DetachOption", request.detachOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHook)) {
            query.put("LifecycleHook", request.lifecycleHook);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachInstancesResponse());
    }

    /**
      * After ECS instances or elastic container instances are removed from a scaling group, you can call the AttachInstances operation to add the ECS instances or elastic container instances that are removed from the scaling group to other scaling groups.
      * After you remove an ECS instance or elastic container instance by calling the DetachInstances operation, the instance is not stopped or released.
      * Before you call this operation, make sure that the following conditions are met:
      * *   The specified scaling group is enabled.
      * *   No scaling activities in the specified scaling group are in progress.
      * > If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates only that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
      * The number of ECS instances or elastic container instances in a scaling group after you remove a specific number of instances from the scaling group must be equal to or greater than the value of the MinSize parameter. Otherwise, an error is reported when you call the DetachInstances operation.
      *
      * @param request DetachInstancesRequest
      * @return DetachInstancesResponse
     */
    public DetachInstancesResponse detachInstances(DetachInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachInstancesWithOptions(request, runtime);
    }

    public DetachLoadBalancersResponse detachLoadBalancersWithOptions(DetachLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancers)) {
            query.put("LoadBalancers", request.loadBalancers);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachLoadBalancers"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachLoadBalancersResponse());
    }

    public DetachLoadBalancersResponse detachLoadBalancers(DetachLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachLoadBalancersWithOptions(request, runtime);
    }

    public DetachServerGroupsResponse detachServerGroupsWithOptions(DetachServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroups)) {
            query.put("ServerGroups", request.serverGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachServerGroupsResponse());
    }

    public DetachServerGroupsResponse detachServerGroups(DetachServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachServerGroupsWithOptions(request, runtime);
    }

    /**
      * You can use the following parameters to specify the vServer groups that you want to detach from your scaling group.
      * *   LoadBalancerId: the ID of the Classic Load Balancer (CLB) instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If the vServer group that is specified in this call matches the vServer group associated with your scaling group, the vServer group can be detached. Otherwise, the request for detaching the vServer group is ignored, and no error is reported.
      *
      * @param request DetachVServerGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachVServerGroupsResponse
     */
    public DetachVServerGroupsResponse detachVServerGroupsWithOptions(DetachVServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceDetach)) {
            query.put("ForceDetach", request.forceDetach);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroups)) {
            query.put("VServerGroups", request.VServerGroups);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVServerGroups"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVServerGroupsResponse());
    }

    /**
      * You can use the following parameters to specify the vServer groups that you want to detach from your scaling group.
      * *   LoadBalancerId: the ID of the Classic Load Balancer (CLB) instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If the vServer group that is specified in this call matches the vServer group associated with your scaling group, the vServer group can be detached. Otherwise, the request for detaching the vServer group is ignored, and no error is reported.
      *
      * @param request DetachVServerGroupsRequest
      * @return DetachVServerGroupsResponse
     */
    public DetachVServerGroupsResponse detachVServerGroups(DetachVServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVServerGroupsWithOptions(request, runtime);
    }

    public DisableAlarmResponse disableAlarmWithOptions(DisableAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAlarmResponse());
    }

    public DisableAlarmResponse disableAlarm(DisableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAlarmWithOptions(request, runtime);
    }

    public DisableScalingGroupResponse disableScalingGroupWithOptions(DisableScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableScalingGroupResponse());
    }

    public DisableScalingGroupResponse disableScalingGroup(DisableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableScalingGroupWithOptions(request, runtime);
    }

    public EnableAlarmResponse enableAlarmWithOptions(EnableAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAlarmResponse());
    }

    public EnableAlarmResponse enableAlarm(EnableAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAlarmWithOptions(request, runtime);
    }

    /**
      * You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
      * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
      * If you specify a value for the InstanceIds parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
      * *   If the total number of ECS instances is less than the minimum number of instances required in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances required in your scaling group is five, and you specify the InstanceIds parameter to add two ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
      * *   If the value of the TotalCapacity parameter is greater than the value of the MaxSize parameter, the call fails.
      *
      * @param request EnableScalingGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return EnableScalingGroupResponse
     */
    public EnableScalingGroupResponse enableScalingGroupWithOptions(EnableScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeScalingConfigurationId)) {
            query.put("ActiveScalingConfigurationId", request.activeScalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeights)) {
            query.put("LoadBalancerWeights", request.loadBalancerWeights);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableScalingGroupResponse());
    }

    /**
      * You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
      * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
      * If you specify a value for the InstanceIds parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
      * *   If the total number of ECS instances is less than the minimum number of instances required in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances required in your scaling group is five, and you specify the InstanceIds parameter to add two ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
      * *   If the value of the TotalCapacity parameter is greater than the value of the MaxSize parameter, the call fails.
      *
      * @param request EnableScalingGroupRequest
      * @return EnableScalingGroupResponse
     */
    public EnableScalingGroupResponse enableScalingGroup(EnableScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableScalingGroupWithOptions(request, runtime);
    }

    public EnterStandbyResponse enterStandbyWithOptions(EnterStandbyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterStandby"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterStandbyResponse());
    }

    public EnterStandbyResponse enterStandby(EnterStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterStandbyWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.
      *
      * @param request ExecuteScalingRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ExecuteScalingRuleResponse
     */
    public ExecuteScalingRuleResponse executeScalingRuleWithOptions(ExecuteScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.breachThreshold)) {
            query.put("BreachThreshold", request.breachThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricValue)) {
            query.put("MetricValue", request.metricValue);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleAri)) {
            query.put("ScalingRuleAri", request.scalingRuleAri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteScalingRuleResponse());
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.
      *
      * @param request ExecuteScalingRuleRequest
      * @return ExecuteScalingRuleResponse
     */
    public ExecuteScalingRuleResponse executeScalingRule(ExecuteScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeScalingRuleWithOptions(request, runtime);
    }

    public ExitStandbyResponse exitStandbyWithOptions(ExitStandbyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExitStandby"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExitStandbyResponse());
    }

    public ExitStandbyResponse exitStandby(ExitStandbyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exitStandbyWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2022-02-22"),
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

    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
      * *   If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](~~74861~~).
      * *   When you create an event-triggered task, you must specify MetricName, DimensionKey, and DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances in a scaling group within an Alibaba Cloud account.
      *     *   If you set MetricType to custom, the valid values are your custom metrics.
      *     *   For information about the metrics that are supported if you set MetricType to system, see [Event-triggered task for system monitoring](~~74854~~).
      * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see `DimensionKey` and `DimensionValue` in the "Request parameters" section of this topic.
      *
      * @param request ModifyAlarmRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyAlarmResponse
     */
    public ModifyAlarmResponse modifyAlarmWithOptions(ModifyAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmActions)) {
            query.put("AlarmActions", request.alarmActions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmTaskId)) {
            query.put("AlarmTaskId", request.alarmTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comparisonOperator)) {
            query.put("ComparisonOperator", request.comparisonOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effective)) {
            query.put("Effective", request.effective);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressions)) {
            query.put("Expressions", request.expressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expressionsLogicOperator)) {
            query.put("ExpressionsLogicOperator", request.expressionsLogicOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statistics)) {
            query.put("Statistics", request.statistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAlarm"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAlarmResponse());
    }

    /**
      * *   If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](~~74861~~).
      * *   When you create an event-triggered task, you must specify MetricName, DimensionKey, and DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances in a scaling group within an Alibaba Cloud account.
      *     *   If you set MetricType to custom, the valid values are your custom metrics.
      *     *   For information about the metrics that are supported if you set MetricType to system, see [Event-triggered task for system monitoring](~~74854~~).
      * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see `DimensionKey` and `DimensionValue` in the "Request parameters" section of this topic.
      *
      * @param request ModifyAlarmRequest
      * @return ModifyAlarmResponse
     */
    public ModifyAlarmResponse modifyAlarm(ModifyAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAlarmWithOptions(request, runtime);
    }

    /**
      * If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
      *
      * @param request ModifyEciScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyEciScalingConfigurationResponse
     */
    public ModifyEciScalingConfigurationResponse modifyEciScalingConfigurationWithOptions(ModifyEciScalingConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfos)) {
            query.put("AcrRegistryInfos", request.acrRegistryInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeDeadlineSeconds)) {
            query.put("ActiveDeadlineSeconds", request.activeDeadlineSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateEip)) {
            query.put("AutoCreateEip", request.autoCreateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containers)) {
            query.put("Containers", request.containers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containersUpdateType)) {
            query.put("ContainersUpdateType", request.containersUpdateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costOptimization)) {
            query.put("CostOptimization", request.costOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsCore)) {
            query.put("CpuOptionsCore", request.cpuOptionsCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsThreadsPerCore)) {
            query.put("CpuOptionsThreadsPerCore", request.cpuOptionsThreadsPerCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBucket)) {
            query.put("DataCacheBucket", request.dataCacheBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBurstingEnabled)) {
            query.put("DataCacheBurstingEnabled", request.dataCacheBurstingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCachePL)) {
            query.put("DataCachePL", request.dataCachePL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheProvisionedIops)) {
            query.put("DataCacheProvisionedIops", request.dataCacheProvisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigNameServers)) {
            query.put("DnsConfigNameServers", request.dnsConfigNameServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigOptions)) {
            query.put("DnsConfigOptions", request.dnsConfigOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfigSearchs)) {
            query.put("DnsConfigSearchs", request.dnsConfigSearchs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsPolicy)) {
            query.put("DnsPolicy", request.dnsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressBandwidth)) {
            query.put("EgressBandwidth", request.egressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSls)) {
            query.put("EnableSls", request.enableSls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAliases)) {
            query.put("HostAliases", request.hostAliases);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredentials)) {
            query.put("ImageRegistryCredentials", request.imageRegistryCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSnapshotId)) {
            query.put("ImageSnapshotId", request.imageSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressBandwidth)) {
            query.put("IngressBandwidth", request.ingressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainers)) {
            query.put("InitContainers", request.initContainers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceFamilyLevel)) {
            query.put("InstanceFamilyLevel", request.instanceFamilyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ntpServers)) {
            query.put("NtpServers", request.ntpServers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityContextSysCtls)) {
            query.put("SecurityContextSysCtls", request.securityContextSysCtls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumes)) {
            query.put("Volumes", request.volumes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEciScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEciScalingConfigurationResponse());
    }

    /**
      * If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
      *
      * @param request ModifyEciScalingConfigurationRequest
      * @return ModifyEciScalingConfigurationResponse
     */
    public ModifyEciScalingConfigurationResponse modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEciScalingConfigurationWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entrusted)) {
            query.put("Entrusted", request.entrusted);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
      * You can use one of the following methods to specify the lifecycle hook that you want to modify:
      * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter and specify the lifecycle hook name by using the LifecycleHookName parameter.
      *
      * @param request ModifyLifecycleHookRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyLifecycleHookResponse
     */
    public ModifyLifecycleHookResponse modifyLifecycleHookWithOptions(ModifyLifecycleHookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultResult)) {
            query.put("DefaultResult", request.defaultResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("HeartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("LifecycleHookId", request.lifecycleHookId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookName)) {
            query.put("LifecycleHookName", request.lifecycleHookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookStatus)) {
            query.put("LifecycleHookStatus", request.lifecycleHookStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleTransition)) {
            query.put("LifecycleTransition", request.lifecycleTransition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationMetadata)) {
            query.put("NotificationMetadata", request.notificationMetadata);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLifecycleHook"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLifecycleHookResponse());
    }

    /**
      * You can use one of the following methods to specify the lifecycle hook that you want to modify:
      * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter and specify the lifecycle hook name by using the LifecycleHookName parameter.
      *
      * @param request ModifyLifecycleHookRequest
      * @return ModifyLifecycleHookResponse
     */
    public ModifyLifecycleHookResponse modifyLifecycleHook(ModifyLifecycleHookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecycleHookWithOptions(request, runtime);
    }

    public ModifyNotificationConfigurationResponse modifyNotificationConfigurationWithOptions(ModifyNotificationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationArn)) {
            query.put("NotificationArn", request.notificationArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notificationTypes)) {
            query.put("NotificationTypes", request.notificationTypes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNotificationConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNotificationConfigurationResponse());
    }

    public ModifyNotificationConfigurationResponse modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNotificationConfigurationWithOptions(request, runtime);
    }

    /**
      * You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
      *
      * @param tmpReq ModifyScalingConfigurationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyScalingConfigurationResponse
     */
    public ModifyScalingConfigurationResponse modifyScalingConfigurationWithOptions(ModifyScalingConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyScalingConfigurationShrinkRequest request = new ModifyScalingConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerOptions)) {
            request.schedulerOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerOptions, "SchedulerOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affinity)) {
            query.put("Affinity", request.affinity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditSpecification)) {
            query.put("CreditSpecification", request.creditSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPriorities)) {
            query.put("CustomPriorities", request.customPriorities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisks)) {
            query.put("DataDisks", request.dataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostId)) {
            query.put("DedicatedHostId", request.dedicatedHostId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSetId)) {
            query.put("DeploymentSetId", request.deploymentSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hpcClusterId)) {
            query.put("HpcClusterId", request.hpcClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFamily)) {
            query.put("ImageFamily", request.imageFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDescription)) {
            query.put("InstanceDescription", request.instanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancePatternInfos)) {
            query.put("InstancePatternInfos", request.instancePatternInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeOverrides)) {
            query.put("InstanceTypeOverrides", request.instanceTypeOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypes)) {
            query.put("InstanceTypes", request.instanceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioOptimized)) {
            query.put("IoOptimized", request.ioOptimized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerWeight)) {
            query.put("LoadBalancerWeight", request.loadBalancerWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.override)) {
            query.put("Override", request.override);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationId)) {
            query.put("ScalingConfigurationId", request.scalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingConfigurationName)) {
            query.put("ScalingConfigurationName", request.scalingConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerOptionsShrink)) {
            query.put("SchedulerOptions", request.schedulerOptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInterruptionBehavior)) {
            query.put("SpotInterruptionBehavior", request.spotInterruptionBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimits)) {
            query.put("SpotPriceLimits", request.spotPriceLimits);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetId)) {
            query.put("StorageSetId", request.storageSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetPartitionNumber)) {
            query.put("StorageSetPartitionNumber", request.storageSetPartitionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategories)) {
            query.put("SystemDiskCategories", request.systemDiskCategories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenancy)) {
            query.put("Tenancy", request.tenancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOptions)) {
            query.put("ImageOptions", request.imageOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privatePoolOptions)) {
            query.put("PrivatePoolOptions", request.privatePoolOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingConfiguration"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingConfigurationResponse());
    }

    /**
      * You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
      *
      * @param request ModifyScalingConfigurationRequest
      * @return ModifyScalingConfigurationResponse
     */
    public ModifyScalingConfigurationResponse modifyScalingConfiguration(ModifyScalingConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingConfigurationWithOptions(request, runtime);
    }

    /**
      * *   You cannot call this operation to modify the settings of the following parameters:
      *     *   RegionId
      *     *   LoadBalancerId
      * > If you want to change the CLB instances that are associated with your scaling group, call the AttachLoadBalancers and DetachLoadBalancers operations.
      *     *   DBInstanceId
      *     **
      *     **Note**If you want to change the ApsaraDB RDS instances that are associated with your scaling group, call the AttachDBInstances and DetachDBInstances operations.
      * *   You can modify only scaling groups that are in the Active or Inactive state.
      * *   If you enable a new scaling configuration, Elastic Compute Service (ECS) instances that are created based on the previous scaling configuration still run as expected in the scaling group.
      * *   If the total number of instances in the scaling group is greater than the allowed maximum number after you change the value of the MaxSize parameter, Auto Scaling automatically removes instances from the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group is less than the allowed minimum number after you change the value of the MinSize parameter, Auto Scaling automatically adds instances to the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group does not match the expected number of instances after you change the value of the DesiredCapacity parameter, Auto Scaling automatically adds instances to or removes instances from the scaling group to ensure that the number of instances matches the value of the DesiredCapacity parameter.
      *
      * @param request ModifyScalingGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyScalingGroupResponse
     */
    public ModifyScalingGroupResponse modifyScalingGroupWithOptions(ModifyScalingGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeScalingConfigurationId)) {
            query.put("ActiveScalingConfigurationId", request.activeScalingConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allocationStrategy)) {
            query.put("AllocationStrategy", request.allocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.azBalance)) {
            query.put("AzBalance", request.azBalance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compensateWithOnDemand)) {
            query.put("CompensateWithOnDemand", request.compensateWithOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPolicyARN)) {
            query.put("CustomPolicyARN", request.customPolicyARN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultCooldown)) {
            query.put("DefaultCooldown", request.defaultCooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDesiredCapacity)) {
            query.put("DisableDesiredCapacity", request.disableDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTypes)) {
            query.put("HealthCheckTypes", request.healthCheckTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateId)) {
            query.put("LaunchTemplateId", request.launchTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateOverrides)) {
            query.put("LaunchTemplateOverrides", request.launchTemplateOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTemplateVersion)) {
            query.put("LaunchTemplateVersion", request.launchTemplateVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxInstanceLifetime)) {
            query.put("MaxInstanceLifetime", request.maxInstanceLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSize)) {
            query.put("MaxSize", request.maxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSize)) {
            query.put("MinSize", request.minSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiAZPolicy)) {
            query.put("MultiAZPolicy", request.multiAZPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandBaseCapacity)) {
            query.put("OnDemandBaseCapacity", request.onDemandBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onDemandPercentageAboveBaseCapacity)) {
            query.put("OnDemandPercentageAboveBaseCapacity", request.onDemandPercentageAboveBaseCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removalPolicies)) {
            query.put("RemovalPolicies", request.removalPolicies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupName)) {
            query.put("ScalingGroupName", request.scalingGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingPolicy)) {
            query.put("ScalingPolicy", request.scalingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotAllocationStrategy)) {
            query.put("SpotAllocationStrategy", request.spotAllocationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstancePools)) {
            query.put("SpotInstancePools", request.spotInstancePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotInstanceRemedy)) {
            query.put("SpotInstanceRemedy", request.spotInstanceRemedy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingGroup"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingGroupResponse());
    }

    /**
      * *   You cannot call this operation to modify the settings of the following parameters:
      *     *   RegionId
      *     *   LoadBalancerId
      * > If you want to change the CLB instances that are associated with your scaling group, call the AttachLoadBalancers and DetachLoadBalancers operations.
      *     *   DBInstanceId
      *     **
      *     **Note**If you want to change the ApsaraDB RDS instances that are associated with your scaling group, call the AttachDBInstances and DetachDBInstances operations.
      * *   You can modify only scaling groups that are in the Active or Inactive state.
      * *   If you enable a new scaling configuration, Elastic Compute Service (ECS) instances that are created based on the previous scaling configuration still run as expected in the scaling group.
      * *   If the total number of instances in the scaling group is greater than the allowed maximum number after you change the value of the MaxSize parameter, Auto Scaling automatically removes instances from the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group is less than the allowed minimum number after you change the value of the MinSize parameter, Auto Scaling automatically adds instances to the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group does not match the expected number of instances after you change the value of the DesiredCapacity parameter, Auto Scaling automatically adds instances to or removes instances from the scaling group to ensure that the number of instances matches the value of the DesiredCapacity parameter.
      *
      * @param request ModifyScalingGroupRequest
      * @return ModifyScalingGroupResponse
     */
    public ModifyScalingGroupResponse modifyScalingGroup(ModifyScalingGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingGroupWithOptions(request, runtime);
    }

    public ModifyScalingRuleResponse modifyScalingRuleWithOptions(ModifyScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmDimensions)) {
            query.put("AlarmDimensions", request.alarmDimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cooldown)) {
            query.put("Cooldown", request.cooldown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableScaleIn)) {
            query.put("DisableScaleIn", request.disableScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.estimatedInstanceWarmup)) {
            query.put("EstimatedInstanceWarmup", request.estimatedInstanceWarmup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialMaxSize)) {
            query.put("InitialMaxSize", request.initialMaxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveScalingMode)) {
            query.put("PredictiveScalingMode", request.predictiveScalingMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveTaskBufferTime)) {
            query.put("PredictiveTaskBufferTime", request.predictiveTaskBufferTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBehavior)) {
            query.put("PredictiveValueBehavior", request.predictiveValueBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predictiveValueBuffer)) {
            query.put("PredictiveValueBuffer", request.predictiveValueBuffer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInEvaluationCount)) {
            query.put("ScaleInEvaluationCount", request.scaleInEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutEvaluationCount)) {
            query.put("ScaleOutEvaluationCount", request.scaleOutEvaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleId)) {
            query.put("ScalingRuleId", request.scalingRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepAdjustments)) {
            query.put("StepAdjustments", request.stepAdjustments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetValue)) {
            query.put("TargetValue", request.targetValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScalingRule"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScalingRuleResponse());
    }

    public ModifyScalingRuleResponse modifyScalingRule(ModifyScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScalingRuleWithOptions(request, runtime);
    }

    /**
      * You can use the following parameters to specify the scaling method of a scheduled task:
      * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
      * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
      * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
      *
      * @param request ModifyScheduledTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(ModifyScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desiredCapacity)) {
            query.put("DesiredCapacity", request.desiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchExpirationTime)) {
            query.put("LaunchExpirationTime", request.launchExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchTime)) {
            query.put("LaunchTime", request.launchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxValue)) {
            query.put("MaxValue", request.maxValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minValue)) {
            query.put("MinValue", request.minValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceEndTime)) {
            query.put("RecurrenceEndTime", request.recurrenceEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceType)) {
            query.put("RecurrenceType", request.recurrenceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceValue)) {
            query.put("RecurrenceValue", request.recurrenceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledAction)) {
            query.put("ScheduledAction", request.scheduledAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskId)) {
            query.put("ScheduledTaskId", request.scheduledTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledTaskName)) {
            query.put("ScheduledTaskName", request.scheduledTaskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskEnabled)) {
            query.put("TaskEnabled", request.taskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScheduledTask"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledTaskResponse());
    }

    /**
      * You can use the following parameters to specify the scaling method of a scheduled task:
      * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
      * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
      * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
      *
      * @param request ModifyScheduledTaskRequest
      * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTask(ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScheduledTaskWithOptions(request, runtime);
    }

    public RebalanceInstancesResponse rebalanceInstancesWithOptions(RebalanceInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebalanceInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebalanceInstancesResponse());
    }

    public RebalanceInstancesResponse rebalanceInstances(RebalanceInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebalanceInstancesWithOptions(request, runtime);
    }

    /**
      * You can call this operation to prolong the length of a lifecycle hook up to 20 times. Take note that the total length of a lifecycle hook cannot exceed 6 hours.
      *
      * @param request RecordLifecycleActionHeartbeatRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RecordLifecycleActionHeartbeatResponse
     */
    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeatWithOptions(RecordLifecycleActionHeartbeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.heartbeatTimeout)) {
            query.put("heartbeatTimeout", request.heartbeatTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleActionToken)) {
            query.put("lifecycleActionToken", request.lifecycleActionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleHookId)) {
            query.put("lifecycleHookId", request.lifecycleHookId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordLifecycleActionHeartbeat"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordLifecycleActionHeartbeatResponse());
    }

    /**
      * You can call this operation to prolong the length of a lifecycle hook up to 20 times. Take note that the total length of a lifecycle hook cannot exceed 6 hours.
      *
      * @param request RecordLifecycleActionHeartbeatRequest
      * @return RecordLifecycleActionHeartbeatResponse
     */
    public RecordLifecycleActionHeartbeatResponse recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordLifecycleActionHeartbeatWithOptions(request, runtime);
    }

    public RemoveInstancesResponse removeInstancesWithOptions(RemoveInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseDesiredCapacity)) {
            query.put("DecreaseDesiredCapacity", request.decreaseDesiredCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.removePolicy)) {
            query.put("RemovePolicy", request.removePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstances"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstancesResponse());
    }

    public RemoveInstancesResponse removeInstances(RemoveInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstancesWithOptions(request, runtime);
    }

    public ResumeProcessesResponse resumeProcessesWithOptions(ResumeProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processes)) {
            query.put("Processes", request.processes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeProcesses"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeProcessesResponse());
    }

    public ResumeProcessesResponse resumeProcesses(ResumeProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeProcessesWithOptions(request, runtime);
    }

    /**
      * Compared with the ExecuteScalingRule operation, the ScaleWithAdjustment operation does not require a scaling rule to be created in advance. Before you call the ScaleWithAdjustment operation, take note of the following items:
      * *   The following conditions must be met:
      *     *   The scaling group is in the Active state.
      *     *   No scaling activities in the scaling group are in progress.
      * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * *   If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * *   If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the `ScalingActivityId` parameter in the response.
      *
      * @param tmpReq ScaleWithAdjustmentRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ScaleWithAdjustmentResponse
     */
    public ScaleWithAdjustmentResponse scaleWithAdjustmentWithOptions(ScaleWithAdjustmentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScaleWithAdjustmentShrinkRequest request = new ScaleWithAdjustmentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.overrides)) {
            request.overridesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.overrides, "Overrides", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentType)) {
            query.put("AdjustmentType", request.adjustmentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustmentValue)) {
            query.put("AdjustmentValue", request.adjustmentValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAdjustmentMagnitude)) {
            query.put("MinAdjustmentMagnitude", request.minAdjustmentMagnitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overridesShrink)) {
            query.put("Overrides", request.overridesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncActivity)) {
            query.put("SyncActivity", request.syncActivity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScaleWithAdjustment"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScaleWithAdjustmentResponse());
    }

    /**
      * Compared with the ExecuteScalingRule operation, the ScaleWithAdjustment operation does not require a scaling rule to be created in advance. Before you call the ScaleWithAdjustment operation, take note of the following items:
      * *   The following conditions must be met:
      *     *   The scaling group is in the Active state.
      *     *   No scaling activities in the scaling group are in progress.
      * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * *   If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * *   If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the `ScalingActivityId` parameter in the response.
      *
      * @param request ScaleWithAdjustmentRequest
      * @return ScaleWithAdjustmentResponse
     */
    public ScaleWithAdjustmentResponse scaleWithAdjustment(ScaleWithAdjustmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scaleWithAdjustmentWithOptions(request, runtime);
    }

    public SetGroupDeletionProtectionResponse setGroupDeletionProtectionWithOptions(SetGroupDeletionProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupDeletionProtection)) {
            query.put("GroupDeletionProtection", request.groupDeletionProtection);
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

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGroupDeletionProtection"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGroupDeletionProtectionResponse());
    }

    public SetGroupDeletionProtectionResponse setGroupDeletionProtection(SetGroupDeletionProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGroupDeletionProtectionWithOptions(request, runtime);
    }

    /**
      * Configures the health check feature for Elastic Compute Service (ECS) instances.
      *
      * @param request SetInstanceHealthRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetInstanceHealthResponse
     */
    public SetInstanceHealthResponse setInstanceHealthWithOptions(SetInstanceHealthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceHealth"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceHealthResponse());
    }

    /**
      * Configures the health check feature for Elastic Compute Service (ECS) instances.
      *
      * @param request SetInstanceHealthRequest
      * @return SetInstanceHealthResponse
     */
    public SetInstanceHealthResponse setInstanceHealth(SetInstanceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceHealthWithOptions(request, runtime);
    }

    /**
      * Puts one or more Elastic Compute Service (ECS) instances into the Protected state.
      *
      * @param request SetInstancesProtectionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtectionWithOptions(SetInstancesProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectedFromScaleIn)) {
            query.put("ProtectedFromScaleIn", request.protectedFromScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstancesProtection"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstancesProtectionResponse());
    }

    /**
      * Puts one or more Elastic Compute Service (ECS) instances into the Protected state.
      *
      * @param request SetInstancesProtectionRequest
      * @return SetInstancesProtectionResponse
     */
    public SetInstancesProtectionResponse setInstancesProtection(SetInstancesProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstancesProtectionWithOptions(request, runtime);
    }

    public SuspendProcessesResponse suspendProcessesWithOptions(SuspendProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processes)) {
            query.put("Processes", request.processes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingGroupId)) {
            query.put("ScalingGroupId", request.scalingGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendProcesses"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendProcessesResponse());
    }

    public SuspendProcessesResponse suspendProcesses(SuspendProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendProcessesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2022-02-22"),
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

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2022-02-22"),
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

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public VerifyAuthenticationResponse verifyAuthenticationWithOptions(VerifyAuthenticationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.onlyCheck)) {
            query.put("OnlyCheck", request.onlyCheck);
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

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAuthentication"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAuthenticationResponse());
    }

    public VerifyAuthenticationResponse verifyAuthentication(VerifyAuthenticationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyAuthenticationWithOptions(request, runtime);
    }

    public VerifyUserResponse verifyUserWithOptions(VerifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "VerifyUser"),
            new TeaPair("version", "2022-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyUserResponse());
    }

    public VerifyUserResponse verifyUser(VerifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyUserWithOptions(request, runtime);
    }
}
