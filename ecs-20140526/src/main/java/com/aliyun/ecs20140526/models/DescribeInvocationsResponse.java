// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Invocations")
    @Validation(required = true)
    public DescribeInvocationsResponseInvocations invocations;

    public static DescribeInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponse self = new DescribeInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInvocationsResponseInvocationsInvocationInvokeInstancesInvokeInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Repeats")
        @Validation(required = true)
        public Integer repeats;

        @NameInMap("InstanceInvokeStatus")
        @Validation(required = true)
        public String instanceInvokeStatus;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Long exitCode;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Integer dropped;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static DescribeInvocationsResponseInvocationsInvocationInvokeInstancesInvokeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocationsInvocationInvokeInstancesInvokeInstance self = new DescribeInvocationsResponseInvocationsInvocationInvokeInstancesInvokeInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInvocationsResponseInvocationsInvocationInvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        @Validation(required = true)
        public java.util.List<DescribeInvocationsResponseInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance;

        public static DescribeInvocationsResponseInvocationsInvocationInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocationsInvocationInvokeInstances self = new DescribeInvocationsResponseInvocationsInvocationInvokeInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInvocationsResponseInvocationsInvocation extends TeaModel {
        @NameInMap("InvokeId")
        @Validation(required = true)
        public String invokeId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CommandId")
        @Validation(required = true)
        public String commandId;

        @NameInMap("CommandType")
        @Validation(required = true)
        public String commandType;

        @NameInMap("CommandName")
        @Validation(required = true)
        public String commandName;

        @NameInMap("CommandContent")
        @Validation(required = true)
        public String commandContent;

        @NameInMap("Frequency")
        @Validation(required = true)
        public String frequency;

        @NameInMap("Timed")
        @Validation(required = true)
        public Boolean timed;

        @NameInMap("InvokeStatus")
        @Validation(required = true)
        public String invokeStatus;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("Parameters")
        @Validation(required = true)
        public String parameters;

        @NameInMap("InvokeInstances")
        @Validation(required = true)
        public DescribeInvocationsResponseInvocationsInvocationInvokeInstances invokeInstances;

        public static DescribeInvocationsResponseInvocationsInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocationsInvocation self = new DescribeInvocationsResponseInvocationsInvocation();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInvocationsResponseInvocations extends TeaModel {
        @NameInMap("Invocation")
        @Validation(required = true)
        public java.util.List<DescribeInvocationsResponseInvocationsInvocation> invocation;

        public static DescribeInvocationsResponseInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocations self = new DescribeInvocationsResponseInvocations();
            return TeaModel.build(map, self);
        }

    }

}
