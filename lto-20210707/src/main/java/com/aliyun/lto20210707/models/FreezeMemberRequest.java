// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class FreezeMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("RegionId")
    public String regionId;

    public static FreezeMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeMemberRequest self = new FreezeMemberRequest();
        return TeaModel.build(map, self);
    }

    public FreezeMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public FreezeMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
