// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListSubscriptionSharedPackagesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public ListSubscriptionSharedPackagesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSubscriptionSharedPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionSharedPackagesResponseBody self = new ListSubscriptionSharedPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionSharedPackagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscriptionSharedPackagesResponseBody setData(ListSubscriptionSharedPackagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSubscriptionSharedPackagesResponseBodyData getData() {
        return this.data;
    }

    public ListSubscriptionSharedPackagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscriptionSharedPackagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList extends TeaModel {
        /**
         * <p>The end time of the current cycle, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1756310400</p>
         */
        @NameInMap("CycleEndTime")
        public Long cycleEndTime;

        /**
         * <p>The equity code (subscription code). This is not required for consumption in the credits scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CycleInstanceId")
        public String cycleInstanceId;

        /**
         * <p>The start time of the current cycle, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1775232000</p>
         */
        @NameInMap("CycleStartTime")
        public Long cycleStartTime;

        /**
         * <p>The remaining quota of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>40.00000000</p>
         */
        @NameInMap("CycleSurplusValue")
        public Double cycleSurplusValue;

        /**
         * <p>The total quota of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00000000</p>
         */
        @NameInMap("CycleTotalValue")
        public Double cycleTotalValue;

        /**
         * <p>The sequential version of the current cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CycleVersion")
        public Long cycleVersion;

        /**
         * <p>The equity type, such as CREDITS, SPN, or resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDITS</p>
         */
        @NameInMap("EquityType")
        public String equityType;

        public static ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList self = new ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleEndTime(Long cycleEndTime) {
            this.cycleEndTime = cycleEndTime;
            return this;
        }
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleInstanceId(String cycleInstanceId) {
            this.cycleInstanceId = cycleInstanceId;
            return this;
        }
        public String getCycleInstanceId() {
            return this.cycleInstanceId;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleStartTime(Long cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleSurplusValue(Double cycleSurplusValue) {
            this.cycleSurplusValue = cycleSurplusValue;
            return this;
        }
        public Double getCycleSurplusValue() {
            return this.cycleSurplusValue;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleTotalValue(Double cycleTotalValue) {
            this.cycleTotalValue = cycleTotalValue;
            return this;
        }
        public Double getCycleTotalValue() {
            return this.cycleTotalValue;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setCycleVersion(Long cycleVersion) {
            this.cycleVersion = cycleVersion;
            return this;
        }
        public Long getCycleVersion() {
            return this.cycleVersion;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList setEquityType(String equityType) {
            this.equityType = equityType;
            return this;
        }
        public String getEquityType() {
            return this.equityType;
        }

    }

    public static class ListSubscriptionSharedPackagesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The currently active equity instances.</p>
         */
        @NameInMap("EquityList")
        public java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList> equityList;

        /**
         * <p>The instance code of the seat.</p>
         * 
         * <strong>example:</strong>
         * <p>subs-1234567</p>
         */
        @NameInMap("InstanceCode")
        public String instanceCode;

        /**
         * <p>The seat status. Valid values:</p>
         * <ul>
         * <li>CREATING: being created.</li>
         * <li>NORMAL: active.</li>
         * <li>LIMIT: restricted due to overdue payment.</li>
         * <li>RELEASE: released upon expiration.</li>
         * <li>STOP: stopped upon expiration.</li>
         * <li>REFUNDED: refunded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSubscriptionSharedPackagesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionSharedPackagesResponseBodyDataItems self = new ListSubscriptionSharedPackagesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItems setEquityList(java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList> equityList) {
            this.equityList = equityList;
            return this;
        }
        public java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItemsEquityList> getEquityList() {
            return this.equityList;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItems setInstanceCode(String instanceCode) {
            this.instanceCode = instanceCode;
            return this;
        }
        public String getInstanceCode() {
            return this.instanceCode;
        }

        public ListSubscriptionSharedPackagesResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListSubscriptionSharedPackagesResponseBodyData extends TeaModel {
        /**
         * <p>The data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItems> items;

        /**
         * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of seats.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListSubscriptionSharedPackagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscriptionSharedPackagesResponseBodyData self = new ListSubscriptionSharedPackagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscriptionSharedPackagesResponseBodyData setItems(java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListSubscriptionSharedPackagesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListSubscriptionSharedPackagesResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSubscriptionSharedPackagesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSubscriptionSharedPackagesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
