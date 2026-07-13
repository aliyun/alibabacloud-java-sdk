// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyRequest extends TeaModel {
    /**
     * <p>The domain name. The <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describedomains">DescribeDomains</a> operation returns a list of domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The purpose of the TXT record verification. Valid values:</p>
     * <ul>
     * <li><p>ADD_SUB_DOMAIN: Add a subdomain for verification.</p>
     * </li>
     * <li><p>RETRIEVAL: Other verifications.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD_SUB_DOMAIN</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetTxtRecordForVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTxtRecordForVerifyRequest self = new GetTxtRecordForVerifyRequest();
        return TeaModel.build(map, self);
    }

    public GetTxtRecordForVerifyRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetTxtRecordForVerifyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetTxtRecordForVerifyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
