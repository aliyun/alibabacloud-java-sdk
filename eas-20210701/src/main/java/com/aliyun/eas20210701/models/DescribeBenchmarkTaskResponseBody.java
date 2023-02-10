// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    /**
     * <p>实际可用的压测实例个数。</p>
     */
    @NameInMap("AvailableAgent")
    public Long availableAgent;

    /**
     * <p>调用者的UID。</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>预期的压测实例个数。</p>
     */
    @NameInMap("DesiredAgent")
    public Long desiredAgent;

    /**
     * <p>服务对外公开的访问路径。</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>当前压测任务的运行进度信息。</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>资源拥有者的UID。</p>
     */
    @NameInMap("ParentUid")
    public String parentUid;

    /**
     * <p>当前压测任务状态产生的原因。</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>压测的eas服务名。</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>压测任务的状态。</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>压测任务ID。</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>压测任务名字。</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>访问eas服务的鉴权token。</p>
     */
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

    public DescribeBenchmarkTaskResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
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
