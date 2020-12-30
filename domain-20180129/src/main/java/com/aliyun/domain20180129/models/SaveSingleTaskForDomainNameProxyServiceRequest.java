// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDomainNameProxyServiceRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Status")
    public Boolean status;

    public static SaveSingleTaskForDomainNameProxyServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDomainNameProxyServiceRequest self = new SaveSingleTaskForDomainNameProxyServiceRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDomainNameProxyServiceRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForDomainNameProxyServiceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForDomainNameProxyServiceRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForDomainNameProxyServiceRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
