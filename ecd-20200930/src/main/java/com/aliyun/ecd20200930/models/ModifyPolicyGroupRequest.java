// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether a user has administrative permissions after logging on to the cloud computer.</p>
     * <blockquote>
     * <p>This feature is available only for invitational preview. It is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AdminAccess")
    public String adminAccess;

    /**
     * <p>Specifies whether to enable screen capture prevention.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    /**
     * <p>The client IP address whitelist.</p>
     */
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    /**
     * <p>A list of security group rules.</p>
     */
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>Specifies whether to enable local camera redirection.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>A list of logon method control rules.</p>
     */
    @NameInMap("ClientType")
    public java.util.List<ModifyPolicyGroupRequestClientType> clientType;

    /**
     * <p>The clipboard redirection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>The device redirection rules.</p>
     */
    @NameInMap("DeviceRedirects")
    public java.util.List<ModifyPolicyGroupRequestDeviceRedirects> deviceRedirects;

    /**
     * <p>The custom peripheral device rules.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("DeviceRules")
    public java.util.List<ModifyPolicyGroupRequestDeviceRules> deviceRules;

    /**
     * <p>The domain names that can be accessed. Wildcard characters (\*) are supported. Separate multiple domain names with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("DomainList")
    public String domainList;

    /**
     * <p>The details of the domain name resolution policy.</p>
     */
    @NameInMap("DomainResolveRule")
    public java.util.List<ModifyPolicyGroupRequestDomainResolveRule> domainResolveRule;

    /**
     * <p>The type of domain name resolution policy.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <p>Specifies whether to allow users to request assistance from the administrator.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <p>Specifies whether to enable stream collaboration between users.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    /**
     * <p>Specifies whether to enable the image quality policy for graphics cloud desktops. Enabling this policy improves performance and user experience in professional design scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    /**
     * <p>The policy for access from web clients.</p>
     * <blockquote>
     * <p>Use the <code>ClientType</code> parameter to manage logon methods.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5Access")
    public String html5Access;

    /**
     * <p>The policy for file transfers from web clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The network communication protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>BOTH</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <p>The local disk mapping policy.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>The maximum amount of time that the client can attempt to reconnect to the cloud computer after an unexpected disconnection. Valid values: 30 to 7200. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MaxReconnectTime")
    public Integer maxReconnectTime;

    /**
     * <p>The name of the cloud computer policy.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyGroupName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable network redirection.</p>
     * <blockquote>
     * <p>This feature is available only for invitational preview. It is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("NetRedirect")
    public String netRedirect;

    /**
     * <p>The ID of the cloud computer policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The policy for preemptible logon.</p>
     * <blockquote>
     * <p>To ensure the user experience and data security of the current user, other users cannot preempt the cloud computer. This parameter is set to <code>off</code> by default and cannot be changed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    /**
     * <p>The usernames of users who can preempt the logon of a cloud computer. You can specify up to five usernames.</p>
     * <blockquote>
     * <p>To ensure the user experience and data security of the current user, other users cannot preempt the cloud computer.</p>
     * </blockquote>
     */
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    /**
     * <p>The printer redirection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    /**
     * <p>Specifies whether to enable custom screen recording.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("RecordContent")
    public String recordContent;

    /**
     * <p>The expiration time of custom screen recording files. The default value is 30. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    /**
     * <p>Specifies whether to enable screen recording.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <p>Specifies whether to record audio from the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <p>The duration for viewing a screen recording file. Unit: minutes. The recorded files are automatically split into chunks and uploaded to a bucket based on the specified duration. When a file reaches 300 MB, it is overwritten on a rolling basis.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <p>The end time of the screen recording. The time is in the HH:MM:SS format. This parameter is valid only when \<code>Recording\\</code> is set to \<code>PERIOD\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:59:00</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <p>The retention period of screen recording files. Valid values: 1 to 180. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    /**
     * <p>The frame rate for screen recording. Unit: frames per second (fps).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RecordingFps")
    public Long recordingFps;

    /**
     * <p>The start time of the screen recording. The time is in the HH:MM:SS format. This parameter is valid only when \<code>Recording\\</code> is set to \<code>PERIOD\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <p>Specifies whether to send a notification to the client when a screen recording starts.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RecordingUserNotify")
    public String recordingUserNotify;

    /**
     * <p>The content of the screen recording notification. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>Your cloud desktop is being recorded.</p>
     */
    @NameInMap("RecordingUserNotifyMessage")
    public String recordingUserNotifyMessage;

    /**
     * <p>The ID of the region. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions that WUYING Workspace supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remote assistance policy for keyboard and mouse control.</p>
     * 
     * <strong>example:</strong>
     * <p>fullControl</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <p>The client IP address whitelist to delete.</p>
     */
    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    /**
     * <p>The security group rules to delete.</p>
     */
    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    /**
     * <p>The scope of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The value of the scope. This parameter is valid only when \<code>Scope\\</code> is set to \<code>IP\\</code>.</p>
     */
    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <p>The USB redirection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    /**
     * <p>The USB redirection rules.</p>
     */
    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    /**
     * <p>Specifies whether to enable multimedia redirection.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <p>The image display quality.</p>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <p>The watermark policy.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <p>Specifies whether to enable the screen capture prevention watermark feature.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkAntiCam")
    public String watermarkAntiCam;

    /**
     * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    /**
     * <p>The angle of the watermark. Valid values: -10 to -30.</p>
     * 
     * <strong>example:</strong>
     * <p>-10</p>
     */
    @NameInMap("WatermarkDegree")
    public Double watermarkDegree;

    /**
     * <p>The font size of the watermark. Valid values: 10 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkFontSize")
    public Integer watermarkFontSize;

    /**
     * <p>The font style of the watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>plain</p>
     */
    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    /**
     * <p>The strength of the blind watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("WatermarkPower")
    public String watermarkPower;

    /**
     * <p>The number of watermark rows.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <p>The security priority rule for watermarks.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    /**
     * <p>The transparency of the watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>LIGHT</p>
     */
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    /**
     * <p>The transparency of the watermark. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <p>The type of watermark. You can specify up to three types. Separate them with commas.</p>
     * <blockquote>
     * <p>If you set this parameter to <code>Custom</code>, you must also specify the custom text in the <code>WatermarkCustomText</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EndUserId</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    /**
     * <p>Specifies whether to display the entry for Alibaba Cloud AI Assistant in the floating bar of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("WyAssistant")
    public String wyAssistant;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupRequest setAdminAccess(String adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }
    public String getAdminAccess() {
        return this.adminAccess;
    }

    public ModifyPolicyGroupRequest setAppContentProtection(String appContentProtection) {
        this.appContentProtection = appContentProtection;
        return this;
    }
    public String getAppContentProtection() {
        return this.appContentProtection;
    }

    public ModifyPolicyGroupRequest setAuthorizeAccessPolicyRule(java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
        this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    public ModifyPolicyGroupRequest setAuthorizeSecurityPolicyRule(java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
        this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    public ModifyPolicyGroupRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public ModifyPolicyGroupRequest setClientType(java.util.List<ModifyPolicyGroupRequestClientType> clientType) {
        this.clientType = clientType;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestClientType> getClientType() {
        return this.clientType;
    }

    public ModifyPolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupRequest setDeviceRedirects(java.util.List<ModifyPolicyGroupRequestDeviceRedirects> deviceRedirects) {
        this.deviceRedirects = deviceRedirects;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestDeviceRedirects> getDeviceRedirects() {
        return this.deviceRedirects;
    }

    public ModifyPolicyGroupRequest setDeviceRules(java.util.List<ModifyPolicyGroupRequestDeviceRules> deviceRules) {
        this.deviceRules = deviceRules;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestDeviceRules> getDeviceRules() {
        return this.deviceRules;
    }

    public ModifyPolicyGroupRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public ModifyPolicyGroupRequest setDomainResolveRule(java.util.List<ModifyPolicyGroupRequestDomainResolveRule> domainResolveRule) {
        this.domainResolveRule = domainResolveRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestDomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    public ModifyPolicyGroupRequest setDomainResolveRuleType(String domainResolveRuleType) {
        this.domainResolveRuleType = domainResolveRuleType;
        return this;
    }
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
    }

    public ModifyPolicyGroupRequest setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
        this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
        return this;
    }
    public String getEndUserApplyAdminCoordinate() {
        return this.endUserApplyAdminCoordinate;
    }

    public ModifyPolicyGroupRequest setEndUserGroupCoordinate(String endUserGroupCoordinate) {
        this.endUserGroupCoordinate = endUserGroupCoordinate;
        return this;
    }
    public String getEndUserGroupCoordinate() {
        return this.endUserGroupCoordinate;
    }

    public ModifyPolicyGroupRequest setGpuAcceleration(String gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public ModifyPolicyGroupRequest setHtml5Access(String html5Access) {
        this.html5Access = html5Access;
        return this;
    }
    public String getHtml5Access() {
        return this.html5Access;
    }

    public ModifyPolicyGroupRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public ModifyPolicyGroupRequest setInternetCommunicationProtocol(String internetCommunicationProtocol) {
        this.internetCommunicationProtocol = internetCommunicationProtocol;
        return this;
    }
    public String getInternetCommunicationProtocol() {
        return this.internetCommunicationProtocol;
    }

    public ModifyPolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupRequest setMaxReconnectTime(Integer maxReconnectTime) {
        this.maxReconnectTime = maxReconnectTime;
        return this;
    }
    public Integer getMaxReconnectTime() {
        return this.maxReconnectTime;
    }

    public ModifyPolicyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPolicyGroupRequest setNetRedirect(String netRedirect) {
        this.netRedirect = netRedirect;
        return this;
    }
    public String getNetRedirect() {
        return this.netRedirect;
    }

    public ModifyPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupRequest setPreemptLogin(String preemptLogin) {
        this.preemptLogin = preemptLogin;
        return this;
    }
    public String getPreemptLogin() {
        return this.preemptLogin;
    }

    public ModifyPolicyGroupRequest setPreemptLoginUser(java.util.List<String> preemptLoginUser) {
        this.preemptLoginUser = preemptLoginUser;
        return this;
    }
    public java.util.List<String> getPreemptLoginUser() {
        return this.preemptLoginUser;
    }

    public ModifyPolicyGroupRequest setPrinterRedirection(String printerRedirection) {
        this.printerRedirection = printerRedirection;
        return this;
    }
    public String getPrinterRedirection() {
        return this.printerRedirection;
    }

    public ModifyPolicyGroupRequest setRecordContent(String recordContent) {
        this.recordContent = recordContent;
        return this;
    }
    public String getRecordContent() {
        return this.recordContent;
    }

    public ModifyPolicyGroupRequest setRecordContentExpires(Long recordContentExpires) {
        this.recordContentExpires = recordContentExpires;
        return this;
    }
    public Long getRecordContentExpires() {
        return this.recordContentExpires;
    }

    public ModifyPolicyGroupRequest setRecording(String recording) {
        this.recording = recording;
        return this;
    }
    public String getRecording() {
        return this.recording;
    }

    public ModifyPolicyGroupRequest setRecordingAudio(String recordingAudio) {
        this.recordingAudio = recordingAudio;
        return this;
    }
    public String getRecordingAudio() {
        return this.recordingAudio;
    }

    public ModifyPolicyGroupRequest setRecordingDuration(Integer recordingDuration) {
        this.recordingDuration = recordingDuration;
        return this;
    }
    public Integer getRecordingDuration() {
        return this.recordingDuration;
    }

    public ModifyPolicyGroupRequest setRecordingEndTime(String recordingEndTime) {
        this.recordingEndTime = recordingEndTime;
        return this;
    }
    public String getRecordingEndTime() {
        return this.recordingEndTime;
    }

    public ModifyPolicyGroupRequest setRecordingExpires(Long recordingExpires) {
        this.recordingExpires = recordingExpires;
        return this;
    }
    public Long getRecordingExpires() {
        return this.recordingExpires;
    }

    public ModifyPolicyGroupRequest setRecordingFps(Long recordingFps) {
        this.recordingFps = recordingFps;
        return this;
    }
    public Long getRecordingFps() {
        return this.recordingFps;
    }

    public ModifyPolicyGroupRequest setRecordingStartTime(String recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }
    public String getRecordingStartTime() {
        return this.recordingStartTime;
    }

    public ModifyPolicyGroupRequest setRecordingUserNotify(String recordingUserNotify) {
        this.recordingUserNotify = recordingUserNotify;
        return this;
    }
    public String getRecordingUserNotify() {
        return this.recordingUserNotify;
    }

    public ModifyPolicyGroupRequest setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
        this.recordingUserNotifyMessage = recordingUserNotifyMessage;
        return this;
    }
    public String getRecordingUserNotifyMessage() {
        return this.recordingUserNotifyMessage;
    }

    public ModifyPolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPolicyGroupRequest setRemoteCoordinate(String remoteCoordinate) {
        this.remoteCoordinate = remoteCoordinate;
        return this;
    }
    public String getRemoteCoordinate() {
        return this.remoteCoordinate;
    }

    public ModifyPolicyGroupRequest setRevokeAccessPolicyRule(java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule) {
        this.revokeAccessPolicyRule = revokeAccessPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> getRevokeAccessPolicyRule() {
        return this.revokeAccessPolicyRule;
    }

    public ModifyPolicyGroupRequest setRevokeSecurityPolicyRule(java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
        this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
        return this.revokeSecurityPolicyRule;
    }

    public ModifyPolicyGroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ModifyPolicyGroupRequest setScopeValue(java.util.List<String> scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public java.util.List<String> getScopeValue() {
        return this.scopeValue;
    }

    public ModifyPolicyGroupRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public ModifyPolicyGroupRequest setUsbSupplyRedirectRule(java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule) {
        this.usbSupplyRedirectRule = usbSupplyRedirectRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    public ModifyPolicyGroupRequest setVideoRedirect(String videoRedirect) {
        this.videoRedirect = videoRedirect;
        return this;
    }
    public String getVideoRedirect() {
        return this.videoRedirect;
    }

    public ModifyPolicyGroupRequest setVisualQuality(String visualQuality) {
        this.visualQuality = visualQuality;
        return this;
    }
    public String getVisualQuality() {
        return this.visualQuality;
    }

    public ModifyPolicyGroupRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public ModifyPolicyGroupRequest setWatermarkAntiCam(String watermarkAntiCam) {
        this.watermarkAntiCam = watermarkAntiCam;
        return this;
    }
    public String getWatermarkAntiCam() {
        return this.watermarkAntiCam;
    }

    public ModifyPolicyGroupRequest setWatermarkColor(Integer watermarkColor) {
        this.watermarkColor = watermarkColor;
        return this;
    }
    public Integer getWatermarkColor() {
        return this.watermarkColor;
    }

    public ModifyPolicyGroupRequest setWatermarkDegree(Double watermarkDegree) {
        this.watermarkDegree = watermarkDegree;
        return this;
    }
    public Double getWatermarkDegree() {
        return this.watermarkDegree;
    }

    public ModifyPolicyGroupRequest setWatermarkFontSize(Integer watermarkFontSize) {
        this.watermarkFontSize = watermarkFontSize;
        return this;
    }
    public Integer getWatermarkFontSize() {
        return this.watermarkFontSize;
    }

    public ModifyPolicyGroupRequest setWatermarkFontStyle(String watermarkFontStyle) {
        this.watermarkFontStyle = watermarkFontStyle;
        return this;
    }
    public String getWatermarkFontStyle() {
        return this.watermarkFontStyle;
    }

    public ModifyPolicyGroupRequest setWatermarkPower(String watermarkPower) {
        this.watermarkPower = watermarkPower;
        return this;
    }
    public String getWatermarkPower() {
        return this.watermarkPower;
    }

    public ModifyPolicyGroupRequest setWatermarkRowAmount(Integer watermarkRowAmount) {
        this.watermarkRowAmount = watermarkRowAmount;
        return this;
    }
    public Integer getWatermarkRowAmount() {
        return this.watermarkRowAmount;
    }

    public ModifyPolicyGroupRequest setWatermarkSecurity(String watermarkSecurity) {
        this.watermarkSecurity = watermarkSecurity;
        return this;
    }
    public String getWatermarkSecurity() {
        return this.watermarkSecurity;
    }

    public ModifyPolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    public ModifyPolicyGroupRequest setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
        this.watermarkTransparencyValue = watermarkTransparencyValue;
        return this;
    }
    public Integer getWatermarkTransparencyValue() {
        return this.watermarkTransparencyValue;
    }

    public ModifyPolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public ModifyPolicyGroupRequest setWyAssistant(String wyAssistant) {
        this.wyAssistant = wyAssistant;
        return this;
    }
    public String getWyAssistant() {
        return this.wyAssistant;
    }

    public static class ModifyPolicyGroupRequestAuthorizeAccessPolicyRule extends TeaModel {
        /**
         * <p>The client IP address range. Specify the value in CIDR notation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyPolicyGroupRequestAuthorizeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestAuthorizeAccessPolicyRule self = new ModifyPolicyGroupRequestAuthorizeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestAuthorizeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestAuthorizeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule extends TeaModel {
        /**
         * <p>The destination IPv4 address range. Specify the value in CIDR notation.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX/8</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The policy of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule. The value of this parameter depends on the \<code>IpProtocol\\</code> parameter:</p>
         * <ul>
         * <li><p>If the protocol is TCP or UDP, the port range is 1 to 65535. Use a forward slash (/) to separate the start and end port numbers. For example: 1/200.</p>
         * </li>
         * <li><p>If the protocol is ICMP, the port range is -1/-1.</p>
         * </li>
         * <li><p>If the protocol is GRE, the port range is -1/-1.</p>
         * </li>
         * <li><p>If IpProtocol is set to all, the port range is -1/-1.</p>
         * </li>
         * </ul>
         * <p>For more information about common ports, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule self = new ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyPolicyGroupRequestClientType extends TeaModel {
        /**
         * <p>The type of client.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, logons from all client types are allowed by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Specifies whether to allow logons from this client type.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, logons from all client types are allowed by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyPolicyGroupRequestClientType build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestClientType self = new ModifyPolicyGroupRequestClientType();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestClientType setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ModifyPolicyGroupRequestClientType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyPolicyGroupRequestDeviceRedirects extends TeaModel {
        /**
         * <p>The type of peripheral device.</p>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static ModifyPolicyGroupRequestDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestDeviceRedirects self = new ModifyPolicyGroupRequestDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ModifyPolicyGroupRequestDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class ModifyPolicyGroupRequestDeviceRules extends TeaModel {
        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>sandisk</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The product ID (PID).</p>
         * 
         * <strong>example:</strong>
         * <p>0x0781</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <p>The type of peripheral device.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DeviceVid")
        public String deviceVid;

        /**
         * <p>The link optimization command.</p>
         * 
         * <strong>example:</strong>
         * <p>2:0</p>
         */
        @NameInMap("OptCommand")
        public String optCommand;

        @NameInMap("Platforms")
        public String platforms;

        /**
         * <p>The redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static ModifyPolicyGroupRequestDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestDeviceRules self = new ModifyPolicyGroupRequestDeviceRules();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ModifyPolicyGroupRequestDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public ModifyPolicyGroupRequestDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ModifyPolicyGroupRequestDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public ModifyPolicyGroupRequestDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public ModifyPolicyGroupRequestDeviceRules setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public ModifyPolicyGroupRequestDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class ModifyPolicyGroupRequestDomainResolveRule extends TeaModel {
        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Policy description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The resolution policy.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static ModifyPolicyGroupRequestDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestDomainResolveRule self = new ModifyPolicyGroupRequestDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPolicyGroupRequestDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyPolicyGroupRequestDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class ModifyPolicyGroupRequestRevokeAccessPolicyRule extends TeaModel {
        /**
         * <p>The client IP address range to delete. Specify the value in CIDR notation.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP address whitelist to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyPolicyGroupRequestRevokeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestRevokeAccessPolicyRule self = new ModifyPolicyGroupRequestRevokeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestRevokeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestRevokeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyPolicyGroupRequestRevokeSecurityPolicyRule extends TeaModel {
        /**
         * <p>The destination IPv4 address range to delete. Specify the value in CIDR notation.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The policy of the security group rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule to delete. The value of this parameter depends on the \<code>IpProtocol\\</code> parameter:</p>
         * <ul>
         * <li><p>If the protocol is TCP or UDP, the port range is 1 to 65535. Use a forward slash (/) to separate the start and end port numbers. For example: 1/200.</p>
         * </li>
         * <li><p>If the protocol is ICMP, the port range is -1/-1.</p>
         * </li>
         * <li><p>If the protocol is GRE, the port range is -1/-1.</p>
         * </li>
         * <li><p>If IpProtocol is set to all, the port range is -1/-1.</p>
         * </li>
         * </ul>
         * <p>For more information about common ports, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule to delete. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>outflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyPolicyGroupRequestRevokeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestRevokeSecurityPolicyRule self = new ModifyPolicyGroupRequestRevokeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyPolicyGroupRequestUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device class. This parameter is required when \<code>UsbRuleType\\</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0Eh</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The device subclass. This parameter is required when \<code>UsbRuleType\\</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>xxh</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The product ID (PID).</p>
         * 
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The USB redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of USB redirection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static ModifyPolicyGroupRequestUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestUsbSupplyRedirectRule self = new ModifyPolicyGroupRequestUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setDeviceClass(String deviceClass) {
            this.deviceClass = deviceClass;
            return this;
        }
        public String getDeviceClass() {
            return this.deviceClass;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setDeviceSubclass(String deviceSubclass) {
            this.deviceSubclass = deviceSubclass;
            return this;
        }
        public String getDeviceSubclass() {
            return this.deviceSubclass;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setUsbRedirectType(Long usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setUsbRuleType(Long usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        public ModifyPolicyGroupRequestUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
