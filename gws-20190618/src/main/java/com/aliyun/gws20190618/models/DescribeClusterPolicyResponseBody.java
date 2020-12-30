// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterPolicyResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UdpPort")
    public String udpPort;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("TaskFinished")
    public Boolean taskFinished;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("DomainList")
    public String domainList;

    @NameInMap("Watermark")
    public String watermark;

    public static DescribeClusterPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterPolicyResponseBody self = new DescribeClusterPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterPolicyResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterPolicyResponseBody setUdpPort(String udpPort) {
        this.udpPort = udpPort;
        return this;
    }
    public String getUdpPort() {
        return this.udpPort;
    }

    public DescribeClusterPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterPolicyResponseBody setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public DescribeClusterPolicyResponseBody setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public DescribeClusterPolicyResponseBody setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public DescribeClusterPolicyResponseBody setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public DescribeClusterPolicyResponseBody setDomainList(String domainList) {
        this.domainList = domainList;
        return this;
    }
    public String getDomainList() {
        return this.domainList;
    }

    public DescribeClusterPolicyResponseBody setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

}
