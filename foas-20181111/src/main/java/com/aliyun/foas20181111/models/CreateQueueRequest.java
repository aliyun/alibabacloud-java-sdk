// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateQueueRequest extends TeaModel {
    @NameInMap("gpu")
    public Integer gpu;

    @NameInMap("maxMemMB")
    public Integer maxMemMB;

    @NameInMap("maxVcore")
    public Integer maxVcore;

    @NameInMap("queueName")
    public String queueName;

    public static CreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQueueRequest self = new CreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateQueueRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public CreateQueueRequest setMaxMemMB(Integer maxMemMB) {
        this.maxMemMB = maxMemMB;
        return this;
    }
    public Integer getMaxMemMB() {
        return this.maxMemMB;
    }

    public CreateQueueRequest setMaxVcore(Integer maxVcore) {
        this.maxVcore = maxVcore;
        return this;
    }
    public Integer getMaxVcore() {
        return this.maxVcore;
    }

    public CreateQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
