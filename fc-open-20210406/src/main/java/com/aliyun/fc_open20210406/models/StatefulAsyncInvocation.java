// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class StatefulAsyncInvocation extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("alreadyRetriedTimes")
    public Long alreadyRetriedTimes;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("destinationStatus")
    public String destinationStatus;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("durationMs")
    public Long durationMs;

    /**
     * <strong>example:</strong>
     * <p>1633449599</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("events")
    public java.util.List<StatefulAsyncInvocationEvent> events;

    /**
     * <strong>example:</strong>
     * <p>functionName</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <strong>example:</strong>
     * <p>D4-4BA6-5293-9FD1-882707E</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>UnhandledInvocationError</p>
     */
    @NameInMap("invocationErrorMessage")
    public String invocationErrorMessage;

    /**
     * <strong>example:</strong>
     * <p>cxxdfd</p>
     */
    @NameInMap("invocationId")
    public String invocationId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("invocationPayload")
    public String invocationPayload;

    /**
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <strong>example:</strong>
     * <p>ABA740D4-4BA6-5293-9FD1-882707EADC37</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>my-result</p>
     */
    @NameInMap("returnPayload")
    public String returnPayload;

    /**
     * <strong>example:</strong>
     * <p>serviceName</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>1633449590</p>
     */
    @NameInMap("startedTime")
    public Long startedTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static StatefulAsyncInvocation build(java.util.Map<String, ?> map) throws Exception {
        StatefulAsyncInvocation self = new StatefulAsyncInvocation();
        return TeaModel.build(map, self);
    }

    public StatefulAsyncInvocation setAlreadyRetriedTimes(Long alreadyRetriedTimes) {
        this.alreadyRetriedTimes = alreadyRetriedTimes;
        return this;
    }
    public Long getAlreadyRetriedTimes() {
        return this.alreadyRetriedTimes;
    }

    public StatefulAsyncInvocation setDestinationStatus(String destinationStatus) {
        this.destinationStatus = destinationStatus;
        return this;
    }
    public String getDestinationStatus() {
        return this.destinationStatus;
    }

    public StatefulAsyncInvocation setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }
    public Long getDurationMs() {
        return this.durationMs;
    }

    public StatefulAsyncInvocation setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StatefulAsyncInvocation setEvents(java.util.List<StatefulAsyncInvocationEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<StatefulAsyncInvocationEvent> getEvents() {
        return this.events;
    }

    public StatefulAsyncInvocation setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public StatefulAsyncInvocation setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StatefulAsyncInvocation setInvocationErrorMessage(String invocationErrorMessage) {
        this.invocationErrorMessage = invocationErrorMessage;
        return this;
    }
    public String getInvocationErrorMessage() {
        return this.invocationErrorMessage;
    }

    public StatefulAsyncInvocation setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public StatefulAsyncInvocation setInvocationPayload(String invocationPayload) {
        this.invocationPayload = invocationPayload;
        return this;
    }
    public String getInvocationPayload() {
        return this.invocationPayload;
    }

    public StatefulAsyncInvocation setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public StatefulAsyncInvocation setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StatefulAsyncInvocation setReturnPayload(String returnPayload) {
        this.returnPayload = returnPayload;
        return this;
    }
    public String getReturnPayload() {
        return this.returnPayload;
    }

    public StatefulAsyncInvocation setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public StatefulAsyncInvocation setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public Long getStartedTime() {
        return this.startedTime;
    }

    public StatefulAsyncInvocation setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
