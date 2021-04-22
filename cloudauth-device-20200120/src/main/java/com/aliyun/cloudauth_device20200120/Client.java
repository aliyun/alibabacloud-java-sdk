// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120;

import com.aliyun.tea.*;
import com.aliyun.cloudauth_device20200120.models.*;
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
        this._endpoint = this.getEndpoint("cloudauth-device", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ExecuteDeviceRiskResponse executeDeviceRiskWithOptions(ExecuteDeviceRiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteDeviceRiskShrinkRequest request = new ExecuteDeviceRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteDeviceRisk", "2020-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteDeviceRiskResponse());
    }

    public ExecuteDeviceRiskResponse executeDeviceRisk(ExecuteDeviceRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeDeviceRiskWithOptions(request, runtime);
    }

    public UploadDeviceInfoResponse uploadDeviceInfoWithOptions(UploadDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadDeviceInfo", "2020-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UploadDeviceInfoResponse());
    }

    public UploadDeviceInfoResponse uploadDeviceInfo(UploadDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadDeviceInfoWithOptions(request, runtime);
    }

    public UploadDeviceInfosResponse uploadDeviceInfosWithOptions(UploadDeviceInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadDeviceInfos", "2020-01-20", "HTTPS", "POST", "AK", "json", req, runtime), new UploadDeviceInfosResponse());
    }

    public UploadDeviceInfosResponse uploadDeviceInfos(UploadDeviceInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadDeviceInfosWithOptions(request, runtime);
    }
}
