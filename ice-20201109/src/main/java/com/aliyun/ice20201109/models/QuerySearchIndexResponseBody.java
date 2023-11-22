// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchIndexResponseBody extends TeaModel {
    @NameInMap("IndexConfig")
    public String indexConfig;

    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static QuerySearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchIndexResponseBody self = new QuerySearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySearchIndexResponseBody setIndexConfig(String indexConfig) {
        this.indexConfig = indexConfig;
        return this;
    }
    public String getIndexConfig() {
        return this.indexConfig;
    }

    public QuerySearchIndexResponseBody setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public QuerySearchIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySearchIndexResponseBody setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
