// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BindConfigGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ccg-0chlk9b65lj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindConfigGroupResponseBody self = new BindConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public BindConfigGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BindConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
