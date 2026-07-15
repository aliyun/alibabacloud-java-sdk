// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instance information.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

    /**
     * <p>The current page number, which is the same as the PageNumber request parameter.</p>
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
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The site status. Valid values:</p>
         * <ul>
         * <li>pending: The site is pending configuration.</li>
         * <li>active: The site is activated.</li>
         * <li>offline: The site is offline.</li>
         * <li>moved: The site has been replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
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
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>dps_month95: Monthly 95th Percentile.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBSCRIBE</p>
         */
        @NameInMap("BillingMethod")
        public String billingMethod;

        /**
         * <p>The billing mode. Valid values:</p>
         * <ul>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <p>The acceleration regions to which sites can be associated with this instance. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>domestic: the Chinese mainland.</li>
         * <li>overseas: global (excluding the Chinese mainland).</li>
         * <li>global: global (including the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverages")
        public String coverages;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The scheduled specification change time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-19T11:15:20Z</p>
         */
        @NameInMap("ExpectedUpdateTime")
        public String expectedUpdateTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The plan name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The plan name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>test-plan</p>
         */
        @NameInMap("PlanNameCn")
        public String planNameCn;

        /**
         * <p>The plan type of the instance. Valid values:</p>
         * <ul>
         * <li>normal: Fixed edition plan.</li>
         * <li>enterprise: Enterprise edition plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The site quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        /**
         * <p>The list of sites.</p>
         */
        @NameInMap("Sites")
        public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
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
