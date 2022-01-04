// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ExportQueryResultRequest extends TeaModel {
    @NameInMap("QueryId")
    public String queryId;

    public static ExportQueryResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportQueryResultRequest self = new ExportQueryResultRequest();
        return TeaModel.build(map, self);
    }

    public ExportQueryResultRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
