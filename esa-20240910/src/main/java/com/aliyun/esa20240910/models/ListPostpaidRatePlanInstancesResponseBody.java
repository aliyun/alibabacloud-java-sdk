// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesResponseBody extends TeaModel {
    /**
     * <p>A list of instances.</p>
     */
    @NameInMap("InstanceInfo")
    public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfo> instanceInfo;

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
     * <p>The request ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The ID of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The name of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The status of the site. Valid values:</p>
         * <ul>
         * <li><p><code>pending</code>: The site is awaiting configuration.</p>
         * </li>
         * <li><p><code>active</code>: The site is active.</p>
         * </li>
         * <li><p><code>offline</code>: The site is offline.</p>
         * </li>
         * <li><p><code>moved</code>: The site has been replaced.</p>
         * </li>
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
         * <p>The billing method. Valid value:</p>
         * <ul>
         * <li><code>dps_month95</code>: Monthly 95th percentile.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBSCRIBE</p>
         */
        @NameInMap("BillingMethod")
        public String billingMethod;

        /**
         * <p>The billing mode. Valid value:</p>
         * <ul>
         * <li><code>POSTPAY</code>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <p>The coverage area of the instance. Only sites within this area can be bound to the instance. If multiple areas are supported, they are separated by a comma (<code>,</code>). Valid values:</p>
         * <ul>
         * <li><p><code>domestic</code>: Chinese mainland.</p>
         * </li>
         * <li><p><code>overseas</code>: Regions outside the Chinese mainland.</p>
         * </li>
         * <li><p><code>global</code>: Global (including the Chinese mainland).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Coverages")
        public String coverages;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time of a scheduled configuration change.</p>
         * 
         * <strong>example:</strong>
         * <p>YYYY-MM-DDThh:mm:ssZ</p>
         */
        @NameInMap("ExpectedUpdateTime")
        public String expectedUpdateTime;

        /**
         * <p>The ID of the instance.</p>
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
         * <p>测试套餐</p>
         */
        @NameInMap("PlanNameCn")
        public String planNameCn;

        /**
         * <p>The type of the plan. Valid values:</p>
         * <ul>
         * <li><p><code>normal</code>: Normal plan.</p>
         * </li>
         * <li><p><code>enterprise</code>: Enterprise plan.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The maximum number of sites that can be bound to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        /**
         * <p>A list of sites bound to the instance.</p>
         */
        @NameInMap("Sites")
        public java.util.List<ListPostpaidRatePlanInstancesResponseBodyInstanceInfoSites> sites;

        /**
         * <p>The status of the instance.</p>
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
