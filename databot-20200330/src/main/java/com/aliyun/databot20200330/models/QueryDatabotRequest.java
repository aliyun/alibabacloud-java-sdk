// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330.models;

import com.aliyun.tea.*;

public class QueryDatabotRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Query")
    public String query;

    @NameInMap("SessionId")
    public String sessionId;

    public static QueryDatabotRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabotRequest self = new QueryDatabotRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabotRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public QueryDatabotRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryDatabotRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
