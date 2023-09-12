// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class QueryChildDivisionCodeRequest extends TeaModel {
    @NameInMap("body")
    public DivisionQuery body;

    public static QueryChildDivisionCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChildDivisionCodeRequest self = new QueryChildDivisionCodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryChildDivisionCodeRequest setBody(DivisionQuery body) {
        this.body = body;
        return this;
    }
    public DivisionQuery getBody() {
        return this.body;
    }

}
