// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBRestoreTaskStatusRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TaskId")
    public String taskId;

    public static QueryDBRestoreTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDBRestoreTaskStatusRequest self = new QueryDBRestoreTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDBRestoreTaskStatusRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDBRestoreTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
