// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateQueueRequest extends TeaModel {
    @NameInMap("gpu")
    public Integer gpu;

    @NameInMap("maxMemMB")
    public Integer maxMemMB;

    @NameInMap("maxVcore")
    public Integer maxVcore;

    @NameInMap("queueName")
    public String queueName;

    public static UpdateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueRequest self = new UpdateQueueRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueueRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public UpdateQueueRequest setMaxMemMB(Integer maxMemMB) {
        this.maxMemMB = maxMemMB;
        return this;
    }
    public Integer getMaxMemMB() {
        return this.maxMemMB;
    }

    public UpdateQueueRequest setMaxVcore(Integer maxVcore) {
        this.maxVcore = maxVcore;
        return this;
    }
    public Integer getMaxVcore() {
        return this.maxVcore;
    }

    public UpdateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
