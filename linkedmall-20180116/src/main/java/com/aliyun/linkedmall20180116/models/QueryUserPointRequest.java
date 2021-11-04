// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserPointRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static QueryUserPointRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserPointRequest self = new QueryUserPointRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserPointRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryUserPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUserPointRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public QueryUserPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
