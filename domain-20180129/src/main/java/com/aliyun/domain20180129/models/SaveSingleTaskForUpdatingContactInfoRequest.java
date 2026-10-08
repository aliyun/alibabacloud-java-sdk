// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForUpdatingContactInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether to add a transfer-out restriction. This parameter takes effect only when <strong>ContactType</strong> is <strong>registrant</strong>. It indicates whether to restrict domain transfer-out for 60 days after the registrant is updated. Default value: <strong>false</strong>, which means no transfer-out restriction is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AddTransferLock")
    public Boolean addTransferLock;

    /**
     * <p>Contact type. Valid values:</p>
     * <ul>
     * <li><strong>registrant</strong></li>
     * <li><strong>admin</strong></li>
     * <li><strong>billing</strong></li>
     * <li><strong>tech</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registrant</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Domain instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>S123456789</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Information template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForUpdatingContactInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForUpdatingContactInfoRequest self = new SaveSingleTaskForUpdatingContactInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setAddTransferLock(Boolean addTransferLock) {
        this.addTransferLock = addTransferLock;
        return this;
    }
    public Boolean getAddTransferLock() {
        return this.addTransferLock;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
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

    public SaveSingleTaskForUpdatingContactInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveSingleTaskForUpdatingContactInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
