// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class TransferInRefetchWhoisEmailRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static TransferInRefetchWhoisEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInRefetchWhoisEmailRequest self = new TransferInRefetchWhoisEmailRequest();
        return TeaModel.build(map, self);
    }

    public TransferInRefetchWhoisEmailRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public TransferInRefetchWhoisEmailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferInRefetchWhoisEmailRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
