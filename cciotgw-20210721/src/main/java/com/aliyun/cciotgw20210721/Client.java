// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721;

import com.aliyun.tea.*;
import com.aliyun.cciotgw20210721.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cciotgw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetIoTCloudConnectorGatewayResponse getIoTCloudConnectorGatewayWithOptions(GetIoTCloudConnectorGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIoTCloudConnectorGateway", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetIoTCloudConnectorGatewayResponse());
    }

    public GetIoTCloudConnectorGatewayResponse getIoTCloudConnectorGateway(GetIoTCloudConnectorGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIoTCloudConnectorGatewayWithOptions(request, runtime);
    }

    public AllocateIpsResponse allocateIpsWithOptions(AllocateIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateIps", "2021-07-21", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateIpsResponse());
    }

    public AllocateIpsResponse allocateIps(AllocateIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateIpsWithOptions(request, runtime);
    }

    public QueryAsynTokenResultResponse queryAsynTokenResultWithOptions(QueryAsynTokenResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAsynTokenResult", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new QueryAsynTokenResultResponse());
    }

    public QueryAsynTokenResultResponse queryAsynTokenResult(QueryAsynTokenResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAsynTokenResultWithOptions(request, runtime);
    }

    public GetIpStatusResponse getIpStatusWithOptions(GetIpStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpStatus", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetIpStatusResponse());
    }

    public GetIpStatusResponse getIpStatus(GetIpStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpStatusWithOptions(request, runtime);
    }

    public ModifyIpStatusResponse modifyIpStatusWithOptions(ModifyIpStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpStatus", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyIpStatusResponse());
    }

    public ModifyIpStatusResponse modifyIpStatus(ModifyIpStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpStatusWithOptions(request, runtime);
    }

    public GetFreeIpCountResponse getFreeIpCountWithOptions(GetFreeIpCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFreeIpCount", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new GetFreeIpCountResponse());
    }

    public GetFreeIpCountResponse getFreeIpCount(GetFreeIpCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeIpCountWithOptions(request, runtime);
    }

    public ListResultTokenUrlResponse listResultTokenUrlWithOptions(ListResultTokenUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResultTokenUrl", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListResultTokenUrlResponse());
    }

    public ListResultTokenUrlResponse listResultTokenUrl(ListResultTokenUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResultTokenUrlWithOptions(request, runtime);
    }

    public ListGreInterfacesResponse listGreInterfacesWithOptions(ListGreInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGreInterfaces", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListGreInterfacesResponse());
    }

    public ListGreInterfacesResponse listGreInterfaces(ListGreInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGreInterfacesWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorGatewaysResponse listIoTCloudConnectorGatewaysWithOptions(ListIoTCloudConnectorGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIoTCloudConnectorGateways", "2021-07-21", "HTTPS", "GET", "AK", "json", req, runtime), new ListIoTCloudConnectorGatewaysResponse());
    }

    public ListIoTCloudConnectorGatewaysResponse listIoTCloudConnectorGateways(ListIoTCloudConnectorGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorGatewaysWithOptions(request, runtime);
    }
}
