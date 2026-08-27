// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QuerySupportedZonesResponseBody extends TeaModel {
    /**
     * <p>The response code, which is <code>SUCCESS</code> when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code, which is <code>200</code> when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of zones.</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<QuerySupportedZonesResponseBodyItems> items;

    /**
     * <p>The number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message, which is <code>success</code> when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next page, which is <code>null</code> because this operation does not support pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID, which is <code>null</code> when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of zones.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QuerySupportedZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySupportedZonesResponseBody self = new QuerySupportedZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySupportedZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySupportedZonesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySupportedZonesResponseBody setItems(java.util.List<QuerySupportedZonesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QuerySupportedZonesResponseBodyItems> getItems() {
        return this.items;
    }

    public QuerySupportedZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QuerySupportedZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySupportedZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QuerySupportedZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySupportedZonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySupportedZonesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QuerySupportedZonesResponseBodyItems extends TeaModel {
        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static QuerySupportedZonesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySupportedZonesResponseBodyItems self = new QuerySupportedZonesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QuerySupportedZonesResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
