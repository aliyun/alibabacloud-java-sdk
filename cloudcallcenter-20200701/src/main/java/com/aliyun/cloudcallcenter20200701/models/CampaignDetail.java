// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CampaignDetail extends TeaModel {
    @NameInMap("ActualEndTime")
    public Long actualEndTime;

    @NameInMap("ActualStartTime")
    public Long actualStartTime;

    @NameInMap("CasesAborted")
    public Long casesAborted;

    @NameInMap("CasesConnected")
    public Long casesConnected;

    @NameInMap("CasesUncompleted")
    public Long casesUncompleted;

    @NameInMap("CompletedRate")
    public Long completedRate;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("MaxAttemptCount")
    public Long maxAttemptCount;

    @NameInMap("MinAttemptInterval")
    public Long minAttemptInterval;

    @NameInMap("Name")
    public String name;

    @NameInMap("PlanedEndTime")
    public Long planedEndTime;

    @NameInMap("PlanedStartTime")
    public Long planedStartTime;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("State")
    public String state;

    @NameInMap("TotalCases")
    public Long totalCases;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static CampaignDetail build(java.util.Map<String, ?> map) throws Exception {
        CampaignDetail self = new CampaignDetail();
        return TeaModel.build(map, self);
    }

    public CampaignDetail setActualEndTime(Long actualEndTime) {
        this.actualEndTime = actualEndTime;
        return this;
    }
    public Long getActualEndTime() {
        return this.actualEndTime;
    }

    public CampaignDetail setActualStartTime(Long actualStartTime) {
        this.actualStartTime = actualStartTime;
        return this;
    }
    public Long getActualStartTime() {
        return this.actualStartTime;
    }

    public CampaignDetail setCasesAborted(Long casesAborted) {
        this.casesAborted = casesAborted;
        return this;
    }
    public Long getCasesAborted() {
        return this.casesAborted;
    }

    public CampaignDetail setCasesConnected(Long casesConnected) {
        this.casesConnected = casesConnected;
        return this;
    }
    public Long getCasesConnected() {
        return this.casesConnected;
    }

    public CampaignDetail setCasesUncompleted(Long casesUncompleted) {
        this.casesUncompleted = casesUncompleted;
        return this;
    }
    public Long getCasesUncompleted() {
        return this.casesUncompleted;
    }

    public CampaignDetail setCompletedRate(Long completedRate) {
        this.completedRate = completedRate;
        return this;
    }
    public Long getCompletedRate() {
        return this.completedRate;
    }

    public CampaignDetail setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public CampaignDetail setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CampaignDetail setMaxAttemptCount(Long maxAttemptCount) {
        this.maxAttemptCount = maxAttemptCount;
        return this;
    }
    public Long getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public CampaignDetail setMinAttemptInterval(Long minAttemptInterval) {
        this.minAttemptInterval = minAttemptInterval;
        return this;
    }
    public Long getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    public CampaignDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CampaignDetail setPlanedEndTime(Long planedEndTime) {
        this.planedEndTime = planedEndTime;
        return this;
    }
    public Long getPlanedEndTime() {
        return this.planedEndTime;
    }

    public CampaignDetail setPlanedStartTime(Long planedStartTime) {
        this.planedStartTime = planedStartTime;
        return this;
    }
    public Long getPlanedStartTime() {
        return this.planedStartTime;
    }

    public CampaignDetail setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CampaignDetail setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CampaignDetail setTotalCases(Long totalCases) {
        this.totalCases = totalCases;
        return this;
    }
    public Long getTotalCases() {
        return this.totalCases;
    }

    public CampaignDetail setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
