// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForModifyingDomainDnsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    @NameInMap("DnsList")
    public java.util.List<String> dnsList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForModifyingDomainDnsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForModifyingDomainDnsRequest self = new SaveTaskForModifyingDomainDnsRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForModifyingDomainDnsRequest setAliyunDns(Boolean aliyunDns) {
        this.aliyunDns = aliyunDns;
        return this;
    }
    public Boolean getAliyunDns() {
        return this.aliyunDns;
    }

    public SaveTaskForModifyingDomainDnsRequest setDnsList(java.util.List<String> dnsList) {
        this.dnsList = dnsList;
        return this;
    }
    public java.util.List<String> getDnsList() {
        return this.dnsList;
    }

    public SaveTaskForModifyingDomainDnsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveTaskForModifyingDomainDnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForModifyingDomainDnsRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public SaveTaskForModifyingDomainDnsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
