// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeRevisionResponseBody extends TeaModel {
    /**
     * <p>The message returned, such as &quot;&quot;Status&quot;: &quot;OK&quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Status&quot;: &quot;OK&quot;</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoutineCodeRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeRevisionResponseBody self = new DeleteRoutineCodeRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeRevisionResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DeleteRoutineCodeRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
