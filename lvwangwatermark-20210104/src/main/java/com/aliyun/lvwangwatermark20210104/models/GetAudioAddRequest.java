// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioAddRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetAudioAddRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAddRequest self = new GetAudioAddRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioAddRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
