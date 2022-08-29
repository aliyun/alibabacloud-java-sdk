// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccProposerNameRequest extends TeaModel {
    @NameInMap("MemberId")
    public Long memberId;

    public static GetCsccProposerNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCsccProposerNameRequest self = new GetCsccProposerNameRequest();
        return TeaModel.build(map, self);
    }

    public GetCsccProposerNameRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
