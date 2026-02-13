// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceGetListResponseBody extends TeaModel {
    @NameInMap("data")
    public AISearchResourceGetListResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A8AEC6D9-A359-5169-BD1A-BD848BA60D65</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AISearchResourceGetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceGetListResponseBody self = new AISearchResourceGetListResponseBody();
        return TeaModel.build(map, self);
    }

    public AISearchResourceGetListResponseBody setData(AISearchResourceGetListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AISearchResourceGetListResponseBodyData getData() {
        return this.data;
    }

    public AISearchResourceGetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AISearchResourceGetListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public String currentPage;

        @NameInMap("items")
        public java.util.List<?> items;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("total")
        public Long total;

        public static AISearchResourceGetListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AISearchResourceGetListResponseBodyData self = new AISearchResourceGetListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AISearchResourceGetListResponseBodyData setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public String getCurrentPage() {
            return this.currentPage;
        }

        public AISearchResourceGetListResponseBodyData setItems(java.util.List<?> items) {
            this.items = items;
            return this;
        }
        public java.util.List<?> getItems() {
            return this.items;
        }

        public AISearchResourceGetListResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public AISearchResourceGetListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
