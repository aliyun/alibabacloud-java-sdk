// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserGameProcessShrinkRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public String extInfoShrink;

    @NameInMap("ProcessId")
    public String processId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static QueryUserGameProcessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGameProcessShrinkRequest self = new QueryUserGameProcessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserGameProcessShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryUserGameProcessShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUserGameProcessShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public QueryUserGameProcessShrinkRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public QueryUserGameProcessShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
