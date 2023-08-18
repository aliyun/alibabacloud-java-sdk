// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CommitJobRequest extends TeaModel {
    @NameInMap("configure")
    public String configure;

    @NameInMap("isOnOff")
    public Boolean isOnOff;

    @NameInMap("maxCU")
    public Float maxCU;

    @NameInMap("recommendOnly")
    public Boolean recommendOnly;

    @NameInMap("suspendPeriodParam")
    public java.util.List<CommitJobRequestSuspendPeriodParam> suspendPeriodParam;

    @NameInMap("suspendPeriods")
    public String suspendPeriods;

    public static CommitJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitJobRequest self = new CommitJobRequest();
        return TeaModel.build(map, self);
    }

    public CommitJobRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public CommitJobRequest setIsOnOff(Boolean isOnOff) {
        this.isOnOff = isOnOff;
        return this;
    }
    public Boolean getIsOnOff() {
        return this.isOnOff;
    }

    public CommitJobRequest setMaxCU(Float maxCU) {
        this.maxCU = maxCU;
        return this;
    }
    public Float getMaxCU() {
        return this.maxCU;
    }

    public CommitJobRequest setRecommendOnly(Boolean recommendOnly) {
        this.recommendOnly = recommendOnly;
        return this;
    }
    public Boolean getRecommendOnly() {
        return this.recommendOnly;
    }

    public CommitJobRequest setSuspendPeriodParam(java.util.List<CommitJobRequestSuspendPeriodParam> suspendPeriodParam) {
        this.suspendPeriodParam = suspendPeriodParam;
        return this;
    }
    public java.util.List<CommitJobRequestSuspendPeriodParam> getSuspendPeriodParam() {
        return this.suspendPeriodParam;
    }

    public CommitJobRequest setSuspendPeriods(String suspendPeriods) {
        this.suspendPeriods = suspendPeriods;
        return this;
    }
    public String getSuspendPeriods() {
        return this.suspendPeriods;
    }

    public static class CommitJobRequestSuspendPeriodParam extends TeaModel {
        @NameInMap("endTime")
        public String endTime;

        @NameInMap("plan")
        public String plan;

        @NameInMap("policy")
        public String policy;

        @NameInMap("startTime")
        public String startTime;

        public static CommitJobRequestSuspendPeriodParam build(java.util.Map<String, ?> map) throws Exception {
            CommitJobRequestSuspendPeriodParam self = new CommitJobRequestSuspendPeriodParam();
            return TeaModel.build(map, self);
        }

        public CommitJobRequestSuspendPeriodParam setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CommitJobRequestSuspendPeriodParam setPlan(String plan) {
            this.plan = plan;
            return this;
        }
        public String getPlan() {
            return this.plan;
        }

        public CommitJobRequestSuspendPeriodParam setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CommitJobRequestSuspendPeriodParam setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
