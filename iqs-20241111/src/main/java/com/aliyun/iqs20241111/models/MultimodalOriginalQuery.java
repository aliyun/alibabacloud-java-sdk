// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalOriginalQuery extends TeaModel {
    @NameInMap("query")
    public String query;

    public static MultimodalOriginalQuery build(java.util.Map<String, ?> map) throws Exception {
        MultimodalOriginalQuery self = new MultimodalOriginalQuery();
        return TeaModel.build(map, self);
    }

    public MultimodalOriginalQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
