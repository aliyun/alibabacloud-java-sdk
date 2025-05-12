// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether end users have the administrator permissions.</p>
     * <blockquote>
     * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AdminAccess")
    public String adminAccess;

    /**
     * <p>Specifies whether to enable the anti-screenshot feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off (default)</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    /**
     * <p>The client IP address whitelists.</p>
     */
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    /**
     * <p>The security group rules.</p>
     */
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>Specifies whether to enable the webcam redirection feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The logon method control rules to limit the type of the Alibaba Cloud Workspace client used by end users to connect to cloud computers.</p>
     */
    @NameInMap("ClientType")
    public java.util.List<ModifyPolicyGroupRequestClientType> clientType;

    /**
     * <p>The permissions on the clipboard.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>read: specifies one-way transfer. You can copy files only from local devices to cloud computers.</li>
     * <li>readwrite: specifies two-way transfer You can copy files between local devices and cloud computers.</li>
     * <li>write: specifies one-way transfer. You can only copy files from cloud computers to local devices.</li>
     * <li>off: disables both one-way and two-way transfer. Files cannot be copied between local devices and cloud computers.</li>
     * </ul>
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
     * <p>The custom peripheral rules.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("DeviceRules")
    public java.util.List<ModifyPolicyGroupRequestDeviceRules> deviceRules;

    /**
     * <p>Specifies whether the access control for domain names is enabled. Domain names support wildcards (\*). Separate multiple domain names with commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[black:],example1.com,example2.com</p>
     */
    @NameInMap("DomainList")
    public String domainList;

    /**
     * <p>The domain resolution rules.</p>
     */
    @NameInMap("DomainResolveRule")
    public java.util.List<ModifyPolicyGroupRequestDomainResolveRule> domainResolveRule;

    /**
     * <p>The type of the domain name resolution rule.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>OFF</li>
     * <li>ON</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <p>Specifies whether to turn on the Contact Administrator for Help switch.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <p>Specifies whether to turn on the User Stream Collaboration switch.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    /**
     * <p>Specifies whether to enable the Image Quality Control feature for Graphic-based cloud computers. If you have high requirements on the performance and user experience in scenarios such as professional design, we recommend that you enable this feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    /**
     * <p>Specifies whether to allow web client access.</p>
     * <blockquote>
     * <p> We recommend that you specify the ClientType-related parameters to control the Alibaba Cloud Workspace client type for cloud computer connection.``</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5Access")
    public String html5Access;

    /**
     * <p>The file transfer feature on the web client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>all: Files can be uploaded and downloaded between local computers and the web client.</li>
     * <li>download: Files on the web client can be downloaded to local computers.</li>
     * <li>upload: Files on local computers can be uploaded to the web client.</li>
     * <li>off (default): Files cannot be transferred between the web client and local computers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The protocol for network communication.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>TCP (default): TCP</li>
     * <li>BOTH: TCP and UDP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BOTH</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <p>The permissions on local disk mapping.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>read: read-only. Local disk mapping is available on cloud computers. However, you can only read (copy) local files but cannot modify the files.</li>
     * <li>readwrite: read and write. Local disk mapping is available on cloud computers. You can read (copy) and write (modify) local files.</li>
     * <li>off (default): no permissions. Local disk mapping is unavailable on cloud computers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>The maximum retry period for reconnecting to cloud computers when the cloud computers are disconnected due to none-human reasons. Valid values: 30 to 7200. Unit: seconds.</p>
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
     * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>off (default)</li>
     * <li>on</li>
     * </ul>
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
     * <p>The cloud computer preemption feature.</p>
     * <blockquote>
     * <p> To ensure user experience and data security, when a cloud computer is used by an end user, other end users cannot connect to the cloud computer. By default, this parameter is set to <code>off</code>, which cannot be modified.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>off (default): Multiple end users cannot connect to the same cloud computer at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    /**
     * <p>The usernames that are allowed to connect to the cloud computer in use. You can specify up to five usernames.</p>
     * <blockquote>
     * <p> To ensure user experience and data security, other end users cannot connect to the cloud computer that is used by an end user.</p>
     * </blockquote>
     */
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    /**
     * <p>The printer redirection feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    /**
     * <p>Specifies whether to enable the custom screen recording feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off (default)</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("RecordContent")
    public String recordContent;

    /**
     * <p>The duration in which the custom screen recording is valid. Default value: 30. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    /**
     * <p>Specifies whether to enable the screen recording feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>byaction_cmd_ft: enables the operation-triggered screen recording upon command execution and file transfer.</li>
     * <li>ALLTIME: enables the whole-process screen recording. That is, the recording starts when cloud computers are connected and ends when the cloud computers are disconnected.</li>
     * <li>session: enables the screen recording for session lifecycle listening.</li>
     * <li>PERIOD: enables the interval-based screen recording. You must specify an interval between the start time and end time of this type of recording.</li>
     * <li>byaction_commands: enables the operation-triggered screen recording upon command execution.</li>
     * <li>OFF: disables the screen recording feature.</li>
     * <li>byaction_file_transfer: enables the operation-triggered screen recording upon file transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <p>Specifies whether to record the audio files generated from cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off: records only video files.</li>
     * <li>on: records video and audio files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <p>The file length of the screen recording. Unit: minutes. Screen recording files are split based on the specified file length and uploaded to Object Storage Service (OSS) buckets. When a screen recording file reaches 300 MB in size, the system preferentially performs rolling update for the file.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>10</li>
     * <li>20</li>
     * <li>30</li>
     * <li>60</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <p>The time when the screen recording stops. Specify the value in the HH:MM:SS format. The value is meaningful only when you set <code>Recording</code> to <code>PERIOD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:59:00</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <p>The retention period of the screen recording file. Valid values: 1 to 180. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    /**
     * <p>The frame rate of screen recording. Unit: fps.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>2</li>
     * <li>5</li>
     * <li>10</li>
     * <li>15</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RecordingFps")
    public Long recordingFps;

    /**
     * <p>The time when the screen recording starts. Specify the value in the HH:MM:SS format. The value is meaningful only when you set the <code>Recording</code> parameter to <code>PERIOD</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <p>Specifies whether to enable the screen recording notification feature after end users log on to the Alibaba Cloud Workspace client.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RecordingUserNotify")
    public String recordingUserNotify;

    /**
     * <p>The notification content of screen recording. By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Your desktop is being recorded.</p>
     */
    @NameInMap("RecordingUserNotifyMessage")
    public String recordingUserNotifyMessage;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The permissions on keyboard and mouse control during remote assistance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>optionalControl: By default, you are not granted the permissions. You can apply for the permissions.</li>
     * <li>fullControl: You are granted the full permissions.</li>
     * <li>disableControl: You are not granted the permissions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fullControl</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <p>The client IP address whitelists that you want to delete.</p>
     */
    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    /**
     * <p>The security group rules that you want to delete.</p>
     */
    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    /**
     * <p>The effective scope of the policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>IP: The policy takes effect based on the IP address.</li>
     * <li>GLOBAL: The policy takes effect globally.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>This parameter is required when the <code>Scope</code> parameter is set to <code>IP</code>.````</p>
     */
    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <p>Specifies whether to enable the USB redirection feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
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
     * <p>The multimedia redirection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <p>The image display quality.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>high: high-definition (HD)</li>
     * <li>low: smoothness</li>
     * <li>lossless: no quality loss</li>
     * <li>medium (default): scenario-specific adaptation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <p>The watermarking feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>blind: Invisible watermarks are applied.</li>
     * <li>off: The watermarking feature is disabled.</li>
     * <li>on: Visible watermarks are applied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <p>Specifies whether to enable the anti-screen photo feature for invisible watermarks.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkAntiCam")
    public String watermarkAntiCam;

    /**
     * <p>The font color in red, green, and blue (RGB) of the watermark. Valid values: 0 to 16777215.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    /**
     * <p>The watermark rotation. Valid values: -10 to -30.</p>
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
     * <p>Valid values:</p>
     * <ul>
     * <li>plain</li>
     * <li>bold</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>plain</p>
     */
    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    /**
     * <p>The watermark enhancement feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>high</li>
     * <li>low</li>
     * <li>medium</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("WatermarkPower")
    public String watermarkPower;

    /**
     * <p>The number of watermark rows.</p>
     * <blockquote>
     * <p> This parameter is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <p>Specifies whether to enable the security priority feature for invisible watermarks.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    /**
     * <p>The watermark transparency.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>LIGHT (default)</li>
     * <li>DARK</li>
     * <li>MIDDLE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIGHT</p>
     */
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    /**
     * <p>The watermark opacity. A larger value indicates more opaque watermarks. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <p>The watermark content. You can select up to three items as the watermark content. Separate multiple items with commas (,).</p>
     * <blockquote>
     * <p> If you set this parameter to <code>Custom</code>, you must specify <code>WatermarkCustomText</code>.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>EndUserId: the username</li>
     * <li>Custom: the custom text</li>
     * <li>DesktopIp: the IP address of the cloud computer</li>
     * <li>ClientIp: the IP address of the Alibaba Cloud Workspace client</li>
     * <li>HostName: the rightmost 15 digits of the cloud computer ID</li>
     * <li>ClientTime: the current time displayed on the cloud computer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EndUserId</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    /**
     * <p>Specifies whether to display the Xiaoying AI Assistant entry in the DesktopAssistant menu.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>off: does not display the Xiaoying AI Assistant entry in the DesktopAssistant menu.</li>
     * <li>on: displays the Xiaoying AI Assistant entry in the DesktopAssistant menu.</li>
     * </ul>
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
         * <p>The client CIDR block. Specify an IPv4 CIDR block.</p>
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
         * <p>The object to which the security group rule applies. The value is an IPv4 CIDR block.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>UDP: the User Datagram Protocol (UDP) protocol.</li>
         * <li>TCP: the Transmission Control Protocol (TCP) protocol.</li>
         * <li>ALL: all protocols.</li>
         * <li>GRE: the Generic Routing Encapsulation (GRE) protocol.</li>
         * <li>ICMP: the Internet Control Message Protocol (ICMP) for (IPv4)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>drop: denies all access requests. If no messages of access denied are returned, the requests timed out or failed.</li>
         * <li>accept: accepts all requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule. The value range of this parameter varies based on the value of the IpProtocol parameter.</p>
         * <ul>
         * <li>If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
         * <li>If the IpProtocol parameter is set to ICMP, set the value to -1/-1.</li>
         * <li>If the IpProtocol parameter is set to GRE, set the value to -1/-1.</li>
         * <li>If the IpProtocol parameter is set to ALL, set the value to -1/-1.</li>
         * </ul>
         * <p>For more information about the common ports applied in EDS, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>outflow: outbound</li>
         * <li>inflow: inbound</li>
         * </ul>
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
         * <p>The type of the Alibaba Cloud Workspace client.</p>
         * <blockquote>
         * <p> If you do not specify the <code>ClientType</code> parameter, all types of the client are allowed by default.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>html5: web client</li>
         * <li>android: Android client</li>
         * <li>windows: Windows client</li>
         * <li>ios: iOS client</li>
         * <li>macos: macOS client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Specifies whether to allow end users to use a specific type of the client to connect to cloud computers.</p>
         * <blockquote>
         * <p> If you do not specify the <code>ClientType</code> parameter, all types of the client are allowed by default.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
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
         * <p>The peripheral type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>printer</li>
         * <li>scanner</li>
         * <li>camera</li>
         * <li>adb: the Android Debug Bridge (ADB) device</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The redirection type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>deviceRedirect: device redirection</li>
         * <li>usbRedirect: USB redirection</li>
         * <li>off: redirection disabled</li>
         * </ul>
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
         * <p>The device name.</p>
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
         * <p>The peripheral type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>usbKey: UKeys</li>
         * <li>other: other peripheral devices.</li>
         * <li>graphicsTablet: graphics tablets.</li>
         * <li>printer: printers.</li>
         * <li>cardReader: card readers.</li>
         * <li>scanner: scanners.</li>
         * <li>storage: storage devices.</li>
         * <li>camera: web cameras.</li>
         * <li>adb: Android Debug Bridge (ADB) device</li>
         * <li>networkInterfaceCard: NIC devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>deviceRedirect: device redirection</li>
         * <li>usbRedirect: USB redirection.</li>
         * <li>off: redirection disabled</li>
         * </ul>
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
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>description policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.igetget.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The resolution policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow</li>
         * <li>block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
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
         * <p>The client CIDR block that you want to delete. Specify an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client IP address whitelist that you want to delete.</p>
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
         * <p>The object of the security group rule that you want to delete. The value is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule that you want to delete.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ALL</li>
         * <li>GRE</li>
         * <li>ICMP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization of the security group rule that you want to delete.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>drop: denies all access requests. If no messages of access denied are returned, the requests timed out or failed.</li>
         * <li>accept (default): accepts all requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule that you want to delete. The value range of this parameter varies based on the value of the IpProtocol parameter.</p>
         * <ul>
         * <li>If the IpProtocol parameter is set to TCP or UDP, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
         * <li>If the IpProtocol parameter is set to ICMP, set the value to -1/-1.</li>
         * <li>If the IpProtocol parameter is set to GRE, set the value to -1/-1.</li>
         * <li>If the IpProtocol parameter is set to ALL, set the value to -1/-1.</li>
         * </ul>
         * <p>For more information about the common ports applied in EDS, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule that you want to delete. A smaller value indicates a higher priority. Valid values: 1 to 60. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule that you want to delete.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>outflow: outbound</li>
         * <li>inflow: inbound</li>
         * </ul>
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
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device class. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0Eh</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The device subclass. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
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
         * <p>Specifies whether to allow USB redirection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: allows USB redirection.</li>
         * <li>2: forbids USB redirection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: by device class</li>
         * <li>2: by device vendor</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
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
