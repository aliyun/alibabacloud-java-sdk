// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class ConfirmTransferInEmailRequest extends TeaModel {
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("Email")
    public String email;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ConfirmTransferInEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmTransferInEmailRequest self = new ConfirmTransferInEmailRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmTransferInEmailRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public ConfirmTransferInEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ConfirmTransferInEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConfirmTransferInEmailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
