// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    public static DescribeDomainSecurityConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityConfigRequest self = new DescribeDomainSecurityConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainSecurityConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSecurityConfigRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
