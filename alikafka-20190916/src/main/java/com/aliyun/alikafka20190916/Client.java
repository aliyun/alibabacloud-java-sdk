// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916;

import com.aliyun.tea.*;
import com.aliyun.alikafka20190916.models.*;
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
            new TeaPair("ap-northeast-2-pop", "alikafka.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "alikafka.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "alikafka.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-edge-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-fujian", "alikafka.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "alikafka.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "alikafka.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-wuhan", "alikafka.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "alikafka.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "alikafka.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "alikafka.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "alikafka.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "alikafka.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "alikafka.aliyuncs.com"),
            new TeaPair("me-east-1", "alikafka.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "alikafka.aliyuncs.com")
        );
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

    public ConvertPostPayOrderResponse convertPostPayOrderWithOptions(ConvertPostPayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertPostPayOrder", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertPostPayOrderResponse());
    }

    public ConvertPostPayOrderResponse convertPostPayOrder(ConvertPostPayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertPostPayOrderWithOptions(request, runtime);
    }

    public CreateAclResponse createAclWithOptions(CreateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAcl", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAclResponse());
    }

    public CreateAclResponse createAcl(CreateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAclWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConsumerGroup", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreatePostPayOrderResponse createPostPayOrderWithOptions(CreatePostPayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePostPayOrder", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePostPayOrderResponse());
    }

    public CreatePostPayOrderResponse createPostPayOrder(CreatePostPayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPostPayOrderWithOptions(request, runtime);
    }

    public CreatePrePayOrderResponse createPrePayOrderWithOptions(CreatePrePayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePrePayOrder", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePrePayOrderResponse());
    }

    public CreatePrePayOrderResponse createPrePayOrder(CreatePrePayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPrePayOrderWithOptions(request, runtime);
    }

    public CreateSaslUserResponse createSaslUserWithOptions(CreateSaslUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSaslUser", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSaslUserResponse());
    }

    public CreateSaslUserResponse createSaslUser(CreateSaslUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSaslUserWithOptions(request, runtime);
    }

    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTopic", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTopicResponse());
    }

    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    public DeleteAclResponse deleteAclWithOptions(DeleteAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAcl", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAclResponse());
    }

    public DeleteAclResponse deleteAcl(DeleteAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAclWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConsumerGroup", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteSaslUserResponse deleteSaslUserWithOptions(DeleteSaslUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSaslUser", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSaslUserResponse());
    }

    public DeleteSaslUserResponse deleteSaslUser(DeleteSaslUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSaslUserWithOptions(request, runtime);
    }

    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTopic", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTopicResponse());
    }

    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    public DescribeAclsResponse describeAclsWithOptions(DescribeAclsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAcls", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAclsResponse());
    }

    public DescribeAclsResponse describeAcls(DescribeAclsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAclsWithOptions(request, runtime);
    }

    public DescribeNodeStatusResponse describeNodeStatusWithOptions(DescribeNodeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNodeStatus", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNodeStatusResponse());
    }

    public DescribeNodeStatusResponse describeNodeStatus(DescribeNodeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNodeStatusWithOptions(request, runtime);
    }

    public DescribeSaslUsersResponse describeSaslUsersWithOptions(DescribeSaslUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSaslUsers", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSaslUsersResponse());
    }

    public DescribeSaslUsersResponse describeSaslUsers(DescribeSaslUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSaslUsersWithOptions(request, runtime);
    }

    public GetAllowedIpListResponse getAllowedIpListWithOptions(GetAllowedIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllowedIpList", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllowedIpListResponse());
    }

    public GetAllowedIpListResponse getAllowedIpList(GetAllowedIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllowedIpListWithOptions(request, runtime);
    }

    public GetConsumerListResponse getConsumerListWithOptions(GetConsumerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConsumerList", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetConsumerListResponse());
    }

    public GetConsumerListResponse getConsumerList(GetConsumerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConsumerListWithOptions(request, runtime);
    }

    public GetConsumerProgressResponse getConsumerProgressWithOptions(GetConsumerProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConsumerProgress", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetConsumerProgressResponse());
    }

    public GetConsumerProgressResponse getConsumerProgress(GetConsumerProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConsumerProgressWithOptions(request, runtime);
    }

    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceList", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public GetMetaProductListResponse getMetaProductListWithOptions(GetMetaProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetaProductList", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetMetaProductListResponse());
    }

    public GetMetaProductListResponse getMetaProductList(GetMetaProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetaProductListWithOptions(request, runtime);
    }

    public GetTopicListResponse getTopicListWithOptions(GetTopicListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTopicList", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetTopicListResponse());
    }

    public GetTopicListResponse getTopicList(GetTopicListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTopicListWithOptions(request, runtime);
    }

    public GetTopicStatusResponse getTopicStatusWithOptions(GetTopicStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTopicStatus", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetTopicStatusResponse());
    }

    public GetTopicStatusResponse getTopicStatus(GetTopicStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTopicStatusWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyInstanceNameResponse modifyInstanceNameWithOptions(ModifyInstanceNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceName", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceNameResponse());
    }

    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceNameWithOptions(request, runtime);
    }

    public ModifyPartitionNumResponse modifyPartitionNumWithOptions(ModifyPartitionNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPartitionNum", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPartitionNumResponse());
    }

    public ModifyPartitionNumResponse modifyPartitionNum(ModifyPartitionNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPartitionNumWithOptions(request, runtime);
    }

    public ModifyTopicRemarkResponse modifyTopicRemarkWithOptions(ModifyTopicRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTopicRemark", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTopicRemarkResponse());
    }

    public ModifyTopicRemarkResponse modifyTopicRemark(ModifyTopicRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTopicRemarkWithOptions(request, runtime);
    }

    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseInstance", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseInstanceResponse());
    }

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
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
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateAllowedIpResponse updateAllowedIpWithOptions(UpdateAllowedIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAllowedIp", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAllowedIpResponse());
    }

    public UpdateAllowedIpResponse updateAllowedIp(UpdateAllowedIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAllowedIpWithOptions(request, runtime);
    }

    public UpdateInstanceConfigResponse updateInstanceConfigWithOptions(UpdateInstanceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstanceConfig", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceConfigResponse());
    }

    public UpdateInstanceConfigResponse updateInstanceConfig(UpdateInstanceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceConfigWithOptions(request, runtime);
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeInstanceVersion", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeInstanceVersionResponse());
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    public UpgradePostPayOrderResponse upgradePostPayOrderWithOptions(UpgradePostPayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradePostPayOrder", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradePostPayOrderResponse());
    }

    public UpgradePostPayOrderResponse upgradePostPayOrder(UpgradePostPayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradePostPayOrderWithOptions(request, runtime);
    }

    public UpgradePrePayOrderResponse upgradePrePayOrderWithOptions(UpgradePrePayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradePrePayOrder", "2019-09-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradePrePayOrderResponse());
    }

    public UpgradePrePayOrderResponse upgradePrePayOrder(UpgradePrePayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradePrePayOrderWithOptions(request, runtime);
    }
}
