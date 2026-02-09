// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20260101.models;

import com.aliyun.tea.*;

public class SubmitTuringTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>82veb0a6wc41asdv80</p>
     */
    @NameInMap("idempotentKey")
    public String idempotentKey;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/1.png">https://www.example.com/1.png</a></p>
     */
    @NameInMap("imgUrl")
    public String imgUrl;

    /**
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("resolution")
    public String resolution;

    /**
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>live-wallpaper</p>
     */
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
