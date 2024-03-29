// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateLinkJobRequest extends TeaModel {
    /**
     * <p>是否自动确认</p>
     */
    @NameInMap("AutoConfirm")
    public Boolean autoConfirm;

    /**
     * <p>双端链路转换策略</p>
     */
    @NameInMap("DoubleConvertStrategy")
    public String doubleConvertStrategy;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>任务ID</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>单端链路发现策略</p>
     */
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
