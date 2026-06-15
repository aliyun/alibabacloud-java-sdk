// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the file system.</p>
     * <p>Limits:</p>
     * <ul>
     * <li><p>The description must be 2 to 128 characters.</p>
     * </li>
     * <li><p>It must start with an uppercase or lowercase letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * </li>
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
     * <li><p>General-purpose NAS: For example, <code>31a8e4****</code>.</p>
     * </li>
     * <li><p>Extreme NAS: The ID must start with <code>extreme-</code>. For example, <code>extreme-0015****</code>.</p>
     * </li>
     * <li><p>CPFS: The ID must start with <code>cpfs-</code>. For example, <code>cpfs-125487****</code>.</p>
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
     * <p>Additional options for the file system.</p>
     */
    @NameInMap("Options")
    public ModifyFileSystemRequestOptions options;

    public static ModifyFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemRequest self = new ModifyFileSystemRequest();
        return TeaModel.build(map, self);
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

    public static class ModifyFileSystemRequestOptions extends TeaModel {
        @NameInMap("EnableABE")
        public Boolean enableABE;

        /**
         * <p>Specifies whether to enable OpLock. Valid values:</p>
         * <ul>
         * <li><p>true: Enables OpLock.</p>
         * </li>
         * <li><p>false: Disables OpLock.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This feature is available only for file systems that use the SMB protocol.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableOplock")
        public Boolean enableOplock;

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
