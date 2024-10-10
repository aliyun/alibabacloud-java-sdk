// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeRoutinePlansResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanInfo")
    public java.util.List<ListEdgeRoutinePlansResponseBodyPlanInfo> planInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
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
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("BillingMode")
        public String billingMode;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ErRoutineCodeVersionQuota")
        public String erRoutineCodeVersionQuota;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ErRoutineQuota")
        public String erRoutineQuota;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ErRoutineRouteSiteCountQuota")
        public String erRoutineRouteSiteCountQuota;

        /**
         * <strong>example:</strong>
         * <p>er_free</p>
         */
        @NameInMap("PaymentMethod")
        public String paymentMethod;

        /**
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
