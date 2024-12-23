// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaPlanResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06dfe516688379832875789e2c65</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaPlanResponseBody self = new UpdateQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaPlanResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
