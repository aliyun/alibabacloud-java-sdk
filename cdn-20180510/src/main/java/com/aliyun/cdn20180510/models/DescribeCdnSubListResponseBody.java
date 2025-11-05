// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListResponseBody extends TeaModel {
    /**
     * <p>The information about the custom report task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;3250A51D-C11D-46BA-B6B3-95348EEDE652&quot;,&quot;Description&quot;:&quot;Successful&quot;,&quot;Content&quot;:{&quot;data&quot;:[{&quot;subId&quot;:5,&quot;reportId&quot;:[1,2,3],&quot;createTime&quot;:&quot;2020-09-25T09:39:33Z&quot;,&quot;domains&quot;[&quot;<a href="http://www.example.com%22,%22www.example.com%22%5D,%22effectiveFrom%22:%222020-09-17T00:00:00Z%22,%22effectiveEnd%22:%222020-11-17T00:00:00Z%22,%22status%22:%22enable%22%7D%5D%7D%7D">www.example.com&quot;,&quot;www.example.com&quot;],&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;,&quot;status&quot;:&quot;enable&quot;}]}}</a></p>
     */
    @NameInMap("Content")
    public DescribeCdnSubListResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnSubListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListResponseBody self = new DescribeCdnSubListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListResponseBody setContent(DescribeCdnSubListResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCdnSubListResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCdnSubListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnSubListResponseBodyContentData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-05-16T09:43:38Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("domains")
        public java.util.List<String> domains;

        /**
         * <strong>example:</strong>
         * <p>2024-05-16T09:43:38Z</p>
         */
        @NameInMap("effectiveEnd")
        public String effectiveEnd;

        /**
         * <strong>example:</strong>
         * <p>2024-05-16T09:43:38Z</p>
         */
        @NameInMap("effectiveFrom")
        public String effectiveFrom;

        @NameInMap("reportId")
        public java.util.List<Long> reportId;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("subId")
        public Long subId;

        public static DescribeCdnSubListResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSubListResponseBodyContentData self = new DescribeCdnSubListResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSubListResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCdnSubListResponseBodyContentData setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeCdnSubListResponseBodyContentData setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public DescribeCdnSubListResponseBodyContentData setEffectiveFrom(String effectiveFrom) {
            this.effectiveFrom = effectiveFrom;
            return this;
        }
        public String getEffectiveFrom() {
            return this.effectiveFrom;
        }

        public DescribeCdnSubListResponseBodyContentData setReportId(java.util.List<Long> reportId) {
            this.reportId = reportId;
            return this;
        }
        public java.util.List<Long> getReportId() {
            return this.reportId;
        }

        public DescribeCdnSubListResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdnSubListResponseBodyContentData setSubId(Long subId) {
            this.subId = subId;
            return this;
        }
        public Long getSubId() {
            return this.subId;
        }

    }

    public static class DescribeCdnSubListResponseBodyContent extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeCdnSubListResponseBodyContentData> data;

        public static DescribeCdnSubListResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSubListResponseBodyContent self = new DescribeCdnSubListResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSubListResponseBodyContent setData(java.util.List<DescribeCdnSubListResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeCdnSubListResponseBodyContentData> getData() {
            return this.data;
        }

    }

}
