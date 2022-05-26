// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetEnrolledAccountRequest extends TeaModel {
    // 账号ID
    @NameInMap("AccountUid")
    public Long accountUid;

    // RegionId
    @NameInMap("RegionId")
    public String regionId;

    public static GetEnrolledAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnrolledAccountRequest self = new GetEnrolledAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetEnrolledAccountRequest setAccountUid(Long accountUid) {
        this.accountUid = accountUid;
        return this;
    }
    public Long getAccountUid() {
        return this.accountUid;
    }

    public GetEnrolledAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
