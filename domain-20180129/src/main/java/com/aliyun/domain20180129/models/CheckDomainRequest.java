// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FeeCommand")
    public String feeCommand;

    @NameInMap("FeeCurrency")
    public String feeCurrency;

    @NameInMap("FeePeriod")
    public Integer feePeriod;

    @NameInMap("Lang")
    public String lang;

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

}
