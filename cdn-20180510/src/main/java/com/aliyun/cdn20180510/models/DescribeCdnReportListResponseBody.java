// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListResponseBody extends TeaModel {
    /**
     * <p>The information about the report that is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;:[{&quot;reportId&quot;:1,&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;DomainPvUv&quot;,&quot;format&quot;:&quot;chart&quot;,&quot;shape&quot;:&quot;line&quot;,&quot;xAxis&quot;:&quot;ds&quot;,&quot;yAxis&quot;:&quot;cnt&quot;,&quot;legend&quot;:&quot;cnt_type&quot;,&quot;header&quot;:[&quot;ds&quot;,&quot;cnt_type&quot;,&quot;cnt&quot;]}}}</p>
     */
    @NameInMap("Content")
    public DescribeCdnReportListResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportListResponseBody self = new DescribeCdnReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportListResponseBody setContent(DescribeCdnReportListResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnReportListResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnReportListResponseBodyContentDataDeliverReport extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("format")
        public String format;

        @NameInMap("header")
        public java.util.List<String> header;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outLine")
        public Long outLine;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("outSize")
        public Long outSize;

        /**
         * <strong>example:</strong>
         * <p>line</p>
         */
        @NameInMap("shape")
        public String shape;

        /**
         * <strong>example:</strong>
         * <p>TopUrlByAcc</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeCdnReportListResponseBodyContentDataDeliverReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportListResponseBodyContentDataDeliverReport self = new DescribeCdnReportListResponseBodyContentDataDeliverReport();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setHeader(java.util.List<String> header) {
            this.header = header;
            return this;
        }
        public java.util.List<String> getHeader() {
            return this.header;
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setOutLine(Long outLine) {
            this.outLine = outLine;
            return this;
        }
        public Long getOutLine() {
            return this.outLine;
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setOutSize(Long outSize) {
            this.outSize = outSize;
            return this;
        }
        public Long getOutSize() {
            return this.outSize;
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setShape(String shape) {
            this.shape = shape;
            return this;
        }
        public String getShape() {
            return this.shape;
        }

        public DescribeCdnReportListResponseBodyContentDataDeliverReport setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeCdnReportListResponseBodyContentDataDeliver extends TeaModel {
        @NameInMap("report")
        public DescribeCdnReportListResponseBodyContentDataDeliverReport report;

        public static DescribeCdnReportListResponseBodyContentDataDeliver build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportListResponseBodyContentDataDeliver self = new DescribeCdnReportListResponseBodyContentDataDeliver();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportListResponseBodyContentDataDeliver setReport(DescribeCdnReportListResponseBodyContentDataDeliverReport report) {
            this.report = report;
            return this;
        }
        public DescribeCdnReportListResponseBodyContentDataDeliverReport getReport() {
            return this.report;
        }

    }

    public static class DescribeCdnReportListResponseBodyContentData extends TeaModel {
        @NameInMap("deliver")
        public DescribeCdnReportListResponseBodyContentDataDeliver deliver;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("reportId")
        public Long reportId;

        public static DescribeCdnReportListResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportListResponseBodyContentData self = new DescribeCdnReportListResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportListResponseBodyContentData setDeliver(DescribeCdnReportListResponseBodyContentDataDeliver deliver) {
            this.deliver = deliver;
            return this;
        }
        public DescribeCdnReportListResponseBodyContentDataDeliver getDeliver() {
            return this.deliver;
        }

        public DescribeCdnReportListResponseBodyContentData setReportId(Long reportId) {
            this.reportId = reportId;
            return this;
        }
        public Long getReportId() {
            return this.reportId;
        }

    }

    public static class DescribeCdnReportListResponseBodyContent extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeCdnReportListResponseBodyContentData> data;

        public static DescribeCdnReportListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportListResponseBodyContent self = new DescribeCdnReportListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportListResponseBodyContent setData(java.util.List<DescribeCdnReportListResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeCdnReportListResponseBodyContentData> getData() {
            return this.data;
        }

    }

}
