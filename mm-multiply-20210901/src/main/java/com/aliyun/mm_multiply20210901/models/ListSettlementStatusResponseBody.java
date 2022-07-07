// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListSettlementStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SettlementStatuses")
    public java.util.List<ListSettlementStatusResponseBodySettlementStatuses> settlementStatuses;

    @NameInMap("Success")
    public Boolean success;

    public static ListSettlementStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSettlementStatusResponseBody self = new ListSettlementStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSettlementStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSettlementStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSettlementStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSettlementStatusResponseBody setSettlementStatuses(java.util.List<ListSettlementStatusResponseBodySettlementStatuses> settlementStatuses) {
        this.settlementStatuses = settlementStatuses;
        return this;
    }
    public java.util.List<ListSettlementStatusResponseBodySettlementStatuses> getSettlementStatuses() {
        return this.settlementStatuses;
    }

    public ListSettlementStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSettlementStatusResponseBodySettlementStatuses extends TeaModel {
        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusType")
        public String statusType;

        public static ListSettlementStatusResponseBodySettlementStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListSettlementStatusResponseBodySettlementStatuses self = new ListSettlementStatusResponseBodySettlementStatuses();
            return TeaModel.build(map, self);
        }

        public ListSettlementStatusResponseBodySettlementStatuses setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListSettlementStatusResponseBodySettlementStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSettlementStatusResponseBodySettlementStatuses setStatusType(String statusType) {
            this.statusType = statusType;
            return this;
        }
        public String getStatusType() {
            return this.statusType;
        }

    }

}
