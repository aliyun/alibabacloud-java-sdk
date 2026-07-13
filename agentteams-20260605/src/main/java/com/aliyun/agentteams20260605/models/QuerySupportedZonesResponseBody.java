// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QuerySupportedZonesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Items")
    public java.util.List<QuerySupportedZonesResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
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
