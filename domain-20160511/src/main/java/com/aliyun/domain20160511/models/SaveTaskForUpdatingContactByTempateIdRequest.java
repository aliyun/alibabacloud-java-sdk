// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTempateIdRequest extends TeaModel {
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

    public static SaveTaskForUpdatingContactByTempateIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTempateIdRequest self = new SaveTaskForUpdatingContactByTempateIdRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setAddTransferLock(Boolean addTransferLock) {
        this.addTransferLock = addTransferLock;
        return this;
    }
    public Boolean getAddTransferLock() {
        return this.addTransferLock;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public SaveTaskForUpdatingContactByTempateIdRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
