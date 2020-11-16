// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpPeakPublishStreamDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribeUpPeakPublishStreamDatas")
    @Validation(required = true)
    public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas;

    public static DescribeUpPeakPublishStreamDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpPeakPublishStreamDataResponse self = new DescribeUpPeakPublishStreamDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpPeakPublishStreamDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpPeakPublishStreamDataResponse setDescribeUpPeakPublishStreamDatas(DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas describeUpPeakPublishStreamDatas) {
        this.describeUpPeakPublishStreamDatas = describeUpPeakPublishStreamDatas;
        return this;
    }
    public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas getDescribeUpPeakPublishStreamDatas() {
        return this.describeUpPeakPublishStreamDatas;
    }

    public static class DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData extends TeaModel {
        @NameInMap("PublishStreamNum")
        @Validation(required = true)
        public Integer publishStreamNum;

        @NameInMap("PeakTime")
        @Validation(required = true)
        public String peakTime;

        @NameInMap("QueryTime")
        @Validation(required = true)
        public String queryTime;

        @NameInMap("StatName")
        @Validation(required = true)
        public String statName;

        @NameInMap("BandWidth")
        @Validation(required = true)
        public String bandWidth;

        public static DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData self = new DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPublishStreamNum(Integer publishStreamNum) {
            this.publishStreamNum = publishStreamNum;
            return this;
        }
        public Integer getPublishStreamNum() {
            return this.publishStreamNum;
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

    }

    public static class DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas extends TeaModel {
        @NameInMap("DescribeUpPeakPublishStreamData")
        @Validation(required = true)
        public java.util.List<DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData;

        public static DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas self = new DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas();
            return TeaModel.build(map, self);
        }

        public DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatas setDescribeUpPeakPublishStreamData(java.util.List<DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> describeUpPeakPublishStreamData) {
            this.describeUpPeakPublishStreamData = describeUpPeakPublishStreamData;
            return this;
        }
        public java.util.List<DescribeUpPeakPublishStreamDataResponseDescribeUpPeakPublishStreamDatasDescribeUpPeakPublishStreamData> getDescribeUpPeakPublishStreamData() {
            return this.describeUpPeakPublishStreamData;
        }

    }

}
