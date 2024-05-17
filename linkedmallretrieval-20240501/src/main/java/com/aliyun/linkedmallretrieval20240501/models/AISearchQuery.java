// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchQuery extends TeaModel {
    @NameInMap("card")
    public String card;

    @NameInMap("query")
    public String query;

    public static AISearchQuery build(java.util.Map<String, ?> map) throws Exception {
        AISearchQuery self = new AISearchQuery();
        return TeaModel.build(map, self);
    }

    public AISearchQuery setCard(String card) {
        this.card = card;
        return this;
    }
    public String getCard() {
        return this.card;
    }

    public AISearchQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
