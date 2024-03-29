// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetLoginPageRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FailUrl")
    public String failUrl;

    @NameInMap("TargetUrl")
    public String targetUrl;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static GetLoginPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginPageRequest self = new GetLoginPageRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginPageRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetLoginPageRequest setFailUrl(String failUrl) {
        this.failUrl = failUrl;
        return this;
    }
    public String getFailUrl() {
        return this.failUrl;
    }

    public GetLoginPageRequest setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public GetLoginPageRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GetLoginPageRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
