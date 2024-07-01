// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test**.xin</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("FeeCommand")
    public String feeCommand;

    /**
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("FeeCurrency")
    public String feeCurrency;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeePeriod")
    public Integer feePeriod;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainRequest self = new CheckDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckDomainRequest setFeeCommand(String feeCommand) {
        this.feeCommand = feeCommand;
        return this;
    }
    public String getFeeCommand() {
        return this.feeCommand;
    }

    public CheckDomainRequest setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
        return this;
    }
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

    public CheckDomainRequest setFeePeriod(Integer feePeriod) {
        this.feePeriod = feePeriod;
        return this;
    }
    public Integer getFeePeriod() {
        return this.feePeriod;
    }

    public CheckDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckDomainRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
