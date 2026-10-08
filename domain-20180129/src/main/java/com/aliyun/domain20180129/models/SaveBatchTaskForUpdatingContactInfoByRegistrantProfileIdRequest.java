// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest extends TeaModel {
    /**
     * <p>The contact type to modify. Valid values:</p>
     * <ul>
     * <li><p><strong>registrant</strong>: The domain name\&quot;s registrant.</p>
     * </li>
     * <li><p><strong>admin</strong>: The administrative contact for the domain name.</p>
     * </li>
     * <li><p><strong>billing</strong>: The billing contact.</p>
     * </li>
     * <li><p><strong>tech</strong>: The technical contact.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registrant</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>An array of domain names to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>The language of the error message that is returned if the request fails. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the registrant profile. This ID is automatically generated when you create a registrant profile. You can find registrant profile IDs by calling the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>Specifies whether to enable the transfer lock. This parameter is valid only when <strong>ContactType</strong> is set to <strong>registrant</strong>. If enabled, this feature prevents the domain name from being transferred for 60 days after the registrant information is modified.</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables the lock, which prevents the domain name from being transferred out.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables the lock, which allows the domain name to be transferred out.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    /**
     * <p>The IP address of the client. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
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
