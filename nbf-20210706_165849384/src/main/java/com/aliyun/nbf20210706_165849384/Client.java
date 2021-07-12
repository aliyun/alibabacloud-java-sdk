// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384;

import com.aliyun.tea.*;
import com.aliyun.nbf20210706_165849384.models.*;
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
        this._endpoint = this.getEndpoint("nbf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AscpAppointOrderCancelledErpSpiResponse ascpAppointOrderCancelledErpSpiWithOptions(AscpAppointOrderCancelledErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpAppointOrderCancelledErpSpi", "2021-07-06_16-58-49-384", "HTTP", "POST", "AK", "json", req, runtime), new AscpAppointOrderCancelledErpSpiResponse());
    }

    public AscpAppointOrderCancelledErpSpiResponse ascpAppointOrderCancelledErpSpi(AscpAppointOrderCancelledErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpAppointOrderCancelledErpSpiWithOptions(request, runtime);
    }

    public AscpAppointOrderCreatedErpSpiResponse ascpAppointOrderCreatedErpSpiWithOptions(AscpAppointOrderCreatedErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpAppointOrderCreatedErpSpi", "2021-07-06_16-58-49-384", "HTTP", "POST", "AK", "json", req, runtime), new AscpAppointOrderCreatedErpSpiResponse());
    }

    public AscpAppointOrderCreatedErpSpiResponse ascpAppointOrderCreatedErpSpi(AscpAppointOrderCreatedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpAppointOrderCreatedErpSpiWithOptions(request, runtime);
    }

    public AscpAppointOrderDoFinishedErpSpiResponse ascpAppointOrderDoFinishedErpSpiWithOptions(AscpAppointOrderDoFinishedErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpAppointOrderDoFinishedErpSpi", "2021-07-06_16-58-49-384", "HTTP", "POST", "AK", "json", req, runtime), new AscpAppointOrderDoFinishedErpSpiResponse());
    }

    public AscpAppointOrderDoFinishedErpSpiResponse ascpAppointOrderDoFinishedErpSpi(AscpAppointOrderDoFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpAppointOrderDoFinishedErpSpiWithOptions(request, runtime);
    }
}
