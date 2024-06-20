// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145883-21513926<strong><strong><strong>88039,145883-2769726</strong></strong></strong>87513</p>
     */
    @NameInMap("MemberIds")
    public String memberIds;

    public static DeleteMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMembersRequest self = new DeleteMembersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMembersRequest setMemberIds(String memberIds) {
        this.memberIds = memberIds;
        return this;
    }
    public String getMemberIds() {
        return this.memberIds;
    }

}
