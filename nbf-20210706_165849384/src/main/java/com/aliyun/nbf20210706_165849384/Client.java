// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384;

import com.aliyun.tea.*;
import com.aliyun.nbf20210706_165849384.models.*;
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

    public AscpAppointOrderCancelledErpSpiResponse ascpAppointOrderCancelledErpSpi(AscpAppointOrderCancelledErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpAppointOrderCancelledErpSpiWithOptions(request, headers, runtime);
    }

    public AscpAppointOrderCancelledErpSpiResponse ascpAppointOrderCancelledErpSpiWithOptions(AscpAppointOrderCancelledErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fulfilmentOrderCode)) {
            body.put("fulfilmentOrderCode", request.fulfilmentOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderCode)) {
            body.put("outOrderCode", request.outOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointOrderCode)) {
            body.put("appointOrderCode", request.appointOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBusinessOrderCode)) {
            body.put("outBusinessOrderCode", request.outBusinessOrderCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AscpAppointOrderCancelledErpSpi", "2021-07-06_16-58-49-384", "HTTP", "POST", "AK", "/ascpAppointOrderCancelledErpSpi", "json", req, runtime), new AscpAppointOrderCancelledErpSpiResponse());
    }

    public AscpAppointOrderCreatedErpSpiResponse ascpAppointOrderCreatedErpSpi(AscpAppointOrderCreatedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpAppointOrderCreatedErpSpiWithOptions(request, headers, runtime);
    }

    public AscpAppointOrderCreatedErpSpiResponse ascpAppointOrderCreatedErpSpiWithOptions(AscpAppointOrderCreatedErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("orderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityCode)) {
            body.put("entityCode", request.entityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationName)) {
            body.put("relationName", request.relationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realSupplierNick)) {
            body.put("realSupplierNick", request.realSupplierNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            body.put("entityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationCode)) {
            body.put("relationCode", request.relationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderCode)) {
            body.put("outOrderCode", request.outOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundType)) {
            body.put("inboundType", request.inboundType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointOrderCode)) {
            body.put("appointOrderCode", request.appointOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBusinessOrderCode)) {
            body.put("outBusinessOrderCode", request.outBusinessOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("memberId", request.memberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AscpAppointOrderCreatedErpSpi", "2021-07-06_16-58-49-384", "HTTP", "POST", "AK", "/ascpAppointOrderCreatedErpSpi", "json", req, runtime), new AscpAppointOrderCreatedErpSpiResponse());
    }

    public AscpAppointOrderDoFinishedErpSpiResponse ascpAppointOrderDoFinishedErpSpi(AscpAppointOrderDoFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpAppointOrderDoFinishedErpSpiWithOptions(request, headers, runtime);
    }

    public AscpAppointOrderDoFinishedErpSpiResponse ascpAppointOrderDoFinishedErpSpiWithOptions(AscpAppointOrderDoFinishedErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appointWave)) {
            body.put("appointWave", request.appointWave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointType)) {
            body.put("appointType", request.appointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseAddress)) {
            body.put("warehouseAddress", request.warehouseAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalAppointWave)) {
            body.put("originalAppointWave", request.originalAppointWave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fulfilmentOrderCode)) {
            body.put("fulfilmentOrderCode", request.fulfilmentOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderCode)) {
            body.put("outOrderCode", request.outOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warehouseType)) {
            body.put("warehouseType", request.warehouseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalAppointDate)) {
            body.put("originalAppointDate", request.originalAppointDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointDate)) {
            body.put("appointDate", request.appointDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appointOrderCode)) {
            body.put("appointOrderCode", request.appointOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBusinessOrderCode)) {
            body.put("outBusinessOrderCode", request.outBusinessOrderCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AscpAppointOrderDoFinishedErpSpi", "2021-07-06_16-58-49-384", "HTTPS", "POST", "AK", "/ascpAppointOrderDoFinishedErpSpi", "json", req, runtime), new AscpAppointOrderDoFinishedErpSpiResponse());
    }
}
