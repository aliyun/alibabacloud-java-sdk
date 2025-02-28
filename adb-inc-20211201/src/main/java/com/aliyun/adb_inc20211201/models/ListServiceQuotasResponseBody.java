// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ListServiceQuotasResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Quotas")
    public java.util.List<ListServiceQuotasResponseBodyQuotas> quotas;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQuotasResponseBody self = new ListServiceQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceQuotasResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceQuotasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceQuotasResponseBody setQuotas(java.util.List<ListServiceQuotasResponseBodyQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<ListServiceQuotasResponseBodyQuotas> getQuotas() {
        return this.quotas;
    }

    public ListServiceQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceQuotasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceQuotasResponseBodyQuotas extends TeaModel {
        @NameInMap("Adjustable")
        public Boolean adjustable;

        @NameInMap("Applicable")
        public String applicable;

        @NameInMap("ApplicableType")
        public String applicableType;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("QuotaActionCode")
        public String quotaActionCode;

        @NameInMap("TotalQuota")
        public Double totalQuota;

        @NameInMap("TotalUsage")
        public Double totalUsage;

        @NameInMap("UnadjustableDetail")
        public String unadjustableDetail;

        @NameInMap("Unit")
        public String unit;

        public static ListServiceQuotasResponseBodyQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListServiceQuotasResponseBodyQuotas self = new ListServiceQuotasResponseBodyQuotas();
            return TeaModel.build(map, self);
        }

        public ListServiceQuotasResponseBodyQuotas setAdjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }
        public Boolean getAdjustable() {
            return this.adjustable;
        }

        public ListServiceQuotasResponseBodyQuotas setApplicable(String applicable) {
            this.applicable = applicable;
            return this;
        }
        public String getApplicable() {
            return this.applicable;
        }

        public ListServiceQuotasResponseBodyQuotas setApplicableType(String applicableType) {
            this.applicableType = applicableType;
            return this;
        }
        public String getApplicableType() {
            return this.applicableType;
        }

        public ListServiceQuotasResponseBodyQuotas setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public ListServiceQuotasResponseBodyQuotas setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListServiceQuotasResponseBodyQuotas setQuotaActionCode(String quotaActionCode) {
            this.quotaActionCode = quotaActionCode;
            return this;
        }
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        public ListServiceQuotasResponseBodyQuotas setTotalQuota(Double totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Double getTotalQuota() {
            return this.totalQuota;
        }

        public ListServiceQuotasResponseBodyQuotas setTotalUsage(Double totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Double getTotalUsage() {
            return this.totalUsage;
        }

        public ListServiceQuotasResponseBodyQuotas setUnadjustableDetail(String unadjustableDetail) {
            this.unadjustableDetail = unadjustableDetail;
            return this;
        }
        public String getUnadjustableDetail() {
            return this.unadjustableDetail;
        }

        public ListServiceQuotasResponseBodyQuotas setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
