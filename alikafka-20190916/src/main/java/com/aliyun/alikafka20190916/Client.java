// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916;

import com.aliyun.tea.*;
import com.aliyun.alikafka20190916.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alikafka", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-09-16"),
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

    public ConvertPostPayOrderResponse convertPostPayOrderWithOptions(ConvertPostPayOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertPostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertPostPayOrderResponse());
    }

    public ConvertPostPayOrderResponse convertPostPayOrder(ConvertPostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertPostPayOrderWithOptions(request, runtime);
    }

    public CreateAclResponse createAclWithOptions(CreateAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationTypes)) {
            query.put("AclOperationTypes", request.aclOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAcl"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclResponse());
    }

    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2019-09-16"),
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

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
      * @param tmpReq CreatePostPayOrderRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreatePostPayOrderResponse
     */
    public CreatePostPayOrderResponse createPostPayOrderWithOptions(CreatePostPayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePostPayOrderShrinkRequest request = new CreatePostPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePostPayOrderResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
      * @param request CreatePostPayOrderRequest
      * @return CreatePostPayOrderResponse
     */
    public CreatePostPayOrderResponse createPostPayOrder(CreatePostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPostPayOrderWithOptions(request, runtime);
    }

    /**
      * *   Before you call this operation, make sure that you understand the billing methods and pricing of subscription ApsaraMQ for Kafka instances. For more information, see [Billing](~~84737~~).
      * *   If you create an ApsaraMQ for Kafka instance by calling this operation, the subscription duration is one month and the auto-renewal feature is enabled by default. The auto-renewal cycle is also one month. If you want to change the auto-renewal cycle or disable the auto-renewal feature, you can go to the [Renewal](https://renew.console.aliyun.com/#/ecs) page in the Alibaba Cloud Management Console.
      *
      * @param tmpReq CreatePrePayOrderRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreatePrePayOrderResponse
     */
    public CreatePrePayOrderResponse createPrePayOrderWithOptions(CreatePrePayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePrePayOrderShrinkRequest request = new CreatePrePayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrePayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrePayOrderResponse());
    }

    /**
      * *   Before you call this operation, make sure that you understand the billing methods and pricing of subscription ApsaraMQ for Kafka instances. For more information, see [Billing](~~84737~~).
      * *   If you create an ApsaraMQ for Kafka instance by calling this operation, the subscription duration is one month and the auto-renewal feature is enabled by default. The auto-renewal cycle is also one month. If you want to change the auto-renewal cycle or disable the auto-renewal feature, you can go to the [Renewal](https://renew.console.aliyun.com/#/ecs) page in the Alibaba Cloud Management Console.
      *
      * @param request CreatePrePayOrderRequest
      * @return CreatePrePayOrderResponse
     */
    public CreatePrePayOrderResponse createPrePayOrder(CreatePrePayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrePayOrderWithOptions(request, runtime);
    }

    public CreateSaslUserResponse createSaslUserWithOptions(CreateSaslUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mechanism)) {
            query.put("Mechanism", request.mechanism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSaslUser"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSaslUserResponse());
    }

    public CreateSaslUserResponse createSaslUser(CreateSaslUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSaslUserWithOptions(request, runtime);
    }

    /**
      * *   Each Alibaba Cloud account can call this operation up to once per second.
      * *   The maximum number of topics that you can create in an instance is determined by the specification of the instance.
      *
      * @param request CreateTopicRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compactTopic)) {
            query.put("CompactTopic", request.compactTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localTopic)) {
            query.put("LocalTopic", request.localTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minInsyncReplicas)) {
            query.put("MinInsyncReplicas", request.minInsyncReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicationFactor)) {
            query.put("ReplicationFactor", request.replicationFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTopic"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTopicResponse());
    }

    /**
      * *   Each Alibaba Cloud account can call this operation up to once per second.
      * *   The maximum number of topics that you can create in an instance is determined by the specification of the instance.
      *
      * @param request CreateTopicRequest
      * @return CreateTopicResponse
     */
    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationTypes)) {
            query.put("AclOperationTypes", request.aclOperationTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAcl"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclResponse());
    }

    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2019-09-16"),
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

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteSaslUserResponse deleteSaslUserWithOptions(DeleteSaslUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mechanism)) {
            query.put("Mechanism", request.mechanism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSaslUser"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSaslUserResponse());
    }

    public DeleteSaslUserResponse deleteSaslUser(DeleteSaslUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSaslUserWithOptions(request, runtime);
    }

    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTopic"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTopicResponse());
    }

    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    public DescribeAclsResponse describeAclsWithOptions(DescribeAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclOperationType)) {
            query.put("AclOperationType", request.aclOperationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPermissionType)) {
            query.put("AclPermissionType", request.aclPermissionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceName)) {
            query.put("AclResourceName", request.aclResourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourcePatternType)) {
            query.put("AclResourcePatternType", request.aclResourcePatternType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclResourceType)) {
            query.put("AclResourceType", request.aclResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAcls"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclsResponse());
    }

    public DescribeAclsResponse describeAcls(DescribeAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclsWithOptions(request, runtime);
    }

    public DescribeSaslUsersResponse describeSaslUsersWithOptions(DescribeSaslUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSaslUsers"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSaslUsersResponse());
    }

    public DescribeSaslUsersResponse describeSaslUsers(DescribeSaslUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSaslUsersWithOptions(request, runtime);
    }

    public EnableAutoGroupCreationResponse enableAutoGroupCreationWithOptions(EnableAutoGroupCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoGroupCreation"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoGroupCreationResponse());
    }

    public EnableAutoGroupCreationResponse enableAutoGroupCreation(EnableAutoGroupCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoGroupCreationWithOptions(request, runtime);
    }

    public EnableAutoTopicCreationResponse enableAutoTopicCreationWithOptions(EnableAutoTopicCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoTopicCreation"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoTopicCreationResponse());
    }

    public EnableAutoTopicCreationResponse enableAutoTopicCreation(EnableAutoTopicCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoTopicCreationWithOptions(request, runtime);
    }

    public GetAllInstanceIdListResponse getAllInstanceIdListWithOptions(GetAllInstanceIdListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllInstanceIdList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllInstanceIdListResponse());
    }

    public GetAllInstanceIdListResponse getAllInstanceIdList(GetAllInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllInstanceIdListWithOptions(request, runtime);
    }

    public GetAllowedIpListResponse getAllowedIpListWithOptions(GetAllowedIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllowedIpList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllowedIpListResponse());
    }

    public GetAllowedIpListResponse getAllowedIpList(GetAllowedIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllowedIpListWithOptions(request, runtime);
    }

    public GetConsumerListResponse getConsumerListWithOptions(GetConsumerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerListResponse());
    }

    public GetConsumerListResponse getConsumerList(GetConsumerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumerListWithOptions(request, runtime);
    }

    public GetConsumerProgressResponse getConsumerProgressWithOptions(GetConsumerProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumerProgress"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConsumerProgressResponse());
    }

    public GetConsumerProgressResponse getConsumerProgress(GetConsumerProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsumerProgressWithOptions(request, runtime);
    }

    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            query.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public GetQuotaTipResponse getQuotaTipWithOptions(GetQuotaTipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaTip"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaTipResponse());
    }

    public GetQuotaTipResponse getQuotaTip(GetQuotaTipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQuotaTipWithOptions(request, runtime);
    }

    public GetTopicListResponse getTopicListWithOptions(GetTopicListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicList"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicListResponse());
    }

    public GetTopicListResponse getTopicList(GetTopicListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicListWithOptions(request, runtime);
    }

    public GetTopicStatusResponse getTopicStatusWithOptions(GetTopicStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicStatus"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicStatusResponse());
    }

    public GetTopicStatusResponse getTopicStatus(GetTopicStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicStatusWithOptions(request, runtime);
    }

    public GetTopicSubscribeStatusResponse getTopicSubscribeStatusWithOptions(GetTopicSubscribeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTopicSubscribeStatus"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTopicSubscribeStatusResponse());
    }

    public GetTopicSubscribeStatusResponse getTopicSubscribeStatus(GetTopicSubscribeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicSubscribeStatusWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-09-16"),
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

    public ModifyInstanceNameResponse modifyInstanceNameWithOptions(ModifyInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceName"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceNameResponse());
    }

    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceNameWithOptions(request, runtime);
    }

    public ModifyPartitionNumResponse modifyPartitionNumWithOptions(ModifyPartitionNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addPartitionNum)) {
            query.put("AddPartitionNum", request.addPartitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPartitionNum"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPartitionNumResponse());
    }

    public ModifyPartitionNumResponse modifyPartitionNum(ModifyPartitionNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPartitionNumWithOptions(request, runtime);
    }

    public ModifyTopicRemarkResponse modifyTopicRemarkWithOptions(ModifyTopicRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTopicRemark"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTopicRemarkResponse());
    }

    public ModifyTopicRemarkResponse modifyTopicRemark(ModifyTopicRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTopicRemarkWithOptions(request, runtime);
    }

    public QueryMessageResponse queryMessageWithOptions(QueryMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessage"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageResponse());
    }

    public QueryMessageResponse queryMessage(QueryMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessageWithOptions(request, runtime);
    }

    /**
      * You cannot call this operation to release a subscription Message Queue for Apache Kafka instance.
      *
      * @param request ReleaseInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDeleteInstance)) {
            query.put("ForceDeleteInstance", request.forceDeleteInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
      * You cannot call this operation to release a subscription Message Queue for Apache Kafka instance.
      *
      * @param request ReleaseInstanceRequest
      * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
      * You can call this operation only if your instance is in the Stopped state.
      *
      * @param request ReopenInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ReopenInstanceResponse
     */
    public ReopenInstanceResponse reopenInstanceWithOptions(ReopenInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReopenInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReopenInstanceResponse());
    }

    /**
      * You can call this operation only if your instance is in the Stopped state.
      *
      * @param request ReopenInstanceRequest
      * @return ReopenInstanceResponse
     */
    public ReopenInstanceResponse reopenInstance(ReopenInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reopenInstanceWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation up to twice per second.
      *
      * @param request StartInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crossZone)) {
            query.put("CrossZone", request.crossZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployModule)) {
            query.put("DeployModule", request.deployModule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEipInner)) {
            query.put("IsEipInner", request.isEipInner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isForceSelectedZones)) {
            query.put("IsForceSelectedZones", request.isForceSelectedZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSetUserAndPassword)) {
            query.put("IsSetUserAndPassword", request.isSetUserAndPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.KMSKeyId)) {
            query.put("KMSKeyId", request.KMSKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifier)) {
            query.put("Notifier", request.notifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroup)) {
            query.put("SecurityGroup", request.securityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedZones)) {
            query.put("SelectedZones", request.selectedZones);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPhoneNum)) {
            query.put("UserPhoneNum", request.userPhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
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
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
      * >  You can call this operation up to twice per second.
      *
      * @param request StartInstanceRequest
      * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
      * You cannot stop a subscription ApsaraMQ for Kafka instance. If you want to stop a subscription ApsaraMQ for Kafka instance, submit a ticket.
      *
      * @param request StopInstanceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
      * You cannot stop a subscription ApsaraMQ for Kafka instance. If you want to stop a subscription ApsaraMQ for Kafka instance, submit a ticket.
      *
      * @param request StopInstanceRequest
      * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-09-16"),
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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
            new TeaPair("version", "2019-09-16"),
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

    public UpdateAllowedIpResponse updateAllowedIpWithOptions(UpdateAllowedIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedListIp)) {
            query.put("AllowedListIp", request.allowedListIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowedListType)) {
            query.put("AllowedListType", request.allowedListType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            query.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAllowedIp"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAllowedIpResponse());
    }

    public UpdateAllowedIpResponse updateAllowedIp(UpdateAllowedIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAllowedIpWithOptions(request, runtime);
    }

    /**
      * You can call this operation to reset the consumer offset of a specific consumer group. You can use the timestamp or offset parameter to reset the consumer offset of a consumer group. You can implement the following features by configuring a combination of different parameters:
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to the latest offset. This way, you can consume messages in the topics from the latest offset.
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to a specific point in time. This way, you can consume messages in the topics from the specified point in time.
      * *   Reset the consumer offset of one subscribed topic of a consumer group to a specific offset in a specific partition. This way, you can consume messages from the specified offset in the specified partition.
      *
      * @param tmpReq UpdateConsumerOffsetRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateConsumerOffsetResponse
     */
    public UpdateConsumerOffsetResponse updateConsumerOffsetWithOptions(UpdateConsumerOffsetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConsumerOffsetShrinkRequest request = new UpdateConsumerOffsetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.offsets)) {
            request.offsetsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.offsets, "Offsets", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetsShrink)) {
            query.put("Offsets", request.offsetsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerOffset"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConsumerOffsetResponse());
    }

    /**
      * You can call this operation to reset the consumer offset of a specific consumer group. You can use the timestamp or offset parameter to reset the consumer offset of a consumer group. You can implement the following features by configuring a combination of different parameters:
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to the latest offset. This way, you can consume messages in the topics from the latest offset.
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to a specific point in time. This way, you can consume messages in the topics from the specified point in time.
      * *   Reset the consumer offset of one subscribed topic of a consumer group to a specific offset in a specific partition. This way, you can consume messages from the specified offset in the specified partition.
      *
      * @param request UpdateConsumerOffsetRequest
      * @return UpdateConsumerOffsetResponse
     */
    public UpdateConsumerOffsetResponse updateConsumerOffset(UpdateConsumerOffsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConsumerOffsetWithOptions(request, runtime);
    }

    /**
      * ## **Permissions**
      * If a RAM user wants to call the **UpdateInstanceConfig** operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpdateInstanceConfig|alikafka: UpdateInstance|acs:alikafka:*:*:{instanceId}|
      *
      * @param request UpdateInstanceConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfigWithOptions(UpdateInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceConfig"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceConfigResponse());
    }

    /**
      * ## **Permissions**
      * If a RAM user wants to call the **UpdateInstanceConfig** operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpdateInstanceConfig|alikafka: UpdateInstance|acs:alikafka:*:*:{instanceId}|
      *
      * @param request UpdateInstanceConfigRequest
      * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfig(UpdateInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceConfigWithOptions(request, runtime);
    }

    public UpdateTopicConfigResponse updateTopicConfigWithOptions(UpdateTopicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTopicConfig"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTopicConfigResponse());
    }

    public UpdateTopicConfigResponse updateTopicConfig(UpdateTopicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTopicConfigWithOptions(request, runtime);
    }

    /**
      * ## **Permissions**
      * A RAM user must be granted the required permissions before the RAM user calls the **UpgradeInstanceVersion** operation. For information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpgradeInstanceVersion|UpdateInstance|acs:alikafka:*:*:{instanceId}|
      * ## **QPS limits**
      * You can send a maximum of two queries per second (QPS).
      *
      * @param request UpgradeInstanceVersionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVersion)) {
            query.put("TargetVersion", request.targetVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeInstanceVersion"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeInstanceVersionResponse());
    }

    /**
      * ## **Permissions**
      * A RAM user must be granted the required permissions before the RAM user calls the **UpgradeInstanceVersion** operation. For information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpgradeInstanceVersion|UpdateInstance|acs:alikafka:*:*:{instanceId}|
      * ## **QPS limits**
      * You can send a maximum of two queries per second (QPS).
      *
      * @param request UpgradeInstanceVersionRequest
      * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
      * @param tmpReq UpgradePostPayOrderRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradePostPayOrderResponse
     */
    public UpgradePostPayOrderResponse upgradePostPayOrderWithOptions(UpgradePostPayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePostPayOrderShrinkRequest request = new UpgradePostPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverlessConfig)) {
            request.serverlessConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverlessConfig, "ServerlessConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessConfigShrink)) {
            query.put("ServerlessConfig", request.serverlessConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradePostPayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradePostPayOrderResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
      * @param request UpgradePostPayOrderRequest
      * @return UpgradePostPayOrderResponse
     */
    public UpgradePostPayOrderResponse upgradePostPayOrder(UpgradePostPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradePostPayOrderWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of subscription Message Queue for Apache Kafka instances. For more information, see [Billing overview](~~84737~~).
      *
      * @param tmpReq UpgradePrePayOrderRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpgradePrePayOrderResponse
     */
    public UpgradePrePayOrderResponse upgradePrePayOrderWithOptions(UpgradePrePayOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePrePayOrderShrinkRequest request = new UpgradePrePayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.confluentConfig)) {
            request.confluentConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.confluentConfig, "ConfluentConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confluentConfigShrink)) {
            query.put("ConfluentConfig", request.confluentConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipMax)) {
            query.put("EipMax", request.eipMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipModel)) {
            query.put("EipModel", request.eipModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMax)) {
            query.put("IoMax", request.ioMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioMaxSpec)) {
            query.put("IoMaxSpec", request.ioMaxSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paidType)) {
            query.put("PaidType", request.paidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNum)) {
            query.put("PartitionNum", request.partitionNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicQuota)) {
            query.put("TopicQuota", request.topicQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradePrePayOrder"),
            new TeaPair("version", "2019-09-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradePrePayOrderResponse());
    }

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of subscription Message Queue for Apache Kafka instances. For more information, see [Billing overview](~~84737~~).
      *
      * @param request UpgradePrePayOrderRequest
      * @return UpgradePrePayOrderResponse
     */
    public UpgradePrePayOrderResponse upgradePrePayOrder(UpgradePrePayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradePrePayOrderWithOptions(request, runtime);
    }
}
