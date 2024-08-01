// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCustomLinesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLinesResponseBody self = new DeleteCustomLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
