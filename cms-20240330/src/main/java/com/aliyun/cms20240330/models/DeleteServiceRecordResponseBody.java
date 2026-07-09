// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteServiceRecordResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteServiceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRecordResponseBody self = new DeleteServiceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
