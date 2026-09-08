// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ParseSkillPackageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05C2791F-41A7-5E7C-B5E4-1401FD0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The key of the skill package parsing task.</p>
     * 
     * <strong>example:</strong>
     * <p>2E7D8B71-2677-1B4C-9E25-A88B9******</p>
     */
    @NameInMap("TaskKey")
    public String taskKey;

    public static ParseSkillPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseSkillPackageResponseBody self = new ParseSkillPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseSkillPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseSkillPackageResponseBody setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }
    public String getTaskKey() {
        return this.taskKey;
    }

}
