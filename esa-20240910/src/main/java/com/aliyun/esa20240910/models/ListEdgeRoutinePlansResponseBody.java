// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeRoutinePlansResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plans.</p>
     */
    @NameInMap("PlanInfo")
    public java.util.List<ListEdgeRoutinePlansResponseBodyPlanInfo> planInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListEdgeRoutinePlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeRoutinePlansResponseBody self = new ListEdgeRoutinePlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeRoutinePlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeRoutinePlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeRoutinePlansResponseBody setPlanInfo(java.util.List<ListEdgeRoutinePlansResponseBodyPlanInfo> planInfo) {
        this.planInfo = planInfo;
        return this;
    }
    public java.util.List<ListEdgeRoutinePlansResponseBodyPlanInfo> getPlanInfo() {
        return this.planInfo;
    }

    public ListEdgeRoutinePlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeRoutinePlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListEdgeRoutinePlansResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListEdgeRoutinePlansResponseBodyPlanInfo extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription.</li>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <p>The maximum number of versions that each routine supports.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ErRoutineCodeVersionQuota")
        public String erRoutineCodeVersionQuota;

        /**
         * <p>The maximum of routines that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ErRoutineQuota")
        public String erRoutineQuota;

        /**
         * <p>The maximum number of websites with which each routine can be associated.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ErRoutineRouteSiteCountQuota")
        public String erRoutineRouteSiteCountQuota;

        /**
         * <p>The payment method. Valid values:</p>
         * <ul>
         * <li>er_free</li>
         * <li>er_pay</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>er_free</p>
         */
        @NameInMap("PaymentMethod")
        public String paymentMethod;

        /**
         * <p>The plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_plan</p>
         */
        @NameInMap("PlanName")
        public String planName;

        public static ListEdgeRoutinePlansResponseBodyPlanInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeRoutinePlansResponseBodyPlanInfo self = new ListEdgeRoutinePlansResponseBodyPlanInfo();
            return TeaModel.build(map, self);
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setBillingMode(String billingMode) {
            this.billingMode = billingMode;
            return this;
        }
        public String getBillingMode() {
            return this.billingMode;
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setErRoutineCodeVersionQuota(String erRoutineCodeVersionQuota) {
            this.erRoutineCodeVersionQuota = erRoutineCodeVersionQuota;
            return this;
        }
        public String getErRoutineCodeVersionQuota() {
            return this.erRoutineCodeVersionQuota;
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setErRoutineQuota(String erRoutineQuota) {
            this.erRoutineQuota = erRoutineQuota;
            return this;
        }
        public String getErRoutineQuota() {
            return this.erRoutineQuota;
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setErRoutineRouteSiteCountQuota(String erRoutineRouteSiteCountQuota) {
            this.erRoutineRouteSiteCountQuota = erRoutineRouteSiteCountQuota;
            return this;
        }
        public String getErRoutineRouteSiteCountQuota() {
            return this.erRoutineRouteSiteCountQuota;
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public ListEdgeRoutinePlansResponseBodyPlanInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

    }

}
