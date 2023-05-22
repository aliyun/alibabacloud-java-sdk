// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadRoutineCodeResponseBody extends TeaModel {
    /**
     * <p>The content returned, such as the code version number and information about the code upload.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadRoutineCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadRoutineCodeResponseBody self = new UploadRoutineCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadRoutineCodeResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public UploadRoutineCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
