// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSL7QpsListResponseBody extends TeaModel {
    /**
     * <p>The time granularity of the queried data, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("DataInterval")
    public Integer dataInterval;

    /**
     * <p>Application layer time trend data list.</p>
     */
    @NameInMap("DataModule")
    public java.util.List<DescribeDDoSL7QpsListResponseBodyDataModule> dataModule;

    /**
     * <p>The end time of the query.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-19T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86510927836942****</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time of the query.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-19T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSL7QpsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSL7QpsListResponseBody self = new DescribeDDoSL7QpsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSL7QpsListResponseBody setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDDoSL7QpsListResponseBody setDataModule(java.util.List<DescribeDDoSL7QpsListResponseBodyDataModule> dataModule) {
        this.dataModule = dataModule;
        return this;
    }
    public java.util.List<DescribeDDoSL7QpsListResponseBodyDataModule> getDataModule() {
        return this.dataModule;
    }

    public DescribeDDoSL7QpsListResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSL7QpsListResponseBody setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public DescribeDDoSL7QpsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDoSL7QpsListResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSL7QpsListResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDDoSL7QpsListResponseBodyDataModule extends TeaModel {
        /**
         * <p>Attack QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Attack")
        public Long attack;

        /**
         * <p>Normal QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Normal")
        public Long normal;

        /**
         * <p>Data time, following ISO8601 notation and using UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>Total QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeDDoSL7QpsListResponseBodyDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDoSL7QpsListResponseBodyDataModule self = new DescribeDDoSL7QpsListResponseBodyDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDDoSL7QpsListResponseBodyDataModule setAttack(Long attack) {
            this.attack = attack;
            return this;
        }
        public Long getAttack() {
            return this.attack;
        }

        public DescribeDDoSL7QpsListResponseBodyDataModule setNormal(Long normal) {
            this.normal = normal;
            return this;
        }
        public Long getNormal() {
            return this.normal;
        }

        public DescribeDDoSL7QpsListResponseBodyDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDDoSL7QpsListResponseBodyDataModule setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
