// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListAgentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("After")
    public String after;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("Order")
    public String order;

    public static ListAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentsRequest self = new ListAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentsRequest setAfter(String after) {
        this.after = after;
        return this;
    }
    public String getAfter() {
        return this.after;
    }

    public ListAgentsRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListAgentsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
