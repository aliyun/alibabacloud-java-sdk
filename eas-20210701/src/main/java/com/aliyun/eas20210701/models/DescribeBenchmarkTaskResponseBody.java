// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    @NameInMap("AvailableAgent")
    public Long availableAgent;

    @NameInMap("CallerUid")
    public String callerUid;

    @NameInMap("DesiredAgent")
    public Long desiredAgent;

    @NameInMap("Message")
    public String message;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Token")
    public String token;

    public static DescribeBenchmarkTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskResponseBody self = new DescribeBenchmarkTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskResponseBody setAvailableAgent(Long availableAgent) {
        this.availableAgent = availableAgent;
        return this;
    }
    public Long getAvailableAgent() {
        return this.availableAgent;
    }

    public DescribeBenchmarkTaskResponseBody setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public DescribeBenchmarkTaskResponseBody setDesiredAgent(Long desiredAgent) {
        this.desiredAgent = desiredAgent;
        return this;
    }
    public Long getDesiredAgent() {
        return this.desiredAgent;
    }

    public DescribeBenchmarkTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBenchmarkTaskResponseBody setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public DescribeBenchmarkTaskResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DescribeBenchmarkTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBenchmarkTaskResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeBenchmarkTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeBenchmarkTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeBenchmarkTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeBenchmarkTaskResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
