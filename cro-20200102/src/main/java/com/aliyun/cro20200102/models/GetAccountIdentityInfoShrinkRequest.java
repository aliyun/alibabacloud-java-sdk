// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetAccountIdentityInfoShrinkRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("Properties")
    public String propertiesShrink;

    @NameInMap("Source")
    public String source;

    public static GetAccountIdentityInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountIdentityInfoShrinkRequest self = new GetAccountIdentityInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountIdentityInfoShrinkRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAccountIdentityInfoShrinkRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetAccountIdentityInfoShrinkRequest setPropertiesShrink(String propertiesShrink) {
        this.propertiesShrink = propertiesShrink;
        return this;
    }
    public String getPropertiesShrink() {
        return this.propertiesShrink;
    }

    public GetAccountIdentityInfoShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
