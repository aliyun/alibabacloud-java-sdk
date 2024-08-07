// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectMessagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00eb4de1-6cff-4f56-833e-7b1e070e398d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeProjectMessagesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>28</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProjectMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMessagesResponseBody self = new DescribeProjectMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectMessagesResponseBody setResult(java.util.List<DescribeProjectMessagesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeProjectMessagesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeProjectMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectMessagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectMessagesResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1589015560000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>452611111****</p>
         */
        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <strong>example:</strong>
         * <p>Provider</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        public static DescribeProjectMessagesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectMessagesResponseBodyResult self = new DescribeProjectMessagesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProjectMessagesResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeProjectMessagesResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectMessagesResponseBodyResult setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public DescribeProjectMessagesResponseBodyResult setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeProjectMessagesResponseBodyResult setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

    }

}
