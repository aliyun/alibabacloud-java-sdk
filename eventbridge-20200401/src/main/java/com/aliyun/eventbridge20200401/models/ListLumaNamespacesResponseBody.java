// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaNamespacesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful operation. If the operation fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of namespaces bound to the agent, including entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaNamespacesResponseBodyData data;

    /**
     * <p>The response message. A value of Operation success is returned if the operation succeeds. A specific error description is returned if the operation fails.</p>
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

    public static ListLumaNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaNamespacesResponseBody self = new ListLumaNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaNamespacesResponseBody setData(ListLumaNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>The effective page size for this request. If the Limit parameter is not specified, the server default value is used. If the specified value exceeds the upper limit, the value is adjusted to the maximum allowed value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The list of namespaces bound to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_namespace&quot;}]</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<Namespace> namespaces;

        /**
         * <p>The token for the next page. Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of namespaces bound to the agent, regardless of the number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaNamespacesResponseBodyData self = new ListLumaNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaNamespacesResponseBodyData setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListLumaNamespacesResponseBodyData setNamespaces(java.util.List<Namespace> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<Namespace> getNamespaces() {
            return this.namespaces;
        }

        public ListLumaNamespacesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaNamespacesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
