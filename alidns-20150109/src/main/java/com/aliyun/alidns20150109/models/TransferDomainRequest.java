// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainRequest extends TeaModel {
    /**
     * <p>The list of domain names. Separate multiple domain names with commas (,). Only domain names registered with Alibaba Cloud are supported.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the user to which domain names were transferred.</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static TransferDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainRequest self = new TransferDomainRequest();
        return TeaModel.build(map, self);
    }

    public TransferDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public TransferDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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
