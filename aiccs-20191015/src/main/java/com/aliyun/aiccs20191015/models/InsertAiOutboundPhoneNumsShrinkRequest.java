// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsShrinkRequest extends TeaModel {
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    @NameInMap("Details")
    public String detailsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public Long taskId;

    public static InsertAiOutboundPhoneNumsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsShrinkRequest self = new InsertAiOutboundPhoneNumsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setDetailsShrink(String detailsShrink) {
        this.detailsShrink = detailsShrink;
        return this;
    }
    public String getDetailsShrink() {
        return this.detailsShrink;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
