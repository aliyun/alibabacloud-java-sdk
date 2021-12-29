// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribePackgeInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static DescribePackgeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackgeInfoRequest self = new DescribePackgeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackgeInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
