// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationExecutionsResponseBody extends TeaModel {
    @NameInMap("RemediationExecutionData")
    public ListAggregateRemediationExecutionsResponseBodyRemediationExecutionData remediationExecutionData;

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
        @NameInMap("ExecutionCreateDate")
        public String executionCreateDate;

        @NameInMap("ExecutionInvocationId")
        public String executionInvocationId;

        @NameInMap("ExecutionResourceIds")
        public String executionResourceIds;

        @NameInMap("ExecutionResourceType")
        public String executionResourceType;

        @NameInMap("ExecutionStatus")
        public String executionStatus;

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
        @NameInMap("MaxResults")
        public Long maxResults;

        @NameInMap("NextToken")
        public String nextToken;

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
