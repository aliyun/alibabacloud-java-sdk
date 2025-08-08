// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableSummaryRequest extends TeaModel {
    @NameInMap("date")
    public String date;

    public static GetTableSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableSummaryRequest self = new GetTableSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetTableSummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
