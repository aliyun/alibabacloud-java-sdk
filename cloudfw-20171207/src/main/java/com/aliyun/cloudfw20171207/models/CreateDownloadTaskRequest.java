// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TaskData")
    public String taskData;

    public static CreateDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadTaskRequest self = new CreateDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDownloadTaskRequest setTaskData(String taskData) {
        this.taskData = taskData;
        return this;
    }
    public String getTaskData() {
        return this.taskData;
    }

}
