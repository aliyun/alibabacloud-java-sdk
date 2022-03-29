// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class QueryJobStatusShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    public static QueryJobStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobStatusShrinkRequest self = new QueryJobStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobStatusShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

}
