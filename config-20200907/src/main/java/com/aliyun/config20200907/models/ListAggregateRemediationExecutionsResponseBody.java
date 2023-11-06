// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationExecutionsResponseBody extends TeaModel {
    /**
     * <p>The queried remediation records.</p>
     */
    @NameInMap("RemediationExecutionData")
    public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData remediationExecutionData;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateRemediationExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationExecutionsResponseBody self = new ListAggregateRemediationExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationExecutionsResponseBody setRemediationExecutionData(ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData remediationExecutionData) {
        this.remediationExecutionData = remediationExecutionData;
        return this;
    }
    public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData getRemediationExecutionData() {
        return this.remediationExecutionData;
    }

    public ListAggregateRemediationExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions extends TeaModel {
        /**
         * <p>The time when the remediation record was created.</p>
         */
        @NameInMap("ExecutionCreateDate")
        public String executionCreateDate;

        /**
         * <p>The invocation ID of the remediation record.</p>
         */
        @NameInMap("ExecutionInvocationId")
        public String executionInvocationId;

        /**
         * <p>The IDs of the remediated resources. Multiple resource IDs are separated with commas (,).</p>
         */
        @NameInMap("ExecutionResourceIds")
        public String executionResourceIds;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ExecutionResourceType")
        public String executionResourceType;

        /**
         * <p>The status of the remediation. Valid values:</p>
         * <br>
         * <p>*   Success</p>
         * <p>*   Failed</p>
         */
        @NameInMap("ExecutionStatus")
        public String executionStatus;

        /**
         * <p>The error message returned when the remediation fails.</p>
         */
        @NameInMap("ExecutionStatusMessage")
        public String executionStatusMessage;

        public static ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions self = new ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions();
            return TeaModel.build(map, self);
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionCreateDate(String executionCreateDate) {
            this.executionCreateDate = executionCreateDate;
            return this;
        }
        public String getExecutionCreateDate() {
            return this.executionCreateDate;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionInvocationId(String executionInvocationId) {
            this.executionInvocationId = executionInvocationId;
            return this;
        }
        public String getExecutionInvocationId() {
            return this.executionInvocationId;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionResourceIds(String executionResourceIds) {
            this.executionResourceIds = executionResourceIds;
            return this;
        }
        public String getExecutionResourceIds() {
            return this.executionResourceIds;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionResourceType(String executionResourceType) {
            this.executionResourceType = executionResourceType;
            return this;
        }
        public String getExecutionResourceType() {
            return this.executionResourceType;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionStatusMessage(String executionStatusMessage) {
            this.executionStatusMessage = executionStatusMessage;
            return this;
        }
        public String getExecutionStatusMessage() {
            return this.executionStatusMessage;
        }

    }

    public static class ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData extends TeaModel {
        /**
         * <p>The maximum number of entries returned for a single request.</p>
         */
        @NameInMap("MaxResults")
        public Long maxResults;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The queried remediation records.</p>
         */
        @NameInMap("RemediationExecutions")
        public java.util.List<ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> remediationExecutions;

        public static ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData self = new ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData();
            return TeaModel.build(map, self);
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData setRemediationExecutions(java.util.List<ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> remediationExecutions) {
            this.remediationExecutions = remediationExecutions;
            return this;
        }
        public java.util.List<ListAggregateRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> getRemediationExecutions() {
            return this.remediationExecutions;
        }

    }

}
