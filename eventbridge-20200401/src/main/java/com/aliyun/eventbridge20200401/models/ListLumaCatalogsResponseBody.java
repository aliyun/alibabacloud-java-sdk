// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaCatalogsResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of data catalogs bound to the agent, including entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaCatalogsResponseBodyData data;

    /**
     * <p>The response message. A value of Operation success is returned if the call succeeds. A specific error description is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID for troubleshooting and when submitting a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaCatalogsResponseBody self = new ListLumaCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaCatalogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaCatalogsResponseBody setData(ListLumaCatalogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaCatalogsResponseBodyData getData() {
        return this.data;
    }

    public ListLumaCatalogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaCatalogsResponseBodyData extends TeaModel {
        /**
         * <p>The list of data catalogs bound to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_catalog&quot;}]</p>
         */
        @NameInMap("Catalogs")
        public java.util.List<Catalog> catalogs;

        /**
         * <p>The effective page size for this request. If the Limit parameter is not specified, the server default value is used. If the specified value exceeds the upper limit, the value is adjusted to the maximum allowed value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The token for the next page. Pass this value as the NextToken in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of data catalogs bound to the agent, regardless of the number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaCatalogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaCatalogsResponseBodyData self = new ListLumaCatalogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaCatalogsResponseBodyData setCatalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<Catalog> getCatalogs() {
            return this.catalogs;
        }

        public ListLumaCatalogsResponseBodyData setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListLumaCatalogsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaCatalogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
