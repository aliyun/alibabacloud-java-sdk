// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserPointShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfoShrink;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static QueryUserPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserPointShrinkRequest self = new QueryUserPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserPointShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryUserPointShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUserPointShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public QueryUserPointShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
