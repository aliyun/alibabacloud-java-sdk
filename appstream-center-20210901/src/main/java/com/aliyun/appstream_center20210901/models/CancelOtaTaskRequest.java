// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CancelOtaTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-53fvrq1oanz6c****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ota-be7jzm29wrrz5****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelOtaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOtaTaskRequest self = new CancelOtaTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelOtaTaskRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public CancelOtaTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
