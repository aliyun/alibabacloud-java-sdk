// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTemplateIdRequest extends TeaModel {
    @NameInMap("AddTransferLock")
    public Boolean addTransferLock;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForUpdatingContactByTemplateIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTemplateIdRequest self = new SaveTaskForUpdatingContactByTemplateIdRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setAddTransferLock(Boolean addTransferLock) {
        this.addTransferLock = addTransferLock;
        return this;
    }
    public Boolean getAddTransferLock() {
        return this.addTransferLock;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public SaveTaskForUpdatingContactByTemplateIdRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
