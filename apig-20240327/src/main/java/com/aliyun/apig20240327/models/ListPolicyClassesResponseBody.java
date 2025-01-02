// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPolicyClassesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListPolicyClassesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>23B45FA9-7208-5E55-B5CE-B6B2567DD822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPolicyClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyClassesResponseBody self = new ListPolicyClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyClassesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPolicyClassesResponseBody setData(ListPolicyClassesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPolicyClassesResponseBodyData getData() {
        return this.data;
    }

    public ListPolicyClassesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPolicyClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPolicyClassesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<PolicyClassInfo> items;

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
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListPolicyClassesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyClassesResponseBodyData self = new ListPolicyClassesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPolicyClassesResponseBodyData setItems(java.util.List<PolicyClassInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<PolicyClassInfo> getItems() {
            return this.items;
        }

        public ListPolicyClassesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPolicyClassesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPolicyClassesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
