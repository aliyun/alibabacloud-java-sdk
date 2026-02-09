// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiRoutesResponseBody extends TeaModel {
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
    public ListHttpApiRoutesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBEEB8C1-108E-50F0-9BEA-DED79553C309</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListHttpApiRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiRoutesResponseBody self = new ListHttpApiRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHttpApiRoutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHttpApiRoutesResponseBody setData(ListHttpApiRoutesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHttpApiRoutesResponseBodyData getData() {
        return this.data;
    }

    public ListHttpApiRoutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHttpApiRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHttpApiRoutesResponseBodyData extends TeaModel {
        /**
         * <p>The routes.</p>
         */
        @NameInMap("items")
        public java.util.List<HttpRoute> items;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListHttpApiRoutesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHttpApiRoutesResponseBodyData self = new ListHttpApiRoutesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHttpApiRoutesResponseBodyData setItems(java.util.List<HttpRoute> items) {
            this.items = items;
            return this;
        }
        public java.util.List<HttpRoute> getItems() {
            return this.items;
        }

        public ListHttpApiRoutesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHttpApiRoutesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHttpApiRoutesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
