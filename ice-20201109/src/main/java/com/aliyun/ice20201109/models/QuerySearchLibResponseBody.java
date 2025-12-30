// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchLibResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("IndexInfo")
    public java.util.List<QuerySearchLibResponseBodyIndexInfo> indexInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchLibConfig")
    public String searchLibConfig;

    /**
     * <p>The name of the search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The status of the search library.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>normal</li>
     * <li>deleting</li>
     * <li>deleteFail</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QuerySearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchLibResponseBody self = new QuerySearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySearchLibResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySearchLibResponseBody setIndexInfo(java.util.List<QuerySearchLibResponseBodyIndexInfo> indexInfo) {
        this.indexInfo = indexInfo;
        return this;
    }
    public java.util.List<QuerySearchLibResponseBodyIndexInfo> getIndexInfo() {
        return this.indexInfo;
    }

    public QuerySearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySearchLibResponseBody setSearchLibConfig(String searchLibConfig) {
        this.searchLibConfig = searchLibConfig;
        return this;
    }
    public String getSearchLibConfig() {
        return this.searchLibConfig;
    }

    public QuerySearchLibResponseBody setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public QuerySearchLibResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySearchLibResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QuerySearchLibResponseBodyIndexInfo extends TeaModel {
        @NameInMap("IndexReadiness")
        public String indexReadiness;

        @NameInMap("IndexStatus")
        public String indexStatus;

        @NameInMap("IndexType")
        public String indexType;

        public static QuerySearchLibResponseBodyIndexInfo build(java.util.Map<String, ?> map) throws Exception {
            QuerySearchLibResponseBodyIndexInfo self = new QuerySearchLibResponseBodyIndexInfo();
            return TeaModel.build(map, self);
        }

        public QuerySearchLibResponseBodyIndexInfo setIndexReadiness(String indexReadiness) {
            this.indexReadiness = indexReadiness;
            return this;
        }
        public String getIndexReadiness() {
            return this.indexReadiness;
        }

        public QuerySearchLibResponseBodyIndexInfo setIndexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }
        public String getIndexStatus() {
            return this.indexStatus;
        }

        public QuerySearchLibResponseBodyIndexInfo setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

    }

}
