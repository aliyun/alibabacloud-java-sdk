// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedSoftwareResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C7F49DCC-8EFE-59BE-8947-0529CC458C59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of prohibited software.</p>
     */
    @NameInMap("Software")
    public java.util.List<ListProhibitedSoftwareResponseBodySoftware> software;

    /**
     * <p>The total number of prohibited software entries.</p>
     * 
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListProhibitedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedSoftwareResponseBody self = new ListProhibitedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProhibitedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProhibitedSoftwareResponseBody setSoftware(java.util.List<ListProhibitedSoftwareResponseBodySoftware> software) {
        this.software = software;
        return this;
    }
    public java.util.List<ListProhibitedSoftwareResponseBodySoftware> getSoftware() {
        return this.software;
    }

    public ListProhibitedSoftwareResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.app</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line parameters for starting the process.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located.</p>
         * 
         * <strong>example:</strong>
         * <p>/User/sase/Applications</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>thunder</p>
         */
        @NameInMap("Process")
        public String process;

        public static ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses self = new ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xunlei.Thunder</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line parameters for starting the process.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located.</p>
         * 
         * <strong>example:</strong>
         * <p>~/Applications</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses self = new ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xunlei.Thunder</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line parameters for starting the process.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Program Files\Thunder Network</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>SASE.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses self = new ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class ListProhibitedSoftwareResponseBodySoftware extends TeaModel {
        /**
         * <p>The time when the prohibited software was created, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-19 10:24:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>P2P download software</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The collection of dynamic policy IDs that reference the prohibited software as a disposal action.</p>
         */
        @NameInMap("DynamicPolicyIds")
        public java.util.List<String> dynamicPolicyIds;

        /**
         * <p>Indicates whether the software is a system built-in prohibited software. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The list of process configurations for the Linux operating system.</p>
         */
        @NameInMap("LinuxProcesses")
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses;

        /**
         * <p>The list of process configurations for the macOS operating system.</p>
         */
        @NameInMap("MacOSProcesses")
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses;

        /**
         * <p>The name of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The collection of software prohibition policy IDs that directly reference the prohibited software.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-238eee6903e8****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The collection of prohibited software tag IDs associated with the prohibited software.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The list of process configurations for the Windows operating system.</p>
         */
        @NameInMap("WindowsProcesses")
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses;

        public static ListProhibitedSoftwareResponseBodySoftware build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareResponseBodySoftware self = new ListProhibitedSoftwareResponseBodySoftware();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareResponseBodySoftware setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProhibitedSoftwareResponseBodySoftware setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProhibitedSoftwareResponseBodySoftware setDynamicPolicyIds(java.util.List<String> dynamicPolicyIds) {
            this.dynamicPolicyIds = dynamicPolicyIds;
            return this;
        }
        public java.util.List<String> getDynamicPolicyIds() {
            return this.dynamicPolicyIds;
        }

        public ListProhibitedSoftwareResponseBodySoftware setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedSoftwareResponseBodySoftware setLinuxProcesses(java.util.List<ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses) {
            this.linuxProcesses = linuxProcesses;
            return this;
        }
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareLinuxProcesses> getLinuxProcesses() {
            return this.linuxProcesses;
        }

        public ListProhibitedSoftwareResponseBodySoftware setMacOSProcesses(java.util.List<ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses) {
            this.macOSProcesses = macOSProcesses;
            return this;
        }
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareMacOSProcesses> getMacOSProcesses() {
            return this.macOSProcesses;
        }

        public ListProhibitedSoftwareResponseBodySoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProhibitedSoftwareResponseBodySoftware setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListProhibitedSoftwareResponseBodySoftware setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListProhibitedSoftwareResponseBodySoftware setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public ListProhibitedSoftwareResponseBodySoftware setWindowsProcesses(java.util.List<ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses) {
            this.windowsProcesses = windowsProcesses;
            return this;
        }
        public java.util.List<ListProhibitedSoftwareResponseBodySoftwareWindowsProcesses> getWindowsProcesses() {
            return this.windowsProcesses;
        }

    }

}
