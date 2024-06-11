// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainsStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    public static QueryAccessorDomainsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainsStatusRequest self = new QueryAccessorDomainsStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainsStatusRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public QueryAccessorDomainsStatusRequest setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

}
