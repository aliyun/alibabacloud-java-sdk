// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class RetryMmsJobResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>78</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7F5DAD1C-9EC2-5FE5-97CF-BCE21B4ABA29</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RetryMmsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryMmsJobResponseBody self = new RetryMmsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryMmsJobResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public RetryMmsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
