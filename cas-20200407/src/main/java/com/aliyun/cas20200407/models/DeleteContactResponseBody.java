// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteContactResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1F1E4D86-B70B-5352-A641-8CC80D13A37F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactResponseBody self = new DeleteContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
