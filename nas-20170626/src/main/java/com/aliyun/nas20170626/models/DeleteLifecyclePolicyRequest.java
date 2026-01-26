// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the lifecycle policy. Required for the CPFS for Lingjun file systems.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The name of the lifecycle policy. The name must be 3 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <blockquote>
     * <p> Optional for General-purpose NAS file systems. If this parameter is provided, it takes precedence over LifecyclePolicyId. If left empty, LifecyclePolicyId is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy1</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    public static DeleteLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecyclePolicyRequest self = new DeleteLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLifecyclePolicyRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteLifecyclePolicyRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    public DeleteLifecyclePolicyRequest setLifecyclePolicyName(String lifecyclePolicyName) {
        this.lifecyclePolicyName = lifecyclePolicyName;
        return this;
    }
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

}
