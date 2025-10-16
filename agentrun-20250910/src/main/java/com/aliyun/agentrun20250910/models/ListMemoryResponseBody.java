// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMemoryResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>55D4BE40-2811-5CFB-8482-E0E98D575B1E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryResponseBody self = new ListMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoryResponseBody setData(ListMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemoryResponseBodyData getData() {
        return this.data;
    }

    public ListMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMemoryResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

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
         * <p>284</p>
         */
        @NameInMap("total")
        public Long total;

        public static ListMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryResponseBodyData self = new ListMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemoryResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListMemoryResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMemoryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMemoryResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
