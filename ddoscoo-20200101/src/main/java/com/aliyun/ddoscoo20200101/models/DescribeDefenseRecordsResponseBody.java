// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDefenseRecordsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of details of the log of an advanced mitigation session.</p>
     */
    @NameInMap("DefenseRecords")
    public java.util.List<DescribeDefenseRecordsResponseBodyDefenseRecords> defenseRecords;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of advanced mitigation sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The peak attack traffic. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>6584186000</p>
         */
        @NameInMap("AttackPeak")
        public Long attackPeak;

        /**
         * <p>The end time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1583683200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The start time of the advanced mitigation session. This value is a UNIX timestamp. Units: miliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1582992000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the advanced mitigation session. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The advanced mitigation session is being used.</li>
         * <li><strong>1</strong>: The advanced mitigation session is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
