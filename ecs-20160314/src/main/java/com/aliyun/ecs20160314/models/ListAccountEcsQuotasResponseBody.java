// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ListAccountEcsQuotasResponseBody extends TeaModel {
    @NameInMap("EcsQuotas")
    public EcsQuotas ecsQuotas;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountEcsQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountEcsQuotasResponseBody self = new ListAccountEcsQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountEcsQuotasResponseBody setEcsQuotas(EcsQuotas ecsQuotas) {
        this.ecsQuotas = ecsQuotas;
        return this;
    }
    public EcsQuotas getEcsQuotas() {
        return this.ecsQuotas;
    }

    public ListAccountEcsQuotasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountEcsQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EcsQuota extends TeaModel {
        @NameInMap("ApplicationStatus")
        public String applicationStatus;

        @NameInMap("BaseQuota")
        public Long baseQuota;

        @NameInMap("BaseQuotaUsage")
        public Long baseQuotaUsage;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("QuotaResourceName")
        public String quotaResourceName;

        @NameInMap("QuotaResourceType")
        public String quotaResourceType;

        @NameInMap("QuotaUnit")
        public String quotaUnit;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservedQuota")
        public Long reservedQuota;

        @NameInMap("ReservedQuotaUsage")
        public Long reservedQuotaUsage;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        @NameInMap("TotalQuotaUsage")
        public Long totalQuotaUsage;

        @NameInMap("ZoneId")
        public String zoneId;

        public static EcsQuota build(java.util.Map<String, ?> map) throws Exception {
            EcsQuota self = new EcsQuota();
            return TeaModel.build(map, self);
        }

        public EcsQuota setApplicationStatus(String applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        public EcsQuota setBaseQuota(Long baseQuota) {
            this.baseQuota = baseQuota;
            return this;
        }
        public Long getBaseQuota() {
            return this.baseQuota;
        }

        public EcsQuota setBaseQuotaUsage(Long baseQuotaUsage) {
            this.baseQuotaUsage = baseQuotaUsage;
            return this;
        }
        public Long getBaseQuotaUsage() {
            return this.baseQuotaUsage;
        }

        public EcsQuota setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public EcsQuota setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public EcsQuota setQuotaResourceName(String quotaResourceName) {
            this.quotaResourceName = quotaResourceName;
            return this;
        }
        public String getQuotaResourceName() {
            return this.quotaResourceName;
        }

        public EcsQuota setQuotaResourceType(String quotaResourceType) {
            this.quotaResourceType = quotaResourceType;
            return this;
        }
        public String getQuotaResourceType() {
            return this.quotaResourceType;
        }

        public EcsQuota setQuotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        public EcsQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public EcsQuota setReservedQuota(Long reservedQuota) {
            this.reservedQuota = reservedQuota;
            return this;
        }
        public Long getReservedQuota() {
            return this.reservedQuota;
        }

        public EcsQuota setReservedQuotaUsage(Long reservedQuotaUsage) {
            this.reservedQuotaUsage = reservedQuotaUsage;
            return this;
        }
        public Long getReservedQuotaUsage() {
            return this.reservedQuotaUsage;
        }

        public EcsQuota setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public EcsQuota setTotalQuotaUsage(Long totalQuotaUsage) {
            this.totalQuotaUsage = totalQuotaUsage;
            return this;
        }
        public Long getTotalQuotaUsage() {
            return this.totalQuotaUsage;
        }

        public EcsQuota setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class EcsQuotas extends TeaModel {
        @NameInMap("EcsQuota")
        public java.util.List<EcsQuota> ecsQuota;

        public static EcsQuotas build(java.util.Map<String, ?> map) throws Exception {
            EcsQuotas self = new EcsQuotas();
            return TeaModel.build(map, self);
        }

        public EcsQuotas setEcsQuota(java.util.List<EcsQuota> ecsQuota) {
            this.ecsQuota = ecsQuota;
            return this;
        }
        public java.util.List<EcsQuota> getEcsQuota() {
            return this.ecsQuota;
        }

    }

}
