// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadCabRecordingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static DownloadCabRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCabRecordingRequest self = new DownloadCabRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCabRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadCabRecordingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
