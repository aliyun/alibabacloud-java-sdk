// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEcsTrendResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeInvadeEcsTrendResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>1736820365</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InvadeEcsCount")
    public Integer invadeEcsCount;

    /**
     * <strong>example:</strong>
     * <p>F90E816D-BEE7-5BD6-95ED-474F54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1742177725</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeInvadeEcsTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEcsTrendResponseBody self = new DescribeInvadeEcsTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEcsTrendResponseBody setDataList(java.util.List<DescribeInvadeEcsTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInvadeEcsTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInvadeEcsTrendResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeInvadeEcsTrendResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeInvadeEcsTrendResponseBody setInvadeEcsCount(Integer invadeEcsCount) {
        this.invadeEcsCount = invadeEcsCount;
        return this;
    }
    public Integer getInvadeEcsCount() {
        return this.invadeEcsCount;
    }

    public DescribeInvadeEcsTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvadeEcsTrendResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeInvadeEcsTrendResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("EcsCount")
        public Integer ecsCount;

        /**
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeInvadeEcsTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvadeEcsTrendResponseBodyDataList self = new DescribeInvadeEcsTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInvadeEcsTrendResponseBodyDataList setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public DescribeInvadeEcsTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
