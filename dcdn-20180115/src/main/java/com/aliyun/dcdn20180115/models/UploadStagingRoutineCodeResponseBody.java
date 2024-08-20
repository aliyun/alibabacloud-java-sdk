// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadStagingRoutineCodeResponseBody extends TeaModel {
    /**
     * <p>The parameters required by the code.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DFA2027F-86C0-4421-9593-581A7993696C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadStagingRoutineCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadStagingRoutineCodeResponseBody self = new UploadStagingRoutineCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadStagingRoutineCodeResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public UploadStagingRoutineCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
