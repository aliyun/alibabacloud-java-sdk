// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class RunWorkflowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag-n72kong0832****</p>
     */
    @NameInMap("alertGroupId")
    public String alertGroupId;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("alertStrategy")
    public String alertStrategy;

    /**
     * <strong>example:</strong>
     * <p>OFF_MODE</p>
     */
    @NameInMap("complementDependentMode")
    public String complementDependentMode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("dryRun")
    public String dryRun;

    /**
     * <strong>example:</strong>
     * <p>START_PROCESS</p>
     */
    @NameInMap("execType")
    public String execType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedParallelismNumber")
    public String expectedParallelismNumber;

    /**
     * <strong>example:</strong>
     * <p>END</p>
     */
    @NameInMap("failureStrategy")
    public String failureStrategy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wg-acfmv4opbs****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>RUN_MODE_PARALLEL</p>
     */
    @NameInMap("runMode")
    public String runMode;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00,2024-01-02 00:00:00</p>
     */
    @NameInMap("scheduleTime")
    public String scheduleTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
     */
    @NameInMap("startParams")
    public String startParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-3q9jo749ne5****</p>
     */
    @NameInMap("workflowId")
    public String workflowId;

    /**
     * <strong>example:</strong>
     * <p>MEDIUM</p>
     */
    @NameInMap("workflowInstancePriority")
    public String workflowInstancePriority;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static RunWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RunWorkflowRequest self = new RunWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RunWorkflowRequest setAlertGroupId(String alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    public RunWorkflowRequest setAlertStrategy(String alertStrategy) {
        this.alertStrategy = alertStrategy;
        return this;
    }
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    public RunWorkflowRequest setComplementDependentMode(String complementDependentMode) {
        this.complementDependentMode = complementDependentMode;
        return this;
    }
    public String getComplementDependentMode() {
        return this.complementDependentMode;
    }

    public RunWorkflowRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public RunWorkflowRequest setExecType(String execType) {
        this.execType = execType;
        return this;
    }
    public String getExecType() {
        return this.execType;
    }

    public RunWorkflowRequest setExpectedParallelismNumber(String expectedParallelismNumber) {
        this.expectedParallelismNumber = expectedParallelismNumber;
        return this;
    }
    public String getExpectedParallelismNumber() {
        return this.expectedParallelismNumber;
    }

    public RunWorkflowRequest setFailureStrategy(String failureStrategy) {
        this.failureStrategy = failureStrategy;
        return this;
    }
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    public RunWorkflowRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunWorkflowRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public RunWorkflowRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public RunWorkflowRequest setStartParams(String startParams) {
        this.startParams = startParams;
        return this;
    }
    public String getStartParams() {
        return this.startParams;
    }

    public RunWorkflowRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public RunWorkflowRequest setWorkflowInstancePriority(String workflowInstancePriority) {
        this.workflowInstancePriority = workflowInstancePriority;
        return this;
    }
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    public RunWorkflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
