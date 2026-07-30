// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class SubmitTuringTaskRequest extends TeaModel {
    @NameInMap("duration")
    public Integer duration;

    @NameInMap("idempotentKey")
    public String idempotentKey;

    @NameInMap("imgUrl")
    public String imgUrl;

    @NameInMap("resolution")
    public String resolution;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("taskType")
    public String taskType;

    public static SubmitTuringTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTuringTaskRequest self = new SubmitTuringTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTuringTaskRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public SubmitTuringTaskRequest setIdempotentKey(String idempotentKey) {
        this.idempotentKey = idempotentKey;
        return this;
    }
    public String getIdempotentKey() {
        return this.idempotentKey;
    }

    public SubmitTuringTaskRequest setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }

    public SubmitTuringTaskRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitTuringTaskRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public SubmitTuringTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
