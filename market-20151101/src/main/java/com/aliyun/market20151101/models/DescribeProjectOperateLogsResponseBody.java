// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectOperateLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeProjectOperateLogsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProjectOperateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectOperateLogsResponseBody self = new DescribeProjectOperateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectOperateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectOperateLogsResponseBody setResult(java.util.List<DescribeProjectOperateLogsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeProjectOperateLogsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeProjectOperateLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProjectOperateLogsResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Operator")
        public Long operator;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("OperatorRole")
        public String operatorRole;

        public static DescribeProjectOperateLogsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectOperateLogsResponseBodyResult self = new DescribeProjectOperateLogsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProjectOperateLogsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectOperateLogsResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectOperateLogsResponseBodyResult setOperator(Long operator) {
            this.operator = operator;
            return this;
        }
        public Long getOperator() {
            return this.operator;
        }

        public DescribeProjectOperateLogsResponseBodyResult setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeProjectOperateLogsResponseBodyResult setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

    }

}
