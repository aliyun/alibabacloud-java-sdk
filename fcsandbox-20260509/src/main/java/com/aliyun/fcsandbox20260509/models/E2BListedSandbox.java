// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BListedSandbox extends TeaModel {
    /**
     * <p>The number of CPU cores used by the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpuCount")
    public Integer cpuCount;

    /**
     * <p>The disk size of the sandbox, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    /**
     * <p>The end time of the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T01:00:00Z</p>
     */
    @NameInMap("endAt")
    public String endAt;

    /**
     * <p>The memory size of the sandbox, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memoryMB")
    public Integer memoryMB;

    /**
     * <p>The custom metadata of the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;team&quot;:&quot;data&quot;}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    /**
     * <p>The ID of the resource group to which the sandbox belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The ID of the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>sbx-xxx</p>
     */
    @NameInMap("sandboxID")
    public String sandboxID;

    /**
     * <p>The start time of the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The current status of the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The unique identifier of the team to which the sandbox belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team to which the sandbox belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The plan of the team to which the sandbox belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>Pro</p>
     */
    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <p>The ID of the template used to create the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>your-template-id</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The ID of the user who created the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("userID")
    public String userID;

    public static E2BListedSandbox build(java.util.Map<String, ?> map) throws Exception {
        E2BListedSandbox self = new E2BListedSandbox();
        return TeaModel.build(map, self);
    }

    public E2BListedSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BListedSandbox setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public E2BListedSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public E2BListedSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BListedSandbox setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public E2BListedSandbox setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BListedSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public E2BListedSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public E2BListedSandbox setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public E2BListedSandbox setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BListedSandbox setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BListedSandbox setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public E2BListedSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BListedSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public E2BListedSandbox setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
