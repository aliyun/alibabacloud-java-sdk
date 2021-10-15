// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserGameProcessRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ProcessId")
    @Validation(required = true)
    public String processId;

    @NameInMap("ThirdPartyUserId")
    @Validation(required = true)
    public String thirdPartyUserId;

    public static QueryUserGameProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserGameProcessRequest self = new QueryUserGameProcessRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserGameProcessRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public QueryUserGameProcessRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUserGameProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public QueryUserGameProcessRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
