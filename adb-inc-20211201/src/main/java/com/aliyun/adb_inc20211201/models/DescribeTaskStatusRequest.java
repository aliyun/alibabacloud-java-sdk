// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeTaskStatusRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskStatusRequest self = new DescribeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskStatusRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
