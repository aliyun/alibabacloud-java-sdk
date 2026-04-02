// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListChunksResponseBody extends TeaModel {
    @NameInMap("Chunks")
    public ListChunksResponseBodyChunks chunks;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Long pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static ListChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChunksResponseBody self = new ListChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChunksResponseBody setChunks(ListChunksResponseBodyChunks chunks) {
        this.chunks = chunks;
        return this;
    }
    public ListChunksResponseBodyChunks getChunks() {
        return this.chunks;
    }

    public ListChunksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListChunksResponseBody setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChunksResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListChunksResponseBodyChunksChunksVector extends TeaModel {
        @NameInMap("vector")
        public java.util.List<Double> vector;

        public static ListChunksResponseBodyChunksChunksVector build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyChunksChunksVector self = new ListChunksResponseBodyChunksChunksVector();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyChunksChunksVector setVector(java.util.List<Double> vector) {
            this.vector = vector;
            return this;
        }
        public java.util.List<Double> getVector() {
            return this.vector;
        }

    }

    public static class ListChunksResponseBodyChunksChunks extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("LoaderMetadata")
        public String loaderMetadata;

        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("Vector")
        public ListChunksResponseBodyChunksChunksVector vector;

        public static ListChunksResponseBodyChunksChunks build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyChunksChunks self = new ListChunksResponseBodyChunksChunks();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyChunksChunks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListChunksResponseBodyChunksChunks setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListChunksResponseBodyChunksChunks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListChunksResponseBodyChunksChunks setLoaderMetadata(String loaderMetadata) {
            this.loaderMetadata = loaderMetadata;
            return this;
        }
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        public ListChunksResponseBodyChunksChunks setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListChunksResponseBodyChunksChunks setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListChunksResponseBodyChunksChunks setVector(ListChunksResponseBodyChunksChunksVector vector) {
            this.vector = vector;
            return this;
        }
        public ListChunksResponseBodyChunksChunksVector getVector() {
            return this.vector;
        }

    }

    public static class ListChunksResponseBodyChunks extends TeaModel {
        @NameInMap("chunks")
        public java.util.List<ListChunksResponseBodyChunksChunks> chunks;

        public static ListChunksResponseBodyChunks build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyChunks self = new ListChunksResponseBodyChunks();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyChunks setChunks(java.util.List<ListChunksResponseBodyChunksChunks> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<ListChunksResponseBodyChunksChunks> getChunks() {
            return this.chunks;
        }

    }

}
