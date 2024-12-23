// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class DeleteQuotaPlanResponseBody extends TeaModel {
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
     * <p>0b57ff7616612271051086500ea3ce</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaPlanResponseBody self = new DeleteQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaPlanResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
