// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseRecordsResponseBody extends TeaModel {
    @NameInMap("DefenseRecords")
    public java.util.List<DescribeDefenseRecordsResponseBodyDefenseRecords> defenseRecords;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDefenseRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRecordsResponseBody self = new DescribeDefenseRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRecordsResponseBody setDefenseRecords(java.util.List<DescribeDefenseRecordsResponseBodyDefenseRecords> defenseRecords) {
        this.defenseRecords = defenseRecords;
        return this;
    }
    public java.util.List<DescribeDefenseRecordsResponseBodyDefenseRecords> getDefenseRecords() {
        return this.defenseRecords;
    }

    public DescribeDefenseRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefenseRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDefenseRecordsResponseBodyDefenseRecords extends TeaModel {
        @NameInMap("AttackPeak")
        public Long attackPeak;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        public static DescribeDefenseRecordsResponseBodyDefenseRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefenseRecordsResponseBodyDefenseRecords self = new DescribeDefenseRecordsResponseBodyDefenseRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setAttackPeak(Long attackPeak) {
            this.attackPeak = attackPeak;
            return this;
        }
        public Long getAttackPeak() {
            return this.attackPeak;
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeDefenseRecordsResponseBodyDefenseRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
