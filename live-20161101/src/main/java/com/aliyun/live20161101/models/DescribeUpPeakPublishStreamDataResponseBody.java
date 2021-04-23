// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataResponseBody extends TeaModel {
    @NameInMap("DescribeUpPeakPublishStreamDatas")
    public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

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
        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("StatName")
        public String statName;

        @NameInMap("PeakTime")
        public String peakTime;

        @NameInMap("BandWidth")
        public String bandWidth;

        @NameInMap("PublishStreamNum")
        public Integer publishStreamNum;

        public static DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData self = new DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData();
            return TeaModel.build(map, self);
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

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

        public DescribeUpPeakPublishStreamDataResponseBodyDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPublishStreamNum(Integer publishStreamNum) {
            this.publishStreamNum = publishStreamNum;
            return this;
        }
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
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
