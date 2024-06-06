// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateAliPayUrlResult extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("memberId")
    public String memberId;

    @NameInMap("zftWithholdSignUrl")
    public String zftWithholdSignUrl;

    public static CreateAliPayUrlResult build(java.util.Map<String, ?> map) throws Exception {
        CreateAliPayUrlResult self = new CreateAliPayUrlResult();
        return TeaModel.build(map, self);
    }

    public CreateAliPayUrlResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateAliPayUrlResult setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public CreateAliPayUrlResult setZftWithholdSignUrl(String zftWithholdSignUrl) {
        this.zftWithholdSignUrl = zftWithholdSignUrl;
        return this;
    }
    public String getZftWithholdSignUrl() {
        return this.zftWithholdSignUrl;
    }

}
