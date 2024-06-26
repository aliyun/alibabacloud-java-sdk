// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsureOrderCreateResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C6055EA5-C566-511D-9FC4-5E4D45182711</p>
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
     * <p>210f079916782711059363565d6be1</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsureOrderCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderCreateResponseBody self = new InsureOrderCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureOrderCreateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureOrderCreateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureOrderCreateResponseBody setModule(InsureOrderCreateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsureOrderCreateResponseBodyModule getModule() {
        return this.module;
    }

    public InsureOrderCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureOrderCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureOrderCreateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsureOrderCreateResponseBodyModuleInsureOrderDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1992939412431231</p>
         */
        @NameInMap("out_sub_ins_order_id")
        public String outSubInsOrderId;

        /**
         * <strong>example:</strong>
         * <p>121234444</p>
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
         * <p>1022196500378001</p>
         */
        @NameInMap("sub_ins_order_id")
        public String subInsOrderId;

        public static InsureOrderCreateResponseBodyModuleInsureOrderDetailList build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateResponseBodyModuleInsureOrderDetailList self = new InsureOrderCreateResponseBodyModuleInsureOrderDetailList();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateResponseBodyModuleInsureOrderDetailList setOutSubInsOrderId(String outSubInsOrderId) {
            this.outSubInsOrderId = outSubInsOrderId;
            return this;
        }
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        public InsureOrderCreateResponseBodyModuleInsureOrderDetailList setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
            return this;
        }
        public String getPolicyNo() {
            return this.policyNo;
        }

        public InsureOrderCreateResponseBodyModuleInsureOrderDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InsureOrderCreateResponseBodyModuleInsureOrderDetailList setSubInsOrderId(String subInsOrderId) {
            this.subInsOrderId = subInsOrderId;
            return this;
        }
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

    }

    public static class InsureOrderCreateResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("copies")
        public Integer copies;

        @NameInMap("insure_order_detail_list")
        public java.util.List<InsureOrderCreateResponseBodyModuleInsureOrderDetailList> insureOrderDetailList;

        /**
         * <strong>example:</strong>
         * <p>1021000196500370001</p>
         */
        @NameInMap("insure_order_id")
        public String insureOrderId;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("premium")
        public Long premium;

        public static InsureOrderCreateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateResponseBodyModule self = new InsureOrderCreateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateResponseBodyModule setCopies(Integer copies) {
            this.copies = copies;
            return this;
        }
        public Integer getCopies() {
            return this.copies;
        }

        public InsureOrderCreateResponseBodyModule setInsureOrderDetailList(java.util.List<InsureOrderCreateResponseBodyModuleInsureOrderDetailList> insureOrderDetailList) {
            this.insureOrderDetailList = insureOrderDetailList;
            return this;
        }
        public java.util.List<InsureOrderCreateResponseBodyModuleInsureOrderDetailList> getInsureOrderDetailList() {
            return this.insureOrderDetailList;
        }

        public InsureOrderCreateResponseBodyModule setInsureOrderId(String insureOrderId) {
            this.insureOrderId = insureOrderId;
            return this;
        }
        public String getInsureOrderId() {
            return this.insureOrderId;
        }

        public InsureOrderCreateResponseBodyModule setPremium(Long premium) {
            this.premium = premium;
            return this;
        }
        public Long getPremium() {
            return this.premium;
        }

    }

}
