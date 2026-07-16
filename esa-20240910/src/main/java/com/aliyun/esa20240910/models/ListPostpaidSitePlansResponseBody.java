// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidSitePlansResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: 20. Maximum value: 500. Valid values: any integer from 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pay-as-you-go plan details.</p>
     */
    @NameInMap("PlanInfo")
    public java.util.List<ListPostpaidSitePlansResponseBodyPlanInfo> planInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8CD541DB-CD83-5D0C-BE94-21B794074249</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListPostpaidSitePlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPostpaidSitePlansResponseBody self = new ListPostpaidSitePlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPostpaidSitePlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPostpaidSitePlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPostpaidSitePlansResponseBody setPlanInfo(java.util.List<ListPostpaidSitePlansResponseBodyPlanInfo> planInfo) {
        this.planInfo = planInfo;
        return this;
    }
    public java.util.List<ListPostpaidSitePlansResponseBodyPlanInfo> getPlanInfo() {
        return this.planInfo;
    }

    public ListPostpaidSitePlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPostpaidSitePlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPostpaidSitePlansResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListPostpaidSitePlansResponseBodyPlanInfo extends TeaModel {
        /**
         * <p>The billable methods of the plan. Valid values:</p>
         * <ul>
         * <li>dps_month95: monthly 95th percentile billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dps_month95</p>
         */
        @NameInMap("BillingMethod")
        public String billingMethod;

        /**
         * <p>The payment type. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription.</li>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <p>The acceleration regions to which sites can be added under the plan. Multiple values are separated by commas (,). Valid values:</p>
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
         * <p>The name of the plan, which serves as a unique identifier in English.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The plan description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试版套餐</p>
         */
        @NameInMap("PlanNameCn")
        public String planNameCn;

        /**
         * <p>The plan type of the plan instance. Valid values:</p>
         * <ul>
         * <li>normal: fixed edition plan.</li>
         * <li>enterprise: enterprise edition plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The sale status of the plan. Valid values for enterprise edition plans:</p>
         * <ul>
         * <li>saled: sold.</li>
         * <li>upgrading: specification change in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>saled</p>
         */
        @NameInMap("SaleStatus")
        public String saleStatus;

        /**
         * <p>The site quantity quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SiteQuota")
        public String siteQuota;

        public static ListPostpaidSitePlansResponseBodyPlanInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPostpaidSitePlansResponseBodyPlanInfo self = new ListPostpaidSitePlansResponseBodyPlanInfo();
            return TeaModel.build(map, self);
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setCoverages(String coverages) {
            this.coverages = coverages;
            return this;
        }
        public String getCoverages() {
            return this.coverages;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setPlanNameCn(String planNameCn) {
            this.planNameCn = planNameCn;
            return this;
        }
        public String getPlanNameCn() {
            return this.planNameCn;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setSaleStatus(String saleStatus) {
            this.saleStatus = saleStatus;
            return this;
        }
        public String getSaleStatus() {
            return this.saleStatus;
        }

        public ListPostpaidSitePlansResponseBodyPlanInfo setSiteQuota(String siteQuota) {
            this.siteQuota = siteQuota;
            return this;
        }
        public String getSiteQuota() {
            return this.siteQuota;
        }

    }

}
