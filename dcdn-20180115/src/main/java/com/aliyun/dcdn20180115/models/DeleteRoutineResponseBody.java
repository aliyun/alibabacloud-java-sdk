// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineResponseBody extends TeaModel {
    /**
     * <p>The message returned, such as ""Status": "OK"".</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoutineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineResponseBody self = new DeleteRoutineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DeleteRoutineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
