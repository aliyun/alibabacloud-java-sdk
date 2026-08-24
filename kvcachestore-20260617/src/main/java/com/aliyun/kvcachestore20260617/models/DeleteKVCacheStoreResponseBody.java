// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class DeleteKVCacheStoreResponseBody extends TeaModel {
    /**
     * <p>KVCacheStore KvcsId</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-your-id</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B127704C-ECB1-5B0A-AA9C-8F394A6F179F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKVCacheStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKVCacheStoreResponseBody self = new DeleteKVCacheStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKVCacheStoreResponseBody setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public DeleteKVCacheStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
