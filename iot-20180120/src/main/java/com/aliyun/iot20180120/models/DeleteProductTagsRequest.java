// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteProductTagsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product. You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProductTagKey")
    public java.util.List<String> productTagKey;

    public static DeleteProductTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductTagsRequest self = new DeleteProductTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductTagsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteProductTagsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public DeleteProductTagsRequest setProductTagKey(java.util.List<String> productTagKey) {
        this.productTagKey = productTagKey;
        return this;
    }
    public java.util.List<String> getProductTagKey() {
        return this.productTagKey;
    }

}
