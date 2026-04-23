// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class KnowledgeSubJobInfoVO extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubJobId")
    public Integer subJobId;

    public static KnowledgeSubJobInfoVO build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeSubJobInfoVO self = new KnowledgeSubJobInfoVO();
        return TeaModel.build(map, self);
    }

    public KnowledgeSubJobInfoVO setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public KnowledgeSubJobInfoVO setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public KnowledgeSubJobInfoVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KnowledgeSubJobInfoVO setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public KnowledgeSubJobInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeSubJobInfoVO setSubJobId(Integer subJobId) {
        this.subJobId = subJobId;
        return this;
    }
    public Integer getSubJobId() {
        return this.subJobId;
    }

}
