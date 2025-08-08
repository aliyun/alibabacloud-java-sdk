// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetDatabaseSummaryRequest extends TeaModel {
    @NameInMap("date")
    public String date;

    public static GetDatabaseSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSummaryRequest self = new GetDatabaseSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSummaryRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

}
