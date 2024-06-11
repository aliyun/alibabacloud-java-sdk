// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class QueryAccessorDomainWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static QueryAccessorDomainWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorDomainWhiteListRequest self = new QueryAccessorDomainWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccessorDomainWhiteListRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public QueryAccessorDomainWhiteListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
