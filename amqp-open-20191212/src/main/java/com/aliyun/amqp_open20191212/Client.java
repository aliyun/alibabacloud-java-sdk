// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212;

import com.aliyun.tea.*;
import com.aliyun.amqp_open20191212.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("amqp-open", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateBindingResponse createBindingWithOptions(CreateBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBinding", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBindingResponse());
    }

    public CreateBindingResponse createBinding(CreateBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBindingWithOptions(request, runtime);
    }

    public CreateExchangeResponse createExchangeWithOptions(CreateExchangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateExchange", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateExchangeResponse());
    }

    public CreateExchangeResponse createExchange(CreateExchangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createExchangeWithOptions(request, runtime);
    }

    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQueue", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQueueResponse());
    }

    public CreateQueueResponse createQueue(CreateQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQueueWithOptions(request, runtime);
    }

    public CreateVirtualHostResponse createVirtualHostWithOptions(CreateVirtualHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVirtualHost", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVirtualHostResponse());
    }

    public CreateVirtualHostResponse createVirtualHost(CreateVirtualHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualHostWithOptions(request, runtime);
    }

    public DeleteBindingResponse deleteBindingWithOptions(DeleteBindingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBinding", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBindingResponse());
    }

    public DeleteBindingResponse deleteBinding(DeleteBindingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBindingWithOptions(request, runtime);
    }

    public DeleteExchangeResponse deleteExchangeWithOptions(DeleteExchangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExchange", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExchangeResponse());
    }

    public DeleteExchangeResponse deleteExchange(DeleteExchangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExchangeWithOptions(request, runtime);
    }

    public DeleteQueueResponse deleteQueueWithOptions(DeleteQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQueue", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQueueResponse());
    }

    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQueueWithOptions(request, runtime);
    }

    public DeleteVirtualHostResponse deleteVirtualHostWithOptions(DeleteVirtualHostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVirtualHost", "2019-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVirtualHostResponse());
    }

    public DeleteVirtualHostResponse deleteVirtualHost(DeleteVirtualHostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualHostWithOptions(request, runtime);
    }

    public GetMetadataAmountResponse getMetadataAmountWithOptions(GetMetadataAmountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetadataAmount", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new GetMetadataAmountResponse());
    }

    public GetMetadataAmountResponse getMetadataAmount(GetMetadataAmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetadataAmountWithOptions(request, runtime);
    }

    public ListBindingsResponse listBindingsWithOptions(ListBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBindings", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListBindingsResponse());
    }

    public ListBindingsResponse listBindings(ListBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBindingsWithOptions(request, runtime);
    }

    public ListDownStreamBindingsResponse listDownStreamBindingsWithOptions(ListDownStreamBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDownStreamBindings", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListDownStreamBindingsResponse());
    }

    public ListDownStreamBindingsResponse listDownStreamBindings(ListDownStreamBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDownStreamBindingsWithOptions(request, runtime);
    }

    public ListExchangesResponse listExchangesWithOptions(ListExchangesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExchanges", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListExchangesResponse());
    }

    public ListExchangesResponse listExchanges(ListExchangesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExchangesWithOptions(request, runtime);
    }

    public ListExchangeUpStreamBindingsResponse listExchangeUpStreamBindingsWithOptions(ListExchangeUpStreamBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExchangeUpStreamBindings", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListExchangeUpStreamBindingsResponse());
    }

    public ListExchangeUpStreamBindingsResponse listExchangeUpStreamBindings(ListExchangeUpStreamBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExchangeUpStreamBindingsWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListQueueConsumersResponse listQueueConsumersWithOptions(ListQueueConsumersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQueueConsumers", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListQueueConsumersResponse());
    }

    public ListQueueConsumersResponse listQueueConsumers(ListQueueConsumersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQueueConsumersWithOptions(request, runtime);
    }

    public ListQueuesResponse listQueuesWithOptions(ListQueuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQueues", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListQueuesResponse());
    }

    public ListQueuesResponse listQueues(ListQueuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQueuesWithOptions(request, runtime);
    }

    public ListQueueUpStreamBindingsResponse listQueueUpStreamBindingsWithOptions(ListQueueUpStreamBindingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListQueueUpStreamBindings", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListQueueUpStreamBindingsResponse());
    }

    public ListQueueUpStreamBindingsResponse listQueueUpStreamBindings(ListQueueUpStreamBindingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listQueueUpStreamBindingsWithOptions(request, runtime);
    }

    public ListVirtualHostsResponse listVirtualHostsWithOptions(ListVirtualHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVirtualHosts", "2019-12-12", "HTTPS", "GET", "AK", "json", req, runtime), new ListVirtualHostsResponse());
    }

    public ListVirtualHostsResponse listVirtualHosts(ListVirtualHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVirtualHostsWithOptions(request, runtime);
    }
}
