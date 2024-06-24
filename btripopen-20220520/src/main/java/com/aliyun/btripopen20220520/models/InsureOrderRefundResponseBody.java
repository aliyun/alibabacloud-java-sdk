// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderRefundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsureOrderRefundResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>2103ad3116824902540648188de7ac</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210e846c16726306481681232d441f</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsureOrderRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderRefundResponseBody self = new InsureOrderRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureOrderRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureOrderRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureOrderRefundResponseBody setModule(InsureOrderRefundResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsureOrderRefundResponseBodyModule getModule() {
        return this.module;
    }

    public InsureOrderRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureOrderRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureOrderRefundResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsureOrderRefundResponseBodyModuleInsRefundList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>po102000399221</p>
         */
        @NameInMap("policy_refund_no")
        public String policyRefundNo;

        /**
         * <strong>example:</strong>
         * <p>REFUND_SUCCESS</p>
         */
        @NameInMap("refund_status")
        public String refundStatus;

        /**
         * <strong>example:</strong>
         * <p>1230012499921</p>
         */
        @NameInMap("sub_ins_order_id")
        public String subInsOrderId;

        public static InsureOrderRefundResponseBodyModuleInsRefundList build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderRefundResponseBodyModuleInsRefundList self = new InsureOrderRefundResponseBodyModuleInsRefundList();
            return TeaModel.build(map, self);
        }

        public InsureOrderRefundResponseBodyModuleInsRefundList setPolicyRefundNo(String policyRefundNo) {
            this.policyRefundNo = policyRefundNo;
            return this;
        }
        public String getPolicyRefundNo() {
            return this.policyRefundNo;
        }

        public InsureOrderRefundResponseBodyModuleInsRefundList setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public InsureOrderRefundResponseBodyModuleInsRefundList setSubInsOrderId(String subInsOrderId) {
            this.subInsOrderId = subInsOrderId;
            return this;
        }
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

    }

    public static class InsureOrderRefundResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>118526587</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>1423041410342678003</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("ins_refund_list")
        public java.util.List<InsureOrderRefundResponseBodyModuleInsRefundList> insRefundList;

        /**
         * <strong>example:</strong>
         * <p>1423041410342678022</p>
         */
        @NameInMap("out_apply_id")
        public String outApplyId;

        public static InsureOrderRefundResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderRefundResponseBodyModule self = new InsureOrderRefundResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsureOrderRefundResponseBodyModule setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public InsureOrderRefundResponseBodyModule setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public InsureOrderRefundResponseBodyModule setInsRefundList(java.util.List<InsureOrderRefundResponseBodyModuleInsRefundList> insRefundList) {
            this.insRefundList = insRefundList;
            return this;
        }
        public java.util.List<InsureOrderRefundResponseBodyModuleInsRefundList> getInsRefundList() {
            return this.insRefundList;
        }

        public InsureOrderRefundResponseBodyModule setOutApplyId(String outApplyId) {
            this.outApplyId = outApplyId;
            return this;
        }
        public String getOutApplyId() {
            return this.outApplyId;
        }

    }

}
