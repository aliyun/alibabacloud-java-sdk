// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CustomerQuotaRecordListResponseBody extends TeaModel {
    /**
     * <p>Status code of returning result, 200 means success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Record number on each page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of request</p>
     * 
     * <strong>example:</strong>
     * <p>2103a0ae16849855284594613d874e</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total volume</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>ACPN</p>
         */
        @NameInMap("OperationSubmitType")
        public String operationSubmitType;

        /**
         * <p>The time of submit the quota adjustment operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-15 10:34:36 UTC+8</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <p>Operation Type Enum</br>
         * all All types</br>
         * quota_create Create quota</br>
         * quota_amount_adjust Adjust the amount of quota</br></p>
         * 
         * <strong>example:</strong>
         * <p>quota_amount_adjust</p>
         */
        @NameInMap("OperationTypeCode")
        public String operationTypeCode;

        /**
         * <p>The description of submitted quota adjustment operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota Adjustment</p>
         */
        @NameInMap("OperationTypeDesc")
        public String operationTypeDesc;

        /**
         * <p>The UID of operator(Partner\&quot;s UID).</p>
         * 
         * <strong>example:</strong>
         * <p>5113766248601929</p>
         */
        @NameInMap("OperationUid")
        public String operationUid;

        /**
         * <p>Updated quota amount</p>
         * 
         * <strong>example:</strong>
         * <p>121.00</p>
         */
        @NameInMap("UpdateAfterAmount")
        public String updateAfterAmount;

        /**
         * <p>The difference amount between updated quota and original quota.</p>
         * 
         * <strong>example:</strong>
         * <p>-100.00</p>
         */
        @NameInMap("UpdateAmount")
        public String updateAmount;

        /**
         * <p>Original quota amount</p>
         * 
         * <strong>example:</strong>
         * <p>221.00</p>
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
