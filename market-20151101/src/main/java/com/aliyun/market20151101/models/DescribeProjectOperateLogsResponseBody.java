// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectOperateLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e6037e86-657f-4194-bb6a-7b26973aec8d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeProjectOperateLogsResponseBodyResult> result;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The description of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>进入分配服务商操作人</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The operation time (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1587624497000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The Alibaba Cloud UID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Operator")
        public Long operator;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>系统</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The role of the operator. Valid values:</p>
         * <ul>
         * <li>System: system.</li>
         * <li>Custom: customer.</li>
         * <li>Provider: service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
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
