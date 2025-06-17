// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchIntrudeDomainsShrinkRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNamesShrink;

    public static BatchIntrudeDomainsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchIntrudeDomainsShrinkRequest self = new BatchIntrudeDomainsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchIntrudeDomainsShrinkRequest setDomainNamesShrink(String domainNamesShrink) {
        this.domainNamesShrink = domainNamesShrink;
        return this;
    }
    public String getDomainNamesShrink() {
        return this.domainNamesShrink;
    }

}
