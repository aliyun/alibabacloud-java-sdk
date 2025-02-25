// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsListResponseBody extends TeaModel {
    /**
     * <p>The interval between each piece of data, in seconds.</p>
     * <p>Generated based on the interval between StartTime and EndTime: less than 1 hour, 60s; 1 hour or more but less than 1 day, 300s; 1 day or more but less than a week, 1800s; 1 week or more, 3600s.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public Integer dataInterval;

    /**
     * <p>A list of network bandwidth data for each time interval.</p>
     */
    @NameInMap("DataModule")
    public java.util.List<DescribeDDoSBpsListResponseBodyDataModule> dataModule;

    /**
     * <p>The end time for fetching data. In ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>The end time must be later than the start time, and the span between start and end times should not exceed 31 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-18T06:19:42Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time for fetching data. In ISO8601 format, using UTC, formatted as: YYYY-MM-DDThh:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-14T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSBpsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsListResponseBody self = new DescribeDDoSBpsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsListResponseBody setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDDoSBpsListResponseBody setDataModule(java.util.List<DescribeDDoSBpsListResponseBodyDataModule> dataModule) {
        this.dataModule = dataModule;
        return this;
    }
    public java.util.List<DescribeDDoSBpsListResponseBodyDataModule> getDataModule() {
        return this.dataModule;
    }

    public DescribeDDoSBpsListResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSBpsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSBpsListResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDDoSBpsListResponseBodyDataModule extends TeaModel {
        /**
         * <p>Attack bandwidth, in bps.</p>
         * 
         * <strong>example:</strong>
         * <p>9000000000</p>
         */
        @NameInMap("AttackBps")
        public Long attackBps;

        /**
         * <p>Attack PPS.</p>
         * 
         * <strong>example:</strong>
         * <p>9000000</p>
         */
        @NameInMap("AttackPps")
        public Long attackPps;

        /**
         * <p>Normal business bandwidth, in bps.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("NormalBps")
        public Long normalBps;

        /**
         * <p>Normal business PPS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("NormalPps")
        public Long normalPps;

        /**
         * <p>The timestamp of this data, in ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14T17:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>Total bandwidth, in bps.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000000</p>
         */
        @NameInMap("TotalBps")
        public Long totalBps;

        /**
         * <p>Total PPS.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000</p>
         */
        @NameInMap("TotalPps")
        public Long totalPps;

        public static DescribeDDoSBpsListResponseBodyDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSBpsListResponseBodyDataModule self = new DescribeDDoSBpsListResponseBodyDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSBpsListResponseBodyDataModule setAttackBps(Long attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Long getAttackBps() {
            return this.attackBps;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setAttackPps(Long attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Long getAttackPps() {
            return this.attackPps;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setNormalBps(Long normalBps) {
            this.normalBps = normalBps;
            return this;
        }
        public Long getNormalBps() {
            return this.normalBps;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setNormalPps(Long normalPps) {
            this.normalPps = normalPps;
            return this;
        }
        public Long getNormalPps() {
            return this.normalPps;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setTotalBps(Long totalBps) {
            this.totalBps = totalBps;
            return this;
        }
        public Long getTotalBps() {
            return this.totalBps;
        }

        public DescribeDDoSBpsListResponseBodyDataModule setTotalPps(Long totalPps) {
            this.totalPps = totalPps;
            return this;
        }
        public Long getTotalPps() {
            return this.totalPps;
        }

    }

}
