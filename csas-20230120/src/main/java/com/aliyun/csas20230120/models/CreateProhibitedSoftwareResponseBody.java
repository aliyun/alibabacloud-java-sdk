// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedSoftwareResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B9AC7B08-80F5-5EDD-8E6B-033F2FE5D4E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the disabled software.</p>
     */
    @NameInMap("Software")
    public CreateProhibitedSoftwareResponseBodySoftware software;

    public static CreateProhibitedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedSoftwareResponseBody self = new CreateProhibitedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProhibitedSoftwareResponseBody setSoftware(CreateProhibitedSoftwareResponseBodySoftware software) {
        this.software = software;
        return this;
    }
    public CreateProhibitedSoftwareResponseBodySoftware getSoftware() {
        return this.software;
    }

    public static class CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses extends TeaModel {
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses self = new CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses extends TeaModel {
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_update.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses self = new CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses extends TeaModel {
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
         * <p>C:\Program Files\Thunder Network\Thunder</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>anaconda3.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses self = new CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class CreateProhibitedSoftwareResponseBodySoftware extends TeaModel {
        /**
         * <p>The creation time of the disabled software, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-05 10:20:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the disabled software.</p>
         * 
         * <strong>example:</strong>
         * <p>Endpoint group targeting github</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of process configurations for the Linux operating system.</p>
         */
        @NameInMap("LinuxProcesses")
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses;

        /**
         * <p>The list of process configurations for the macOS operating system.</p>
         */
        @NameInMap("MacOSProcesses")
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses;

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>shell</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the disabled software.</p>
         * 
         * <strong>example:</strong>
         * <p>swb-83995ff2ae38****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The IDs of disabled software tags associated with this disabled software.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        /**
         * <p>The list of process configurations for the Windows operating system.</p>
         */
        @NameInMap("WindowsProcesses")
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses;

        public static CreateProhibitedSoftwareResponseBodySoftware build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareResponseBodySoftware self = new CreateProhibitedSoftwareResponseBodySoftware();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareResponseBodySoftware setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setLinuxProcesses(java.util.List<CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> linuxProcesses) {
            this.linuxProcesses = linuxProcesses;
            return this;
        }
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareLinuxProcesses> getLinuxProcesses() {
            return this.linuxProcesses;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setMacOSProcesses(java.util.List<CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> macOSProcesses) {
            this.macOSProcesses = macOSProcesses;
            return this;
        }
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareMacOSProcesses> getMacOSProcesses() {
            return this.macOSProcesses;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        public CreateProhibitedSoftwareResponseBodySoftware setWindowsProcesses(java.util.List<CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> windowsProcesses) {
            this.windowsProcesses = windowsProcesses;
            return this;
        }
        public java.util.List<CreateProhibitedSoftwareResponseBodySoftwareWindowsProcesses> getWindowsProcesses() {
            return this.windowsProcesses;
        }

    }

}
