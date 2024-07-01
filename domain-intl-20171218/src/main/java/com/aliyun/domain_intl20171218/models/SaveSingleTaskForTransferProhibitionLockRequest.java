// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForTransferProhibitionLockRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForTransferProhibitionLockRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForTransferProhibitionLockRequest self = new SaveSingleTaskForTransferProhibitionLockRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForTransferProhibitionLockRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForTransferProhibitionLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForTransferProhibitionLockRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SaveSingleTaskForTransferProhibitionLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
