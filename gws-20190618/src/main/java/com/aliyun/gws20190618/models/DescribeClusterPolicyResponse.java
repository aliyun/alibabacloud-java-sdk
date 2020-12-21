// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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
    @Validation(required = true)
    public String udpPort;

    @NameInMap("DomainList")
    @Validation(required = true)
    public String domainList;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TaskFinished")
    @Validation(required = true)
    public Boolean taskFinished;

    public static DescribeClusterPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPolicyResponse self = new DescribeClusterPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterPolicyResponse setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public DescribeClusterPolicyResponse setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public DescribeClusterPolicyResponse setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public DescribeClusterPolicyResponse setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public DescribeClusterPolicyResponse setUdpPort(String udpPort) {
        this.udpPort = udpPort;
        return this;
    }
    public String getUdpPort() {
        return this.udpPort;
    }

    public DescribeClusterPolicyResponse setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public DescribeClusterPolicyResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterPolicyResponse setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

}
