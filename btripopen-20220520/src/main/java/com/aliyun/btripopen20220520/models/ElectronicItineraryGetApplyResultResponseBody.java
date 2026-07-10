// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ElectronicItineraryGetApplyResultResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ElectronicItineraryGetApplyResultResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ElectronicItineraryGetApplyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ElectronicItineraryGetApplyResultResponseBody self = new ElectronicItineraryGetApplyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ElectronicItineraryGetApplyResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ElectronicItineraryGetApplyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ElectronicItineraryGetApplyResultResponseBody setModule(ElectronicItineraryGetApplyResultResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ElectronicItineraryGetApplyResultResponseBodyModule getModule() {
        return this.module;
    }

    public ElectronicItineraryGetApplyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ElectronicItineraryGetApplyResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ElectronicItineraryGetApplyResultResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList extends TeaModel {
        @NameInMap("failed_code")
        public Integer failedCode;

        @NameInMap("failed_reason")
        public String failedReason;

        @NameInMap("itinerary_status")
        public Integer itineraryStatus;

        @NameInMap("remark")
        public String remark;

        @NameInMap("ticket_no")
        public String ticketNo;

        public static ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList build(java.util.Map<String, ?> map) throws Exception {
            ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList self = new ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList();
            return TeaModel.build(map, self);
        }

        public ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList setFailedCode(Integer failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public Integer getFailedCode() {
            return this.failedCode;
        }

        public ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList setItineraryStatus(Integer itineraryStatus) {
            this.itineraryStatus = itineraryStatus;
            return this;
        }
        public Integer getItineraryStatus() {
            return this.itineraryStatus;
        }

        public ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class ElectronicItineraryGetApplyResultResponseBodyModule extends TeaModel {
        @NameInMap("apply_ticket_list")
        public java.util.List<ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList> applyTicketList;

        @NameInMap("batch_apply_no")
        public String batchApplyNo;

        public static ElectronicItineraryGetApplyResultResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ElectronicItineraryGetApplyResultResponseBodyModule self = new ElectronicItineraryGetApplyResultResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ElectronicItineraryGetApplyResultResponseBodyModule setApplyTicketList(java.util.List<ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList> applyTicketList) {
            this.applyTicketList = applyTicketList;
            return this;
        }
        public java.util.List<ElectronicItineraryGetApplyResultResponseBodyModuleApplyTicketList> getApplyTicketList() {
            return this.applyTicketList;
        }

        public ElectronicItineraryGetApplyResultResponseBodyModule setBatchApplyNo(String batchApplyNo) {
            this.batchApplyNo = batchApplyNo;
            return this;
        }
        public String getBatchApplyNo() {
            return this.batchApplyNo;
        }

    }

}
