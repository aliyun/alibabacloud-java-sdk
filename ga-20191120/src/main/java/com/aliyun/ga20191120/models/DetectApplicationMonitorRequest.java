// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetectApplicationMonitorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    public static DetectApplicationMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectApplicationMonitorRequest self = new DetectApplicationMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DetectApplicationMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetectApplicationMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetectApplicationMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
