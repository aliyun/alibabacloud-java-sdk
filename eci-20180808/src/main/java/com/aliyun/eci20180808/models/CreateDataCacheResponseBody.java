// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateDataCacheResponseBody extends TeaModel {
    /**
     * <p>The DataCache ID.</p>
     */
    @NameInMap("DataCacheId")
    public String dataCacheId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCacheResponseBody self = new CreateDataCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataCacheResponseBody setDataCacheId(String dataCacheId) {
        this.dataCacheId = dataCacheId;
        return this;
    }
    public String getDataCacheId() {
        return this.dataCacheId;
    }

    public CreateDataCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
