// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601;

import com.aliyun.tea.*;
import com.aliyun.computenest20210601.models.*;
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
        this._endpoint = this.getEndpoint("computenest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ContinueDeployServiceInstanceResponse continueDeployServiceInstanceWithOptions(ContinueDeployServiceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ContinueDeployServiceInstance", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ContinueDeployServiceInstanceResponse());
    }

    public ContinueDeployServiceInstanceResponse continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continueDeployServiceInstanceWithOptions(request, runtime);
    }

    public CreateServiceInstanceResponse createServiceInstanceWithOptions(CreateServiceInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateServiceInstanceShrinkRequest request = new CreateServiceInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceInstance", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceInstanceResponse());
    }

    public CreateServiceInstanceResponse createServiceInstance(CreateServiceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceInstanceWithOptions(request, runtime);
    }

    public DeleteServiceInstancesResponse deleteServiceInstancesWithOptions(DeleteServiceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServiceInstances", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceInstancesResponse());
    }

    public DeleteServiceInstancesResponse deleteServiceInstances(DeleteServiceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceInstancesWithOptions(request, runtime);
    }

    public GetServiceInstanceResponse getServiceInstanceWithOptions(GetServiceInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceInstance", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceInstanceResponse());
    }

    public GetServiceInstanceResponse getServiceInstance(GetServiceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceInstanceWithOptions(request, runtime);
    }

    public ListServiceInstanceLogsResponse listServiceInstanceLogsWithOptions(ListServiceInstanceLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceInstanceLogs", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceInstanceLogsResponse());
    }

    public ListServiceInstanceLogsResponse listServiceInstanceLogs(ListServiceInstanceLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceInstanceLogsWithOptions(request, runtime);
    }

    public ListServiceInstanceResourcesResponse listServiceInstanceResourcesWithOptions(ListServiceInstanceResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceInstanceResources", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceInstanceResourcesResponse());
    }

    public ListServiceInstanceResourcesResponse listServiceInstanceResources(ListServiceInstanceResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceInstanceResourcesWithOptions(request, runtime);
    }

    public ListServiceInstancesResponse listServiceInstancesWithOptions(ListServiceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceInstances", "2021-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceInstancesResponse());
    }

    public ListServiceInstancesResponse listServiceInstances(ListServiceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceInstancesWithOptions(request, runtime);
    }
}
