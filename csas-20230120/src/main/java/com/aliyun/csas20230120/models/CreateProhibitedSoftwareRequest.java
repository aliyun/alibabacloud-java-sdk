// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedSoftwareRequest extends TeaModel {
    /**
     * <p>The description of the disabled software.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of process configurations for the Linux operating system.</p>
     */
    @NameInMap("LinuxProcesses")
    public java.util.List<CreateProhibitedSoftwareRequestLinuxProcesses> linuxProcesses;

    /**
     * <p>The list of process configurations for the macOS operating system.</p>
     */
    @NameInMap("MacOSProcesses")
    public java.util.List<CreateProhibitedSoftwareRequestMacOSProcesses> macOSProcesses;

    /**
     * <p>The name of the disabled software.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The IDs of custom disabled software tags to associate. Duplicate values are not allowed.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    /**
     * <p>The list of process configurations for the Windows operating system.</p>
     */
    @NameInMap("WindowsProcesses")
    public java.util.List<CreateProhibitedSoftwareRequestWindowsProcesses> windowsProcesses;

    public static CreateProhibitedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedSoftwareRequest self = new CreateProhibitedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedSoftwareRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProhibitedSoftwareRequest setLinuxProcesses(java.util.List<CreateProhibitedSoftwareRequestLinuxProcesses> linuxProcesses) {
        this.linuxProcesses = linuxProcesses;
        return this;
    }
    public java.util.List<CreateProhibitedSoftwareRequestLinuxProcesses> getLinuxProcesses() {
        return this.linuxProcesses;
    }

    public CreateProhibitedSoftwareRequest setMacOSProcesses(java.util.List<CreateProhibitedSoftwareRequestMacOSProcesses> macOSProcesses) {
        this.macOSProcesses = macOSProcesses;
        return this;
    }
    public java.util.List<CreateProhibitedSoftwareRequestMacOSProcesses> getMacOSProcesses() {
        return this.macOSProcesses;
    }

    public CreateProhibitedSoftwareRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProhibitedSoftwareRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public CreateProhibitedSoftwareRequest setWindowsProcesses(java.util.List<CreateProhibitedSoftwareRequestWindowsProcesses> windowsProcesses) {
        this.windowsProcesses = windowsProcesses;
        return this;
    }
    public java.util.List<CreateProhibitedSoftwareRequestWindowsProcesses> getWindowsProcesses() {
        return this.windowsProcesses;
    }

    public static class CreateProhibitedSoftwareRequestLinuxProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of BundleId and Process. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.app</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process. If specified, only processes whose command line contains this content are matched. If left empty, the command line is not checked. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If specified, only processes with the same name in this directory are matched. If left empty, processes in any directory are matched. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareRequestLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareRequestLinuxProcesses self = new CreateProhibitedSoftwareRequestLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareRequestLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareRequestLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareRequestLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareRequestLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class CreateProhibitedSoftwareRequestMacOSProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of BundleId and Process. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.app</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process. If specified, only processes whose command line contains this content are matched. If left empty, the command line is not checked. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If specified, only processes with the same name in this directory are matched. If left empty, processes in any directory are matched. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>WeChat</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareRequestMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareRequestMacOSProcesses self = new CreateProhibitedSoftwareRequestMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareRequestMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareRequestMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareRequestMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareRequestMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class CreateProhibitedSoftwareRequestWindowsProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of BundleId and Process. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.update</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command line parameters for starting the process. If specified, only processes whose command line contains this content are matched. If left empty, the command line is not checked. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If specified, only processes with the same name in this directory are matched. If left empty, processes in any directory are matched. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The process name. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static CreateProhibitedSoftwareRequestWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            CreateProhibitedSoftwareRequestWindowsProcesses self = new CreateProhibitedSoftwareRequestWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public CreateProhibitedSoftwareRequestWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public CreateProhibitedSoftwareRequestWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public CreateProhibitedSoftwareRequestWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateProhibitedSoftwareRequestWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

}
