// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteConfigGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigGroupResponseBody self = new DeleteConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
