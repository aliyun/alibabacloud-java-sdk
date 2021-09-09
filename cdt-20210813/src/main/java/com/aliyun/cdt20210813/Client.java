// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813;

import com.aliyun.tea.*;
import com.aliyun.cdt20210813.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cdt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetCdtServiceStatusResponse getCdtServiceStatusWithOptions(GetCdtServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCdtServiceStatus", "2021-08-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetCdtServiceStatusResponse());
    }

    public GetCdtServiceStatusResponse getCdtServiceStatus(GetCdtServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCdtServiceStatusWithOptions(request, runtime);
    }

    public OpenCdtServiceResponse openCdtServiceWithOptions(OpenCdtServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenCdtService", "2021-08-13", "HTTPS", "POST", "AK", "json", req, runtime), new OpenCdtServiceResponse());
    }

    public OpenCdtServiceResponse openCdtService(OpenCdtServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openCdtServiceWithOptions(request, runtime);
    }

    public GetCdtCbServiceStatusResponse getCdtCbServiceStatusWithOptions(GetCdtCbServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCdtCbServiceStatus", "2021-08-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetCdtCbServiceStatusResponse());
    }

    public GetCdtCbServiceStatusResponse getCdtCbServiceStatus(GetCdtCbServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCdtCbServiceStatusWithOptions(request, runtime);
    }

    public OpenCdtCbServiceResponse openCdtCbServiceWithOptions(OpenCdtCbServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenCdtCbService", "2021-08-13", "HTTPS", "POST", "AK", "json", req, runtime), new OpenCdtCbServiceResponse());
    }

    public OpenCdtCbServiceResponse openCdtCbService(OpenCdtCbServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openCdtCbServiceWithOptions(request, runtime);
    }
}
