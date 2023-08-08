// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    @NameInMap("AppContentProtection")
    public String appContentProtection;

    @NameInMap("AuthorizeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeAccessPolicyRule> authorizeAccessPolicyRule;

    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @NameInMap("CameraRedirect")
    public String cameraRedirect;

    @NameInMap("ClientType")
    public java.util.List<ModifyPolicyGroupRequestClientType> clientType;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("DomainResolveRule")
    public java.util.List<ModifyPolicyGroupRequestDomainResolveRule> domainResolveRule;

    @NameInMap("DomainResolveRuleType")
    public String domainResolveRuleType;

    @NameInMap("EndUserApplyAdminCoordinate")
    public String endUserApplyAdminCoordinate;

    @NameInMap("EndUserGroupCoordinate")
    public String endUserGroupCoordinate;

    @NameInMap("GpuAcceleration")
    public String gpuAcceleration;

    @NameInMap("Html5Access")
    public String html5Access;

    @NameInMap("Html5FileTransfer")
    public String html5FileTransfer;

    @NameInMap("InternetCommunicationProtocol")
    public String internetCommunicationProtocol;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetRedirect")
    public String netRedirect;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PreemptLogin")
    public String preemptLogin;

    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    @NameInMap("PrinterRedirection")
    public String printerRedirection;

    @NameInMap("RecordContent")
    public String recordContent;

    @NameInMap("RecordContentExpires")
    public Long recordContentExpires;

    @NameInMap("Recording")
    public String recording;

    @NameInMap("RecordingAudio")
    public String recordingAudio;

    @NameInMap("RecordingDuration")
    public Integer recordingDuration;

    @NameInMap("RecordingEndTime")
    public String recordingEndTime;

    @NameInMap("RecordingExpires")
    public Long recordingExpires;

    @NameInMap("RecordingFps")
    public Long recordingFps;

    @NameInMap("RecordingStartTime")
    public String recordingStartTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemoteCoordinate")
    public String remoteCoordinate;

    @NameInMap("RevokeAccessPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeAccessPolicyRule> revokeAccessPolicyRule;

    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeValue")
    public java.util.List<String> scopeValue;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("UsbSupplyRedirectRule")
    public java.util.List<ModifyPolicyGroupRequestUsbSupplyRedirectRule> usbSupplyRedirectRule;

    @NameInMap("VideoRedirect")
    public String videoRedirect;

    @NameInMap("VisualQuality")
    public String visualQuality;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("WatermarkColor")
    public Integer watermarkColor;

    @NameInMap("WatermarkDegree")
    public Double watermarkDegree;

    @NameInMap("WatermarkFontSize")
    public Integer watermarkFontSize;

    @NameInMap("WatermarkFontStyle")
    public String watermarkFontStyle;

    @NameInMap("WatermarkRowAmount")
    public Integer watermarkRowAmount;

    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    @NameInMap("WatermarkTransparencyValue")
    public Integer watermarkTransparencyValue;

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
        @NameInMap("CidrIp")
        public String cidrIp;

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
        @NameInMap("ClientType")
        public String clientType;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

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
        @NameInMap("CidrIp")
        public String cidrIp;

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
