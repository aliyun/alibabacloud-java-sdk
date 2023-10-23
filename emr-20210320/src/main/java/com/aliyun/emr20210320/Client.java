// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320;

import com.aliyun.tea.*;
import com.aliyun.emr20210320.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "emr.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "emr.aliyuncs.com"),
            new TeaPair("us-west-1", "emr.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "emr.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "emr.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "emr.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("emr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            query.put("ApplicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applications)) {
            query.put("Applications", request.applications);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bootstrapScripts)) {
            query.put("BootstrapScripts", request.bootstrapScripts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMode)) {
            query.put("DeployMode", request.deployMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeAttributes)) {
            query.put("NodeAttributes", request.nodeAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroups)) {
            query.put("NodeGroups", request.nodeGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            query.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityMode)) {
            query.put("SecurityMode", request.securityMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionConfig)) {
            query.put("SubscriptionConfig", request.subscriptionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
      * 创建节点组。
      *
      * @param request CreateNodeGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroupWithOptions(CreateNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroup)) {
            query.put("NodeGroup", request.nodeGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodeGroup"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeGroupResponse());
    }

    /**
      * 创建节点组。
      *
      * @param request CreateNodeGroupRequest
      * @return CreateNodeGroupResponse
     */
    public CreateNodeGroupResponse createNodeGroup(CreateNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeGroupWithOptions(request, runtime);
    }

    /**
      * 缩容节点。
      *
      * @param request DecreaseNodesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DecreaseNodesResponse
     */
    public DecreaseNodesResponse decreaseNodesWithOptions(DecreaseNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decreaseNodeCount)) {
            query.put("DecreaseNodeCount", request.decreaseNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DecreaseNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DecreaseNodesResponse());
    }

    /**
      * 缩容节点。
      *
      * @param request DecreaseNodesRequest
      * @return DecreaseNodesResponse
     */
    public DecreaseNodesResponse decreaseNodes(DecreaseNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.decreaseNodesWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
      * 获取弹性伸缩活动详情。
      *
      * @param request GetAutoScalingActivityRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAutoScalingActivityResponse
     */
    public GetAutoScalingActivityResponse getAutoScalingActivityWithOptions(GetAutoScalingActivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityId)) {
            query.put("ScalingActivityId", request.scalingActivityId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingActivity"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingActivityResponse());
    }

    /**
      * 获取弹性伸缩活动详情。
      *
      * @param request GetAutoScalingActivityRequest
      * @return GetAutoScalingActivityResponse
     */
    public GetAutoScalingActivityResponse getAutoScalingActivity(GetAutoScalingActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingActivityWithOptions(request, runtime);
    }

    /**
      * 获取弹性伸缩策略信息。
      *
      * @param request GetAutoScalingPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAutoScalingPolicyResponse
     */
    public GetAutoScalingPolicyResponse getAutoScalingPolicyWithOptions(GetAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingPolicyResponse());
    }

    /**
      * 获取弹性伸缩策略信息。
      *
      * @param request GetAutoScalingPolicyRequest
      * @return GetAutoScalingPolicyResponse
     */
    public GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingPolicyWithOptions(request, runtime);
    }

    /**
      * 调用GetCluster获取集群详情。
      *
      * @param request GetClusterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
      * 调用GetCluster获取集群详情。
      *
      * @param request GetClusterRequest
      * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    /**
      * get one doctor analysis app
      *
      * @param request GetDoctorApplicationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplicationWithOptions(GetDoctorApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorApplication"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorApplicationResponse());
    }

    /**
      * get one doctor analysis app
      *
      * @param request GetDoctorApplicationRequest
      * @return GetDoctorApplicationResponse
     */
    public GetDoctorApplicationResponse getDoctorApplication(GetDoctorApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorApplicationWithOptions(request, runtime);
    }

    /**
      * get one specific luster engine queue by <type, name>
      *
      * @param request GetDoctorComputeSummaryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorComputeSummaryResponse
     */
    public GetDoctorComputeSummaryResponse getDoctorComputeSummaryWithOptions(GetDoctorComputeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentInfo)) {
            query.put("ComponentInfo", request.componentInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorComputeSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorComputeSummaryResponse());
    }

    /**
      * get one specific luster engine queue by <type, name>
      *
      * @param request GetDoctorComputeSummaryRequest
      * @return GetDoctorComputeSummaryResponse
     */
    public GetDoctorComputeSummaryResponse getDoctorComputeSummary(GetDoctorComputeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorComputeSummaryWithOptions(request, runtime);
    }

    /**
      * get Doctor HBaseCluster
      *
      * @param request GetDoctorHBaseClusterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHBaseClusterResponse
     */
    public GetDoctorHBaseClusterResponse getDoctorHBaseClusterWithOptions(GetDoctorHBaseClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseClusterResponse());
    }

    /**
      * get Doctor HBaseCluster
      *
      * @param request GetDoctorHBaseClusterRequest
      * @return GetDoctorHBaseClusterResponse
     */
    public GetDoctorHBaseClusterResponse getDoctorHBaseCluster(GetDoctorHBaseClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseClusterWithOptions(request, runtime);
    }

    /**
      * list Doctor HBaseRegions
      *
      * @param request GetDoctorHBaseRegionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHBaseRegionResponse
     */
    public GetDoctorHBaseRegionResponse getDoctorHBaseRegionWithOptions(GetDoctorHBaseRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hbaseRegionId)) {
            query.put("HbaseRegionId", request.hbaseRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseRegion"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseRegionResponse());
    }

    /**
      * list Doctor HBaseRegions
      *
      * @param request GetDoctorHBaseRegionRequest
      * @return GetDoctorHBaseRegionResponse
     */
    public GetDoctorHBaseRegionResponse getDoctorHBaseRegion(GetDoctorHBaseRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseRegionWithOptions(request, runtime);
    }

    /**
      * get Doctor HBaseRegionServer
      *
      * @param request GetDoctorHBaseRegionServerRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHBaseRegionServerResponse
     */
    public GetDoctorHBaseRegionServerResponse getDoctorHBaseRegionServerWithOptions(GetDoctorHBaseRegionServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionServerHost)) {
            query.put("RegionServerHost", request.regionServerHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseRegionServer"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseRegionServerResponse());
    }

    /**
      * get Doctor HBaseRegionServer
      *
      * @param request GetDoctorHBaseRegionServerRequest
      * @return GetDoctorHBaseRegionServerResponse
     */
    public GetDoctorHBaseRegionServerResponse getDoctorHBaseRegionServer(GetDoctorHBaseRegionServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseRegionServerWithOptions(request, runtime);
    }

    /**
      * get Doctor HBaseTable
      *
      * @param request GetDoctorHBaseTableRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHBaseTableResponse
     */
    public GetDoctorHBaseTableResponse getDoctorHBaseTableWithOptions(GetDoctorHBaseTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHBaseTable"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHBaseTableResponse());
    }

    /**
      * get Doctor HBaseTable
      *
      * @param request GetDoctorHBaseTableRequest
      * @return GetDoctorHBaseTableResponse
     */
    public GetDoctorHBaseTableResponse getDoctorHBaseTable(GetDoctorHBaseTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHBaseTableWithOptions(request, runtime);
    }

    /**
      * list Doctor HBaseTableRegions
      *
      * @param request GetDoctorHDFSClusterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHDFSClusterResponse
     */
    public GetDoctorHDFSClusterResponse getDoctorHDFSClusterWithOptions(GetDoctorHDFSClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSClusterResponse());
    }

    /**
      * list Doctor HBaseTableRegions
      *
      * @param request GetDoctorHDFSClusterRequest
      * @return GetDoctorHDFSClusterResponse
     */
    public GetDoctorHDFSClusterResponse getDoctorHDFSCluster(GetDoctorHDFSClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSClusterWithOptions(request, runtime);
    }

    /**
      * get Doctor HDFSNode
      *
      * @param request GetDoctorHDFSDirectoryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHDFSDirectoryResponse
     */
    public GetDoctorHDFSDirectoryResponse getDoctorHDFSDirectoryWithOptions(GetDoctorHDFSDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirPath)) {
            query.put("DirPath", request.dirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSDirectory"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSDirectoryResponse());
    }

    /**
      * get Doctor HDFSNode
      *
      * @param request GetDoctorHDFSDirectoryRequest
      * @return GetDoctorHDFSDirectoryResponse
     */
    public GetDoctorHDFSDirectoryResponse getDoctorHDFSDirectory(GetDoctorHDFSDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSDirectoryWithOptions(request, runtime);
    }

    /**
      * get Doctor HDFS UGI
      *
      * @param request GetDoctorHDFSUGIRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHDFSUGIResponse
     */
    public GetDoctorHDFSUGIResponse getDoctorHDFSUGIWithOptions(GetDoctorHDFSUGIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHDFSUGI"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHDFSUGIResponse());
    }

    /**
      * get Doctor HDFS UGI
      *
      * @param request GetDoctorHDFSUGIRequest
      * @return GetDoctorHDFSUGIResponse
     */
    public GetDoctorHDFSUGIResponse getDoctorHDFSUGI(GetDoctorHDFSUGIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHDFSUGIWithOptions(request, runtime);
    }

    /**
      * list Doctor Hive Cluster
      *
      * @param request GetDoctorHiveClusterRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHiveClusterResponse
     */
    public GetDoctorHiveClusterResponse getDoctorHiveClusterWithOptions(GetDoctorHiveClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveCluster"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveClusterResponse());
    }

    /**
      * list Doctor Hive Cluster
      *
      * @param request GetDoctorHiveClusterRequest
      * @return GetDoctorHiveClusterResponse
     */
    public GetDoctorHiveClusterResponse getDoctorHiveCluster(GetDoctorHiveClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveClusterWithOptions(request, runtime);
    }

    /**
      * get Doctor Hive Database
      *
      * @param request GetDoctorHiveDatabaseRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHiveDatabaseResponse
     */
    public GetDoctorHiveDatabaseResponse getDoctorHiveDatabaseWithOptions(GetDoctorHiveDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveDatabase"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveDatabaseResponse());
    }

    /**
      * get Doctor Hive Database
      *
      * @param request GetDoctorHiveDatabaseRequest
      * @return GetDoctorHiveDatabaseResponse
     */
    public GetDoctorHiveDatabaseResponse getDoctorHiveDatabase(GetDoctorHiveDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveDatabaseWithOptions(request, runtime);
    }

    /**
      * get Doctor Hive Table
      *
      * @param request GetDoctorHiveTableRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorHiveTableResponse
     */
    public GetDoctorHiveTableResponse getDoctorHiveTableWithOptions(GetDoctorHiveTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorHiveTable"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorHiveTableResponse());
    }

    /**
      * get Doctor Hive Table
      *
      * @param request GetDoctorHiveTableRequest
      * @return GetDoctorHiveTableResponse
     */
    public GetDoctorHiveTableResponse getDoctorHiveTable(GetDoctorHiveTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorHiveTableWithOptions(request, runtime);
    }

    /**
      * Get realtime job by yarn
      *
      * @param request GetDoctorJobRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorJobResponse
     */
    public GetDoctorJobResponse getDoctorJobWithOptions(GetDoctorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorJob"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorJobResponse());
    }

    /**
      * Get realtime job by yarn
      *
      * @param request GetDoctorJobRequest
      * @return GetDoctorJobResponse
     */
    public GetDoctorJobResponse getDoctorJob(GetDoctorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorJobWithOptions(request, runtime);
    }

    /**
      * get specify component's report analysis by emr doctor
      *
      * @param request GetDoctorReportComponentSummaryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDoctorReportComponentSummaryResponse
     */
    public GetDoctorReportComponentSummaryResponse getDoctorReportComponentSummaryWithOptions(GetDoctorReportComponentSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentType)) {
            query.put("ComponentType", request.componentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDoctorReportComponentSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDoctorReportComponentSummaryResponse());
    }

    /**
      * get specify component's report analysis by emr doctor
      *
      * @param request GetDoctorReportComponentSummaryRequest
      * @return GetDoctorReportComponentSummaryResponse
     */
    public GetDoctorReportComponentSummaryResponse getDoctorReportComponentSummary(GetDoctorReportComponentSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDoctorReportComponentSummaryWithOptions(request, runtime);
    }

    /**
      * 获取节点组详情。
      *
      * @param request GetNodeGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetNodeGroupResponse
     */
    public GetNodeGroupResponse getNodeGroupWithOptions(GetNodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeGroup"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeGroupResponse());
    }

    /**
      * 获取节点组详情。
      *
      * @param request GetNodeGroupRequest
      * @return GetNodeGroupResponse
     */
    public GetNodeGroupResponse getNodeGroup(GetNodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeGroupWithOptions(request, runtime);
    }

    /**
      * 获取操作详情。
      *
      * @param request GetOperationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetOperationResponse
     */
    public GetOperationResponse getOperationWithOptions(GetOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationId)) {
            query.put("OperationId", request.operationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperation"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationResponse());
    }

    /**
      * 获取操作详情。
      *
      * @param request GetOperationRequest
      * @return GetOperationResponse
     */
    public GetOperationResponse getOperation(GetOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOperationWithOptions(request, runtime);
    }

    /**
      * 扩容节点。
      *
      * @param request IncreaseNodesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return IncreaseNodesResponse
     */
    public IncreaseNodesResponse increaseNodesWithOptions(IncreaseNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            query.put("ApplicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPayOrder)) {
            query.put("AutoPayOrder", request.autoPayOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.increaseNodeCount)) {
            query.put("IncreaseNodeCount", request.increaseNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            query.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            query.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IncreaseNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IncreaseNodesResponse());
    }

    /**
      * 扩容节点。
      *
      * @param request IncreaseNodesRequest
      * @return IncreaseNodesResponse
     */
    public IncreaseNodesResponse increaseNodes(IncreaseNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.increaseNodesWithOptions(request, runtime);
    }

    /**
      * 加入资源组。
      *
      * @param request JoinResourceGroupRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return JoinResourceGroupResponse
     */
    public JoinResourceGroupResponse joinResourceGroupWithOptions(JoinResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinResourceGroup"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinResourceGroupResponse());
    }

    /**
      * 加入资源组。
      *
      * @param request JoinResourceGroupRequest
      * @return JoinResourceGroupResponse
     */
    public JoinResourceGroupResponse joinResourceGroup(JoinResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinResourceGroupWithOptions(request, runtime);
    }

    /**
      * 查询应用配置。
      *
      * @param request ListApplicationConfigsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListApplicationConfigsResponse
     */
    public ListApplicationConfigsResponse listApplicationConfigsWithOptions(ListApplicationConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configFileName)) {
            query.put("ConfigFileName", request.configFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configItemKey)) {
            query.put("ConfigItemKey", request.configItemKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configItemValue)) {
            query.put("ConfigItemValue", request.configItemValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationConfigs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationConfigsResponse());
    }

    /**
      * 查询应用配置。
      *
      * @param request ListApplicationConfigsRequest
      * @return ListApplicationConfigsResponse
     */
    public ListApplicationConfigsResponse listApplicationConfigs(ListApplicationConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationConfigsWithOptions(request, runtime);
    }

    /**
      * 查询应用列表。
      *
      * @param request ListApplicationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationNames)) {
            query.put("ApplicationNames", request.applicationNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    /**
      * 查询应用列表。
      *
      * @param request ListApplicationsRequest
      * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
      * 查询弹性伸缩活动列表。
      *
      * @param request ListAutoScalingActivitiesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAutoScalingActivitiesResponse
     */
    public ListAutoScalingActivitiesResponse listAutoScalingActivitiesWithOptions(ListAutoScalingActivitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityStates)) {
            query.put("ScalingActivityStates", request.scalingActivityStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingActivityType)) {
            query.put("ScalingActivityType", request.scalingActivityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingActivities"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingActivitiesResponse());
    }

    /**
      * 查询弹性伸缩活动列表。
      *
      * @param request ListAutoScalingActivitiesRequest
      * @return ListAutoScalingActivitiesResponse
     */
    public ListAutoScalingActivitiesResponse listAutoScalingActivities(ListAutoScalingActivitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoScalingActivitiesWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIds)) {
            query.put("ClusterIds", request.clusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterStates)) {
            query.put("ClusterStates", request.clusterStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterTypes)) {
            query.put("ClusterTypes", request.clusterTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentTypes)) {
            query.put("PaymentTypes", request.paymentTypes);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
      * list all doctor analysis apps
      *
      * @param request ListDoctorApplicationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorApplicationsResponse
     */
    public ListDoctorApplicationsResponse listDoctorApplicationsWithOptions(ListDoctorApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queues)) {
            query.put("Queues", request.queues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorApplications"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorApplicationsResponse());
    }

    /**
      * list all doctor analysis apps
      *
      * @param request ListDoctorApplicationsRequest
      * @return ListDoctorApplicationsResponse
     */
    public ListDoctorApplicationsResponse listDoctorApplications(ListDoctorApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorApplicationsWithOptions(request, runtime);
    }

    /**
      * list Doctor analysis result of cluster engine queue view
      *
      * @param request ListDoctorComputeSummaryRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorComputeSummaryResponse
     */
    public ListDoctorComputeSummaryResponse listDoctorComputeSummaryWithOptions(ListDoctorComputeSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentTypes)) {
            query.put("ComponentTypes", request.componentTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorComputeSummary"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorComputeSummaryResponse());
    }

    /**
      * list Doctor analysis result of cluster engine queue view
      *
      * @param request ListDoctorComputeSummaryRequest
      * @return ListDoctorComputeSummaryResponse
     */
    public ListDoctorComputeSummaryResponse listDoctorComputeSummary(ListDoctorComputeSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorComputeSummaryWithOptions(request, runtime);
    }

    /**
      * list Doctor HBaseRegionServers
      *
      * @param request ListDoctorHBaseRegionServersRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHBaseRegionServersResponse
     */
    public ListDoctorHBaseRegionServersResponse listDoctorHBaseRegionServersWithOptions(ListDoctorHBaseRegionServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionServerHosts)) {
            query.put("RegionServerHosts", request.regionServerHosts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHBaseRegionServers"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHBaseRegionServersResponse());
    }

    /**
      * list Doctor HBaseRegionServers
      *
      * @param request ListDoctorHBaseRegionServersRequest
      * @return ListDoctorHBaseRegionServersResponse
     */
    public ListDoctorHBaseRegionServersResponse listDoctorHBaseRegionServers(ListDoctorHBaseRegionServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHBaseRegionServersWithOptions(request, runtime);
    }

    /**
      * list Doctor HBaseTables
      *
      * @param request ListDoctorHBaseTablesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHBaseTablesResponse
     */
    public ListDoctorHBaseTablesResponse listDoctorHBaseTablesWithOptions(ListDoctorHBaseTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            query.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHBaseTables"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHBaseTablesResponse());
    }

    /**
      * list Doctor HBaseTables
      *
      * @param request ListDoctorHBaseTablesRequest
      * @return ListDoctorHBaseTablesResponse
     */
    public ListDoctorHBaseTablesResponse listDoctorHBaseTables(ListDoctorHBaseTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHBaseTablesWithOptions(request, runtime);
    }

    /**
      * list Doctor HDFSNodes
      *
      * @param request ListDoctorHDFSDirectoriesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHDFSDirectoriesResponse
     */
    public ListDoctorHDFSDirectoriesResponse listDoctorHDFSDirectoriesWithOptions(ListDoctorHDFSDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirPath)) {
            query.put("DirPath", request.dirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHDFSDirectories"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHDFSDirectoriesResponse());
    }

    /**
      * list Doctor HDFSNodes
      *
      * @param request ListDoctorHDFSDirectoriesRequest
      * @return ListDoctorHDFSDirectoriesResponse
     */
    public ListDoctorHDFSDirectoriesResponse listDoctorHDFSDirectories(ListDoctorHDFSDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHDFSDirectoriesWithOptions(request, runtime);
    }

    /**
      * list Doctor HDFS UGIs
      *
      * @param request ListDoctorHDFSUGIRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHDFSUGIResponse
     */
    public ListDoctorHDFSUGIResponse listDoctorHDFSUGIWithOptions(ListDoctorHDFSUGIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHDFSUGI"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHDFSUGIResponse());
    }

    /**
      * list Doctor HDFS UGIs
      *
      * @param request ListDoctorHDFSUGIRequest
      * @return ListDoctorHDFSUGIResponse
     */
    public ListDoctorHDFSUGIResponse listDoctorHDFSUGI(ListDoctorHDFSUGIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHDFSUGIWithOptions(request, runtime);
    }

    /**
      * list Doctor Hive Databases
      *
      * @param request ListDoctorHiveDatabasesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHiveDatabasesResponse
     */
    public ListDoctorHiveDatabasesResponse listDoctorHiveDatabasesWithOptions(ListDoctorHiveDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseNames)) {
            query.put("DatabaseNames", request.databaseNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHiveDatabases"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHiveDatabasesResponse());
    }

    /**
      * list Doctor Hive Databases
      *
      * @param request ListDoctorHiveDatabasesRequest
      * @return ListDoctorHiveDatabasesResponse
     */
    public ListDoctorHiveDatabasesResponse listDoctorHiveDatabases(ListDoctorHiveDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHiveDatabasesWithOptions(request, runtime);
    }

    /**
      * list Doctor Hive Tables
      *
      * @param request ListDoctorHiveTablesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorHiveTablesResponse
     */
    public ListDoctorHiveTablesResponse listDoctorHiveTablesWithOptions(ListDoctorHiveTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateTime)) {
            query.put("DateTime", request.dateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            query.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorHiveTables"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorHiveTablesResponse());
    }

    /**
      * list Doctor Hive Tables
      *
      * @param request ListDoctorHiveTablesRequest
      * @return ListDoctorHiveTablesResponse
     */
    public ListDoctorHiveTablesResponse listDoctorHiveTables(ListDoctorHiveTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorHiveTablesWithOptions(request, runtime);
    }

    /**
      * list realtime jobs by yarn
      *
      * @param request ListDoctorJobsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorJobsResponse
     */
    public ListDoctorJobsResponse listDoctorJobsWithOptions(ListDoctorJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRange)) {
            query.put("EndRange", request.endRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queues)) {
            query.put("Queues", request.queues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRange)) {
            query.put("StartRange", request.startRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorJobs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorJobsResponse());
    }

    /**
      * list realtime jobs by yarn
      *
      * @param request ListDoctorJobsRequest
      * @return ListDoctorJobsResponse
     */
    public ListDoctorJobsResponse listDoctorJobs(ListDoctorJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorJobsWithOptions(request, runtime);
    }

    /**
      * list stats groupBy jobs by yarn
      *
      * @param request ListDoctorJobsStatsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorJobsStatsResponse
     */
    public ListDoctorJobsStatsResponse listDoctorJobsStatsWithOptions(ListDoctorJobsStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endRange)) {
            query.put("EndRange", request.endRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startRange)) {
            query.put("StartRange", request.startRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorJobsStats"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorJobsStatsResponse());
    }

    /**
      * list stats groupBy jobs by yarn
      *
      * @param request ListDoctorJobsStatsRequest
      * @return ListDoctorJobsStatsResponse
     */
    public ListDoctorJobsStatsResponse listDoctorJobsStats(ListDoctorJobsStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorJobsStatsWithOptions(request, runtime);
    }

    /**
      * list all reports analysis by emr doctor
      *
      * @param request ListDoctorReportsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDoctorReportsResponse
     */
    public ListDoctorReportsResponse listDoctorReportsWithOptions(ListDoctorReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDoctorReports"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDoctorReportsResponse());
    }

    /**
      * list all reports analysis by emr doctor
      *
      * @param request ListDoctorReportsRequest
      * @return ListDoctorReportsResponse
     */
    public ListDoctorReportsResponse listDoctorReports(ListDoctorReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDoctorReportsWithOptions(request, runtime);
    }

    public ListInstanceTypesResponse listInstanceTypesWithOptions(ListInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployMode)) {
            query.put("DeployMode", request.deployMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isModification)) {
            query.put("IsModification", request.isModification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupType)) {
            query.put("NodeGroupType", request.nodeGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            query.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceTypes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceTypesResponse());
    }

    public ListInstanceTypesResponse listInstanceTypes(ListInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceTypesWithOptions(request, runtime);
    }

    /**
      * 查询节点组。
      *
      * @param request ListNodeGroupsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListNodeGroupsResponse
     */
    public ListNodeGroupsResponse listNodeGroupsWithOptions(ListNodeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupIds)) {
            query.put("NodeGroupIds", request.nodeGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupNames)) {
            query.put("NodeGroupNames", request.nodeGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupStates)) {
            query.put("NodeGroupStates", request.nodeGroupStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupTypes)) {
            query.put("NodeGroupTypes", request.nodeGroupTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeGroups"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeGroupsResponse());
    }

    /**
      * 查询节点组。
      *
      * @param request ListNodeGroupsRequest
      * @return ListNodeGroupsResponse
     */
    public ListNodeGroupsResponse listNodeGroups(ListNodeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeGroupsWithOptions(request, runtime);
    }

    /**
      * 查询节点。
      *
      * @param request ListNodesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupIds)) {
            query.put("NodeGroupIds", request.nodeGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            query.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStates)) {
            query.put("NodeStates", request.nodeStates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIps)) {
            query.put("PrivateIps", request.privateIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIps)) {
            query.put("PublicIps", request.publicIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
      * 查询节点。
      *
      * @param request ListNodesRequest
      * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
      * 查询主版本。
      *
      * @param request ListReleaseVersionsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersionsWithOptions(ListReleaseVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iaasType)) {
            query.put("IaasType", request.iaasType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReleaseVersions"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReleaseVersionsResponse());
    }

    /**
      * 查询主版本。
      *
      * @param request ListReleaseVersionsRequest
      * @return ListReleaseVersionsResponse
     */
    public ListReleaseVersionsResponse listReleaseVersions(ListReleaseVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReleaseVersionsWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
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
            new TeaPair("version", "2021-03-20"),
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
      * 设置弹性伸缩规则。
      *
      * @param request PutAutoScalingPolicyRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return PutAutoScalingPolicyResponse
     */
    public PutAutoScalingPolicyResponse putAutoScalingPolicyWithOptions(PutAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraints)) {
            query.put("Constraints", request.constraints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRules)) {
            query.put("ScalingRules", request.scalingRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutAutoScalingPolicyResponse());
    }

    /**
      * 设置弹性伸缩规则。
      *
      * @param request PutAutoScalingPolicyRequest
      * @return PutAutoScalingPolicyResponse
     */
    public PutAutoScalingPolicyResponse putAutoScalingPolicy(PutAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putAutoScalingPolicyWithOptions(request, runtime);
    }

    public RemoveAutoScalingPolicyResponse removeAutoScalingPolicyWithOptions(RemoveAutoScalingPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAutoScalingPolicy"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAutoScalingPolicyResponse());
    }

    public RemoveAutoScalingPolicyResponse removeAutoScalingPolicy(RemoveAutoScalingPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAutoScalingPolicyWithOptions(request, runtime);
    }

    /**
      * 执行应用操作。
      *
      * @param request RunApplicationActionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RunApplicationActionResponse
     */
    public RunApplicationActionResponse runApplicationActionWithOptions(RunApplicationActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchSize)) {
            query.put("BatchSize", request.batchSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentInstanceSelector)) {
            query.put("ComponentInstanceSelector", request.componentInstanceSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeStrategy)) {
            query.put("ExecuteStrategy", request.executeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollingExecute)) {
            query.put("RollingExecute", request.rollingExecute);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunApplicationAction"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunApplicationActionResponse());
    }

    /**
      * 执行应用操作。
      *
      * @param request RunApplicationActionRequest
      * @return RunApplicationActionResponse
     */
    public RunApplicationActionResponse runApplicationAction(RunApplicationActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runApplicationActionWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
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
            new TeaPair("version", "2021-03-20"),
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

    /**
      * 删除指定资源标签。
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
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
            new TeaPair("version", "2021-03-20"),
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
      * 删除指定资源标签。
      *
      * @param request UntagResourcesRequest
      * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateApplicationConfigsResponse updateApplicationConfigsWithOptions(UpdateApplicationConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationConfigs)) {
            query.put("ApplicationConfigs", request.applicationConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configAction)) {
            query.put("ConfigAction", request.configAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configScope)) {
            query.put("ConfigScope", request.configScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupId)) {
            query.put("NodeGroupId", request.nodeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationConfigs"),
            new TeaPair("version", "2021-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationConfigsResponse());
    }

    public UpdateApplicationConfigsResponse updateApplicationConfigs(UpdateApplicationConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationConfigsWithOptions(request, runtime);
    }
}
