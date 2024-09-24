// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersRequest extends TeaModel {
    /**
     * <p>The UIDs of the members.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234123412341234</p>
     */
    @NameInMap("MemberUids")
    public java.util.List<Long> memberUids;

    public static DeleteInstanceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceMembersRequest self = new DeleteInstanceMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceMembersRequest setMemberUids(java.util.List<Long> memberUids) {
        this.memberUids = memberUids;
        return this;
    }
    public java.util.List<Long> getMemberUids() {
        return this.memberUids;
    }

}
