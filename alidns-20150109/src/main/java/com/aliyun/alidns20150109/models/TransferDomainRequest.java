// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("TargetUserId")
    @Validation(required = true)
    public Long targetUserId;

    public static TransferDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainRequest self = new TransferDomainRequest();
        return TeaModel.build(map, self);
    }

    public TransferDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public TransferDomainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TransferDomainRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

}
