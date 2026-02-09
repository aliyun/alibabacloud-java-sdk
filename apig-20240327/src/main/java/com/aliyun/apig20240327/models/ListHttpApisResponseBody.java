// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApisResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public ListHttpApisResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Get HTTP API List</p>
     * 
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListHttpApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApisResponseBody self = new ListHttpApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpApisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHttpApisResponseBody setData(ListHttpApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHttpApisResponseBodyData getData() {
        return this.data;
    }

    public ListHttpApisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHttpApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHttpApisResponseBodyData extends TeaModel {
        /**
         * <p>object</p>
         */
        @NameInMap("items")
        public java.util.List<HttpApiInfoByName> items;

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
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListHttpApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHttpApisResponseBodyData self = new ListHttpApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHttpApisResponseBodyData setItems(java.util.List<HttpApiInfoByName> items) {
            this.items = items;
            return this;
        }
        public java.util.List<HttpApiInfoByName> getItems() {
            return this.items;
        }

        public ListHttpApisResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHttpApisResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHttpApisResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
