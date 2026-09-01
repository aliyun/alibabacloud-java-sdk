// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The time when the template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-31T12:00:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B5AD8B54-4358-5F5B-ACAA-52F2016459C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The runtime configuration of the template.</p>
     */
    @NameInMap("runtimeConfig")
    public PublicTemplateRuntimeConfig runtimeConfig;

    /**
     * <p>The template status.</p>
     */
    @NameInMap("status")
    public PublicTemplateStatus status;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The team name.</p>
     * 
     * <strong>example:</strong>
     * <p>codeclaw-localenv</p>
     */
    @NameInMap("teamName")
    public String teamName;

    /**
     * <p>The unique identifier of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-9f3a2b7c8d1e4f5a6b0c7d8e9f1a2b3c</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTemplateResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public GetTemplateResponseBody setRuntimeConfig(PublicTemplateRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public PublicTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public GetTemplateResponseBody setStatus(PublicTemplateStatus status) {
        this.status = status;
        return this;
    }
    public PublicTemplateStatus getStatus() {
        return this.status;
    }

    public GetTemplateResponseBody setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public GetTemplateResponseBody setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public GetTemplateResponseBody setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
