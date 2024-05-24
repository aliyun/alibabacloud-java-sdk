// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskInvocation extends TeaModel {
    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("invocationID")
    public String invocationID;

    @NameInMap("invocationTarget")
    public String invocationTarget;

    @NameInMap("output")
    public String output;

    @NameInMap("requestID")
    public String requestID;

    @NameInMap("slsLogStore")
    public String slsLogStore;

    @NameInMap("slsProject")
    public String slsProject;

    @NameInMap("status")
    public String status;

    public static TaskInvocation build(java.util.Map<String, ?> map) throws Exception {
        TaskInvocation self = new TaskInvocation();
        return TeaModel.build(map, self);
    }

    public TaskInvocation setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public TaskInvocation setInvocationID(String invocationID) {
        this.invocationID = invocationID;
        return this;
    }
    public String getInvocationID() {
        return this.invocationID;
    }

    public TaskInvocation setInvocationTarget(String invocationTarget) {
        this.invocationTarget = invocationTarget;
        return this;
    }
    public String getInvocationTarget() {
        return this.invocationTarget;
    }

    public TaskInvocation setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public TaskInvocation setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }
    public String getRequestID() {
        return this.requestID;
    }

    public TaskInvocation setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public TaskInvocation setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public TaskInvocation setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
