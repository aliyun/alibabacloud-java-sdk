// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationExecutionsResponseBody extends TeaModel {
    /**
     * <p>The queried remediation records.</p>
     */
    @NameInMap("RemediationExecutionData")
    public ListRemediationExecutionsResponseBodyRemediationExecutionData remediationExecutionData;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRemediationExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationExecutionsResponseBody self = new ListRemediationExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRemediationExecutionsResponseBody setRemediationExecutionData(ListRemediationExecutionsResponseBodyRemediationExecutionData remediationExecutionData) {
        this.remediationExecutionData = remediationExecutionData;
        return this;
    }
    public ListRemediationExecutionsResponseBodyRemediationExecutionData getRemediationExecutionData() {
        return this.remediationExecutionData;
    }

    public ListRemediationExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions extends TeaModel {
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
         * <p>The IDs of the resources to which the remediation belongs. Separate multiple resource IDs with commas (,).</p>
         */
        @NameInMap("ExecutionResourceIds")
        public String executionResourceIds;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ExecutionResourceType")
        public String executionResourceType;

        /**
         * <p>The status of the remediation record. Valid values:</p>
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

        public static ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions self = new ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions();
            return TeaModel.build(map, self);
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionCreateDate(String executionCreateDate) {
            this.executionCreateDate = executionCreateDate;
            return this;
        }
        public String getExecutionCreateDate() {
            return this.executionCreateDate;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionInvocationId(String executionInvocationId) {
            this.executionInvocationId = executionInvocationId;
            return this;
        }
        public String getExecutionInvocationId() {
            return this.executionInvocationId;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionResourceIds(String executionResourceIds) {
            this.executionResourceIds = executionResourceIds;
            return this;
        }
        public String getExecutionResourceIds() {
            return this.executionResourceIds;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionResourceType(String executionResourceType) {
            this.executionResourceType = executionResourceType;
            return this;
        }
        public String getExecutionResourceType() {
            return this.executionResourceType;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions setExecutionStatusMessage(String executionStatusMessage) {
            this.executionStatusMessage = executionStatusMessage;
            return this;
        }
        public String getExecutionStatusMessage() {
            return this.executionStatusMessage;
        }

    }

    public static class ListRemediationExecutionsResponseBodyRemediationExecutionData extends TeaModel {
        /**
         * <p>The maximum number of entries to return for a single request.</p>
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
        public java.util.List<ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> remediationExecutions;

        public static ListRemediationExecutionsResponseBodyRemediationExecutionData build(java.util.Map<String, ?> map) throws Exception {
            ListRemediationExecutionsResponseBodyRemediationExecutionData self = new ListRemediationExecutionsResponseBodyRemediationExecutionData();
            return TeaModel.build(map, self);
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListRemediationExecutionsResponseBodyRemediationExecutionData setRemediationExecutions(java.util.List<ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> remediationExecutions) {
            this.remediationExecutions = remediationExecutions;
            return this;
        }
        public java.util.List<ListRemediationExecutionsResponseBodyRemediationExecutionDataRemediationExecutions> getRemediationExecutions() {
            return this.remediationExecutions;
        }

    }

}
