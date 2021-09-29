// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetOutAccountBindDetailRequest extends TeaModel {
    @NameInMap("OutAccountType")
    public String outAccountType;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountDomain")
    public String accountDomain;

    public static GetOutAccountBindDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOutAccountBindDetailRequest self = new GetOutAccountBindDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOutAccountBindDetailRequest setOutAccountType(String outAccountType) {
        this.outAccountType = outAccountType;
        return this;
    }
    public String getOutAccountType() {
        return this.outAccountType;
    }

    public GetOutAccountBindDetailRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetOutAccountBindDetailRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

}
