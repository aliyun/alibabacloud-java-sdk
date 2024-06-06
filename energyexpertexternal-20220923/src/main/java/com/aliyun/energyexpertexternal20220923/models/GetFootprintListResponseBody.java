// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetFootprintListResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetFootprintListResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetFootprintListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFootprintListResponseBody self = new GetFootprintListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFootprintListResponseBody setData(GetFootprintListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFootprintListResponseBodyData getData() {
        return this.data;
    }

    public GetFootprintListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFootprintListResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The amount of the product.</p>
         */
        @NameInMap("amount")
        public Double amount;

        /**
         * <p>Authentication status enumeration value, please refer to [link](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf).</p>
         */
        @NameInMap("authStatus")
        public Long authStatus;

        /**
         * <p>Calculation end time.</p>
         */
        @NameInMap("checkEndTime")
        public String checkEndTime;

        /**
         * <p>Calculation start time.</p>
         */
        @NameInMap("checkStartTime")
        public String checkStartTime;

        /**
         * <p>The enterprise code.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The user who created it.</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The product ID.</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Indicates whether the demo model is a built-in model. A value of 1 indicates a true value and a value of 0 indicates a false value.</p>
         */
        @NameInMap("isDemoModel")
        public Long isDemoModel;

        /**
         * <p>The literal expression corresponding to lifeCycleType, `From Cradle to Gate` and `From Cradle to Grave`.</p>
         */
        @NameInMap("lifeCycle")
        public String lifeCycle;

        /**
         * <p>1 is `From Cradle to Gate`, and 2 is `From Cradle to Grave`.</p>
         */
        @NameInMap("lifeCycleType")
        public Long lifeCycleType;

        /**
         * <p>The product name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Product category enumeration value, please refer to [Carbon Footprint Appendices](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf).</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Unit enumeration value. Please refer to [Carbon Footprint Appendices](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf).</p>
         */
        @NameInMap("unit")
        public String unit;

        public static GetFootprintListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetFootprintListResponseBodyDataRecords self = new GetFootprintListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetFootprintListResponseBodyDataRecords setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public GetFootprintListResponseBodyDataRecords setAuthStatus(Long authStatus) {
            this.authStatus = authStatus;
            return this;
        }
        public Long getAuthStatus() {
            return this.authStatus;
        }

        public GetFootprintListResponseBodyDataRecords setCheckEndTime(String checkEndTime) {
            this.checkEndTime = checkEndTime;
            return this;
        }
        public String getCheckEndTime() {
            return this.checkEndTime;
        }

        public GetFootprintListResponseBodyDataRecords setCheckStartTime(String checkStartTime) {
            this.checkStartTime = checkStartTime;
            return this;
        }
        public String getCheckStartTime() {
            return this.checkStartTime;
        }

        public GetFootprintListResponseBodyDataRecords setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetFootprintListResponseBodyDataRecords setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetFootprintListResponseBodyDataRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetFootprintListResponseBodyDataRecords setIsDemoModel(Long isDemoModel) {
            this.isDemoModel = isDemoModel;
            return this;
        }
        public Long getIsDemoModel() {
            return this.isDemoModel;
        }

        public GetFootprintListResponseBodyDataRecords setLifeCycle(String lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public String getLifeCycle() {
            return this.lifeCycle;
        }

        public GetFootprintListResponseBodyDataRecords setLifeCycleType(Long lifeCycleType) {
            this.lifeCycleType = lifeCycleType;
            return this;
        }
        public Long getLifeCycleType() {
            return this.lifeCycleType;
        }

        public GetFootprintListResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFootprintListResponseBodyDataRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFootprintListResponseBodyDataRecords setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetFootprintListResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Product Detail List.</p>
         */
        @NameInMap("records")
        public java.util.List<GetFootprintListResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <p>Total Pages</p>
         */
        @NameInMap("totalPage")
        public Long totalPage;

        public static GetFootprintListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFootprintListResponseBodyData self = new GetFootprintListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFootprintListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetFootprintListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetFootprintListResponseBodyData setRecords(java.util.List<GetFootprintListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetFootprintListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetFootprintListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetFootprintListResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
