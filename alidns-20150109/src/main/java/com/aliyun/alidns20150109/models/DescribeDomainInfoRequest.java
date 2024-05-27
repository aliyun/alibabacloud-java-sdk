// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether detailed attributes are required. The default value is **false**, which indicates that detailed attributes are not required.</p>
     * <br>
     * <p>If you set this parameter to **true**, the values of the following parameters are returned: LineType, MinTtl, RecordLineTreeJson, RecordLines, LineCode, LineDisplayName, LineName, RegionLines, and SlaveDns.</p>
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
