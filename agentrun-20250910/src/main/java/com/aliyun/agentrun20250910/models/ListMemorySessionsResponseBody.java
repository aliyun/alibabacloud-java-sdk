// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemorySessionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMemorySessionsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E2C43519-6095-5487-9526-051AB8F50B4A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMemorySessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionsResponseBody self = new ListMemorySessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemorySessionsResponseBody setData(ListMemorySessionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemorySessionsResponseBodyData getData() {
        return this.data;
    }

    public ListMemorySessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMemorySessionsResponseBodyData extends TeaModel {
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
         * <p>211</p>
         */
        @NameInMap("total")
        public Long total;

        public static ListMemorySessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemorySessionsResponseBodyData self = new ListMemorySessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemorySessionsResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListMemorySessionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMemorySessionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMemorySessionsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
