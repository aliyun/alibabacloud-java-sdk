// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyRequest extends TeaModel {
    /**
     * <p>The ID of the Domain Name System (DNS) record. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The feature verified by using the TXT record. Valid values:</p>
     * <ul>
     * <li>ADD_SUB_DOMAIN: add a subdomain for verification.</li>
     * <li>RETRIEVAL: add other subdomains for verification</li>
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
