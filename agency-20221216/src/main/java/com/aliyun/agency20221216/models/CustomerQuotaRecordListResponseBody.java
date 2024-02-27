// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CustomerQuotaRecordListResponseBody extends TeaModel {
    /**
     * <p>Status code of returning result, 200 means success.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Listed data of returning result</p>
     */
    @NameInMap("Data")
    public java.util.List<CustomerQuotaRecordListResponseBodyData> data;

    /**
     * <p>Description of returning data</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Current page number</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Record number on each page</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total volume</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static CustomerQuotaRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomerQuotaRecordListResponseBody self = new CustomerQuotaRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomerQuotaRecordListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomerQuotaRecordListResponseBody setData(java.util.List<CustomerQuotaRecordListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CustomerQuotaRecordListResponseBodyData> getData() {
        return this.data;
    }

    public CustomerQuotaRecordListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CustomerQuotaRecordListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CustomerQuotaRecordListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CustomerQuotaRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CustomerQuotaRecordListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class CustomerQuotaRecordListResponseBodyData extends TeaModel {
        /**
         * <p>The way to submit the quota adjustment operation. API/ACPN</p>
         */
        @NameInMap("OperationSubmitType")
        public String operationSubmitType;

        /**
         * <p>The time of submit the quota adjustment operation.</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <p>Operation Type Enum</br></p>
         * <p>all All types</br></p>
         * <p>quota_create Create quota</br></p>
         * <p>quota_amount_adjust Adjust the amount of quota</br></p>
         */
        @NameInMap("OperationTypeCode")
        public String operationTypeCode;

        /**
         * <p>The description of submitted quota adjustment operation.</p>
         */
        @NameInMap("OperationTypeDesc")
        public String operationTypeDesc;

        /**
         * <p>The UID of operator(Partner\"s UID).</p>
         */
        @NameInMap("OperationUid")
        public String operationUid;

        /**
         * <p>Updated quota amount</p>
         */
        @NameInMap("UpdateAfterAmount")
        public String updateAfterAmount;

        /**
         * <p>The difference amount between updated quota and original quota.</p>
         */
        @NameInMap("UpdateAmount")
        public String updateAmount;

        /**
         * <p>Original quota amount</p>
         */
        @NameInMap("UpdateBeforeAmount")
        public String updateBeforeAmount;

        public static CustomerQuotaRecordListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomerQuotaRecordListResponseBodyData self = new CustomerQuotaRecordListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomerQuotaRecordListResponseBodyData setOperationSubmitType(String operationSubmitType) {
            this.operationSubmitType = operationSubmitType;
            return this;
        }
        public String getOperationSubmitType() {
            return this.operationSubmitType;
        }

        public CustomerQuotaRecordListResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public CustomerQuotaRecordListResponseBodyData setOperationTypeCode(String operationTypeCode) {
            this.operationTypeCode = operationTypeCode;
            return this;
        }
        public String getOperationTypeCode() {
            return this.operationTypeCode;
        }

        public CustomerQuotaRecordListResponseBodyData setOperationTypeDesc(String operationTypeDesc) {
            this.operationTypeDesc = operationTypeDesc;
            return this;
        }
        public String getOperationTypeDesc() {
            return this.operationTypeDesc;
        }

        public CustomerQuotaRecordListResponseBodyData setOperationUid(String operationUid) {
            this.operationUid = operationUid;
            return this;
        }
        public String getOperationUid() {
            return this.operationUid;
        }

        public CustomerQuotaRecordListResponseBodyData setUpdateAfterAmount(String updateAfterAmount) {
            this.updateAfterAmount = updateAfterAmount;
            return this;
        }
        public String getUpdateAfterAmount() {
            return this.updateAfterAmount;
        }

        public CustomerQuotaRecordListResponseBodyData setUpdateAmount(String updateAmount) {
            this.updateAmount = updateAmount;
            return this;
        }
        public String getUpdateAmount() {
            return this.updateAmount;
        }

        public CustomerQuotaRecordListResponseBodyData setUpdateBeforeAmount(String updateBeforeAmount) {
            this.updateBeforeAmount = updateBeforeAmount;
            return this;
        }
        public String getUpdateBeforeAmount() {
            return this.updateBeforeAmount;
        }

    }

}
