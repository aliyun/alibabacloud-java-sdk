// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransferOutProhibited")
    public Boolean transferOutProhibited;

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
