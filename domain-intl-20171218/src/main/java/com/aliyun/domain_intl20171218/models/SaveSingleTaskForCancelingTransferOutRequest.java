// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCancelingTransferOutRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForCancelingTransferOutRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCancelingTransferOutRequest self = new SaveSingleTaskForCancelingTransferOutRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCancelingTransferOutRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForCancelingTransferOutRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCancelingTransferOutRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
