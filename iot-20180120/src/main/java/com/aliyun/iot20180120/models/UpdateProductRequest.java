// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProductName")
    public String productName;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
