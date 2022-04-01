// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class StatefulAsyncInvocation extends TeaModel {
    // 异步任务调用失败后的已重试次数。
    @NameInMap("alreadyRetriedTimes")
    public Long alreadyRetriedTimes;

    // 异步任务的目的状态。
    @NameInMap("destinationStatus")
    public String destinationStatus;

    // 异步任务的结束时间。
    @NameInMap("endTime")
    public Long endTime;

    // 异步任务事件列表。
    @NameInMap("events")
    public java.util.List<StatefulAsyncInvocationEvent> events;

    // 异步任务所属的函数的名称。
    @NameInMap("functionName")
    public String functionName;

    // 异步任务的执行实例ID。
    @NameInMap("instanceId")
    public String instanceId;

    // 异步任务的错误消息。
    @NameInMap("invocationErrorMessage")
    public String invocationErrorMessage;

    // 异步任务ID。
    @NameInMap("invocationId")
    public String invocationId;

    // 异步任务的任务触发事件。
    @NameInMap("invocationPayload")
    public String invocationPayload;

    // 异步任务所属的服务的别名或版本。
    @NameInMap("qualifier")
    public String qualifier;

    // 异步任务的请求ID。
    @NameInMap("requestId")
    public String requestId;

    // 异步任务所属的服务的名称。
    @NameInMap("serviceName")
    public String serviceName;

    // 异步任务的开始时间。
    @NameInMap("startedTime")
    public Long startedTime;

    // 异步任务的执行状态。      Enqueued：异步消息已入队，等待处理。      Succeeded：调用执行成功。      Failed：调用执行失败。      Running：调用执行中。      Stopped：调用执行终止。      Stopping：执行停止中。      Invalid：您的执行因函数被删除等原因处于无效状态（任务未被执行）。      Expired：您为任务配置了最长排队等待的期限。该任务因为超期被丢弃（任务未被执行）。      Retrying：异步调用因执行错误重试中。
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
