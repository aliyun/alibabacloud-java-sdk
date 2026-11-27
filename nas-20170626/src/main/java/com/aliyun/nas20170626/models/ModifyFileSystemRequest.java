// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The automatic expansion configuration.</p>
     */
    @NameInMap("AutoUpgradeConfig")
    public ModifyFileSystemRequestAutoUpgradeConfig autoUpgradeConfig;

    /**
     * <p>The description of the file system.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It can contain digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAS-test-1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li><p>General-purpose NAS: <code>31a8e4****</code>.</p>
     * </li>
     * <li><p>Extreme NAS: must start with <code>extreme-</code>, such as <code>extreme-0015****</code>.</p>
     * </li>
     * <li><p>CPFS: must start with <code>cpfs-</code>, such as <code>cpfs-125487****</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The options.</p>
     */
    @NameInMap("Options")
    public ModifyFileSystemRequestOptions options;

    public static ModifyFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemRequest self = new ModifyFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemRequest setAutoUpgradeConfig(ModifyFileSystemRequestAutoUpgradeConfig autoUpgradeConfig) {
        this.autoUpgradeConfig = autoUpgradeConfig;
        return this;
    }
    public ModifyFileSystemRequestAutoUpgradeConfig getAutoUpgradeConfig() {
        return this.autoUpgradeConfig;
    }

    public ModifyFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyFileSystemRequest setOptions(ModifyFileSystemRequestOptions options) {
        this.options = options;
        return this;
    }
    public ModifyFileSystemRequestOptions getOptions() {
        return this.options;
    }

    public static class ModifyFileSystemRequestAutoUpgradeConfig extends TeaModel {
        /**
         * <p>The capacity usage threshold. Valid values: 1 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("capacityUsedRatio")
        public Integer capacityUsedRatio;

        /**
         * <p>Specifies whether to enable automatic expansion.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The expansion step. The step must be a multiple of 100 GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("step")
        public Integer step;

        /**
         * <p>The duration. The minimum duration is 5 minutes, and the maximum duration is 24 hours. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("time")
        public Integer time;

        public static ModifyFileSystemRequestAutoUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyFileSystemRequestAutoUpgradeConfig self = new ModifyFileSystemRequestAutoUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyFileSystemRequestAutoUpgradeConfig setCapacityUsedRatio(Integer capacityUsedRatio) {
            this.capacityUsedRatio = capacityUsedRatio;
            return this;
        }
        public Integer getCapacityUsedRatio() {
            return this.capacityUsedRatio;
        }

        public ModifyFileSystemRequestAutoUpgradeConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyFileSystemRequestAutoUpgradeConfig setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public ModifyFileSystemRequestAutoUpgradeConfig setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

    }

    public static class ModifyFileSystemRequestOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable the SMB ABE access control feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableABE")
        public Boolean enableABE;

        /**
         * <p>Specifies whether to enable the OpLock feature.
         * Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.<blockquote>
         * <p>This parameter is supported only for file systems of the SMB Protocol Type.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableOplock")
        public Boolean enableOplock;

        /**
         * <p>Specifies whether to enable AP-only access for VSC mount targets.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VscAccessPointAccessOnly")
        public Boolean vscAccessPointAccessOnly;

        public static ModifyFileSystemRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyFileSystemRequestOptions self = new ModifyFileSystemRequestOptions();
            return TeaModel.build(map, self);
        }

        public ModifyFileSystemRequestOptions setEnableABE(Boolean enableABE) {
            this.enableABE = enableABE;
            return this;
        }
        public Boolean getEnableABE() {
            return this.enableABE;
        }

        public ModifyFileSystemRequestOptions setEnableOplock(Boolean enableOplock) {
            this.enableOplock = enableOplock;
            return this;
        }
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

        public ModifyFileSystemRequestOptions setVscAccessPointAccessOnly(Boolean vscAccessPointAccessOnly) {
            this.vscAccessPointAccessOnly = vscAccessPointAccessOnly;
            return this;
        }
        public Boolean getVscAccessPointAccessOnly() {
            return this.vscAccessPointAccessOnly;
        }

    }

}
