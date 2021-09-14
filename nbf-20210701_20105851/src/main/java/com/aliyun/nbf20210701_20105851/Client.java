// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_20105851;

import com.aliyun.tea.*;
import com.aliyun.nbf20210701_20105851.models.*;
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

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponse ascpPurchasingPurchaseOrderSupplierConfirmErpApi(AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.ascpPurchasingPurchaseOrderSupplierConfirmErpApiWithOptions(request, headers, runtime);
    }

    public AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponse ascpPurchasingPurchaseOrderSupplierConfirmErpApiWithOptions(AscpPurchasingPurchaseOrderSupplierConfirmErpApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderNo)) {
            body.put("purchaseOrderNo", request.purchaseOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AscpPurchasingPurchaseOrderSupplierConfirmErpApi", "2021-07-01_20-10-58-51", "HTTPS", "POST", "AK", "/AscpPurchasingPurchaseOrderSupplierConfirmErpApi", "json", req, runtime), new AscpPurchasingPurchaseOrderSupplierConfirmErpApiResponse());
    }
}
