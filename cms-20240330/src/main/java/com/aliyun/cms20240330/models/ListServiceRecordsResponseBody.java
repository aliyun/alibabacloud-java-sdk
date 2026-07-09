// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceRecordsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of ticket operation records.</p>
     */
    @NameInMap("records")
    public java.util.List<ListServiceRecordsResponseBodyRecords> records;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListServiceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRecordsResponseBody self = new ListServiceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceRecordsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRecordsResponseBody setRecords(java.util.List<ListServiceRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListServiceRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListServiceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The entry content in JSON string format. The format varies depending on the recordType.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;project&quot;: &quot;proj-xtrace-16c988dcfe21fcb73c5e6f234927d998-cn-hangzhou&quot;,
         *   &quot;storeName&quot;: &quot;app-biz-log&quot;,
         *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;bindType&quot;: &quot;logstore&quot;,
         *   &quot;traceIdRelateField&quot;: &quot;&quot;
         * }</p>
         */
        @NameInMap("recordContent")
        public String recordContent;

        /**
         * <p>The type of the linked entry. Currently supported:
         * logCorrelation, which indicates application log association.</p>
         * 
         * <strong>example:</strong>
         * <p>logCorrelation</p>
         */
        @NameInMap("recordType")
        public String recordType;

        /**
         * <p>The unique identifier of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>gaddp9ap8q@f8ca37734da3eda787dbb</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListServiceRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListServiceRecordsResponseBodyRecords self = new ListServiceRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListServiceRecordsResponseBodyRecords setRecordContent(String recordContent) {
            this.recordContent = recordContent;
            return this;
        }
        public String getRecordContent() {
            return this.recordContent;
        }

        public ListServiceRecordsResponseBodyRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListServiceRecordsResponseBodyRecords setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceRecordsResponseBodyRecords setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
