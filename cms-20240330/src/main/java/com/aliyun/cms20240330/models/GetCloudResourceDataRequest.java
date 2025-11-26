// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCloudResourceDataRequest extends TeaModel {
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
     * <p>1721767203</p>
     */
    @NameInMap("to")
    public Integer to;

    public static GetCloudResourceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceDataRequest self = new GetCloudResourceDataRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceDataRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public GetCloudResourceDataRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetCloudResourceDataRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
