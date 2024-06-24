// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainOrderQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryResponseBody self = new TrainOrderQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderQueryResponseBody setModule(TrainOrderQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderQueryResponseBodyModuleChangeTicketInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>03</p>
         */
        @NameInMap("change_coach_no")
        public String changeCoachNo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("change_gap_fee")
        public Double changeGapFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("change_handling_fee")
        public Double changeHandlingFee;

        /**
         * <strong>example:</strong>
         * <p>004C</p>
         */
        @NameInMap("change_seat_no")
        public String changeSeatNo;

        @NameInMap("change_seat_type_name")
        public String changeSeatTypeName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("change_service_fee")
        public Double changeServiceFee;

        /**
         * <strong>example:</strong>
         * <p>D103</p>
         */
        @NameInMap("change_train_no")
        public String changeTrainNo;

        @NameInMap("change_train_type_name")
        public String changeTrainTypeName;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_in_time")
        public String checkInTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_out_time")
        public String checkOutTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("end_time")
        public String endTime;

        @NameInMap("from_station_name")
        public String fromStationName;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>CS987JKDF</p>
         */
        @NameInMap("origin_ticket_no")
        public String originTicketNo;

        /**
         * <strong>example:</strong>
         * <p>m</p>
         */
        @NameInMap("out_ticket_status")
        public String outTicketStatus;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>CS987JKDF</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("to_station_name")
        public String toStationName;

        public static TrainOrderQueryResponseBodyModuleChangeTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleChangeTicketInfoList self = new TrainOrderQueryResponseBodyModuleChangeTicketInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeCoachNo(String changeCoachNo) {
            this.changeCoachNo = changeCoachNo;
            return this;
        }
        public String getChangeCoachNo() {
            return this.changeCoachNo;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeGapFee(Double changeGapFee) {
            this.changeGapFee = changeGapFee;
            return this;
        }
        public Double getChangeGapFee() {
            return this.changeGapFee;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeHandlingFee(Double changeHandlingFee) {
            this.changeHandlingFee = changeHandlingFee;
            return this;
        }
        public Double getChangeHandlingFee() {
            return this.changeHandlingFee;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeSeatNo(String changeSeatNo) {
            this.changeSeatNo = changeSeatNo;
            return this;
        }
        public String getChangeSeatNo() {
            return this.changeSeatNo;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeSeatTypeName(String changeSeatTypeName) {
            this.changeSeatTypeName = changeSeatTypeName;
            return this;
        }
        public String getChangeSeatTypeName() {
            return this.changeSeatTypeName;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeServiceFee(Double changeServiceFee) {
            this.changeServiceFee = changeServiceFee;
            return this;
        }
        public Double getChangeServiceFee() {
            return this.changeServiceFee;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeTrainNo(String changeTrainNo) {
            this.changeTrainNo = changeTrainNo;
            return this;
        }
        public String getChangeTrainNo() {
            return this.changeTrainNo;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setChangeTrainTypeName(String changeTrainTypeName) {
            this.changeTrainTypeName = changeTrainTypeName;
            return this;
        }
        public String getChangeTrainTypeName() {
            return this.changeTrainTypeName;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setFromStationName(String fromStationName) {
            this.fromStationName = fromStationName;
            return this;
        }
        public String getFromStationName() {
            return this.fromStationName;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setOriginTicketNo(String originTicketNo) {
            this.originTicketNo = originTicketNo;
            return this;
        }
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setOutTicketStatus(String outTicketStatus) {
            this.outTicketStatus = outTicketStatus;
            return this;
        }
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainOrderQueryResponseBodyModuleChangeTicketInfoList setToStationName(String toStationName) {
            this.toStationName = toStationName;
            return this;
        }
        public String getToStationName() {
            return this.toStationName;
        }

    }

    public static class TrainOrderQueryResponseBodyModuleInvoiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11754</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static TrainOrderQueryResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleInvoiceInfo self = new TrainOrderQueryResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleInvoiceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TrainOrderQueryResponseBodyModuleInvoiceInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TrainOrderQueryResponseBodyModuleOrderBaseInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11657</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <p>火车票超标审批id</p>
         * 
         * <strong>example:</strong>
         * <p>1422113021033961000</p>
         */
        @NameInMap("exceed_apply_id")
        public String exceedApplyId;

        /**
         * <p>火车票超标审批三方id</p>
         * 
         * <strong>example:</strong>
         * <p>2022113021030003600001715</p>
         */
        @NameInMap("exceed_third_part_apply_id")
        public String exceedThirdPartApplyId;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>kaxasevesguikxn123kixnghid</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        /**
         * <strong>example:</strong>
         * <p>2627694109810885616</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>CS-EDES9898</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        /**
         * <strong>example:</strong>
         * <p>kaxasevesguikxn123kixnghid</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        @NameInMap("user_id")
        public String userId;

        public static TrainOrderQueryResponseBodyModuleOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleOrderBaseInfo self = new TrainOrderQueryResponseBodyModuleOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setExceedApplyId(String exceedApplyId) {
            this.exceedApplyId = exceedApplyId;
            return this;
        }
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setExceedThirdPartApplyId(String exceedThirdPartApplyId) {
            this.exceedThirdPartApplyId = exceedThirdPartApplyId;
            return this;
        }
        public String getExceedThirdPartApplyId() {
            return this.exceedThirdPartApplyId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public TrainOrderQueryResponseBodyModuleOrderBaseInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainOrderQueryResponseBodyModulePassengerInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11564</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>CSP-01</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>22562</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>CS-22562</p>
         */
        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static TrainOrderQueryResponseBodyModulePassengerInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModulePassengerInfoList self = new TrainOrderQueryResponseBodyModulePassengerInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public TrainOrderQueryResponseBodyModulePassengerInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class TrainOrderQueryResponseBodyModulePriceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_code")
        public Integer categoryCode;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>12312312001</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static TrainOrderQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModulePriceInfoList self = new TrainOrderQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public TrainOrderQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TrainOrderQueryResponseBodyModuleRefundTicketInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("refund_service_fee")
        public Double refundServiceFee;

        /**
         * <strong>example:</strong>
         * <p>CS987JKDF</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        public static TrainOrderQueryResponseBodyModuleRefundTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleRefundTicketInfoList self = new TrainOrderQueryResponseBodyModuleRefundTicketInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleRefundTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryResponseBodyModuleRefundTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryResponseBodyModuleRefundTicketInfoList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public TrainOrderQueryResponseBodyModuleRefundTicketInfoList setRefundServiceFee(Double refundServiceFee) {
            this.refundServiceFee = refundServiceFee;
            return this;
        }
        public Double getRefundServiceFee() {
            return this.refundServiceFee;
        }

        public TrainOrderQueryResponseBodyModuleRefundTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class TrainOrderQueryResponseBodyModuleTicketInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("changed")
        public Boolean changed;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_in_time")
        public String checkInTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_out_time")
        public String checkOutTime;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("coach_no")
        public String coachNo;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>m</p>
         */
        @NameInMap("out_ticket_status")
        public String outTicketStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>A001</p>
         */
        @NameInMap("seat_no")
        public String seatNo;

        @NameInMap("seat_type_name")
        public String seatTypeName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>CS987JKDF</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Double ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ticket_status")
        public Integer ticketStatus;

        @NameInMap("train_type_name")
        public String trainTypeName;

        @NameInMap("user_id")
        public String userId;

        public static TrainOrderQueryResponseBodyModuleTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleTicketInfoList self = new TrainOrderQueryResponseBodyModuleTicketInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setCoachNo(String coachNo) {
            this.coachNo = coachNo;
            return this;
        }
        public String getCoachNo() {
            return this.coachNo;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setOutTicketStatus(String outTicketStatus) {
            this.outTicketStatus = outTicketStatus;
            return this;
        }
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setSeatTypeName(String seatTypeName) {
            this.seatTypeName = seatTypeName;
            return this;
        }
        public String getSeatTypeName() {
            return this.seatTypeName;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setTicketStatus(Integer ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setTrainTypeName(String trainTypeName) {
            this.trainTypeName = trainTypeName;
            return this;
        }
        public String getTrainTypeName() {
            return this.trainTypeName;
        }

        public TrainOrderQueryResponseBodyModuleTicketInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainOrderQueryResponseBodyModuleTrainInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("from_city_ad_code")
        public String fromCityAdCode;

        @NameInMap("from_station_name")
        public String fromStationName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("run_time")
        public Long runTime;

        @NameInMap("to_city_ad_code")
        public String toCityAdCode;

        @NameInMap("to_station_name")
        public String toStationName;

        /**
         * <strong>example:</strong>
         * <p>CS-150</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainOrderQueryResponseBodyModuleTrainInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModuleTrainInfo self = new TrainOrderQueryResponseBodyModuleTrainInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setFromCityAdCode(String fromCityAdCode) {
            this.fromCityAdCode = fromCityAdCode;
            return this;
        }
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setFromStationName(String fromStationName) {
            this.fromStationName = fromStationName;
            return this;
        }
        public String getFromStationName() {
            return this.fromStationName;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setRunTime(Long runTime) {
            this.runTime = runTime;
            return this;
        }
        public Long getRunTime() {
            return this.runTime;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setToCityAdCode(String toCityAdCode) {
            this.toCityAdCode = toCityAdCode;
            return this;
        }
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setToStationName(String toStationName) {
            this.toStationName = toStationName;
            return this;
        }
        public String getToStationName() {
            return this.toStationName;
        }

        public TrainOrderQueryResponseBodyModuleTrainInfo setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainOrderQueryResponseBodyModule extends TeaModel {
        @NameInMap("change_ticket_info_list")
        public java.util.List<TrainOrderQueryResponseBodyModuleChangeTicketInfoList> changeTicketInfoList;

        @NameInMap("invoice_info")
        public TrainOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        public TrainOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        public java.util.List<TrainOrderQueryResponseBodyModulePassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        public java.util.List<TrainOrderQueryResponseBodyModulePriceInfoList> priceInfoList;

        @NameInMap("refund_ticket_info_list")
        public java.util.List<TrainOrderQueryResponseBodyModuleRefundTicketInfoList> refundTicketInfoList;

        @NameInMap("ticket_info_list")
        public java.util.List<TrainOrderQueryResponseBodyModuleTicketInfoList> ticketInfoList;

        @NameInMap("train_info")
        public TrainOrderQueryResponseBodyModuleTrainInfo trainInfo;

        public static TrainOrderQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryResponseBodyModule self = new TrainOrderQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryResponseBodyModule setChangeTicketInfoList(java.util.List<TrainOrderQueryResponseBodyModuleChangeTicketInfoList> changeTicketInfoList) {
            this.changeTicketInfoList = changeTicketInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryResponseBodyModuleChangeTicketInfoList> getChangeTicketInfoList() {
            return this.changeTicketInfoList;
        }

        public TrainOrderQueryResponseBodyModule setInvoiceInfo(TrainOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public TrainOrderQueryResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public TrainOrderQueryResponseBodyModule setOrderBaseInfo(TrainOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }
        public TrainOrderQueryResponseBodyModuleOrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        public TrainOrderQueryResponseBodyModule setPassengerInfoList(java.util.List<TrainOrderQueryResponseBodyModulePassengerInfoList> passengerInfoList) {
            this.passengerInfoList = passengerInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryResponseBodyModulePassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        public TrainOrderQueryResponseBodyModule setPriceInfoList(java.util.List<TrainOrderQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public TrainOrderQueryResponseBodyModule setRefundTicketInfoList(java.util.List<TrainOrderQueryResponseBodyModuleRefundTicketInfoList> refundTicketInfoList) {
            this.refundTicketInfoList = refundTicketInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryResponseBodyModuleRefundTicketInfoList> getRefundTicketInfoList() {
            return this.refundTicketInfoList;
        }

        public TrainOrderQueryResponseBodyModule setTicketInfoList(java.util.List<TrainOrderQueryResponseBodyModuleTicketInfoList> ticketInfoList) {
            this.ticketInfoList = ticketInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryResponseBodyModuleTicketInfoList> getTicketInfoList() {
            return this.ticketInfoList;
        }

        public TrainOrderQueryResponseBodyModule setTrainInfo(TrainOrderQueryResponseBodyModuleTrainInfo trainInfo) {
            this.trainInfo = trainInfo;
            return this;
        }
        public TrainOrderQueryResponseBodyModuleTrainInfo getTrainInfo() {
            return this.trainInfo;
        }

    }

}
