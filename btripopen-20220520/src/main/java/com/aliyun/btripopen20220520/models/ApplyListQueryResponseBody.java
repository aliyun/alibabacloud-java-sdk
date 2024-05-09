// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyListQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module_list")
    public java.util.List<ApplyListQueryResponseBodyModuleList> moduleList;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ApplyListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyListQueryResponseBody self = new ApplyListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyListQueryResponseBody setModuleList(java.util.List<ApplyListQueryResponseBodyModuleList> moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public java.util.List<ApplyListQueryResponseBodyModuleList> getModuleList() {
        return this.moduleList;
    }

    public ApplyListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ApplyListQueryResponseBodyModuleListApproverList extends TeaModel {
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

        public static ApplyListQueryResponseBodyModuleListApproverList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListApproverList self = new ApplyListQueryResponseBodyModuleListApproverList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListApproverList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyListQueryResponseBodyModuleListApproverList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListCarRule extends TeaModel {
        @NameInMap("scenario_template_id")
        public String scenarioTemplateId;

        @NameInMap("scenario_template_name")
        public String scenarioTemplateName;

        public static ApplyListQueryResponseBodyModuleListCarRule build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListCarRule self = new ApplyListQueryResponseBodyModuleListCarRule();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListCarRule setScenarioTemplateId(String scenarioTemplateId) {
            this.scenarioTemplateId = scenarioTemplateId;
            return this;
        }
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        public ApplyListQueryResponseBodyModuleListCarRule setScenarioTemplateName(String scenarioTemplateName) {
            this.scenarioTemplateName = scenarioTemplateName;
            return this;
        }
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListExternalTravelerList extends TeaModel {
        @NameInMap("attribute")
        public String attribute;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyListQueryResponseBodyModuleListExternalTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListExternalTravelerList self = new ApplyListQueryResponseBodyModuleListExternalTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyListQueryResponseBodyModuleListExternalTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListItineraryList extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("traffic_type")
        public Integer trafficType;

        @NameInMap("trip_way")
        public Integer tripWay;

        public static ApplyListQueryResponseBodyModuleListItineraryList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListItineraryList self = new ApplyListQueryResponseBodyModuleListItineraryList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public ApplyListQueryResponseBodyModuleListItineraryList setTripWay(Integer tripWay) {
            this.tripWay = tripWay;
            return this;
        }
        public Integer getTripWay() {
            return this.tripWay;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListItinerarySetList extends TeaModel {
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("city_code_set")
        public String cityCodeSet;

        @NameInMap("city_set")
        public String citySet;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("traffic_type")
        public Integer trafficType;

        public static ApplyListQueryResponseBodyModuleListItinerarySetList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListItinerarySetList self = new ApplyListQueryResponseBodyModuleListItinerarySetList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setCityCodeSet(String cityCodeSet) {
            this.cityCodeSet = cityCodeSet;
            return this;
        }
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setCitySet(String citySet) {
            this.citySet = citySet;
            return this;
        }
        public String getCitySet() {
            return this.citySet;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public ApplyListQueryResponseBodyModuleListItinerarySetList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListTravelerListCarCitySet extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static ApplyListQueryResponseBodyModuleListTravelerListCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListTravelerListCarCitySet self = new ApplyListQueryResponseBodyModuleListTravelerListCarCitySet();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListTravelerListCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyListQueryResponseBodyModuleListTravelerListCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class ApplyListQueryResponseBodyModuleListTravelerList extends TeaModel {
        @NameInMap("attribute")
        public String attribute;

        @NameInMap("car_city_set")
        public java.util.List<ApplyListQueryResponseBodyModuleListTravelerListCarCitySet> carCitySet;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyListQueryResponseBodyModuleListTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleListTravelerList self = new ApplyListQueryResponseBodyModuleListTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setCarCitySet(java.util.List<ApplyListQueryResponseBodyModuleListTravelerListCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListTravelerListCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyListQueryResponseBodyModuleListTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyListQueryResponseBodyModuleList extends TeaModel {
        @NameInMap("apply_show_id")
        public String applyShowId;

        @NameInMap("approver_list")
        public java.util.List<ApplyListQueryResponseBodyModuleListApproverList> approverList;

        @NameInMap("car_rule")
        public ApplyListQueryResponseBodyModuleListCarRule carRule;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("external_traveler_list")
        public java.util.List<ApplyListQueryResponseBodyModuleListExternalTravelerList> externalTravelerList;

        @NameInMap("flow_code")
        public String flowCode;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("itinerary_list")
        public java.util.List<ApplyListQueryResponseBodyModuleListItineraryList> itineraryList;

        @NameInMap("itinerary_rule")
        public Integer itineraryRule;

        @NameInMap("itinerary_set_list")
        public java.util.List<ApplyListQueryResponseBodyModuleListItinerarySetList> itinerarySetList;

        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("thirdpart_business_id")
        public String thirdpartBusinessId;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("traveler_list")
        public java.util.List<ApplyListQueryResponseBodyModuleListTravelerList> travelerList;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("trip_day")
        public Integer tripDay;

        @NameInMap("trip_title")
        public String tripTitle;

        @NameInMap("type")
        public Integer type;

        @NameInMap("union_no")
        public String unionNo;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyListQueryResponseBodyModuleList build(java.util.Map<String, ?> map) throws Exception {
            ApplyListQueryResponseBodyModuleList self = new ApplyListQueryResponseBodyModuleList();
            return TeaModel.build(map, self);
        }

        public ApplyListQueryResponseBodyModuleList setApplyShowId(String applyShowId) {
            this.applyShowId = applyShowId;
            return this;
        }
        public String getApplyShowId() {
            return this.applyShowId;
        }

        public ApplyListQueryResponseBodyModuleList setApproverList(java.util.List<ApplyListQueryResponseBodyModuleListApproverList> approverList) {
            this.approverList = approverList;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListApproverList> getApproverList() {
            return this.approverList;
        }

        public ApplyListQueryResponseBodyModuleList setCarRule(ApplyListQueryResponseBodyModuleListCarRule carRule) {
            this.carRule = carRule;
            return this;
        }
        public ApplyListQueryResponseBodyModuleListCarRule getCarRule() {
            return this.carRule;
        }

        public ApplyListQueryResponseBodyModuleList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ApplyListQueryResponseBodyModuleList setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ApplyListQueryResponseBodyModuleList setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public ApplyListQueryResponseBodyModuleList setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public ApplyListQueryResponseBodyModuleList setExternalTravelerList(java.util.List<ApplyListQueryResponseBodyModuleListExternalTravelerList> externalTravelerList) {
            this.externalTravelerList = externalTravelerList;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListExternalTravelerList> getExternalTravelerList() {
            return this.externalTravelerList;
        }

        public ApplyListQueryResponseBodyModuleList setFlowCode(String flowCode) {
            this.flowCode = flowCode;
            return this;
        }
        public String getFlowCode() {
            return this.flowCode;
        }

        public ApplyListQueryResponseBodyModuleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ApplyListQueryResponseBodyModuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ApplyListQueryResponseBodyModuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ApplyListQueryResponseBodyModuleList setItineraryList(java.util.List<ApplyListQueryResponseBodyModuleListItineraryList> itineraryList) {
            this.itineraryList = itineraryList;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        public ApplyListQueryResponseBodyModuleList setItineraryRule(Integer itineraryRule) {
            this.itineraryRule = itineraryRule;
            return this;
        }
        public Integer getItineraryRule() {
            return this.itineraryRule;
        }

        public ApplyListQueryResponseBodyModuleList setItinerarySetList(java.util.List<ApplyListQueryResponseBodyModuleListItinerarySetList> itinerarySetList) {
            this.itinerarySetList = itinerarySetList;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListItinerarySetList> getItinerarySetList() {
            return this.itinerarySetList;
        }

        public ApplyListQueryResponseBodyModuleList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public ApplyListQueryResponseBodyModuleList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public ApplyListQueryResponseBodyModuleList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyListQueryResponseBodyModuleList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyListQueryResponseBodyModuleList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ApplyListQueryResponseBodyModuleList setThirdpartBusinessId(String thirdpartBusinessId) {
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        public ApplyListQueryResponseBodyModuleList setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public ApplyListQueryResponseBodyModuleList setTravelerList(java.util.List<ApplyListQueryResponseBodyModuleListTravelerList> travelerList) {
            this.travelerList = travelerList;
            return this;
        }
        public java.util.List<ApplyListQueryResponseBodyModuleListTravelerList> getTravelerList() {
            return this.travelerList;
        }

        public ApplyListQueryResponseBodyModuleList setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public ApplyListQueryResponseBodyModuleList setTripDay(Integer tripDay) {
            this.tripDay = tripDay;
            return this;
        }
        public Integer getTripDay() {
            return this.tripDay;
        }

        public ApplyListQueryResponseBodyModuleList setTripTitle(String tripTitle) {
            this.tripTitle = tripTitle;
            return this;
        }
        public String getTripTitle() {
            return this.tripTitle;
        }

        public ApplyListQueryResponseBodyModuleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ApplyListQueryResponseBodyModuleList setUnionNo(String unionNo) {
            this.unionNo = unionNo;
            return this;
        }
        public String getUnionNo() {
            return this.unionNo;
        }

        public ApplyListQueryResponseBodyModuleList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyListQueryResponseBodyModuleList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
