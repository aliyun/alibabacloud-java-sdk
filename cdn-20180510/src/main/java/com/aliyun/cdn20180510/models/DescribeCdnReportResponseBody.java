// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportResponseBody extends TeaModel {
    /**
     * <p>The content of the operations report.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;:[{&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;TopUrlByAcc&quot;,&quot;format&quot;:&quot;table&quot;,&quot;shape&quot;:&quot;&quot;,&quot;header&quot;:[&quot;url&quot;,&quot;traf&quot;,&quot;traf_rate&quot;,&quot;acc&quot;,&quot;acc_rate&quot;]}},&quot;data&quot;:[{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;<a href="http://demo.com%22,%22traf_rate%22:%220.100%%22%7D,%7B%22acc%22:440,%22acc_rate%22:%220.200%%22,%22traf%22:22,%22url%22:%22http://demo.com%22,%22traf_rate%22:%220.100%%22%7D%5D%7D%5D%7D%7D">http://demo.com&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;},{&quot;acc&quot;:440,&quot;acc_rate&quot;:&quot;0.200%&quot;,&quot;traf&quot;:22,&quot;url&quot;:&quot;http://demo.com&quot;,&quot;traf_rate&quot;:&quot;0.100%&quot;}]}]}}</a></p>
     */
    @NameInMap("Content")
    public DescribeCdnReportResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportResponseBody self = new DescribeCdnReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportResponseBody setContent(DescribeCdnReportResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnReportResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnReportResponseBodyContentDataDeliverReport extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        public static DescribeCdnReportResponseBodyContentDataDeliverReport build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportResponseBodyContentDataDeliverReport self = new DescribeCdnReportResponseBodyContentDataDeliverReport();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setHeader(java.util.List<String> header) {
            this.header = header;
            return this;
        }
        public java.util.List<String> getHeader() {
            return this.header;
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setOutLine(Long outLine) {
            this.outLine = outLine;
            return this;
        }
        public Long getOutLine() {
            return this.outLine;
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setOutSize(Long outSize) {
            this.outSize = outSize;
            return this;
        }
        public Long getOutSize() {
            return this.outSize;
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setShape(String shape) {
            this.shape = shape;
            return this;
        }
        public String getShape() {
            return this.shape;
        }

        public DescribeCdnReportResponseBodyContentDataDeliverReport setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeCdnReportResponseBodyContentDataDeliver extends TeaModel {
        @NameInMap("report")
        public DescribeCdnReportResponseBodyContentDataDeliverReport report;

        public static DescribeCdnReportResponseBodyContentDataDeliver build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportResponseBodyContentDataDeliver self = new DescribeCdnReportResponseBodyContentDataDeliver();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportResponseBodyContentDataDeliver setReport(DescribeCdnReportResponseBodyContentDataDeliverReport report) {
            this.report = report;
            return this;
        }
        public DescribeCdnReportResponseBodyContentDataDeliverReport getReport() {
            return this.report;
        }

    }

    public static class DescribeCdnReportResponseBodyContentData extends TeaModel {
        @NameInMap("data")
        public java.util.List<java.util.Map<String, String>> data;

        @NameInMap("deliver")
        public DescribeCdnReportResponseBodyContentDataDeliver deliver;

        public static DescribeCdnReportResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportResponseBodyContentData self = new DescribeCdnReportResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportResponseBodyContentData setData(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getData() {
            return this.data;
        }

        public DescribeCdnReportResponseBodyContentData setDeliver(DescribeCdnReportResponseBodyContentDataDeliver deliver) {
            this.deliver = deliver;
            return this;
        }
        public DescribeCdnReportResponseBodyContentDataDeliver getDeliver() {
            return this.deliver;
        }

    }

    public static class DescribeCdnReportResponseBodyContent extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeCdnReportResponseBodyContentData> data;

        public static DescribeCdnReportResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnReportResponseBodyContent self = new DescribeCdnReportResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnReportResponseBodyContent setData(java.util.List<DescribeCdnReportResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeCdnReportResponseBodyContentData> getData() {
            return this.data;
        }

    }

}
