// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAccessModeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeDomainAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAccessModeRequest self = new DescribeDomainAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAccessModeRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribeDomainAccessModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
