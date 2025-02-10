// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud DNS lines.</p>
     */
    @NameInMap("RecordLines")
    public DescribeSupportLinesResponseBodyRecordLines recordLines;

    /**
     * <strong>example:</strong>
     * <p>CFDA0830-7D6E-4C13-8632-B57C7EDCF079</p>
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
         * <p>The code of the parent line. Currently, no data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>unicom</p>
         */
        @NameInMap("FatherCode")
        public String fatherCode;

        /**
         * <p>The code of the child line.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_unicom_shanxi</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The display name of the line.</p>
         * 
         * <strong>example:</strong>
         * <p>China Unicom</p>
         */
        @NameInMap("LineDisplayName")
        public String lineDisplayName;

        /**
         * <p>The name of the child line.</p>
         * 
         * <strong>example:</strong>
         * <p>China Unicom_Shanxi</p>
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
