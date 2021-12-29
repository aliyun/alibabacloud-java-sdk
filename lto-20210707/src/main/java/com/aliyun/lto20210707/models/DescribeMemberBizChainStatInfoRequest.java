// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberBizChainStatInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

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

}
