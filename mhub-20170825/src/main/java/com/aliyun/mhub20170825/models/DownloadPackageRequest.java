// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DownloadPackageRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static DownloadPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadPackageRequest self = new DownloadPackageRequest();
        return TeaModel.build(map, self);
    }

    public DownloadPackageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
