// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioExtractRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetAudioExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioExtractRequest self = new GetAudioExtractRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioExtractRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
