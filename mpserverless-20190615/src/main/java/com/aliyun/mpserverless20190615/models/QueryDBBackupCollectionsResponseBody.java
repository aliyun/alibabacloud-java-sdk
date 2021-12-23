// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupCollectionsResponseBody extends TeaModel {
    @NameInMap("Collections")
    public java.util.List<String> collections;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryDBBackupCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupCollectionsResponseBody self = new QueryDBBackupCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupCollectionsResponseBody setCollections(java.util.List<String> collections) {
        this.collections = collections;
        return this;
    }
    public java.util.List<String> getCollections() {
        return this.collections;
    }

    public QueryDBBackupCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
