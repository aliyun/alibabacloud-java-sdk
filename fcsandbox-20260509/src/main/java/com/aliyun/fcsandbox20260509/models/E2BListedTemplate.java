// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BListedTemplate extends TeaModel {
    /**
     * <p>The build status of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("buildStatus")
    public String buildStatus;

    /**
     * <p>The category of the template.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The container image configuration of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;image&quot;:&quot;registry.cn-hangzhou.aliyuncs.com/demo/nginx:latest&quot;}</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>The number of CPU cores configured for the template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpuCount")
    public Integer cpuCount;

    /**
     * <p>The time when the template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The name of the Function Compute function corresponding to the template.</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>The log configuration of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;project&quot;:&quot;sandbox-project&quot;,&quot;logstore&quot;:&quot;sandbox-logstore&quot;}</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>The memory size configured for the template, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memoryMB")
    public Integer memoryMB;

    /**
     * <p>The list of template names.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;my-template&quot;]</p>
     */
    @NameInMap("names")
    public java.util.List<String> names;

    /**
     * <p>Indicates whether the template is publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("public")
    public Boolean _public;

    /**
     * <p>The ID of the resource group to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The reason for the build status of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>Image pull failed</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>The list of tags for the template.</p>
     */
    @NameInMap("tags")
    public java.util.List<E2BTemplateTag> tags;

    /**
     * <p>The unique identifier of the team to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name of the team to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my-team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The plan of the team to which the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>Pro</p>
     */
    @NameInMap("teamPlan")
    public String teamPlan;

    /**
     * <p>The unique identifier of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>your-template-id</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <p>The time when the template was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The ID of the user who created the template.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("userID")
    public String userID;

    public static E2BListedTemplate build(java.util.Map<String, ?> map) throws Exception {
        E2BListedTemplate self = new E2BListedTemplate();
        return TeaModel.build(map, self);
    }

    public E2BListedTemplate setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }
    public String getBuildStatus() {
        return this.buildStatus;
    }

    public E2BListedTemplate setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public E2BListedTemplate setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public E2BListedTemplate setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BListedTemplate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BListedTemplate setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public E2BListedTemplate setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public E2BListedTemplate setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BListedTemplate setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public E2BListedTemplate set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public E2BListedTemplate setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BListedTemplate setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BListedTemplate setTags(java.util.List<E2BTemplateTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<E2BTemplateTag> getTags() {
        return this.tags;
    }

    public E2BListedTemplate setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BListedTemplate setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BListedTemplate setTeamPlan(String teamPlan) {
        this.teamPlan = teamPlan;
        return this;
    }
    public String getTeamPlan() {
        return this.teamPlan;
    }

    public E2BListedTemplate setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BListedTemplate setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public E2BListedTemplate setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
