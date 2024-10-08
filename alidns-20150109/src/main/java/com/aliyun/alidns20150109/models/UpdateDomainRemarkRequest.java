// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRemarkRequest extends TeaModel {
    /**
     * <p>The domain name that already exists in Alibaba Cloud DNS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mydomain.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The description of your domain name.</p>
     * <p>It can be up to 50 characters in length and can contain digits, letters, and the following special characters: _ - , .</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRemarkRequest self = new UpdateDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRemarkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
