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

    public AddCloudConnectorGatewayPrivilegeResponse addCloudConnectorGatewayPrivilegeWithOptions(AddCloudConnectorGatewayPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorGatewayId", request.ioTCloudConnectorGatewayId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        query.put("UserAliUid", request.userAliUid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCloudConnectorGatewayPrivilege"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCloudConnectorGatewayPrivilegeResponse());
    }

    public AddCloudConnectorGatewayPrivilegeResponse addCloudConnectorGatewayPrivilege(AddCloudConnectorGatewayPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCloudConnectorGatewayPrivilegeWithOptions(request, runtime);
    }

    public AddIpToConnectionPoolFromExcelResponse addIpToConnectionPoolFromExcelWithOptions(AddIpToConnectionPoolFromExcelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIpToConnectionPoolFromExcel"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIpToConnectionPoolFromExcelResponse());
    }

    public AddIpToConnectionPoolFromExcelResponse addIpToConnectionPoolFromExcel(AddIpToConnectionPoolFromExcelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIpToConnectionPoolFromExcelWithOptions(request, runtime);
    }

    public AllocateIpsResponse allocateIpsWithOptions(AllocateIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Apn", request.apn);
        query.put("CciotGwId", request.cciotGwId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IpCount", request.ipCount);
        query.put("Ips", request.ips);
        query.put("Isp", request.isp);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateIps"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateIpsResponse());
    }

    public AllocateIpsResponse allocateIps(AllocateIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateIpsWithOptions(request, runtime);
    }

    public AssociateIccidToIpResponse associateIccidToIpWithOptions(AssociateIccidToIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateIccidToIp"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateIccidToIpResponse());
    }

    public AssociateIccidToIpResponse associateIccidToIp(AssociateIccidToIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateIccidToIpWithOptions(request, runtime);
    }

    public AssociateIccidToIpExcelResponse associateIccidToIpExcelWithOptions(AssociateIccidToIpExcelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateIccidToIpExcel"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateIccidToIpExcelResponse());
    }

    public AssociateIccidToIpExcelResponse associateIccidToIpExcel(AssociateIccidToIpExcelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateIccidToIpExcelWithOptions(request, runtime);
    }

    public DeleteCloudConnectorGatewayPrivilegeResponse deleteCloudConnectorGatewayPrivilegeWithOptions(DeleteCloudConnectorGatewayPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorGatewayId", request.ioTCloudConnectorGatewayId);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        query.put("UserAliUid", request.userAliUid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudConnectorGatewayPrivilege"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudConnectorGatewayPrivilegeResponse());
    }

    public DeleteCloudConnectorGatewayPrivilegeResponse deleteCloudConnectorGatewayPrivilege(DeleteCloudConnectorGatewayPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCloudConnectorGatewayPrivilegeWithOptions(request, runtime);
    }

    public GetFreeIpCountResponse getFreeIpCountWithOptions(GetFreeIpCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeIpCount"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeIpCountResponse());
    }

    public GetFreeIpCountResponse getFreeIpCount(GetFreeIpCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeIpCountWithOptions(request, runtime);
    }

    public GetIccidAndIpResponse getIccidAndIpWithOptions(GetIccidAndIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIccidAndIp"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIccidAndIpResponse());
    }

    public GetIccidAndIpResponse getIccidAndIp(GetIccidAndIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIccidAndIpWithOptions(request, runtime);
    }

    public GetIoTCloudConnectorGatewayResponse getIoTCloudConnectorGatewayWithOptions(GetIoTCloudConnectorGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIoTCloudConnectorGateway"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIoTCloudConnectorGatewayResponse());
    }

    public GetIoTCloudConnectorGatewayResponse getIoTCloudConnectorGateway(GetIoTCloudConnectorGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIoTCloudConnectorGatewayWithOptions(request, runtime);
    }

    public GetIpStatusResponse getIpStatusWithOptions(GetIpStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIpStatus"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIpStatusResponse());
    }

    public GetIpStatusResponse getIpStatus(GetIpStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpStatusWithOptions(request, runtime);
    }

    public ListCloudConnectorGatewayPrivilegeResponse listCloudConnectorGatewayPrivilegeWithOptions(ListCloudConnectorGatewayPrivilegeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudConnectorGatewayPrivilege"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudConnectorGatewayPrivilegeResponse());
    }

    public ListCloudConnectorGatewayPrivilegeResponse listCloudConnectorGatewayPrivilege(ListCloudConnectorGatewayPrivilegeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCloudConnectorGatewayPrivilegeWithOptions(request, runtime);
    }

    public ListConnectionPoolIpResponse listConnectionPoolIpWithOptions(ListConnectionPoolIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectionPoolIp"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionPoolIpResponse());
    }

    public ListConnectionPoolIpResponse listConnectionPoolIp(ListConnectionPoolIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoolIpWithOptions(request, runtime);
    }

    public ListGreInterfacesResponse listGreInterfacesWithOptions(ListGreInterfacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGreInterfaces"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGreInterfacesResponse());
    }

    public ListGreInterfacesResponse listGreInterfaces(ListGreInterfacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGreInterfacesWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorGatewaysResponse listIoTCloudConnectorGatewaysWithOptions(ListIoTCloudConnectorGatewaysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectorGateways"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorGatewaysResponse());
    }

    public ListIoTCloudConnectorGatewaysResponse listIoTCloudConnectorGateways(ListIoTCloudConnectorGatewaysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorGatewaysWithOptions(request, runtime);
    }

    public ListResultTokenUrlResponse listResultTokenUrlWithOptions(ListResultTokenUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResultTokenUrl"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResultTokenUrlResponse());
    }

    public ListResultTokenUrlResponse listResultTokenUrl(ListResultTokenUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResultTokenUrlWithOptions(request, runtime);
    }

    public ModifyIpStatusResponse modifyIpStatusWithOptions(ModifyIpStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpStatus"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpStatusResponse());
    }

    public ModifyIpStatusResponse modifyIpStatus(ModifyIpStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpStatusWithOptions(request, runtime);
    }

    public QueryAsynTokenResultResponse queryAsynTokenResultWithOptions(QueryAsynTokenResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAsynTokenResult"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAsynTokenResultResponse());
    }

    public QueryAsynTokenResultResponse queryAsynTokenResult(QueryAsynTokenResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAsynTokenResultWithOptions(request, runtime);
    }

    public UnAssociateIccidToIpResponse unAssociateIccidToIpWithOptions(UnAssociateIccidToIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAssociateIccidToIp"),
            new TeaPair("version", "2021-07-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnAssociateIccidToIpResponse());
    }

    public UnAssociateIccidToIpResponse unAssociateIccidToIp(UnAssociateIccidToIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unAssociateIccidToIpWithOptions(request, runtime);
    }
}
