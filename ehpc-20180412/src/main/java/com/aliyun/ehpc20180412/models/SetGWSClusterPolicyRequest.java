// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSClusterPolicyRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("UdpPort")
    public String udpPort;

    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    public static SetGWSClusterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGWSClusterPolicyRequest self = new SetGWSClusterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetGWSClusterPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetGWSClusterPolicyRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public SetGWSClusterPolicyRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public SetGWSClusterPolicyRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public SetGWSClusterPolicyRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public SetGWSClusterPolicyRequest setUdpPort(String udpPort) {
        this.udpPort = udpPort;
        return this;
    }
    public String getUdpPort() {
        return this.udpPort;
    }

    public SetGWSClusterPolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

}
