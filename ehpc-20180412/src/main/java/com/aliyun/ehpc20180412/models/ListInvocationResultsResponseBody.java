// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>The result of the command.</p>
     */
    @NameInMap("InvocationResults")
    public ListInvocationResultsResponseBodyInvocationResults invocationResults;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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
        /**
         * <p>The ID of the command.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The exit code.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time at which the command entered the Finished state.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The ID of the node on which the command was run.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the command. Valid values:</p>
         * <br>
         * <p>*   Finished</p>
         * <p>*   Running</p>
         * <p>*   Failed</p>
         * <p>*   Stopped</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The output result.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the command was run and its result was obtained.</p>
         */
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
