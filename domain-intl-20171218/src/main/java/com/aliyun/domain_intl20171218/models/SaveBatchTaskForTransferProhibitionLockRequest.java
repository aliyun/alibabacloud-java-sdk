// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForTransferProhibitionLockRequest extends TeaModel {
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
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForTransferProhibitionLockRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForTransferProhibitionLockRequest self = new SaveBatchTaskForTransferProhibitionLockRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForTransferProhibitionLockRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForTransferProhibitionLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForTransferProhibitionLockRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SaveBatchTaskForTransferProhibitionLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
