// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetAccountIdentityInfoRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("Source")
    public String source;

    public static GetAccountIdentityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountIdentityInfoRequest self = new GetAccountIdentityInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountIdentityInfoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAccountIdentityInfoRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAccountIdentityInfoRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetAccountIdentityInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
