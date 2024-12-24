// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class RefreshResolveCacheShrinkRequest extends TeaModel {
    @NameInMap("Domains")
    public String domainsShrink;

    public static RefreshResolveCacheShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshResolveCacheShrinkRequest self = new RefreshResolveCacheShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshResolveCacheShrinkRequest setDomainsShrink(String domainsShrink) {
        this.domainsShrink = domainsShrink;
        return this;
    }
    public String getDomainsShrink() {
        return this.domainsShrink;
    }

}
