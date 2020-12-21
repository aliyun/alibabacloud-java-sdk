// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterPolicyRequest extends TeaModel {
    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("UsbRedirect")
    @Validation(required = true)
    public String usbRedirect;

    @NameInMap("Watermark")
    @Validation(required = true)
    public String watermark;

    @NameInMap("LocalDrive")
    @Validation(required = true)
    public String localDrive;

    @NameInMap("Clipboard")
    @Validation(required = true)
    public String clipboard;

    @NameInMap("UdpPort")
    public String udpPort;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static SetClusterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClusterPolicyRequest self = new SetClusterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetClusterPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetClusterPolicyRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public SetClusterPolicyRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public SetClusterPolicyRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public SetClusterPolicyRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public SetClusterPolicyRequest setUdpPort(String udpPort) {
        this.udpPort = udpPort;
        return this;
    }
    public String getUdpPort() {
        return this.udpPort;
    }

    public SetClusterPolicyRequest setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public SetClusterPolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
