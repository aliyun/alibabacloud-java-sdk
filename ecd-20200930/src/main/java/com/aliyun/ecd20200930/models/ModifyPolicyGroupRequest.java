// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    // Specifies whether the anti-screenshot feature is enabled. Valid values:
    // 
    // on: enables the anti-screenshot feature. off: disables the anti-screenshot feature. Default value: off.
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    // The client IP address whitelists.
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    // The security group rules.
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    // Specifies whether the webcam redirection feature is enabled. Valid values:
    // 
    // *   `on`: The webcam redirection feature is enabled.
    // *   `off`: disables the webcam redirection feature.
    // 
    // Default value: `on`.
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    // The logon methods.
    @NameInMap("ClientType")
    public java.util.List<ModifyPolicyGroupRequestClientType> clientType;

    // The permissions on the clipboard. Valid values:
    // 
    // *   read: read-only. You can copy data from your computer to cloud desktops, but cannot copy data from cloud desktops to your computer.
    // *   readwrite: read and write. You can copy data between your computer and cloud desktops.
    // *   off: disabled. You cannot copy data between your computer and cloud desktops in any direction.
    // 
    // Default value: off.
    @NameInMap("Clipboard")
    public String clipboard;

    // The blacklist or whitelist of domain names. Domain names support the asterisk (\*) wildcard. Separate multiple domain names with commas (,). Valid values:
    // 
    // *   \[black:],example1.com,example2.com: the domain name blacklist.
    // *   \[white:],example1.com,example2.com: the domain name whitelist.
    @NameInMap("DomainList")
    public String domainList;

    // Specifies whether to enable the image quality policy for Graphics desktops. We recommend that you enable this policy if you have high requirements on desktop performance and user experience. For example, you can enable this policy in professional design scenarios. Valid values:
    // 
    // *   on: enables the image quality policy for Graphics desktops.
    // *   off: disables the image quality policy for Graphics desktops.
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    // The access policy on HTML5 clients. Valid values:
    // 
    // *   on: Access from HTML5 clients is allowed.
    // *   off: Access from HTML5 clients is not allowed.
    // 
    // Default value: off.
    // 
    // > We recommend that you use the ClientType-related parameters to control the EDS client type for cloud desktop logon.
    @NameInMap("Html5Access")
    public String html5Access;

    // The file transfer policy for HTML5 clients. Valid values:
    // 
    // *   off: disables file transfer.
    // *   upload: Files on your computer can be uploaded to HTML5 clients.
    // *   download: Files on HTML5 clients can be downloaded to your computer.
    // *   all: Files can be uploaded and downloaded between your computer and HTML5 clients.
    // 
    // Default value: off.
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    // The permissions on local disk mapping. Valid values:
    // 
    // *   read: read-only. The local disks on your computer are mapped to cloud desktops. You can only read (copy) local files, but cannot modify them.
    // *   readwrite: read and write. The local disks on your computer are mapped to cloud desktops. You can read (copy) and modify local files.
    // *   off: disabled. Disks on your computer are not mapped to cloud desktops.
    @NameInMap("LocalDrive")
    public String localDrive;

    // The name of the policy.
    @NameInMap("Name")
    public String name;

    @NameInMap("NetRedirect")
    public String netRedirect;

    // The ID of the policy.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    // Specifies whether to allow user preemption. The default value is off and cannot be modified.
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    // The names of the users that are allowed to connect to the same cloud desktop at the same time. You can specify up to five usernames.
    // 
    // > To improve user experience and ensure data security, multiple regular users cannot connect to the same cloud desktop at the same time.
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    // The policy for printer redirection. Valid values:
    // 
    // *   off: disables printer redirection.
    // *   on: Printer redirection is enabled.
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    // Specifies whether the custom screen recording feature is enabled. Valid values:
    // 
    // on: enables the custom screen recording feature. off: disables the custom screen recording feature. Default value: off.
    @NameInMap("RecordContent")
    public String recordContent;

    // The time when the custom screen recording expires. Default value: 30 days.
    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    // Specifies whether to enable screen recording. Valid values:
    // 
    // *   OFF: disables the screen recording feature.
    // *   ALLTIME: All operations that are performed by regular users on cloud desktops are recorded. The recording starts immediately when regular users connect to cloud desktops and ends after the regular users disconnect from the cloud desktops.
    // *   PERIOD: The operations that are performed by regular users on cloud desktops during a specified period of time are recorded. You must set the start time and the end time of the recording.
    @NameInMap("Recording")
    public String recording;

    @NameInMap("RecordingAudio")
    public String recordingAudio;

    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    // The end time of the screen recording. The value is in the format of HH:MM:SS. The value is meaningful only when you set the Recording parameter to PERIOD.
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    // The number of frames for the screen recording. Valid values:
    // 
    // *   2
    // *   5
    // *   10
    // *   15
    @NameInMap("RecordingFps")
    public Long recordingFps;

    // The start time of the screen recording. The value is in the format of HH:MM:SS. The value is meaningful only when you set the Recording parameter to PERIOD.
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    // The client IP address whitelists to be deleted.
    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    // The security group rules to be deleted.
    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    // Specifies whether to enable USB redirection. Valid values:
    // 
    // *   on: enables USB redirection.
    // *   off: disables USB redirection.
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    // The USB redirection rules.
    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    // The policy for image display quality. Valid values:
    // 
    // *   low
    // *   medium
    // *   high
    // *   lossless
    // 
    // Default value: medium.
    @NameInMap("VisualQuality")
    public String visualQuality;

    // Specifies whether to enable watermarking. Valid values:
    // 
    // *   on: enables watermarking.
    // *   off: disables watermarking.
    @NameInMap("Watermark")
    public String watermark;

    // The transparency of the watermark. Valid values:
    // 
    // *   LIGHT
    // *   MIDDLE
    // *   DARK
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    // The type of the watermark. You can specify multiple watermark types at a time. Separate the watermark types with commas (,). Valid values:
    // 
    // *   EndUserId: The username is displayed.
    // *   HostName: The last 15 characters of the cloud desktop ID are displayed.
    @NameInMap("WatermarkType")
    public String watermarkType;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
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

    public ModifyPolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    public ModifyPolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class ModifyPolicyGroupRequestAuthorizeAccessPolicyRule extends TeaModel {
        // The IPv4 CIDR block that can be accessed from the client. The value is an IPv4 CIDR block.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the client IP address whitelist.
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
        // The IPv4 CIDR block of the security group rule.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the security group rule.
        @NameInMap("Description")
        public String description;

        // The protocol type of the security group rule. Valid values:
        // 
        // *   tcp: TCP
        // *   udp: UDP
        // *   icmp:ICMP (IPv4)
        // *   gre: GRE
        // *   all: All protocols are supported.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The authorization policy of the security group rule. Valid values:
        // 
        // *   accept: specifies the Allow policy that allows all access requests.
        // *   drop: specifies the Deny policy that denies all access requests. If no messages of access denied are returned, the requests timed out or failed.
        @NameInMap("Policy")
        public String policy;

        // The port range of the security group rule. The value of the port range is determined by the protocol type specified by the AuthorizeSecurityPolicyRules.IpProtocol parameter.
        // 
        // *   If the AuthorizeSecurityPolicyRules.IpProtocol parameter is set to tcp or udp, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
        // *   If the AuthorizeSecurityPolicyRules.IpProtocol parameter is set to icmp, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRules.IpProtocol parameter is set to gre, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRules.IpProtocol parameter is set to all, set the value to -1/-1.
        // 
        // For more information about the common ports of typical applications, see [Common ports](~~40724~~).
        @NameInMap("PortRange")
        public String portRange;

        // The priority of the security group rule. A smaller value indicates a higher priority.
        // - Valid values: 1 to 60.
        // - Default value: 1.
        @NameInMap("Priority")
        public String priority;

        // The direction of the security group rule. Valid values:
        // 
        // *   inflow: inbound
        // *   outflow: outbound
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
        // The client type that is allowed to log on to cloud desktops. Valid values:
        // 
        // *   windows: the Windows client
        // *   linux: the Alibaba Cloud cloud client
        // *   macos: the macOS client
        // *   ios: the iOS client
        // *   android: the Android client
        // *   html5: the web client
        // 
        // > By default, if you do not set the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.
        @NameInMap("ClientType")
        public String clientType;

        // Specifies whether a specific client type is allowed to log on to the cloud desktop. Valid values:
        // 
        // *   ON: allowed
        // *   OFF: denied
        // 
        // > By default, if you do not set the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.
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

    public static class ModifyPolicyGroupRequestRevokeAccessPolicyRule extends TeaModel {
        // The client IPv4 CIDR block to be deleted. The value is an IPv4 CIDR block.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the client IP address whitelist to be deleted.
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
        // The IPv4 CIDR block of the security group rule.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the security group rule to be deleted.
        @NameInMap("Description")
        public String description;

        // The protocol type of the security group rule to be deleted. Valid values:
        // 
        // *   TCP
        // *   UDP
        // *   ICMP: ICMP (IPv4)
        // *   GRE
        // *   ALL: all protocols
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The authorization policy of the security group rule to be deleted. Valid values:
        // 
        // *   accept: specifies the Allow policy that allows all access requests.
        // *   drop: specifies the Deny policy that denies all access requests. If no messages of access denied are returned, the requests timed out or failed.
        // 
        // Default value: accept.
        @NameInMap("Policy")
        public String policy;

        // The port range of the security group rule to be deleted. The value of the port range is determined by the protocol type specified by the AuthorizeSecurityPolicyRule.IpProtocol parameter.
        // 
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to tcp or udp, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to icmp, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to gre, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to all, set the value to -1/-1.
        // 
        // For more information about the common ports of typical applications, see [Common ports](~~40724~~).
        @NameInMap("PortRange")
        public String portRange;

        // The priority of the security group rule to be deleted. A smaller value indicates a higher priority.\
        // Valid values: 1 to 60.\
        // Default value: 1.
        @NameInMap("Priority")
        public String priority;

        // The direction of the security group rule to be deleted. Valid values:
        // 
        // *   inflow: inbound
        // *   outflow: outbound
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
        // The description of the rule.
        @NameInMap("Description")
        public String description;

        // The device class. This parameter is required when you set the `usbRuleType` parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).
        @NameInMap("DeviceClass")
        public String deviceClass;

        // The subclass of the device. This parameter is required when you set the `usbRuleType` parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        // The ID of the service.
        @NameInMap("ProductId")
        public String productId;

        // The type of USB redirection. Valid values:
        // 
        // *   `1`: USB redirection is allowed.
        // *   `2`: USB redirection is not allowed.
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        // The type of the USB redirection rule. Valid values:
        // 
        // *   `1`: device class
        // *   `2`: device vendor
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        // The ID of the vendor. For more information, see [Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf\_1.pdf).
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
