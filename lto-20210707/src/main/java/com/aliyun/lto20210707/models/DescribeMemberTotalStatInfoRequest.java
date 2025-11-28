// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberTotalStatInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMemberTotalStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberTotalStatInfoRequest self = new DescribeMemberTotalStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMemberTotalStatInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMemberTotalStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
