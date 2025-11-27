// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetPurchaseControlRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetPurchaseControlRecordResponseBodyData> data;

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
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
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

    public static GetPurchaseControlRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPurchaseControlRecordResponseBody self = new GetPurchaseControlRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPurchaseControlRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPurchaseControlRecordResponseBody setData(java.util.List<GetPurchaseControlRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPurchaseControlRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetPurchaseControlRecordResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetPurchaseControlRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPurchaseControlRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPurchaseControlRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPurchaseControlRecordResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetPurchaseControlRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ban</p>
         */
        @NameInMap("ChangedType")
        public String changedType;

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
         * <p>292828565558721922</p>
         */
        @NameInMap("Operator")
        public String operator;

        public static GetPurchaseControlRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPurchaseControlRecordResponseBodyData self = new GetPurchaseControlRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPurchaseControlRecordResponseBodyData setChangedType(String changedType) {
            this.changedType = changedType;
            return this;
        }
        public String getChangedType() {
            return this.changedType;
        }

        public GetPurchaseControlRecordResponseBodyData setOperationPath(String operationPath) {
            this.operationPath = operationPath;
            return this;
        }
        public String getOperationPath() {
            return this.operationPath;
        }

        public GetPurchaseControlRecordResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public GetPurchaseControlRecordResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
