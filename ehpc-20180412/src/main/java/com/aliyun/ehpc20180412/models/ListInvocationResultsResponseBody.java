// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInvocationResultsResponseBody extends TeaModel {
    @NameInMap("InvocationResults")
    public java.util.List<ListInvocationResultsResponseBodyInvocationResults> invocationResults;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationResultsResponseBody self = new ListInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvocationResultsResponseBody setInvocationResults(java.util.List<ListInvocationResultsResponseBodyInvocationResults> invocationResults) {
        this.invocationResults = invocationResults;
        return this;
    }
    public java.util.List<ListInvocationResultsResponseBodyInvocationResults> getInvocationResults() {
        return this.invocationResults;
    }

    public ListInvocationResultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListInvocationResultsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListInvocationResultsResponseBodyInvocationResults extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("ExitCode")
        public Integer exitCode;

        public static ListInvocationResultsResponseBodyInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationResultsResponseBodyInvocationResults self = new ListInvocationResultsResponseBodyInvocationResults();
            return TeaModel.build(map, self);
        }

        public ListInvocationResultsResponseBodyInvocationResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListInvocationResultsResponseBodyInvocationResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInvocationResultsResponseBodyInvocationResults setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public ListInvocationResultsResponseBodyInvocationResults setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public ListInvocationResultsResponseBodyInvocationResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInvocationResultsResponseBodyInvocationResults setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public ListInvocationResultsResponseBodyInvocationResults setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

    }

}
