// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetBatchTaskProgressRequest extends TeaModel {
    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // param1
    @NameInMap("TaskId")
    public String taskId;

    public static GetBatchTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskProgressRequest self = new GetBatchTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskProgressRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetBatchTaskProgressRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetBatchTaskProgressRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
