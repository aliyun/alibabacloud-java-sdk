// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReInitDiskResponseBody extends TeaModel {
    /**
     * <p>The returned service code. A value of 0 indicates that the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DD66F05-3116-4BAA-B588-52EB2E7F431D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReInitDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponseBody self = new ReInitDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReInitDiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReInitDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
