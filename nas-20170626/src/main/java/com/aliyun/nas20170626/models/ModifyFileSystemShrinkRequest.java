// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemShrinkRequest extends TeaModel {
    /**
     * <p>The automatic expansion configuration.</p>
     */
    @NameInMap("AutoUpgradeConfig")
    public String autoUpgradeConfigShrink;

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
    public String optionsShrink;

    public static ModifyFileSystemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemShrinkRequest self = new ModifyFileSystemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemShrinkRequest setAutoUpgradeConfigShrink(String autoUpgradeConfigShrink) {
        this.autoUpgradeConfigShrink = autoUpgradeConfigShrink;
        return this;
    }
    public String getAutoUpgradeConfigShrink() {
        return this.autoUpgradeConfigShrink;
    }

    public ModifyFileSystemShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFileSystemShrinkRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyFileSystemShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

}
