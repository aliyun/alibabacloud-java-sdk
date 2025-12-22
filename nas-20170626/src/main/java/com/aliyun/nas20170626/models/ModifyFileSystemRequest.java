// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the file system.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
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
     * <li>Sample ID of a General-purpose NAS file system: <code>31a8e4****</code>.</li>
     * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>. Example: <code>extreme-0015****</code>.</li>
     * <li>The IDs of Cloud Paralleled File System (CPFS) file systems must start with <code>cpfs-</code>. Example: <code>cpfs-125487****</code>.</li>
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
        /**
         * <p>Specifies whether to enable the oplock feature. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p> Only Server Message Block (SMB) file systems support this feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableOplock")
        public Boolean enableOplock;

        public static ModifyFileSystemRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyFileSystemRequestOptions self = new ModifyFileSystemRequestOptions();
            return TeaModel.build(map, self);
        }

        public ModifyFileSystemRequestOptions setEnableOplock(Boolean enableOplock) {
            this.enableOplock = enableOplock;
            return this;
        }
        public Boolean getEnableOplock() {
            return this.enableOplock;
        }

    }

}
