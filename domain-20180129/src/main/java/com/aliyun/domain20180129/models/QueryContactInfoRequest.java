// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryContactInfoRequest extends TeaModel {
    /**
     * <p>The contact type. Valid values:  </p>
     * <ul>
     * <li><strong>registrant</strong>: Domain name registrant.  </li>
     * <li><strong>tech</strong>: Technical contact.  </li>
     * <li><strong>admin</strong>: Administrative contact.  </li>
     * <li><strong>billing</strong>: Billing contact.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryContactInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContactInfoRequest self = new QueryContactInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryContactInfoRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public QueryContactInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryContactInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryContactInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
