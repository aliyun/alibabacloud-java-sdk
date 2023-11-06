// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDocumentCollectionsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Items")
    public ListDocumentCollectionsResponseBodyItems items;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CollectionName")
        public String collectionName;

        @NameInMap("Dimension")
        public Integer dimension;

        @NameInMap("EmbeddingModel")
        public String embeddingModel;

        @NameInMap("FullTextRetrievalFields")
        public String fullTextRetrievalFields;

        @NameInMap("Metadata")
        public String metadata;

        @NameInMap("Metrics")
        public String metrics;

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
