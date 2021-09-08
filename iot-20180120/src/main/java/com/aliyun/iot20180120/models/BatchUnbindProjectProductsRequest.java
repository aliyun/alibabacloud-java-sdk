// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectProductsRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKeys")
    @Validation(required = true)
    public java.util.List<String> productKeys;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    public static BatchUnbindProjectProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectProductsRequest self = new BatchUnbindProjectProductsRequest();
        return TeaModel.build(map, self);
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
