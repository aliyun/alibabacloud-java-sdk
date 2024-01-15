// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    @NameInMap("AdminAccess")
    public String adminAccess;

    /**
     * <p>Specifies whether to enable the anti-screenshot feature. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    /**
     * <p>The client CIDR blocks in the whitelist.</p>
     */
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    /**
     * <p>The security group rules.</p>
     */
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>Specifies whether to enable the webcam redirection feature. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     * <br>
     * <p>Default value: on.</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The logon methods.</p>
     */
    @NameInMap("ClientType")
    public java.util.List<ModifyPolicyGroupRequestClientType> clientType;

    /**
     * <p>The permissions on clipboards. Valid values:</p>
     * <br>
     * <p>*   read: specifies one-way transfer. You can copy data from your computer to cloud desktops, but cannot copy data from cloud desktops to your computer.</p>
     * <p>*   readwrite: specifies two-way transfer. You can copy data between your computer and cloud desktops.</p>
     * <p>*   off: specifies that the two-way transfer is disabled. You cannot copy data between your computer and cloud desktops.</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>The domain blacklist or whitelist. Wildcard domains are supported. Separate domain names with commas (,). Valid values:</p>
     * <br>
     * <p>*   \[black:],example1.com,example2.com: the domain name blacklist.</p>
     * <p>*   \[white:],example1.com,example2.com: the domain name whitelist.</p>
     */
    @NameInMap("DomainList")
    public String domainList;

    /**
     * <p>The details of the DNS rule.</p>
     */
    @NameInMap("DomainResolveRule")
    public java.util.List<ModifyPolicyGroupRequestDomainResolveRule> domainResolveRule;

    /**
     * <p>The DNS rule type.</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <p>The user applies for the administrator assistance switch. Value range: </p>
     * <p>* on </p>
     * <p>* off</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <p>The flow collaboration switch between users. Value range: </p>
     * <p>* on </p>
     * <p>* off</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    /**
     * <p>Specifies whether to enable the image display quality feature for the Graphics cloud desktop. If your business requires high desktop performance and optimal user experience, we recommend that you enable this feature. For example, you can enable this policy in professional design scenarios. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    /**
     * <p>Specifies whether to allow the access from HTM5 clients to a cloud desktop. Valid values:</p>
     * <br>
     * <p>*   on: allows the access.</p>
     * <p>*   off: denies the access.</p>
     * <br>
     * <p>Default value: off.</p>
     * <br>
     * <p>>  We recommend that you use the ClientType-related parameters to control the EDS client type for cloud desktop logon.</p>
     */
    @NameInMap("Html5Access")
    public String html5Access;

    /**
     * <p>The file transfer policy for HTML5 clients. Valid values:</p>
     * <br>
     * <p>*   off: Files cannot be uploaded from or downloaded to HTML5 clients.</p>
     * <p>*   upload: Files can be uploaded from HTML5 clients.</p>
     * <p>*   download: Files can be downloaded to HTML5 clients.</p>
     * <p>*   all: Files can be uploaded from and downloaded to HTML5 clients.</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The protocol that you want to use for network communication. Valid values:</p>
     * <br>
     * <p>* TCP: Only the TCP protocol is used.</p>
     * <p>* BOTH: allows automatic switchover between the TCP protocol and the UDP protocol.</p>
     * <br>
     * <p>Default value: TCP.</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <p>The permissions on local disk mapping. Valid values:</p>
     * <br>
     * <p>*   read: read-only permissions. Local disks are mapped to cloud desktops. You can only read (copy) local files but cannot modify them.</p>
     * <p>*   readwrite: read and write permissions. Local disks are mapped to cloud desktops. You can read (copy) and modify local files.</p>
     * <p>*   off: no permissions. Local disks are not mapped to cloud desktops.</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network redirection feature. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("NetRedirect")
    public String netRedirect;

    /**
     * <p>The ID of the policy.</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>Specifies whether to allow user preemption. Default value: off. You cannot change the value.</p>
     */
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    /**
     * <p>The names of the users that are allowed to connect to the same cloud desktop at the same time. You can specify up to five usernames.</p>
     * <br>
     * <p>> To improve user experience and ensure data security, multiple end users cannot connect to the same cloud desktop at the same time.</p>
     */
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    /**
     * <p>Specifies whether to enable printer redirection. Valid values:</p>
     * <br>
     * <p>*   off: disables printer redirection.</p>
     * <p>*   on: enables printer redirection.</p>
     */
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    /**
     * <p>Specifies whether to enable the custom screen recording feature. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("RecordContent")
    public String recordContent;

    /**
     * <p>The duration in which the custom screen recording is valid. Default value: 30. Unit: days.</p>
     */
    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    /**
     * <p>Specifies whether to enable screen recording. Valid values:</p>
     * <br>
     * <p>* OFF: disabled.</p>
     * <p>* ALLTIME: All operations that are performed by an end user on the cloud desktop are recorded. The recording immediately starts when the end user connects to the cloud desktop and ends after the end user disconnects from the cloud desktop.</p>
     * <p>* PERIOD: The operations that are performed by an end user on the cloud desktop during a specific period of time are recorded. You must specify the start time and the end time of the recording.</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <p>Specifies whether to record the sound that is generated on the cloud desktop during screen recording. Valid values:</p>
     * <br>
     * <p>* on</p>
     * <p>* off</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <p>This parameter takes effect based on the Recording-related parameters. You can specify a time range for screen recording, and recording files are generated after the specified end time is reached.</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <p>The time when the screen recording ends. Specify the value in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <p>The period in which the screen recording audit is valid. Valid values: 15 to 180. Unit: days.</p>
     */
    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    /**
     * <p>The frame rate of screen recording. Unit: fps. Valid values:</p>
     * <br>
     * <p>* 2</p>
     * <p>* 5</p>
     * <p>* 10</p>
     * <p>* 15</p>
     */
    @NameInMap("RecordingFps")
    public Long recordingFps;

    /**
     * <p>The time when the screen recording starts. Specify the value in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <p>The ID of the region where the cloud desktop resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The permissions on the keyboard and mouse to control the cloud desktop during remote assistance. Valid values:</p>
     * <br>
     * <p>* fullControl: The keyboard and mouse can be fully controlled.</p>
     * <p>* optionalControl: By default, this feature is disabled. You can apply for permissions to enable the feature.</p>
     * <p>* disableControl: The keyboard and mouse cannot be controlled.</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <p>The security group rules that you want to delete.</p>
     */
    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    /**
     * <p>The security group rules that you want to delete.</p>
     */
    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    /**
     * <p>The effective scope of the policy. Valid values:</p>
     * <br>
     * <p>* GLOBAL: takes effect globally.</p>
     * <p>* IP: takes effect based on the IP address.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>This parameter is required when the Scope parameter is set to IP.</p>
     */
    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <p>Specifies whether to enable USB redirection. Valid values:</p>
     * <br>
     * <p>*   on: enables USB redirection.</p>
     * <p>*   off: disables USB redirection.</p>
     */
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    /**
     * <p>The USB redirection rules.</p>
     */
    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    /**
     * <p>The multimedia redirection feature.</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <p>Specify whether to enable the policy of image display quality. Valid values:</p>
     * <br>
     * <p>*   on: enables the policy of image display quality.</p>
     * <p>*   off: disables the policy of image display quality.</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <p>Specifies whether to enable watermarking. Valid values:</p>
     * <br>
     * <p>*   on: enables watermarking.</p>
     * <p>*   off: disables watermarking.</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
     */
    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    /**
     * <p>The inclination angle of the watermark. Value values: -10 to -30.</p>
     */
    @NameInMap("WatermarkDegree")
    public Double watermarkDegree;

    /**
     * <p>The font size of the watermark. Valid values: 10 to 50</p>
     */
    @NameInMap("WatermarkFontSize")
    public Integer watermarkFontSize;

    /**
     * <p>The font style of the watermark. Valid values:</p>
     * <br>
     * <p>* plain</p>
     * <p>* bold</p>
     */
    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    /**
     * <p>The number of watermark rows. This parameter is not in use.</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <p>The security priority rule for invisible watermarks. Valid values: on and off.</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    /**
     * <p>The transparency of the watermark. The valid values include:</p>
     * <br>
     * <p>*   LIGHT</p>
     * <p>*   MIDDLE</p>
     * <p>*   DARK</p>
     */
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    /**
     * <p>The transparency of the watermark. A larger value indicates a less transparent watermark. Valid values: 10 to 100.</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <p>The type of the watermark. You can specify multiple watermark types at a time. Separate watermark types with commas (,). Valid values:</p>
     * <br>
     * <p>*   EndUserId: the username</p>
     * <p>*   HostName: the last 15 characters of the cloud desktop ID</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

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

    public static class ModifyPolicyGroupRequestAuthorizeAccessPolicyRule extends TeaModel {
        /**
         * <p>The CIDR block that the client can access.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP address whitelist.</p>
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
         * <p>The object to which the security group rule applies. The value is an IPv4 CIDR block.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of security group rule N.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of security group rule N. Valid values:</p>
         * <br>
         * <p>*   tcp: TCP</p>
         * <p>*   udp: UDP</p>
         * <p>*   icmp: ICMP (IPv4)</p>
         * <p>*   gre: GRE</p>
         * <p>*   all: all protocols</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of security group rule N. Valid values:</p>
         * <br>
         * <p>*   accept: specifies the Allow policy that allows all access requests.</p>
         * <p>*   drop: specifies the Deny policy that denies all access requests. If no messages of access denied are returned, the requests time out or failed.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of security group rule N. The value of the port range is determined by the protocol type specified by the AuthorizeSecurityPolicyRule.N.IpProtocol parameter.</p>
         * <br>
         * <p>*   When the AuthorizeSecurityPolicyRule.N.IpProtocol parameter is set to tcp or udp, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
         * <p>*   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to icmp, set the value to -1/-1.</p>
         * <p>*   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to gre, set the value to -1/-1.</p>
         * <p>*   When AuthorizeSecurityPolicyRule.N.IpProtocol is set to all, set the value to -1/-1.</p>
         * <br>
         * <p>For more information about the common ports of typical applications, see [Common ports](~~40724~~).</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of security group rule N. A smaller value indicates a higher priority.</p>
         * <br>
         * <p>Valid values: 1 to 60.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of security group rule N. Valid values:</p>
         * <br>
         * <p>*   inflow: inbound</p>
         * <p>*   outflow: outbound</p>
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
         * <p>The type of client that you want to use to connect to the cloud desktop. Valid values:</p>
         * <br>
         * <p>* windows: the Windows client</p>
         * <p>* linux: C-Key Series Cloud Computer TC and A Series Cloud Computer TC</p>
         * <p>* macos: the macOS client</p>
         * <p>* ios: the iOS client</p>
         * <p>* android: the Android client</p>
         * <p>* html5: the web client</p>
         * <br>
         * <p>> By default, if you do not configure the ClientType-related parameters, all types of clients are allowed to connect to the cloud desktop.</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The logon method. This parameter specifies whether a specific type of the client is allowed to connect to the cloud desktop. Valid values:</p>
         * <br>
         * <p>* on: allowed.</p>
         * <p>* off: disallowed.</p>
         * <br>
         * <p>> By default, if you do not configure the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.</p>
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

    public static class ModifyPolicyGroupRequestDomainResolveRule extends TeaModel {
        /**
         * <p>The description of the DNS rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Specifies whether to allow the DNS rule.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   allow</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   block</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
         * <p>The IPv4 CIDR block that can be accessed from the client.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP address whitelist that you want to delete.</p>
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
         * <p>The IPv4 CIDR block of the security group rule.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule. Valid values:</p>
         * <br>
         * <p>* TCP</p>
         * <p>* UDP</p>
         * <p>* ICMP: ICMP (IPv4)</p>
         * <p>* GRE</p>
         * <p>* ALL</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group rule that you want to delete. Valid values:</p>
         * <br>
         * <p>* accept: allows all access requests.</p>
         * <p>* drop: disallows all access requests. If no denied messages are returned, the requests timed out or failed.</p>
         * <br>
         * <p>Default value: accept.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule that you want to delete. The value of the port range is determined by the protocol type specified by the IpProtocol parameter.</p>
         * <br>
         * <p>* If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. The start port number and the end port number are separated by a forward slash (/). Example: 1/200.</p>
         * <p>* If the IpProtocol parameter is set to ICMP, the port range is -1/-1.</p>
         * <p>* If the IpProtocol parameter is set to GRE, the port range is -1/-1.</p>
         * <p>* If the IpProtocol parameter is set to ALL, the port range is -1/-1.</p>
         * <br>
         * <p>For more information about the common ports of typical applications, see [Common ports](https://www.alibabacloud.com/help/en/ecs/user-guide/common-ports?spm=a2c63.p38356.0.0.56b87f2c2SJTAw).</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority.</p>
         * <br>
         * <p>Valid values: 1 to 60.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule that you want to delete. Valid values:</p>
         * <br>
         * <p>* inflow: inbound</p>
         * <p>* outflow: outbound</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The class of the device. This parameter is required when you set the usbRuleType parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes?spm=a2c63.p38356.0.0.56b84b03GUn4kJ).</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The subclass of the device. This parameter is required when you set the usbRuleType parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes?spm=a2c63.p38356.0.0.56b84b03GUn4kJ).</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Specifies whether to allow USB redirection. Valid values:</p>
         * <br>
         * <p>* 1: allowed.</p>
         * <p>* 2: disallowed.</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule. Valid values:</p>
         * <br>
         * <p>* 1: device class.</p>
         * <p>* 2: device vendor.</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The ID of the vendor. For more information, see[ Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf?spm=a2c63.p38356.0.0.56b84b03GUn4kJ&file=vendor_ids032322.pdf_1.pdf).</p>
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
