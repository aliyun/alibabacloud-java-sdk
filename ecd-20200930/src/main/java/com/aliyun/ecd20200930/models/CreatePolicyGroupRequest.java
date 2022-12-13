// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupRequest extends TeaModel {
    // Specifies whether to enable the anti-screenshot feature.
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    // The client IP address whitelists. After this parameter is configured, only the IP addresses specified in the whitelist of the CIDR block can access the cloud desktop.
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    // The security group rules.
    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    // Specifies whether to enable the webcam redirection feature.
    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    // The logon methods. This parameter is used to specify the clients from which you can access the cloud desktop.
    @NameInMap("ClientType")
    public java.util.List<CreatePolicyGroupRequestClientType> clientType;

    // The permissions on the clipboard.
    @NameInMap("Clipboard")
    public String clipboard;

    // The blacklist or whitelist of domain names. Domain names support the asterisk (\*) wildcard. Separate multiple domain names with commas (,). Valid values:
    // 
    // *   \[black:],example1.com,example2.com: the domain name blacklist. The cloud desktop cannot access the domain names specified in the blacklist.
    // *   \[white:],example1.com,example2.com: the domain name whitelist. The cloud desktop can access only the domain names specified in the whitelist.
    @NameInMap("DomainList")
    public String domainList;

    // Specifies whether to enable the image quality policy for the Graphics desktop. We recommend that you enable this policy if you have high requirements on desktop performance and user experience. For example, you can enable this policy in professional design scenarios.
    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    // The access policy for HTML5 clients.
    // 
    // > We recommend that you use the ClientType-related parameters to control the EDS client type for cloud desktop logon.
    @NameInMap("Html5Access")
    public String html5Access;

    // The file transfer policy for HTML5 clients.
    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    // The permissions on local disk mapping.
    @NameInMap("LocalDrive")
    public String localDrive;

    // The name of the policy.
    @NameInMap("Name")
    public String name;

    // Specifies whether to enable network redirection.
    @NameInMap("NetRedirect")
    public String netRedirect;

    // Specifies whether to allow user preemption.
    // 
    // > To improve user experience and ensure data security, multiple regular users cannot connect to the same cloud desktop at the same time. The default value of this parameter is `off`, and the value cannot be modified.
    @NameInMap("PreemptLogin")
    public String preemptLogin;

    // The names of the users that are allowed to connect to the same cloud desktop at the same time. You can specify up to five usernames.
    // 
    // > To improve user experience and ensure data security, multiple regular users cannot connect to the same cloud desktop at the same time.
    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    // The policy for printer redirection.
    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    // Specifies whether to enable the custom screen recording feature.
    @NameInMap("RecordContent")
    public String recordContent;

    // The time when the custom screen recording expires. Default value: 30 days.
    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    // Specifies whether to enable screen recording.
    @NameInMap("Recording")
    public String recording;

    @NameInMap("RecordingAudio")
    public String recordingAudio;

    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    // The end time for screen recording. The value is in the format of HH:MM:SS. The value takes effect only when you set the Recording parameter to PERIOD.
    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    // The duration in which the screen recording is valid. Unit: days.
    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    // The frame rate of screen recording.
    @NameInMap("RecordingFps")
    public Long recordingFps;

    // The start time for screen recording. The value is in the format of HH:MM:SS. The value takes effect only when you set the Recording parameter to PERIOD.
    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The permissions to control the keyboard and the mouse during remote assistance.
    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    // Specifies whether to enable USB redirection.
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    // The USB redirection rules.
    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<CreatePolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    // The policy for image display quality.
    @NameInMap("VisualQuality")
    public String visualQuality;

    // Specifies whether to enable watermarking.
    @NameInMap("Watermark")
    public String watermark;

    // The transparency of the watermark.
    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    // The type of the watermark. You can specify multiple watermark types at a time. Separate the watermark types with commas (,).
    @NameInMap("WatermarkType")
    public String watermarkType;

    public static CreatePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupRequest self = new CreatePolicyGroupRequest();
        return TeaModel.build(map, self);
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

    public CreatePolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    public CreatePolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static class CreatePolicyGroupRequestAuthorizeAccessPolicyRule extends TeaModel {
        // The IPv4 CIDR block that can be accessed from the client. The value is an IPv4 CIDR block.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the client IP address whitelist.
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
        // The IPv4 CIDR block of the security group rule.
        @NameInMap("CidrIp")
        public String cidrIp;

        // The description of the security group rule.
        @NameInMap("Description")
        public String description;

        // The protocol type of the security group rule.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The authorization policy of the security group rule.
        @NameInMap("Policy")
        public String policy;

        // The port range of the security group rule. The value of the port range is determined by the protocol type specified by the AuthorizeSecurityPolicyRule.IpProtocol parameter.
        // 
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to tcp or udp, the port range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to icmp, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to gre, set the value to -1/-1.
        // *   If the AuthorizeSecurityPolicyRule.IpProtocol parameter is set to all, set the value to -1/-1.
        // 
        // For information about the common ports of typical applications, see [Common ports](~~40724~~).
        @NameInMap("PortRange")
        public String portRange;

        // The priority of the security group rule. A smaller value indicates a higher priority.
        // - Valid values: 1 to 60. 
        // - Default value: 1.
        @NameInMap("Priority")
        public String priority;

        // The direction of the security group rule.
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
        // The client type that is allowed to log on to cloud desktops.
        // 
        // > By default, if you do not set the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.
        @NameInMap("ClientType")
        public String clientType;

        // Specifies whether a specific client type is allowed to log on to the cloud desktop.
        // 
        // > By default, if you do not set the ClientType-related parameters, all types of clients are allowed to log on to cloud desktops.
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

    public static class CreatePolicyGroupRequestUsbSupplyRedirectRule extends TeaModel {
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

        // The type of USB redirection.
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        // The type of the USB redirection rule.
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        // The ID of the vendor. For more information, see [Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf\_1.pdf).
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
