// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015;

import com.aliyun.tea.*;
import com.aliyun.alikafka20181015.models.*;
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

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConsumerGroup", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateTopicResponse createTopicWithOptions(CreateTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTopic", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTopicResponse());
    }

    public CreateTopicResponse createTopic(CreateTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTopicWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConsumerGroup", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public DeleteTopicResponse deleteTopicWithOptions(DeleteTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTopic", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTopicResponse());
    }

    public DeleteTopicResponse deleteTopic(DeleteTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTopicWithOptions(request, runtime);
    }

    public GetConsumerListResponse getConsumerListWithOptions(GetConsumerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConsumerList", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetConsumerListResponse());
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
        return TeaModel.toModel(this.doRPCRequest("GetConsumerProgress", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetConsumerProgressResponse());
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
        return TeaModel.toModel(this.doRPCRequest("GetInstanceList", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public GetTopicListResponse getTopicListWithOptions(GetTopicListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTopicList", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTopicListResponse());
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
        return TeaModel.toModel(this.doRPCRequest("GetTopicStatus", "2018-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTopicStatusResponse());
    }

    public GetTopicStatusResponse getTopicStatus(GetTopicStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTopicStatusWithOptions(request, runtime);
    }
}
