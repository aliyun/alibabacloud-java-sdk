// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyQueryResponseBody extends TeaModel {
    @NameInMap("apply_list")
    public java.util.List<CarApplyQueryResponseBodyApplyList> applyList;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Integer total;

    @NameInMap("traceId")
    public String traceId;

    public static CarApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarApplyQueryResponseBody self = new CarApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarApplyQueryResponseBody setApplyList(java.util.List<CarApplyQueryResponseBodyApplyList> applyList) {
        this.applyList = applyList;
        return this;
    }
    public java.util.List<CarApplyQueryResponseBodyApplyList> getApplyList() {
        return this.applyList;
    }

    public CarApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CarApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CarApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarApplyQueryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public CarApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CarApplyQueryResponseBodyApplyListApproverList extends TeaModel {
        @NameInMap("note")
        public String note;

        @NameInMap("operate_time")
        public String operateTime;

        @NameInMap("order")
        public Integer order;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarApplyQueryResponseBodyApplyListApproverList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListApproverList self = new CarApplyQueryResponseBodyApplyListApproverList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListApproverList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CarApplyQueryResponseBodyApplyListItineraryList extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("traffic_type")
        public Integer trafficType;

        public static CarApplyQueryResponseBodyApplyListItineraryList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListItineraryList self = new CarApplyQueryResponseBodyApplyListItineraryList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet self = new CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class CarApplyQueryResponseBodyApplyListTravelerStandard extends TeaModel {
        @NameInMap("car_city_set")
        public java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet> carCitySet;

        @NameInMap("user_id")
        public String userId;

        public static CarApplyQueryResponseBodyApplyListTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListTravelerStandard self = new CarApplyQueryResponseBodyApplyListTravelerStandard();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListTravelerStandard setCarCitySet(java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandardCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public CarApplyQueryResponseBodyApplyListTravelerStandard setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CarApplyQueryResponseBodyApplyList extends TeaModel {
        @NameInMap("approver_list")
        public java.util.List<CarApplyQueryResponseBodyApplyListApproverList> approverList;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("itinerary_list")
        public java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> itineraryList;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("traveler_standard")
        public java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandard> travelerStandard;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("trip_title")
        public String tripTitle;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarApplyQueryResponseBodyApplyList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyList self = new CarApplyQueryResponseBodyApplyList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyList setApproverList(java.util.List<CarApplyQueryResponseBodyApplyListApproverList> approverList) {
            this.approverList = approverList;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListApproverList> getApproverList() {
            return this.approverList;
        }

        public CarApplyQueryResponseBodyApplyList setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public CarApplyQueryResponseBodyApplyList setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public CarApplyQueryResponseBodyApplyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CarApplyQueryResponseBodyApplyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CarApplyQueryResponseBodyApplyList setItineraryList(java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> itineraryList) {
            this.itineraryList = itineraryList;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        public CarApplyQueryResponseBodyApplyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CarApplyQueryResponseBodyApplyList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public CarApplyQueryResponseBodyApplyList setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public CarApplyQueryResponseBodyApplyList setTravelerStandard(java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandard> travelerStandard) {
            this.travelerStandard = travelerStandard;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListTravelerStandard> getTravelerStandard() {
            return this.travelerStandard;
        }

        public CarApplyQueryResponseBodyApplyList setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public CarApplyQueryResponseBodyApplyList setTripTitle(String tripTitle) {
            this.tripTitle = tripTitle;
            return this;
        }
        public String getTripTitle() {
            return this.tripTitle;
        }

        public CarApplyQueryResponseBodyApplyList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarApplyQueryResponseBodyApplyList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
