// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveStreamCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamCountRequest self = new DescribeLiveStreamCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamCountRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
