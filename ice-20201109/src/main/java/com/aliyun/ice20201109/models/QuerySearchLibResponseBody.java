// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchLibResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The index information.</p>
     */
    @NameInMap("IndexInfo")
    public java.util.List<QuerySearchLibResponseBodyIndexInfo> indexInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The search library configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;faceGroupIds&quot;:&quot;xxx1,xxx2,xx3&quot;}</p>
     */
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
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
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
        /**
         * <p>The readiness status of the index. Valid values:</p>
         * <ul>
         * <li><p>Initializing: The index is being initialized.</p>
         * </li>
         * <li><p>Normal: The index is ready.</p>
         * </li>
         * <li><p>Fail: The index failed to be created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("IndexReadiness")
        public String indexReadiness;

        /**
         * <p>The status of the index. Valid values:</p>
         * <ul>
         * <li><p>Active: The index is active.</p>
         * </li>
         * <li><p>Deactive: The index is inactive.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("IndexStatus")
        public String indexStatus;

        /**
         * <p>The index type. Valid values:</p>
         * <ul>
         * <li><p>mm: Large language model (LLM).</p>
         * </li>
         * <li><p>face: Face recognition.</p>
         * </li>
         * <li><p>aiLabel: Smart tagging.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>face</p>
         */
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
