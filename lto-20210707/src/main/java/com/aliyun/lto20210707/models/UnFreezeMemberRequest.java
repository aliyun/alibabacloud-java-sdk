// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UnFreezeMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("RegionId")
    public String regionId;

    public static UnFreezeMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeMemberRequest self = new UnFreezeMemberRequest();
        return TeaModel.build(map, self);
    }

    public UnFreezeMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UnFreezeMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
