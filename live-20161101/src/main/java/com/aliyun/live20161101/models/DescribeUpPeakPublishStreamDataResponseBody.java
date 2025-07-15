// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataResponseBody extends TeaModel {
    /**
     * <p>The information about the peak number of concurrently ingested streams on each day.</p>
     */
    @NameInMap("DescribeUpPeakPublishStreamDatas")
    public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpPeakPublishStreamDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpPeakPublishStreamDataResponseBody self = new DescribeUpPeakPublishStreamDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpPeakPublishStreamDataResponseBody setDescribeUpPeakPublishStreamDatas(DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas) {
        this.describeUpPeakPublishStreamDatas = describeUpPeakPublishStreamDatas;
        return this;
    }
    public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas getDescribeUpPeakPublishStreamDatas() {
        return this.describeUpPeakPublishStreamDatas;
    }

    public DescribeUpPeakPublishStreamDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData extends TeaModel {
        /**
         * <p>The daily peak inbound bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>777.2727083333333</p>
         */
        @NameInMap("BandWidth")
        public String bandWidth;

        /**
         * <p>The time when the daily peak number of concurrently ingested streams is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>1522180000000</p>
         */
        @NameInMap("PeakTime")
        public String peakTime;

        /**
         * <p>The daily peak number of concurrently ingested streams.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("PublishStreamNum")
        public Integer publishStreamNum;

        /**
         * <p>The time queried on the day.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        @NameInMap("QueryTime")
        public String queryTime;

        /**
         * <p>The category of the statistical data. If the DomainSwitch parameter is set to on, the value of this parameter is the domain name. If the DomainSwitch parameter is set to off or not specified, the value of this parameter is the user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>push-live.aliyuncs.com</p>
         */
        @NameInMap("StatName")
        public String statName;

        public static DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData self = new DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPublishStreamNum(Integer publishStreamNum) {
            this.publishStreamNum = publishStreamNum;
            return this;
        }
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

    }

    public static class DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas extends TeaModel {
        @NameInMap("DescribeUpPeakPublishStreamData")
        public java.util.List<DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData;

        public static DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas self = new DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas();
            return TeaModel.build(map, self);
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas setDescribeUpPeakPublishStreamData(java.util.List<DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData) {
            this.describeUpPeakPublishStreamData = describeUpPeakPublishStreamData;
            return this;
        }
        public java.util.List<DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> getDescribeUpPeakPublishStreamData() {
            return this.describeUpPeakPublishStreamData;
        }

    }

}
