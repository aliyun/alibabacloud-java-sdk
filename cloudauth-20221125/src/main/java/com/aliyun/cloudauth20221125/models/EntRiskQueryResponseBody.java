// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntRiskQueryResponseBody extends TeaModel {
    /**
     * <p>Error code. For details about error codes, see <strong><a href="https://help.aliyun.com/document_detail/215420.html">Error Codes</a></strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response message for the request information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result</p>
     */
    @NameInMap("Result")
    public EntRiskQueryResponseBodyResult result;

    public static EntRiskQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EntRiskQueryResponseBody self = new EntRiskQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public EntRiskQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EntRiskQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EntRiskQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EntRiskQueryResponseBody setResult(EntRiskQueryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EntRiskQueryResponseBodyResult getResult() {
        return this.result;
    }

    public static class EntRiskQueryResponseBodyResultRiskList extends TeaModel {
        /**
         * <p>Unified Social Credit Code</p>
         * 
         * <strong>example:</strong>
         * <p>92500112MA5UHU****</p>
         */
        @NameInMap("CreditCode")
        public String creditCode;

        /**
         * <p>Company name.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州****</p>
         */
        @NameInMap("EntName")
        public String entName;

        /**
         * <p>Date listed as abnormal
         * Example: 2023-02-03</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-03</p>
         */
        @NameInMap("ListedDate")
        public String listedDate;

        /**
         * <p>Reason for being listed as abnormal</p>
         * 
         * <strong>example:</strong>
         * <p>未按照《个体工商户年度报告暂行办法》***</p>
         */
        @NameInMap("ListedReason")
        public String listedReason;

        /**
         * <p>Authority that handled the inclusion</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>市场监督</strong></em></p>
         */
        @NameInMap("OperationOrg")
        public String operationOrg;

        /**
         * <p>Business registration number</p>
         * 
         * <strong>example:</strong>
         * <p>50011260996****</p>
         */
        @NameInMap("RegNo")
        public String regNo;

        /**
         * <p>Date removed from the abnormal list
         * Example: 2023-02-03</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06</p>
         */
        @NameInMap("RemovedDate")
        public String removedDate;

        /**
         * <p>Authority that handled the removal</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>市场监督</strong></em></p>
         */
        @NameInMap("RemovedOrg")
        public String removedOrg;

        /**
         * <p>Reason for being removed from the abnormal list</p>
         * 
         * <strong>example:</strong>
         * <p>根据《个体工商户年度报告暂行办法》第十三条的规定******</p>
         */
        @NameInMap("RemovedReason")
        public String removedReason;

        public static EntRiskQueryResponseBodyResultRiskList build(java.util.Map<String, ?> map) throws Exception {
            EntRiskQueryResponseBodyResultRiskList self = new EntRiskQueryResponseBodyResultRiskList();
            return TeaModel.build(map, self);
        }

        public EntRiskQueryResponseBodyResultRiskList setCreditCode(String creditCode) {
            this.creditCode = creditCode;
            return this;
        }
        public String getCreditCode() {
            return this.creditCode;
        }

        public EntRiskQueryResponseBodyResultRiskList setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public EntRiskQueryResponseBodyResultRiskList setListedDate(String listedDate) {
            this.listedDate = listedDate;
            return this;
        }
        public String getListedDate() {
            return this.listedDate;
        }

        public EntRiskQueryResponseBodyResultRiskList setListedReason(String listedReason) {
            this.listedReason = listedReason;
            return this;
        }
        public String getListedReason() {
            return this.listedReason;
        }

        public EntRiskQueryResponseBodyResultRiskList setOperationOrg(String operationOrg) {
            this.operationOrg = operationOrg;
            return this;
        }
        public String getOperationOrg() {
            return this.operationOrg;
        }

        public EntRiskQueryResponseBodyResultRiskList setRegNo(String regNo) {
            this.regNo = regNo;
            return this;
        }
        public String getRegNo() {
            return this.regNo;
        }

        public EntRiskQueryResponseBodyResultRiskList setRemovedDate(String removedDate) {
            this.removedDate = removedDate;
            return this;
        }
        public String getRemovedDate() {
            return this.removedDate;
        }

        public EntRiskQueryResponseBodyResultRiskList setRemovedOrg(String removedOrg) {
            this.removedOrg = removedOrg;
            return this;
        }
        public String getRemovedOrg() {
            return this.removedOrg;
        }

        public EntRiskQueryResponseBodyResultRiskList setRemovedReason(String removedReason) {
            this.removedReason = removedReason;
            return this;
        }
        public String getRemovedReason() {
            return this.removedReason;
        }

    }

    public static class EntRiskQueryResponseBodyResult extends TeaModel {
        /**
         * <p>Query result
         * 0: Normal business operation
         * 1: Abnormal business operation
         * 2: Not found</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>List of abnormal information</p>
         */
        @NameInMap("RiskList")
        public java.util.List<EntRiskQueryResponseBodyResultRiskList> riskList;

        /**
         * <p>Business operation status.</p>
         * <ul>
         * <li>1: In operation (open)</li>
         * <li>2: Relocated</li>
         * <li>3: Deregistered</li>
         * <li>4: Revoked</li>
         * <li>5: Canceled</li>
         * <li>6: Suspended</li>
         * <li>0: Other</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        public static EntRiskQueryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EntRiskQueryResponseBodyResult self = new EntRiskQueryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EntRiskQueryResponseBodyResult setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public EntRiskQueryResponseBodyResult setRiskList(java.util.List<EntRiskQueryResponseBodyResultRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<EntRiskQueryResponseBodyResultRiskList> getRiskList() {
            return this.riskList;
        }

        public EntRiskQueryResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
