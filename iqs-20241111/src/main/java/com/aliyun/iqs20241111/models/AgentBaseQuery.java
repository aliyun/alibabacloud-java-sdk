// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class AgentBaseQuery extends TeaModel {
    /**
     * <p>The natural language question used to retrieve nearby locations.</p>
     * 
     * <strong>example:</strong>
     * <p>Luxury hotels within 5 km of Lingyin Temple in Hangzhou</p>
     */
    @NameInMap("query")
    public String query;

    public static AgentBaseQuery build(java.util.Map<String, ?> map) throws Exception {
        AgentBaseQuery self = new AgentBaseQuery();
        return TeaModel.build(map, self);
    }

    public AgentBaseQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
