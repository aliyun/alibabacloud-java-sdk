// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckDomainRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test**.xin</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Operation command. Valid values:  </p>
     * <ul>
     * <li><strong>create</strong>: Purchase.  </li>
     * <li><strong>renew</strong>: Renewal.  </li>
     * <li><strong>transfer</strong>: Transfer-in.  </li>
     * <li><strong>restore</strong>: Redeem.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("FeeCommand")
    public String feeCommand;

    /**
     * <p>Currency type. Valid value: <strong>USD</strong> (US Dollar).</p>
     * 
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("FeeCurrency")
    public String feeCurrency;

    /**
     * <p>Registration period in years. Unit: <strong>year</strong>. Valid range: <strong>1</strong> to <strong>10</strong> years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeePeriod")
    public Integer feePeriod;

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
