// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPlanningProposalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPlanningProposalResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>77</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>下一页的token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPlanningProposalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlanningProposalResponseBody self = new ListPlanningProposalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlanningProposalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPlanningProposalResponseBody setData(java.util.List<ListPlanningProposalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPlanningProposalResponseBodyData> getData() {
        return this.data;
    }

    public ListPlanningProposalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPlanningProposalResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPlanningProposalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPlanningProposalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPlanningProposalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlanningProposalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPlanningProposalResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPlanningProposalResponseBodyDataOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static ListPlanningProposalResponseBodyDataOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListPlanningProposalResponseBodyDataOutlines self = new ListPlanningProposalResponseBodyDataOutlines();
            return TeaModel.build(map, self);
        }

        public ListPlanningProposalResponseBodyDataOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public ListPlanningProposalResponseBodyDataOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListPlanningProposalResponseBodyData extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<ListPlanningProposalResponseBodyDataOutlines> outlines;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static ListPlanningProposalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPlanningProposalResponseBodyData self = new ListPlanningProposalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPlanningProposalResponseBodyData setOutlines(java.util.List<ListPlanningProposalResponseBodyDataOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<ListPlanningProposalResponseBodyDataOutlines> getOutlines() {
            return this.outlines;
        }

        public ListPlanningProposalResponseBodyData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListPlanningProposalResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
