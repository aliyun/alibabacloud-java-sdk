// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersRequest extends TeaModel {
    /**
     * <p>The unique identifiers (UID) of members that you want to remove from Cloud Firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
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
