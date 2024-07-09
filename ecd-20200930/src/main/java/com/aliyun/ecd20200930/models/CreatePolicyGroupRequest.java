// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether users have the administrator permissions after they connect to cloud desktops.</p>
     * <blockquote>
     * <p> This parameter is in invitational preview and not available to the public.</p>
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
     * <li><p>off: Anti-screenshot is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: Anti-screenshot is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    /**
     * <p>The client IP address whitelists. Only the client IP addresses in whitelists can access the cloud desktop.</p>
     */
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    /**
     * <p>The security group rules.</p>
     */
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    /**
     * <p>Specifies whether to enable the webcam redirection feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: Webcam redirection is disabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: Webcam redirection is enabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    /**
     * <p>The logon methods. You can use this parameter to determine which clients can be used to connect to the cloud desktop.</p>
     */
    @NameInMap("ClientType")
    public java.util.List<CreatePolicyGroupRequestClientType> clientType;

    /**
     * <p>The permissions on the clipboard.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>read: specifies one-way transfer</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>You can copy data from your local computer to the cloud desktop, but cannot copy data from the cloud desktop to your local computer.</p>
     * <!-- -->
     * </li>
     * <li><p>readwrite: specifies two-way transfer</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>You can copy data between your local computer and the cloud desktop.</p>
     * <!-- -->
     * </li>
     * <li><p>off: disables both one-way and two-way transfer</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>You cannot copy data between your local computer and the cloud desktop. This value is the default value.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>Access control for domain names. The wildcard character (\*) is supported for domain names. Separate multiple domain names with commas (,). Valid values:</p>
     * <ul>
     * <li>off</li>
     * <li>on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("DomainList")
    public String domainList;

    /**
     * <p>The details of the domain name resolution policy.</p>
     */
    @NameInMap("DomainResolveRule")
    public java.util.List<CreatePolicyGroupRequestDomainResolveRule> domainResolveRule;

    /**
     * <p>The type of the domain name resolution policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>OFF</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ON</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    /**
     * <p>Specifies whether to allow end users to seek assistance from the administrator. Valid values: ON OFF</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    /**
     * <p>The switch for collaboration between end users. Valid values: ON OFF</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    /**
     * <p>Specifies whether to enable the image display quality feature for the Graphics cloud desktop. If you have high requirements for desktop performance and user experience, we recommend that you enable this feature. For example, you can enable this feature in professional design scenarios.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    /**
     * <p>The policy for HTML5 client access.</p>
     * <blockquote>
     * <p>We recommend that you use the ClientType parameter to manage the type of Alibaba Cloud Workspace clients for desktop connection.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: HTML5 client access is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: HTML5 client access is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5Access")
    public String html5Access;

    /**
     * <p>The file transfer policy for HTML5 clients.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>all: Files can be uploaded and downloaded between your computer and HTML5 clients.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>download: Files on HTML5 clients can be downloaded to your computer.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>upload: Files on your computer can be uploaded to HTML5 clients.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>off: File transfer between HTML5 clients and your computer is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    /**
     * <p>The protocol that you want to use for network communication. Valid values: -TCP: Only TCP is allowed. -BOTH: Automatic switch between TCP and UDP is allowed. Default value: TCP.</p>
     * 
     * <strong>example:</strong>
     * <p>both</p>
     */
    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    /**
     * <p>The permissions on local disk mapping.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>read: read-only</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>The disks on your local computer are mapped to the cloud desktop. You can only read (copy) files on the local computer.</p>
     * <!-- -->
     * </li>
     * <li><p>readwrite: read and write</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>The disks on your local computer are mapped to the cloud desktop. You can read (copy) and modify files on your local computer.</p>
     * <!-- -->
     * </li>
     * <li><p>off:</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>The disks on your local computer are not mapped to the cloud desktop. This value is the default value.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("MaxReconnectTime")
    public Integer maxReconnectTime;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyGroupName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable the network redirection feature.</p>
     * <blockquote>
     * <p>This feature is in invitational preview and is not available to the public.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off (default): The network redirection feature is disabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: The network redirection feature is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("NetRedirect")
    public String netRedirect;

    /**
     * <p>Specifies whether to allow user preemption.</p>
     * <blockquote>
     * <p>To improve user experience and ensure data security, multiple end users cannot connect to the same cloud desktop at the same time. The default value of this parameter is <code>off</code>, and the value cannot be changed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    /**
     * <p>The names of the users that are allowed to connect to the same cloud desktop at the same time. You can specify up to five usernames.</p>
     * <blockquote>
     * <p>To improve user experience and ensure data security, we recommend that you disable the user preemption feature.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    /**
     * <p>The policy for printer redirection.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: Printer redirection is disabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: Printer redirection is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    /**
     * <p>Specifies whether to enable the custom screen recording feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: Custom screen recording is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: Custom screen recording is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
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
     * <p>Specifies whether to enable screen recording.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ALLTIME: All operations that are performed by end users on cloud desktops are recorded. The recording starts immediately when end users connect to cloud desktops and ends when the end users disconnect from the cloud desktops.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PERIOD: The operations that are performed by end users on cloud desktops during a specified period of time are recorded. You must set the start time and end time for the recording period.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>OFF: Screen recording is disabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("Recording")
    public String recording;

    /**
     * <p>Specifies whether to record audio data during the screen recording. Valid values:</p>
     * <ul>
     * <li>on: records audio and video data</li>
     * <li>off: records only video data</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RecordingAudio")
    public String recordingAudio;

    /**
     * <p>The duration from the time when the screen recording starts to the time when the screen recording stops. If you specify the Recording parameter, you must also specify the RecordingDuration parameter. When the specified duration ends, a recording file is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    /**
     * <p>The time when the screen recording stops. Specify the value in the HH:MM:SS format. The value of this parameter is valid only if you set the Recording parameter to PERIOD.</p>
     * 
     * <strong>example:</strong>
     * <p>08:59:00</p>
     */
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    /**
     * <p>The duration in which the screen recording is valid. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    /**
     * <p>The frame rate of screen recording.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>2</p>
     * </li>
     * <li><p>5</p>
     * </li>
     * <li><p>10</p>
     * </li>
     * <li><p>15</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecordingFps")
    public Long recordingFps;

    /**
     * <p>The time when screen recording starts. Specify the value in the HH:MM:SS format. The value of this parameter is valid only if you set the Recording parameter to PERIOD.</p>
     * 
     * <strong>example:</strong>
     * <p>08:00:00</p>
     */
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    /**
     * <p>Specifies whether the feature to send screen recording notifications to clients is enabled. Valid values: on and off.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("RecordingUserNotify")
    public String recordingUserNotify;

    /**
     * <p>The notification content sent to clients when screen recording is enabled. By default, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Your desktop is being recorded.</p>
     */
    @NameInMap("RecordingUserNotifyMessage")
    public String recordingUserNotifyMessage;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The permission to control the keyboard and the mouse during remote assistance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>optionalControl: By default, this feature is disabled. You can enable it by applying permissions.</p>
     * </li>
     * <li><p>fullControl: The permission is granted.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>disableControl: The permission is revoked.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fullControl</p>
     */
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    /**
     * <p>The effective scope of the policy. Valid values:</p>
     * <ul>
     * <li>GLOBAL: The policy takes effect globally.</li>
     * <li>IP: The policy takes effect for specified IP addresses.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GLOBAL</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The effective CIDR block ranges. If you set the Scope parameter to IP, you must specify this parameter.</p>
     */
    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    /**
     * <p>Specifies whether to enable USB redirection.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: USB redirection is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: USB redirection is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
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
    public java.util.List<CreatePolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    /**
     * <p>Specifies whether to enable the multimedia redirection feature. Valid values:</p>
     * <ul>
     * <li>on: Multimedia redirection is enabled.</li>
     * <li>off: Multimedia redirection is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("VideoRedirect")
    public String videoRedirect;

    /**
     * <p>The policy for image display quality.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>high</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>low</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>lossless</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>medium: adaptive. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("VisualQuality")
    public String visualQuality;

    /**
     * <p>Specifies whether to enable watermarking.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>off: Watermarking is disabled. This value is the default value.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>on: Watermarking is enabled.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    /**
     * <p>The anti-screen photo feature. Valid values: on and off.</p>
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
     * <p>The inclination angle of the watermark. Valid values: -10 to -30.</p>
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
     * <p>The font style of the watermark. Valid values:</p>
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
     * <p>The invisible watermark enhancement feature. Valid values: low, medium, and high.</p>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("WatermarkPower")
    public String watermarkPower;

    /**
     * <p>The number of watermark rows. This parameter is now invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    /**
     * <p>The security priority for invisible watermarks. Valid values: on and off.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("WatermarkSecurity")
    public String watermarkSecurity;

    /**
     * <p>The transparency of the watermark.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>LIGHT</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>DARK</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>MIDDLE</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIGHT</p>
     */
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    /**
     * <p>The transparency of the watermark. A larger value specifies that the watermark is less transparent. Valid values: 10 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

    /**
     * <p>The type of the watermark. You can specify multiple types of watermarks at the same time. Separate multiple watermark types with commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>EndUserId: The ID of the end user is displayed.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>HostName: The rightmost 15 characters of the cloud desktop ID are displayed.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EndUserId</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    public static CreatePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupRequest self = new CreatePolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyGroupRequest setAdminAccess(String adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }
    public String getAdminAccess() {
        return this.adminAccess;
    }

    public CreatePolicyGroupRequest setAppContentProtection(String appContentProtection) {
        this.appContentProtection = appContentProtection;
        return this;
    }
    public String getAppContentProtection() {
        return this.appContentProtection;
    }

    public CreatePolicyGroupRequest setAuthorizeAccessPolicyRule(java.util.List<CreatePolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule) {
        this.authorizeAccessPolicyRule = authorizeAccessPolicyRule;
        return this;
    }
    public java.util.List<CreatePolicyGroupRequestAuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRule() {
        return this.authorizeAccessPolicyRule;
    }

    public CreatePolicyGroupRequest setAuthorizeSecurityPolicyRule(java.util.List<CreatePolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
        this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
        return this;
    }
    public java.util.List<CreatePolicyGroupRequestAuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    public CreatePolicyGroupRequest setCameraRedirect(String cameraRedirect) {
        this.cameraRedirect = cameraRedirect;
        return this;
    }
    public String getCameraRedirect() {
        return this.cameraRedirect;
    }

    public CreatePolicyGroupRequest setClientType(java.util.List<CreatePolicyGroupRequestClientType> clientType) {
        this.clientType = clientType;
        return this;
    }
    public java.util.List<CreatePolicyGroupRequestClientType> getClientType() {
        return this.clientType;
    }

    public CreatePolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public CreatePolicyGroupRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public CreatePolicyGroupRequest setDomainResolveRule(java.util.List<CreatePolicyGroupRequestDomainResolveRule> domainResolveRule) {
        this.domainResolveRule = domainResolveRule;
        return this;
    }
    public java.util.List<CreatePolicyGroupRequestDomainResolveRule> getDomainResolveRule() {
        return this.domainResolveRule;
    }

    public CreatePolicyGroupRequest setDomainResolveRuleType(String domainResolveRuleType) {
        this.domainResolveRuleType = domainResolveRuleType;
        return this;
    }
    public String getDomainResolveRuleType() {
        return this.domainResolveRuleType;
    }

    public CreatePolicyGroupRequest setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
        this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
        return this;
    }
    public String getEndUserApplyAdminCoordinate() {
        return this.endUserApplyAdminCoordinate;
    }

    public CreatePolicyGroupRequest setEndUserGroupCoordinate(String endUserGroupCoordinate) {
        this.endUserGroupCoordinate = endUserGroupCoordinate;
        return this;
    }
    public String getEndUserGroupCoordinate() {
        return this.endUserGroupCoordinate;
    }

    public CreatePolicyGroupRequest setGpuAcceleration(String gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public String getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public CreatePolicyGroupRequest setHtml5Access(String html5Access) {
        this.html5Access = html5Access;
        return this;
    }
    public String getHtml5Access() {
        return this.html5Access;
    }

    public CreatePolicyGroupRequest setHtml5FileTransfer(String html5FileTransfer) {
        this.html5FileTransfer = html5FileTransfer;
        return this;
    }
    public String getHtml5FileTransfer() {
        return this.html5FileTransfer;
    }

    public CreatePolicyGroupRequest setInternetCommunicationProtocol(String internetCommunicationProtocol) {
        this.internetCommunicationProtocol = internetCommunicationProtocol;
        return this;
    }
    public String getInternetCommunicationProtocol() {
        return this.internetCommunicationProtocol;
    }

    public CreatePolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public CreatePolicyGroupRequest setMaxReconnectTime(Integer maxReconnectTime) {
        this.maxReconnectTime = maxReconnectTime;
        return this;
    }
    public Integer getMaxReconnectTime() {
        return this.maxReconnectTime;
    }

    public CreatePolicyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyGroupRequest setNetRedirect(String netRedirect) {
        this.netRedirect = netRedirect;
        return this;
    }
    public String getNetRedirect() {
        return this.netRedirect;
    }

    public CreatePolicyGroupRequest setPreemptLogin(String preemptLogin) {
        this.preemptLogin = preemptLogin;
        return this;
    }
    public String getPreemptLogin() {
        return this.preemptLogin;
    }

    public CreatePolicyGroupRequest setPreemptLoginUser(java.util.List<String> preemptLoginUser) {
        this.preemptLoginUser = preemptLoginUser;
        return this;
    }
    public java.util.List<String> getPreemptLoginUser() {
        return this.preemptLoginUser;
    }

    public CreatePolicyGroupRequest setPrinterRedirection(String printerRedirection) {
        this.printerRedirection = printerRedirection;
        return this;
    }
    public String getPrinterRedirection() {
        return this.printerRedirection;
    }

    public CreatePolicyGroupRequest setRecordContent(String recordContent) {
        this.recordContent = recordContent;
        return this;
    }
    public String getRecordContent() {
        return this.recordContent;
    }

    public CreatePolicyGroupRequest setRecordContentExpires(Long recordContentExpires) {
        this.recordContentExpires = recordContentExpires;
        return this;
    }
    public Long getRecordContentExpires() {
        return this.recordContentExpires;
    }

    public CreatePolicyGroupRequest setRecording(String recording) {
        this.recording = recording;
        return this;
    }
    public String getRecording() {
        return this.recording;
    }

    public CreatePolicyGroupRequest setRecordingAudio(String recordingAudio) {
        this.recordingAudio = recordingAudio;
        return this;
    }
    public String getRecordingAudio() {
        return this.recordingAudio;
    }

    public CreatePolicyGroupRequest setRecordingDuration(Integer recordingDuration) {
        this.recordingDuration = recordingDuration;
        return this;
    }
    public Integer getRecordingDuration() {
        return this.recordingDuration;
    }

    public CreatePolicyGroupRequest setRecordingEndTime(String recordingEndTime) {
        this.recordingEndTime = recordingEndTime;
        return this;
    }
    public String getRecordingEndTime() {
        return this.recordingEndTime;
    }

    public CreatePolicyGroupRequest setRecordingExpires(Long recordingExpires) {
        this.recordingExpires = recordingExpires;
        return this;
    }
    public Long getRecordingExpires() {
        return this.recordingExpires;
    }

    public CreatePolicyGroupRequest setRecordingFps(Long recordingFps) {
        this.recordingFps = recordingFps;
        return this;
    }
    public Long getRecordingFps() {
        return this.recordingFps;
    }

    public CreatePolicyGroupRequest setRecordingStartTime(String recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }
    public String getRecordingStartTime() {
        return this.recordingStartTime;
    }

    public CreatePolicyGroupRequest setRecordingUserNotify(String recordingUserNotify) {
        this.recordingUserNotify = recordingUserNotify;
        return this;
    }
    public String getRecordingUserNotify() {
        return this.recordingUserNotify;
    }

    public CreatePolicyGroupRequest setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
        this.recordingUserNotifyMessage = recordingUserNotifyMessage;
        return this;
    }
    public String getRecordingUserNotifyMessage() {
        return this.recordingUserNotifyMessage;
    }

    public CreatePolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolicyGroupRequest setRemoteCoordinate(String remoteCoordinate) {
        this.remoteCoordinate = remoteCoordinate;
        return this;
    }
    public String getRemoteCoordinate() {
        return this.remoteCoordinate;
    }

    public CreatePolicyGroupRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePolicyGroupRequest setScopeValue(java.util.List<String> scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }
    public java.util.List<String> getScopeValue() {
        return this.scopeValue;
    }

    public CreatePolicyGroupRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public CreatePolicyGroupRequest setUsbSupplyRedirectRule(java.util.List<CreatePolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule) {
        this.usbSupplyRedirectRule = usbSupplyRedirectRule;
        return this;
    }
    public java.util.List<CreatePolicyGroupRequestUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
        return this.usbSupplyRedirectRule;
    }

    public CreatePolicyGroupRequest setVideoRedirect(String videoRedirect) {
        this.videoRedirect = videoRedirect;
        return this;
    }
    public String getVideoRedirect() {
        return this.videoRedirect;
    }

    public CreatePolicyGroupRequest setVisualQuality(String visualQuality) {
        this.visualQuality = visualQuality;
        return this;
    }
    public String getVisualQuality() {
        return this.visualQuality;
    }

    public CreatePolicyGroupRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public CreatePolicyGroupRequest setWatermarkAntiCam(String watermarkAntiCam) {
        this.watermarkAntiCam = watermarkAntiCam;
        return this;
    }
    public String getWatermarkAntiCam() {
        return this.watermarkAntiCam;
    }

    public CreatePolicyGroupRequest setWatermarkColor(Integer watermarkColor) {
        this.watermarkColor = watermarkColor;
        return this;
    }
    public Integer getWatermarkColor() {
        return this.watermarkColor;
    }

    public CreatePolicyGroupRequest setWatermarkDegree(Double watermarkDegree) {
        this.watermarkDegree = watermarkDegree;
        return this;
    }
    public Double getWatermarkDegree() {
        return this.watermarkDegree;
    }

    public CreatePolicyGroupRequest setWatermarkFontSize(Integer watermarkFontSize) {
        this.watermarkFontSize = watermarkFontSize;
        return this;
    }
    public Integer getWatermarkFontSize() {
        return this.watermarkFontSize;
    }

    public CreatePolicyGroupRequest setWatermarkFontStyle(String watermarkFontStyle) {
        this.watermarkFontStyle = watermarkFontStyle;
        return this;
    }
    public String getWatermarkFontStyle() {
        return this.watermarkFontStyle;
    }

    public CreatePolicyGroupRequest setWatermarkPower(String watermarkPower) {
        this.watermarkPower = watermarkPower;
        return this;
    }
    public String getWatermarkPower() {
        return this.watermarkPower;
    }

    public CreatePolicyGroupRequest setWatermarkRowAmount(Integer watermarkRowAmount) {
        this.watermarkRowAmount = watermarkRowAmount;
        return this;
    }
    public Integer getWatermarkRowAmount() {
        return this.watermarkRowAmount;
    }

    public CreatePolicyGroupRequest setWatermarkSecurity(String watermarkSecurity) {
        this.watermarkSecurity = watermarkSecurity;
        return this;
    }
    public String getWatermarkSecurity() {
        return this.watermarkSecurity;
    }

    public CreatePolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    public CreatePolicyGroupRequest setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
        this.watermarkTransparencyValue = watermarkTransparencyValue;
        return this;
    }
    public Integer getWatermarkTransparencyValue() {
        return this.watermarkTransparencyValue;
    }

    public CreatePolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class CreatePolicyGroupRequestAuthorizeAccessPolicyRule extends TeaModel {
        /**
         * <p>The IPv4 CIDR block that you want to access from the client. The value is an IPv4 CIDR block.</p>
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
         * <p>North China Branch</p>
         */
        @NameInMap("Description")
        public String description;

        public static CreatePolicyGroupRequestAuthorizeAccessPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestAuthorizeAccessPolicyRule self = new CreatePolicyGroupRequestAuthorizeAccessPolicyRule();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestAuthorizeAccessPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public CreatePolicyGroupRequestAuthorizeAccessPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class CreatePolicyGroupRequestAuthorizeSecurityPolicyRule extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
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
         * <li><p>TCP</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>UDP</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ALL: all protocols</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>GRE</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ICMP: ICMP (IPv4)</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>drop: denies all access requests</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>If no denied messages are returned, the requests timed out or failed.</p>
         * <!-- -->
         * </li>
         * <li><p>accept: accepts all access requests</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <p>This value is the default value.</p>
         * <!-- --></li>
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
         * <li>If you set the IpProtocol parameter to TCP or UDP, the value range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</li>
         * <li>If you set the IpProtocol parameter to ICMP, the start port number and the end port number are -1/-1.</li>
         * <li>If you set the IpProtocol parameter to GRE, the start port number and the end port number are -1/-1.</li>
         * <li>If you set the IpProtocol parameter to ALL, the start port number and the end port number are -1/-1.</li>
         * </ul>
         * <p>For more information about the common ports of applications, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value specifies a higher priority.\
         * Valid values: 1 to 60.\
         * Default value: 1.</p>
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
         * <li><p>outflow: outbound</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>inflow: inbound</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreatePolicyGroupRequestAuthorizeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestAuthorizeSecurityPolicyRule self = new CreatePolicyGroupRequestAuthorizeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreatePolicyGroupRequestAuthorizeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreatePolicyGroupRequestClientType extends TeaModel {
        /**
         * <p>The type of the client.</p>
         * <blockquote>
         * <p>By default, if you do not specify the ClientType parameter, all types of clients can be used to connect to cloud desktops.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>html5: web clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>android: Android clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>linux: Alibaba Cloud Workspace clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ios: iOS clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>windows: Windows clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>macos: macOS clients</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Specifies whether a specific client type can be used to connect to the cloud desktop.</p>
         * <blockquote>
         * <p>By default, if you do not specify the ClientType parameter, all types of clients can be used to connect to cloud desktops.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>OFF: Clients of the specified type cannot be used to connect to cloud desktops.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ON: Clients of the specified type can be used to connect to cloud desktops.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreatePolicyGroupRequestClientType build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestClientType self = new CreatePolicyGroupRequestClientType();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestClientType setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public CreatePolicyGroupRequestClientType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreatePolicyGroupRequestDomainResolveRule extends TeaModel {
        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>system policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.baidu.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Specifies whether to allow the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>allow</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>block</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static CreatePolicyGroupRequestDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestDomainResolveRule self = new CreatePolicyGroupRequestDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyGroupRequestDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreatePolicyGroupRequestDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class CreatePolicyGroupRequestUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The class of the device. If you set the <code>usbRuleType</code> parameter to 1, you must specify this parameter. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0Eh</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The subclass of the device. If you set the <code>usbRuleType</code> parameter to 1, you must specify this parameter. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>xxh</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The type of USB redirection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>1: allows USB redirection</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>2: forbids USB redirection</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
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
         * <li><p>1: by device class</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>2: by device vendor</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The ID of the vendor. For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static CreatePolicyGroupRequestUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyGroupRequestUsbSupplyRedirectRule self = new CreatePolicyGroupRequestUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setDeviceClass(String deviceClass) {
            this.deviceClass = deviceClass;
            return this;
        }
        public String getDeviceClass() {
            return this.deviceClass;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setDeviceSubclass(String deviceSubclass) {
            this.deviceSubclass = deviceSubclass;
            return this;
        }
        public String getDeviceSubclass() {
            return this.deviceSubclass;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setUsbRedirectType(Long usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setUsbRuleType(Long usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        public CreatePolicyGroupRequestUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
