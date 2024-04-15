// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AsyncTask extends TeaModel {
    @NameInMap("alreadyRetriedTimes")
    public Long alreadyRetriedTimes;

    @NameInMap("destinationStatus")
    public String destinationStatus;

    @NameInMap("durationMs")
    public Long durationMs;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("events")
    public java.util.List<AsyncTaskEvent> events;

    @NameInMap("functionArn")
    public String functionArn;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("returnPayload")
    public String returnPayload;

    @NameInMap("startedTime")
    public Long startedTime;

    @NameInMap("status")
    public String status;

    @NameInMap("taskErrorMessage")
    public String taskErrorMessage;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("taskPayload")
    public String taskPayload;

    public static AsyncTask build(java.util.Map<String, ?> map) throws Exception {
        AsyncTask self = new AsyncTask();
        return TeaModel.build(map, self);
    }

    public AsyncTask setAlreadyRetriedTimes(Long alreadyRetriedTimes) {
        this.alreadyRetriedTimes = alreadyRetriedTimes;
        return this;
    }
    public Long getAlreadyRetriedTimes() {
        return this.alreadyRetriedTimes;
    }

    public AsyncTask setDestinationStatus(String destinationStatus) {
        this.destinationStatus = destinationStatus;
        return this;
    }
    public String getDestinationStatus() {
        return this.destinationStatus;
    }

    public AsyncTask setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }
    public Long getDurationMs() {
        return this.durationMs;
    }

    public AsyncTask setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AsyncTask setEvents(java.util.List<AsyncTaskEvent> events) {
        this.events = events;
        return this;
    }
    public java.util.List<AsyncTaskEvent> getEvents() {
        return this.events;
    }

    public AsyncTask setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public AsyncTask setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AsyncTask setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public AsyncTask setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsyncTask setReturnPayload(String returnPayload) {
        this.returnPayload = returnPayload;
        return this;
    }
    public String getReturnPayload() {
        return this.returnPayload;
    }

    public AsyncTask setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public Long getStartedTime() {
        return this.startedTime;
    }

    public AsyncTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AsyncTask setTaskErrorMessage(String taskErrorMessage) {
        this.taskErrorMessage = taskErrorMessage;
        return this;
    }
    public String getTaskErrorMessage() {
        return this.taskErrorMessage;
    }

    public AsyncTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncTask setTaskPayload(String taskPayload) {
        this.taskPayload = taskPayload;
        return this;
    }
    public String getTaskPayload() {
        return this.taskPayload;
    }

}
