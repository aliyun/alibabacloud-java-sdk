// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiOperationsResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operations.</p>
     */
    @NameInMap("data")
    public ListHttpApiOperationsResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListHttpApiOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiOperationsResponseBody self = new ListHttpApiOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpApiOperationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHttpApiOperationsResponseBody setData(ListHttpApiOperationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHttpApiOperationsResponseBodyData getData() {
        return this.data;
    }

    public ListHttpApiOperationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHttpApiOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHttpApiOperationsResponseBodyData extends TeaModel {
        /**
         * <p>The operations.</p>
         */
        @NameInMap("items")
        public java.util.List<HttpApiOperationInfo> items;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListHttpApiOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHttpApiOperationsResponseBodyData self = new ListHttpApiOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHttpApiOperationsResponseBodyData setItems(java.util.List<HttpApiOperationInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<HttpApiOperationInfo> getItems() {
            return this.items;
        }

        public ListHttpApiOperationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHttpApiOperationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHttpApiOperationsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
