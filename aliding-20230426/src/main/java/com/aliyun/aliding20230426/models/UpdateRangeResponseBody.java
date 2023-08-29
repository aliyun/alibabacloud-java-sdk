// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeResponseBody extends TeaModel {
    @NameInMap("a1Notation")
    public String a1Notation;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRangeResponseBody self = new UpdateRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRangeResponseBody setA1Notation(String a1Notation) {
        this.a1Notation = a1Notation;
        return this;
    }
    public String getA1Notation() {
        return this.a1Notation;
    }

    public UpdateRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
