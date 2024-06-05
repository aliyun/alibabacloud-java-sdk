// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <br>
     * <p>You can call the [DescribeAutoSnapshotPolicies](https://help.aliyun.com/document_detail/126583.html) operation to view available automatic snapshot policies.</p>
     * <br>
     * <p>This parameter is required.</p>
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
