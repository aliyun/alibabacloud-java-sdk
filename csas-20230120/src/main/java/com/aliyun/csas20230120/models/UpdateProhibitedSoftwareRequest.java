// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateProhibitedSoftwareRequest extends TeaModel {
    /**
     * <p>The description of the prohibited software.</p>
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
    public java.util.List<UpdateProhibitedSoftwareRequestLinuxProcesses> linuxProcesses;

    /**
     * <p>The list of process configurations for the macOS operating system.</p>
     */
    @NameInMap("MacOSProcesses")
    public java.util.List<UpdateProhibitedSoftwareRequestMacOSProcesses> macOSProcesses;

    /**
     * <p>The name of the prohibited software.</p>
     * 
     * <strong>example:</strong>
     * <p>Edge</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the custom prohibited software to update. You can update only custom prohibited software within the current Alibaba Cloud account. Built-in prohibited software cannot be updated. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: List prohibited software.</li>
     * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Create custom prohibited software.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>swb-a43c9cbf88df****</p>
     */
    @NameInMap("SoftwareId")
    public String softwareId;

    /**
     * <p>The IDs of the custom prohibited software tags to associate. Duplicate IDs are not allowed.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    /**
     * <p>The list of process configurations for the Windows operating system.</p>
     */
    @NameInMap("WindowsProcesses")
    public java.util.List<UpdateProhibitedSoftwareRequestWindowsProcesses> windowsProcesses;

    public static UpdateProhibitedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProhibitedSoftwareRequest self = new UpdateProhibitedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProhibitedSoftwareRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProhibitedSoftwareRequest setLinuxProcesses(java.util.List<UpdateProhibitedSoftwareRequestLinuxProcesses> linuxProcesses) {
        this.linuxProcesses = linuxProcesses;
        return this;
    }
    public java.util.List<UpdateProhibitedSoftwareRequestLinuxProcesses> getLinuxProcesses() {
        return this.linuxProcesses;
    }

    public UpdateProhibitedSoftwareRequest setMacOSProcesses(java.util.List<UpdateProhibitedSoftwareRequestMacOSProcesses> macOSProcesses) {
        this.macOSProcesses = macOSProcesses;
        return this;
    }
    public java.util.List<UpdateProhibitedSoftwareRequestMacOSProcesses> getMacOSProcesses() {
        return this.macOSProcesses;
    }

    public UpdateProhibitedSoftwareRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProhibitedSoftwareRequest setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
        return this;
    }
    public String getSoftwareId() {
        return this.softwareId;
    }

    public UpdateProhibitedSoftwareRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public UpdateProhibitedSoftwareRequest setWindowsProcesses(java.util.List<UpdateProhibitedSoftwareRequestWindowsProcesses> windowsProcesses) {
        this.windowsProcesses = windowsProcesses;
        return this;
    }
    public java.util.List<UpdateProhibitedSoftwareRequestWindowsProcesses> getWindowsProcesses() {
        return this.windowsProcesses;
    }

    public static class UpdateProhibitedSoftwareRequestLinuxProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of the BundleId and Process parameters. The bundle ID can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.security.sase</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments used to start the process. If you specify this parameter, only processes whose command lines contain this content are matched. If you leave this parameter empty, the command line is not verified. The arguments can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If you specify this parameter, only processes with the same name in this directory are matched. If you leave this parameter empty, processes in any directory are matched. The directory can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The name of the process. The name can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Everything.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareRequestLinuxProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareRequestLinuxProcesses self = new UpdateProhibitedSoftwareRequestLinuxProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareRequestLinuxProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareRequestLinuxProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareRequestLinuxProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareRequestLinuxProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class UpdateProhibitedSoftwareRequestMacOSProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of the BundleId and Process parameters. The bundle ID can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>com.autotest.update</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments used to start the process. If you specify this parameter, only processes whose command lines contain this content are matched. If you leave this parameter empty, the command line is not verified. The arguments can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If you specify this parameter, only processes with the same name in this directory are matched. If you leave this parameter empty, processes in any directory are matched. The directory can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The name of the process. The name can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Everything.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareRequestMacOSProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareRequestMacOSProcesses self = new UpdateProhibitedSoftwareRequestMacOSProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareRequestMacOSProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareRequestMacOSProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareRequestMacOSProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareRequestMacOSProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

    public static class UpdateProhibitedSoftwareRequestWindowsProcesses extends TeaModel {
        /**
         * <p>The bundle ID of the application. This parameter is required only for macOS processes. You must specify at least one of the BundleId and Process parameters. The bundle ID can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>cn.apifox.app</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The command-line arguments used to start the process. If you specify this parameter, only processes whose command lines contain this content are matched. If you leave this parameter empty, the command line is not verified. The arguments can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>--start-minimized</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The directory where the process is located. If you specify this parameter, only processes with the same name in this directory are matched. If you leave this parameter empty, processes in any directory are matched. The directory can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\\autotest</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The name of the process. The name can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Everything.exe</p>
         */
        @NameInMap("Process")
        public String process;

        public static UpdateProhibitedSoftwareRequestWindowsProcesses build(java.util.Map<String, ?> map) throws Exception {
            UpdateProhibitedSoftwareRequestWindowsProcesses self = new UpdateProhibitedSoftwareRequestWindowsProcesses();
            return TeaModel.build(map, self);
        }

        public UpdateProhibitedSoftwareRequestWindowsProcesses setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public UpdateProhibitedSoftwareRequestWindowsProcesses setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public UpdateProhibitedSoftwareRequestWindowsProcesses setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdateProhibitedSoftwareRequestWindowsProcesses setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

    }

}
