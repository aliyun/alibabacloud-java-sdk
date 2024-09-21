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
     * 
     * <strong>example:</strong>
     * <p>06DA2909-7736-5738-AA31-ACD617D828F1</p>
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
         * 
         * <strong>example:</strong>
         * <p>100.0000000000000000000000000</p>
         */
        @NameInMap("amount")
        public Double amount;

        /**
         * <p>Authentication status enumeration value, please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">link</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("authStatus")
        public Long authStatus;

        /**
         * <p>Calculation end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024/01/31</p>
         */
        @NameInMap("checkEndTime")
        public String checkEndTime;

        /**
         * <p>Calculation start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024/01/01</p>
         */
        @NameInMap("checkStartTime")
        public String checkStartTime;

        /**
         * <p>The enterprise code.</p>
         * 
         * <strong>example:</strong>
         * <p>C-20080808-1</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The user who created it.</p>
         * 
         * <strong>example:</strong>
         * <p>Energy Expert</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Indicates whether the demo model is a built-in model. A value of 1 indicates a true value and a value of 0 indicates a false value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isDemoModel")
        public Long isDemoModel;

        /**
         * <p>The literal expression corresponding to lifeCycleType, <code>From Cradle to Gate</code> and <code>From Cradle to Grave</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>From Cradle to Gate</p>
         */
        @NameInMap("lifeCycle")
        public String lifeCycle;

        /**
         * <p>1 is <code>From Cradle to Gate</code>, and 2 is <code>From Cradle to Grave</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("lifeCycleType")
        public Long lifeCycleType;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>Carbon-footprint-demo</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Product category enumeration value, please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>158-159</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Unit enumeration value. Please refer to <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/CarbonFootprintAppendices-en.pdf">Carbon Footprint Appendices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1-4</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <p>Total Pages</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
