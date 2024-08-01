// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetTxtRecordForVerifyRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The feature verified by using the TXT record. Valid values:</p>
     * <ul>
     * <li>ADD_SUB_DOMAIN</li>
     * <li>RETRIEVAL</li>
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
