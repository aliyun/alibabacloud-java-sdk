// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class KnowledgeJobInfoVO extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobId")
    public Integer jobId;

    @NameInMap("KnowledgeCnt")
    public Integer knowledgeCnt;

    @NameInMap("Progress")
    public Integer progress;

    @NameInMap("ShowJobId")
    public String showJobId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Supplement")
    public String supplement;

    @NameInMap("TableCnt")
    public Integer tableCnt;

    public static KnowledgeJobInfoVO build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeJobInfoVO self = new KnowledgeJobInfoVO();
        return TeaModel.build(map, self);
    }

    public KnowledgeJobInfoVO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public KnowledgeJobInfoVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public KnowledgeJobInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeJobInfoVO setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public KnowledgeJobInfoVO setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

    public KnowledgeJobInfoVO setKnowledgeCnt(Integer knowledgeCnt) {
        this.knowledgeCnt = knowledgeCnt;
        return this;
    }
    public Integer getKnowledgeCnt() {
        return this.knowledgeCnt;
    }

    public KnowledgeJobInfoVO setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public KnowledgeJobInfoVO setShowJobId(String showJobId) {
        this.showJobId = showJobId;
        return this;
    }
    public String getShowJobId() {
        return this.showJobId;
    }

    public KnowledgeJobInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeJobInfoVO setSupplement(String supplement) {
        this.supplement = supplement;
        return this;
    }
    public String getSupplement() {
        return this.supplement;
    }

    public KnowledgeJobInfoVO setTableCnt(Integer tableCnt) {
        this.tableCnt = tableCnt;
        return this;
    }
    public Integer getTableCnt() {
        return this.tableCnt;
    }

}
