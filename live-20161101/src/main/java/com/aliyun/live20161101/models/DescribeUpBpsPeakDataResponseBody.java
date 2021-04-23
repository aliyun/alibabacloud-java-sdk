// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DescribeUpPeakTraffics")
    public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics describeUpPeakTraffics;

    public static DescribeUpBpsPeakDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakDataResponseBody self = new DescribeUpBpsPeakDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpBpsPeakDataResponseBody setDescribeUpPeakTraffics(DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics describeUpPeakTraffics) {
        this.describeUpPeakTraffics = describeUpPeakTraffics;
        return this;
    }
    public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics getDescribeUpPeakTraffics() {
        return this.describeUpPeakTraffics;
    }

    public static class DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic extends TeaModel {
        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("StatName")
        public String statName;

        @NameInMap("PeakTime")
        public String peakTime;

        @NameInMap("BandWidth")
        public String bandWidth;

        public static DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic self = new DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

    }

    public static class DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics extends TeaModel {
        @NameInMap("DescribeUpPeakTraffic")
        public java.util.List<DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic> describeUpPeakTraffic;

        public static DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics self = new DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics setDescribeUpPeakTraffic(java.util.List<DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic> describeUpPeakTraffic) {
            this.describeUpPeakTraffic = describeUpPeakTraffic;
            return this;
        }
        public java.util.List<DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic> getDescribeUpPeakTraffic() {
            return this.describeUpPeakTraffic;
        }

    }

}
