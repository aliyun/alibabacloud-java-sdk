// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryBatchApplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ElectronicItineraryBatchApplyResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static ElectronicItineraryBatchApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryBatchApplyResponseBody self = new ElectronicItineraryBatchApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryBatchApplyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ElectronicItineraryBatchApplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ElectronicItineraryBatchApplyResponseBody setModule(ElectronicItineraryBatchApplyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ElectronicItineraryBatchApplyResponseBodyModule getModule() {
        return this.module;
    }

    public ElectronicItineraryBatchApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElectronicItineraryBatchApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ElectronicItineraryBatchApplyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList extends TeaModel {
        @NameInMap("failed_code")
        public Integer failedCode;

        @NameInMap("failed_reason")
        public String failedReason;

        @NameInMap("ticket_no")
        public String ticketNo;

        public static ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList build(java.util.Map<String, ?> map) throws Exception {
            ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList self = new ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList();
            return TeaModel.build(map, self);
        }

        public ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList setFailedCode(Integer failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public Integer getFailedCode() {
            return this.failedCode;
        }

        public ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class ElectronicItineraryBatchApplyResponseBodyModule extends TeaModel {
        @NameInMap("apply_failed_ticket_list")
        public java.util.List<ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList> applyFailedTicketList;

        @NameInMap("batch_no")
        public String batchNo;

        public static ElectronicItineraryBatchApplyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ElectronicItineraryBatchApplyResponseBodyModule self = new ElectronicItineraryBatchApplyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ElectronicItineraryBatchApplyResponseBodyModule setApplyFailedTicketList(java.util.List<ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList> applyFailedTicketList) {
            this.applyFailedTicketList = applyFailedTicketList;
            return this;
        }
        public java.util.List<ElectronicItineraryBatchApplyResponseBodyModuleApplyFailedTicketList> getApplyFailedTicketList() {
            return this.applyFailedTicketList;
        }

        public ElectronicItineraryBatchApplyResponseBodyModule setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

    }

}
