// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGuestApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<DescribeGuestApplicationsResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGuestApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestApplicationsResponseBody self = new DescribeGuestApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGuestApplicationsResponseBody setApplications(java.util.List<DescribeGuestApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<DescribeGuestApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public DescribeGuestApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGuestApplicationsResponseBodyApplicationsProcessData extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationVersion")
        public String applicationVersion;

        @NameInMap("CpuPercent")
        public Double cpuPercent;

        @NameInMap("GpuPercent")
        public Double gpuPercent;

        @NameInMap("Iospeed")
        public Double iospeed;

        @NameInMap("MemPercent")
        public Double memPercent;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("ProcessPath")
        public String processPath;

        public static DescribeGuestApplicationsResponseBodyApplicationsProcessData build(java.util.Map<String, ?> map) throws Exception {
            DescribeGuestApplicationsResponseBodyApplicationsProcessData self = new DescribeGuestApplicationsResponseBodyApplicationsProcessData();
            return TeaModel.build(map, self);
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setCpuPercent(Double cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }
        public Double getCpuPercent() {
            return this.cpuPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setGpuPercent(Double gpuPercent) {
            this.gpuPercent = gpuPercent;
            return this;
        }
        public Double getGpuPercent() {
            return this.gpuPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setIospeed(Double iospeed) {
            this.iospeed = iospeed;
            return this;
        }
        public Double getIospeed() {
            return this.iospeed;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setMemPercent(Double memPercent) {
            this.memPercent = memPercent;
            return this;
        }
        public Double getMemPercent() {
            return this.memPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public DescribeGuestApplicationsResponseBodyApplicationsProcessData setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

    }

    public static class DescribeGuestApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationVersion")
        public String applicationVersion;

        @NameInMap("CpuPercent")
        public Double cpuPercent;

        @NameInMap("GpuPercent")
        public Double gpuPercent;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("IoSpeed")
        public Double ioSpeed;

        @NameInMap("MemPercent")
        public Double memPercent;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("ProcessData")
        public java.util.List<DescribeGuestApplicationsResponseBodyApplicationsProcessData> processData;

        @NameInMap("ProcessPath")
        public String processPath;

        @NameInMap("Status")
        public String status;

        public static DescribeGuestApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeGuestApplicationsResponseBodyApplications self = new DescribeGuestApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public DescribeGuestApplicationsResponseBodyApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeGuestApplicationsResponseBodyApplications setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        public DescribeGuestApplicationsResponseBodyApplications setCpuPercent(Double cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }
        public Double getCpuPercent() {
            return this.cpuPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplications setGpuPercent(Double gpuPercent) {
            this.gpuPercent = gpuPercent;
            return this;
        }
        public Double getGpuPercent() {
            return this.gpuPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplications setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public DescribeGuestApplicationsResponseBodyApplications setIoSpeed(Double ioSpeed) {
            this.ioSpeed = ioSpeed;
            return this;
        }
        public Double getIoSpeed() {
            return this.ioSpeed;
        }

        public DescribeGuestApplicationsResponseBodyApplications setMemPercent(Double memPercent) {
            this.memPercent = memPercent;
            return this;
        }
        public Double getMemPercent() {
            return this.memPercent;
        }

        public DescribeGuestApplicationsResponseBodyApplications setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public DescribeGuestApplicationsResponseBodyApplications setProcessData(java.util.List<DescribeGuestApplicationsResponseBodyApplicationsProcessData> processData) {
            this.processData = processData;
            return this;
        }
        public java.util.List<DescribeGuestApplicationsResponseBodyApplicationsProcessData> getProcessData() {
            return this.processData;
        }

        public DescribeGuestApplicationsResponseBodyApplications setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public DescribeGuestApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
