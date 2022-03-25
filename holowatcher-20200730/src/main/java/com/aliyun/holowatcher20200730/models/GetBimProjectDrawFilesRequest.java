// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDrawFilesRequest extends TeaModel {
    @NameInMap("Subject")
    public String subject;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimProjectDrawFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDrawFilesRequest self = new GetBimProjectDrawFilesRequest();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDrawFilesRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public GetBimProjectDrawFilesRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
