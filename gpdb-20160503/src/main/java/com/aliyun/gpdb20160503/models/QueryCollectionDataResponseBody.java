// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataResponseBody extends TeaModel {
    @NameInMap("Matches")
    public QueryCollectionDataResponseBodyMatches matches;

    /**
     * <p>Detailed information when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1234</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status, with the following values:</p>
     * <ul>
     * <li><strong>success</strong>: Success.</li>
     * <li><strong>fail</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Only returned when the Offset is not 0, this value represents the total number of hits for the search criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryCollectionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCollectionDataResponseBody self = new QueryCollectionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCollectionDataResponseBody setMatches(QueryCollectionDataResponseBodyMatches matches) {
        this.matches = matches;
        return this;
    }
    public QueryCollectionDataResponseBodyMatches getMatches() {
        return this.matches;
    }

    public QueryCollectionDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCollectionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCollectionDataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryCollectionDataResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices extends TeaModel {
        @NameInMap("Indice")
        public java.util.List<Integer> indice;

        public static QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices self = new QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices setIndice(java.util.List<Integer> indice) {
            this.indice = indice;
            return this;
        }
        public java.util.List<Integer> getIndice() {
            return this.indice;
        }

    }

    public static class QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<Float> value;

        public static QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues self = new QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues setValue(java.util.List<Float> value) {
            this.value = value;
            return this;
        }
        public java.util.List<Float> getValue() {
            return this.value;
        }

    }

    public static class QueryCollectionDataResponseBodyMatchesMatchSparseValues extends TeaModel {
        @NameInMap("Indices")
        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices indices;

        @NameInMap("Values")
        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues values;

        public static QueryCollectionDataResponseBodyMatchesMatchSparseValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatchesMatchSparseValues self = new QueryCollectionDataResponseBodyMatchesMatchSparseValues();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatchesMatchSparseValues setIndices(QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices indices) {
            this.indices = indices;
            return this;
        }
        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesIndices getIndices() {
            return this.indices;
        }

        public QueryCollectionDataResponseBodyMatchesMatchSparseValues setValues(QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues values) {
            this.values = values;
            return this;
        }
        public QueryCollectionDataResponseBodyMatchesMatchSparseValuesValues getValues() {
            return this.values;
        }

    }

    public static class QueryCollectionDataResponseBodyMatchesMatchValues extends TeaModel {
        @NameInMap("value")
        public java.util.List<Double> value;

        public static QueryCollectionDataResponseBodyMatchesMatchValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatchesMatchValues self = new QueryCollectionDataResponseBodyMatchesMatchValues();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatchesMatchValues setValue(java.util.List<Double> value) {
            this.value = value;
            return this;
        }
        public java.util.List<Double> getValue() {
            return this.value;
        }

    }

    public static class QueryCollectionDataResponseBodyMatchesMatch extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        @NameInMap("MetadataV2")
        public java.util.Map<String, ?> metadataV2;

        @NameInMap("Score")
        public Double score;

        @NameInMap("SparseValues")
        public QueryCollectionDataResponseBodyMatchesMatchSparseValues sparseValues;

        @NameInMap("Values")
        public QueryCollectionDataResponseBodyMatchesMatchValues values;

        public static QueryCollectionDataResponseBodyMatchesMatch build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatchesMatch self = new QueryCollectionDataResponseBodyMatchesMatch();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatchesMatch setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCollectionDataResponseBodyMatchesMatch setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public QueryCollectionDataResponseBodyMatchesMatch setMetadataV2(java.util.Map<String, ?> metadataV2) {
            this.metadataV2 = metadataV2;
            return this;
        }
        public java.util.Map<String, ?> getMetadataV2() {
            return this.metadataV2;
        }

        public QueryCollectionDataResponseBodyMatchesMatch setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public QueryCollectionDataResponseBodyMatchesMatch setSparseValues(QueryCollectionDataResponseBodyMatchesMatchSparseValues sparseValues) {
            this.sparseValues = sparseValues;
            return this;
        }
        public QueryCollectionDataResponseBodyMatchesMatchSparseValues getSparseValues() {
            return this.sparseValues;
        }

        public QueryCollectionDataResponseBodyMatchesMatch setValues(QueryCollectionDataResponseBodyMatchesMatchValues values) {
            this.values = values;
            return this;
        }
        public QueryCollectionDataResponseBodyMatchesMatchValues getValues() {
            return this.values;
        }

    }

    public static class QueryCollectionDataResponseBodyMatches extends TeaModel {
        @NameInMap("match")
        public java.util.List<QueryCollectionDataResponseBodyMatchesMatch> match;

        public static QueryCollectionDataResponseBodyMatches build(java.util.Map<String, ?> map) throws Exception {
            QueryCollectionDataResponseBodyMatches self = new QueryCollectionDataResponseBodyMatches();
            return TeaModel.build(map, self);
        }

        public QueryCollectionDataResponseBodyMatches setMatch(java.util.List<QueryCollectionDataResponseBodyMatchesMatch> match) {
            this.match = match;
            return this;
        }
        public java.util.List<QueryCollectionDataResponseBodyMatchesMatch> getMatch() {
            return this.match;
        }

    }

}
