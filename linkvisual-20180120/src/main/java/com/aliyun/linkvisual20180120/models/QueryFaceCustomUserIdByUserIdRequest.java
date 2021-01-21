// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceCustomUserIdByUserIdRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    public static QueryFaceCustomUserIdByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceCustomUserIdByUserIdRequest self = new QueryFaceCustomUserIdByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceCustomUserIdByUserIdRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceCustomUserIdByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
