// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesResponseBody extends TeaModel {
    /**
     * <p>云解析线路列表。</p>
     */
    @NameInMap("RecordLines")
    public DescribeSupportLinesResponseBodyRecordLines recordLines;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSupportLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportLinesResponseBody self = new DescribeSupportLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportLinesResponseBody setRecordLines(DescribeSupportLinesResponseBodyRecordLines recordLines) {
        this.recordLines = recordLines;
        return this;
    }
    public DescribeSupportLinesResponseBodyRecordLines getRecordLines() {
        return this.recordLines;
    }

    public DescribeSupportLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSupportLinesResponseBodyRecordLinesRecordLine extends TeaModel {
        /**
         * <p>2021-12-06T02:47:26.000+0000</p>
         */
        @NameInMap("FatherCode")
        public String fatherCode;

        /**
         * <p>子线路Code。</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>父线路展示名称。</p>
         */
        @NameInMap("LineDisplayName")
        public String lineDisplayName;

        /**
         * <p>子线路展示名称。</p>
         */
        @NameInMap("LineName")
        public String lineName;

        public static DescribeSupportLinesResponseBodyRecordLinesRecordLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportLinesResponseBodyRecordLinesRecordLine self = new DescribeSupportLinesResponseBodyRecordLinesRecordLine();
            return TeaModel.build(map, self);
        }

        public DescribeSupportLinesResponseBodyRecordLinesRecordLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeSupportLinesResponseBodyRecordLinesRecordLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeSupportLinesResponseBodyRecordLinesRecordLine setLineDisplayName(String lineDisplayName) {
            this.lineDisplayName = lineDisplayName;
            return this;
        }
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        public DescribeSupportLinesResponseBodyRecordLinesRecordLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

    public static class DescribeSupportLinesResponseBodyRecordLines extends TeaModel {
        @NameInMap("RecordLine")
        public java.util.List<DescribeSupportLinesResponseBodyRecordLinesRecordLine> recordLine;

        public static DescribeSupportLinesResponseBodyRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeSupportLinesResponseBodyRecordLines self = new DescribeSupportLinesResponseBodyRecordLines();
            return TeaModel.build(map, self);
        }

        public DescribeSupportLinesResponseBodyRecordLines setRecordLine(java.util.List<DescribeSupportLinesResponseBodyRecordLinesRecordLine> recordLine) {
            this.recordLine = recordLine;
            return this;
        }
        public java.util.List<DescribeSupportLinesResponseBodyRecordLinesRecordLine> getRecordLine() {
            return this.recordLine;
        }

    }

}
