// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryFailReasonForRegistrantProfileRealNameVerificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileID")
    public Long registrantProfileID;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryFailReasonForRegistrantProfileRealNameVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFailReasonForRegistrantProfileRealNameVerificationRequest self = new QueryFailReasonForRegistrantProfileRealNameVerificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationRequest setRegistrantProfileID(Long registrantProfileID) {
        this.registrantProfileID = registrantProfileID;
        return this;
    }
    public Long getRegistrantProfileID() {
        return this.registrantProfileID;
    }

    public QueryFailReasonForRegistrantProfileRealNameVerificationRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
