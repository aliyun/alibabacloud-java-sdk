// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataItemListResponseBody extends TeaModel {
    /**
     * <p>Response parameters.</p>
     */
    @NameInMap("data")
    public java.util.List<GetDataItemListResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDataItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataItemListResponseBody self = new GetDataItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataItemListResponseBody setData(java.util.List<GetDataItemListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataItemListResponseBodyData> getData() {
        return this.data;
    }

    public GetDataItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataItemListResponseBodyData extends TeaModel {
        /**
         * <p>The identifier of the data item.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The name of the data item.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Data filling method, 1: monthly value 2: annual value.</p>
         */
        @NameInMap("period")
        public Integer period;

        /**
         * <p>The data item unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetDataItemListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataItemListResponseBodyData self = new GetDataItemListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataItemListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDataItemListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataItemListResponseBodyData setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public GetDataItemListResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
