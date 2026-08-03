// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The file system description.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NAS-test-1</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose NAS: <code>31a8e4****</code>.</p>
     * </li>
     * <li><p>Extreme NAS: must start with <code>extreme-</code>, for example, <code>extreme-0015****</code>.</p>
     * </li>
     * <li><p>CPFS: must start with <code>cpfs-</code>, for example, <code>cpfs-125487****</code>.</p>
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
         * <p>Specifies whether to enable the SMB Access-based Enumeration (ABE) access control feature.</p>
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
         * <li>true: enables the feature.</li>
         * <li>false: does not enable the feature.<blockquote>
         * <p>Only file systems whose Protocol Type is SMB protocol are supported.</p>
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
         * <p>Specifies whether the Lingjun VSC mount target supports access only through access points.</p>
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
