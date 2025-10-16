// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMemoryEventResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0FB1162C-D50B-5DA7-AD04-3417ABBF133A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMemoryEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryEventResponseBody self = new ListMemoryEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoryEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoryEventResponseBody setData(ListMemoryEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemoryEventResponseBodyData getData() {
        return this.data;
    }

    public ListMemoryEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMemoryEventResponseBodyData extends TeaModel {
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
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("total")
        public Long total;

        public static ListMemoryEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemoryEventResponseBodyData self = new ListMemoryEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemoryEventResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public ListMemoryEventResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMemoryEventResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMemoryEventResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
