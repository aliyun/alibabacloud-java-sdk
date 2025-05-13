// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetEntityStoreDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1721767203</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.entity with(domain=\&quot;acs\&quot;, type=\&quot;acs.k8s.node\&quot;) | limit 0, 10</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1721767283</p>
     */
    @NameInMap("to")
    public Integer to;

    public static GetEntityStoreDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEntityStoreDataRequest self = new GetEntityStoreDataRequest();
        return TeaModel.build(map, self);
    }

    public GetEntityStoreDataRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetEntityStoreDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetEntityStoreDataRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
