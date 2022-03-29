// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class QueryJobStatusRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static QueryJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatusRequest self = new QueryJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobStatusRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
