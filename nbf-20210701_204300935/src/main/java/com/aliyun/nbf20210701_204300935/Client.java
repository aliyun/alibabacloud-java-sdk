// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935;

import com.aliyun.tea.*;
import com.aliyun.nbf20210701_204300935.models.*;
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

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse ascpPurchasingConsignOrderReceivedFinishedErpSpiWithOptions(AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpPurchasingConsignOrderReceivedFinishedErpSpi", "2021-07-01_20-43-00-935", "HTTP", "POST", "AK", "json", req, runtime), new AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse());
    }

    public AscpPurchasingConsignOrderReceivedFinishedErpSpiResponse ascpPurchasingConsignOrderReceivedFinishedErpSpi(AscpPurchasingConsignOrderReceivedFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpPurchasingConsignOrderReceivedFinishedErpSpiWithOptions(request, runtime);
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse ascpPurchasingPurchaseOrderCancelledErpSpiWithOptions(AscpPurchasingPurchaseOrderCancelledErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpPurchasingPurchaseOrderCancelledErpSpi", "2021-07-01_20-43-00-935", "HTTP", "POST", "AK", "json", req, runtime), new AscpPurchasingPurchaseOrderCancelledErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse ascpPurchasingPurchaseOrderCancelledErpSpi(AscpPurchasingPurchaseOrderCancelledErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpPurchasingPurchaseOrderCancelledErpSpiWithOptions(request, runtime);
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse ascpPurchasingPurchaseOrderCreatedErpSpiWithOptions(AscpPurchasingPurchaseOrderCreatedErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpPurchasingPurchaseOrderCreatedErpSpi", "2021-07-01_20-43-00-935", "HTTP", "POST", "AK", "json", req, runtime), new AscpPurchasingPurchaseOrderCreatedErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse ascpPurchasingPurchaseOrderCreatedErpSpi(AscpPurchasingPurchaseOrderCreatedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpPurchasingPurchaseOrderCreatedErpSpiWithOptions(request, runtime);
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse ascpPurchasingPurchaseOrderReceivedFinishedErpSpiWithOptions(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AscpPurchasingPurchaseOrderReceivedFinishedErpSpi", "2021-07-01_20-43-00-935", "HTTP", "POST", "AK", "json", req, runtime), new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse ascpPurchasingPurchaseOrderReceivedFinishedErpSpi(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ascpPurchasingPurchaseOrderReceivedFinishedErpSpiWithOptions(request, runtime);
    }
}
