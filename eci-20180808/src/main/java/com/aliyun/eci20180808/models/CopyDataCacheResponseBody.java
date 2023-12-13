// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CopyDataCacheResponseBody extends TeaModel {
    /**
     * <p>The ID generated for the DataCache in the destination region.</p>
     */
    @NameInMap("DataCacheId")
    public String dataCacheId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyDataCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyDataCacheResponseBody self = new CopyDataCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyDataCacheResponseBody setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        return this;
    }
    public String getDataCacheId() {
        return this.dataCacheId;
    }

    public CopyDataCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
