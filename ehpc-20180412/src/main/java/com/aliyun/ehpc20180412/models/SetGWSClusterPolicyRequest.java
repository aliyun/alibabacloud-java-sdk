// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSClusterPolicyRequest extends TeaModel {
    /**
     * <p>Specifies whether to support the asynchronous calls.</p>
     * <br>
     * <p>*   false: not supported. The result is returned after the request is completed.</p>
     * <p>*   true: supported. The result is immediately returned while the request is being processed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AsyncMode")
    public Boolean asyncMode;

    /**
     * <p>The permissions on the clipboard. Valid values:</p>
     * <br>
     * <p>*   read: read-only. You can copy data from your local computer to the cloud desktop, but cannot copy data from the cloud desktop to your local computer.</p>
     * <p>*   readwrite: read and write. You can copy data between your local computer and the cloud desktop.</p>
     * <p>*   off: disabled. You cannot copy data between your local computer and the cloud desktop.</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("Clipboard")
    public String clipboard;

    /**
     * <p>The ID of the visualization service.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The permissions on local disk mapping. Valid values:</p>
     * <br>
     * <p>*   read: read-only. The disks on your local computer are mapped to the cloud desktop. You can only read (copy) files on the local computer, but cannot modify the files.</p>
     * <p>*   readwrite: read and write. The disks on your local computer are mapped to the cloud desktop. You can read (copy) and modify files on your local computer.</p>
     * <p>*   off: disabled. The disks on your local computer are not mapped to the cloud desktop.</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("LocalDrive")
    public String localDrive;

    /**
     * <p>The UDP port. Valid values:</p>
     * <br>
     * <p>*   on</p>
     * <p>*   off</p>
     * <br>
     * <p>Default value: on.</p>
     */
    @NameInMap("UdpPort")
    public String udpPort;

    /**
     * <p>The USB redirection feature. Valid values:</p>
     * <br>
     * <p>*   on</p>
     * <p>*   off</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("UsbRedirect")
    public String usbRedirect;

    /**
     * <p>The watermarking feature. Valid values:</p>
     * <br>
     * <p>*   on</p>
     * <p>*   off</p>
     * <br>
     * <p>Default value: off.</p>
     */
    @NameInMap("Watermark")
    public String watermark;

    public static SetGWSClusterPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGWSClusterPolicyRequest self = new SetGWSClusterPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetGWSClusterPolicyRequest setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
        return this;
    }
    public Boolean getAsyncMode() {
        return this.asyncMode;
    }

    public SetGWSClusterPolicyRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public SetGWSClusterPolicyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetGWSClusterPolicyRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public SetGWSClusterPolicyRequest setUdpPort(String udpPort) {
        this.udpPort = udpPort;
        return this;
    }
    public String getUdpPort() {
        return this.udpPort;
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

}
