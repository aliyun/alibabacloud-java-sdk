// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListPostpaidRatePlanInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPostpaidRatePlanInstancesResponseBody self = new ListPostpaidRatePlanInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPostpaidRatePlanInstancesResponseBody setInstanceInfo(java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
    }

    public ListPostpaidRatePlanInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPostpaidRatePlanInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPostpaidRatePlanInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPostpaidRatePlanInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPostpaidRatePlanInstancesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites extends TeaModel {
        @NameInMap("SiteId")
        public Long siteId;

        @NameInMap("SiteName")
        public String siteName;

        @NameInMap("SiteStatus")
        public String siteStatus;

        public static ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites build(java.util.Map<String, ?> map) throws Exception {
            ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites self = new ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites();
            return TeaModel.build(map, self);
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites setSiteStatus(String siteStatus) {
            this.siteStatus = siteStatus;
            return this;
        }
        public String getSiteStatus() {
            return this.siteStatus;
        }

    }

    public static class ListPostpaidRatePlanInstancesResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("BillingMethod")
        public String billingMethod;

        @NameInMap("BillingMode")
        public String billingMode;

        @NameInMap("Coverages")
        public String coverages;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpectedUpdateTime")
        public String expectedUpdateTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanNameCn")
        public String planNameCn;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("SiteQuota")
        public String siteQuota;

        @NameInMap("Sites")
        public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        @NameInMap("Status")
        public String status;

        public static ListPostpaidRatePlanInstancesResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPostpaidRatePlanInstancesResponseBodyInstanceInfo self = new ListPostpaidRatePlanInstancesResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setCoverages(String coverages) {
            this.coverages = coverages;
            return this;
        }
        public String getCoverages() {
            return this.coverages;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setExpectedUpdateTime(String expectedUpdateTime) {
            this.expectedUpdateTime = expectedUpdateTime;
            return this;
        }
        public String getExpectedUpdateTime() {
            return this.expectedUpdateTime;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setPlanNameCn(String planNameCn) {
            this.planNameCn = planNameCn;
            return this;
        }
        public String getPlanNameCn() {
            return this.planNameCn;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setSiteQuota(String siteQuota) {
            this.siteQuota = siteQuota;
            return this;
        }
        public String getSiteQuota() {
            return this.siteQuota;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setSites(java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites> sites) {
            this.sites = sites;
            return this;
        }
        public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites> getSites() {
            return this.sites;
        }

        public ListPostpaidRatePlanInstancesResponseBodyInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
