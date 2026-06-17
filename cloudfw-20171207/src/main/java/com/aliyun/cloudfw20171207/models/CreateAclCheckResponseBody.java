// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateAclCheckResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FB718F0-CC04-5A12-B17B-188CFC3F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of task IDs.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static CreateAclCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAclCheckResponseBody self = new CreateAclCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAclCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAclCheckResponseBody setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
