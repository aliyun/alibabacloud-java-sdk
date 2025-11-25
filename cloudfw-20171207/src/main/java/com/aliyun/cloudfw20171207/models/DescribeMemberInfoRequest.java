// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeMemberInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>150795602499****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    public static DescribeMemberInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberInfoRequest self = new DescribeMemberInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMemberInfoRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

}
