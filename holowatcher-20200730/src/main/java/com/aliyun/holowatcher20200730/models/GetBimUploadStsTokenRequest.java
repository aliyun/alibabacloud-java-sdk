// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimUploadStsTokenRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetBimUploadStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimUploadStsTokenRequest self = new GetBimUploadStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetBimUploadStsTokenRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
