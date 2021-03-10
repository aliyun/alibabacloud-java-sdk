// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static QueryProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductRequest self = new QueryProductRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryProductRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryProductRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public QueryProductRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
