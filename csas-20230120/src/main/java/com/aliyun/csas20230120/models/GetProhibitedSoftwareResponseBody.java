// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedSoftwareResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>019F6DE3-3079-52DE-ABD1-39FB76B74FC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The prohibited software details.</p>
     */
    @NameInMap("Software")
    public GetProhibitedSoftwareResponseBodySoftware software;

    public static GetProhibitedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedSoftwareResponseBody self = new GetProhibitedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProhibitedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProhibitedSoftwareResponseBody setSoftware(GetProhibitedSoftwareResponseBodySoftware software) {
        this.software = software;
        return this;
    }
    public GetProhibitedSoftwareResponseBodySoftware getSoftware() {
        return this.software;
    }

    public static class GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xunlei.Thunder</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments for starting the process.</p>
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>thuner.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses self = new GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xunlei.Thunder</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments for starting the process.</p>
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>thuner.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses self = new GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses extends TeaModel {
        /**
         * <p>The application bundle identifier (Bundle ID). This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xunlei.Thunder</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments for starting the process.</p>
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>thuner.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses self = new GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class GetProhibitedSoftwareResponseBodySoftware extends TeaModel {
        /**
         * <p>The creation time of the prohibited software, in the yyyy-MM-dd HH:mm:ss format. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-05 10:20:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>P2P download tool</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the prohibited software is a system built-in prohibited software. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom prohibited software under the current Alibaba Cloud account.</li>
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
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses;

        /**
         * <p>The list of process configurations for the macOS operating system.</p>
         */
        @NameInMap("MacOSProcesses")
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses;

        /**
         * <p>The name of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of the software prohibition policies that directly reference the prohibited software.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The prohibited software ID.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-3e6a1f9c4b28****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The IDs of the prohibited software tags associated with the prohibited software.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The list of process configurations for the Windows operating system.</p>
         */
        @NameInMap("WindowsProcesses")
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses;

        public static GetProhibitedSoftwareResponseBodySoftware build(java.util.Map<String, ?> map) throws Exception {
            GetProhibitedSoftwareResponseBodySoftware self = new GetProhibitedSoftwareResponseBodySoftware();
            return TeaModel.build(map, self);
        }

        public GetProhibitedSoftwareResponseBodySoftware setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProhibitedSoftwareResponseBodySoftware setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProhibitedSoftwareResponseBodySoftware setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetProhibitedSoftwareResponseBodySoftware setLinuxProcesses(java.util.List<GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses) {
            this.linuxProcesses = linuxProcesses;
            return this;
        }
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareLinuxProcesses> getLinuxProcesses() {
            return this.linuxProcesses;
        }

        public GetProhibitedSoftwareResponseBodySoftware setMacOSProcesses(java.util.List<GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses) {
            this.macOSProcesses = macOSProcesses;
            return this;
        }
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareMacOSProcesses> getMacOSProcesses() {
            return this.macOSProcesses;
        }

        public GetProhibitedSoftwareResponseBodySoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProhibitedSoftwareResponseBodySoftware setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetProhibitedSoftwareResponseBodySoftware setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public GetProhibitedSoftwareResponseBodySoftware setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public GetProhibitedSoftwareResponseBodySoftware setWindowsProcesses(java.util.List<GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses) {
            this.windowsProcesses = windowsProcesses;
            return this;
        }
        public java.util.List<GetProhibitedSoftwareResponseBodySoftwareWindowsProcesses> getWindowsProcesses() {
            return this.windowsProcesses;
        }

    }

}
