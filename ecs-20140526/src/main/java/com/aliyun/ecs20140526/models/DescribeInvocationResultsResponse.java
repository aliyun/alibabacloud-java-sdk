// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Invocation")
    @Validation(required = true)
    public DescribeInvocationResultsResponseInvocation invocation;

    public static DescribeInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsResponse self = new DescribeInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult extends TeaModel {
        @NameInMap("CommandId")
        @Validation(required = true)
        public String commandId;

        @NameInMap("InvokeId")
        @Validation(required = true)
        public String invokeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("FinishedTime")
        @Validation(required = true)
        public String finishedTime;

        @NameInMap("Repeats")
        @Validation(required = true)
        public Integer repeats;

        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Integer dropped;

        @NameInMap("InvokeRecordStatus")
        @Validation(required = true)
        public String invokeRecordStatus;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Long exitCode;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        public static DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult self = new DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInvocationResultsResponseInvocationInvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        @Validation(required = true)
        public java.util.List<DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult> invocationResult;

        public static DescribeInvocationResultsResponseInvocationInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocationInvocationResults self = new DescribeInvocationResultsResponseInvocationInvocationResults();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInvocationResultsResponseInvocation extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("InvocationResults")
        @Validation(required = true)
        public DescribeInvocationResultsResponseInvocationInvocationResults invocationResults;

        public static DescribeInvocationResultsResponseInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocation self = new DescribeInvocationResultsResponseInvocation();
            return TeaModel.build(map, self);
        }

    }

}
