// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupCollectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Collections")
    public java.util.List<String> collections;

    public static QueryDBBackupCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupCollectionsResponseBody self = new QueryDBBackupCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDBBackupCollectionsResponseBody setCollections(java.util.List<String> collections) {
        this.collections = collections;
        return this;
    }
    public java.util.List<String> getCollections() {
        return this.collections;
    }

}
