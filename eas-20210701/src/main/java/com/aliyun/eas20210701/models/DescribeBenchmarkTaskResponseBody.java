// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    /**
     * <p>The number of instances that you can test.</p>
     */
    @NameInMap("AvailableAgent")
    public Long availableAgent;

    /**
     * <p>The ID of the operation caller.</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>The number of instances that you want to test.</p>
     */
    @NameInMap("DesiredAgent")
    public Long desiredAgent;

    /**
     * <p>The endpoint of the service gateway.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to call the operation.</p>
     */
    @NameInMap("ParentUid")
    public String parentUid;

    /**
     * <p>The event or reason that causes the current state of the stress testing task.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the service that you want to test.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The state of the stress testing task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Creating</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Starting</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   DeleteFailed</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Running</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Stopping</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Error</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Updating</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Deleting</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   CreateFailed</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the stress testing task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the stress testing task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The token for authentication when a stress testing task is created.</p>
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
