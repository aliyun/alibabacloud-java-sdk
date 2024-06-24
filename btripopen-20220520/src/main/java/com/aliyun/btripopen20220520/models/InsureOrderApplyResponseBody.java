// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderApplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsureOrderApplyResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>210e800316781571635951548d1e9d</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsureOrderApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderApplyResponseBody self = new InsureOrderApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureOrderApplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureOrderApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureOrderApplyResponseBody setModule(InsureOrderApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsureOrderApplyResponseBodyModule getModule() {
        return this.module;
    }

    public InsureOrderApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureOrderApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureOrderApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsureOrderApplyResponseBodyModuleInsOrderPolicyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1022196500378006</p>
         */
        @NameInMap("out_sub_ins_order_id")
        public String outSubInsOrderId;

        /**
         * <strong>example:</strong>
         * <p>po10002300201</p>
         */
        @NameInMap("policy_no")
        public String policyNo;

        /**
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1022196500378003</p>
         */
        @NameInMap("sub_ins_order_id")
        public String subInsOrderId;

        public static InsureOrderApplyResponseBodyModuleInsOrderPolicyList build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderApplyResponseBodyModuleInsOrderPolicyList self = new InsureOrderApplyResponseBodyModuleInsOrderPolicyList();
            return TeaModel.build(map, self);
        }

        public InsureOrderApplyResponseBodyModuleInsOrderPolicyList setOutSubInsOrderId(String outSubInsOrderId) {
            this.outSubInsOrderId = outSubInsOrderId;
            return this;
        }
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        public InsureOrderApplyResponseBodyModuleInsOrderPolicyList setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
            return this;
        }
        public String getPolicyNo() {
            return this.policyNo;
        }

        public InsureOrderApplyResponseBodyModuleInsOrderPolicyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InsureOrderApplyResponseBodyModuleInsOrderPolicyList setSubInsOrderId(String subInsOrderId) {
            this.subInsOrderId = subInsOrderId;
            return this;
        }
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

    }

    public static class InsureOrderApplyResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1021000196500370003</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("ins_order_policy_list")
        public java.util.List<InsureOrderApplyResponseBodyModuleInsOrderPolicyList> insOrderPolicyList;

        public static InsureOrderApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderApplyResponseBodyModule self = new InsureOrderApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsureOrderApplyResponseBodyModule setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public InsureOrderApplyResponseBodyModule setInsOrderPolicyList(java.util.List<InsureOrderApplyResponseBodyModuleInsOrderPolicyList> insOrderPolicyList) {
            this.insOrderPolicyList = insOrderPolicyList;
            return this;
        }
        public java.util.List<InsureOrderApplyResponseBodyModuleInsOrderPolicyList> getInsOrderPolicyList() {
            return this.insOrderPolicyList;
        }

    }

}
