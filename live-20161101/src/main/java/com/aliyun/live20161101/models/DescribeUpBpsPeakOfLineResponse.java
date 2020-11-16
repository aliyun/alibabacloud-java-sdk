// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeUpBpsPeakOfLineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribeUpBpsPeakOfLines")
    @Validation(required = true)
    public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines describeUpBpsPeakOfLines;

    public static DescribeUpBpsPeakOfLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpBpsPeakOfLineResponse self = new DescribeUpBpsPeakOfLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpBpsPeakOfLineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpBpsPeakOfLineResponse setDescribeUpBpsPeakOfLines(DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines describeUpBpsPeakOfLines) {
        this.describeUpBpsPeakOfLines = describeUpBpsPeakOfLines;
        return this;
    }
    public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines getDescribeUpBpsPeakOfLines() {
        return this.describeUpBpsPeakOfLines;
    }

    public static class DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine extends TeaModel {
        @NameInMap("BandWidth")
        @Validation(required = true)
        public Float bandWidth;

        @NameInMap("PeakTime")
        @Validation(required = true)
        public String peakTime;

        @NameInMap("QueryTime")
        @Validation(required = true)
        public String queryTime;

        @NameInMap("StatName")
        @Validation(required = true)
        public String statName;

        public static DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine self = new DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setBandWidth(Float bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Float getBandWidth() {
            return this.bandWidth;
        }

        public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setPeakTime(String peakTime) {
            this.peakTime = peakTime;
            return this;
        }
        public String getPeakTime() {
            return this.peakTime;
        }

        public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setQueryTime(String queryTime) {
            this.queryTime = queryTime;
            return this;
        }
        public String getQueryTime() {
            return this.queryTime;
        }

        public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine setStatName(String statName) {
            this.statName = statName;
            return this;
        }
        public String getStatName() {
            return this.statName;
        }

    }

    public static class DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines extends TeaModel {
        @NameInMap("DescribeUpBpsPeakOfLine")
        @Validation(required = true)
        public java.util.List<DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine;

        public static DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines self = new DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines();
            return TeaModel.build(map, self);
        }

        public DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLines setDescribeUpBpsPeakOfLine(java.util.List<DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> describeUpBpsPeakOfLine) {
            this.describeUpBpsPeakOfLine = describeUpBpsPeakOfLine;
            return this;
        }
        public java.util.List<DescribeUpBpsPeakOfLineResponseDescribeUpBpsPeakOfLinesDescribeUpBpsPeakOfLine> getDescribeUpBpsPeakOfLine() {
            return this.describeUpBpsPeakOfLine;
        }

    }

}
