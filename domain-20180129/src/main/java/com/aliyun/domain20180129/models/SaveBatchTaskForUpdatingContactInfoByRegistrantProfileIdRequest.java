// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registrant</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest self = new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setTransferOutProhibited(Boolean transferOutProhibited) {
        this.transferOutProhibited = transferOutProhibited;
        return this;
    }
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
