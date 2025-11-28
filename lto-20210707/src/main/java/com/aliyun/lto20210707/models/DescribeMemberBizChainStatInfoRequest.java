// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberBizChainStatInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMemberBizChainStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberBizChainStatInfoRequest self = new DescribeMemberBizChainStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMemberBizChainStatInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMemberBizChainStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
