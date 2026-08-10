// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SearchKgBySemanticResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The search results.</p>
     */
    @NameInMap("Data")
    public SearchKgBySemanticResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchKgBySemanticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchKgBySemanticResponseBody self = new SearchKgBySemanticResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchKgBySemanticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchKgBySemanticResponseBody setData(SearchKgBySemanticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchKgBySemanticResponseBodyData getData() {
        return this.data;
    }

    public SearchKgBySemanticResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchKgBySemanticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchKgBySemanticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchKgBySemanticResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchKgBySemanticResponseBodyDataSearchResults extends TeaModel {
        /**
         * <p>The ID of the matched entity record.</p>
         * 
         * <strong>example:</strong>
         * <p>itemId</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The entity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>EntityTypeCode1</p>
         */
        @NameInMap("ItemTypeCode")
        public String itemTypeCode;

        /**
         * <p>The property code that matched the semantic search.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("MatchedPropertyCode")
        public String matchedPropertyCode;

        /**
         * <p>The actual value of the matched property.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("MatchedPropertyValue")
        public String matchedPropertyValue;

        /**
         * <p>The similarity score ranging from 0.0 to 1.0, based on cosine similarity.</p>
         * 
         * <strong>example:</strong>
         * <p>0.88</p>
         */
        @NameInMap("SimilarityScore")
        public Float similarityScore;

        public static SearchKgBySemanticResponseBodyDataSearchResults build(java.util.Map<String, ?> map) throws Exception {
            SearchKgBySemanticResponseBodyDataSearchResults self = new SearchKgBySemanticResponseBodyDataSearchResults();
            return TeaModel.build(map, self);
        }

        public SearchKgBySemanticResponseBodyDataSearchResults setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public SearchKgBySemanticResponseBodyDataSearchResults setItemTypeCode(String itemTypeCode) {
            this.itemTypeCode = itemTypeCode;
            return this;
        }
        public String getItemTypeCode() {
            return this.itemTypeCode;
        }

        public SearchKgBySemanticResponseBodyDataSearchResults setMatchedPropertyCode(String matchedPropertyCode) {
            this.matchedPropertyCode = matchedPropertyCode;
            return this;
        }
        public String getMatchedPropertyCode() {
            return this.matchedPropertyCode;
        }

        public SearchKgBySemanticResponseBodyDataSearchResults setMatchedPropertyValue(String matchedPropertyValue) {
            this.matchedPropertyValue = matchedPropertyValue;
            return this;
        }
        public String getMatchedPropertyValue() {
            return this.matchedPropertyValue;
        }

        public SearchKgBySemanticResponseBodyDataSearchResults setSimilarityScore(Float similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

    }

    public static class SearchKgBySemanticResponseBodyData extends TeaModel {
        /**
         * <p>The list of search results.</p>
         */
        @NameInMap("SearchResults")
        public java.util.List<SearchKgBySemanticResponseBodyDataSearchResults> searchResults;

        /**
         * <p>The total number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1640276</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchKgBySemanticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchKgBySemanticResponseBodyData self = new SearchKgBySemanticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchKgBySemanticResponseBodyData setSearchResults(java.util.List<SearchKgBySemanticResponseBodyDataSearchResults> searchResults) {
            this.searchResults = searchResults;
            return this;
        }
        public java.util.List<SearchKgBySemanticResponseBodyDataSearchResults> getSearchResults() {
            return this.searchResults;
        }

        public SearchKgBySemanticResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
