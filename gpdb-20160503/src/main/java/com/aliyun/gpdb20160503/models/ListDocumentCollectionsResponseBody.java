// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDocumentCollectionsResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The queried document collections.</p>
     */
    @NameInMap("Items")
    public ListDocumentCollectionsResponseBodyItems items;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDocumentCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentCollectionsResponseBody self = new ListDocumentCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentCollectionsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListDocumentCollectionsResponseBody setItems(ListDocumentCollectionsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public ListDocumentCollectionsResponseBodyItems getItems() {
        return this.items;
    }

    public ListDocumentCollectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocumentCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentCollectionsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListDocumentCollectionsResponseBodyItemsCollectionList extends TeaModel {
        /**
         * <p>The name of the document collection.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("CollectionName")
        public String collectionName;

        /**
         * <p>The number of vector dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>1536</p>
         */
        @NameInMap("Dimension")
        public Integer dimension;

        /**
         * <p>The name of the vector algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embeddding-v1</p>
         */
        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        /**
         * <p>The fields that are used for full-text search. Multiple fields are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        @NameInMap("FullTextRetrievalFields")
        public String fullTextRetrievalFields;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;page\&quot;: \&quot;int\&quot;, \&quot;title\&quot;: \&quot;text\&quot;}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The vector similarity algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>cosine</p>
         */
        @NameInMap("Metrics")
        public String metrics;

        /**
         * <p>The analyzer that is used for full-text search.</p>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        @NameInMap("Parser")
        public String parser;

        public static ListDocumentCollectionsResponseBodyItemsCollectionList build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentCollectionsResponseBodyItemsCollectionList self = new ListDocumentCollectionsResponseBodyItemsCollectionList();
            return TeaModel.build(map, self);
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setEmbeddingModel(String embeddingModel) {
            this.embeddingModel = embeddingModel;
            return this;
        }
        public String getEmbeddingModel() {
            return this.embeddingModel;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setFullTextRetrievalFields(String fullTextRetrievalFields) {
            this.fullTextRetrievalFields = fullTextRetrievalFields;
            return this;
        }
        public String getFullTextRetrievalFields() {
            return this.fullTextRetrievalFields;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setMetrics(String metrics) {
            this.metrics = metrics;
            return this;
        }
        public String getMetrics() {
            return this.metrics;
        }

        public ListDocumentCollectionsResponseBodyItemsCollectionList setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

    }

    public static class ListDocumentCollectionsResponseBodyItems extends TeaModel {
        @NameInMap("CollectionList")
        public java.util.List<ListDocumentCollectionsResponseBodyItemsCollectionList> collectionList;

        public static ListDocumentCollectionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentCollectionsResponseBodyItems self = new ListDocumentCollectionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDocumentCollectionsResponseBodyItems setCollectionList(java.util.List<ListDocumentCollectionsResponseBodyItemsCollectionList> collectionList) {
            this.collectionList = collectionList;
            return this;
        }
        public java.util.List<ListDocumentCollectionsResponseBodyItemsCollectionList> getCollectionList() {
            return this.collectionList;
        }

    }

}
