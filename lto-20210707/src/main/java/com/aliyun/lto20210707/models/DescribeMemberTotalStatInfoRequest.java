// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeMemberTotalStatInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

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

}
