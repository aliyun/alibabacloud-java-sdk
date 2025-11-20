// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPoliciesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public ListPoliciesResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID for API call tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesResponseBody self = new ListPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPoliciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPoliciesResponseBody setData(ListPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPoliciesResponseBodyData getData() {
        return this.data;
    }

    public ListPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPoliciesResponseBodyData extends TeaModel {
        /**
         * <p>The list of policies.</p>
         */
        @NameInMap("items")
        public java.util.List<PolicyInfo> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPoliciesResponseBodyData self = new ListPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPoliciesResponseBodyData setItems(java.util.List<PolicyInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<PolicyInfo> getItems() {
            return this.items;
        }

        public ListPoliciesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPoliciesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPoliciesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
