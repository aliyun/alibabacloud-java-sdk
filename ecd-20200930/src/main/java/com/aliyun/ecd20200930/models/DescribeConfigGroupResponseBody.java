// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupResponseBody extends TeaModel {
    /**
     * <p>The configuration groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeConfigGroupResponseBodyData> data;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupResponseBody self = new DescribeConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupResponseBody setData(java.util.List<DescribeConfigGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeConfigGroupResponseBodyData> getData() {
        return this.data;
    }

    public DescribeConfigGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConfigGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeConfigGroupResponseBodyData extends TeaModel {
        /**
         * <p>The number of resources that are bound to the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BindCount")
        public Integer bindCount;

        /**
         * <p>The number of bound cloud computers.</p>
         */
        @NameInMap("BindCountMap")
        public java.util.Map<String, Integer> bindCountMap;

        /**
         * <p>The description of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>ScheduledTask</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0cid8v30an12****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE_DESC</p>
         */
        @NameInMap("InnerTimerDesc")
        public String innerTimerDesc;

        /**
         * <strong>example:</strong>
         * <p>INNER_TIMER_10_MINUTES_HIBERNATE_NO_UPDATE</p>
         */
        @NameInMap("InnerTimerName")
        public String innerTimerName;

        @NameInMap("IsBind")
        public Boolean isBind;

        @NameInMap("IsUpdate")
        public Boolean isUpdate;

        /**
         * <p>The name of the configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>ScheduledTask</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The service type of the configuration group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CLOUD_DESKTOP: the cloud computer service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_DESKTOP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The state of the configuration group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE: The configuration group is available.</li>
         * <li>UNAVAILABLE: The configuration group is deleted.</li>
         * <li>DELETING: The configuration group is being deleted.</li>
         * <li>UPDATING: The configuration group is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the configuration group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Timer: the scheduled task type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timer</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeConfigGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigGroupResponseBodyData self = new DescribeConfigGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeConfigGroupResponseBodyData setBindCount(Integer bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Integer getBindCount() {
            return this.bindCount;
        }

        public DescribeConfigGroupResponseBodyData setBindCountMap(java.util.Map<String, Integer> bindCountMap) {
            this.bindCountMap = bindCountMap;
            return this;
        }
        public java.util.Map<String, Integer> getBindCountMap() {
            return this.bindCountMap;
        }

        public DescribeConfigGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeConfigGroupResponseBodyData setInnerTimerDesc(String innerTimerDesc) {
            this.innerTimerDesc = innerTimerDesc;
            return this;
        }
        public String getInnerTimerDesc() {
            return this.innerTimerDesc;
        }

        public DescribeConfigGroupResponseBodyData setInnerTimerName(String innerTimerName) {
            this.innerTimerName = innerTimerName;
            return this;
        }
        public String getInnerTimerName() {
            return this.innerTimerName;
        }

        public DescribeConfigGroupResponseBodyData setIsBind(Boolean isBind) {
            this.isBind = isBind;
            return this;
        }
        public Boolean getIsBind() {
            return this.isBind;
        }

        public DescribeConfigGroupResponseBodyData setIsUpdate(Boolean isUpdate) {
            this.isUpdate = isUpdate;
            return this;
        }
        public Boolean getIsUpdate() {
            return this.isUpdate;
        }

        public DescribeConfigGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigGroupResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeConfigGroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeConfigGroupResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
