// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribeUpPeakTraffics")
    @Validation(required = true)
    public DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics describeUpPeakTraffics;

    public static DescribeUpBpsPeakDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakDataResponse self = new DescribeUpBpsPeakDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpBpsPeakDataResponse setDescribeUpPeakTraffics(DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics describeUpPeakTraffics) {
        this.describeUpPeakTraffics = describeUpPeakTraffics;
        return this;
    }
    public DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics getDescribeUpPeakTraffics() {
        return this.describeUpPeakTraffics;
    }

    public static class DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic extends TeaModel {
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

        public static DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic self = new DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

        public DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

    }

    public static class DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics extends TeaModel {
        @NameInMap("DescribeUpPeakTraffic")
        @Validation(required = true)
        public java.util.List<DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic> describeUpPeakTraffic;

        public static DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics self = new DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakDataResponseDescribeUpPeakTraffics setDescribeUpPeakTraffic(java.util.List<DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic> describeUpPeakTraffic) {
            this.describeUpPeakTraffic = describeUpPeakTraffic;
            return this;
        }
        public java.util.List<DescribeUpBpsPeakDataResponseDescribeUpPeakTrafficsDescribeUpPeakTraffic> getDescribeUpPeakTraffic() {
            return this.describeUpPeakTraffic;
        }

    }

}
