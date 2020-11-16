// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLivePullStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigRequest self = new DescribeLivePullStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
