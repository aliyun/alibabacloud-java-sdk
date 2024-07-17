// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CancelQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Q-BCA5E96CB84BB8B8</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static CancelQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelQueryRequest self = new CancelQueryRequest();
        return TeaModel.build(map, self);
    }

    public CancelQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
