// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class PushRtapTaskByUuidRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Data")
    public String data;

    @NameInMap("TaskSN")
    public String taskSN;

    @NameInMap("Uuid")
    public String uuid;

    public static PushRtapTaskByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRtapTaskByUuidRequest self = new PushRtapTaskByUuidRequest();
        return TeaModel.build(map, self);
    }

    public PushRtapTaskByUuidRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PushRtapTaskByUuidRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushRtapTaskByUuidRequest setTaskSN(String taskSN) {
        this.taskSN = taskSN;
        return this;
    }
    public String getTaskSN() {
        return this.taskSN;
    }

    public PushRtapTaskByUuidRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
