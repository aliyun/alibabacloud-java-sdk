// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ClearDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A1:B2</p>
     */
    @NameInMap("a1Notation")
    public String a1Notation;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ClearDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearDataResponseBody self = new ClearDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearDataResponseBody setA1Notation(String a1Notation) {
        this.a1Notation = a1Notation;
        return this;
    }
    public String getA1Notation() {
        return this.a1Notation;
    }

    public ClearDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
