// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeL4EventsSelectiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EsnL4EventList")
    public java.util.List<DescribeL4EventsSelectiveResponseBodyEsnL4EventList> esnL4EventList;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeL4EventsSelectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeL4EventsSelectiveResponseBody self = new DescribeL4EventsSelectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeL4EventsSelectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeL4EventsSelectiveResponseBody setEsnL4EventList(java.util.List<DescribeL4EventsSelectiveResponseBodyEsnL4EventList> esnL4EventList) {
        this.esnL4EventList = esnL4EventList;
        return this;
    }
    public java.util.List<DescribeL4EventsSelectiveResponseBodyEsnL4EventList> getEsnL4EventList() {
        return this.esnL4EventList;
    }

    public DescribeL4EventsSelectiveResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeL4EventsSelectiveResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeL4EventsSelectiveResponseBodyEsnL4EventList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TargetRegion")
        public String targetRegion;

        @NameInMap("AttackType")
        public Integer attackType;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("AttackSrc")
        public String attackSrc;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("AttackTime")
        public Long attackTime;

        @NameInMap("MaxAttack")
        public Long maxAttack;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public Integer targetType;

        public static DescribeL4EventsSelectiveResponseBodyEsnL4EventList build(java.util.Map<String, ?> map) throws Exception {
            DescribeL4EventsSelectiveResponseBodyEsnL4EventList self = new DescribeL4EventsSelectiveResponseBodyEsnL4EventList();
            return TeaModel.build(map, self);
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setAttackType(Integer attackType) {
            this.attackType = attackType;
            return this;
        }
        public Integer getAttackType() {
            return this.attackType;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setAttackSrc(String attackSrc) {
            this.attackSrc = attackSrc;
            return this;
        }
        public String getAttackSrc() {
            return this.attackSrc;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setAttackTime(Long attackTime) {
            this.attackTime = attackTime;
            return this;
        }
        public Long getAttackTime() {
            return this.attackTime;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setMaxAttack(Long maxAttack) {
            this.maxAttack = maxAttack;
            return this;
        }
        public Long getMaxAttack() {
            return this.maxAttack;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeL4EventsSelectiveResponseBodyEsnL4EventList setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

    }

}
