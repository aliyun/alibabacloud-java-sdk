// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_204300935;

import com.aliyun.tea.*;
import com.aliyun.nbf20210701_204300935.models.*;
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

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse ascpPurchasingInboundOrderReceivedFinishedErpSpi(AscpPurchasingInboundOrderReceivedFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpPurchasingInboundOrderReceivedFinishedErpSpiWithOptions(request, headers, runtime);
    }

    public AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse ascpPurchasingInboundOrderReceivedFinishedErpSpiWithOptions(AscpPurchasingInboundOrderReceivedFinishedErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consignOrderNo)) {
            body.put("consignOrderNo", request.consignOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extFields)) {
            body.put("extFields", request.extFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("gmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtReceiveFinish)) {
            body.put("gmtReceiveFinish", request.gmtReceiveFinish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundOrderNo)) {
            body.put("inboundOrderNo", request.inboundOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outInboundNo)) {
            body.put("outInboundNo", request.outInboundNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poType)) {
            body.put("poType", request.poType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderNo)) {
            body.put("purchaseOrderNo", request.purchaseOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderCode)) {
            body.put("sourceOrderCode", request.sourceOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.warehouse))) {
            body.put("warehouse", request.warehouse);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AscpPurchasingInboundOrderReceivedFinishedErpSpi"),
            new TeaPair("version", "2021-07-01_20-43-00-935"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ascpPurchasingInboundOrderReceivedFinishedErpSpi"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AscpPurchasingInboundOrderReceivedFinishedErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse ascpPurchasingPurchaseOrderCancelledErpSpi(AscpPurchasingPurchaseOrderCancelledErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpPurchasingPurchaseOrderCancelledErpSpiWithOptions(request, headers, runtime);
    }

    public AscpPurchasingPurchaseOrderCancelledErpSpiResponse ascpPurchasingPurchaseOrderCancelledErpSpiWithOptions(AscpPurchasingPurchaseOrderCancelledErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderNo)) {
            body.put("purchaseOrderNo", request.purchaseOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AscpPurchasingPurchaseOrderCancelledErpSpi"),
            new TeaPair("version", "2021-07-01_20-43-00-935"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ascpPurchasingPurchaseOrderCancelledErpSpi"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AscpPurchasingPurchaseOrderCancelledErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse ascpPurchasingPurchaseOrderCreatedErpSpi(AscpPurchasingPurchaseOrderCreatedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpPurchasingPurchaseOrderCreatedErpSpiWithOptions(request, headers, runtime);
    }

    public AscpPurchasingPurchaseOrderCreatedErpSpiResponse ascpPurchasingPurchaseOrderCreatedErpSpiWithOptions(AscpPurchasingPurchaseOrderCreatedErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contractCode)) {
            body.put("contractCode", request.contractCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractType)) {
            body.put("contractType", request.contractType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractVersion)) {
            body.put("contractVersion", request.contractVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectArriveTime)) {
            body.put("expectArriveTime", request.expectArriveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extFields)) {
            body.put("extFields", request.extFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullBulkFlag)) {
            body.put("fullBulkFlag", request.fullBulkFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("gmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internationTradeClause)) {
            body.put("internationTradeClause", request.internationTradeClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poType)) {
            body.put("poType", request.poType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderNo)) {
            body.put("purchaseOrderNo", request.purchaseOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderCode)) {
            body.put("sourceOrderCode", request.sourceOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierCode)) {
            body.put("supplierCode", request.supplierCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierName)) {
            body.put("supplierName", request.supplierName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.warehouse))) {
            body.put("warehouse", request.warehouse);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AscpPurchasingPurchaseOrderCreatedErpSpi"),
            new TeaPair("version", "2021-07-01_20-43-00-935"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ascpPurchasingPurchaseOrderCreatedErpSpi"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AscpPurchasingPurchaseOrderCreatedErpSpiResponse());
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse ascpPurchasingPurchaseOrderReceivedFinishedErpSpi(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpPurchasingPurchaseOrderReceivedFinishedErpSpiWithOptions(request, headers, runtime);
    }

    public AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse ascpPurchasingPurchaseOrderReceivedFinishedErpSpiWithOptions(AscpPurchasingPurchaseOrderReceivedFinishedErpSpiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeSupplierId)) {
            query.put("routeSupplierId", request.routeSupplierId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extFields)) {
            body.put("extFields", request.extFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            body.put("gmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtReceiveFinish)) {
            body.put("gmtReceiveFinish", request.gmtReceiveFinish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poType)) {
            body.put("poType", request.poType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderNo)) {
            body.put("purchaseOrderNo", request.purchaseOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderCode)) {
            body.put("sourceOrderCode", request.sourceOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.warehouse))) {
            body.put("warehouse", request.warehouse);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AscpPurchasingPurchaseOrderReceivedFinishedErpSpi"),
            new TeaPair("version", "2021-07-01_20-43-00-935"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ascpPurchasingPurchaseOrderReceivedFinishedErpSpi"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AscpPurchasingPurchaseOrderReceivedFinishedErpSpiResponse());
    }
}
