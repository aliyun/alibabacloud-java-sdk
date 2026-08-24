// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class UpdateKVCacheStoreResponseBody extends TeaModel {
    /**
     * <p>The ID of the modified KVCacheStore.</p>
     * 
     * <strong>example:</strong>
     * <p>kvs-xxxxx</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>The specification change order ID. Returned only when Capacity is modified.</p>
     * 
     * <strong>example:</strong>
     * <p>order-xxxxx</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID. The request ID is returned regardless of whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>6AA27F1A-A62C-59C3-BCC7-D1DFA4E7EEA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateKVCacheStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKVCacheStoreResponseBody self = new UpdateKVCacheStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKVCacheStoreResponseBody setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public UpdateKVCacheStoreResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateKVCacheStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
