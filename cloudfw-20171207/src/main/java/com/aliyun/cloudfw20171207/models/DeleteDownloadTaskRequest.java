// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDownloadTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TaskId")
    public String taskId;

    public static DeleteDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDownloadTaskRequest self = new DeleteDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDownloadTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDownloadTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
