// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCenterPolicyRequest extends TeaModel {
    @NameInMap("AcademicProxy")
    public String academicProxy;

    /**
     * <p>Specifies whether the user has administrator permissions after logging on to the cloud desktop.</p>
     * <blockquote>
     * <p>This feature is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AdminAccess")
    public String adminAccess;

    @NameInMap("AdminKeyboardOnFullScreen")
    public String adminKeyboardOnFullScreen;

    @NameInMap("AdminKeyboardOnWindows")
    public String adminKeyboardOnWindows;

    /**
     * <p>Specifies whether to enable the anti-screenshot feature.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    /**
     * <p>The list of client IP whitelist entries to add.</p>
     */
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyCenterPolicyRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    /**
     * <p>The list of security group control rules to add.</p>
     */
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>Specifies whether to automatically reconnect after disconnection.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AutoReconnect")
    public String autoReconnect;

    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The business type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <p>The local camera redirection setting. This parameter takes effect only when no camera redirection policy is specified in DeviceRedirects.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The recording event level.</p>
     */
    @NameInMap("ClientControlMenu")
    public String clientControlMenu;

    @NameInMap("ClientCreateSnapshot")
    public String clientCreateSnapshot;

    /**
     * <p>The list of logon method control rules. Specifies which client types can access the cloud desktop.</p>
     */
    @NameInMap("ClientType")
    public java.util.List<ModifyCenterPolicyRequestClientType> clientType;

    /**
     * <p>The clipboard permission.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("ClipboardGraineds")
    public java.util.List<ModifyCenterPolicyRequestClipboardGraineds> clipboardGraineds;

    @NameInMap("ClipboardScope")
    public String clipboardScope;

    /**
     * <p>Specifies whether color enhancement is enabled for the design and 3D common scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ColorEnhancement")
    public String colorEnhancement;

    @NameInMap("CpdDriveClipboard")
    public String cpdDriveClipboard;

    /**
     * <p>The CPU throttling duration. Valid values: 30 to 120. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("CpuDownGradeDuration")
    public Integer cpuDownGradeDuration;

    @NameInMap("CpuOverload")
    public String cpuOverload;

    /**
     * <p>The process name.</p>
     */
    @NameInMap("CpuProcessors")
    public java.util.List<String> cpuProcessors;

    /**
     * <p>The CPU protection mode switch.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("CpuProtectedMode")
    public String cpuProtectedMode;

    /**
     * <p>The overall CPU usage percentage. Valid values: 70 to 90.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("CpuRateLimit")
    public Integer cpuRateLimit;

    /**
     * <p>The overall CPU sampling duration. Valid values: 10 to 60. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CpuSampleDuration")
    public Integer cpuSampleDuration;

    /**
     * <p>The single-core CPU usage percentage. Valid values: 70 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CpuSingleRateLimit")
    public Integer cpuSingleRateLimit;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The peripheral connection notification control.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("DeviceConnectHint")
    public String deviceConnectHint;

    /**
     * <p>The device redirection rule list.</p>
     */
    @NameInMap("DeviceRedirects")
    public java.util.List<ModifyCenterPolicyRequestDeviceRedirects> deviceRedirects;

    /**
     * <p>The custom peripheral device rule list.</p>
     */
    @NameInMap("DeviceRules")
    public java.util.List<ModifyCenterPolicyRequestDeviceRules> deviceRules;

    /**
     * <p>The session retention after disconnection.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud application policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>customTime</p>
     */
    @NameInMap("DisconnectKeepSession")
    public String disconnectKeepSession;

    /**
     * <p>The session retention duration after disconnection. Valid values: 30 to 7200. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud application policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("DisconnectKeepSessionTime")
    public Integer disconnectKeepSessionTime;

    @NameInMap("DiskOverload")
    public String diskOverload;

    /**
     * <p>The display mode.</p>
     * 
     * <strong>example:</strong>
     * <p>clientCustom</p>
     */
    @NameInMap("DisplayMode")
    public String displayMode;

    /**
     * <p>The domain name resolution policy.</p>
     */
    @NameInMap("DomainResolveRule")
    public java.util.List<ModifyCenterPolicyRequestDomainResolveRule> domainResolveRule;

    /**
     * <p>The domain name resolution policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <p>The session bandwidth throttling setting.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EnableSessionRateLimiting")
    public String enableSessionRateLimiting;

    /**
     * <p>The setting for users to request administrator assistance.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <p>The setting for users within the same office network to share cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    @NameInMap("ExternalDrive")
    public String externalDrive;

    /**
     * <p>The file migration setting.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("FileMigrate")
    public String fileMigrate;

    @NameInMap("FileTransferAddress")
    public String fileTransferAddress;

    @NameInMap("FileTransferInSize")
    public String fileTransferInSize;

    @NameInMap("FileTransferInUnit")
    public String fileTransferInUnit;

    @NameInMap("FileTransferOutSize")
    public String fileTransferOutSize;

    @NameInMap("FileTransferOutUnit")
    public String fileTransferOutUnit;

    @NameInMap("FileTransferSizeLimit")
    public String fileTransferSizeLimit;

    @NameInMap("FileTransferSpeed")
    public String fileTransferSpeed;

    /**
     * <p>The recording event file extension.</p>
     */
    @NameInMap("FileTransferSpeedLocation")
    public String fileTransferSpeedLocation;

    /**
     * <p>Specifies whether to enable the image quality policy for GPU-accelerated cloud desktops. Enable this policy when high performance and user experience are required, such as in professional design scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    @NameInMap("HoverConfigMsg")
    public String hoverConfigMsg;

    /**
     * <p>The file transfer policy for the web client.</p>
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
     * <p>both</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <p>The WUYING Keeper switch for mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("InternetPrinter")
    public String internetPrinter;

    /**
     * <p>The local disk mapping permission.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>The maximum reconnection retry time when the cloud desktop is disconnected due to objective reasons. Valid values: 30 to 7200. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MaxReconnectTime")
    public Integer maxReconnectTime;

    /**
     * <p>The single-process memory throttling duration. Valid values: 30 to 120. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemoryDownGradeDuration")
    public Integer memoryDownGradeDuration;

    @NameInMap("MemoryOverload")
    public String memoryOverload;

    /**
     * <p>The process name.</p>
     */
    @NameInMap("MemoryProcessors")
    public java.util.List<String> memoryProcessors;

    /**
     * <p>The memory protection mode switch.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MemoryProtectedMode")
    public String memoryProtectedMode;

    /**
     * <p>The overall memory usage percentage. Valid values: 70 to 90.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("MemoryRateLimit")
    public Integer memoryRateLimit;

    /**
     * <p>The overall memory sampling duration. Valid values: 30 to 60. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemorySampleDuration")
    public Integer memorySampleDuration;

    /**
     * <p>The single-process memory usage percentage. Valid values: 30 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemorySingleRateLimit")
    public Integer memorySingleRateLimit;

    /**
     * <p>Specifies whether to provide a restart button in the cloud desktop floating ball when connecting through mobile clients (Android&lt;props=&quot;china&quot;&gt; and iOS clients).</p>
     * <blockquote>
     * <p>This parameter applies only to mobile client V7.4 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileRestart")
    public String mobileRestart;

    /**
     * <p>The security button switch for Windows on mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileSafeMenu")
    public String mobileSafeMenu;

    /**
     * <p>Specifies whether to provide a shutdown button in the cloud desktop floating ball when connecting through mobile clients (Android&lt;props=&quot;china&quot;&gt; and iOS clients).</p>
     * <blockquote>
     * <p>This parameter applies only to mobile client V7.4 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileShutdown")
    public String mobileShutdown;

    /**
     * <p>The WUYING Keeper switch for mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileWuyingKeeper")
    public String mobileWuyingKeeper;

    /**
     * <p>The Xiaoying switch for mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("MobileWyAssistant")
    public String mobileWyAssistant;

    @NameInMap("ModelLibrary")
    public String modelLibrary;

    @NameInMap("MultiScreen")
    public String multiScreen;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyGroupName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable network redirection.</p>
     * <blockquote>
     * <p>This feature is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("NetRedirect")
    public String netRedirect;

    /**
     * <p>The network redirection policy details.</p>
     * <blockquote>
     * <p>This feature is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("NetRedirectRule")
    public java.util.List<ModifyCenterPolicyRequestNetRedirectRule> netRedirectRule;

    /**
     * <p>The no-operation disconnect setting.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud application policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("NoOperationDisconnect")
    public String noOperationDisconnect;

    /**
     * <p>The no-operation disconnect duration. Valid values: 120 to 7200. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud application policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("NoOperationDisconnectTime")
    public Integer noOperationDisconnectTime;

    /**
     * <p>The ID of the Cloud Desktop policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PortProxy")
    public String portProxy;

    /**
     * <p>The printer redirection policy. This parameter takes effect only when no printer redirection policy is specified in DeviceRedirects.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PrinterRedirect")
    public String printerRedirect;

    /**
     * <p>Specifies whether image quality enhancement is enabled for the design and 3D common scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("QualityEnhancement")
    public String qualityEnhancement;

    /**
     * <p>The recording duration after an event is detected in recording audit. Unit: minutes. Valid values: 10 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordEventDuration")
    public Integer recordEventDuration;

    /**
     * <p>The recording event file extension.</p>
     */
    @NameInMap("RecordEventFileExts")
    public java.util.List<String> recordEventFileExts;

    /**
     * <p>The absolute paths for file monitoring in recording audit.</p>
     */
    @NameInMap("RecordEventFilePaths")
    public java.util.List<String> recordEventFilePaths;

    /**
     * <p>The recording event level.</p>
     */
    @NameInMap("RecordEventLevels")
    public java.util.List<ModifyCenterPolicyRequestRecordEventLevels> recordEventLevels;

    /**
     * <p>The absolute paths for registry monitoring in recording audit.</p>
     * 
     * <strong>example:</strong>
     * <p>Computer\HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\USBSTOR</p>
     */
    @NameInMap("RecordEventRegisters")
    public java.util.List<String> recordEventRegisters;

    /**
     * <p>The list of recording events.</p>
     */
    @NameInMap("RecordEvents")
    public java.util.List<String> recordEvents;

    /**
     * <p>Specifies whether to enable screen recording.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <p>The audio recording option for the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <p>The duration of each recording file segment, in minutes. Recording files are automatically split and uploaded to the storage space based on the specified duration. Files are rolled over when they reach 300 MB. Valid values: 10 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <p>The recording end time in the format of HH:MM:SS. This parameter takes effect only when <code>Recording</code> is set to <code>PERIOD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:59:00</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <p>The retention period of recording files. Valid values: 1 to 180. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingExpires")
    public Integer recordingExpires;

    /**
     * <p>The recording frame rate. Unit: FPS (frames per second).</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RecordingFps")
    public String recordingFps;

    /**
     * <p>The recording start time in the format of HH:MM:SS. This parameter takes effect only when <code>Recording</code> is set to <code>PERIOD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <p>Specifies whether to notify end users that screen recording is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RecordingUserNotify")
    public String recordingUserNotify;

    /**
     * <p>The notification message displayed to end users about screen recording.</p>
     * 
     * <strong>example:</strong>
     * <p>Screen recording is enabled.</p>
     */
    @NameInMap("RecordingUserNotifyMessage")
    public String recordingUserNotifyMessage;

    /**
     * <p>The region ID. This feature is region-independent. Set this parameter to <code>cn-shanghai</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyboard and mouse control permission for remote assistance.</p>
     * 
     * <strong>example:</strong>
     * <p>fullControl</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <p>The cloud desktop reset setting.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ResetDesktop")
    public String resetDesktop;

    @NameInMap("ResolutionDpi")
    public Integer resolutionDpi;

    /**
     * <p>The resolution height. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 480 to 4096.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The resolution type.</p>
     * 
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("ResolutionModel")
    public String resolutionModel;

    /**
     * <p>The resolution width. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 480 to 4096.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of client IP whitelist entries to delete.</p>
     */
    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyCenterPolicyRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    /**
     * <p>The list of security group control rules to delete.</p>
     */
    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyCenterPolicyRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    /**
     * <p>The security button switch for Windows on mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SafeMenu")
    public String safeMenu;

    /**
     * <p>The scope of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The scope values. Specify this parameter when <code>Scope</code> is set to <code>IP</code>. This parameter takes effect only when <code>Scope</code> is set to <code>IP</code>.</p>
     */
    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <p>The Xiaoying switch for mobile clients.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("ScreenDisplayMode")
    public String screenDisplayMode;

    /**
     * <p>The maximum value for session bandwidth throttling. Unit: Kbps. Valid values: 2000 to 100000.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("SessionMaxRateKbps")
    public Integer sessionMaxRateKbps;

    /**
     * <p>Specifies whether to enable smoothness enhancement for daily office scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SmoothEnhancement")
    public String smoothEnhancement;

    /**
     * <p>Specifies whether to provide the status monitoring entry in the cloud desktop floating ball.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("StatusMonitor")
    public String statusMonitor;

    /**
     * <p>The streaming mode scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>smooth</p>
     */
    @NameInMap("StreamingMode")
    public String streamingMode;

    /**
     * <p>The target frame rate. Valid values: 10 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TargetFps")
    public Integer targetFps;

    /**
     * <p>The application taskbar.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud application policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Taskbar")
    public String taskbar;

    /**
     * <p>The USB redirection setting.</p>
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
    public java.util.List<ModifyCenterPolicyRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    @NameInMap("UseTime")
    public String useTime;

    /**
     * <p>The average bitrate for video encoding. Unit: Kbps. Valid values: 1000 to 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoEncAvgKbps")
    public Integer videoEncAvgKbps;

    /**
     * <p>The maximum QP for video encoding, which represents the lowest quality. Valid values: 0 to 51.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("VideoEncMaxQP")
    public Integer videoEncMaxQP;

    /**
     * <p>The minimum QP for video encoding, which represents the highest quality. Valid values: 0 to 51.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("VideoEncMinQP")
    public Integer videoEncMinQP;

    /**
     * <p>The peak bitrate for video encoding. Unit: Kbps. Valid values: 1000 to 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoEncPeakKbps")
    public Integer videoEncPeakKbps;

    /**
     * <p>The video encoding policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qualityFirst</p>
     */
    @NameInMap("VideoEncPolicy")
    public String videoEncPolicy;

    /**
     * <p>The multimedia redirection setting.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <p>The image display quality policy.</p>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <p>The watermark setting.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <p>The invisible watermark anti-photography feature.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkAntiCam")
    public String watermarkAntiCam;

    /**
     * <p>The watermark font color. Valid values: 0 to 16777215.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    /**
     * <p>The number of watermark columns. Valid values: 3 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("WatermarkColumnAmount")
    public Integer watermarkColumnAmount;

    /**
     * <p>The custom text content. This parameter is required if you set WatermarkType to <code>custom</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("WatermarkCustomText")
    public String watermarkCustomText;

    /**
     * <p>The watermark tilt angle. Valid values: -10 to -30.</p>
     * 
     * <strong>example:</strong>
     * <p>-10</p>
     */
    @NameInMap("WatermarkDegree")
    public Double watermarkDegree;

    /**
     * <p>The watermark font size. Valid values: 10 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkFontSize")
    public Integer watermarkFontSize;

    /**
     * <p>The watermark font style.</p>
     * 
     * <strong>example:</strong>
     * <p>plain</p>
     */
    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    /**
     * <p>The invisible watermark enhancement feature.</p>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("WatermarkPower")
    public String watermarkPower;

    /**
     * <p>The number of watermark rows. Valid values: 3 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <p>The security priority rule for invisible watermarks.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    @NameInMap("WatermarkShadow")
    public String watermarkShadow;

    /**
     * <p>The watermark opacity. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <p>The watermark type. You can select up to three types, separated by commas (,).</p>
     * <blockquote>
     * <p>If you set this parameter to <code>custom</code>, you must also specify the custom text content by using the WatermarkCustomText parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EndUserId</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    /**
     * <p>The WUYING Keeper switch.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WuyingKeeper")
    public String wuyingKeeper;

    /**
     * <p>Specifies whether to provide the WUYING AI Assistant entry in the cloud desktop floating ball when connecting through desktop clients (including Windows and macOS clients).</p>
     * <blockquote>
     * <p>This parameter applies only to desktop client V7.7 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("WyAssistant")
    public String wyAssistant;

    public static ModifyCenterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenterPolicyRequest self = new ModifyCenterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCenterPolicyRequest setAcademicProxy(String academicProxy) {
        this.academicProxy = academicProxy;
        return this;
    }
    public String getAcademicProxy() {
        return this.academicProxy;
    }

    public ModifyCenterPolicyRequest setAdminAccess(String adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }
    public String getAdminAccess() {
        return this.adminAccess;
    }

    public ModifyCenterPolicyRequest setAdminKeyboardOnFullScreen(String adminKeyboardOnFullScreen) {
        this.adminKeyboardOnFullScreen = adminKeyboardOnFullScreen;
        return this;
    }
    public String getAdminKeyboardOnFullScreen() {
        return this.adminKeyboardOnFullScreen;
    }

    public ModifyCenterPolicyRequest setAdminKeyboardOnWindows(String adminKeyboardOnWindows) {
        this.adminKeyboardOnWindows = adminKeyboardOnWindows;
        return this;
    }
    public String getAdminKeyboardOnWindows() {
        return this.adminKeyboardOnWindows;
    }

    public ModifyCenterPolicyRequest setAppContentProtection(String appContentProtection) {
        this.appContentProtection = appContentProtection;
        return this;
    }
    public String getAppContentProtection() {
        return this.appContentProtection;
    }

    public ModifyCenterPolicyRequest setAuthorizeAccessPolicyRule(java.util.List<ModifyCenterPolicyRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
        this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestAuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    public ModifyCenterPolicyRequest setAuthorizeSecurityPolicyRule(java.util.List<ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
        this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    public ModifyCenterPolicyRequest setAutoReconnect(String autoReconnect) {
        this.autoReconnect = autoReconnect;
        return this;
    }
    public String getAutoReconnect() {
        return this.autoReconnect;
    }

    public ModifyCenterPolicyRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public ModifyCenterPolicyRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public ModifyCenterPolicyRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public ModifyCenterPolicyRequest setClientControlMenu(String clientControlMenu) {
        this.clientControlMenu = clientControlMenu;
        return this;
    }
    public String getClientControlMenu() {
        return this.clientControlMenu;
    }

    public ModifyCenterPolicyRequest setClientCreateSnapshot(String clientCreateSnapshot) {
        this.clientCreateSnapshot = clientCreateSnapshot;
        return this;
    }
    public String getClientCreateSnapshot() {
        return this.clientCreateSnapshot;
    }

    public ModifyCenterPolicyRequest setClientType(java.util.List<ModifyCenterPolicyRequestClientType> clientType) {
        this.clientType = clientType;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestClientType> getClientType() {
        return this.clientType;
    }

    public ModifyCenterPolicyRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyCenterPolicyRequest setClipboardGraineds(java.util.List<ModifyCenterPolicyRequestClipboardGraineds> clipboardGraineds) {
        this.clipboardGraineds = clipboardGraineds;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestClipboardGraineds> getClipboardGraineds() {
        return this.clipboardGraineds;
    }

    public ModifyCenterPolicyRequest setClipboardScope(String clipboardScope) {
        this.clipboardScope = clipboardScope;
        return this;
    }
    public String getClipboardScope() {
        return this.clipboardScope;
    }

    public ModifyCenterPolicyRequest setColorEnhancement(String colorEnhancement) {
        this.colorEnhancement = colorEnhancement;
        return this;
    }
    public String getColorEnhancement() {
        return this.colorEnhancement;
    }

    public ModifyCenterPolicyRequest setCpdDriveClipboard(String cpdDriveClipboard) {
        this.cpdDriveClipboard = cpdDriveClipboard;
        return this;
    }
    public String getCpdDriveClipboard() {
        return this.cpdDriveClipboard;
    }

    public ModifyCenterPolicyRequest setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
        this.cpuDownGradeDuration = cpuDownGradeDuration;
        return this;
    }
    public Integer getCpuDownGradeDuration() {
        return this.cpuDownGradeDuration;
    }

    public ModifyCenterPolicyRequest setCpuOverload(String cpuOverload) {
        this.cpuOverload = cpuOverload;
        return this;
    }
    public String getCpuOverload() {
        return this.cpuOverload;
    }

    public ModifyCenterPolicyRequest setCpuProcessors(java.util.List<String> cpuProcessors) {
        this.cpuProcessors = cpuProcessors;
        return this;
    }
    public java.util.List<String> getCpuProcessors() {
        return this.cpuProcessors;
    }

    public ModifyCenterPolicyRequest setCpuProtectedMode(String cpuProtectedMode) {
        this.cpuProtectedMode = cpuProtectedMode;
        return this;
    }
    public String getCpuProtectedMode() {
        return this.cpuProtectedMode;
    }

    public ModifyCenterPolicyRequest setCpuRateLimit(Integer cpuRateLimit) {
        this.cpuRateLimit = cpuRateLimit;
        return this;
    }
    public Integer getCpuRateLimit() {
        return this.cpuRateLimit;
    }

    public ModifyCenterPolicyRequest setCpuSampleDuration(Integer cpuSampleDuration) {
        this.cpuSampleDuration = cpuSampleDuration;
        return this;
    }
    public Integer getCpuSampleDuration() {
        return this.cpuSampleDuration;
    }

    public ModifyCenterPolicyRequest setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
        this.cpuSingleRateLimit = cpuSingleRateLimit;
        return this;
    }
    public Integer getCpuSingleRateLimit() {
        return this.cpuSingleRateLimit;
    }

    public ModifyCenterPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCenterPolicyRequest setDeviceConnectHint(String deviceConnectHint) {
        this.deviceConnectHint = deviceConnectHint;
        return this;
    }
    public String getDeviceConnectHint() {
        return this.deviceConnectHint;
    }

    public ModifyCenterPolicyRequest setDeviceRedirects(java.util.List<ModifyCenterPolicyRequestDeviceRedirects> deviceRedirects) {
        this.deviceRedirects = deviceRedirects;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestDeviceRedirects> getDeviceRedirects() {
        return this.deviceRedirects;
    }

    public ModifyCenterPolicyRequest setDeviceRules(java.util.List<ModifyCenterPolicyRequestDeviceRules> deviceRules) {
        this.deviceRules = deviceRules;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestDeviceRules> getDeviceRules() {
        return this.deviceRules;
    }

    public ModifyCenterPolicyRequest setDisconnectKeepSession(String disconnectKeepSession) {
        this.disconnectKeepSession = disconnectKeepSession;
        return this;
    }
    public String getDisconnectKeepSession() {
        return this.disconnectKeepSession;
    }

    public ModifyCenterPolicyRequest setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
        this.disconnectKeepSessionTime = disconnectKeepSessionTime;
        return this;
    }
    public Integer getDisconnectKeepSessionTime() {
        return this.disconnectKeepSessionTime;
    }

    public ModifyCenterPolicyRequest setDiskOverload(String diskOverload) {
        this.diskOverload = diskOverload;
        return this;
    }
    public String getDiskOverload() {
        return this.diskOverload;
    }

    public ModifyCenterPolicyRequest setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
        return this;
    }
    public String getDisplayMode() {
        return this.displayMode;
    }

    public ModifyCenterPolicyRequest setDomainResolveRule(java.util.List<ModifyCenterPolicyRequestDomainResolveRule> domainResolveRule) {
        this.domainResolveRule = domainResolveRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestDomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    public ModifyCenterPolicyRequest setDomainResolveRuleType(String domainResolveRuleType) {
        this.domainResolveRuleType = domainResolveRuleType;
        return this;
    }
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
    }

    public ModifyCenterPolicyRequest setEnableSessionRateLimiting(String enableSessionRateLimiting) {
        this.enableSessionRateLimiting = enableSessionRateLimiting;
        return this;
    }
    public String getEnableSessionRateLimiting() {
        return this.enableSessionRateLimiting;
    }

    public ModifyCenterPolicyRequest setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
        this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
        return this;
    }
    public String getEndUserApplyAdminCoordinate() {
        return this.endUserApplyAdminCoordinate;
    }

    public ModifyCenterPolicyRequest setEndUserGroupCoordinate(String endUserGroupCoordinate) {
        this.endUserGroupCoordinate = endUserGroupCoordinate;
        return this;
    }
    public String getEndUserGroupCoordinate() {
        return this.endUserGroupCoordinate;
    }

    public ModifyCenterPolicyRequest setExternalDrive(String externalDrive) {
        this.externalDrive = externalDrive;
        return this;
    }
    public String getExternalDrive() {
        return this.externalDrive;
    }

    public ModifyCenterPolicyRequest setFileMigrate(String fileMigrate) {
        this.fileMigrate = fileMigrate;
        return this;
    }
    public String getFileMigrate() {
        return this.fileMigrate;
    }

    public ModifyCenterPolicyRequest setFileTransferAddress(String fileTransferAddress) {
        this.fileTransferAddress = fileTransferAddress;
        return this;
    }
    public String getFileTransferAddress() {
        return this.fileTransferAddress;
    }

    public ModifyCenterPolicyRequest setFileTransferInSize(String fileTransferInSize) {
        this.fileTransferInSize = fileTransferInSize;
        return this;
    }
    public String getFileTransferInSize() {
        return this.fileTransferInSize;
    }

    public ModifyCenterPolicyRequest setFileTransferInUnit(String fileTransferInUnit) {
        this.fileTransferInUnit = fileTransferInUnit;
        return this;
    }
    public String getFileTransferInUnit() {
        return this.fileTransferInUnit;
    }

    public ModifyCenterPolicyRequest setFileTransferOutSize(String fileTransferOutSize) {
        this.fileTransferOutSize = fileTransferOutSize;
        return this;
    }
    public String getFileTransferOutSize() {
        return this.fileTransferOutSize;
    }

    public ModifyCenterPolicyRequest setFileTransferOutUnit(String fileTransferOutUnit) {
        this.fileTransferOutUnit = fileTransferOutUnit;
        return this;
    }
    public String getFileTransferOutUnit() {
        return this.fileTransferOutUnit;
    }

    public ModifyCenterPolicyRequest setFileTransferSizeLimit(String fileTransferSizeLimit) {
        this.fileTransferSizeLimit = fileTransferSizeLimit;
        return this;
    }
    public String getFileTransferSizeLimit() {
        return this.fileTransferSizeLimit;
    }

    public ModifyCenterPolicyRequest setFileTransferSpeed(String fileTransferSpeed) {
        this.fileTransferSpeed = fileTransferSpeed;
        return this;
    }
    public String getFileTransferSpeed() {
        return this.fileTransferSpeed;
    }

    public ModifyCenterPolicyRequest setFileTransferSpeedLocation(String fileTransferSpeedLocation) {
        this.fileTransferSpeedLocation = fileTransferSpeedLocation;
        return this;
    }
    public String getFileTransferSpeedLocation() {
        return this.fileTransferSpeedLocation;
    }

    public ModifyCenterPolicyRequest setGpuAcceleration(String gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public ModifyCenterPolicyRequest setHoverConfigMsg(String hoverConfigMsg) {
        this.hoverConfigMsg = hoverConfigMsg;
        return this;
    }
    public String getHoverConfigMsg() {
        return this.hoverConfigMsg;
    }

    public ModifyCenterPolicyRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public ModifyCenterPolicyRequest setInternetCommunicationProtocol(String internetCommunicationProtocol) {
        this.internetCommunicationProtocol = internetCommunicationProtocol;
        return this;
    }
    public String getInternetCommunicationProtocol() {
        return this.internetCommunicationProtocol;
    }

    public ModifyCenterPolicyRequest setInternetPrinter(String internetPrinter) {
        this.internetPrinter = internetPrinter;
        return this;
    }
    public String getInternetPrinter() {
        return this.internetPrinter;
    }

    public ModifyCenterPolicyRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyCenterPolicyRequest setMaxReconnectTime(Integer maxReconnectTime) {
        this.maxReconnectTime = maxReconnectTime;
        return this;
    }
    public Integer getMaxReconnectTime() {
        return this.maxReconnectTime;
    }

    public ModifyCenterPolicyRequest setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
        this.memoryDownGradeDuration = memoryDownGradeDuration;
        return this;
    }
    public Integer getMemoryDownGradeDuration() {
        return this.memoryDownGradeDuration;
    }

    public ModifyCenterPolicyRequest setMemoryOverload(String memoryOverload) {
        this.memoryOverload = memoryOverload;
        return this;
    }
    public String getMemoryOverload() {
        return this.memoryOverload;
    }

    public ModifyCenterPolicyRequest setMemoryProcessors(java.util.List<String> memoryProcessors) {
        this.memoryProcessors = memoryProcessors;
        return this;
    }
    public java.util.List<String> getMemoryProcessors() {
        return this.memoryProcessors;
    }

    public ModifyCenterPolicyRequest setMemoryProtectedMode(String memoryProtectedMode) {
        this.memoryProtectedMode = memoryProtectedMode;
        return this;
    }
    public String getMemoryProtectedMode() {
        return this.memoryProtectedMode;
    }

    public ModifyCenterPolicyRequest setMemoryRateLimit(Integer memoryRateLimit) {
        this.memoryRateLimit = memoryRateLimit;
        return this;
    }
    public Integer getMemoryRateLimit() {
        return this.memoryRateLimit;
    }

    public ModifyCenterPolicyRequest setMemorySampleDuration(Integer memorySampleDuration) {
        this.memorySampleDuration = memorySampleDuration;
        return this;
    }
    public Integer getMemorySampleDuration() {
        return this.memorySampleDuration;
    }

    public ModifyCenterPolicyRequest setMemorySingleRateLimit(Integer memorySingleRateLimit) {
        this.memorySingleRateLimit = memorySingleRateLimit;
        return this;
    }
    public Integer getMemorySingleRateLimit() {
        return this.memorySingleRateLimit;
    }

    public ModifyCenterPolicyRequest setMobileRestart(String mobileRestart) {
        this.mobileRestart = mobileRestart;
        return this;
    }
    public String getMobileRestart() {
        return this.mobileRestart;
    }

    public ModifyCenterPolicyRequest setMobileSafeMenu(String mobileSafeMenu) {
        this.mobileSafeMenu = mobileSafeMenu;
        return this;
    }
    public String getMobileSafeMenu() {
        return this.mobileSafeMenu;
    }

    public ModifyCenterPolicyRequest setMobileShutdown(String mobileShutdown) {
        this.mobileShutdown = mobileShutdown;
        return this;
    }
    public String getMobileShutdown() {
        return this.mobileShutdown;
    }

    public ModifyCenterPolicyRequest setMobileWuyingKeeper(String mobileWuyingKeeper) {
        this.mobileWuyingKeeper = mobileWuyingKeeper;
        return this;
    }
    public String getMobileWuyingKeeper() {
        return this.mobileWuyingKeeper;
    }

    public ModifyCenterPolicyRequest setMobileWyAssistant(String mobileWyAssistant) {
        this.mobileWyAssistant = mobileWyAssistant;
        return this;
    }
    public String getMobileWyAssistant() {
        return this.mobileWyAssistant;
    }

    public ModifyCenterPolicyRequest setModelLibrary(String modelLibrary) {
        this.modelLibrary = modelLibrary;
        return this;
    }
    public String getModelLibrary() {
        return this.modelLibrary;
    }

    public ModifyCenterPolicyRequest setMultiScreen(String multiScreen) {
        this.multiScreen = multiScreen;
        return this;
    }
    public String getMultiScreen() {
        return this.multiScreen;
    }

    public ModifyCenterPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCenterPolicyRequest setNetRedirect(String netRedirect) {
        this.netRedirect = netRedirect;
        return this;
    }
    public String getNetRedirect() {
        return this.netRedirect;
    }

    public ModifyCenterPolicyRequest setNetRedirectRule(java.util.List<ModifyCenterPolicyRequestNetRedirectRule> netRedirectRule) {
        this.netRedirectRule = netRedirectRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestNetRedirectRule> getNetRedirectRule() {
        return this.netRedirectRule;
    }

    public ModifyCenterPolicyRequest setNoOperationDisconnect(String noOperationDisconnect) {
        this.noOperationDisconnect = noOperationDisconnect;
        return this;
    }
    public String getNoOperationDisconnect() {
        return this.noOperationDisconnect;
    }

    public ModifyCenterPolicyRequest setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
        this.noOperationDisconnectTime = noOperationDisconnectTime;
        return this;
    }
    public Integer getNoOperationDisconnectTime() {
        return this.noOperationDisconnectTime;
    }

    public ModifyCenterPolicyRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyCenterPolicyRequest setPortProxy(String portProxy) {
        this.portProxy = portProxy;
        return this;
    }
    public String getPortProxy() {
        return this.portProxy;
    }

    public ModifyCenterPolicyRequest setPrinterRedirect(String printerRedirect) {
        this.printerRedirect = printerRedirect;
        return this;
    }
    public String getPrinterRedirect() {
        return this.printerRedirect;
    }

    public ModifyCenterPolicyRequest setQualityEnhancement(String qualityEnhancement) {
        this.qualityEnhancement = qualityEnhancement;
        return this;
    }
    public String getQualityEnhancement() {
        return this.qualityEnhancement;
    }

    public ModifyCenterPolicyRequest setRecordEventDuration(Integer recordEventDuration) {
        this.recordEventDuration = recordEventDuration;
        return this;
    }
    public Integer getRecordEventDuration() {
        return this.recordEventDuration;
    }

    public ModifyCenterPolicyRequest setRecordEventFileExts(java.util.List<String> recordEventFileExts) {
        this.recordEventFileExts = recordEventFileExts;
        return this;
    }
    public java.util.List<String> getRecordEventFileExts() {
        return this.recordEventFileExts;
    }

    public ModifyCenterPolicyRequest setRecordEventFilePaths(java.util.List<String> recordEventFilePaths) {
        this.recordEventFilePaths = recordEventFilePaths;
        return this;
    }
    public java.util.List<String> getRecordEventFilePaths() {
        return this.recordEventFilePaths;
    }

    public ModifyCenterPolicyRequest setRecordEventLevels(java.util.List<ModifyCenterPolicyRequestRecordEventLevels> recordEventLevels) {
        this.recordEventLevels = recordEventLevels;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestRecordEventLevels> getRecordEventLevels() {
        return this.recordEventLevels;
    }

    public ModifyCenterPolicyRequest setRecordEventRegisters(java.util.List<String> recordEventRegisters) {
        this.recordEventRegisters = recordEventRegisters;
        return this;
    }
    public java.util.List<String> getRecordEventRegisters() {
        return this.recordEventRegisters;
    }

    public ModifyCenterPolicyRequest setRecordEvents(java.util.List<String> recordEvents) {
        this.recordEvents = recordEvents;
        return this;
    }
    public java.util.List<String> getRecordEvents() {
        return this.recordEvents;
    }

    public ModifyCenterPolicyRequest setRecording(String recording) {
        this.recording = recording;
        return this;
    }
    public String getRecording() {
        return this.recording;
    }

    public ModifyCenterPolicyRequest setRecordingAudio(String recordingAudio) {
        this.recordingAudio = recordingAudio;
        return this;
    }
    public String getRecordingAudio() {
        return this.recordingAudio;
    }

    public ModifyCenterPolicyRequest setRecordingDuration(Integer recordingDuration) {
        this.recordingDuration = recordingDuration;
        return this;
    }
    public Integer getRecordingDuration() {
        return this.recordingDuration;
    }

    public ModifyCenterPolicyRequest setRecordingEndTime(String recordingEndTime) {
        this.recordingEndTime = recordingEndTime;
        return this;
    }
    public String getRecordingEndTime() {
        return this.recordingEndTime;
    }

    public ModifyCenterPolicyRequest setRecordingExpires(Integer recordingExpires) {
        this.recordingExpires = recordingExpires;
        return this;
    }
    public Integer getRecordingExpires() {
        return this.recordingExpires;
    }

    public ModifyCenterPolicyRequest setRecordingFps(String recordingFps) {
        this.recordingFps = recordingFps;
        return this;
    }
    public String getRecordingFps() {
        return this.recordingFps;
    }

    public ModifyCenterPolicyRequest setRecordingStartTime(String recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }
    public String getRecordingStartTime() {
        return this.recordingStartTime;
    }

    public ModifyCenterPolicyRequest setRecordingUserNotify(String recordingUserNotify) {
        this.recordingUserNotify = recordingUserNotify;
        return this;
    }
    public String getRecordingUserNotify() {
        return this.recordingUserNotify;
    }

    public ModifyCenterPolicyRequest setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
        this.recordingUserNotifyMessage = recordingUserNotifyMessage;
        return this;
    }
    public String getRecordingUserNotifyMessage() {
        return this.recordingUserNotifyMessage;
    }

    public ModifyCenterPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCenterPolicyRequest setRemoteCoordinate(String remoteCoordinate) {
        this.remoteCoordinate = remoteCoordinate;
        return this;
    }
    public String getRemoteCoordinate() {
        return this.remoteCoordinate;
    }

    public ModifyCenterPolicyRequest setResetDesktop(String resetDesktop) {
        this.resetDesktop = resetDesktop;
        return this;
    }
    public String getResetDesktop() {
        return this.resetDesktop;
    }

    public ModifyCenterPolicyRequest setResolutionDpi(Integer resolutionDpi) {
        this.resolutionDpi = resolutionDpi;
        return this;
    }
    public Integer getResolutionDpi() {
        return this.resolutionDpi;
    }

    public ModifyCenterPolicyRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public ModifyCenterPolicyRequest setResolutionModel(String resolutionModel) {
        this.resolutionModel = resolutionModel;
        return this;
    }
    public String getResolutionModel() {
        return this.resolutionModel;
    }

    public ModifyCenterPolicyRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public ModifyCenterPolicyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyCenterPolicyRequest setRevokeAccessPolicyRule(java.util.List<ModifyCenterPolicyRequestRevokeAccessPolicyRule> revokeAccessPolicyRule) {
        this.revokeAccessPolicyRule = revokeAccessPolicyRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestRevokeAccessPolicyRule> getRevokeAccessPolicyRule() {
        return this.revokeAccessPolicyRule;
    }

    public ModifyCenterPolicyRequest setRevokeSecurityPolicyRule(java.util.List<ModifyCenterPolicyRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
        this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestRevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
        return this.revokeSecurityPolicyRule;
    }

    public ModifyCenterPolicyRequest setSafeMenu(String safeMenu) {
        this.safeMenu = safeMenu;
        return this;
    }
    public String getSafeMenu() {
        return this.safeMenu;
    }

    public ModifyCenterPolicyRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ModifyCenterPolicyRequest setScopeValue(java.util.List<String> scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public java.util.List<String> getScopeValue() {
        return this.scopeValue;
    }

    public ModifyCenterPolicyRequest setScreenDisplayMode(String screenDisplayMode) {
        this.screenDisplayMode = screenDisplayMode;
        return this;
    }
    public String getScreenDisplayMode() {
        return this.screenDisplayMode;
    }

    public ModifyCenterPolicyRequest setSessionMaxRateKbps(Integer sessionMaxRateKbps) {
        this.sessionMaxRateKbps = sessionMaxRateKbps;
        return this;
    }
    public Integer getSessionMaxRateKbps() {
        return this.sessionMaxRateKbps;
    }

    public ModifyCenterPolicyRequest setSmoothEnhancement(String smoothEnhancement) {
        this.smoothEnhancement = smoothEnhancement;
        return this;
    }
    public String getSmoothEnhancement() {
        return this.smoothEnhancement;
    }

    public ModifyCenterPolicyRequest setStatusMonitor(String statusMonitor) {
        this.statusMonitor = statusMonitor;
        return this;
    }
    public String getStatusMonitor() {
        return this.statusMonitor;
    }

    public ModifyCenterPolicyRequest setStreamingMode(String streamingMode) {
        this.streamingMode = streamingMode;
        return this;
    }
    public String getStreamingMode() {
        return this.streamingMode;
    }

    public ModifyCenterPolicyRequest setTargetFps(Integer targetFps) {
        this.targetFps = targetFps;
        return this;
    }
    public Integer getTargetFps() {
        return this.targetFps;
    }

    public ModifyCenterPolicyRequest setTaskbar(String taskbar) {
        this.taskbar = taskbar;
        return this;
    }
    public String getTaskbar() {
        return this.taskbar;
    }

    public ModifyCenterPolicyRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public ModifyCenterPolicyRequest setUsbSupplyRedirectRule(java.util.List<ModifyCenterPolicyRequestUsbSupplyRedirectRule> usbSupplyRedirectRule) {
        this.usbSupplyRedirectRule = usbSupplyRedirectRule;
        return this;
    }
    public java.util.List<ModifyCenterPolicyRequestUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    public ModifyCenterPolicyRequest setUseTime(String useTime) {
        this.useTime = useTime;
        return this;
    }
    public String getUseTime() {
        return this.useTime;
    }

    public ModifyCenterPolicyRequest setVideoEncAvgKbps(Integer videoEncAvgKbps) {
        this.videoEncAvgKbps = videoEncAvgKbps;
        return this;
    }
    public Integer getVideoEncAvgKbps() {
        return this.videoEncAvgKbps;
    }

    public ModifyCenterPolicyRequest setVideoEncMaxQP(Integer videoEncMaxQP) {
        this.videoEncMaxQP = videoEncMaxQP;
        return this;
    }
    public Integer getVideoEncMaxQP() {
        return this.videoEncMaxQP;
    }

    public ModifyCenterPolicyRequest setVideoEncMinQP(Integer videoEncMinQP) {
        this.videoEncMinQP = videoEncMinQP;
        return this;
    }
    public Integer getVideoEncMinQP() {
        return this.videoEncMinQP;
    }

    public ModifyCenterPolicyRequest setVideoEncPeakKbps(Integer videoEncPeakKbps) {
        this.videoEncPeakKbps = videoEncPeakKbps;
        return this;
    }
    public Integer getVideoEncPeakKbps() {
        return this.videoEncPeakKbps;
    }

    public ModifyCenterPolicyRequest setVideoEncPolicy(String videoEncPolicy) {
        this.videoEncPolicy = videoEncPolicy;
        return this;
    }
    public String getVideoEncPolicy() {
        return this.videoEncPolicy;
    }

    public ModifyCenterPolicyRequest setVideoRedirect(String videoRedirect) {
        this.videoRedirect = videoRedirect;
        return this;
    }
    public String getVideoRedirect() {
        return this.videoRedirect;
    }

    public ModifyCenterPolicyRequest setVisualQuality(String visualQuality) {
        this.visualQuality = visualQuality;
        return this;
    }
    public String getVisualQuality() {
        return this.visualQuality;
    }

    public ModifyCenterPolicyRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public ModifyCenterPolicyRequest setWatermarkAntiCam(String watermarkAntiCam) {
        this.watermarkAntiCam = watermarkAntiCam;
        return this;
    }
    public String getWatermarkAntiCam() {
        return this.watermarkAntiCam;
    }

    public ModifyCenterPolicyRequest setWatermarkColor(Integer watermarkColor) {
        this.watermarkColor = watermarkColor;
        return this;
    }
    public Integer getWatermarkColor() {
        return this.watermarkColor;
    }

    public ModifyCenterPolicyRequest setWatermarkColumnAmount(Integer watermarkColumnAmount) {
        this.watermarkColumnAmount = watermarkColumnAmount;
        return this;
    }
    public Integer getWatermarkColumnAmount() {
        return this.watermarkColumnAmount;
    }

    public ModifyCenterPolicyRequest setWatermarkCustomText(String watermarkCustomText) {
        this.watermarkCustomText = watermarkCustomText;
        return this;
    }
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    public ModifyCenterPolicyRequest setWatermarkDegree(Double watermarkDegree) {
        this.watermarkDegree = watermarkDegree;
        return this;
    }
    public Double getWatermarkDegree() {
        return this.watermarkDegree;
    }

    public ModifyCenterPolicyRequest setWatermarkFontSize(Integer watermarkFontSize) {
        this.watermarkFontSize = watermarkFontSize;
        return this;
    }
    public Integer getWatermarkFontSize() {
        return this.watermarkFontSize;
    }

    public ModifyCenterPolicyRequest setWatermarkFontStyle(String watermarkFontStyle) {
        this.watermarkFontStyle = watermarkFontStyle;
        return this;
    }
    public String getWatermarkFontStyle() {
        return this.watermarkFontStyle;
    }

    public ModifyCenterPolicyRequest setWatermarkPower(String watermarkPower) {
        this.watermarkPower = watermarkPower;
        return this;
    }
    public String getWatermarkPower() {
        return this.watermarkPower;
    }

    public ModifyCenterPolicyRequest setWatermarkRowAmount(Integer watermarkRowAmount) {
        this.watermarkRowAmount = watermarkRowAmount;
        return this;
    }
    public Integer getWatermarkRowAmount() {
        return this.watermarkRowAmount;
    }

    public ModifyCenterPolicyRequest setWatermarkSecurity(String watermarkSecurity) {
        this.watermarkSecurity = watermarkSecurity;
        return this;
    }
    public String getWatermarkSecurity() {
        return this.watermarkSecurity;
    }

    public ModifyCenterPolicyRequest setWatermarkShadow(String watermarkShadow) {
        this.watermarkShadow = watermarkShadow;
        return this;
    }
    public String getWatermarkShadow() {
        return this.watermarkShadow;
    }

    public ModifyCenterPolicyRequest setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
        this.watermarkTransparencyValue = watermarkTransparencyValue;
        return this;
    }
    public Integer getWatermarkTransparencyValue() {
        return this.watermarkTransparencyValue;
    }

    public ModifyCenterPolicyRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public ModifyCenterPolicyRequest setWuyingKeeper(String wuyingKeeper) {
        this.wuyingKeeper = wuyingKeeper;
        return this;
    }
    public String getWuyingKeeper() {
        return this.wuyingKeeper;
    }

    public ModifyCenterPolicyRequest setWyAssistant(String wyAssistant) {
        this.wyAssistant = wyAssistant;
        return this;
    }
    public String getWyAssistant() {
        return this.wyAssistant;
    }

    public static class ModifyCenterPolicyRequestAuthorizeAccessPolicyRule extends TeaModel {
        /**
         * <p>The client access IP CIDR block in IPv4 format.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP whitelist entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyCenterPolicyRequestAuthorizeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestAuthorizeAccessPolicyRule self = new ModifyCenterPolicyRequestAuthorizeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestAuthorizeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyCenterPolicyRequestAuthorizeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule extends TeaModel {
        /**
         * <p>The target of the security group control rule, which is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group control rule. The port range is determined by the value of IpProtocol:</p>
         * <ul>
         * <li>TCP or UDP: Valid values: 1 to 65535. Separate the start port and end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>IpProtocol set to all: -1/-1.</li>
         * </ul>
         * <p>For common ports of typical applications, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group control rule. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule self = new ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyCenterPolicyRequestAuthorizeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCenterPolicyRequestClientType extends TeaModel {
        /**
         * <p>The client type for logon method control.</p>
         * 
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Specifies whether to allow a specific client type to log on to the cloud desktop.</p>
         * <blockquote>
         * <p>If you do not set the ClientType parameters, all client types are allowed to log on to the cloud desktop by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyCenterPolicyRequestClientType build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestClientType self = new ModifyCenterPolicyRequestClientType();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestClientType setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ModifyCenterPolicyRequestClientType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ModifyCenterPolicyRequestClipboardGraineds extends TeaModel {
        @NameInMap("ClipboardSize")
        public Integer clipboardSize;

        @NameInMap("ClipboardSizeUnit")
        public String clipboardSizeUnit;

        @NameInMap("ClipboardType")
        public String clipboardType;

        @NameInMap("GrainedType")
        public String grainedType;

        @NameInMap("InClipboardSize")
        public Integer inClipboardSize;

        @NameInMap("InClipboardSizeUnit")
        public String inClipboardSizeUnit;

        @NameInMap("OutClipboardSize")
        public Integer outClipboardSize;

        @NameInMap("OutClipboardSizeUnit")
        public String outClipboardSizeUnit;

        public static ModifyCenterPolicyRequestClipboardGraineds build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestClipboardGraineds self = new ModifyCenterPolicyRequestClipboardGraineds();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestClipboardGraineds setClipboardSize(Integer clipboardSize) {
            this.clipboardSize = clipboardSize;
            return this;
        }
        public Integer getClipboardSize() {
            return this.clipboardSize;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setClipboardSizeUnit(String clipboardSizeUnit) {
            this.clipboardSizeUnit = clipboardSizeUnit;
            return this;
        }
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setClipboardType(String clipboardType) {
            this.clipboardType = clipboardType;
            return this;
        }
        public String getClipboardType() {
            return this.clipboardType;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setGrainedType(String grainedType) {
            this.grainedType = grainedType;
            return this;
        }
        public String getGrainedType() {
            return this.grainedType;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setInClipboardSize(Integer inClipboardSize) {
            this.inClipboardSize = inClipboardSize;
            return this;
        }
        public Integer getInClipboardSize() {
            return this.inClipboardSize;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setInClipboardSizeUnit(String inClipboardSizeUnit) {
            this.inClipboardSizeUnit = inClipboardSizeUnit;
            return this;
        }
        public String getInClipboardSizeUnit() {
            return this.inClipboardSizeUnit;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setOutClipboardSize(Integer outClipboardSize) {
            this.outClipboardSize = outClipboardSize;
            return this;
        }
        public Integer getOutClipboardSize() {
            return this.outClipboardSize;
        }

        public ModifyCenterPolicyRequestClipboardGraineds setOutClipboardSizeUnit(String outClipboardSizeUnit) {
            this.outClipboardSizeUnit = outClipboardSizeUnit;
            return this;
        }
        public String getOutClipboardSizeUnit() {
            return this.outClipboardSizeUnit;
        }

    }

    public static class ModifyCenterPolicyRequestDeviceRedirects extends TeaModel {
        /**
         * <p>The peripheral device type.</p>
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
         * <p>deviceRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static ModifyCenterPolicyRequestDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestDeviceRedirects self = new ModifyCenterPolicyRequestDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ModifyCenterPolicyRequestDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class ModifyCenterPolicyRequestDeviceRules extends TeaModel {
        /**
         * <p>The device name.</p>
         * 
         * <strong>example:</strong>
         * <p>sandisk</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <p>The peripheral device type.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The vendor ID. See <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0x0781</p>
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

        public static ModifyCenterPolicyRequestDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestDeviceRules self = new ModifyCenterPolicyRequestDeviceRules();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ModifyCenterPolicyRequestDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public ModifyCenterPolicyRequestDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ModifyCenterPolicyRequestDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public ModifyCenterPolicyRequestDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public ModifyCenterPolicyRequestDeviceRules setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public ModifyCenterPolicyRequestDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class ModifyCenterPolicyRequestDomainResolveRule extends TeaModel {
        /**
         * <p>The policy description.</p>
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

        public static ModifyCenterPolicyRequestDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestDomainResolveRule self = new ModifyCenterPolicyRequestDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCenterPolicyRequestDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyCenterPolicyRequestDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class ModifyCenterPolicyRequestNetRedirectRule extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The redirection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static ModifyCenterPolicyRequestNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestNetRedirectRule self = new ModifyCenterPolicyRequestNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestNetRedirectRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyCenterPolicyRequestNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyCenterPolicyRequestNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class ModifyCenterPolicyRequestRecordEventLevels extends TeaModel {
        /**
         * <p>The event level.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>StartApplication</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static ModifyCenterPolicyRequestRecordEventLevels build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestRecordEventLevels self = new ModifyCenterPolicyRequestRecordEventLevels();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestRecordEventLevels setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public ModifyCenterPolicyRequestRecordEventLevels setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class ModifyCenterPolicyRequestRevokeAccessPolicyRule extends TeaModel {
        /**
         * <p>The client access IP CIDR block to delete, in IPv4 CIDR format.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP whitelist entry to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static ModifyCenterPolicyRequestRevokeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestRevokeAccessPolicyRule self = new ModifyCenterPolicyRequestRevokeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestRevokeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyCenterPolicyRequestRevokeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyCenterPolicyRequestRevokeSecurityPolicyRule extends TeaModel {
        /**
         * <p>The target of the security group control rule to delete, which is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group control rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group control rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group control rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group control rule to delete. The port range is determined by the value of IpProtocol:</p>
         * <ul>
         * <li>TCP or UDP: Valid values: 1 to 65535. Separate the start port and end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>IpProtocol set to all: -1/-1.</li>
         * </ul>
         * <p>For common ports of typical applications, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group control rule to delete. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group control rule to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>outflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyCenterPolicyRequestRevokeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestRevokeSecurityPolicyRule self = new ModifyCenterPolicyRequestRevokeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyCenterPolicyRequestRevokeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyCenterPolicyRequestUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The product ID.</p>
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
        public String usbRedirectType;

        /**
         * <p>The USB redirection rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public String usbRuleType;

        /**
         * <p>The vendor ID. See <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static ModifyCenterPolicyRequestUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyCenterPolicyRequestUsbSupplyRedirectRule self = new ModifyCenterPolicyRequestUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public ModifyCenterPolicyRequestUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCenterPolicyRequestUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ModifyCenterPolicyRequestUsbSupplyRedirectRule setUsbRedirectType(String usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public String getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public ModifyCenterPolicyRequestUsbSupplyRedirectRule setUsbRuleType(String usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public String getUsbRuleType() {
            return this.usbRuleType;
        }

        public ModifyCenterPolicyRequestUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
