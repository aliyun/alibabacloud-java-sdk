// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330.models;

import com.aliyun.tea.*;

public class QueryDatabotRequest extends TeaModel {
    @NameInMap("SessionId")
    @Validation(required = true)
    public String sessionId;

    public static QueryDatabotRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabotRequest self = new QueryDatabotRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabotRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
