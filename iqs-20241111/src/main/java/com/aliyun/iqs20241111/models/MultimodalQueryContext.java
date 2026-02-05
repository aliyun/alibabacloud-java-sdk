// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MultimodalQueryContext extends TeaModel {
    @NameInMap("originalQuery")
    public MultimodalOriginalQuery originalQuery;

    public static MultimodalQueryContext build(java.util.Map<String, ?> map) throws Exception {
        MultimodalQueryContext self = new MultimodalQueryContext();
        return TeaModel.build(map, self);
    }

    public MultimodalQueryContext setOriginalQuery(MultimodalOriginalQuery originalQuery) {
        this.originalQuery = originalQuery;
        return this;
    }
    public MultimodalOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

}
