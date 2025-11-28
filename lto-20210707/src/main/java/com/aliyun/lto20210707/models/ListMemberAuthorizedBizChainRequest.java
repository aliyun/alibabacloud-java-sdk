// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAuthorizedBizChainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListMemberAuthorizedBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAuthorizedBizChainRequest self = new ListMemberAuthorizedBizChainRequest();
        return TeaModel.build(map, self);
    }

    public ListMemberAuthorizedBizChainRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ListMemberAuthorizedBizChainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
