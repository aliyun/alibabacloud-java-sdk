// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeniedMemberAccessRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberAccountId")
    public String memberAccountId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeniedMemberAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeniedMemberAccessRequest self = new DeniedMemberAccessRequest();
        return TeaModel.build(map, self);
    }

    public DeniedMemberAccessRequest setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
        return this;
    }
    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    public DeniedMemberAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
