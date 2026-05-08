// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteContextsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mem_long_01,mem_long_02</p>
     */
    @NameInMap("contextIds")
    public String contextIds;

    /**
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;u-10001&quot;}</p>
     */
    @NameInMap("filter")
    public String filter;

    public static DeleteContextsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContextsRequest self = new DeleteContextsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContextsRequest setContextIds(String contextIds) {
        this.contextIds = contextIds;
        return this;
    }
    public String getContextIds() {
        return this.contextIds;
    }

    public DeleteContextsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

}
