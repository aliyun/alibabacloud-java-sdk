// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamDelayConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveStreamDelayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamDelayConfigRequest self = new DescribeLiveStreamDelayConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamDelayConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
