// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAccessModeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    public static DescribeDomainAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAccessModeRequest self = new DescribeDomainAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAccessModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainAccessModeRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

}
