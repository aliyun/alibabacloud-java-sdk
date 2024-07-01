// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdateProhibitionLockRequest extends TeaModel {
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

    public static SaveBatchTaskForUpdateProhibitionLockRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdateProhibitionLockRequest self = new SaveBatchTaskForUpdateProhibitionLockRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public SaveBatchTaskForUpdateProhibitionLockRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
