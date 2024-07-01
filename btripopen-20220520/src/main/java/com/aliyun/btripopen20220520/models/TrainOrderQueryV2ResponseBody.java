// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainOrderQueryV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>1213ds1d</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>123412dcdsac sd</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderQueryV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryV2ResponseBody self = new TrainOrderQueryV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderQueryV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderQueryV2ResponseBody setModule(TrainOrderQueryV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderQueryV2ResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderQueryV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderQueryV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderQueryV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList extends TeaModel {
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

        @NameInMap("check_in_time")
        public String checkInTime;

        @NameInMap("check_out_time")
        public String checkOutTime;

        @NameInMap("end_time")
        public String endTime;

        @NameInMap("from_city_name")
        public String fromCityName;

        @NameInMap("from_station_name")
        public String fromStationName;

        @NameInMap("gmt_create")
        public String gmtCreate;

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
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("start_time")
        public String startTime;

        @NameInMap("ticket_entrance")
        public String ticketEntrance;

        /**
         * <strong>example:</strong>
         * <p>CS987JKDF</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_status")
        public Integer ticketStatus;

        @NameInMap("to_city_name")
        public String toCityName;

        @NameInMap("to_station_name")
        public String toStationName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("use_ticket")
        public String useTicket;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList self = new TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeCoachNo(String changeCoachNo) {
            this.changeCoachNo = changeCoachNo;
            return this;
        }
        public String getChangeCoachNo() {
            return this.changeCoachNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeGapFee(Double changeGapFee) {
            this.changeGapFee = changeGapFee;
            return this;
        }
        public Double getChangeGapFee() {
            return this.changeGapFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeHandlingFee(Double changeHandlingFee) {
            this.changeHandlingFee = changeHandlingFee;
            return this;
        }
        public Double getChangeHandlingFee() {
            return this.changeHandlingFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeSeatNo(String changeSeatNo) {
            this.changeSeatNo = changeSeatNo;
            return this;
        }
        public String getChangeSeatNo() {
            return this.changeSeatNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeSeatTypeName(String changeSeatTypeName) {
            this.changeSeatTypeName = changeSeatTypeName;
            return this;
        }
        public String getChangeSeatTypeName() {
            return this.changeSeatTypeName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeServiceFee(Double changeServiceFee) {
            this.changeServiceFee = changeServiceFee;
            return this;
        }
        public Double getChangeServiceFee() {
            return this.changeServiceFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeTrainNo(String changeTrainNo) {
            this.changeTrainNo = changeTrainNo;
            return this;
        }
        public String getChangeTrainNo() {
            return this.changeTrainNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setChangeTrainTypeName(String changeTrainTypeName) {
            this.changeTrainTypeName = changeTrainTypeName;
            return this;
        }
        public String getChangeTrainTypeName() {
            return this.changeTrainTypeName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setFromStationName(String fromStationName) {
            this.fromStationName = fromStationName;
            return this;
        }
        public String getFromStationName() {
            return this.fromStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setOriginTicketNo(String originTicketNo) {
            this.originTicketNo = originTicketNo;
            return this;
        }
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setOutTicketStatus(String outTicketStatus) {
            this.outTicketStatus = outTicketStatus;
            return this;
        }
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setTicketEntrance(String ticketEntrance) {
            this.ticketEntrance = ticketEntrance;
            return this;
        }
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setTicketStatus(Integer ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setToStationName(String toStationName) {
            this.toStationName = toStationName;
            return this;
        }
        public String getToStationName() {
            return this.toStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setUseTicket(String useTicket) {
            this.useTicket = useTicket;
            return this;
        }
        public String getUseTicket() {
            return this.useTicket;
        }

        public TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleInvoiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3815504</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static TrainOrderQueryV2ResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleInvoiceInfo self = new TrainOrderQueryV2ResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleInvoiceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TrainOrderQueryV2ResponseBodyModuleInvoiceInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1003784135</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("contact_name")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>12110002222</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>btripsy4yd7v0gdpdntpp</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>1422113021033961000</p>
         */
        @NameInMap("exceed_apply_id")
        public String exceedApplyId;

        /**
         * <strong>example:</strong>
         * <p>1422113021033961000</p>
         */
        @NameInMap("exceed_thirdpart_apply_id")
        public String exceedThirdpartApplyId;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>42942924</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        /**
         * <strong>example:</strong>
         * <p>2849819724653209258</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("thirdPart_business_id")
        public String thirdPartBusinessId;

        /**
         * <strong>example:</strong>
         * <p>01-2023-01214</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>DHDI2209141OEGHWRN</p>
         */
        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        /**
         * <strong>example:</strong>
         * <p>CS-FLIGHT</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        /**
         * <strong>example:</strong>
         * <p>1231212</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_nick")
        public String userNick;

        public static TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo self = new TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setExceedApplyId(String exceedApplyId) {
            this.exceedApplyId = exceedApplyId;
            return this;
        }
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setExceedThirdpartApplyId(String exceedThirdpartApplyId) {
            this.exceedThirdpartApplyId = exceedThirdpartApplyId;
            return this;
        }
        public String getExceedThirdpartApplyId() {
            return this.exceedThirdpartApplyId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setThirdPartBusinessId(String thirdPartBusinessId) {
            this.thirdPartBusinessId = thirdPartBusinessId;
            return this;
        }
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModulePassengerInfoList extends TeaModel {
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
         * <p>CS-3345</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>CS-PROJECT</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>133576</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>CS-KDISL</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>CS-22562</p>
         */
        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        /**
         * <strong>example:</strong>
         * <p>1231231</p>
         */
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

        public static TrainOrderQueryV2ResponseBodyModulePassengerInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModulePassengerInfoList self = new TrainOrderQueryV2ResponseBodyModulePassengerInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public TrainOrderQueryV2ResponseBodyModulePassengerInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModulePriceInfoList extends TeaModel {
        @NameInMap("category_code")
        public Integer categoryCode;

        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>176000</p>
         */
        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>12345678910987654321</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        @NameInMap("type")
        public Integer type;

        public static TrainOrderQueryV2ResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModulePriceInfoList self = new TrainOrderQueryV2ResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public TrainOrderQueryV2ResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList extends TeaModel {
        @NameInMap("gmt_create")
        public String gmtCreate;

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

        /**
         * <strong>example:</strong>
         * <p>1231231</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList self = new TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setRefundServiceFee(Double refundServiceFee) {
            this.refundServiceFee = refundServiceFee;
            return this;
        }
        public Double getRefundServiceFee() {
            return this.refundServiceFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("changed")
        public Boolean changed;

        @NameInMap("check_in_time")
        public String checkInTime;

        @NameInMap("check_out_time")
        public String checkOutTime;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("coach_no")
        public String coachNo;

        @NameInMap("end_time")
        public String endTime;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("out_ticket_status")
        public String outTicketStatus;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>02A</p>
         */
        @NameInMap("seat_no")
        public String seatNo;

        @NameInMap("seat_type_name")
        public String seatTypeName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("start_time")
        public String startTime;

        @NameInMap("ticket_entrance")
        public String ticketEntrance;

        /**
         * <strong>example:</strong>
         * <p>ew123121</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>400</p>
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

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("use_ticket")
        public String useTicket;

        /**
         * <strong>example:</strong>
         * <p>231212</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos self = new TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public String getCheckInTime() {
            return this.checkInTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public String getCheckOutTime() {
            return this.checkOutTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setCoachNo(String coachNo) {
            this.coachNo = coachNo;
            return this;
        }
        public String getCoachNo() {
            return this.coachNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setOutTicketStatus(String outTicketStatus) {
            this.outTicketStatus = outTicketStatus;
            return this;
        }
        public String getOutTicketStatus() {
            return this.outTicketStatus;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setSeatTypeName(String seatTypeName) {
            this.seatTypeName = seatTypeName;
            return this;
        }
        public String getSeatTypeName() {
            return this.seatTypeName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setTicketEntrance(String ticketEntrance) {
            this.ticketEntrance = ticketEntrance;
            return this;
        }
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setTicketStatus(Integer ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setTrainTypeName(String trainTypeName) {
            this.trainTypeName = trainTypeName;
            return this;
        }
        public String getTrainTypeName() {
            return this.trainTypeName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setUseTicket(String useTicket) {
            this.useTicket = useTicket;
            return this;
        }
        public String getUseTicket() {
            return this.useTicket;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList extends TeaModel {
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("from_city_ad_code")
        public String fromCityAdCode;

        @NameInMap("from_city_name")
        public String fromCityName;

        @NameInMap("from_station_name")
        public String fromStationName;

        /**
         * <p>itemId</p>
         * 
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("item_id")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("run_time")
        public Long runTime;

        @NameInMap("to_city_ad_code")
        public String toCityAdCode;

        @NameInMap("to_city_name")
        public String toCityName;

        @NameInMap("to_station_name")
        public String toStationName;

        /**
         * <strong>example:</strong>
         * <p>D11</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_ticket_infos")
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos> trainTicketInfos;

        public static TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList self = new TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setFromCityAdCode(String fromCityAdCode) {
            this.fromCityAdCode = fromCityAdCode;
            return this;
        }
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setFromStationName(String fromStationName) {
            this.fromStationName = fromStationName;
            return this;
        }
        public String getFromStationName() {
            return this.fromStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setRunTime(Long runTime) {
            this.runTime = runTime;
            return this;
        }
        public Long getRunTime() {
            return this.runTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setToCityAdCode(String toCityAdCode) {
            this.toCityAdCode = toCityAdCode;
            return this;
        }
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setToStationName(String toStationName) {
            this.toStationName = toStationName;
            return this;
        }
        public String getToStationName() {
            return this.toStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList setTrainTicketInfos(java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos> trainTicketInfos) {
            this.trainTicketInfos = trainTicketInfos;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoListTrainTicketInfos> getTrainTicketInfos() {
            return this.trainTicketInfos;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("cost_time")
        public String costTime;

        /**
         * <strong>example:</strong>
         * <p>2022-11-15 00:00:00</p>
         */
        @NameInMap("end_time")
        public String endTime;

        @NameInMap("from_city_ad_code")
        public String fromCityAdCode;

        @NameInMap("from_city_name")
        public String fromCityName;

        @NameInMap("from_station_name")
        public String fromStationName;

        @NameInMap("middle_city")
        public String middleCity;

        @NameInMap("middle_city_ad_code")
        public String middleCityAdCode;

        /**
         * <strong>example:</strong>
         * <p>2023-01-29 18:10:00</p>
         */
        @NameInMap("middle_date")
        public String middleDate;

        @NameInMap("middle_station")
        public String middleStation;

        @NameInMap("middle_type")
        public String middleType;

        /**
         * <strong>example:</strong>
         * <p>2022-11-01 00:00:00</p>
         */
        @NameInMap("start_time")
        public String startTime;

        @NameInMap("to_city_ad_code")
        public String toCityAdCode;

        @NameInMap("to_city_name")
        public String toCityName;

        @NameInMap("to_station_name")
        public String toStationName;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("wait_time")
        public String waitTime;

        public static TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo self = new TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setFromCityAdCode(String fromCityAdCode) {
            this.fromCityAdCode = fromCityAdCode;
            return this;
        }
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setFromStationName(String fromStationName) {
            this.fromStationName = fromStationName;
            return this;
        }
        public String getFromStationName() {
            return this.fromStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setMiddleCity(String middleCity) {
            this.middleCity = middleCity;
            return this;
        }
        public String getMiddleCity() {
            return this.middleCity;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setMiddleCityAdCode(String middleCityAdCode) {
            this.middleCityAdCode = middleCityAdCode;
            return this;
        }
        public String getMiddleCityAdCode() {
            return this.middleCityAdCode;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setMiddleDate(String middleDate) {
            this.middleDate = middleDate;
            return this;
        }
        public String getMiddleDate() {
            return this.middleDate;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setMiddleStation(String middleStation) {
            this.middleStation = middleStation;
            return this;
        }
        public String getMiddleStation() {
            return this.middleStation;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setMiddleType(String middleType) {
            this.middleType = middleType;
            return this;
        }
        public String getMiddleType() {
            return this.middleType;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setToCityAdCode(String toCityAdCode) {
            this.toCityAdCode = toCityAdCode;
            return this;
        }
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setToStationName(String toStationName) {
            this.toStationName = toStationName;
            return this;
        }
        public String getToStationName() {
            return this.toStationName;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo setWaitTime(String waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public String getWaitTime() {
            return this.waitTime;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo extends TeaModel {
        @NameInMap("train_info_list")
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList> trainInfoList;

        @NameInMap("train_transfer_info")
        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo trainTransferInfo;

        public static TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo self = new TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo setTrainInfoList(java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList> trainInfoList) {
            this.trainInfoList = trainInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainInfoList> getTrainInfoList() {
            return this.trainInfoList;
        }

        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo setTrainTransferInfo(TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo trainTransferInfo) {
            this.trainTransferInfo = trainTransferInfo;
            return this;
        }
        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfoTrainTransferInfo getTrainTransferInfo() {
            return this.trainTransferInfo;
        }

    }

    public static class TrainOrderQueryV2ResponseBodyModule extends TeaModel {
        @NameInMap("change_ticket_info_list")
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList> changeTicketInfoList;

        @NameInMap("invoice_info")
        public TrainOrderQueryV2ResponseBodyModuleInvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        public java.util.List<TrainOrderQueryV2ResponseBodyModulePassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        public java.util.List<TrainOrderQueryV2ResponseBodyModulePriceInfoList> priceInfoList;

        @NameInMap("refund_ticket_info_list")
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList> refundTicketInfoList;

        @NameInMap("train_order_info")
        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo trainOrderInfo;

        public static TrainOrderQueryV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderQueryV2ResponseBodyModule self = new TrainOrderQueryV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderQueryV2ResponseBodyModule setChangeTicketInfoList(java.util.List<TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList> changeTicketInfoList) {
            this.changeTicketInfoList = changeTicketInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleChangeTicketInfoList> getChangeTicketInfoList() {
            return this.changeTicketInfoList;
        }

        public TrainOrderQueryV2ResponseBodyModule setInvoiceInfo(TrainOrderQueryV2ResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public TrainOrderQueryV2ResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public TrainOrderQueryV2ResponseBodyModule setOrderBaseInfo(TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }
        public TrainOrderQueryV2ResponseBodyModuleOrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        public TrainOrderQueryV2ResponseBodyModule setPassengerInfoList(java.util.List<TrainOrderQueryV2ResponseBodyModulePassengerInfoList> passengerInfoList) {
            this.passengerInfoList = passengerInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModulePassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        public TrainOrderQueryV2ResponseBodyModule setPriceInfoList(java.util.List<TrainOrderQueryV2ResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public TrainOrderQueryV2ResponseBodyModule setRefundTicketInfoList(java.util.List<TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList> refundTicketInfoList) {
            this.refundTicketInfoList = refundTicketInfoList;
            return this;
        }
        public java.util.List<TrainOrderQueryV2ResponseBodyModuleRefundTicketInfoList> getRefundTicketInfoList() {
            return this.refundTicketInfoList;
        }

        public TrainOrderQueryV2ResponseBodyModule setTrainOrderInfo(TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo trainOrderInfo) {
            this.trainOrderInfo = trainOrderInfo;
            return this;
        }
        public TrainOrderQueryV2ResponseBodyModuleTrainOrderInfo getTrainOrderInfo() {
            return this.trainOrderInfo;
        }

    }

}
