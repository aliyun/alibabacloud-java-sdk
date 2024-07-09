// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGuestApplicationsResponseBody extends TeaModel {
    /**
     * <p>The details of the applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<DescribeGuestApplicationsResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>272CF39E-B5DE-5BE3-A09B-B43F1026****</p>
     */
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
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Google Chrome</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>115.0.5790.110</p>
         */
        @NameInMap("ApplicationVersion")
        public String applicationVersion;

        /**
         * <p>The CPU utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("CpuPercent")
        public Double cpuPercent;

        /**
         * <p>The GPU utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("GpuPercent")
        public Double gpuPercent;

        /**
         * <p>The I/O read and write performance.</p>
         * 
         * <strong>example:</strong>
         * <p>124906.0</p>
         */
        @NameInMap("Iospeed")
        public Double iospeed;

        /**
         * <p>The memory utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("MemPercent")
        public Double memPercent;

        /**
         * <p>The PID.</p>
         * 
         * <strong>example:</strong>
         * <p>1357</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>The path to the process.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\Program Files\\Google\\Chrome\\Application\\ch****.exe</p>
         */
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
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Google Chrome</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>115.0.5790.110</p>
         */
        @NameInMap("ApplicationVersion")
        public String applicationVersion;

        /**
         * <p>The CPU utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("CpuPercent")
        public Double cpuPercent;

        /**
         * <p>The GPU utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("GpuPercent")
        public Double gpuPercent;

        /**
         * <p>The icon URL of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/market/preload/default****.png">https://app-center-icon-prod-shanghai.oss-cn-shanghai.aliyuncs.com/market/preload/default****.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>The I/O read and write performance.</p>
         * 
         * <strong>example:</strong>
         * <p>124906.0</p>
         */
        @NameInMap("IoSpeed")
        public Double ioSpeed;

        /**
         * <p>The memory utilization (%).</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("MemPercent")
        public Double memPercent;

        /**
         * <p>The process ID (PID).</p>
         * 
         * <strong>example:</strong>
         * <p>1357</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>The process information.</p>
         */
        @NameInMap("ProcessData")
        public java.util.List<DescribeGuestApplicationsResponseBodyApplicationsProcessData> processData;

        /**
         * <p>The path to the process.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\Program Files\\Google\\Chrome\\Application\\ch****.exe</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <p>The application status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
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
