// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainSlsStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainSlsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSlsStatusRequest self = new DescribeDomainSlsStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSlsStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainSlsStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainSlsStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDomainSlsStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
