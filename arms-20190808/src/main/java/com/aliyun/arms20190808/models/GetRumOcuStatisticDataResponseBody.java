// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumOcuStatisticDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetRumOcuStatisticDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>626037F5-FDEB-45B0-804C-B3C92797****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRumOcuStatisticDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumOcuStatisticDataResponseBody self = new GetRumOcuStatisticDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumOcuStatisticDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetRumOcuStatisticDataResponseBody setData(GetRumOcuStatisticDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumOcuStatisticDataResponseBodyData getData() {
        return this.data;
    }

    public GetRumOcuStatisticDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumOcuStatisticDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRumOcuStatisticDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Complete")
        public Boolean complete;

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
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetRumOcuStatisticDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumOcuStatisticDataResponseBodyData self = new GetRumOcuStatisticDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumOcuStatisticDataResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public GetRumOcuStatisticDataResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public GetRumOcuStatisticDataResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetRumOcuStatisticDataResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetRumOcuStatisticDataResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
