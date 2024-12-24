// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class RefreshResolveCacheRequest extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static RefreshResolveCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshResolveCacheRequest self = new RefreshResolveCacheRequest();
        return TeaModel.build(map, self);
    }

    public RefreshResolveCacheRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
