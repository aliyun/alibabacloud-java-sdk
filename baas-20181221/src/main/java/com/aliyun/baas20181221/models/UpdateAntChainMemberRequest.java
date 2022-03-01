// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainMemberRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("MemberName")
    public String memberName;

    public static UpdateAntChainMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainMemberRequest self = new UpdateAntChainMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateAntChainMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateAntChainMemberRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

}
