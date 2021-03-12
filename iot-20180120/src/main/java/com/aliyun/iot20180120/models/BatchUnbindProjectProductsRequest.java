// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectProductsRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKeys")
    public java.util.List<String> productKeys;

    @NameInMap("ProjectId")
    public String projectId;

    public static BatchUnbindProjectProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectProductsRequest self = new BatchUnbindProjectProductsRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindProjectProductsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchUnbindProjectProductsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchUnbindProjectProductsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchUnbindProjectProductsRequest setProductKeys(java.util.List<String> productKeys) {
        this.productKeys = productKeys;
        return this;
    }
    public java.util.List<String> getProductKeys() {
        return this.productKeys;
    }

    public BatchUnbindProjectProductsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
