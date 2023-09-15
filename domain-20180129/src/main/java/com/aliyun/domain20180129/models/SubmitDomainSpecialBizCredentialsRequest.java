// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitDomainSpecialBizCredentialsRequest extends TeaModel {
    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Credentials")
    public String credentials;

    @NameInMap("Extend")
    public String extend;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SubmitDomainSpecialBizCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDomainSpecialBizCredentialsRequest self = new SubmitDomainSpecialBizCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDomainSpecialBizCredentialsRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public SubmitDomainSpecialBizCredentialsRequest setCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }
    public String getCredentials() {
        return this.credentials;
    }

    public SubmitDomainSpecialBizCredentialsRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public SubmitDomainSpecialBizCredentialsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
