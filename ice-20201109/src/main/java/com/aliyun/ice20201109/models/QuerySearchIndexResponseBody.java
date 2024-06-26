// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IndexStatus")
    public String indexStatus;

    /**
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    @NameInMap("MediaTotal")
    public String mediaTotal;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    @NameInMap("Success")
    public String success;

    public static QuerySearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchIndexResponseBody self = new QuerySearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySearchIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySearchIndexResponseBody setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }
    public String getIndexStatus() {
        return this.indexStatus;
    }

    public QuerySearchIndexResponseBody setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public QuerySearchIndexResponseBody setMediaTotal(String mediaTotal) {
        this.mediaTotal = mediaTotal;
        return this;
    }
    public String getMediaTotal() {
        return this.mediaTotal;
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

    public QuerySearchIndexResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
