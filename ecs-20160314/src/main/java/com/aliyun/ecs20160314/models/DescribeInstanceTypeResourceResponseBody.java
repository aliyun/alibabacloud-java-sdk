// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeResourceResponseBody extends TeaModel {
    @NameInMap("InstanceTypeResources")
    public InstanceTypeResources instanceTypeResources;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceTypeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeResourceResponseBody self = new DescribeInstanceTypeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeResourceResponseBody setInstanceTypeResources(InstanceTypeResources instanceTypeResources) {
        this.instanceTypeResources = instanceTypeResources;
        return this;
    }
    public InstanceTypeResources getInstanceTypeResources() {
        return this.instanceTypeResources;
    }

    public DescribeInstanceTypeResourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceTypeResourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceTypeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTypeResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class StockHealth extends TeaModel {
        @NameInMap("AdequacyScore")
        public Integer adequacyScore;

        @NameInMap("HealthScore")
        public Integer healthScore;

        @NameInMap("HotScore")
        public Integer hotScore;

        @NameInMap("SupplyScore")
        public Integer supplyScore;

        public static StockHealth build(java.util.Map<String, ?> map) throws Exception {
            StockHealth self = new StockHealth();
            return TeaModel.build(map, self);
        }

        public StockHealth setAdequacyScore(Integer adequacyScore) {
            this.adequacyScore = adequacyScore;
            return this;
        }
        public Integer getAdequacyScore() {
            return this.adequacyScore;
        }

        public StockHealth setHealthScore(Integer healthScore) {
            this.healthScore = healthScore;
            return this;
        }
        public Integer getHealthScore() {
            return this.healthScore;
        }

        public StockHealth setHotScore(Integer hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Integer getHotScore() {
            return this.hotScore;
        }

        public StockHealth setSupplyScore(Integer supplyScore) {
            this.supplyScore = supplyScore;
            return this;
        }
        public Integer getSupplyScore() {
            return this.supplyScore;
        }

    }

    public static class InstanceTypeResource extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SearchType")
        public String searchType;

        @NameInMap("StockHealth")
        public StockHealth stockHealth;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        @NameInMap("ZoneId")
        public String zoneId;

        public static InstanceTypeResource build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeResource self = new InstanceTypeResource();
            return TeaModel.build(map, self);
        }

        public InstanceTypeResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstanceTypeResource setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public InstanceTypeResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public InstanceTypeResource setSearchType(String searchType) {
            this.searchType = searchType;
            return this;
        }
        public String getSearchType() {
            return this.searchType;
        }

        public InstanceTypeResource setStockHealth(StockHealth stockHealth) {
            this.stockHealth = stockHealth;
            return this;
        }
        public StockHealth getStockHealth() {
            return this.stockHealth;
        }

        public InstanceTypeResource setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public InstanceTypeResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class InstanceTypeResources extends TeaModel {
        @NameInMap("InstanceTypeResource")
        public java.util.List<InstanceTypeResource> instanceTypeResource;

        public static InstanceTypeResources build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeResources self = new InstanceTypeResources();
            return TeaModel.build(map, self);
        }

        public InstanceTypeResources setInstanceTypeResource(java.util.List<InstanceTypeResource> instanceTypeResource) {
            this.instanceTypeResource = instanceTypeResource;
            return this;
        }
        public java.util.List<InstanceTypeResource> getInstanceTypeResource() {
            return this.instanceTypeResource;
        }

    }

}
