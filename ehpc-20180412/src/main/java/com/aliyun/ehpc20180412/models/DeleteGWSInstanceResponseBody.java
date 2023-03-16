// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGWSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSInstanceResponseBody self = new DeleteGWSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGWSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
