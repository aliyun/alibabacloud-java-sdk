// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveInputBooleanRequest extends TeaModel {
    @NameInMap("query")
    public Boolean query;

    public static PrimitiveInputBooleanRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveInputBooleanRequest self = new PrimitiveInputBooleanRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveInputBooleanRequest setQuery(Boolean query) {
        this.query = query;
        return this;
    }
    public Boolean getQuery() {
        return this.query;
    }

}
