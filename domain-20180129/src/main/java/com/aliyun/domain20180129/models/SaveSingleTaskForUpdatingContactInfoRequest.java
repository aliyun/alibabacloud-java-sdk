// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForUpdatingContactInfoRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("ContactType")
    public String contactType;

    @NameInMap("AddTransferLock")
    public Boolean addTransferLock;

    public static SaveSingleTaskForUpdatingContactInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForUpdatingContactInfoRequest self = new SaveSingleTaskForUpdatingContactInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setAddTransferLock(Boolean addTransferLock) {
        this.addTransferLock = addTransferLock;
        return this;
    }
    public Boolean getAddTransferLock() {
        return this.addTransferLock;
    }

}
