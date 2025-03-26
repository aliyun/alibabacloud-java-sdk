// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCenterPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AdminAccess")
    public String adminAccess;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<CreateCenterPolicyRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<CreateCenterPolicyRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    @NameInMap("ClientType")
    public java.util.List<CreateCenterPolicyRequestClientType> clientType;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ColorEnhancement")
    public String colorEnhancement;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CpuDownGradeDuration")
    public Integer cpuDownGradeDuration;

    @NameInMap("CpuProcessors")
    public java.util.List<String> cpuProcessors;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CpuProtectedMode")
    public String cpuProtectedMode;

    /**
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("CpuRateLimit")
    public Integer cpuRateLimit;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("CpuSampleDuration")
    public Integer cpuSampleDuration;

    /**
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("CpuSingleRateLimit")
    public Integer cpuSingleRateLimit;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("DeviceConnectHint")
    public String deviceConnectHint;

    @NameInMap("DeviceRedirects")
    public java.util.List<CreateCenterPolicyRequestDeviceRedirects> deviceRedirects;

    @NameInMap("DeviceRules")
    public java.util.List<CreateCenterPolicyRequestDeviceRules> deviceRules;

    /**
     * <strong>example:</strong>
     * <p>customTime</p>
     */
    @NameInMap("DisconnectKeepSession")
    public String disconnectKeepSession;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DisconnectKeepSessionTime")
    public Integer disconnectKeepSessionTime;

    /**
     * <strong>example:</strong>
     * <p>clientCustom</p>
     */
    @NameInMap("DisplayMode")
    public String displayMode;

    @NameInMap("DomainResolveRule")
    public java.util.List<CreateCenterPolicyRequestDomainResolveRule> domainResolveRule;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EnableSessionRateLimiting")
    public String enableSessionRateLimiting;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("FileMigrate")
    public String fileMigrate;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <strong>example:</strong>
     * <p>both</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MaxReconnectTime")
    public Integer maxReconnectTime;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemoryDownGradeDuration")
    public Integer memoryDownGradeDuration;

    @NameInMap("MemoryProcessors")
    public java.util.List<String> memoryProcessors;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MemoryProtectedMode")
    public String memoryProtectedMode;

    /**
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("MemoryRateLimit")
    public Integer memoryRateLimit;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemorySampleDuration")
    public Integer memorySampleDuration;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemorySingleRateLimit")
    public Integer memorySingleRateLimit;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileRestart")
    public String mobileRestart;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileShutdown")
    public String mobileShutdown;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyGroupName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("NetRedirect")
    public String netRedirect;

    @NameInMap("NetRedirectRule")
    public java.util.List<CreateCenterPolicyRequestNetRedirectRule> netRedirectRule;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("NoOperationDisconnect")
    public String noOperationDisconnect;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("NoOperationDisconnectTime")
    public Integer noOperationDisconnectTime;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PrinterRedirect")
    public String printerRedirect;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("QualityEnhancement")
    public String qualityEnhancement;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordEventDuration")
    public Integer recordEventDuration;

    @NameInMap("RecordEventFilePaths")
    public java.util.List<String> recordEventFilePaths;

    @NameInMap("RecordEventRegisters")
    public java.util.List<String> recordEventRegisters;

    @NameInMap("RecordEvents")
    public java.util.List<String> recordEvents;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <strong>example:</strong>
     * <p>08:59:00</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingExpires")
    public Integer recordingExpires;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecordingFps")
    public String recordingFps;

    /**
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RecordingUserNotify")
    public String recordingUserNotify;

    @NameInMap("RecordingUserNotifyMessage")
    public String recordingUserNotifyMessage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>fullControl</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ResetDesktop")
    public String resetDesktop;

    /**
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("ResolutionModel")
    public String resolutionModel;

    /**
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("SessionMaxRateKbps")
    public Integer sessionMaxRateKbps;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SmoothEnhancement")
    public String smoothEnhancement;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("StatusMonitor")
    public String statusMonitor;

    /**
     * <strong>example:</strong>
     * <p>smooth</p>
     */
    @NameInMap("StreamingMode")
    public String streamingMode;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TargetFps")
    public Integer targetFps;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Taskbar")
    public String taskbar;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<CreateCenterPolicyRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoEncAvgKbps")
    public Integer videoEncAvgKbps;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("VideoEncMaxQP")
    public Integer videoEncMaxQP;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("VideoEncMinQP")
    public Integer videoEncMinQP;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoEncPeakKbps")
    public Integer videoEncPeakKbps;

    /**
     * <strong>example:</strong>
     * <p>qualityFirst</p>
     */
    @NameInMap("VideoEncPolicy")
    public String videoEncPolicy;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkAntiCam")
    public String watermarkAntiCam;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("WatermarkColumnAmount")
    public Integer watermarkColumnAmount;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WatermarkCustomText")
    public String watermarkCustomText;

    /**
     * <strong>example:</strong>
     * <p>-10</p>
     */
    @NameInMap("WatermarkDegree")
    public Double watermarkDegree;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkFontSize")
    public Integer watermarkFontSize;

    /**
     * <strong>example:</strong>
     * <p>plain</p>
     */
    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    /**
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("WatermarkPower")
    public String watermarkPower;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <strong>example:</strong>
     * <p>EndUserId,HostName,ClientTime</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WuyingKeeper")
    public String wuyingKeeper;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("WyAssistant")
    public String wyAssistant;

    public static CreateCenterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenterPolicyRequest self = new CreateCenterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenterPolicyRequest setAdminAccess(String adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }
    public String getAdminAccess() {
        return this.adminAccess;
    }

    public CreateCenterPolicyRequest setAppContentProtection(String appContentProtection) {
        this.appContentProtection = appContentProtection;
        return this;
    }
    public String getAppContentProtection() {
        return this.appContentProtection;
    }

    public CreateCenterPolicyRequest setAuthorizeAccessPolicyRule(java.util.List<CreateCenterPolicyRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
        this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestAuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    public CreateCenterPolicyRequest setAuthorizeSecurityPolicyRule(java.util.List<CreateCenterPolicyRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
        this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestAuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    public CreateCenterPolicyRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public CreateCenterPolicyRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public CreateCenterPolicyRequest setClientType(java.util.List<CreateCenterPolicyRequestClientType> clientType) {
        this.clientType = clientType;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestClientType> getClientType() {
        return this.clientType;
    }

    public CreateCenterPolicyRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public CreateCenterPolicyRequest setColorEnhancement(String colorEnhancement) {
        this.colorEnhancement = colorEnhancement;
        return this;
    }
    public String getColorEnhancement() {
        return this.colorEnhancement;
    }

    public CreateCenterPolicyRequest setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
        this.cpuDownGradeDuration = cpuDownGradeDuration;
        return this;
    }
    public Integer getCpuDownGradeDuration() {
        return this.cpuDownGradeDuration;
    }

    public CreateCenterPolicyRequest setCpuProcessors(java.util.List<String> cpuProcessors) {
        this.cpuProcessors = cpuProcessors;
        return this;
    }
    public java.util.List<String> getCpuProcessors() {
        return this.cpuProcessors;
    }

    public CreateCenterPolicyRequest setCpuProtectedMode(String cpuProtectedMode) {
        this.cpuProtectedMode = cpuProtectedMode;
        return this;
    }
    public String getCpuProtectedMode() {
        return this.cpuProtectedMode;
    }

    public CreateCenterPolicyRequest setCpuRateLimit(Integer cpuRateLimit) {
        this.cpuRateLimit = cpuRateLimit;
        return this;
    }
    public Integer getCpuRateLimit() {
        return this.cpuRateLimit;
    }

    public CreateCenterPolicyRequest setCpuSampleDuration(Integer cpuSampleDuration) {
        this.cpuSampleDuration = cpuSampleDuration;
        return this;
    }
    public Integer getCpuSampleDuration() {
        return this.cpuSampleDuration;
    }

    public CreateCenterPolicyRequest setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
        this.cpuSingleRateLimit = cpuSingleRateLimit;
        return this;
    }
    public Integer getCpuSingleRateLimit() {
        return this.cpuSingleRateLimit;
    }

    public CreateCenterPolicyRequest setDeviceConnectHint(String deviceConnectHint) {
        this.deviceConnectHint = deviceConnectHint;
        return this;
    }
    public String getDeviceConnectHint() {
        return this.deviceConnectHint;
    }

    public CreateCenterPolicyRequest setDeviceRedirects(java.util.List<CreateCenterPolicyRequestDeviceRedirects> deviceRedirects) {
        this.deviceRedirects = deviceRedirects;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestDeviceRedirects> getDeviceRedirects() {
        return this.deviceRedirects;
    }

    public CreateCenterPolicyRequest setDeviceRules(java.util.List<CreateCenterPolicyRequestDeviceRules> deviceRules) {
        this.deviceRules = deviceRules;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestDeviceRules> getDeviceRules() {
        return this.deviceRules;
    }

    public CreateCenterPolicyRequest setDisconnectKeepSession(String disconnectKeepSession) {
        this.disconnectKeepSession = disconnectKeepSession;
        return this;
    }
    public String getDisconnectKeepSession() {
        return this.disconnectKeepSession;
    }

    public CreateCenterPolicyRequest setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
        this.disconnectKeepSessionTime = disconnectKeepSessionTime;
        return this;
    }
    public Integer getDisconnectKeepSessionTime() {
        return this.disconnectKeepSessionTime;
    }

    public CreateCenterPolicyRequest setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
        return this;
    }
    public String getDisplayMode() {
        return this.displayMode;
    }

    public CreateCenterPolicyRequest setDomainResolveRule(java.util.List<CreateCenterPolicyRequestDomainResolveRule> domainResolveRule) {
        this.domainResolveRule = domainResolveRule;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestDomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    public CreateCenterPolicyRequest setDomainResolveRuleType(String domainResolveRuleType) {
        this.domainResolveRuleType = domainResolveRuleType;
        return this;
    }
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
    }

    public CreateCenterPolicyRequest setEnableSessionRateLimiting(String enableSessionRateLimiting) {
        this.enableSessionRateLimiting = enableSessionRateLimiting;
        return this;
    }
    public String getEnableSessionRateLimiting() {
        return this.enableSessionRateLimiting;
    }

    public CreateCenterPolicyRequest setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
        this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
        return this;
    }
    public String getEndUserApplyAdminCoordinate() {
        return this.endUserApplyAdminCoordinate;
    }

    public CreateCenterPolicyRequest setEndUserGroupCoordinate(String endUserGroupCoordinate) {
        this.endUserGroupCoordinate = endUserGroupCoordinate;
        return this;
    }
    public String getEndUserGroupCoordinate() {
        return this.endUserGroupCoordinate;
    }

    public CreateCenterPolicyRequest setFileMigrate(String fileMigrate) {
        this.fileMigrate = fileMigrate;
        return this;
    }
    public String getFileMigrate() {
        return this.fileMigrate;
    }

    public CreateCenterPolicyRequest setGpuAcceleration(String gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public CreateCenterPolicyRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public CreateCenterPolicyRequest setInternetCommunicationProtocol(String internetCommunicationProtocol) {
        this.internetCommunicationProtocol = internetCommunicationProtocol;
        return this;
    }
    public String getInternetCommunicationProtocol() {
        return this.internetCommunicationProtocol;
    }

    public CreateCenterPolicyRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public CreateCenterPolicyRequest setMaxReconnectTime(Integer maxReconnectTime) {
        this.maxReconnectTime = maxReconnectTime;
        return this;
    }
    public Integer getMaxReconnectTime() {
        return this.maxReconnectTime;
    }

    public CreateCenterPolicyRequest setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
        this.memoryDownGradeDuration = memoryDownGradeDuration;
        return this;
    }
    public Integer getMemoryDownGradeDuration() {
        return this.memoryDownGradeDuration;
    }

    public CreateCenterPolicyRequest setMemoryProcessors(java.util.List<String> memoryProcessors) {
        this.memoryProcessors = memoryProcessors;
        return this;
    }
    public java.util.List<String> getMemoryProcessors() {
        return this.memoryProcessors;
    }

    public CreateCenterPolicyRequest setMemoryProtectedMode(String memoryProtectedMode) {
        this.memoryProtectedMode = memoryProtectedMode;
        return this;
    }
    public String getMemoryProtectedMode() {
        return this.memoryProtectedMode;
    }

    public CreateCenterPolicyRequest setMemoryRateLimit(Integer memoryRateLimit) {
        this.memoryRateLimit = memoryRateLimit;
        return this;
    }
    public Integer getMemoryRateLimit() {
        return this.memoryRateLimit;
    }

    public CreateCenterPolicyRequest setMemorySampleDuration(Integer memorySampleDuration) {
        this.memorySampleDuration = memorySampleDuration;
        return this;
    }
    public Integer getMemorySampleDuration() {
        return this.memorySampleDuration;
    }

    public CreateCenterPolicyRequest setMemorySingleRateLimit(Integer memorySingleRateLimit) {
        this.memorySingleRateLimit = memorySingleRateLimit;
        return this;
    }
    public Integer getMemorySingleRateLimit() {
        return this.memorySingleRateLimit;
    }

    public CreateCenterPolicyRequest setMobileRestart(String mobileRestart) {
        this.mobileRestart = mobileRestart;
        return this;
    }
    public String getMobileRestart() {
        return this.mobileRestart;
    }

    public CreateCenterPolicyRequest setMobileShutdown(String mobileShutdown) {
        this.mobileShutdown = mobileShutdown;
        return this;
    }
    public String getMobileShutdown() {
        return this.mobileShutdown;
    }

    public CreateCenterPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCenterPolicyRequest setNetRedirect(String netRedirect) {
        this.netRedirect = netRedirect;
        return this;
    }
    public String getNetRedirect() {
        return this.netRedirect;
    }

    public CreateCenterPolicyRequest setNetRedirectRule(java.util.List<CreateCenterPolicyRequestNetRedirectRule> netRedirectRule) {
        this.netRedirectRule = netRedirectRule;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestNetRedirectRule> getNetRedirectRule() {
        return this.netRedirectRule;
    }

    public CreateCenterPolicyRequest setNoOperationDisconnect(String noOperationDisconnect) {
        this.noOperationDisconnect = noOperationDisconnect;
        return this;
    }
    public String getNoOperationDisconnect() {
        return this.noOperationDisconnect;
    }

    public CreateCenterPolicyRequest setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
        this.noOperationDisconnectTime = noOperationDisconnectTime;
        return this;
    }
    public Integer getNoOperationDisconnectTime() {
        return this.noOperationDisconnectTime;
    }

    public CreateCenterPolicyRequest setPrinterRedirect(String printerRedirect) {
        this.printerRedirect = printerRedirect;
        return this;
    }
    public String getPrinterRedirect() {
        return this.printerRedirect;
    }

    public CreateCenterPolicyRequest setQualityEnhancement(String qualityEnhancement) {
        this.qualityEnhancement = qualityEnhancement;
        return this;
    }
    public String getQualityEnhancement() {
        return this.qualityEnhancement;
    }

    public CreateCenterPolicyRequest setRecordEventDuration(Integer recordEventDuration) {
        this.recordEventDuration = recordEventDuration;
        return this;
    }
    public Integer getRecordEventDuration() {
        return this.recordEventDuration;
    }

    public CreateCenterPolicyRequest setRecordEventFilePaths(java.util.List<String> recordEventFilePaths) {
        this.recordEventFilePaths = recordEventFilePaths;
        return this;
    }
    public java.util.List<String> getRecordEventFilePaths() {
        return this.recordEventFilePaths;
    }

    public CreateCenterPolicyRequest setRecordEventRegisters(java.util.List<String> recordEventRegisters) {
        this.recordEventRegisters = recordEventRegisters;
        return this;
    }
    public java.util.List<String> getRecordEventRegisters() {
        return this.recordEventRegisters;
    }

    public CreateCenterPolicyRequest setRecordEvents(java.util.List<String> recordEvents) {
        this.recordEvents = recordEvents;
        return this;
    }
    public java.util.List<String> getRecordEvents() {
        return this.recordEvents;
    }

    public CreateCenterPolicyRequest setRecording(String recording) {
        this.recording = recording;
        return this;
    }
    public String getRecording() {
        return this.recording;
    }

    public CreateCenterPolicyRequest setRecordingAudio(String recordingAudio) {
        this.recordingAudio = recordingAudio;
        return this;
    }
    public String getRecordingAudio() {
        return this.recordingAudio;
    }

    public CreateCenterPolicyRequest setRecordingDuration(Integer recordingDuration) {
        this.recordingDuration = recordingDuration;
        return this;
    }
    public Integer getRecordingDuration() {
        return this.recordingDuration;
    }

    public CreateCenterPolicyRequest setRecordingEndTime(String recordingEndTime) {
        this.recordingEndTime = recordingEndTime;
        return this;
    }
    public String getRecordingEndTime() {
        return this.recordingEndTime;
    }

    public CreateCenterPolicyRequest setRecordingExpires(Integer recordingExpires) {
        this.recordingExpires = recordingExpires;
        return this;
    }
    public Integer getRecordingExpires() {
        return this.recordingExpires;
    }

    public CreateCenterPolicyRequest setRecordingFps(String recordingFps) {
        this.recordingFps = recordingFps;
        return this;
    }
    public String getRecordingFps() {
        return this.recordingFps;
    }

    public CreateCenterPolicyRequest setRecordingStartTime(String recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }
    public String getRecordingStartTime() {
        return this.recordingStartTime;
    }

    public CreateCenterPolicyRequest setRecordingUserNotify(String recordingUserNotify) {
        this.recordingUserNotify = recordingUserNotify;
        return this;
    }
    public String getRecordingUserNotify() {
        return this.recordingUserNotify;
    }

    public CreateCenterPolicyRequest setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
        this.recordingUserNotifyMessage = recordingUserNotifyMessage;
        return this;
    }
    public String getRecordingUserNotifyMessage() {
        return this.recordingUserNotifyMessage;
    }

    public CreateCenterPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCenterPolicyRequest setRemoteCoordinate(String remoteCoordinate) {
        this.remoteCoordinate = remoteCoordinate;
        return this;
    }
    public String getRemoteCoordinate() {
        return this.remoteCoordinate;
    }

    public CreateCenterPolicyRequest setResetDesktop(String resetDesktop) {
        this.resetDesktop = resetDesktop;
        return this;
    }
    public String getResetDesktop() {
        return this.resetDesktop;
    }

    public CreateCenterPolicyRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public CreateCenterPolicyRequest setResolutionModel(String resolutionModel) {
        this.resolutionModel = resolutionModel;
        return this;
    }
    public String getResolutionModel() {
        return this.resolutionModel;
    }

    public CreateCenterPolicyRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public CreateCenterPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateCenterPolicyRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateCenterPolicyRequest setScopeValue(java.util.List<String> scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public java.util.List<String> getScopeValue() {
        return this.scopeValue;
    }

    public CreateCenterPolicyRequest setSessionMaxRateKbps(Integer sessionMaxRateKbps) {
        this.sessionMaxRateKbps = sessionMaxRateKbps;
        return this;
    }
    public Integer getSessionMaxRateKbps() {
        return this.sessionMaxRateKbps;
    }

    public CreateCenterPolicyRequest setSmoothEnhancement(String smoothEnhancement) {
        this.smoothEnhancement = smoothEnhancement;
        return this;
    }
    public String getSmoothEnhancement() {
        return this.smoothEnhancement;
    }

    public CreateCenterPolicyRequest setStatusMonitor(String statusMonitor) {
        this.statusMonitor = statusMonitor;
        return this;
    }
    public String getStatusMonitor() {
        return this.statusMonitor;
    }

    public CreateCenterPolicyRequest setStreamingMode(String streamingMode) {
        this.streamingMode = streamingMode;
        return this;
    }
    public String getStreamingMode() {
        return this.streamingMode;
    }

    public CreateCenterPolicyRequest setTargetFps(Integer targetFps) {
        this.targetFps = targetFps;
        return this;
    }
    public Integer getTargetFps() {
        return this.targetFps;
    }

    public CreateCenterPolicyRequest setTaskbar(String taskbar) {
        this.taskbar = taskbar;
        return this;
    }
    public String getTaskbar() {
        return this.taskbar;
    }

    public CreateCenterPolicyRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public CreateCenterPolicyRequest setUsbSupplyRedirectRule(java.util.List<CreateCenterPolicyRequestUsbSupplyRedirectRule> usbSupplyRedirectRule) {
        this.usbSupplyRedirectRule = usbSupplyRedirectRule;
        return this;
    }
    public java.util.List<CreateCenterPolicyRequestUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    public CreateCenterPolicyRequest setVideoEncAvgKbps(Integer videoEncAvgKbps) {
        this.videoEncAvgKbps = videoEncAvgKbps;
        return this;
    }
    public Integer getVideoEncAvgKbps() {
        return this.videoEncAvgKbps;
    }

    public CreateCenterPolicyRequest setVideoEncMaxQP(Integer videoEncMaxQP) {
        this.videoEncMaxQP = videoEncMaxQP;
        return this;
    }
    public Integer getVideoEncMaxQP() {
        return this.videoEncMaxQP;
    }

    public CreateCenterPolicyRequest setVideoEncMinQP(Integer videoEncMinQP) {
        this.videoEncMinQP = videoEncMinQP;
        return this;
    }
    public Integer getVideoEncMinQP() {
        return this.videoEncMinQP;
    }

    public CreateCenterPolicyRequest setVideoEncPeakKbps(Integer videoEncPeakKbps) {
        this.videoEncPeakKbps = videoEncPeakKbps;
        return this;
    }
    public Integer getVideoEncPeakKbps() {
        return this.videoEncPeakKbps;
    }

    public CreateCenterPolicyRequest setVideoEncPolicy(String videoEncPolicy) {
        this.videoEncPolicy = videoEncPolicy;
        return this;
    }
    public String getVideoEncPolicy() {
        return this.videoEncPolicy;
    }

    public CreateCenterPolicyRequest setVideoRedirect(String videoRedirect) {
        this.videoRedirect = videoRedirect;
        return this;
    }
    public String getVideoRedirect() {
        return this.videoRedirect;
    }

    public CreateCenterPolicyRequest setVisualQuality(String visualQuality) {
        this.visualQuality = visualQuality;
        return this;
    }
    public String getVisualQuality() {
        return this.visualQuality;
    }

    public CreateCenterPolicyRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public CreateCenterPolicyRequest setWatermarkAntiCam(String watermarkAntiCam) {
        this.watermarkAntiCam = watermarkAntiCam;
        return this;
    }
    public String getWatermarkAntiCam() {
        return this.watermarkAntiCam;
    }

    public CreateCenterPolicyRequest setWatermarkColor(Integer watermarkColor) {
        this.watermarkColor = watermarkColor;
        return this;
    }
    public Integer getWatermarkColor() {
        return this.watermarkColor;
    }

    public CreateCenterPolicyRequest setWatermarkColumnAmount(Integer watermarkColumnAmount) {
        this.watermarkColumnAmount = watermarkColumnAmount;
        return this;
    }
    public Integer getWatermarkColumnAmount() {
        return this.watermarkColumnAmount;
    }

    public CreateCenterPolicyRequest setWatermarkCustomText(String watermarkCustomText) {
        this.watermarkCustomText = watermarkCustomText;
        return this;
    }
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    public CreateCenterPolicyRequest setWatermarkDegree(Double watermarkDegree) {
        this.watermarkDegree = watermarkDegree;
        return this;
    }
    public Double getWatermarkDegree() {
        return this.watermarkDegree;
    }

    public CreateCenterPolicyRequest setWatermarkFontSize(Integer watermarkFontSize) {
        this.watermarkFontSize = watermarkFontSize;
        return this;
    }
    public Integer getWatermarkFontSize() {
        return this.watermarkFontSize;
    }

    public CreateCenterPolicyRequest setWatermarkFontStyle(String watermarkFontStyle) {
        this.watermarkFontStyle = watermarkFontStyle;
        return this;
    }
    public String getWatermarkFontStyle() {
        return this.watermarkFontStyle;
    }

    public CreateCenterPolicyRequest setWatermarkPower(String watermarkPower) {
        this.watermarkPower = watermarkPower;
        return this;
    }
    public String getWatermarkPower() {
        return this.watermarkPower;
    }

    public CreateCenterPolicyRequest setWatermarkRowAmount(Integer watermarkRowAmount) {
        this.watermarkRowAmount = watermarkRowAmount;
        return this;
    }
    public Integer getWatermarkRowAmount() {
        return this.watermarkRowAmount;
    }

    public CreateCenterPolicyRequest setWatermarkSecurity(String watermarkSecurity) {
        this.watermarkSecurity = watermarkSecurity;
        return this;
    }
    public String getWatermarkSecurity() {
        return this.watermarkSecurity;
    }

    public CreateCenterPolicyRequest setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
        this.watermarkTransparencyValue = watermarkTransparencyValue;
        return this;
    }
    public Integer getWatermarkTransparencyValue() {
        return this.watermarkTransparencyValue;
    }

    public CreateCenterPolicyRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public CreateCenterPolicyRequest setWuyingKeeper(String wuyingKeeper) {
        this.wuyingKeeper = wuyingKeeper;
        return this;
    }
    public String getWuyingKeeper() {
        return this.wuyingKeeper;
    }

    public CreateCenterPolicyRequest setWyAssistant(String wyAssistant) {
        this.wyAssistant = wyAssistant;
        return this;
    }
    public String getWyAssistant() {
        return this.wyAssistant;
    }

    public static class CreateCenterPolicyRequestAuthorizeAccessPolicyRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static CreateCenterPolicyRequestAuthorizeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestAuthorizeAccessPolicyRule self = new CreateCenterPolicyRequestAuthorizeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestAuthorizeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public CreateCenterPolicyRequestAuthorizeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class CreateCenterPolicyRequestAuthorizeSecurityPolicyRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10.0.XX.XX/8</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCenterPolicyRequestAuthorizeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestAuthorizeSecurityPolicyRule self = new CreateCenterPolicyRequestAuthorizeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateCenterPolicyRequestAuthorizeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCenterPolicyRequestClientType extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateCenterPolicyRequestClientType build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestClientType self = new CreateCenterPolicyRequestClientType();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestClientType setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public CreateCenterPolicyRequestClientType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateCenterPolicyRequestDeviceRedirects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static CreateCenterPolicyRequestDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestDeviceRedirects self = new CreateCenterPolicyRequestDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public CreateCenterPolicyRequestDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class CreateCenterPolicyRequestDeviceRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sandisk</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>0x0781</p>
         */
        @NameInMap("DeviceVid")
        public String deviceVid;

        /**
         * <strong>example:</strong>
         * <p>2:0</p>
         */
        @NameInMap("OptCommand")
        public String optCommand;

        /**
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static CreateCenterPolicyRequestDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestDeviceRules self = new CreateCenterPolicyRequestDeviceRules();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateCenterPolicyRequestDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public CreateCenterPolicyRequestDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public CreateCenterPolicyRequestDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public CreateCenterPolicyRequestDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public CreateCenterPolicyRequestDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class CreateCenterPolicyRequestDomainResolveRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static CreateCenterPolicyRequestDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestDomainResolveRule self = new CreateCenterPolicyRequestDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCenterPolicyRequestDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateCenterPolicyRequestDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class CreateCenterPolicyRequestNetRedirectRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>*.taobao.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static CreateCenterPolicyRequestNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestNetRedirectRule self = new CreateCenterPolicyRequestNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestNetRedirectRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateCenterPolicyRequestNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateCenterPolicyRequestNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class CreateCenterPolicyRequestUsbSupplyRedirectRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public String usbRedirectType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UsbRuleType")
        public String usbRuleType;

        /**
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static CreateCenterPolicyRequestUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            CreateCenterPolicyRequestUsbSupplyRedirectRule self = new CreateCenterPolicyRequestUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public CreateCenterPolicyRequestUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCenterPolicyRequestUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public CreateCenterPolicyRequestUsbSupplyRedirectRule setUsbRedirectType(String usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public String getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public CreateCenterPolicyRequestUsbSupplyRedirectRule setUsbRuleType(String usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public String getUsbRuleType() {
            return this.usbRuleType;
        }

        public CreateCenterPolicyRequestUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
