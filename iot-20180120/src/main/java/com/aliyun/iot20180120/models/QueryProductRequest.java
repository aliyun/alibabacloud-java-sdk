// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>> *   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>  *   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product that you want to query. A ProductKey is a GUID that is issued by IoT Platform to a product. You can use the IoT Platform console or call the [QueryProductList](~~69271~~) operation to view the information about all products within the current account.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductRequest self = new QueryProductRequest();
        return TeaModel.build(map, self);
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

}
