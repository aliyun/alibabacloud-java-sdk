// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetParseProgressRequest extends TeaModel {
    /**
     * <p>The task key for parsing the skill package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2E7D8B71-2677-1B4C-9E25-A88B9C5******</p>
     */
    @NameInMap("TaskKey")
    public String taskKey;

    public static GetParseProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParseProgressRequest self = new GetParseProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetParseProgressRequest setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }
    public String getTaskKey() {
        return this.taskKey;
    }

}
