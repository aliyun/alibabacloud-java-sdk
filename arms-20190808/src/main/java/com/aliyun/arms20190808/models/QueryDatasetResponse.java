// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryDatasetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static QueryDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetResponse self = new QueryDatasetResponse();
        return TeaModel.build(map, self);
    }

}
