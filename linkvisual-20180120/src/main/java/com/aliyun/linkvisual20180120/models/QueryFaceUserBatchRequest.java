// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserBatchRequest extends TeaModel {
    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static QueryFaceUserBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserBatchRequest self = new QueryFaceUserBatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserBatchRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceUserBatchRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
