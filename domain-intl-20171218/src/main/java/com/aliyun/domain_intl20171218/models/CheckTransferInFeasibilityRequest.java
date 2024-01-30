// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class CheckTransferInFeasibilityRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("TransferAuthorizationCode")
    public String transferAuthorizationCode;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckTransferInFeasibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTransferInFeasibilityRequest self = new CheckTransferInFeasibilityRequest();
        return TeaModel.build(map, self);
    }

    public CheckTransferInFeasibilityRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CheckTransferInFeasibilityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckTransferInFeasibilityRequest setTransferAuthorizationCode(String transferAuthorizationCode) {
        this.transferAuthorizationCode = transferAuthorizationCode;
        return this;
    }
    public String getTransferAuthorizationCode() {
        return this.transferAuthorizationCode;
    }

    public CheckTransferInFeasibilityRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
