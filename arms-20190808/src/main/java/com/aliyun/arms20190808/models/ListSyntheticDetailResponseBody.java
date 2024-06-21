// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSyntheticDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListSyntheticDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSyntheticDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSyntheticDetailResponseBody self = new ListSyntheticDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSyntheticDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListSyntheticDetailResponseBody setData(ListSyntheticDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSyntheticDetailResponseBodyData getData() {
        return this.data;
    }

    public ListSyntheticDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSyntheticDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSyntheticDetailResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListSyntheticDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSyntheticDetailResponseBodyData self = new ListSyntheticDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSyntheticDetailResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public ListSyntheticDetailResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListSyntheticDetailResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSyntheticDetailResponseBodyData setTaskCreateTime(Long taskCreateTime) {
            this.taskCreateTime = taskCreateTime;
            return this;
        }
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        public ListSyntheticDetailResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
