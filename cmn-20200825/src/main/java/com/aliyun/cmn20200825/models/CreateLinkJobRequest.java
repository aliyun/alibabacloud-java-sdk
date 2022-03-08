// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateLinkJobRequest extends TeaModel {
    // 是否自动确认
    @NameInMap("AutoConfirm")
    public Boolean autoConfirm;

    // 双端链路转换策略
    @NameInMap("DoubleConvertStrategy")
    public String doubleConvertStrategy;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务ID
    @NameInMap("JobId")
    public String jobId;

    // 单端链路发现策略
    @NameInMap("SingleStrategy")
    public String singleStrategy;

    public static CreateLinkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkJobRequest self = new CreateLinkJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkJobRequest setAutoConfirm(Boolean autoConfirm) {
        this.autoConfirm = autoConfirm;
        return this;
    }
    public Boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    public CreateLinkJobRequest setDoubleConvertStrategy(String doubleConvertStrategy) {
        this.doubleConvertStrategy = doubleConvertStrategy;
        return this;
    }
    public String getDoubleConvertStrategy() {
        return this.doubleConvertStrategy;
    }

    public CreateLinkJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLinkJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateLinkJobRequest setSingleStrategy(String singleStrategy) {
        this.singleStrategy = singleStrategy;
        return this;
    }
    public String getSingleStrategy() {
        return this.singleStrategy;
    }

}
