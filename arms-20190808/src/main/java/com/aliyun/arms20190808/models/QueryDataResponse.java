// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryDataResponse extends TeaModel {
    @NameInMap("results")
    public String results;

    public static QueryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataResponse self = new QueryDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataResponse setResults(String results) {
        this.results = results;
        return this;
    }
    public String getResults() {
        return this.results;
    }

}
