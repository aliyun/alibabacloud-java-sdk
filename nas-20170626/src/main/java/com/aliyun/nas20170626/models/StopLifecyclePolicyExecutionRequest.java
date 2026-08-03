// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class StopLifecyclePolicyExecutionRequest extends TeaModel {
    /**
     * <p>The file system ID. The ID starts with bmcpfs-, such as bmcpfs-290w65p03ok64ya****.</p>
     * <blockquote>
     * <p>This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the lifecycle policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    public static StopLifecyclePolicyExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLifecyclePolicyExecutionRequest self = new StopLifecyclePolicyExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StopLifecyclePolicyExecutionRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public StopLifecyclePolicyExecutionRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

}
