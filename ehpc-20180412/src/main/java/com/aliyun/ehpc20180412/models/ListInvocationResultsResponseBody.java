// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsResponseBody extends TeaModel {
    @NameInMap("InvocationResults")
    public ListInvocationResultsResponseBodyInvocationResults invocationResults;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationResultsResponseBody self = new ListInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvocationResultsResponseBody setInvocationResults(ListInvocationResultsResponseBodyInvocationResults invocationResults) {
        this.invocationResults = invocationResults;
        return this;
    }
    public ListInvocationResultsResponseBodyInvocationResults getInvocationResults() {
        return this.invocationResults;
    }

    public ListInvocationResultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInvocationResultsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvocationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInvocationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInvocationResultsResponseBodyInvocationResultsInvocationResult extends TeaModel {
        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static ListInvocationResultsResponseBodyInvocationResultsInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationResultsResponseBodyInvocationResultsInvocationResult self = new ListInvocationResultsResponseBodyInvocationResultsInvocationResult();
            return TeaModel.build(map, self);
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInvocationResultsResponseBodyInvocationResultsInvocationResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListInvocationResultsResponseBodyInvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        public java.util.List<ListInvocationResultsResponseBodyInvocationResultsInvocationResult> invocationResult;

        public static ListInvocationResultsResponseBodyInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationResultsResponseBodyInvocationResults self = new ListInvocationResultsResponseBodyInvocationResults();
            return TeaModel.build(map, self);
        }

        public ListInvocationResultsResponseBodyInvocationResults setInvocationResult(java.util.List<ListInvocationResultsResponseBodyInvocationResultsInvocationResult> invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }
        public java.util.List<ListInvocationResultsResponseBodyInvocationResultsInvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

    }

}
