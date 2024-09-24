// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/126583.html">DescribeAutoSnapshotPolicies</a> operation to view available automatic snapshot policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-extreme-233e6****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    public static DeleteAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyRequest self = new DeleteAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

}
