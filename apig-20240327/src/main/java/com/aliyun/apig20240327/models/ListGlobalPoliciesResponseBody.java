// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGlobalPoliciesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListGlobalPoliciesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>350E9393-B90C-5540-B2BE-6F4CF5965CDA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGlobalPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGlobalPoliciesResponseBody self = new ListGlobalPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGlobalPoliciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGlobalPoliciesResponseBody setData(ListGlobalPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGlobalPoliciesResponseBodyData getData() {
        return this.data;
    }

    public ListGlobalPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGlobalPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGlobalPoliciesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<PolicyInfo> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListGlobalPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGlobalPoliciesResponseBodyData self = new ListGlobalPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGlobalPoliciesResponseBodyData setItems(java.util.List<PolicyInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<PolicyInfo> getItems() {
            return this.items;
        }

        public ListGlobalPoliciesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGlobalPoliciesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGlobalPoliciesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
