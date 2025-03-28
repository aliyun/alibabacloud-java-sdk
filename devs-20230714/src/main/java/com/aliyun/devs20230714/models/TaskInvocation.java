// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TaskInvocation extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-nkj8shz7xxxx</p>
     */
    @NameInMap("instanceID")
    public String instanceID;

    /**
     * <strong>example:</strong>
     * <p>E099843B-10A2-4936-9964-4E0EE263D564</p>
     */
    @NameInMap("invocationID")
    public String invocationID;

    /**
     * <strong>example:</strong>
     * <p>acs:fc:cn-hangzhou:143xxxx:services/xxx.LATEST/functions/xxx</p>
     */
    @NameInMap("invocationTarget")
    public String invocationTarget;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("output")
    public String output;

    /**
     * <strong>example:</strong>
     * <p>1B3058B1-F1C9-457C-B95C-2C250A4B3118</p>
     */
    @NameInMap("requestID")
    public String requestID;

    /**
     * <strong>example:</strong>
     * <p>my-sls-logstore</p>
     */
    @NameInMap("slsLogStore")
    public String slsLogStore;

    /**
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("slsProject")
    public String slsProject;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
