// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainTicketScanQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainTicketScanQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainTicketScanQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainTicketScanQueryResponseBody self = new TrainTicketScanQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainTicketScanQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainTicketScanQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainTicketScanQueryResponseBody setModule(TrainTicketScanQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainTicketScanQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TrainTicketScanQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainTicketScanQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainTicketScanQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainTicketScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("coach_name")
        public String coachName;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("dep_station")
        public String depStation;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("department")
        public String department;

        @NameInMap("id")
        public String id;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("passenger")
        public String passenger;

        @NameInMap("price")
        public String price;

        @NameInMap("project")
        public String project;

        @NameInMap("seat")
        public String seat;

        @NameInMap("seat_no")
        public String seatNo;

        @NameInMap("serial_number")
        public String serialNumber;

        @NameInMap("tax_amount")
        public String taxAmount;

        @NameInMap("tax_rate")
        public String taxRate;

        /**
         * <p>取票号</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <p>车次</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainTicketScanQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            TrainTicketScanQueryResponseBodyModuleItems self = new TrainTicketScanQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public TrainTicketScanQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setCoachName(String coachName) {
            this.coachName = coachName;
            return this;
        }
        public String getCoachName() {
            return this.coachName;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setDepStation(String depStation) {
            this.depStation = depStation;
            return this;
        }
        public String getDepStation() {
            return this.depStation;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setPassenger(String passenger) {
            this.passenger = passenger;
            return this;
        }
        public String getPassenger() {
            return this.passenger;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setSeat(String seat) {
            this.seat = seat;
            return this;
        }
        public String getSeat() {
            return this.seat;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainTicketScanQueryResponseBodyModuleItems setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainTicketScanQueryResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<TrainTicketScanQueryResponseBodyModuleItems> items;

        @NameInMap("page_no")
        public Integer pageNo;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_page")
        public Integer totalPage;

        @NameInMap("total_size")
        public Integer totalSize;

        public static TrainTicketScanQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainTicketScanQueryResponseBodyModule self = new TrainTicketScanQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainTicketScanQueryResponseBodyModule setItems(java.util.List<TrainTicketScanQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<TrainTicketScanQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public TrainTicketScanQueryResponseBodyModule setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public TrainTicketScanQueryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public TrainTicketScanQueryResponseBodyModule setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public TrainTicketScanQueryResponseBodyModule setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
