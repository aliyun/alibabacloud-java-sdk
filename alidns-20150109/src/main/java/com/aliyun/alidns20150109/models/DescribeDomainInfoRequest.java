// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoRequest extends TeaModel {
    /**
     * <p>The domain name. Call <a href="https://help.aliyun.com/document_detail/2357286.html">DescribeDomains</a> to obtain the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to return detailed attributes of the domain name. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>The default value is false.</p>
     * <p>If you set this parameter to <strong>true</strong>, the response includes the following parameters: lineType, minTtl, recordLineTreeJson, recordLines, lineCode, lineDisplayName, lineName, regionLines, and slaveDns.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    public static DescribeDomainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoRequest self = new DescribeDomainInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainInfoRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

}
