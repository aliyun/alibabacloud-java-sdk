// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstanceCategoriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReservedInstanceCategories")
    public ReservedInstanceCategories reservedInstanceCategories;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReservedInstanceCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstanceCategoriesResponseBody self = new DescribeReservedInstanceCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstanceCategoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstanceCategoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReservedInstanceCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstanceCategoriesResponseBody setReservedInstanceCategories(ReservedInstanceCategories reservedInstanceCategories) {
        this.reservedInstanceCategories = reservedInstanceCategories;
        return this;
    }
    public ReservedInstanceCategories getReservedInstanceCategories() {
        return this.reservedInstanceCategories;
    }

    public DescribeReservedInstanceCategoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ReservedInstanceCategory extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ReservedInstanceCategory build(java.util.Map<String, ?> map) throws Exception {
            ReservedInstanceCategory self = new ReservedInstanceCategory();
            return TeaModel.build(map, self);
        }

        public ReservedInstanceCategory setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ReservedInstanceCategory setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public ReservedInstanceCategory setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ReservedInstanceCategory setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ReservedInstanceCategory setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ReservedInstanceCategory setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ReservedInstanceCategory setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ReservedInstanceCategories extends TeaModel {
        @NameInMap("ReservedInstanceCategory")
        public java.util.List<ReservedInstanceCategory> reservedInstanceCategory;

        public static ReservedInstanceCategories build(java.util.Map<String, ?> map) throws Exception {
            ReservedInstanceCategories self = new ReservedInstanceCategories();
            return TeaModel.build(map, self);
        }

        public ReservedInstanceCategories setReservedInstanceCategory(java.util.List<ReservedInstanceCategory> reservedInstanceCategory) {
            this.reservedInstanceCategory = reservedInstanceCategory;
            return this;
        }
        public java.util.List<ReservedInstanceCategory> getReservedInstanceCategory() {
            return this.reservedInstanceCategory;
        }

    }

}
