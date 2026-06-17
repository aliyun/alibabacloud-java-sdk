// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInternetDropTrafficTrendResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeInternetDropTrafficTrendResponseBodyDataList> dataList;

    /**
     * <p>The peak number of dropped sessions in the specified period.</p>
     * 
     * <strong>example:</strong>
     * <p>8090</p>
     */
    @NameInMap("DropSessionMax")
    public Long dropSessionMax;

    /**
     * <p>The average drop ratio for the entire query period, expressed as a percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>12.34</p>
     */
    @NameInMap("RatioAverage")
    public String ratioAverage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The average drop ratio from the previous cycle, expressed as a percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("RingRatioAverage")
    public String ringRatioAverage;

    public static DescribeInternetDropTrafficTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInternetDropTrafficTrendResponseBody self = new DescribeInternetDropTrafficTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInternetDropTrafficTrendResponseBody setDataList(java.util.List<DescribeInternetDropTrafficTrendResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeInternetDropTrafficTrendResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeInternetDropTrafficTrendResponseBody setDropSessionMax(Long dropSessionMax) {
        this.dropSessionMax = dropSessionMax;
        return this;
    }
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    public DescribeInternetDropTrafficTrendResponseBody setRatioAverage(String ratioAverage) {
        this.ratioAverage = ratioAverage;
        return this;
    }
    public String getRatioAverage() {
        return this.ratioAverage;
    }

    public DescribeInternetDropTrafficTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInternetDropTrafficTrendResponseBody setRingRatioAverage(String ringRatioAverage) {
        this.ringRatioAverage = ringRatioAverage;
        return this;
    }
    public String getRingRatioAverage() {
        return this.ringRatioAverage;
    }

    public static class DescribeInternetDropTrafficTrendResponseBodyDataList extends TeaModel {
        /**
         * <p>The number of sessions dropped by access control list (ACL) rules.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AclDrop")
        public Long aclDrop;

        /**
         * <p>The current time point. The time is in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-25 12:00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The ratio of dropped sessions to total sessions for this data point.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DropRatio")
        public String dropRatio;

        /**
         * <p>The number of dropped sessions for the corresponding data point in the previous cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DropRing")
        public Long dropRing;

        /**
         * <p>The drop ratio for the corresponding data point in the previous cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DropRingRatio")
        public String dropRingRatio;

        /**
         * <p>The number of dropped sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("DropSession")
        public Long dropSession;

        /**
         * <p>The number of sessions dropped by the intrusion prevention system (IPS).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("IpsDrop")
        public Long ipsDrop;

        /**
         * <p>The corresponding time point in the previous cycle. The time is in the <code>YYYY-MM-DD HH:mm:ss</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-25 12:00:00</p>
         */
        @NameInMap("RingDataTime")
        public String ringDataTime;

        /**
         * <p>The timestamp for the corresponding data point in the previous cycle. This value is a Unix timestamp that represents the number of seconds that have elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1659405600</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The total number of sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalSession")
        public Long totalSession;

        public static DescribeInternetDropTrafficTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInternetDropTrafficTrendResponseBodyDataList self = new DescribeInternetDropTrafficTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setAclDrop(Long aclDrop) {
            this.aclDrop = aclDrop;
            return this;
        }
        public Long getAclDrop() {
            return this.aclDrop;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setDropRatio(String dropRatio) {
            this.dropRatio = dropRatio;
            return this;
        }
        public String getDropRatio() {
            return this.dropRatio;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setDropRing(Long dropRing) {
            this.dropRing = dropRing;
            return this;
        }
        public Long getDropRing() {
            return this.dropRing;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setDropRingRatio(String dropRingRatio) {
            this.dropRingRatio = dropRingRatio;
            return this;
        }
        public String getDropRingRatio() {
            return this.dropRingRatio;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setDropSession(Long dropSession) {
            this.dropSession = dropSession;
            return this;
        }
        public Long getDropSession() {
            return this.dropSession;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setIpsDrop(Long ipsDrop) {
            this.ipsDrop = ipsDrop;
            return this;
        }
        public Long getIpsDrop() {
            return this.ipsDrop;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setRingDataTime(String ringDataTime) {
            this.ringDataTime = ringDataTime;
            return this;
        }
        public String getRingDataTime() {
            return this.ringDataTime;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeInternetDropTrafficTrendResponseBodyDataList setTotalSession(Long totalSession) {
            this.totalSession = totalSession;
            return this;
        }
        public Long getTotalSession() {
            return this.totalSession;
        }

    }

}
