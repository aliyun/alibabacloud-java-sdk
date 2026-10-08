// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest extends TeaModel {
    /**
     * <p>A list of domain names. If you specify multiple domain names, pass them as a <strong>list</strong>. Call the <a href="https://help.aliyun.com/document_detail/69362.htm?spm=a2c4g.11186623.0.0.33f4253cSJy3m8">QueryDomainList</a> API to obtain a list of your domain names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>The language of error messages returned by the API. Valid values:</p>
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
     * <p>The registrant profile ID. Call the <a href="https://help.aliyun.com/document_detail/67701.htm?spm=a2c4g.11186623.0.0.33f420daTwRQaO">QueryRegistrantProfiles</a> API to query the registrant profile ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>Specifies whether to enable a 60-day transfer lock on the domain name after its registrant information is updated. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Do not apply the lock.</p>
     * </li>
     * <li><p><strong>true</strong>: Apply the lock.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

    /**
     * <p>The IP address of the user. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest self = new SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest setTransferOutProhibited(Boolean transferOutProhibited) {
        this.transferOutProhibited = transferOutProhibited;
        return this;
    }
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
    }

    public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
