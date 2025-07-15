// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakDataResponseBody extends TeaModel {
    /**
     * <p>The information about peak inbound bandwidth on each day.</p>
     */
    @NameInMap("DescribeUpPeakTraffics")
    public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics describeUpPeakTraffics;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpBpsPeakDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakDataResponseBody self = new DescribeUpBpsPeakDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakDataResponseBody setDescribeUpPeakTraffics(DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics describeUpPeakTraffics) {
        this.describeUpPeakTraffics = describeUpPeakTraffics;
        return this;
    }
    public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTraffics getDescribeUpPeakTraffics() {
        return this.describeUpPeakTraffics;
    }

    public DescribeUpBpsPeakDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic extends TeaModel {
        /**
         * <p>The daily peak inbound bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>777.2727083333333</p>
         */
        @NameInMap("BandWidth")
        public String bandWidth;

        /**
         * <p>The time when the daily peak bandwidth is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>1522180000000</p>
         */
        @NameInMap("PeakTime")
        public String peakTime;

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

        public static DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic self = new DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

        public DescribeUpBpsPeakDataResponseBodyDescribeUpPeakTrafficsDescribeUpPeakTraffic setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
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
