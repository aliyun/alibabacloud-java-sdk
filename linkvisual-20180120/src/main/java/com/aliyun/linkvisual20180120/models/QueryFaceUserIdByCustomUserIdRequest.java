// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserIdByCustomUserIdRequest extends TeaModel {
    @NameInMap("CustomUserId")
    public String customUserId;

    @NameInMap("IsolationId")
    public String isolationId;

    public static QueryFaceUserIdByCustomUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserIdByCustomUserIdRequest self = new QueryFaceUserIdByCustomUserIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserIdByCustomUserIdRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public QueryFaceUserIdByCustomUserIdRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}
