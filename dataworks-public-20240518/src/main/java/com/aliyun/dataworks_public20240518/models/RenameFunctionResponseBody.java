// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RenameFunctionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1ED4C97F-BA2A-57C5-BA7C-8853627EXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static RenameFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameFunctionResponseBody self = new RenameFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameFunctionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
