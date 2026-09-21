// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUserResourcePackageResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of ResourcePackageInfo objects.</p>
     */
    @NameInMap("ResourcePackageInfos")
    public java.util.List<DescribeUserResourcePackageResponseBodyResourcePackageInfos> resourcePackageInfos;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUserResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcePackageResponseBody self = new DescribeUserResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcePackageResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserResourcePackageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserResourcePackageResponseBody setResourcePackageInfos(java.util.List<DescribeUserResourcePackageResponseBodyResourcePackageInfos> resourcePackageInfos) {
        this.resourcePackageInfos = resourcePackageInfos;
        return this;
    }
    public java.util.List<DescribeUserResourcePackageResponseBodyResourcePackageInfos> getResourcePackageInfos() {
        return this.resourcePackageInfos;
    }

    public DescribeUserResourcePackageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUserResourcePackageResponseBodyResourcePackageInfos extends TeaModel {
        /**
         * <p>The commodity code of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdnpaybag</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The current remaining capacity of the instance.</p>
         * <ul>
         * <li><p>Unit for traffic plans: Byte.</p>
         * </li>
         * <li><p>Unit for request plans: count.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>53661095687</p>
         */
        @NameInMap("CurrCapacity")
        public String currCapacity;

        /**
         * <p>The base unit of the current remaining capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Byte</p>
         */
        @NameInMap("CurrCapacityBaseUnit")
        public String currCapacityBaseUnit;

        /**
         * <p>The display unit of the current remaining capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("CurrCapacityShowUnit")
        public String currCapacityShowUnit;

        /**
         * <p>The display value of the current remaining capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>49.975789</p>
         */
        @NameInMap("CurrCapacityShowValue")
        public String currCapacityShowValue;

        /**
         * <p>The name of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Transfer Plan in Asia Pacific 1</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The expiration time in UTC. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-02T15:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The total capacity of the resource plan.</p>
         * <ul>
         * <li><p>Unit for traffic plans: Byte.</p>
         * </li>
         * <li><p>Unit for request plans: count.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        @NameInMap("InitCapacity")
        public String initCapacity;

        /**
         * <p>The base unit of the total capacity of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Byte</p>
         */
        @NameInMap("InitCapacityBaseUnit")
        public String initCapacityBaseUnit;

        /**
         * <p>The display unit of the total capacity of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("InitCapacityShowUnit")
        public String initCapacityShowUnit;

        /**
         * <p>The display value of the total capacity of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>100.000000</p>
         */
        @NameInMap("InitCapacityShowValue")
        public String initCapacityShowValue;

        /**
         * <p>The instance ID of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>_ResourcePack-cn-</strong></strong></p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The effective period in UTC. Format: YYYY-MM-DDTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-20T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_dcdnpaybag_deadlineAcc_****</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static DescribeUserResourcePackageResponseBodyResourcePackageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcePackageResponseBodyResourcePackageInfos self = new DescribeUserResourcePackageResponseBodyResourcePackageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setCurrCapacity(String currCapacity) {
            this.currCapacity = currCapacity;
            return this;
        }
        public String getCurrCapacity() {
            return this.currCapacity;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setCurrCapacityBaseUnit(String currCapacityBaseUnit) {
            this.currCapacityBaseUnit = currCapacityBaseUnit;
            return this;
        }
        public String getCurrCapacityBaseUnit() {
            return this.currCapacityBaseUnit;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setCurrCapacityShowUnit(String currCapacityShowUnit) {
            this.currCapacityShowUnit = currCapacityShowUnit;
            return this;
        }
        public String getCurrCapacityShowUnit() {
            return this.currCapacityShowUnit;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setCurrCapacityShowValue(String currCapacityShowValue) {
            this.currCapacityShowValue = currCapacityShowValue;
            return this;
        }
        public String getCurrCapacityShowValue() {
            return this.currCapacityShowValue;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setInitCapacity(String initCapacity) {
            this.initCapacity = initCapacity;
            return this;
        }
        public String getInitCapacity() {
            return this.initCapacity;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setInitCapacityBaseUnit(String initCapacityBaseUnit) {
            this.initCapacityBaseUnit = initCapacityBaseUnit;
            return this;
        }
        public String getInitCapacityBaseUnit() {
            return this.initCapacityBaseUnit;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setInitCapacityShowUnit(String initCapacityShowUnit) {
            this.initCapacityShowUnit = initCapacityShowUnit;
            return this;
        }
        public String getInitCapacityShowUnit() {
            return this.initCapacityShowUnit;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setInitCapacityShowValue(String initCapacityShowValue) {
            this.initCapacityShowValue = initCapacityShowValue;
            return this;
        }
        public String getInitCapacityShowValue() {
            return this.initCapacityShowValue;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUserResourcePackageResponseBodyResourcePackageInfos setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
