// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryCollectionDataResponseBody extends TeaModel {
    /**
     * <p>The retrieved data.</p>
     */
    @NameInMap("Matches")
    public QueryCollectionDataResponseBodyMatches matches;

    /**
     * <strong>example:</strong>
     * <p>0.1234</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of entries that match the search conditions. This parameter is returned only when the Offset parameter is not 0.</p>
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
        /**
         * <p>The unique ID of the vector data.</p>
         * 
         * <strong>example:</strong>
         * <p>doca-1234</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The similarity score of the data. It is related to the <code>l2, ip, or cosine</code> algorithm that is specified when you create an index.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12345</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The retrieved vector data.</p>
         */
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

        public QueryCollectionDataResponseBodyMatchesMatch setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
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
