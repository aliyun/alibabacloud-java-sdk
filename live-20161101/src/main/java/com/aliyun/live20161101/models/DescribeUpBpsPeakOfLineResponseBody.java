// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakOfLineResponseBody extends TeaModel {
    @NameInMap("DescribeUpBpsPeakOfLines")
    public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLines describeUpBpsPeakOfLines;

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
        @NameInMap("QueryTime")
        public String queryTime;

        @NameInMap("StatName")
        public String statName;

        @NameInMap("PeakTime")
        public String peakTime;

        @NameInMap("BandWidth")
        public Float bandWidth;

        public static DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine self = new DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine();
            return TeaModel.build(map, self);
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

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpBpsPeakOfLineResponseBodyDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setBandWidth(Float bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Float getBandWidth() {
            return this.bandWidth;
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
