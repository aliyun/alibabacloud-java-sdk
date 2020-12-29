// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesResponseBody extends TeaModel {
    @NameInMap("RecordLines")
    public java.util.List<DescribeSupportLinesResponseBodyRecordLines> recordLines;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupportLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportLinesResponseBody self = new DescribeSupportLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportLinesResponseBody setRecordLines(java.util.List<DescribeSupportLinesResponseBodyRecordLines> recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public java.util.List<DescribeSupportLinesResponseBodyRecordLines> getRecordLines() {
        return this.recordLines;
    }

    public DescribeSupportLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupportLinesResponseBodyRecordLines extends TeaModel {
        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("LineDisplayName")
        public String lineDisplayName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        public static DescribeSupportLinesResponseBodyRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportLinesResponseBodyRecordLines self = new DescribeSupportLinesResponseBodyRecordLines();
            return TeaModel.build(map, self);
        }

        public DescribeSupportLinesResponseBodyRecordLines setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeSupportLinesResponseBodyRecordLines setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        public DescribeSupportLinesResponseBodyRecordLines setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeSupportLinesResponseBodyRecordLines setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

}
