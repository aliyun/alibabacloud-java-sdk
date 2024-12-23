// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaPlanResponseBody extends TeaModel {
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
     * <p>0bc3b4b016674434996033675e71ee</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaPlanResponseBody self = new CreateQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaPlanResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
