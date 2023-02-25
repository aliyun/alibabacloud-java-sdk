// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfResponseBody extends TeaModel {
    /**
     * <p>The description of the execution errors and the version number of the latest environment configurations.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EditRoutineConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfResponseBody self = new EditRoutineConfResponseBody();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public EditRoutineConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
