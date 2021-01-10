// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DescribeUpPeakPublishStreamDatas")
    public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

    public static DescribeUpPeakPublishStreamDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpPeakPublishStreamDataResponseBody self = new DescribeUpPeakPublishStreamDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpPeakPublishStreamDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpPeakPublishStreamDataResponseBody setDescribeUpPeakPublishStreamDatas(DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas) {
        this.describeUpPeakPublishStreamDatas = describeUpPeakPublishStreamDatas;
        return this;
    }
    public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas getDescribeUpPeakPublishStreamDatas() {
        return this.describeUpPeakPublishStreamDatas;
    }

    public static class DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData extends TeaModel {
        @NameInMap("PublishStreamNum")
        public Integer publishStreamNum;

        @NameInMap("PeakTime")
        public String peakTime;

        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("StatName")
        public String statName;

        @NameInMap("BandWidth")
        public String bandWidth;

        public static DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData self = new DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPublishStreamNum(Integer publishStreamNum) {
            this.publishStreamNum = publishStreamNum;
            return this;
        }
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
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

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
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
