// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>query-uIkIvLiVSuCKqg0yoa****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static DeleteAdvancedQueryHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryHistoryRequest self = new DeleteAdvancedQueryHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryHistoryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
