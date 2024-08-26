// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitDomainSpecialBizCredentialsRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>219</p>
     */
    @NameInMap("BizId")
    public Long bizId;

    /**
     * <p>The certificate information.</p>
     */
    @NameInMap("Credentials")
    public String credentials;

    /**
     * <p>The extended information.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;addTransferLock\&quot;:true}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
