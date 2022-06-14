// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreatePolicyGroupRequest extends TeaModel {
    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<CreatePolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    @NameInMap("ClientType")
    public java.util.List<CreatePolicyGroupRequestClientType> clientType;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    @NameInMap("Html5Access")
    public String html5Access;

    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreemptLogin")
    public String preemptLogin;

    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    @NameInMap("Recording")
    public String recording;

    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    @NameInMap("RecordingFps")
    public Long recordingFps;

    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<CreatePolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    @NameInMap("VisualQuality")
    public String visualQuality;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static CreatePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyGroupRequest self = new CreatePolicyGroupRequest();
        return TeaModel.build(map, self);
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

    public CreatePolicyGroupRequest setRecording(String recording) {
        this.recording = recording;
        return this;
    }
    public String getRecording() {
        return this.recording;
    }

    public CreatePolicyGroupRequest setRecordingEndTime(String recordingEndTime) {
        this.recordingEndTime = recordingEndTime;
        return this;
    }
    public String getRecordingEndTime() {
        return this.recordingEndTime;
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
        @NameInMap("CidrIp")
        public String cidrIp;

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
        @NameInMap("CidrIp")
        public String cidrIp;

        @NameInMap("Description")
        public String description;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public String priority;

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
        @NameInMap("ClientType")
        public String clientType;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceClass")
        public String deviceClass;

        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        @NameInMap("UsbRuleType")
        public Long usbRuleType;

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
