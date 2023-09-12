// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class QueryBenefitGrantResultResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>123</p>
     */
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryBenefitGrantResultResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBenefitGrantResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefitGrantResultResponseBody self = new QueryBenefitGrantResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBenefitGrantResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBenefitGrantResultResponseBody setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public QueryBenefitGrantResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBenefitGrantResultResponseBody setModel(QueryBenefitGrantResultResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryBenefitGrantResultResponseBodyModel getModel() {
        return this.model;
    }

    public QueryBenefitGrantResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBenefitGrantResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBenefitGrantResultResponseBodyModel extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>12345</p>
         */
        @NameInMap("CloudcodeFlowNo")
        public String cloudcodeFlowNo;

        /**
         * <p>12345</p>
         */
        @NameInMap("OuterCustomerId")
        public String outerCustomerId;

        /**
         * <p>12345</p>
         */
        @NameInMap("OuterFlowNo")
        public String outerFlowNo;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        public static QueryBenefitGrantResultResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBenefitGrantResultResponseBodyModel self = new QueryBenefitGrantResultResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryBenefitGrantResultResponseBodyModel setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryBenefitGrantResultResponseBodyModel setCloudcodeFlowNo(String cloudcodeFlowNo) {
            this.cloudcodeFlowNo = cloudcodeFlowNo;
            return this;
        }
        public String getCloudcodeFlowNo() {
            return this.cloudcodeFlowNo;
        }

        public QueryBenefitGrantResultResponseBodyModel setOuterCustomerId(String outerCustomerId) {
            this.outerCustomerId = outerCustomerId;
            return this;
        }
        public String getOuterCustomerId() {
            return this.outerCustomerId;
        }

        public QueryBenefitGrantResultResponseBodyModel setOuterFlowNo(String outerFlowNo) {
            this.outerFlowNo = outerFlowNo;
            return this;
        }
        public String getOuterFlowNo() {
            return this.outerFlowNo;
        }

        public QueryBenefitGrantResultResponseBodyModel setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryBenefitGrantResultResponseBodyModel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
