// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakOfLineResponseBody extends TeaModel {
    /**
     * <p>The information about peak inbound bandwidth of the leased line on each day.</p>
     */
    @NameInMap("DescribeUpBpsPeakOfLines")
    public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines describeUpBpsPeakOfLines;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpBpsPeakOfLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakOfLineResponseBody self = new DescribeUpBpsPeakOfLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakOfLineResponseBody setDescribeUpBpsPeakOfLines(DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines describeUpBpsPeakOfLines) {
        this.describeUpBpsPeakOfLines = describeUpBpsPeakOfLines;
        return this;
    }
    public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines getDescribeUpBpsPeakOfLines() {
        return this.describeUpBpsPeakOfLines;
    }

    public DescribeUpBpsPeakOfLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine extends TeaModel {
        /**
         * <p>The daily peak inbound bandwidth of the leased line.</p>
         * 
         * <strong>example:</strong>
         * <p>777.2727083333333</p>
         */
        @NameInMap("BandWidth")
        public Float bandWidth;

        /**
         * <p>The time when the daily peak bandwidth of the leased line is reached.</p>
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

        public static DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine self = new DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setBandWidth(Float bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Float getBandWidth() {
            return this.bandWidth;
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

    }

    public static class DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines extends TeaModel {
        @NameInMap("DescribeUpBpsPeakOfLine")
        public java.util.List<DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine;

        public static DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines self = new DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines setDescribeUpBpsPeakOfLine(java.util.List<DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine) {
            this.describeUpBpsPeakOfLine = describeUpBpsPeakOfLine;
            return this;
        }
        public java.util.List<DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> getDescribeUpBpsPeakOfLine() {
            return this.describeUpBpsPeakOfLine;
        }

    }

}
