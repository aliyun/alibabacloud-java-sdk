// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedSoftwareResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2123E64A-FB25-561F-9988-B8781E430694</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the prohibited software.</p>
     */
    @NameInMap("Software")
    public UpdateProhibitedSoftwareResponseBodySoftware software;

    public static UpdateProhibitedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedSoftwareResponseBody self = new UpdateProhibitedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProhibitedSoftwareResponseBody setSoftware(UpdateProhibitedSoftwareResponseBodySoftware software) {
        this.software = software;
        return this;
    }
    public UpdateProhibitedSoftwareResponseBodySoftware getSoftware() {
        return this.software;
    }

    public static class UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.security.sase</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process.</p>
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
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>kismain.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses self = new UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.app</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process.</p>
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
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>QQPCTray.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses self = new UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.security.sase</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process.</p>
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
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>QQPCTray.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses self = new UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class UpdateProhibitedSoftwareResponseBodySoftware extends TeaModel {
        /**
         * <p>The time when the prohibited software was created, in the yyyy-MM-dd HH:mm:ss format. The time is displayed in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-17 09:49:03</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>kxi3</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of process configurations for the Linux operating system.</p>
         */
        @NameInMap("LinuxProcesses")
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses;

        /**
         * <p>The list of process configurations for the macOS operating system.</p>
         */
        @NameInMap("MacOSProcesses")
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses;

        /**
         * <p>The name of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>xshell</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of the software prohibition policies that directly reference this prohibited software.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The ID of the prohibited software.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-c64076fa7afd****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The IDs of the prohibited software tags associated with this prohibited software.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The list of process configurations for the Windows operating system.</p>
         */
        @NameInMap("WindowsProcesses")
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses;

        public static UpdateProhibitedSoftwareResponseBodySoftware build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareResponseBodySoftware self = new UpdateProhibitedSoftwareResponseBodySoftware();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setLinuxProcesses(java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses) {
            this.linuxProcesses = linuxProcesses;
            return this;
        }
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> getLinuxProcesses() {
            return this.linuxProcesses;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setMacOSProcesses(java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses) {
            this.macOSProcesses = macOSProcesses;
            return this;
        }
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> getMacOSProcesses() {
            return this.macOSProcesses;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public UpdateProhibitedSoftwareResponseBodySoftware setWindowsProcesses(java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses) {
            this.windowsProcesses = windowsProcesses;
            return this;
        }
        public java.util.List<UpdateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> getWindowsProcesses() {
            return this.windowsProcesses;
        }

    }

}
