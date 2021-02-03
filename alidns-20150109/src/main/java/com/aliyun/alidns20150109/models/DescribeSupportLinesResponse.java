// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecordLines")
    @Validation(required = true)
    public DescribeSupportLinesResponseRecordLines recordLines;

    public static DescribeSupportLinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportLinesResponse self = new DescribeSupportLinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportLinesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportLinesResponse setRecordLines(DescribeSupportLinesResponseRecordLines recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public DescribeSupportLinesResponseRecordLines getRecordLines() {
        return this.recordLines;
    }

    public static class DescribeSupportLinesResponseRecordLinesRecordLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("LineDisplayName")
        @Validation(required = true)
        public String lineDisplayName;

        public static DescribeSupportLinesResponseRecordLinesRecordLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportLinesResponseRecordLinesRecordLine self = new DescribeSupportLinesResponseRecordLinesRecordLine();
            return TeaModel.build(map, self);
        }

        public DescribeSupportLinesResponseRecordLinesRecordLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeSupportLinesResponseRecordLinesRecordLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeSupportLinesResponseRecordLinesRecordLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeSupportLinesResponseRecordLinesRecordLine setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

    }

    public static class DescribeSupportLinesResponseRecordLines extends TeaModel {
        @NameInMap("RecordLine")
        @Validation(required = true)
        public java.util.List<DescribeSupportLinesResponseRecordLinesRecordLine> recordLine;

        public static DescribeSupportLinesResponseRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportLinesResponseRecordLines self = new DescribeSupportLinesResponseRecordLines();
            return TeaModel.build(map, self);
        }

        public DescribeSupportLinesResponseRecordLines setRecordLine(java.util.List<DescribeSupportLinesResponseRecordLinesRecordLine> recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public java.util.List<DescribeSupportLinesResponseRecordLinesRecordLine> getRecordLine() {
            return this.recordLine;
        }

    }

}
