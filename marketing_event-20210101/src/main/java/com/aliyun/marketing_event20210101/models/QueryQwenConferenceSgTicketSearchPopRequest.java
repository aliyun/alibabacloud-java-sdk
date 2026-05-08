// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryQwenConferenceSgTicketSearchPopRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>neal</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    public static QueryQwenConferenceSgTicketSearchPopRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryQwenConferenceSgTicketSearchPopRequest self = new QueryQwenConferenceSgTicketSearchPopRequest();
        return TeaModel.build(map, self);
    }

    public QueryQwenConferenceSgTicketSearchPopRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
