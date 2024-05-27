// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRemarkRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks. The remarks can be up to 50 characters in length and can contain only letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateDnsCacheDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRemarkRequest self = new UpdateDnsCacheDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRemarkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDnsCacheDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsCacheDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
