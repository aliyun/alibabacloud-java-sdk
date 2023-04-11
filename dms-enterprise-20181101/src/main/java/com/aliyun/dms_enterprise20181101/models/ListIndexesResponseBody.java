// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListIndexesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of indexes.</p>
     */
    @NameInMap("IndexList")
    public ListIndexesResponseBodyIndexList indexList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListIndexesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesResponseBody self = new ListIndexesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListIndexesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListIndexesResponseBody setIndexList(ListIndexesResponseBodyIndexList indexList) {
        this.indexList = indexList;
        return this;
    }
    public ListIndexesResponseBodyIndexList getIndexList() {
        return this.indexList;
    }

    public ListIndexesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListIndexesResponseBodyIndexListIndex extends TeaModel {
        /**
         * <p>The description of the index.</p>
         */
        @NameInMap("IndexComment")
        public String indexComment;

        /**
         * <p>The ID of the index.</p>
         */
        @NameInMap("IndexId")
        public String indexId;

        /**
         * <p>The name of the index.</p>
         */
        @NameInMap("IndexName")
        public String indexName;

        /**
         * <p>The type of the index. Valid values:</p>
         * <br>
         * <p>*   Primary</p>
         * <p>*   Unique</p>
         * <p>*   Normal</p>
         * <p>*   FullText</p>
         * <p>*   Spatial</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <p>The ID of the table.</p>
         */
        @NameInMap("TableId")
        public String tableId;

        public static ListIndexesResponseBodyIndexListIndex build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyIndexListIndex self = new ListIndexesResponseBodyIndexListIndex();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyIndexListIndex setIndexComment(String indexComment) {
            this.indexComment = indexComment;
            return this;
        }
        public String getIndexComment() {
            return this.indexComment;
        }

        public ListIndexesResponseBodyIndexListIndex setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public ListIndexesResponseBodyIndexListIndex setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

        public ListIndexesResponseBodyIndexListIndex setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public ListIndexesResponseBodyIndexListIndex setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

    }

    public static class ListIndexesResponseBodyIndexList extends TeaModel {
        @NameInMap("Index")
        public java.util.List<ListIndexesResponseBodyIndexListIndex> index;

        public static ListIndexesResponseBodyIndexList build(java.util.Map<String, ?> map) throws Exception {
            ListIndexesResponseBodyIndexList self = new ListIndexesResponseBodyIndexList();
            return TeaModel.build(map, self);
        }

        public ListIndexesResponseBodyIndexList setIndex(java.util.List<ListIndexesResponseBodyIndexListIndex> index) {
            this.index = index;
            return this;
        }
        public java.util.List<ListIndexesResponseBodyIndexListIndex> getIndex() {
            return this.index;
        }

    }

}
