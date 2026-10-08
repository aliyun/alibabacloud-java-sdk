// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForDomainRealNameVerificationRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Review Type. Valid values:  </p>
     * <ul>
     * <li><strong>ACTIVATE</strong>: New registration.  </li>
     * <li><strong>CHGHOLDER</strong>: Change of holder.  </li>
     * <li><strong>TRANSFER</strong>: Transfer-in.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATE</p>
     */
    @NameInMap("RealNameVerificationAction")
    public String realNameVerificationAction;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryFailReasonForDomainRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForDomainRealNameVerificationRequest self = new QueryFailReasonForDomainRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setRealNameVerificationAction(String realNameVerificationAction) {
        this.realNameVerificationAction = realNameVerificationAction;
        return this;
    }
    public String getRealNameVerificationAction() {
        return this.realNameVerificationAction;
    }

    public QueryFailReasonForDomainRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
