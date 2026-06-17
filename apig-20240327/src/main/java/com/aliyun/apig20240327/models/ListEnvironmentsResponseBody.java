// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The paged query response for the environment list.</p>
     */
    @NameInMap("data")
    public ListEnvironmentsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to trace the call chain.</p>
     * 
     * <strong>example:</strong>
     * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListEnvironmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponseBody self = new ListEnvironmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnvironmentsResponseBody setData(ListEnvironmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListEnvironmentsResponseBodyData extends TeaModel {
        /**
         * <p>环境信息列表。</p>
         */
        @NameInMap("items")
        public java.util.List<EnvironmentInfo> items;

        /**
         * <p>The page number.</p>
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
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListEnvironmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsResponseBodyData self = new ListEnvironmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsResponseBodyData setItems(java.util.List<EnvironmentInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<EnvironmentInfo> getItems() {
            return this.items;
        }

        public ListEnvironmentsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListEnvironmentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
