// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClusterPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("Watermark")
    public String watermark;

    public static DescribeGWSClusterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClusterPolicyResponseBody self = new DescribeGWSClusterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClusterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGWSClusterPolicyResponseBody setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public DescribeGWSClusterPolicyResponseBody setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public DescribeGWSClusterPolicyResponseBody setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public DescribeGWSClusterPolicyResponseBody setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

}
