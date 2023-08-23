// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntRiskQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreditCode")
        public String creditCode;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("ListedDate")
        public String listedDate;

        @NameInMap("ListedReason")
        public String listedReason;

        @NameInMap("OperationOrg")
        public String operationOrg;

        @NameInMap("RegNo")
        public String regNo;

        @NameInMap("RemovedDate")
        public String removedDate;

        @NameInMap("RemovedOrg")
        public String removedOrg;

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
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("RiskList")
        public java.util.List<EntRiskQueryResponseBodyResultRiskList> riskList;

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
