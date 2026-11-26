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
     * <p>The access URL of the application. This URL is generated and returned as-is by RM when the deployment snapshot ready=true, and is not filtered again based on Status or ObservationStale. If not provided, this parameter is empty or omitted.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://abc123.app.pre.datapaw-app.cloud">https://abc123.app.pre.datapaw-app.cloud</a></p>
     */
    @NameInMap("AppUrl")
    public String appUrl;

    /**
     * <p>The extended information of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ApplicationExtraInfo")
    public String applicationExtraInfo;

    /**
     * <p>The control revision number of the application. The initial value is 0. This number increments after a control request is accepted and can be passed as ExpectedRevision.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ApplicationRevision")
    public Long applicationRevision;

    /**
     * <p>The error code for the current service unavailability, which is expressed separately from the error code of the most recent control request. If no error occurs, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>SCRIPT_EXIT_FAILED</p>
     */
    @NameInMap("AvailabilityErrorCode")
    public String availabilityErrorCode;

    /**
     * <p>The summary of the cause for the current service unavailability. If no error occurs, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>stage=script, exitCode=2</p>
     */
    @NameInMap("AvailabilityErrorMessage")
    public String availabilityErrorMessage;

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
     * <p>The description of the application, which can be up to 250 characters in length.</p>
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
     * <p>The most recent user control request. If no control request has been made, this parameter is empty.</p>
     */
    @NameInMap("LastRequest")
    public DataAgentApplicationLastRequest lastRequest;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1673828888852166</p>
     */
    @NameInMap("MainUid")
    public String mainUid;

    /**
     * <p>Specifies whether the runtime or service observation is missing or stale. If this parameter is set to true, the availability information may be outdated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ObservationStale")
    public Boolean observationStale;

    /**
     * <p>Specifies whether the current platform service is available. This does not indicate whether the most recent control request succeeded or whether the business components are healthy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ready")
    public Boolean ready;

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
     * <li>PREPARING</li>
     * <li>WAITING_AGREEMENT: Indicates that the system is waiting for the owner of the target workspace to sign a valid agreement. The original deployment or restart request is still being executed. After the agreement is signed, RM automatically resumes the original request.</li>
     * <li>SEALING</li>
     * <li>REVIEWING</li>
     * <li>DEPLOYING</li>
     * <li>DEPLOYED</li>
     * <li>DEPLOY_FAILED</li>
     * <li>STOPPING</li>
     * <li>STOPPED</li>
     * <li>STOP_FAILED</li>
     * <li>RECOVERING</li>
     * <li>UNAVAILABLE</li>
     * <li>DELETING</li>
     * <li>DELETE_FAILED</li>
     * <li>DELETED: The logical deletion terminal state. The application no longer appears in List or Describe operations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REGISTERED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the vSwitch used for the actual deployment of the currently running application. If no resources are currently running, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-example</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC used for the actual deployment of the currently running application. If no resources are currently running, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-example</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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

    public DataAgentApplication setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
    public String getAppUrl() {
        return this.appUrl;
    }

    public DataAgentApplication setApplicationExtraInfo(String applicationExtraInfo) {
        this.applicationExtraInfo = applicationExtraInfo;
        return this;
    }
    public String getApplicationExtraInfo() {
        return this.applicationExtraInfo;
    }

    public DataAgentApplication setApplicationRevision(Long applicationRevision) {
        this.applicationRevision = applicationRevision;
        return this;
    }
    public Long getApplicationRevision() {
        return this.applicationRevision;
    }

    public DataAgentApplication setAvailabilityErrorCode(String availabilityErrorCode) {
        this.availabilityErrorCode = availabilityErrorCode;
        return this;
    }
    public String getAvailabilityErrorCode() {
        return this.availabilityErrorCode;
    }

    public DataAgentApplication setAvailabilityErrorMessage(String availabilityErrorMessage) {
        this.availabilityErrorMessage = availabilityErrorMessage;
        return this;
    }
    public String getAvailabilityErrorMessage() {
        return this.availabilityErrorMessage;
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

    public DataAgentApplication setLastRequest(DataAgentApplicationLastRequest lastRequest) {
        this.lastRequest = lastRequest;
        return this;
    }
    public DataAgentApplicationLastRequest getLastRequest() {
        return this.lastRequest;
    }

    public DataAgentApplication setMainUid(String mainUid) {
        this.mainUid = mainUid;
        return this;
    }
    public String getMainUid() {
        return this.mainUid;
    }

    public DataAgentApplication setObservationStale(Boolean observationStale) {
        this.observationStale = observationStale;
        return this;
    }
    public Boolean getObservationStale() {
        return this.observationStale;
    }

    public DataAgentApplication setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }
    public Boolean getReady() {
        return this.ready;
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

    public DataAgentApplication setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DataAgentApplication setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DataAgentApplication setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class DataAgentApplicationLastRequest extends TeaModel {
        /**
         * <p>The control action. Valid values:</p>
         * <ul>
         * <li>DEPLOY</li>
         * <li>STOP</li>
         * <li>RESTART</li>
         * <li>DELETE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESTART</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The error code for the failure of the most recent user control request. If no error occurs, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT_EXIT_FAILED</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The summary of the failure cause for the most recent user control request. If no error occurs, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>stage=script, exitCode=2</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static DataAgentApplicationLastRequest build(java.util.Map<String, ?> map) throws Exception {
            DataAgentApplicationLastRequest self = new DataAgentApplicationLastRequest();
            return TeaModel.build(map, self);
        }

        public DataAgentApplicationLastRequest setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DataAgentApplicationLastRequest setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DataAgentApplicationLastRequest setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

}
