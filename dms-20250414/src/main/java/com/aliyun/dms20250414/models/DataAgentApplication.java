// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DataAgentApplication extends TeaModel {
    /**
     * <p>The ID of the currently associated Data Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>avgwuxxxxxxxxhldt7el9</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The stable identifier of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>ac6izw6xxxxxxxxxxx3ulya0d</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app-name</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The extension information of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ApplicationExtraInfo")
    public String applicationExtraInfo;

    /**
     * <p>The name of the application creator.</p>
     * 
     * <strong>example:</strong>
     * <p>test-name</p>
     */
    @NameInMap("CreatorName")
    public String creatorName;

    /**
     * <p>The UID of the application owner.</p>
     * 
     * <strong>example:</strong>
     * <p>30031588888885853</p>
     */
    @NameInMap("CreatorUid")
    public String creatorUid;

    /**
     * <p>The description of the application. The description can be up to 250 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the application was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-12T10:40:12.000+00:00</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The time when the application was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-12T10:40:12.000+00:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1673828888852166</p>
     */
    @NameInMap("MainUid")
    public String mainUid;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the current or most recently associated session.</p>
     * 
     * <strong>example:</strong>
     * <p>axc3lsxxxxxxxxxdapwe</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The status of the application. Valid values:</p>
     * <ul>
     * <li>REGISTERED</li>
     * <li>DEPLOYING</li>
     * <li>DEPLOYED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REGISTERED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>3700inkdc2y7zs0r37m5pika6</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DataAgentApplication build(java.util.Map<String, ?> map) throws Exception {
        DataAgentApplication self = new DataAgentApplication();
        return TeaModel.build(map, self);
    }

    public DataAgentApplication setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DataAgentApplication setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DataAgentApplication setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DataAgentApplication setApplicationExtraInfo(String applicationExtraInfo) {
        this.applicationExtraInfo = applicationExtraInfo;
        return this;
    }
    public String getApplicationExtraInfo() {
        return this.applicationExtraInfo;
    }

    public DataAgentApplication setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public DataAgentApplication setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
        return this;
    }
    public String getCreatorUid() {
        return this.creatorUid;
    }

    public DataAgentApplication setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataAgentApplication setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DataAgentApplication setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DataAgentApplication setMainUid(String mainUid) {
        this.mainUid = mainUid;
        return this;
    }
    public String getMainUid() {
        return this.mainUid;
    }

    public DataAgentApplication setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DataAgentApplication setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DataAgentApplication setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataAgentApplication setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
