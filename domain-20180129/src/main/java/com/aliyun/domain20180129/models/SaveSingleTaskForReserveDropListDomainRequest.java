// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForReserveDropListDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactTemplateId")
    public String contactTemplateId;

    @NameInMap("Dns1")
    public String dns1;

    @NameInMap("Dns2")
    public String dns2;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static SaveSingleTaskForReserveDropListDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForReserveDropListDomainRequest self = new SaveSingleTaskForReserveDropListDomainRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForReserveDropListDomainRequest setContactTemplateId(String contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public String getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveSingleTaskForReserveDropListDomainRequest setDns1(String dns1) {
        this.dns1 = dns1;
        return this;
    }
    public String getDns1() {
        return this.dns1;
    }

    public SaveSingleTaskForReserveDropListDomainRequest setDns2(String dns2) {
        this.dns2 = dns2;
        return this;
    }
    public String getDns2() {
        return this.dns2;
    }

    public SaveSingleTaskForReserveDropListDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
