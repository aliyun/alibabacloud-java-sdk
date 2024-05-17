// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchRequest extends TeaModel {
    @NameInMap("card")
    public String card;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    public static AISearchRequest build(java.util.Map<String, ?> map) throws Exception {
        AISearchRequest self = new AISearchRequest();
        return TeaModel.build(map, self);
    }

    public AISearchRequest setCard(String card) {
        this.card = card;
        return this;
    }
    public String getCard() {
        return this.card;
    }

    public AISearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
