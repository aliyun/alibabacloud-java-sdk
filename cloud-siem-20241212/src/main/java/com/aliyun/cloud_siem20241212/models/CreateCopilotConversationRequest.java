// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateCopilotConversationRequest extends TeaModel {
    /**
     * <p>The language of the returned message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The model identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.7-max</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The planning configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PlanMode")
    public String planMode;

    /**
     * <p>The ID of the security project.</p>
     * 
     * <strong>example:</strong>
     * <p>project-incident-****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region of the data management center for threat analysis. Select the region of the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets reside outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The deep thinking configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ThinkingMode")
    public String thinkingMode;

    /**
     * <p>The title of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>Security event investigation</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The trace ID of the created span object.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateCopilotConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotConversationRequest self = new CreateCopilotConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCopilotConversationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCopilotConversationRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateCopilotConversationRequest setPlanMode(String planMode) {
        this.planMode = planMode;
        return this;
    }
    public String getPlanMode() {
        return this.planMode;
    }

    public CreateCopilotConversationRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateCopilotConversationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCopilotConversationRequest setThinkingMode(String thinkingMode) {
        this.thinkingMode = thinkingMode;
        return this;
    }
    public String getThinkingMode() {
        return this.thinkingMode;
    }

    public CreateCopilotConversationRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateCopilotConversationRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
