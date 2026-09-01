// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-08-28T12:00:00.000Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmz7h4ocksp5y</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("runtimeConfig")
    public PublicTemplateRuntimeConfig runtimeConfig;

    @NameInMap("status")
    public PublicTemplateStatus status;

    /**
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>my-team</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <strong>example:</strong>
     * <p>w0aipmi0rvn5xqdnsihg</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static PublicTemplate build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplate self = new PublicTemplate();
        return TeaModel.build(map, self);
    }

    public PublicTemplate setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PublicTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublicTemplate setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public PublicTemplate setRuntimeConfig(PublicTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public PublicTemplate setStatus(PublicTemplateStatus status) {
        this.status = status;
        return this;
    }
    public PublicTemplateStatus getStatus() {
        return this.status;
    }

    public PublicTemplate setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicTemplate setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public PublicTemplate setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
