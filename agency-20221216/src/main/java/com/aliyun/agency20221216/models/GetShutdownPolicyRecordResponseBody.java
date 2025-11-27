// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetShutdownPolicyRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetShutdownPolicyRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>210e876f16704666020714468dab35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetShutdownPolicyRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShutdownPolicyRecordResponseBody self = new GetShutdownPolicyRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShutdownPolicyRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetShutdownPolicyRecordResponseBody setData(java.util.List<GetShutdownPolicyRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetShutdownPolicyRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetShutdownPolicyRecordResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetShutdownPolicyRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetShutdownPolicyRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetShutdownPolicyRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetShutdownPolicyRecordResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetShutdownPolicyRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>noStop</p>
         */
        @NameInMap("CurrentPolicy")
        public String currentPolicy;

        /**
         * <strong>example:</strong>
         * <p>ACPN</p>
         */
        @NameInMap("OperationPath")
        public String operationPath;

        /**
         * <strong>example:</strong>
         * <p>2023-12-15 10:34:36</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <strong>example:</strong>
         * <p>11111111111</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>immediatelyStop</p>
         */
        @NameInMap("PreviousPolicy")
        public String previousPolicy;

        public static GetShutdownPolicyRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetShutdownPolicyRecordResponseBodyData self = new GetShutdownPolicyRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetShutdownPolicyRecordResponseBodyData setCurrentPolicy(String currentPolicy) {
            this.currentPolicy = currentPolicy;
            return this;
        }
        public String getCurrentPolicy() {
            return this.currentPolicy;
        }

        public GetShutdownPolicyRecordResponseBodyData setOperationPath(String operationPath) {
            this.operationPath = operationPath;
            return this;
        }
        public String getOperationPath() {
            return this.operationPath;
        }

        public GetShutdownPolicyRecordResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public GetShutdownPolicyRecordResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetShutdownPolicyRecordResponseBodyData setPreviousPolicy(String previousPolicy) {
            this.previousPolicy = previousPolicy;
            return this;
        }
        public String getPreviousPolicy() {
            return this.previousPolicy;
        }

    }

}
